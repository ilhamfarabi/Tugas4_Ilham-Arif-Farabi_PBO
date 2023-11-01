public class kubus implements rumus {
    private int s;

    public kubus(int s) {
        this.s = s;
    }

    public int volume(){
        return s * s * s;
    }

    public int luasPermukaan(){
        return 6 * (s * s);
    }
}