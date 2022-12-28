public class Main
{
    public static void main(String[] args)
    {
        double[] miles = {13.85, 26.42, 5, 0};
        double[] km = {40, 3.5, 20.50, 0};
        for(int i = 0; i <= miles.length - 1; i++){
            System.out.println(RaceUtility.milesToKm(miles[i]));
            System.out.println(RaceUtility.kmToMiles(km[i]));
        }
        String[] title = {"welcome to the marathon!", "It's TIME for THE 5k!", "runners, take your marks...", "2 MILES TO GO!", "water break in 0.5 miles"};
        for(int i = 0; i <= title.length - 1; i++){
            System.out.println(RaceUtility.makeProper(title[i]));
        }
    }
}
