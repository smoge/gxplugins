GXValve : UGen
{
	*ar { | in1, dist(0.0), q(0.0) |
		^this.multiNew('audio', in1, dist, q)
	}
	*kr { | in1, dist(0.0), q(0.0) |
		^this.multiNew('control', in1, dist, q)
	}
	name { ^"valve" }
}

