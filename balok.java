public class balok implements rumus {
    private int p, l, t;

    public balok(int p, int l, int t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    public int volume(){
        return this.p * this.l * this.t;
    }

    public int luasPermukaan(){
        return 2 * ((this.p * this.l) + (this.p * this.t) + (this.l * this.t));
    }
}