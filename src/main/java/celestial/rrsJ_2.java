/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.aI_2;
import celestial.rHx_1;
import celestial.rRI;
import celestial.rRY;
import celestial.rUO;
import celestial.rYB;
import celestial.rbF_2;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rpr_3;
import celestial.rrsW_2;
import celestial.rrsk_3;
import celestial.ryO_2;
import celestial.xO_2;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class rrsJ_2
extends rrsk_3 {
    public static final Codec<rrsJ_2> id_class = Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").xmap(rrsJ_2::new, rrsJ_22 -> Float.valueOf(rrsJ_22.id_break)).codec();
    private final float id_break;

    public rrsJ_2(float f) {
        this.id_break = f;
    }

    @Override
    protected rrsW_2<?> id_class() {
        return rrsW_2.id_protected;
    }

    @Override
    public void id_class(rRI rRI2, Random random, List<rfH_2> list, List<rfH_2> list2, Set<rfH_2> set, rfi_3 rfi_32) {
        if (!(random.nextFloat() >= this.id_break)) {
            rfH_2 rfH_23;
            rfH_2 rfH_24;
            rpr_3 rpr_32 = xO_2.id_class(random);
            int n = !list2.isEmpty() ? Math.max(list2.get(0).c_() - 1, list.get(0).c_()) : Math.min(list.get(0).c_() + 1 + random.nextInt(3), list.get(list.size() - 1).c_());
            List list3 = list.stream().filter(rfH_22 -> rfH_22.c_() == n).collect(Collectors.toList());
            if (!list3.isEmpty() && rUO.id_break(rRI2, rfH_24 = (rfH_23 = (rfH_2)list3.get(random.nextInt(list3.size()))).id_break(rpr_32)) && rUO.id_break(rRI2, rfH_24.id_break(rpr_3.SOUTH))) {
                xc_3 xc_32 = (xc_3)xu_3.JM.id_continue().id_class(xO_2.id_volatile, rpr_3.SOUTH);
                this.id_class((rRY)rRI2, rfH_24, xc_32, set, rfi_32);
                ryO_2 ryO_22 = rRI2.id_class(rfH_24);
                if (ryO_22 instanceof rHx_1) {
                    rHx_1 rHx_12 = (rHx_1)ryO_22;
                    int n2 = 2 + random.nextInt(2);
                    for (int i = 0; i < n2; ++i) {
                        rbF_2 rbF_22 = new rbF_2((aI_2<? extends rbF_2>)aI_2.id_throws, (rYB)rRI2.id_byte());
                        rHx_12.id_class(rbF_22, false, random.nextInt(599));
                    }
                }
            }
        }
    }
}

