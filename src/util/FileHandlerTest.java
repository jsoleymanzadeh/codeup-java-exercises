package util;

public class FileHandlerTest {
    public static void main(String[] args) {
        FileHandler fileTest = new FileHandler("/Users/jaspersoleymanzadeh");
        fileTest.spit("test", fileTest.slurp("a"), true);
    }
}