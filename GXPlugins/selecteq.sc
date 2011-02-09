GXEqs : UGen
{
	*ar { | in1, qs125(50.0), qs16k(50.0), qs1k(50.0), qs250(50.0), qs2k(50.0), qs31_25(50.0), qs4k(50.0), qs500(50.0), qs62_5(50.0), qs8k(50.0), freq125(125.0), freq16k(16000.0), freq1k(1000.0), freq250(250.0), freq2k(2000.0), freq31_25(31.0), freq4k(4000.0), freq500(500.0), freq62_5(62.0), freq8k(8000.0), fs125(0.0), fs16k(0.0), fs1k(0.0), fs250(0.0), fs2k(0.0), fs31_25(0.0), fs4k(0.0), fs500(0.0), fs62_5(0.0), fs8k(0.0) |
		^this.multiNew('audio', in1, qs125, qs16k, qs1k, qs250, qs2k, qs31_25, qs4k, qs500, qs62_5, qs8k, freq125, freq16k, freq1k, freq250, freq2k, freq31_25, freq4k, freq500, freq62_5, freq8k, fs125, fs16k, fs1k, fs250, fs2k, fs31_25, fs4k, fs500, fs62_5, fs8k)
	}
	*kr { | in1, qs125(50.0), qs16k(50.0), qs1k(50.0), qs250(50.0), qs2k(50.0), qs31_25(50.0), qs4k(50.0), qs500(50.0), qs62_5(50.0), qs8k(50.0), freq125(125.0), freq16k(16000.0), freq1k(1000.0), freq250(250.0), freq2k(2000.0), freq31_25(31.0), freq4k(4000.0), freq500(500.0), freq62_5(62.0), freq8k(8000.0), fs125(0.0), fs16k(0.0), fs1k(0.0), fs250(0.0), fs2k(0.0), fs31_25(0.0), fs4k(0.0), fs500(0.0), fs62_5(0.0), fs8k(0.0) |
		^this.multiNew('control', in1, qs125, qs16k, qs1k, qs250, qs2k, qs31_25, qs4k, qs500, qs62_5, qs8k, freq125, freq16k, freq1k, freq250, freq2k, freq31_25, freq4k, freq500, freq62_5, freq8k, fs125, fs16k, fs1k, fs250, fs2k, fs31_25, fs4k, fs500, fs62_5, fs8k)
	}
	name { ^"eqs" }
}

