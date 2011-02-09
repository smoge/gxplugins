GXDistortion : UGen
{
	*ar { | in1, drive(0.64), gain(2.0), high_drive(1.0), high_gain(10.0), level(0.01), low_drive(1.0), low_gain(10.0), high_freq_0(5000.0), low_freq_0(130.0), on_off_0(0.0), high_freq_1(130.0), low_freq_1(5000.0), on_off_1(0.0), middle_h_drive_1(1.0), middle_h_gain_1(10.0), middle_l_drive_1(1.0), middle_l_gain_1(10.0), resonator_on_off_1(0.0), split_high_freq_1(1250.0), split_low_freq_1(250.0), split_middle_freq_1(650.0), trigger_1(0.12), vibrato_1(1.0) |
		^this.multiNew('audio', in1, drive, gain, high_drive, high_gain, level, low_drive, low_gain, high_freq_0, low_freq_0, on_off_0, high_freq_1, low_freq_1, on_off_1, middle_h_drive_1, middle_h_gain_1, middle_l_drive_1, middle_l_gain_1, resonator_on_off_1, split_high_freq_1, split_low_freq_1, split_middle_freq_1, trigger_1, vibrato_1)
	}
	*kr { | in1, drive(0.64), gain(2.0), high_drive(1.0), high_gain(10.0), level(0.01), low_drive(1.0), low_gain(10.0), high_freq_0(5000.0), low_freq_0(130.0), on_off_0(0.0), high_freq_1(130.0), low_freq_1(5000.0), on_off_1(0.0), middle_h_drive_1(1.0), middle_h_gain_1(10.0), middle_l_drive_1(1.0), middle_l_gain_1(10.0), resonator_on_off_1(0.0), split_high_freq_1(1250.0), split_low_freq_1(250.0), split_middle_freq_1(650.0), trigger_1(0.12), vibrato_1(1.0) |
		^this.multiNew('control', in1, drive, gain, high_drive, high_gain, level, low_drive, low_gain, high_freq_0, low_freq_0, on_off_0, high_freq_1, low_freq_1, on_off_1, middle_h_drive_1, middle_h_gain_1, middle_l_drive_1, middle_l_gain_1, resonator_on_off_1, split_high_freq_1, split_low_freq_1, split_middle_freq_1, trigger_1, vibrato_1)
	}
	name { ^"distortion" }
}

