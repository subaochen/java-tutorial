#!/bin/bash

lyx --export pdf4 java-advanced.lyx
pdftk cover.pdf java-advanced.pdf cat output ../java-advanced.pdf
rm java-advanced.pdf
