/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rrWd_1 {
    private int id_class;
    private int id_break;

    public int id_byte() {
        return this.id_break;
    }

    public rrWd_1(int n) {
        this.id_class = n;
        this.id_break = n;
    }

    public synchronized int id_class() {
        return this.id_break++;
    }

    public synchronized void id_break() {
        this.id_break = this.id_class;
    }
}

