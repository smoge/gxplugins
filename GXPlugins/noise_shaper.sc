GXShaper : UGen
{
	*ar { | in1, sharper(1.0) |
		^this.multiNew('audio', in1, sharper)
	}
	*kr { | in1, sharper(1.0) |
		^this.multiNew('control', in1, sharper)
	}
	name { ^"shaper" }
}

