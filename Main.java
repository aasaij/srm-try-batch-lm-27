class Car{
    //Properties of an object
    //Instace variables or states or attributes or fields
    //data members
    private String color;
    private String model;
    private String brand;
    private int speed
    private boolean status;
    static final private int maxSpeed = 150;
    //Constructor
    public Car(String color, String m, String brand){
        this.color = color;
        model = m;
        this.brand = brand;
    }
    //Methods
    void accelerate(){
        if (status==true)
            if (speed <= maxSpeed-5)
                speed+=5;
    }
    void applyBreak(){
        if (status == true)
            if (speed >= 5)
                speed -= 5;
    }
    void start(){
        status = true;
    }
    void stop(){
        status = false;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Car dhaneshCar, hariCar, krishnaCar;
	    dhaneshCar = new Car("RED", "SEDAN", "MERCEDEZ");
	    hariCar = new Car("SILVER WHITE", "SUV", "AUDI");
	    krishnaCar = new Car("BLUE","SEDAN","JAQUAR");
	    dhaneshCar.accelerate();
	}
}
