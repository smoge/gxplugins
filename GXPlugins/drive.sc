GXDrive : UGen
{
	*ar { | in1, value(1.0) |
		^this.multiNew('audio', in1, value)
	}
	*kr { | in1, value(1.0) |
		^this.multiNew('control', in1, value)
	}
	name { ^"drive" }
}

