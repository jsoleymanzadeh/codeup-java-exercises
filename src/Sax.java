public class Sax extends MusicalInstrument implements Tuneable, VolumeAdjustable {
    private String saxType;

    public Sax(String instrumentClassification, String saxType) {
        super(instrumentClassification);
        this.saxType = saxType;
    }

    @Override
    public void startMusic() {
        System.out.println("Began playing Arashi no Saxophone...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Finished playing Arashi no Saxophone.");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Tuning saxophone...");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Ruining saxophone...");
    }

    @Override
    public void volumeUp() {
        System.out.println("Playing saxophone louder...");
    }

    @Override
    public void volumeDown() {
        System.out.println("Playing saxophone softer...");
    }

    public String getSaxType() {
        return saxType;
    }

    public void setSaxType(String saxType) {
        this.saxType = saxType;
    }
}