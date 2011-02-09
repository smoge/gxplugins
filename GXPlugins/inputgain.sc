GXAmp : UGen
{
	*ar { | in1, in_level(0.0) |
		^this.multiNew('audio', in1, in_level)
	}
	*kr { | in1, in_level(0.0) |
		^this.multiNew('control', in1, in_level)
	}
	name { ^"amp" }
}

