/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.HashCommon
 */
package celestial;

import celestial.rTO;
import com.viaversion.viaversion.libs.fastutil.HashCommon;

public class rqC_2 {
    private static final long id_class = -7046029254386353131L;
    private long id_break;

    public void id_byte(long l) {
        this.id_break = l;
    }

    public double id_byte() {
        return (double)(rqC_2.id_protected(this.id_break += -7046029254386353131L) >>> 11) * (double)1.110223E-16f;
    }

    public rqC_2() {
        this(rTO.id_class());
    }

    public rqC_2(long l) {
        this.id_break(l);
    }

    public int id_class(int n) {
        return (int)this.id_class((long)n);
    }

    public long id_class(long l) {
        if (l <= 0L) {
            throw new IllegalArgumentException("illegal bound " + l + " (must be positive)");
        }
        long l2 = rqC_2.id_protected(this.id_break += -7046029254386353131L);
        long l3 = l - 1L;
        if ((l & l3) == 0L) {
            return l2 & l3;
        }
        long l4 = l2 >>> 1;
        while (l4 + l3 - (l2 = l4 % l) < 0L) {
            l4 = rqC_2.id_protected(this.id_break += -7046029254386353131L) >>> 1;
        }
        return l2;
    }

    public void id_class(byte[] byArray) {
        int n = byArray.length;
        while (n != 0) {
            int n2 = Math.min(n, 8);
            long l = rqC_2.id_protected(this.id_break += -7046029254386353131L);
            while (n2-- != 0) {
                byArray[--n] = (byte)l;
                l >>= 8;
            }
        }
    }

    public long id_class() {
        return rqC_2.id_protected(this.id_break += -7046029254386353131L);
    }

    public void id_break(long l) {
        this.id_break = HashCommon.murmurHash3((long)l);
    }

    public int id_break() {
        return rqC_2.id_throws(this.id_break += -7046029254386353131L);
    }

    private static int id_throws(long l) {
        l = (l ^ l >>> 33) * 7109453100751455733L;
        return (int)((l ^ l >>> 28) * -3808689974395783757L >>> 32);
    }

    public boolean id_throws() {
        return rqC_2.id_throws(this.id_break += -7046029254386353131L) < 0;
    }

    public float id_protected() {
        return (float)(rqC_2.id_throws(this.id_break += -7046029254386353131L) >>> 8) * 5.9604645E-8f;
    }

    private static long id_protected(long l) {
        l = (l ^ l >>> 30) * -4658895280553007687L;
        l = (l ^ l >>> 27) * -7723592293110705685L;
        return l ^ l >>> 31;
    }
}

