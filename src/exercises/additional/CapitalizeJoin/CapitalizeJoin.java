package exercises.additional.CapitalizeJoin;

public class CapitalizeJoin {
    public static void main(String[] args) {
        String[] test = { "java", "is", "fun" };
        System.out.println(CapitalizeNJoin(test));
    }

    public static String CapitalizeNJoin(String[] words) {
        String capitalizedNJoined = "";
        boolean isFirstWord = true;

        for (int i = 0; i < words.length; i++) {
            String capitalizedWord = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            if (isFirstWord) {
                capitalizedNJoined += capitalizedWord;
                isFirstWord = false;
            } else {
                capitalizedNJoined += " " + capitalizedWord;
            }
        }

        return capitalizedNJoined;
    }
}
