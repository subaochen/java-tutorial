#!/bin/bash

lyx --export pdf4 java-advanced-tutorial.lyx
pdftk cover.pdf java-advanced-tutorial.pdf cat output ../java-advanced.pdf
rm java-advanced-tutorial.pdf
