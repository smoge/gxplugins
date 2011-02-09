GXEcho : UGen
{
	*ar { | in1, percent(0.0), time(1.0) |
		^this.multiNew('audio', in1, percent, time)
	}
	*kr { | in1, percent(0.0), time(1.0) |
		^this.multiNew('control', in1, percent, time)
	}
	name { ^"echo" }
}

