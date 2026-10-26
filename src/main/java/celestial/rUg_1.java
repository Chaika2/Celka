/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDH;
import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rlG_2;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUg_1
extends rUO<rDH> {
    public rUg_1(Codec<rDH> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rDH rDH2) {
        xc_3 xc_32 = rDH2.id_break.id_class(random, rfH_22);
        rfH_2 rfH_23 = rDH2.id_extends ? rRI2.id_class(rKv_1.WORLD_SURFACE_WG, rfH_22) : rfH_22;
        int n = 0;
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i < rDH2.id_case; ++i) {
            rfw_32.id_class(rfH_23, random.nextInt(rDH2.id_catch + 1) - random.nextInt(rDH2.id_catch + 1), random.nextInt(rDH2.id_private + 1) - random.nextInt(rDH2.id_private + 1), random.nextInt(rDH2.id_implements + 1) - random.nextInt(rDH2.id_implements + 1));
            rfH_2 rfH_24 = rfw_32.id_break();
            xc_3 xc_33 = rRI2.id_byte(rfH_24);
            if (!rRI2.id_finally(rfw_32) && (!rDH2.id_finally || !rRI2.id_byte(rfw_32).id_byte().id_throws()) || !xc_32.id_class(rRI2, (rfH_2)rfw_32) || !rDH2.id_protected.isEmpty() && !rDH2.id_protected.contains(xc_33.id_break()) || rDH2.id_throws.contains(xc_33) || rDH2.id_native && !rRI2.id_break(rfH_24.id_byte()).id_class(rlG_2.id_break) && !rRI2.id_break(rfH_24.id_extends()).id_class(rlG_2.id_break) && !rRI2.id_break(rfH_24.id_private()).id_class(rlG_2.id_break) && !rRI2.id_break(rfH_24.id_protected()).id_class(rlG_2.id_break)) continue;
            rDH2.id_byte.id_class(rRI2, rfw_32, xc_32, random);
            ++n;
        }
        return n > 0;
    }
}

