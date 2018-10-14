#!/bin/bash

lyx --export pdf4 java-guide-2018.lyx
lyx --export pdf4 tests-guide.lyx
pdftk cover.pdf java-guide-2018.pdf cat output ../java-guide.pdf
pdftk cover-test.pdf tests-guide.pdf cat output ../tests-guide.pdf
rm java-guide-2018.pdf tests-guide.pdf
