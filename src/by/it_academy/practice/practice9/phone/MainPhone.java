package by.it_academy.practice.practice9.phone;

public class MainPhone {
    public static void main(String[] args) {
        Phone iphone = new Phone("243514311541", "i16", 500.50);
        Phone samsung = new Phone("42525245", "galaxy", 400.50);
        Phone honor = new Phone("2452452455", "s10", 300.50);
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(honor);

        String name = "Ivan";
        iphone.receiveCall(name);
        iphone.receiveCall("Vasia");
        String iphoneNumber = iphone.getNumber();
        System.out.println(iphoneNumber);

        samsung.receiveCall(name, iphoneNumber);

        String samsungNumber = samsung.getNumber();
        samsung.sendMessage(iphoneNumber);
        samsung.sendMessage(iphoneNumber,samsungNumber);
        samsung.sendMessage(iphoneNumber,samsungNumber, "2352465624624");
    }

}
