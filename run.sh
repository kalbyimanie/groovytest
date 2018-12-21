#!/bin/bash

NUMB=10
if [[ $NUMB < 5 ]];then
    echo -e "Failed to continue to next stage"
    exit 1
fi
