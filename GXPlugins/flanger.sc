GXFlanger : MultiOutUGen
{
	*ar { | in1, in2, lfo_freq(0.2), depth(1.0), feedback_gain(0.0), flange_delay(10.0), flange_delay_offset(1.0), invert(0.0), level(0.0) |
		^this.multiNew('audio', in1, in2, lfo_freq, depth, feedback_gain, flange_delay, flange_delay_offset, invert, level)
	}
	*kr { | in1, in2, lfo_freq(0.2), depth(1.0), feedback_gain(0.0), flange_delay(10.0), flange_delay_offset(1.0), invert(0.0), level(0.0) |
		^this.multiNew('control', in1, in2, lfo_freq, depth, feedback_gain, flange_delay, flange_delay_offset, invert, level)
	}
	name { ^"flanger" }
	init { | ... theInputs |
		inputs = theInputs
		^this.initOutputs(2, rate)
	}
}

