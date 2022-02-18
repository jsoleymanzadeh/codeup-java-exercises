public class ServerNameGenerator {
    public static String[] adjectives = {"adorable", "adventurous", "agreeable", "amused", "brave", "busy", "clean", "courageous", "cute", "curious"};
    public static String[] nouns = {"aardvark", "bee", "crab", "dodo", "fox", "ferret", "duck", "heron", "sunfish", "chicken"};

    public static String randomWord(String[] words) {
        return words[(int) Math.floor(Math.random() * words.length)];
    }

    public static void main(String[] args) {
        System.out.printf("%s-%s", randomWord(adjectives), randomWord(nouns));
    }
}