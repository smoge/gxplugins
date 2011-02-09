GXStage3 : UGen
{
	*ar { | in1, on(0.0), gain3(6.0) |
		^this.multiNew('audio', in1, on, gain3)
	}
	*kr { | in1, on(0.0), gain3(6.0) |
		^this.multiNew('control', in1, on, gain3)
	}
	name { ^"stage3" }
}

