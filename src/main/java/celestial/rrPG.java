/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.JC;
import celestial.rRR;
import celestial.rfH_2;
import celestial.rrPA;
import celestial.rrPN;
import celestial.rrPp_1;
import celestial.rrPx_1;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class rrPG
extends rrPA {
    public static final Codec<rrPG> id_class = xc_3.id_break.xmap(JC::id_break, xd_3::id_continue).listOf().fieldOf("blocks").xmap(rrPG::new, rrPG2 -> rrPG2.id_throws).codec();
    public static final rrPG id_break = new rrPG((List<xd_3>)ImmutableList.of((Object)xu_3.Js));
    public static final rrPG id_byte = new rrPG((List<xd_3>)ImmutableList.of((Object)xu_3.id_class));
    public static final rrPG id_protected = new rrPG((List<xd_3>)ImmutableList.of((Object)xu_3.id_class, (Object)xu_3.Js));
    private final ImmutableList<xd_3> id_throws;

    public rrPG(List<xd_3> list) {
        this.id_throws = ImmutableList.copyOf(list);
    }

    @Override
    public rrPp_1 id_class(rRR rRR2, rfH_2 rfH_22, rfH_2 rfH_23, rrPp_1 rrPp_12, rrPp_1 rrPp_13, rrPN rrPN2) {
        return this.id_throws.contains((Object)rrPp_13.id_break.id_break()) ? null : rrPp_13;
    }

    @Override
    protected rrPx_1<?> id_class() {
        return rrPx_1.id_class;
    }
}

