GXStereodelay : MultiOutUGen
{
	*ar { | in1, in2, lfo_freq(0.2), invert(0.0), l_delay(0.0), l_gain(0.0), r_delay(0.0), r_gain(0.0) |
		^this.multiNew('audio', in1, in2, lfo_freq, invert, l_delay, l_gain, r_delay, r_gain)
	}
	*kr { | in1, in2, lfo_freq(0.2), invert(0.0), l_delay(0.0), l_gain(0.0), r_delay(0.0), r_gain(0.0) |
		^this.multiNew('control', in1, in2, lfo_freq, invert, l_delay, l_gain, r_delay, r_gain)
	}
	name { ^"stereodelay" }
	init { | ... theInputs |
		inputs = theInputs
		^this.initOutputs(2, rate)
	}
}

