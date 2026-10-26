/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqC_2;
import java.util.Random;

public class rTO
extends Random {
    private static final long id_class = 1L;
    private rqC_2 id_break;
    private long id_byte = Long.MIN_VALUE;
    private long id_protected;
    private long id_throws;
    private long id_case;
    private long id_catch;
    private boolean id_private;
    private static final rqC_2 id_implements = new rqC_2(System.nanoTime());

    public rTO(long l) {
        this.setSeed(l);
    }

    public rTO() {
        this(rTO.id_class());
    }

    public rTO id_class(long l) {
        this.setSeed(l);
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static long id_class() {
        long l;
        rqC_2 rqC_22 = id_implements;
        synchronized (rqC_22) {
            l = id_implements.id_class();
        }
        return l ^ System.nanoTime();
    }

    @Override
    public void setSeed(long l) {
        if (this.id_private && this.id_byte == l) {
            this.id_case = this.id_protected;
            this.id_catch = this.id_throws;
        } else {
            rqC_2 rqC_22 = this.id_break;
            if (rqC_22 == null) {
                rqC_22 = this.id_break = new rqC_2(l);
            } else {
                rqC_22.id_break(l);
            }
            this.id_case = rqC_22.id_class();
            this.id_catch = rqC_22.id_class();
            this.id_protected = this.id_case;
            this.id_throws = this.id_catch;
            this.id_byte = l;
            this.id_private = true;
        }
    }

    @Override
    public long nextLong() {
        long l = this.id_case;
        long l2 = this.id_catch;
        long l3 = l + l2;
        this.id_case = Long.rotateLeft(l, 24) ^ (l2 ^= l) ^ l2 << 16;
        this.id_catch = Long.rotateLeft(l2, 37);
        return l3;
    }

    @Override
    public long nextLong(long l) {
        if (l <= 0L) {
            throw new IllegalArgumentException("illegal bound " + l + " (must be positive)");
        }
        long l2 = this.nextLong();
        long l3 = l - 1L;
        if ((l & l3) == 0L) {
            return l2 >>> Long.numberOfLeadingZeros(l3) & l3;
        }
        long l4 = l2 >>> 1;
        while (l4 + l3 - (l2 = l4 % l) < 0L) {
            l4 = this.nextLong() >>> 1;
        }
        return l2;
    }

    @Override
    public boolean nextBoolean() {
        return this.nextLong() < 0L;
    }

    @Override
    public float nextFloat() {
        return (float)(this.nextLong() >>> 40) * 5.9604645E-8f;
    }

    @Override
    public void nextBytes(byte[] byArray) {
        int n = byArray.length;
        while (n != 0) {
            int n2 = Math.min(n, 8);
            long l = this.nextLong();
            while (n2-- != 0) {
                byArray[--n] = (byte)l;
                l >>= 8;
            }
        }
    }

    @Override
    public double nextDouble() {
        return Double.longBitsToDouble(0x3FF0000000000000L | this.nextLong() >>> 12) - 1.0;
    }

    @Override
    public int nextInt() {
        return (int)this.nextLong();
    }

    @Override
    public int nextInt(int n) {
        return (int)this.nextLong(n);
    }
}

