GXStereoecho : MultiOutUGen
{
	*ar { | in1, in2, percent_l(0.0), percent_r(0.0), time_l(1.0), time_r(1.0) |
		^this.multiNew('audio', in1, in2, percent_l, percent_r, time_l, time_r)
	}
	*kr { | in1, in2, percent_l(0.0), percent_r(0.0), time_l(1.0), time_r(1.0) |
		^this.multiNew('control', in1, in2, percent_l, percent_r, time_l, time_r)
	}
	name { ^"stereoecho" }
	init { | ... theInputs |
		inputs = theInputs
		^this.initOutputs(2, rate)
	}
}

