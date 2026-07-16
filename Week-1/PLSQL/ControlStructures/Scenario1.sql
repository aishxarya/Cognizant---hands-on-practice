SET SERVEROUTPUT ON;

DECLARE
    age NUMBER;
BEGIN
    FOR c IN (
        SELECT CustomerID, DOB
        FROM Customers
    )
    LOOP
        age := FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12);

        IF age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = c.CustomerID;

            DBMS_OUTPUT.PUT_LINE('Discount applied for Customer ID: ' || c.CustomerID);
        END IF;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Scenario 1 Completed Successfully.');
END;
/