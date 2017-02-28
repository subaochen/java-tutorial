#!/bin/bash

lyx --export pdf4 java-guide-on-c.lyx
pdftk cover.pdf java-guide-on-c.pdf cat output ../java-guide.pdf
rm java-guide-on-c.pdf
