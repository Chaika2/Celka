/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBp_1;

public final class rrBc_1
extends Enum<rrBc_1>
implements rrBp_1 {
    public static final /* enum */ rrBc_1 INSTANCE = new rrBc_1();
    private static final /* synthetic */ rrBc_1[] $VALUES;

    private static int id_byte(int n) {
        return n >= 2 ? 2 + (n & 1) : n;
    }

    static {
        $VALUES = rrBc_1.id_class();
    }

    public static rrBc_1[] values() {
        return (rrBc_1[])$VALUES.clone();
    }

    public static rrBc_1 valueOf(String string) {
        return Enum.valueOf(rrBc_1.class, string);
    }

    private static /* synthetic */ rrBc_1[] id_class() {
        return new rrBc_1[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n, int n2, int n3, int n4, int n5) {
        int n6 = rrBc_1.id_byte(n5);
        return n6 == rrBc_1.id_byte(n4) && n6 == rrBc_1.id_byte(n) && n6 == rrBc_1.id_byte(n2) && n6 == rrBc_1.id_byte(n3) ? -1 : 7;
    }
}

