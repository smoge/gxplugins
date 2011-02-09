GXAmp : UGen
{
	*ar { | in1, out_master(0.0) |
		^this.multiNew('audio', in1, out_master)
	}
	*kr { | in1, out_master(0.0) |
		^this.multiNew('control', in1, out_master)
	}
	name { ^"amp" }
}

