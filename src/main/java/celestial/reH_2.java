/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDm_1;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rUO;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Random;

public class reH_2
extends rUO<rDm_1> {
    private static final ImmutableList<xd_3> id_class = ImmutableList.of((Object)xu_3.id_while, (Object)xu_3.SP, (Object)xu_3.SB, (Object)xu_3.SS, (Object)xu_3.Ss, (Object)xu_3.re, (Object)xu_3.rD);
    private static final rpr_3[] b = rpr_3.values();

    public reH_2(Codec<rDm_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rDm_1 rDm_12) {
        boolean bl = false;
        boolean bl2 = random.nextDouble() < 0.9;
        int n = bl2 ? rDm_12.id_protected().id_class(random) : 0;
        int n2 = bl2 ? rDm_12.id_protected().id_class(random) : 0;
        boolean bl3 = bl2 && n != 0 && n2 != 0;
        int n3 = rDm_12.id_byte().id_class(random);
        int n4 = rDm_12.id_byte().id_class(random);
        int n5 = Math.max(n3, n4);
        for (rfH_2 rfH_23 : rfH_2.id_class(rfH_22, n3, 0, n4)) {
            rfH_2 rfH_24;
            if (rfH_23.id_implements(rfH_22) > n5) break;
            if (!reH_2.id_class(rRI2, rfH_23, rDm_12)) continue;
            if (bl3) {
                bl = true;
                this.id_class(rRI2, rfH_23, rDm_12.id_break());
            }
            if (!reH_2.id_class(rRI2, rfH_24 = rfH_23.id_break(n, 0, n2), rDm_12)) continue;
            bl = true;
            this.id_class(rRI2, rfH_24, rDm_12.id_class());
        }
        return bl;
    }

    private static boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22, rDm_1 rDm_12) {
        xc_3 xc_32 = rRg_12.id_byte(rfH_22);
        if (xc_32.id_class(rDm_12.id_class().id_break())) {
            return false;
        }
        if (id_class.contains((Object)xc_32.id_break())) {
            return false;
        }
        for (rpr_3 rpr_32 : b) {
            boolean bl = rRg_12.id_byte(rfH_22.id_break(rpr_32)).id_catch();
            if ((!bl || rpr_32 == rpr_3.UP) && (bl || rpr_32 != rpr_3.UP)) continue;
            return false;
        }
        return true;
    }
}

