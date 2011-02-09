#!/bin/bash

rm -rf {gx_sc,gx_jack,GXPlugins}
mkdir -p {GXPlugins,gx_sc,gx,pkgdir}

cp ./valve.h *.cc ./GXPlugins

ls *.dsp | ./scbuilder \
    FAUST2SC=./faust2sc \
    FAUST2SC_PREFIX="GX" \
    BUILD_SC=yes \
    BUILD_XML=no \
    DESTDIR=./pkgdir \
    BUILD_DIR=./gx_sc \
    INSTALL_DIR=./gx \
    SC_SOURCE_DIR=/home/smoge/src/sc34/SuperCollider-Source/common \
    BUILD_DIR=./GXPlugins

rm ./GXPlugins/valve.h
rm ./GXPlugins/*.cc


#######################################################################
# this does the same thing, but from *.cpp files
# comment one of them.
# this does not produce sc class files, but has a "double" flag
# 
# for faustfile in *.dsp; do
#     faust -a supercollider.cpp -o GXPlugins/${faustfile/dsp/cpp} $faustfile -double
#     #faust -a jack-gtk.cpp -o gx_jackgtk/${faustfile/dsp/cpp} $faustfile -double
# done
# 
# cp ./valve.h *.cc ./GXPlugins
# 
# cd GXPlugins
# 
# ls *.cpp | ../scbuilder \
#     FAUST2SC=../faust2sc \
#     PREFIX=/usr \
#     FAUST2SC_PREFIX="GX" \
#     SSE=yes \
#     SC_SOURCE_DIR=/home/smoge/src/sc34/SuperCollider-Source/common \
#     BUILD_DIR=../GXPlugins
# 
# cd ..



