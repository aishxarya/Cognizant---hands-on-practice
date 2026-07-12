# Git HOL 2

## Objective
Learn how to ignore unwanted files and folders using `.gitignore`.

## Files Created

- .gitignore
- app.log
- logs/error.log

## .gitignore Content

```text
*.log
logs/
```

## Commands Used

```bash
git status
git add .
git status
git commit -m "Completed Git HOL 2"
git push origin main
```

## Result

Git ignored all `.log` files and the `logs` folder successfully.