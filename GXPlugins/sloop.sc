GXSloop : UGen
{
	*ar { | in1, capture(0.0), play(0.0), gain(0.0) |
		^this.multiNew('audio', in1, capture, play, gain)
	}
	*kr { | in1, capture(0.0), play(0.0), gain(0.0) |
		^this.multiNew('control', in1, capture, play, gain)
	}
	name { ^"sloop" }
}

