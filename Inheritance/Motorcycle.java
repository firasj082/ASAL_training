public class Motorcycle extends Vehicle {
     
    private int n_doors;

    public int getDoors(){

        return this.n_doors;
    }

    public void setDoors(int doors){

        this.n_doors = doors;
    }

    @Override public void beep(){

        System.out.println("The motorcycle.");
    }

    public Motorcycle(String engine, String fuel){

        super(engine, fuel);
        setDoors(0);
    }

    public Motorcycle(String engine, String fuel, int doors){

        super(engine, fuel);
        setDoors(doors);
    }
    
}
