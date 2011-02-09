GXBassbooster : UGen
{
	*ar { | in1 |
		^this.multiNew('audio', in1)
	}
	*kr { | in1 |
		^this.multiNew('control', in1)
	}
	name { ^"bassbooster" }
}

