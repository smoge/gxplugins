GXAntiAlias : UGen
{
	*ar { | in1, feedback(0.3) |
		^this.multiNew('audio', in1, feedback)
	}
	*kr { | in1, feedback(0.3) |
		^this.multiNew('control', in1, feedback)
	}
	name { ^"AntiAlias" }
}

