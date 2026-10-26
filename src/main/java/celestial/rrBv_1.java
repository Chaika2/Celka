/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKA;
import celestial.rKj_1;
import celestial.rrBF;
import celestial.rrBn_1;

public sealed class rrBv_1
extends Enum<rrBv_1>
implements rrBn_1
permits rrBF {
    public static final /* enum */ rrBv_1 NORMAL = new rrBv_1();
    public static final /* enum */ rrBv_1 FUZZY = new rrBF();
    private static final /* synthetic */ rrBv_1[] $VALUES;

    static {
        $VALUES = rrBv_1.id_class();
    }

    public static rrBv_1[] values() {
        return (rrBv_1[])$VALUES.clone();
    }

    public static rrBv_1 valueOf(String string) {
        return Enum.valueOf(rrBv_1.class, string);
    }

    private static /* synthetic */ rrBv_1[] id_class() {
        return new rrBv_1[]{NORMAL, FUZZY};
    }

    protected int id_class(rKA<?> rKA2, int n, int n2, int n3, int n4) {
        if (n2 == n3 && n3 == n4) {
            return n2;
        }
        if (n == n2 && n == n3) {
            return n;
        }
        if (n == n2 && n == n4) {
            return n;
        }
        if (n == n3 && n == n4) {
            return n;
        }
        if (n == n2 && n3 != n4) {
            return n;
        }
        if (n == n3 && n2 != n4) {
            return n;
        }
        if (n == n4 && n2 != n3) {
            return n;
        }
        if (n2 == n3 && n != n4) {
            return n2;
        }
        if (n2 == n4 && n != n3) {
            return n2;
        }
        return n3 == n4 && n != n2 ? n3 : rKA2.id_class(n, n2, n3, n4);
    }

    @Override
    public int id_class(rKA<?> rKA2, rKj_1 rKj_12, int n, int n2) {
        int n3 = rKj_12.id_class(this.id_class(n), this.id_break(n2));
        rKA2.id_class((long)(n >> 1 << 1), (long)(n2 >> 1 << 1));
        int n4 = n & 1;
        int n5 = n2 & 1;
        if (n4 == 0 && n5 == 0) {
            return n3;
        }
        int n6 = rKj_12.id_class(this.id_class(n), this.id_break(n2 + 1));
        int n7 = rKA2.id_class(n3, n6);
        if (n4 == 0 && n5 == 1) {
            return n7;
        }
        int n8 = rKj_12.id_class(this.id_class(n + 1), this.id_break(n2));
        int n9 = rKA2.id_class(n3, n8);
        if (n4 == 1 && n5 == 0) {
            return n9;
        }
        int n10 = rKj_12.id_class(this.id_class(n + 1), this.id_break(n2 + 1));
        return this.id_class(rKA2, n3, n8, n6, n10);
    }

    @Override
    public int id_class(int n) {
        return n >> 1;
    }

    @Override
    public int id_break(int n) {
        return n >> 1;
    }
}

