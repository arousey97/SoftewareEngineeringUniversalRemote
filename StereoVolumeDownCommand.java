public class StereoVolumeDownCommand implements Command {
    Stereo stereo;

    public StereoVolumeDownCommand (Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        if (stereo.getPower() == true) {
            stereo.decrementVolume();
        }
        else if (stereo.getPower() == false) {
            System.out.println("Stereo is off. Cannot Change Volume.");
        }
    }
}
