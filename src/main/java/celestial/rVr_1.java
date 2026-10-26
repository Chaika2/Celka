/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rVr_1 {
    private int id_class;
    private int id_break;
    private int id_byte;
    private int id_protected;

    public void id_byte(int n) {
        this.id_byte = n;
    }

    public int id_byte() {
        return this.id_byte;
    }

    public rVr_1() {
    }

    public rVr_1(int n, int n2, int n3, int n4) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
        this.id_protected = n4;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rVr_1 rVr_12 = (rVr_1)object;
            if (rVr_12.id_class != this.id_class) {
                return false;
            }
            if (rVr_12.id_break != this.id_break) {
                return false;
            }
            if (rVr_12.id_byte != this.id_byte) {
                return false;
            }
            return rVr_12.id_protected == this.id_protected;
        }
        return false;
    }

    public String toString() {
        return "[" + this.id_class + ", " + this.id_break + ", " + this.id_byte + ", " + this.id_protected + "]";
    }

    public int hashCode() {
        int n = this.id_class;
        n = 31 * n + this.id_break;
        n = 31 * n + this.id_byte;
        n = 31 * n + this.id_protected;
        return n;
    }

    public int id_class() {
        return this.id_class;
    }

    public void id_class(int n) {
        this.id_class = n;
    }

    public int id_break() {
        return this.id_break;
    }

    public void id_break(int n) {
        this.id_break = n;
    }

    public int id_protected() {
        return this.id_protected;
    }

    public void id_protected(int n) {
        this.id_protected = n;
    }
}

