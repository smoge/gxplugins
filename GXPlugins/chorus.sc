GXChorus : MultiOutUGen
{
	*ar { | in1, in2, delay(0.02), depth(0.02), freq(3.0), level(0.5) |
		^this.multiNew('audio', in1, in2, delay, depth, freq, level)
	}
	*kr { | in1, in2, delay(0.02), depth(0.02), freq(3.0), level(0.5) |
		^this.multiNew('control', in1, in2, delay, depth, freq, level)
	}
	name { ^"chorus" }
	init { | ... theInputs |
		inputs = theInputs
		^this.initOutputs(2, rate)
	}
}

