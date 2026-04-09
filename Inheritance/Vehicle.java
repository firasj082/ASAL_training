public class Vehicle {
    
    private String engine_type, fuel;
    
    protected String getEngine(){

        return engine_type;
    }

    protected String getFuel(){

        return fuel;
    }

    protected void setEngine(String engine){

        this.engine_type = engine;
    }
    
    protected void setFuel(String fuel){

        this.fuel = fuel;
    }

    public void beep(){ //i added this method only to show the overriding

        System.out.println("The vehicle."); 
    }

    public Vehicle(String engine, String fuel){

        setEngine(engine);
        setFuel(fuel);
    }
}
