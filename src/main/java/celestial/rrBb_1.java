/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBp_1;

public final class rrBb_1
extends Enum<rrBb_1>
implements rrBp_1 {
    public static final /* enum */ rrBb_1 INSTANCE = new rrBb_1();
    private static final /* synthetic */ rrBb_1[] $VALUES;

    static {
        $VALUES = rrBb_1.id_class();
    }

    public static rrBb_1[] values() {
        return (rrBb_1[])$VALUES.clone();
    }

    public static rrBb_1 valueOf(String string) {
        return Enum.valueOf(rrBb_1.class, string);
    }

    private static /* synthetic */ rrBb_1[] id_class() {
        return new rrBb_1[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n, int n2, int n3, int n4, int n5) {
        return n5 != 1 || n != 3 && n2 != 3 && n4 != 3 && n3 != 3 && n != 4 && n2 != 4 && n4 != 4 && n3 != 4 ? n5 : 2;
    }
}

