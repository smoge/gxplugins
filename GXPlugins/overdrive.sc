GXOverdrive : UGen
{
	*ar { | in1, drive(1.0) |
		^this.multiNew('audio', in1, drive)
	}
	*kr { | in1, drive(1.0) |
		^this.multiNew('control', in1, drive)
	}
	name { ^"overdrive" }
}

