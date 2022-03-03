public class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable {
    private int numberOfKeys;

    public Piano(String instrumentClassification, int numberOfKeys) {
        super(instrumentClassification);
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public void startMusic() {
        System.out.println("Began playing Fantasy Impromptu...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Finished playing Fantasy Impromptu.");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Tuning piano...");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Ruining piano...");
    }

    @Override
    public void volumeUp() {
        System.out.println("Playing piano louder...");
    }

    @Override
    public void volumeDown() {
        System.out.println("Playing piano softer...");
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }
}