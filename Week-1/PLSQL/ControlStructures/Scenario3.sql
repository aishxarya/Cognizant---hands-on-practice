SET SERVEROUTPUT ON;

BEGIN
    FOR loan IN (
        SELECT c.CustomerName,
               l.LoanID,
               l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ' || loan.LoanID ||
            ' for ' || loan.CustomerName ||
            ' is due on ' ||
            TO_CHAR(loan.DueDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/