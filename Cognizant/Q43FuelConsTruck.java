public class Q43FuelConsTruck {
    public static void getTruckFuelConsumption(double litres,double distance)
    {
        double lithundred=(litres/distance)*100;
        double miles=distance*0.6214;
        double gallons=litres*0.2642;
        System.out.printf("Litres/100KM: %.2f\n",lithundred);
        System.out.printf("Miles/Gallons: %.2f",miles/gallons);
    }
    public static void main(String[] args) {
        getTruckFuelConsumption(20, 150);
    }
}
