GXAmpmodul : MultiOutUGen
{
	*ar { | in1, in2, tube1(6.0), tube2(6.0), feedbac(0.0), feedback(0.0), level(-20.0), wet_dry(0.0) |
		^this.multiNew('audio', in1, in2, tube1, tube2, feedbac, feedback, level, wet_dry)
	}
	*kr { | in1, in2, tube1(6.0), tube2(6.0), feedbac(0.0), feedback(0.0), level(-20.0), wet_dry(0.0) |
		^this.multiNew('control', in1, in2, tube1, tube2, feedbac, feedback, level, wet_dry)
	}
	name { ^"ampmodul" }
	init { | ... theInputs |
		inputs = theInputs
		^this.initOutputs(2, rate)
	}
}

