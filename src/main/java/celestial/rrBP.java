/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBl_1;
import celestial.rrBx_1;

public final class rrBP
extends Enum<rrBP>
implements rrBl_1 {
    public static final /* enum */ rrBP INSTANCE = new rrBP();
    private static final /* synthetic */ rrBP[] $VALUES;

    static {
        $VALUES = rrBP.id_class();
    }

    public static rrBP[] values() {
        return (rrBP[])$VALUES.clone();
    }

    public static rrBP valueOf(String string) {
        return Enum.valueOf(rrBP.class, string);
    }

    private static /* synthetic */ rrBP[] id_class() {
        return new rrBP[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n, int n2, int n3, int n4, int n5) {
        return rrBx_1.id_break(n5) && rrBx_1.id_break(n4) && rrBx_1.id_break(n) && rrBx_1.id_break(n3) && rrBx_1.id_break(n2) && rKC2.id_class(100) == 0 ? 14 : n5;
    }
}

