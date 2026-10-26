/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rfH_2;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xu_3;

public final class rRx_1
extends Enum<rRx_1>
implements rRq_1 {
    public static final /* enum */ rRx_1 INSTANCE = new rRx_1();
    private static final /* synthetic */ rRx_1[] $VALUES;

    @Override
    public xc_3 id_byte(rfH_2 rfH_22) {
        return xu_3.id_class.id_continue();
    }

    static {
        $VALUES = rRx_1.id_class();
    }

    public static rRx_1[] values() {
        return (rRx_1[])$VALUES.clone();
    }

    public static rRx_1 valueOf(String string) {
        return Enum.valueOf(rRx_1.class, string);
    }

    private static /* synthetic */ rRx_1[] id_class() {
        return new rRx_1[]{INSTANCE};
    }

    @Override
    public ryO_2 id_class(rfH_2 rfH_22) {
        return null;
    }

    @Override
    public rXE id_break(rfH_2 rfH_22) {
        return rXG.id_class.id_private();
    }
}

