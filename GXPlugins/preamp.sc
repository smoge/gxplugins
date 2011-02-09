GXPreamp : UGen
{
	*ar { | in1, atan(1.0) |
		^this.multiNew('audio', in1, atan)
	}
	*kr { | in1, atan(1.0) |
		^this.multiNew('control', in1, atan)
	}
	name { ^"preamp" }
}

