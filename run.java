public class run {
    public static void main(String[] args) {
        kubus k = new kubus(5);
        balok b = new balok(2,4,6);
        System.out.println("panjang sisi kubus = 5");
        System.out.println("Volume kubus: " + k.volume());
        System.out.println("Luas Permukaan kubus: " + k.luasPermukaan());
        System.out.println("balok p = 2, l = 4, t = 6");
        System.out.println("Volume balok: " + b.volume());
        System.out.println("Luas Permukaan balok: " + b.luasPermukaan());
    }
}
