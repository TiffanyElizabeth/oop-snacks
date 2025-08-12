package exercises.additional.MoreThanThree;

public class MoreThanThree {
    public static void main(String[] args) {
        String[] test = { "hi", "there", "friend" };
        System.out.println(MoreThanThreeUP(test));

    }

    public static String MoreThanThreeUP(String[] words) {
        String formattedWords = "";
        boolean isFirst = true;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 3) {
                String wordAllCaps = words[i].toUpperCase();
                if (isFirst) {
                    formattedWords += wordAllCaps;
                    isFirst = false;
                } else {
                    formattedWords += ", " + wordAllCaps;
                }
            }
        }
        return formattedWords;
    }
}
