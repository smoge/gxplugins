#!/bin/bash

rm -rf jack
mkdir jack
cp *.dsp ./jack
cp *.lib ./jack
cp *.h ./jack
cp *.cc ./jack
cd jack

for file in *.dsp; do
	faust2jack $file -o ./jack/$file
done

rm *.dsp
rm *.lib ./jack
rm *.h ./jack
rm *.cc ./jack
cd ..
