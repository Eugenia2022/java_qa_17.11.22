public class Phone {

    private int number;
    private String model;
    private float weight;

    public Phone(int number, String model, float weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public int getNumber(){
        return this.number;
    }

}