/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.rNf_1;
import celestial.rNl_1;
import celestial.rQs_1;
import celestial.rQz_1;
import celestial.rXC;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rqs_3;
import celestial.rzE_2;
import celestial.rzL_2;
import celestial.rzO_2;
import celestial.rzr_3;
import celestial.rzx_3;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class rNI
extends rzO_2 {
    public final List<rzE_2> id_break;

    public static rNf_1 id_byte() {
        return new rNf_1();
    }

    public rNI(rQz_1[] rQz_1Array, List<rzE_2> list) {
        super(rQz_1Array);
        this.id_break = ImmutableList.copyOf(list);
    }

    @Override
    public void id_class(rQs_1 rQs_12) {
        super.id_class(rQs_12);
        for (int i = 0; i < this.id_break.size(); ++i) {
            this.id_break.get(i).id_class(rQs_12.id_break(".entry[" + i + "]"));
        }
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        if (rdn_32.id_class()) {
            return rdn_32;
        }
        rqs_3<rdn_3> rqs_32 = rqs_3.id_class();
        this.id_break.forEach(rzE_22 -> rzE_22.expand(rzr_32, rWR2 -> rWR2.id_class(rzL_2.id_class(rqs_32::add), rzr_32)));
        rcd_3 rcd_32 = new rcd_3();
        rXC.id_class(rcd_32, rqs_32);
        rcd_3 rcd_33 = rdn_32.id_int();
        rcd_33.id_class("BlockEntityTag", rcd_32.id_class(rcd_33.id_int("BlockEntityTag")));
        return rdn_32;
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_final;
    }
}

