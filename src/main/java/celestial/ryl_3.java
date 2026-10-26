/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
package celestial;

import celestial.rqR_2;
import java.util.function.IntConsumer;
import org.apache.commons.lang3.Validate;

public class ryl_3 {
    private static final int[] id_class = new int[]{-1, -1, 0, Integer.MIN_VALUE, 0, 0, 0x55555555, 0x55555555, 0, Integer.MIN_VALUE, 0, 1, 0x33333333, 0x33333333, 0, 0x2AAAAAAA, 0x2AAAAAAA, 0, 0x24924924, 0x24924924, 0, Integer.MIN_VALUE, 0, 2, 0x1C71C71C, 0x1C71C71C, 0, 0x19999999, 0x19999999, 0, 390451572, 390451572, 0, 0x15555555, 0x15555555, 0, 0x13B13B13, 0x13B13B13, 0, 306783378, 306783378, 0, 0x11111111, 0x11111111, 0, Integer.MIN_VALUE, 0, 3, 0xF0F0F0F, 0xF0F0F0F, 0, 0xE38E38E, 0xE38E38E, 0, 226050910, 226050910, 0, 0xCCCCCCC, 0xCCCCCCC, 0, 0xC30C30C, 0xC30C30C, 0, 195225786, 195225786, 0, 186737708, 186737708, 0, 0xAAAAAAA, 0xAAAAAAA, 0, 171798691, 171798691, 0, 0x9D89D89, 0x9D89D89, 0, 159072862, 159072862, 0, 0x9249249, 0x9249249, 0, 148102320, 148102320, 0, 0x8888888, 0x8888888, 0, 138547332, 138547332, 0, Integer.MIN_VALUE, 0, 4, 130150524, 130150524, 0, 0x7878787, 0x7878787, 0, 0x7507507, 0x7507507, 0, 0x71C71C7, 0x71C71C7, 0, 116080197, 116080197, 0, 113025455, 113025455, 0, 0x6906906, 0x6906906, 0, 0x6666666, 0x6666666, 0, 104755299, 104755299, 0, 0x6186186, 0x6186186, 0, 99882960, 99882960, 0, 97612893, 97612893, 0, 0x5B05B05, 0x5B05B05, 0, 93368854, 93368854, 0, 91382282, 91382282, 0, 0x5555555, 0x5555555, 0, 87652393, 87652393, 0, 85899345, 85899345, 0, 0x5050505, 0x5050505, 0, 0x4EC4EC4, 0x4EC4EC4, 0, 81037118, 81037118, 0, 79536431, 79536431, 0, 78090314, 78090314, 0, 0x4924924, 0x4924924, 0, 75350303, 75350303, 0, 74051160, 74051160, 0, 72796055, 72796055, 0, 0x4444444, 0x4444444, 0, 70409299, 70409299, 0, 69273666, 69273666, 0, 0x4104104, 0x4104104, 0, Integer.MIN_VALUE, 0, 5};
    private final long[] id_break;
    private final int id_byte;
    private final long id_protected;
    private final int id_throws;
    private final int id_case;
    private final int id_catch;
    private final int id_private;
    private final int id_implements;

    public ryl_3(int n, int n2) {
        this(n, n2, null);
    }

    public ryl_3(int n, int n2, long[] lArray) {
        Validate.inclusiveBetween((long)1L, (long)32L, (long)n);
        this.id_throws = n2;
        this.id_byte = n;
        this.id_protected = (1L << n) - 1L;
        this.id_case = (char)(64 / n);
        int n3 = 3 * (this.id_case - 1);
        this.id_catch = id_class[n3 + 0];
        this.id_private = id_class[n3 + 1];
        this.id_implements = id_class[n3 + 2];
        int n4 = (n2 + this.id_case - 1) / this.id_case;
        if (lArray != null) {
            if (lArray.length != n4) {
                throw rqR_2.id_byte(new RuntimeException("Invalid length given for storage, got: " + lArray.length + " but expected: " + n4));
            }
            this.id_break = lArray;
        } else {
            this.id_break = new long[n4];
        }
    }

    public int id_class(int n) {
        Validate.inclusiveBetween((long)0L, (long)(this.id_throws - 1), (long)n);
        int n2 = this.id_break(n);
        long l = this.id_break[n2];
        int n3 = (n - n2 * this.id_case) * this.id_byte;
        return (int)(l >> n3 & this.id_protected);
    }

    public void id_class(IntConsumer intConsumer) {
        int n = 0;
        for (long l : this.id_break) {
            for (int i = 0; i < this.id_case; ++i) {
                intConsumer.accept((int)(l & this.id_protected));
                l >>= this.id_byte;
                if (++n < this.id_throws) continue;
                return;
            }
        }
    }

    public long[] id_class() {
        return this.id_break;
    }

    public int id_class(int n, int n2) {
        Validate.inclusiveBetween((long)0L, (long)(this.id_throws - 1), (long)n);
        Validate.inclusiveBetween((long)0L, (long)this.id_protected, (long)n2);
        int n3 = this.id_break(n);
        long l = this.id_break[n3];
        int n4 = (n - n3 * this.id_case) * this.id_byte;
        int n5 = (int)(l >> n4 & this.id_protected);
        this.id_break[n3] = l & (this.id_protected << n4 ^ 0xFFFFFFFFFFFFFFFFL) | ((long)n2 & this.id_protected) << n4;
        return n5;
    }

    private int id_break(int n) {
        long l = Integer.toUnsignedLong(this.id_catch);
        long l2 = Integer.toUnsignedLong(this.id_private);
        return (int)((long)n * l + l2 >> 32 >> this.id_implements);
    }

    public void id_break(int n, int n2) {
        Validate.inclusiveBetween((long)0L, (long)(this.id_throws - 1), (long)n);
        Validate.inclusiveBetween((long)0L, (long)this.id_protected, (long)n2);
        int n3 = this.id_break(n);
        long l = this.id_break[n3];
        int n4 = (n - n3 * this.id_case) * this.id_byte;
        this.id_break[n3] = l & (this.id_protected << n4 ^ 0xFFFFFFFFFFFFFFFFL) | ((long)n2 & this.id_protected) << n4;
    }

    public int id_break() {
        return this.id_throws;
    }
}

