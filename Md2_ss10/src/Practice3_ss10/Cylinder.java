package Practice3_ss10;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius ;
        double volume = height * perimeter +2 * baseArea ;
        return volume;
    }
}
