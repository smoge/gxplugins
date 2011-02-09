GXAmp : MultiOutUGen
{
	*ar { | in1, feed_on_off(0.0) |
		^this.multiNew('audio', in1, feed_on_off)
	}
	*kr { | in1, feed_on_off(0.0) |
		^this.multiNew('control', in1, feed_on_off)
	}
	name { ^"amp" }
	init { | ... theInputs |
		inputs = theInputs
		^this.initOutputs(2, rate)
	}
}

