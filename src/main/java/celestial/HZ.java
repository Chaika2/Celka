/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class HZ {
    private int id_class;
    private int id_break;
    private int id_byte;
    private int id_protected;

    public int id_byte() {
        return this.id_byte;
    }

    public HZ(int n, int n2, int n3, int n4) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
        this.id_protected = n4;
    }

    public boolean id_class(int n, int n2) {
        return n >= this.id_class && n <= this.id_class + this.id_byte && n2 >= this.id_break && n2 <= this.id_break + this.id_protected;
    }

    public int id_class() {
        return this.id_class;
    }

    public int id_break() {
        return this.id_break;
    }

    public int id_protected() {
        return this.id_protected;
    }
}

