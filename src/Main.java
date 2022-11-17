public class Main {
    public static void main(String[] args) {
        Person kolia = new Person();
        kolia.move();
        kolia.talk();

        Person vasia = new Person("Vasia", 33);
        vasia.move();
        vasia.talk();

        Phone samsung = new Phone(99123456, "Samsung", 1.1f);
        samsung.receiveCall("Spam");
        samsung.getNumber();

        Phone siemens = new Phone(99123456, "Siemens", 2.1f);
        siemens.receiveCall("Mom");
        siemens.getNumber();

        Phone xiaomi = new Phone(99123456, "Xiaomi", 1.2f);
        xiaomi.receiveCall("Tolian");
        xiaomi.getNumber();
    }
}