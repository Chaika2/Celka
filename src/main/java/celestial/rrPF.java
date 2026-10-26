/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rRR;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rrPA;
import celestial.rrPN;
import celestial.rrPp_1;
import celestial.rrPv_1;
import celestial.rrPx_1;
import celestial.xc_3;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;

public class rrPF
extends rrPA {
    public static final Codec<rrPF> id_class = rrPv_1.id_class.listOf().fieldOf("rules").xmap(rrPF::new, rrPF2 -> rrPF2.id_break).codec();
    private final ImmutableList<rrPv_1> id_break;

    public rrPF(List<? extends rrPv_1> list) {
        this.id_break = ImmutableList.copyOf(list);
    }

    @Override
    public rrPp_1 id_class(rRR rRR2, rfH_2 rfH_22, rfH_2 rfH_23, rrPp_1 rrPp_12, rrPp_1 rrPp_13, rrPN rrPN2) {
        Random random = new Random(rfU_2.id_class(rrPp_13.id_class));
        xc_3 xc_32 = rRR2.id_byte(rrPp_13.id_class);
        for (rrPv_1 rrPv_12 : this.id_break) {
            if (!rrPv_12.id_class(rrPp_13.id_break, xc_32, rrPp_12.id_class, rrPp_13.id_class, rfH_23, random)) continue;
            return new rrPp_1(rrPp_13.id_class, rrPv_12.id_class(), rrPv_12.id_break());
        }
        return rrPp_13;
    }

    @Override
    protected rrPx_1<?> id_class() {
        return rrPx_1.id_throws;
    }
}

