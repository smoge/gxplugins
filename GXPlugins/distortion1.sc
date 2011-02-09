GXDistortion1 : UGen
{
	*ar { | in1, drive(0.64), gain(2.0), level(0.01), high_freq_0(5000.0), low_freq_0(130.0), on_off_0(0.0), high_freq_1(130.0), low_freq_1(5000.0), on_off_1(0.0), resonator_on_off_1(0.0), trigger_1(0.12), vibrato_1(1.0) |
		^this.multiNew('audio', in1, drive, gain, level, high_freq_0, low_freq_0, on_off_0, high_freq_1, low_freq_1, on_off_1, resonator_on_off_1, trigger_1, vibrato_1)
	}
	*kr { | in1, drive(0.64), gain(2.0), level(0.01), high_freq_0(5000.0), low_freq_0(130.0), on_off_0(0.0), high_freq_1(130.0), low_freq_1(5000.0), on_off_1(0.0), resonator_on_off_1(0.0), trigger_1(0.12), vibrato_1(1.0) |
		^this.multiNew('control', in1, drive, gain, level, high_freq_0, low_freq_0, on_off_0, high_freq_1, low_freq_1, on_off_1, resonator_on_off_1, trigger_1, vibrato_1)
	}
	name { ^"distortion1" }
}

