#!/bin/bash
cd $2
git init 
git add .
git commit -m"My New checkIn"
git remote add origin $1
git push origin master
