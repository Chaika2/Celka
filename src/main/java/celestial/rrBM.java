/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBp_1;

public final class rrBM
extends Enum<rrBM>
implements rrBp_1 {
    public static final /* enum */ rrBM INSTANCE = new rrBM();
    private static final /* synthetic */ rrBM[] $VALUES;

    static {
        $VALUES = rrBM.id_class();
    }

    public static rrBM[] values() {
        return (rrBM[])$VALUES.clone();
    }

    public static rrBM valueOf(String string) {
        return Enum.valueOf(rrBM.class, string);
    }

    private static /* synthetic */ rrBM[] id_class() {
        return new rrBM[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n, int n2, int n3, int n4, int n5) {
        return n5 != 4 || n != 1 && n2 != 1 && n4 != 1 && n3 != 1 && n != 2 && n2 != 2 && n4 != 2 && n3 != 2 ? n5 : 3;
    }
}

