/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.DD;
import celestial.Uh_1;

public final class DX
extends Enum<DX> {
    public static final /* enum */ DX TINTED = new DX();
    public static final /* enum */ DX NOT_TINTED = new DX();
    private static final /* synthetic */ DX[] $VALUES;

    private static /* synthetic */ DX[] id_byte() {
        return new DX[]{TINTED, NOT_TINTED};
    }

    static {
        $VALUES = DX.id_byte();
    }

    public static DX[] values() {
        return (DX[])$VALUES.clone();
    }

    public static DX valueOf(String string) {
        return Enum.valueOf(DX.class, string);
    }

    public DD id_class() {
        return this == TINTED ? Uh_1.id_switch : Uh_1.id_double;
    }

    public DD id_break() {
        return this == TINTED ? Uh_1.P : Uh_1.r;
    }
}

