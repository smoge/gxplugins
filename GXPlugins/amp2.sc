GXAmp2 : UGen
{
	*ar { | in1, on_0(0.0), pregain_0(30.0), on_1(0.0), gain1_1(6.0), on_2(0.0), gain2_2(6.0) |
		^this.multiNew('audio', in1, on_0, pregain_0, on_1, gain1_1, on_2, gain2_2)
	}
	*kr { | in1, on_0(0.0), pregain_0(30.0), on_1(0.0), gain1_1(6.0), on_2(0.0), gain2_2(6.0) |
		^this.multiNew('control', in1, on_0, pregain_0, on_1, gain1_1, on_2, gain2_2)
	}
	name { ^"amp2" }
}

