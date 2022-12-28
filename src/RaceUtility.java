public class RaceUtility {
    private static final double milToKm = 1.60934;
    private static final double kmToMil = 0.621369647819236;

    public static double milesToKm(double miles){
        return miles * milToKm;
    }

    public static double kmToMiles(double kilos){
        return kilos * kmToMil;
    }

    public static String makeProper(String origStr){
        String newStr = origStr.toLowerCase();
        String[] words = newStr.split(" "); // splits the string into a list of each word
        for (int i = 0; i < words.length; i++) {
            String word = words[i]; // accesses each word to use and changes it
            String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1); // changes the string of each word so the first letter is capital
            words[i] = capitalized; // the statement that changes the word within the loop, which changes the overall list as well
        }
        return String.join(" ", words); // puts the items within the list together as a string, separated by a space
    }
}
