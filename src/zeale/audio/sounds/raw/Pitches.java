package zeale.audio.sounds.raw;

public enum Pitches {
	G3(195.9977), C4(261.6256), C4S(277.1826), D4(293.6648), D4S(311.127), E4(329.6276), F4(349.2282), F4S(369.9944),
	G4(391.9954), G4S(415.3047), A4(440), A4S(466.1638), B4(493.8833), C5(523.2511), C5S(554.3653), D5(587.3295),
	D5S(622.2540), E5(659.2551), F5(698.4565);

	public final float pitch;

	private Pitches(float pitch) {
		this.pitch = pitch;
	}

	private Pitches(double pitch) {
		this((float) pitch);
	}

}
