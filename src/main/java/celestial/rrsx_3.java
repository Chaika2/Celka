/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rRI;
import celestial.rRY;
import celestial.rUO;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rrsW_2;
import celestial.rrsk_3;
import celestial.xY_2;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsx_3
extends rrsk_3 {
    public static final Codec<rrsx_3> id_class = Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").xmap(rrsx_3::new, rrsx_32 -> Float.valueOf(rrsx_32.id_break)).codec();
    private final float id_break;

    public rrsx_3(float f) {
        this.id_break = f;
    }

    @Override
    protected rrsW_2<?> id_class() {
        return rrsW_2.id_byte;
    }

    @Override
    public void id_class(rRI rRI2, Random random, List<rfH_2> list, List<rfH_2> list2, Set<rfH_2> set, rfi_3 rfi_32) {
        if (!(random.nextFloat() >= this.id_break)) {
            int n = list.get(0).c_();
            list.stream().filter(rfH_22 -> rfH_22.c_() - n <= 2).forEach(rfH_22 -> {
                for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
                    rpr_3 rpr_33;
                    rfH_2 rfH_23;
                    if (!(random.nextFloat() <= 0.25f) || !rUO.id_break(rRI2, rfH_23 = rfH_22.id_break((rpr_33 = rpr_32.id_case()).id_implements(), 0, rpr_33.id_extends()))) continue;
                    xc_3 xc_32 = (xc_3)((xc_3)xu_3.Sx.id_continue().id_class(xY_2.id_volatile, random.nextInt(3))).id_class(xY_2.p, rpr_32);
                    this.id_class((rRY)rRI2, rfH_23, xc_32, set, rfi_32);
                }
            });
        }
    }
}

