/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBp_1;

public final class rrBm_1
extends Enum<rrBm_1>
implements rrBp_1 {
    public static final /* enum */ rrBm_1 INSTANCE = new rrBm_1();
    private static final /* synthetic */ rrBm_1[] $VALUES;

    static {
        $VALUES = rrBm_1.id_class();
    }

    public static rrBm_1[] values() {
        return (rrBm_1[])$VALUES.clone();
    }

    public static rrBm_1 valueOf(String string) {
        return Enum.valueOf(rrBm_1.class, string);
    }

    private static /* synthetic */ rrBm_1[] id_class() {
        return new rrBm_1[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n, int n2, int n3, int n4, int n5) {
        boolean bl;
        boolean bl2 = n2 == n4;
        boolean bl3 = bl = n == n3;
        if (bl2 == bl) {
            if (bl2) {
                return rKC2.id_class(2) == 0 ? n4 : n;
            }
            return n5;
        }
        return bl2 ? n4 : n;
    }
}

