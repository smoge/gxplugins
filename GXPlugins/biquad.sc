GXBiquad : UGen
{
	*ar { | in1, freq(1200.0) |
		^this.multiNew('audio', in1, freq)
	}
	*kr { | in1, freq(1200.0) |
		^this.multiNew('control', in1, freq)
	}
	name { ^"biquad" }
}

