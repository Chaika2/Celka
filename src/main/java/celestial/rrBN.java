/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBp_1;
import celestial.rrBx_1;

public final class rrBN
extends Enum<rrBN>
implements rrBp_1 {
    public static final /* enum */ rrBN INSTANCE = new rrBN();
    private static final /* synthetic */ rrBN[] $VALUES;

    static {
        $VALUES = rrBN.id_class();
    }

    public static rrBN[] values() {
        return (rrBN[])$VALUES.clone();
    }

    public static rrBN valueOf(String string) {
        return Enum.valueOf(rrBN.class, string);
    }

    private static /* synthetic */ rrBN[] id_class() {
        return new rrBN[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n, int n2, int n3, int n4, int n5) {
        return rrBx_1.id_break(n5) && rrBx_1.id_break(n) && rrBx_1.id_break(n2) && rrBx_1.id_break(n4) && rrBx_1.id_break(n3) && rKC2.id_class(2) == 0 ? 1 : n5;
    }
}

