#!/bin/bash

# delete lyx's backup file
find ./ -name "*.lyx~" -exec rm {} \;
find ./ -name "*474.lyx" -exec rm {} \;
find ./ -name "#*.*#" -exec rm {} \;
find ./ -name "out" -exec rm -rf {} \;
