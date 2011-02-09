GXAmp : MultiOutUGen
{
	*ar { | in1, in2, out_master(0.0) |
		^this.multiNew('audio', in1, in2, out_master)
	}
	*kr { | in1, in2, out_master(0.0) |
		^this.multiNew('control', in1, in2, out_master)
	}
	name { ^"amp" }
	init { | ... theInputs |
		inputs = theInputs
		^this.initOutputs(2, rate)
	}
}

