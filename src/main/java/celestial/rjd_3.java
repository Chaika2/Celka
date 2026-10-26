/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjN_2;
import celestial.rjc_3;
import celestial.rjp_3;
import celestial.rpB_2;
import java.util.BitSet;

public final class rjd_3
extends rjp_3 {
    private final BitSet id_protected;
    private int id_throws;
    private int id_case;
    private int id_catch;
    private int id_private;
    private int id_implements;
    private int id_finally;

    public rjd_3(rjp_3 rjp_32) {
        super(rjp_32.id_class, rjp_32.id_break, rjp_32.id_byte);
        if (rjp_32 instanceof rjd_3) {
            this.id_protected = (BitSet)((rjd_3)rjp_32).id_protected.clone();
        } else {
            this.id_protected = new BitSet(this.id_class * this.id_break * this.id_byte);
            for (int i = 0; i < this.id_class; ++i) {
                for (int j = 0; j < this.id_break; ++j) {
                    for (int k = 0; k < this.id_byte; ++k) {
                        if (!rjp_32.id_break(i, j, k)) continue;
                        this.id_protected.set(this.id_class(i, j, k));
                    }
                }
            }
        }
        this.id_throws = rjp_32.id_class(rpB_2.X);
        this.id_case = rjp_32.id_class(rpB_2.Y);
        this.id_catch = rjp_32.id_class(rpB_2.Z);
        this.id_private = rjp_32.id_break(rpB_2.X);
        this.id_implements = rjp_32.id_break(rpB_2.Y);
        this.id_finally = rjp_32.id_break(rpB_2.Z);
    }

    public rjd_3(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        super(n, n2, n3);
        this.id_protected = new BitSet(n * n2 * n3);
        this.id_throws = n4;
        this.id_case = n5;
        this.id_catch = n6;
        this.id_private = n7;
        this.id_implements = n8;
        this.id_finally = n9;
    }

    public rjd_3(int n, int n2, int n3) {
        this(n, n2, n3, n, n2, n3, 0, 0, 0);
    }

    public static rjd_3 id_class(rjp_3 rjp_32, rjp_3 rjp_33, rjc_3 rjc_32, rjc_3 rjc_33, rjc_3 rjc_34, rjN_2 rjN_22) {
        rjd_3 rjd_32 = new rjd_3(rjc_32.id_class().size() - 1, rjc_33.id_class().size() - 1, rjc_34.id_class().size() - 1);
        int[] nArray = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        rjc_32.id_class((int n, int n2, int n3) -> {
            boolean[] blArray = new boolean[]{false};
            boolean bl = rjc_33.id_class((int n4, int n5, int n6) -> {
                boolean[] blArray2 = new boolean[]{false};
                boolean bl = rjc_34.id_class((int n7, int n8, int n9) -> {
                    boolean bl = rjN_22.apply(rjp_32.id_byte(n, n4, n7), rjp_33.id_byte(n2, n5, n8));
                    if (bl) {
                        rjd_32.id_protected.set(rjd_32.id_class(n3, n6, n9));
                        nArray[2] = Math.min(nArray[2], n9);
                        nArray[5] = Math.max(nArray[5], n9);
                        blArray[0] = true;
                    }
                    return true;
                });
                if (blArray2[0]) {
                    nArray[1] = Math.min(nArray[1], n6);
                    nArray[4] = Math.max(nArray[4], n6);
                    blArray[0] = true;
                }
                return bl;
            });
            if (blArray[0]) {
                nArray[0] = Math.min(nArray[0], n3);
                nArray[3] = Math.max(nArray[3], n3);
            }
            return bl;
        });
        rjd_32.id_throws = nArray[0];
        rjd_32.id_case = nArray[1];
        rjd_32.id_catch = nArray[2];
        rjd_32.id_private = nArray[3] + 1;
        rjd_32.id_implements = nArray[4] + 1;
        rjd_32.id_finally = nArray[5] + 1;
        return rjd_32;
    }

    @Override
    protected void id_class(int n, int n2, int n3, int n4, boolean bl) {
        this.id_protected.set(this.id_class(n3, n4, n), this.id_class(n3, n4, n2), bl);
    }

    @Override
    protected boolean id_class(int n, int n2, int n3, int n4) {
        if (n3 >= 0 && n4 >= 0 && n >= 0) {
            if (n3 < this.id_class && n4 < this.id_break && n2 <= this.id_byte) {
                return this.id_protected.nextClearBit(this.id_class(n3, n4, n)) >= this.id_class(n3, n4, n2);
            }
            return false;
        }
        return false;
    }

    protected int id_class(int n, int n2, int n3) {
        return (n * this.id_break + n2) * this.id_byte + n3;
    }

    @Override
    public boolean id_class() {
        return this.id_protected.isEmpty();
    }

    @Override
    public int id_class(rpB_2 rpB_22) {
        return rpB_22.id_class(this.id_throws, this.id_case, this.id_catch);
    }

    @Override
    public void id_class(int n, int n2, int n3, boolean bl, boolean bl2) {
        this.id_protected.set(this.id_class(n, n2, n3), bl2);
        if (bl && bl2) {
            this.id_throws = Math.min(this.id_throws, n);
            this.id_case = Math.min(this.id_case, n2);
            this.id_catch = Math.min(this.id_catch, n3);
            this.id_private = Math.max(this.id_private, n + 1);
            this.id_implements = Math.max(this.id_implements, n2 + 1);
            this.id_finally = Math.max(this.id_finally, n3 + 1);
        }
    }

    @Override
    public int id_break(rpB_2 rpB_22) {
        return rpB_22.id_class(this.id_private, this.id_implements, this.id_finally);
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return this.id_protected.get(this.id_class(n, n2, n3));
    }
}

