GXMoog : MultiOutUGen
{
	*ar { | in1, in2, q(1.0), fr(3000.0) |
		^this.multiNew('audio', in1, in2, q, fr)
	}
	*kr { | in1, in2, q(1.0), fr(3000.0) |
		^this.multiNew('control', in1, in2, q, fr)
	}
	name { ^"moog" }
	init { | ... theInputs |
		inputs = theInputs
		^this.initOutputs(2, rate)
	}
}

