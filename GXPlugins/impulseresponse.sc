GXIR : UGen
{
	*ar { | in1, auto_freq(0.0), bandwidth(100.0), freq(440.0), peak(1.0) |
		^this.multiNew('audio', in1, auto_freq, bandwidth, freq, peak)
	}
	*kr { | in1, auto_freq(0.0), bandwidth(100.0), freq(440.0), peak(1.0) |
		^this.multiNew('control', in1, auto_freq, bandwidth, freq, peak)
	}
	name { ^"IR" }
}

