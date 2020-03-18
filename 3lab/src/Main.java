public class Main {
    public static void main(String []args) {

        Aeroplane pobeda = new Aeroplane("Sobolev", 99);
        Engine dvigatelProgressa = new Engine(90000, 2009);

        String AirplaneBrand = pobeda.getBrandOfAeroplane();
        int airplaneSits = pobeda.setNumOfSits();
        int yearOfProduction = dvigatelProgressa.getYearOfProduction();
        int enginePower = dvigatelProgressa.getPowerOfEngine();


        System.out.println("The name of plane " + AirplaneBrand + " sits  " + airplaneSits +
                " year of production " + yearOfProduction + "engine power " + enginePower);

        dvigatelProgressa.isEcological();

    }
}
