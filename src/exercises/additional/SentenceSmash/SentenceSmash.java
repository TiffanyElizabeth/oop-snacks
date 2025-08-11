package exercises.additional.SentenceSmash;

public class SentenceSmash {
    public static void main(String[] args) {
        String[] words = { "Hello", "world", "this", "is", "Java" };
        System.out.println(smash(words));
    }

    public static String smash(String[] words) {
        String smash = "";

        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                smash = words[i];
            } else {
                smash = smash + " " + words[i];
            }
        }

        return smash;
    }

}
