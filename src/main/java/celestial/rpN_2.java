/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rpN_2 {
    private final long[] id_class = new long[240];
    private int id_break;
    private int id_byte;
    private int id_protected;

    public long[] id_byte() {
        return this.id_class;
    }

    public int id_class(int n) {
        return n % 240;
    }

    public int id_class() {
        return this.id_break;
    }

    public void id_class(long l) {
        this.id_class[this.id_protected] = l;
        ++this.id_protected;
        if (this.id_protected == 240) {
            this.id_protected = 0;
        }
        if (this.id_byte < 240) {
            this.id_break = 0;
            ++this.id_byte;
        } else {
            this.id_break = this.id_class(this.id_protected + 1);
        }
    }

    public int id_class(long l, int n, int n2) {
        double d = (double)l / (double)(1000000000L / (long)n2);
        return (int)(d * (double)n);
    }

    public int id_break() {
        return this.id_protected;
    }
}

