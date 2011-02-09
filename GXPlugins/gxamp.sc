GXAmp2 : UGen
{
	*ar { | in1, pregain(-6.0), gain1(-6.0) |
		^this.multiNew('audio', in1, pregain, gain1)
	}
	*kr { | in1, pregain(-6.0), gain1(-6.0) |
		^this.multiNew('control', in1, pregain, gain1)
	}
	name { ^"amp2" }
}

