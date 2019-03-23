#!/bin/bash

echo "Enter chapter_number"
read NUMBER

PREV=$(($NUMBER-1))

echo $PREV

PRV_P=`seq -f %02g $PREV | grep $PREV`
NUM_P=`seq -f %02g $NUMBER | grep $NUMBER`

cp -R src/main/kotlin/chapter$PRV_P.money src/main/kotlin/chapter$NUM_P.money

