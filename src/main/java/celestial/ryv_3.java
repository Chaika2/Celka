/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
package celestial;

import celestial.rfU_2;
import org.apache.commons.lang3.Validate;

public class ryv_3 {
    private final long[] id_class;
    private final int id_break;
    private final long id_byte;
    private final int id_protected;

    public ryv_3(int n, int n2) {
        this(n, n2, new long[rfU_2.id_byte(n2 * n, 64) / 64]);
    }

    public ryv_3(int n, int n2, long[] lArray) {
        Validate.inclusiveBetween((long)1L, (long)32L, (long)n);
        this.id_protected = n2;
        this.id_break = n;
        this.id_class = lArray;
        this.id_byte = (1L << n) - 1L;
        int n3 = rfU_2.id_byte(n2 * n, 64) / 64;
        if (lArray.length != n3) {
            throw new IllegalArgumentException("Invalid length given for storage, got: " + lArray.length + " but expected: " + n3);
        }
    }

    public int id_class(int n) {
        Validate.inclusiveBetween((long)0L, (long)(this.id_protected - 1), (long)n);
        int n2 = n * this.id_break;
        int n3 = n2 >> 6;
        int n4 = (n + 1) * this.id_break - 1 >> 6;
        int n5 = n2 ^ n3 << 6;
        if (n3 == n4) {
            return (int)(this.id_class[n3] >>> n5 & this.id_byte);
        }
        int n6 = 64 - n5;
        return (int)((this.id_class[n3] >>> n5 | this.id_class[n4] << n6) & this.id_byte);
    }

    public long[] id_class() {
        return this.id_class;
    }

    public void id_class(int n, int n2) {
        Validate.inclusiveBetween((long)0L, (long)(this.id_protected - 1), (long)n);
        Validate.inclusiveBetween((long)0L, (long)this.id_byte, (long)n2);
        int n3 = n * this.id_break;
        int n4 = n3 >> 6;
        int n5 = (n + 1) * this.id_break - 1 >> 6;
        int n6 = n3 ^ n4 << 6;
        this.id_class[n4] = this.id_class[n4] & (this.id_byte << n6 ^ 0xFFFFFFFFFFFFFFFFL) | ((long)n2 & this.id_byte) << n6;
        if (n4 != n5) {
            int n7 = 64 - n6;
            int n8 = this.id_break - n7;
            this.id_class[n5] = this.id_class[n5] >>> n8 << n8 | ((long)n2 & this.id_byte) >> n7;
        }
    }

    public int id_break() {
        return this.id_break;
    }
}

