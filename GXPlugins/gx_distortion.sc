GXGx_distortion : UGen
{
	*ar { | in1, drive(0.64), gain(2.0), high_drive(1.0), high_gain(10.0), level(0.01), low_drive(1.0), low_gain(10.0), middle_h_drive(1.0), middle_h_gain(10.0), middle_l_drive(1.0), middle_l_gain(10.0), resonator_on_off(0.0), split_high_freq(1250.0), split_low_freq(250.0), split_middle_freq(650.0), trigger(0.12), vibrato(1.0) |
		^this.multiNew('audio', in1, drive, gain, high_drive, high_gain, level, low_drive, low_gain, middle_h_drive, middle_h_gain, middle_l_drive, middle_l_gain, resonator_on_off, split_high_freq, split_low_freq, split_middle_freq, trigger, vibrato)
	}
	*kr { | in1, drive(0.64), gain(2.0), high_drive(1.0), high_gain(10.0), level(0.01), low_drive(1.0), low_gain(10.0), middle_h_drive(1.0), middle_h_gain(10.0), middle_l_drive(1.0), middle_l_gain(10.0), resonator_on_off(0.0), split_high_freq(1250.0), split_low_freq(250.0), split_middle_freq(650.0), trigger(0.12), vibrato(1.0) |
		^this.multiNew('control', in1, drive, gain, high_drive, high_gain, level, low_drive, low_gain, middle_h_drive, middle_h_gain, middle_l_drive, middle_l_gain, resonator_on_off, split_high_freq, split_low_freq, split_middle_freq, trigger, vibrato)
	}
	name { ^"gx_distortion" }
}

