GXExp : UGen
{
	*ar { | in1, on(0.0), sine(0.0), depth(0.5), freq(5.0), wet_dry(0.0) |
		^this.multiNew('audio', in1, on, sine, depth, freq, wet_dry)
	}
	*kr { | in1, on(0.0), sine(0.0), depth(0.5), freq(5.0), wet_dry(0.0) |
		^this.multiNew('control', in1, on, sine, depth, freq, wet_dry)
	}
	name { ^"Exp" }
}

