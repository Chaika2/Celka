/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBA;

public final class rrBX
extends Enum<rrBX>
implements rrBA {
    public static final /* enum */ rrBX INSTANCE = new rrBX();
    private static final /* synthetic */ rrBX[] $VALUES;

    static {
        $VALUES = rrBX.id_class();
    }

    public static rrBX[] values() {
        return (rrBX[])$VALUES.clone();
    }

    public static rrBX valueOf(String string) {
        return Enum.valueOf(rrBX.class, string);
    }

    private static /* synthetic */ rrBX[] id_class() {
        return new rrBX[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n, int n2) {
        if (n == 0 && n2 == 0) {
            return 1;
        }
        return rKC2.id_class(10) == 0 ? 1 : 0;
    }
}

