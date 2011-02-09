GXLow_high_pass : UGen
{
	*ar { | in1, high_freq_0(5000.0), low_freq_0(130.0), on_off_0(0.0), high_freq_1(130.0), low_freq_1(5000.0), on_off_1(0.0) |
		^this.multiNew('audio', in1, high_freq_0, low_freq_0, on_off_0, high_freq_1, low_freq_1, on_off_1)
	}
	*kr { | in1, high_freq_0(5000.0), low_freq_0(130.0), on_off_0(0.0), high_freq_1(130.0), low_freq_1(5000.0), on_off_1(0.0) |
		^this.multiNew('control', in1, high_freq_0, low_freq_0, on_off_0, high_freq_1, low_freq_1, on_off_1)
	}
	name { ^"low_high_pass" }
}

