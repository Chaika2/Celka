/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rrzS_2 {
    private int id_class;
    private int id_break;
    private final int id_byte;

    public rrzS_2(int n, int n2) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n + 37 * n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof rrzS_2)) {
            return false;
        }
        rrzS_2 rrzS_22 = (rrzS_2)object;
        return this.id_class == rrzS_22.id_class && this.id_break == rrzS_22.id_break;
    }

    public String toString() {
        return "(" + this.id_class + ", " + this.id_break + ")";
    }

    public int hashCode() {
        return this.id_byte;
    }

    public static rrzS_2 id_class(int n, int n2) {
        return new rrzS_2(n, n2);
    }

    public int id_class() {
        return this.id_class;
    }

    public int id_break() {
        return this.id_break;
    }
}

