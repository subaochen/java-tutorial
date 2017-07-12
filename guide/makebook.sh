#!/bin/bash

lyx --export pdf4 java-guide-on-c.lyx
lyx --export pdf4 tests-guide.lyx
pdftk cover.pdf java-guide-on-c.pdf cat output ../java-guide.pdf
pdftk cover-test.pdf tests-guide.pdf cat output ../tests-guide.pdf
rm java-guide-on-c.pdf tests-guide.pdf
