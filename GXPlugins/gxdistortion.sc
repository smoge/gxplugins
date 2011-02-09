GXGxdistortion : UGen
{
	*ar { | in1, drive(0.35) |
		^this.multiNew('audio', in1, drive)
	}
	*kr { | in1, drive(0.35) |
		^this.multiNew('control', in1, drive)
	}
	name { ^"gxdistortion" }
}

