public class Engine {
    private int powerOfEngine;
    private int yearOfProduction;



    public Engine (int powerOfEngine, int yearOfProduction){
        this.powerOfEngine = powerOfEngine;
        this.yearOfProduction = yearOfProduction;
    }

    public int getPowerOfEngine() {
        return powerOfEngine;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    protected void isEcological (){
        if (this.powerOfEngine > 20000 && this.yearOfProduction > 2000){
            System.out.println("YES!");
        }
    }
}
