public class ServerNameGenerator {
    private static String[] adjectives = {"helpful", "friendly", "brave", "cowardly", "shy", "flamboyant", "persistent", "smelly", "loud", "quiet"};
    private static String[] nouns = {"toaster", "duck", "bear", "lion", "flower", "peacock", "woodpecker", "skunk", "toad", "rabbit"};

   private static String randomElement(String[] array) {
        return array[(int) (Math.random() * array.length - 1) + 1];
    }

    public static void main(String[] args) {
        String randomAdj = randomElement(adjectives);
        String randomNoun = randomElement(nouns);

        System.out.println("Here is your server name:");
        System.out.println(randomAdj + "-" + randomNoun);
    }
}