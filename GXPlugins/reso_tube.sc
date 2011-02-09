GXTube2 : UGen
{
	*ar { | in1, fuzzy(1.0), resonanz(0.5), vibrato(1.0) |
		^this.multiNew('audio', in1, fuzzy, resonanz, vibrato)
	}
	*kr { | in1, fuzzy(1.0), resonanz(0.5), vibrato(1.0) |
		^this.multiNew('control', in1, fuzzy, resonanz, vibrato)
	}
	name { ^"tube2" }
}

