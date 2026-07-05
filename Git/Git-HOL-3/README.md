# Git HOL 3

## Objective
Learn Git branching and merging.

## Commands Used

```bash
git checkout -b GitNewBranch
git branch
git add .
git commit -m "Added branch.txt in GitNewBranch"
git status
git checkout main
git diff main GitNewBranch
git merge GitNewBranch
git log --oneline --graph --decorate
git branch -d GitNewBranch
git push origin main
```

## Result

Successfully created a branch, committed changes, merged the branch into the main branch, viewed commit history, and deleted the merged branch.