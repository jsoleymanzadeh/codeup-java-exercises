package util;

public class FileHandlerTest {
    public static void main(String[] args) {
        FileHandler fileTest = new FileHandler("/Users/jaspersoleymanzadeh", ".zshrc");
        fileTest.spit("test", fileTest.slurp("a"), true);
    }
}