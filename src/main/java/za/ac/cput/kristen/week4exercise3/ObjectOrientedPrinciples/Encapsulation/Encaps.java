package za.ac.cput.kristen.week4exercise3.ObjectOrientedPrinciples.Encapsulation;

/**
 * Created by student on 2015/02/24.
 */
public class Encaps {
    private String name, favFood;
    private int age;

    public Encaps(String nm, int age) {
        name = nm;
        this.age = age;

        if (age < 0) {
            favFood = "ATP";
        } else
            switch (age) {
                case 0:
                    favFood = "milk";
                    break;

                case 1:
                case 2:
                    favFood = "mash";
                    break;

                case 3:
                case 4:
                    favFood = "fingerbiscuits";
                    break;

                case 5:
                case 6:
                    favFood = "zoo biscuits";
                    break;

                case 7:
                case 8:
                case 9:
                case 10:
                    favFood = "hotdogs";
                    break;

                default:
                    favFood = "pasta";
            }
    }

    public String getFavFood()
    {
        return favFood;
    }
}
