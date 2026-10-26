/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBy_1;

public final class rrBQ
extends Enum<rrBQ>
implements rrBy_1 {
    public static final /* enum */ rrBQ INSTANCE = new rrBQ();
    private static final /* synthetic */ rrBQ[] $VALUES;

    static {
        $VALUES = rrBQ.id_class();
    }

    public static rrBQ[] values() {
        return (rrBQ[])$VALUES.clone();
    }

    public static rrBQ valueOf(String string) {
        return Enum.valueOf(rrBQ.class, string);
    }

    private static /* synthetic */ rrBQ[] id_class() {
        return new rrBQ[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n) {
        return rKC2.id_class(57) == 0 && n == 1 ? 129 : n;
    }
}

