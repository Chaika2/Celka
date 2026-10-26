/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDV;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rUO;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDu_1
extends rUO<rDV> {
    private static final ImmutableList<xd_3> id_class = ImmutableList.of((Object)xu_3.id_instanceof, (Object)xu_3.id_while, (Object)xu_3.bV, (Object)xu_3.PY, (Object)xu_3.SP, (Object)xu_3.SB, (Object)xu_3.SS, (Object)xu_3.Ss, (Object)xu_3.re, (Object)xu_3.rD);

    public rDu_1(Codec<rDV> codec) {
        super(codec);
    }

    private static rfH_2 id_class(rRg_1 rRg_12, rfw_3 rfw_32, int n) {
        while (rfw_32.c_() < rRg_12.id_try() && n > 0) {
            --n;
            xc_3 xc_32 = rRg_12.id_byte(rfw_32);
            if (id_class.contains((Object)xc_32.id_break())) {
                return null;
            }
            if (xc_32.id_catch()) {
                return rfw_32;
            }
            rfw_32.id_class(rpr_3.UP);
        }
        return null;
    }

    private static boolean id_class(rRg_1 rRg_12, int n, rfH_2 rfH_22) {
        xc_3 xc_32 = rRg_12.id_byte(rfH_22);
        return xc_32.id_catch() || xc_32.id_class(xu_3.id_instanceof) && rfH_22.c_() <= n;
    }

    private static boolean id_class(rRg_1 rRg_12, int n, rfw_3 rfw_32) {
        if (!rDu_1.id_class(rRg_12, n, (rfH_2)rfw_32)) {
            return false;
        }
        xc_3 xc_32 = rRg_12.id_byte(rfw_32.id_class(rpr_3.DOWN));
        rfw_32.id_class(rpr_3.UP);
        return !xc_32.id_catch() && !id_class.contains((Object)xc_32.id_break());
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rDV rDV2) {
        int n = rKd_12.id_case();
        if (!rDu_1.id_class((rRg_1)rRI2, n, rfH_22.id_new())) {
            return false;
        }
        int n2 = rDV2.id_break().id_class(random);
        boolean bl = random.nextFloat() < 0.9f;
        int n3 = Math.min(n2, bl ? 5 : 8);
        int n4 = bl ? 50 : 15;
        boolean bl2 = false;
        for (rfH_2 rfH_23 : rfH_2.id_class(random, n4, rfH_22.b_() - n3, rfH_22.c_(), rfH_22.d_() - n3, rfH_22.b_() + n3, rfH_22.c_(), rfH_22.d_() + n3)) {
            int n5 = n2 - rfH_23.id_implements(rfH_22);
            if (n5 < 0) continue;
            bl2 |= this.id_class((rRg_1)rRI2, n, rfH_23, n5, rDV2.id_class().id_class(random));
        }
        return bl2;
    }

    private static rfH_2 id_class(rRg_1 rRg_12, int n, rfw_3 rfw_32, int n2) {
        while (rfw_32.c_() > 1 && n2 > 0) {
            --n2;
            if (rDu_1.id_class(rRg_12, n, rfw_32)) {
                return rfw_32;
            }
            rfw_32.id_class(rpr_3.DOWN);
        }
        return null;
    }

    private boolean id_class(rRg_1 rRg_12, int n, rfH_2 rfH_22, int n2, int n3) {
        boolean bl = false;
        block0: for (rfH_2 rfH_23 : rfH_2.id_break(rfH_22.b_() - n3, rfH_22.c_(), rfH_22.d_() - n3, rfH_22.b_() + n3, rfH_22.c_(), rfH_22.d_() + n3)) {
            int n4 = rfH_23.id_implements(rfH_22);
            rfH_2 rfH_24 = rDu_1.id_class(rRg_12, n, rfH_23) ? rDu_1.id_class(rRg_12, n, rfH_23.id_new(), n4) : rDu_1.id_class(rRg_12, rfH_23.id_new(), n4);
            if (rfH_24 == null) continue;
            rfw_3 rfw_32 = rfH_24.id_new();
            for (int i = n2 - n4 / 2; i >= 0; --i) {
                if (rDu_1.id_class(rRg_12, n, (rfH_2)rfw_32)) {
                    this.id_class(rRg_12, rfw_32, xu_3.PK.id_continue());
                    rfw_32.id_class(rpr_3.UP);
                    bl = true;
                    continue;
                }
                if (!rRg_12.id_byte(rfw_32).id_class(xu_3.PK)) continue block0;
                rfw_32.id_class(rpr_3.UP);
            }
        }
        return bl;
    }
}

