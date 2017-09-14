public class Stereo {
	String location;
    private int volInput;
    private boolean power = false;

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
        power = true;
		System.out.println(location + " stereo is on");
	}

	public void off() {
        power = false;
		System.out.println(location + " stereo is off");
	}

	public void setCD() {
		System.out.println(location + " stereo is set for CD input");
	}

	public void setDVD() {
		System.out.println(location + " stereo is set for DVD input");
	}

	public void setRadio() {
		System.out.println(location + " stereo is set for Radio");
	}

	public void setVolume(int volume) {
		// code to set the volume
		// valid range: 1-11 (after all 11 is better than 10, right?)
        if (volume <= 1) {
            volInput = 1;
        }
        else if (volume >= 11) {
            volInput = 11;
        }
        else {
            volInput = volume;
        }
		System.out.println(location + " Stereo volume set to " + volInput);
	}

    public boolean getPower() {
        return power;
    }

    public void incrementVolume() {
        if ((volInput + 1) <= 11) {
            System.out.println(location + " Stereo volume increased");
            setVolume(volInput + 1);
        }
    }

    public void decrementVolume() {
        if ((volInput - 1) >= 1) {
            System.out.println(location + " Stereo volume decreased");
            setVolume(volInput - 1);
        }
    }
}
