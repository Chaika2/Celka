/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBH;
import celestial.rrBx_1;

public final class rrBO
extends Enum<rrBO>
implements rrBH {
    public static final /* enum */ rrBO INSTANCE = new rrBO();
    private static final /* synthetic */ rrBO[] $VALUES;

    static {
        $VALUES = rrBO.id_class();
    }

    public static rrBO[] values() {
        return (rrBO[])$VALUES.clone();
    }

    public static rrBO valueOf(String string) {
        return Enum.valueOf(rrBO.class, string);
    }

    private static /* synthetic */ rrBO[] id_class() {
        return new rrBO[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n) {
        if (!rrBx_1.id_break(n) && rKC2.id_class(13) == 0) {
            n |= 1 + rKC2.id_class(15) << 8 & 0xF00;
        }
        return n;
    }
}

