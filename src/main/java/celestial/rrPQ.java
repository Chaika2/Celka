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
import com.mojang.serialization.Codec;

public class rrPQ
extends rrPA {
    public static final Codec<rrPQ> id_class;
    public static final rrPQ id_break;

    private rrPQ() {
    }

    static {
        id_break = new rrPQ();
        id_class = Codec.unit(() -> id_break);
    }

    @Override
    public rrPp_1 id_class(rRR rRR2, rfH_2 rfH_22, rfH_2 rfH_23, rrPp_1 rrPp_12, rrPp_1 rrPp_13, rrPN rrPN2) {
        return rrPp_13;
    }

    @Override
    protected rrPx_1<?> id_class() {
        return rrPx_1.id_case;
    }
}

