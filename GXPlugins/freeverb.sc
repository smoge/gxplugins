GXFreeverb : UGen
{
	*ar { | in1, roomsize(0.5), damp(0.5), wet_dry(0.0) |
		^this.multiNew('audio', in1, roomsize, damp, wet_dry)
	}
	*kr { | in1, roomsize(0.5), damp(0.5), wet_dry(0.0) |
		^this.multiNew('control', in1, roomsize, damp, wet_dry)
	}
	name { ^"freeverb" }
}

