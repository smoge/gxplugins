GXPlugins
==========

This project contains the core dsp code from the [Guitarix Project](http://guitarix.sourceforge.net/) that is written in the [Faust Programming Language](http://faust.grame.fr/). 

Since it is possible to compile Faust code for several kinds of systems or standalone applications, the GXPlugins project tries to make a SuperCollider DSP Plugins out of each Guitarix effect module.

Compilation
===========

To compile this plugins you have to have SuperCollider and Faust installed. You will also need the faust2sc programm. If your distribution does not provide this programm, install it looking at the /tools folder in the Faust source code.

Edit the build.sh script and make sure `SC_SOURCE_DIR=` is set to your SuperCollider-Source/common folder. Also check if `FAUST2SC=` is correctly set.

If everything is right, you can install like this:

    git clone git://github.com/smoge/gxplugins.git
    cd gxplugins
    ./build.sh


The generated files will be placed in the GXPlugins folder. 


Packagers
---------

If you want to package GXPlugins, you can use the `DESTDIR=` variable to your $pkgdir folder. 
    

GXPlugins List
==============

+ GXAmp2
+ GXAntiAlias
+ GXAutowah
+ GXBalance1
+ GXBassbooster
+ GXBiquad
+ GXChorus
+ GXCompressor
+ GXCrybaby
+ GXDelay
+ GXDistortion1
+ GXDistortion
+ GXDrive
+ GXEcho
+ GXEq
+ GXExpFilter
+ GXExp
+ GXFlanger
+ GXFreeverb
+ GXAmp2
+ GXAmp3
+ GXAmp4
+ GXAmp5
+ GXAmpmodul
+ GXAmp
+ GXDistortion
+ GXFeed
+ GXHighShelf
+ GXImpulseresponse
+ GXLow_high_pass
+ GXMoog
+ GXMultifilter
+ GXNoise_shaper
+ GXOsc_tube
+ GXOverdrive
+ GXPhaser
+ GXPreamp
+ GXReso_tube
+ GXSelecteq
+ GXSloop
+ GXStage3
+ GXStereodelay
+ GXStereoecho
+ GXTone
+ GXTonestack_ac30
+ GXTonestack_bassman
+ GXTonestack_default
+ GXTonestack_jcm2000
+ GXTonestack_jcm800
+ GXTonestack_m2199
+ GXTonestack_mlead
+ GXTonestack_princeton
+ GXTonestack
+ GXTonestack_twin
+ GXTremolo
+ GXTube3
+ GXTube3
+ GXTube
+ GXTubevibrato
