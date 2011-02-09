GXAutowah : UGen
{
	*ar { | in1, crybaby_level(0.0), crybaby_wah(0.0), crybaby_wet_dry(0.0) |
		^this.multiNew('audio', in1, crybaby_level, crybaby_wah, crybaby_wet_dry)
	}
	*kr { | in1, crybaby_level(0.0), crybaby_wah(0.0), crybaby_wet_dry(0.0) |
		^this.multiNew('control', in1, crybaby_level, crybaby_wah, crybaby_wet_dry)
	}
	name { ^"autowah" }
}

