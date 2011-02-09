GXTube : UGen
{
	*ar { | in1, vibrato(0.0) |
		^this.multiNew('audio', in1, vibrato)
	}
	*kr { | in1, vibrato(0.0) |
		^this.multiNew('control', in1, vibrato)
	}
	name { ^"tube" }
}

