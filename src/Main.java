import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // creates the "variables" and array [] for weather temps
        String city = "Columbus";
        int zipcode = 43215;
        double[] weather = {32, 25, 27, 40, 45};
        // ensures the average can be a decimal
        double sum = 0;

        // adds together all the weather, optimized so if we added more
        // it would still work
        for(int i=0; i<weather.length; i++){
            sum += weather[i];
        }
        //checks the sum
        // System.out.println(sum);

        // creates the average
        double averageTemp = sum / weather.length;

        //to test the average
        // System.out.println(averageTemp);

        System.out.println("City: " + city + " | " + "Zip code: " + zipcode + " | " + "Average High Temperature: " + averageTemp);

    }
}