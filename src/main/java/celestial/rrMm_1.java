/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rrMm_1 {
    private int id_class;
    private int id_break;
    private int id_byte;
    private String id_protected;

    public int id_byte() {
        return this.id_byte;
    }

    public rrMm_1(int n, int n2, int n3, String string) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
        this.id_protected = string;
    }

    public rrMm_1(int n, int n2, int n3) {
        this(n, n2, n3, null);
    }

    public rrMm_1(int n, int n2) {
        this(n, n2, 0);
    }

    public String toString() {
        return this.id_protected == null ? this.id_class + "." + this.id_break + "." + this.id_byte : this.id_class + "." + this.id_break + "." + this.id_byte + this.id_protected;
    }

    public int id_class() {
        return this.id_class;
    }

    public int id_break() {
        return this.id_break;
    }

    public int id_protected() {
        if (this.id_break > 9) {
            return this.id_class * 100 + this.id_break;
        }
        return this.id_byte > 9 ? this.id_class * 100 + this.id_break * 10 + 9 : this.id_class * 100 + this.id_break * 10 + this.id_byte;
    }
}

