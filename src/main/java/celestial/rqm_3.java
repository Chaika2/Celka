/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Random;

public class rqm_3
extends Random {
    private int id_class;

    public long id_byte(long l, int n, int n2) {
        this.setSeed(l);
        long l2 = this.nextLong();
        long l3 = this.nextLong();
        long l4 = (long)n * l2 ^ (long)n2 * l3 ^ l;
        this.setSeed(l4);
        return l4;
    }

    public rqm_3() {
    }

    public rqm_3(long l) {
        super(l);
    }

    @Override
    protected int next(int n) {
        ++this.id_class;
        return super.next(n);
    }

    public static Random id_class(int n, int n2, long l, long l2) {
        return new Random(l + (long)(n * n * 4987142) + (long)(n * 5947611) + (long)(n2 * n2) * 4392871L + (long)(n2 * 389711) ^ l2);
    }

    public long id_class(long l, int n, int n2, int n3) {
        long l2 = (long)n * 341873128712L + (long)n2 * 132897987541L + l + (long)n3;
        this.setSeed(l2);
        return l2;
    }

    public void id_class(int n) {
        for (int i = 0; i < n; ++i) {
            this.next(1);
        }
    }

    public long id_class(long l, int n, int n2) {
        this.setSeed(l);
        long l2 = this.nextLong() | 1L;
        long l3 = this.nextLong() | 1L;
        long l4 = (long)n * l2 + (long)n2 * l3 ^ l;
        this.setSeed(l4);
        return l4;
    }

    public long id_class(int n, int n2) {
        long l = (long)n * 341873128712L + (long)n2 * 132897987541L;
        this.setSeed(l);
        return l;
    }

    public long id_break(long l, int n, int n2) {
        long l2 = l + (long)n + (long)(10000 * n2);
        this.setSeed(l2);
        return l2;
    }
}

