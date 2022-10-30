class Exercise01_10 {
    public static void main(String[] args) {
        double distance = 14; // kilometers
        double time = 45.5;   // minutes
        double distanceInMiles = distance/1.6;
        double avgSpeedInMpH = distanceInMiles/time;

        System.out.println(avgSpeedInMpH);


    }
}
