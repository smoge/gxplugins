GXTube3 : UGen
{
	*ar { | in1, dist(0.0), g(1.0), q(0.4) |
		^this.multiNew('audio', in1, dist, g, q)
	}
	*kr { | in1, dist(0.0), g(1.0), q(0.4) |
		^this.multiNew('control', in1, dist, g, q)
	}
	name { ^"tube3" }
}

