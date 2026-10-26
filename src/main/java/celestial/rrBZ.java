/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBH;
import celestial.rrBx_1;

public final class rrBZ
extends Enum<rrBZ>
implements rrBH {
    public static final /* enum */ rrBZ INSTANCE = new rrBZ();
    private static final /* synthetic */ rrBZ[] $VALUES;

    static {
        $VALUES = rrBZ.id_class();
    }

    public static rrBZ[] values() {
        return (rrBZ[])$VALUES.clone();
    }

    public static rrBZ valueOf(String string) {
        return Enum.valueOf(rrBZ.class, string);
    }

    private static /* synthetic */ rrBZ[] id_class() {
        return new rrBZ[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n) {
        return rrBx_1.id_break(n) ? n : rKC2.id_class(299999) + 2;
    }
}

