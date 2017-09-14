public class StereoVolumeUpCommand implements Command {
    Stereo stereo;

    public StereoVolumeUpCommand (Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        if (stereo.getPower() == true) {
            stereo.incrementVolume();
        }
        else if (stereo.getPower() == false) {
            System.out.println("Stereo is off. Cannot Change Volume.");
        }
    }
}
