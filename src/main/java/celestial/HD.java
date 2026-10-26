/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class HD {
    private final long[] id_class;
    private int id_break;
    private int id_byte;

    public HD(int n) {
        this.id_class = new long[n];
    }

    public long id_class(long l) {
        if (this.id_break < this.id_class.length) {
            ++this.id_break;
        }
        this.id_class[this.id_byte] = l;
        this.id_byte = (this.id_byte + 1) % this.id_class.length;
        long l2 = Long.MAX_VALUE;
        long l3 = Long.MIN_VALUE;
        long l4 = 0L;
        for (int i = 0; i < this.id_break; ++i) {
            long l5 = this.id_class[i];
            l4 += l5;
            l2 = Math.min(l2, l5);
            l3 = Math.max(l3, l5);
        }
        if (this.id_break > 2) {
            return (l4 -= l2 + l3) / (long)(this.id_break - 2);
        }
        return l4 > 0L ? (long)this.id_break / l4 : 0L;
    }
}

