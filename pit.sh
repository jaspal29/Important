#!/bin/bash
cd $2
mkdir $3
cd $3
git init 
touch ReadMe1.txt
git add ReadMe1.txt
git commit -m"my second commit"
git remote add origin $1

git push origin master
