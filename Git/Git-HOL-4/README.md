# Git HOL 4 - Merge Conflict Resolution

## Objective
Learn how to resolve merge conflicts in Git.

## Tasks Performed

1. Verified master branch status.
2. Created a new branch named `GitWork`.
3. Created `hello.xml` in GitWork branch.
4. Modified and committed the file.
5. Switched to the main branch.
6. Created another `hello.xml` with different content.
7. Committed changes in the main branch.
8. Compared differences between branches.
9. Merged the branches.
10. Resolved the merge conflict.
11. Updated `.gitignore`.
12. Deleted the merged branch.
13. Verified repository status using Git commands.

## Git Commands Used

```bash
git checkout -b GitWork
git add .
git commit -m "Added hello.xml in GitWork"
git checkout main
git add .
git commit -m "Added hello.xml in main"
git merge GitWork
git status
git branch -d GitWork
git log --oneline --graph --decorate
```

## Result

Successfully resolved the merge conflict, updated the repository, and verified the final Git status.