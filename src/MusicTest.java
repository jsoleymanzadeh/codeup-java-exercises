public class MusicTest {
    public static void detuneRetune(Tuneable tuneableObj) {
        tuneableObj.detuneInstrument();
        tuneableObj.tuneInstrument();
    }

    public static void makeTwoStaccatoSounds(VolumeAdjustable va) {
        va.volumeUp();
        va.volumeDown();
        va.volumeUp();
        va.volumeDown();
    }

    public static void main(String[] args) {
        Piano pianoObject = new Piano("strings", 88);
        detuneRetune(pianoObject);
        makeTwoStaccatoSounds(pianoObject);
        pianoObject.startMusic();
        pianoObject.stopMusic();
        Sax saxObject = new Sax("brass", "alto");
        detuneRetune(saxObject);
        makeTwoStaccatoSounds(saxObject);
        saxObject.startMusic();
        saxObject.stopMusic();
    }
}