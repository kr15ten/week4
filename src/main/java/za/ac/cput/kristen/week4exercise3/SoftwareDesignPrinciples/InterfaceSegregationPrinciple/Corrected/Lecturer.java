package za.ac.cput.kristen.week4exercise3.SoftwareDesignPrinciples.InterfaceSegregationPrinciple.Corrected;

/**
 * Created by kris on 2/27/15.
 */
public class Lecturer implements ILecturer {
    @Override
    public Boolean teaches() {
        return true;
    }
}
