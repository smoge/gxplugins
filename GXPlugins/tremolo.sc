GXTremolo : UGen
{
	*ar { | in1, sine(0.0), depth(0.5), freq(5.0) |
		^this.multiNew('audio', in1, sine, depth, freq)
	}
	*kr { | in1, sine(0.0), depth(0.5), freq(5.0) |
		^this.multiNew('control', in1, sine, depth, freq)
	}
	name { ^"tremolo" }
}

