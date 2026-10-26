/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rRR;
import celestial.rfH_2;
import celestial.rrPA;
import celestial.rrPN;
import celestial.rrPp_1;
import celestial.rrPx_1;
import celestial.xd_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;

public class rrPW
extends rrPA {
    public static final Codec<rrPW> id_class;
    public static final rrPW id_break;

    static {
        id_break = new rrPW();
        id_class = Codec.unit(() -> id_break);
    }

    @Override
    public rrPp_1 id_class(rRR rRR2, rfH_2 rfH_22, rfH_2 rfH_23, rrPp_1 rrPp_12, rrPp_1 rrPp_13, rrPN rrPN2) {
        rfH_2 rfH_24 = rrPp_13.id_class;
        boolean bl = rRR2.id_byte(rfH_24).id_class(xu_3.id_instanceof);
        return bl && !xd_3.id_class(rrPp_13.id_break.id_finally(rRR2, rfH_24)) ? new rrPp_1(rfH_24, xu_3.id_instanceof.id_continue(), rrPp_13.id_byte) : rrPp_13;
    }

    @Override
    protected rrPx_1<?> id_class() {
        return rrPx_1.id_implements;
    }
}

