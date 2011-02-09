GXBalance : MultiOutUGen
{
	*ar { | in1, in2, amp_balance(0.0) |
		^this.multiNew('audio', in1, in2, amp_balance)
	}
	*kr { | in1, in2, amp_balance(0.0) |
		^this.multiNew('control', in1, in2, amp_balance)
	}
	name { ^"balance" }
	init { | ... theInputs |
		inputs = theInputs
		^this.initOutputs(2, rate)
	}
}

