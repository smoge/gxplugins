GXAmp_t2 : UGen
{
	*ar { | in1, amp2_stage1_pregain(0.0), amp2_stage2_gain1(6.0) |
		^this.multiNew('audio', in1, amp2_stage1_pregain, amp2_stage2_gain1)
	}
	*kr { | in1, amp2_stage1_pregain(0.0), amp2_stage2_gain1(6.0) |
		^this.multiNew('control', in1, amp2_stage1_pregain, amp2_stage2_gain1)
	}
	name { ^"amp-t2" }
}

