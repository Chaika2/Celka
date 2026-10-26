/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBx_1;
import celestial.rrBy_1;

public final class rrBB
extends Enum<rrBB>
implements rrBy_1 {
    public static final /* enum */ rrBB INSTANCE = new rrBB();
    private static final /* synthetic */ rrBB[] $VALUES;

    static {
        $VALUES = rrBB.id_class();
    }

    public static rrBB[] values() {
        return (rrBB[])$VALUES.clone();
    }

    public static rrBB valueOf(String string) {
        return Enum.valueOf(rrBB.class, string);
    }

    private static /* synthetic */ rrBB[] id_class() {
        return new rrBB[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n) {
        if (rrBx_1.id_break(n)) {
            return n;
        }
        int n2 = rKC2.id_class(6);
        if (n2 == 0) {
            return 4;
        }
        return n2 == 1 ? 3 : 1;
    }
}

