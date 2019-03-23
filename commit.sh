#!/bin/bash

echo "Enter chapter_number"
read NUMBER

git add .
git commit -m "finished chapter$NUMBER"

echo "Can I push to origin/master (y/n)"
read C

if [ $C = "y" ] || [ $C = "Y" ]; then
  git ch master
  git merge hotfix_$NUMBER
  git push origin master
else
  git reset --soft HEAD^
fi

git st

