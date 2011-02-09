GXJconv : MultiOutUGen
{
	*ar { | in1, in2, in3, in4, amp_balance(0.0), balance(0.0), diff_delay(0.0), gain(0.0), wet_dry(100.0) |
		^this.multiNew('audio', in1, in2, in3, in4, amp_balance, balance, diff_delay, gain, wet_dry)
	}
	*kr { | in1, in2, in3, in4, amp_balance(0.0), balance(0.0), diff_delay(0.0), gain(0.0), wet_dry(100.0) |
		^this.multiNew('control', in1, in2, in3, in4, amp_balance, balance, diff_delay, gain, wet_dry)
	}
	name { ^"jconv" }
	init { | ... theInputs |
		inputs = theInputs
		^this.initOutputs(2, rate)
	}
}

