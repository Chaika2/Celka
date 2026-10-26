/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rrMp_1 {
    private int id_class;
    private int id_break;

    public rrMp_1(int n, int n2) {
        this.id_class = Math.min(n, n2);
        this.id_break = Math.max(n, n2);
    }

    public String toString() {
        return "min: " + this.id_class + ", max: " + this.id_break;
    }

    public boolean id_class(int n) {
        if (n < this.id_class) {
            return false;
        }
        return n <= this.id_break;
    }

    public int id_class() {
        return this.id_class;
    }

    public int id_break() {
        return this.id_break;
    }
}

