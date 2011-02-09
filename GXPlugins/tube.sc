GXTube : UGen
{
	*ar { | in1, fuzzy(1.0) |
		^this.multiNew('audio', in1, fuzzy)
	}
	*kr { | in1, fuzzy(1.0) |
		^this.multiNew('control', in1, fuzzy)
	}
	name { ^"tube" }
}

