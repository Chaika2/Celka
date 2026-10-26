/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rKj_1;
import celestial.rrBC;
import celestial.rrBq_1;
import celestial.rrBx_1;

public final class rrBW
extends Enum<rrBW>
implements rrBC,
rrBq_1 {
    public static final /* enum */ rrBW INSTANCE = new rrBW();
    private static final /* synthetic */ rrBW[] $VALUES;

    static {
        $VALUES = rrBW.id_class();
    }

    public static rrBW[] values() {
        return (rrBW[])$VALUES.clone();
    }

    public static rrBW valueOf(String string) {
        return Enum.valueOf(rrBW.class, string);
    }

    private static /* synthetic */ rrBW[] id_class() {
        return new rrBW[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, rKj_1 rKj_12, rKj_1 rKj_13, int n, int n2) {
        int n3 = rKj_12.id_class(this.id_class(n), this.id_break(n2));
        int n4 = rKj_13.id_class(this.id_class(n), this.id_break(n2));
        if (rrBx_1.id_class(n3)) {
            return n3;
        }
        if (n4 == 7) {
            if (n3 == 12) {
                return 11;
            }
            return n3 != 14 && n3 != 15 ? n4 & 0xFF : 15;
        }
        return n3;
    }
}

