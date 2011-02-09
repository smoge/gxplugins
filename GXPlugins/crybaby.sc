GXCrybaby : UGen
{
	*ar { | in1, level(0.1), wah(0.0), wet_dry(0.0) |
		^this.multiNew('audio', in1, level, wah, wet_dry)
	}
	*kr { | in1, level(0.1), wah(0.0), wet_dry(0.0) |
		^this.multiNew('control', in1, level, wah, wet_dry)
	}
	name { ^"crybaby" }
}

