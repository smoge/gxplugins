GXExpFilter : UGen
{
	*ar { | in1, freq(1200.0), on(0.0) |
		^this.multiNew('audio', in1, freq, on)
	}
	*kr { | in1, freq(1200.0), on(0.0) |
		^this.multiNew('control', in1, freq, on)
	}
	name { ^"ExpFilter" }
}

