GXDelay : UGen
{
	*ar { | in1, delay(0.0), gain(0.0) |
		^this.multiNew('audio', in1, delay, gain)
	}
	*kr { | in1, delay(0.0), gain(0.0) |
		^this.multiNew('control', in1, delay, gain)
	}
	name { ^"delay" }
}

