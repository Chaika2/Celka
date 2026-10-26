/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JC;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjE_2;
import celestial.rjm_3;
import celestial.xc_3;

public final class rjS_2
extends Enum<rjS_2>
implements rjE_2 {
    public static final /* enum */ rjS_2 COLLIDER = new rjS_2(JC::id_break);
    public static final /* enum */ rjS_2 OUTLINE = new rjS_2(JC::id_class);
    public static final /* enum */ rjS_2 VISUAL = new rjS_2(JC::id_byte);
    private final rjE_2 provider;
    private static final /* synthetic */ rjS_2[] $VALUES;

    private rjS_2(rjE_2 rjE_22) {
        this.provider = rjE_22;
    }

    static {
        $VALUES = rjS_2.id_class();
    }

    @Override
    public rjC_2 get(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.provider.get(xc_32, rRq_12, rfH_22, rjm_32);
    }

    public static rjS_2[] values() {
        return (rjS_2[])$VALUES.clone();
    }

    public static rjS_2 valueOf(String string) {
        return Enum.valueOf(rjS_2.class, string);
    }

    private static /* synthetic */ rjS_2[] id_class() {
        return new rjS_2[]{COLLIDER, OUTLINE, VISUAL};
    }
}

