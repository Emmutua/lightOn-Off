class lamp{
//creating a field
    boolean isOn;

    //method to turn on the light
    void turnOn(){
        isOn = true;
        System.out.println("light is on" + isOn);
    }

    //method to turn off the light
    void turnOff(){
        isOn = false;
        System.out.println("light is on?" + isOn);
    }
}

public class Main {
    public static void main(String[] args) {

        //creating an object of the lamp
        lamp led = new lamp();
        lamp halogen = new lamp();

        //assess the method
        System.out.println("Turning on the light");
        led.turnOn();

        System.out.println("Turning off the light");
        halogen.turnOff();



    }
}