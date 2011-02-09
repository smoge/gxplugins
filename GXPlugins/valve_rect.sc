GXValve_rect : UGen
{
	*ar { | in1, dist(0.0), sag(0.0) |
		^this.multiNew('audio', in1, dist, sag)
	}
	*kr { | in1, dist(0.0), sag(0.0) |
		^this.multiNew('control', in1, dist, sag)
	}
	name { ^"valve_rect" }
}

