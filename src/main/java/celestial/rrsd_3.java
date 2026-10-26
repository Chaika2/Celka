/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rCN;
import celestial.rKH;
import celestial.rRI;
import celestial.rRY;
import celestial.rUO;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rrsW_2;
import celestial.rrsk_3;
import celestial.zq_3;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsd_3
extends rrsk_3 {
    public static final Codec<rrsd_3> id_class;
    public static final rrsd_3 id_break;

    static {
        id_break = new rrsd_3();
        id_class = Codec.unit(() -> id_break);
    }

    private void id_class(rKH rKH2, rfH_2 rfH_22, rCN rCN2, Set<rfH_2> set, rfi_3 rfi_32) {
        this.id_class((rRY)rKH2, rfH_22, rCN2, set, rfi_32);
        rfH_2 rfH_23 = rfH_22.id_break();
        for (int i = 4; rUO.id_break(rKH2, rfH_23) && i > 0; --i) {
            this.id_class((rRY)rKH2, rfH_23, rCN2, set, rfi_32);
            rfH_23 = rfH_23.id_break();
        }
    }

    @Override
    protected rrsW_2<?> id_class() {
        return rrsW_2.id_break;
    }

    @Override
    public void id_class(rRI rRI2, Random random, List<rfH_2> list, List<rfH_2> list2, Set<rfH_2> set, rfi_3 rfi_32) {
        list2.forEach(rfH_22 -> {
            rfH_2 rfH_23;
            if (random.nextInt(4) == 0 && rUO.id_break(rRI2, rfH_23 = rfH_22.id_byte())) {
                this.id_class(rRI2, rfH_23, zq_3.id_package, set, rfi_32);
            }
            if (random.nextInt(4) == 0 && rUO.id_break(rRI2, rfH_23 = rfH_22.id_extends())) {
                this.id_class(rRI2, rfH_23, zq_3.id_new, set, rfi_32);
            }
            if (random.nextInt(4) == 0 && rUO.id_break(rRI2, rfH_23 = rfH_22.id_private())) {
                this.id_class(rRI2, rfH_23, zq_3.id_int, set, rfi_32);
            }
            if (random.nextInt(4) == 0 && rUO.id_break(rRI2, rfH_23 = rfH_22.id_protected())) {
                this.id_class(rRI2, rfH_23, zq_3.id_final, set, rfi_32);
            }
        });
    }
}

