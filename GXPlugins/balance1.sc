GXBalance1 : MultiOutUGen
{
	*ar { | in1, amp_balance(0.0) |
		^this.multiNew('audio', in1, amp_balance)
	}
	*kr { | in1, amp_balance(0.0) |
		^this.multiNew('control', in1, amp_balance)
	}
	name { ^"balance1" }
	init { | ... theInputs |
		inputs = theInputs
		^this.initOutputs(2, rate)
	}
}

