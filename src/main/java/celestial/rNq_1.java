/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.ix_3;
import celestial.rNl_1;
import celestial.rNt_1;
import celestial.rQz_1;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rqR_2;
import celestial.rzO_2;
import celestial.rzr_3;
import celestial.rzx_3;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class rNq_1
extends rzO_2 {
    public final List<rNt_1> id_break;

    public rNq_1(rQz_1[] rQz_1Array, List<rNt_1> list) {
        super(rQz_1Array);
        this.id_break = ImmutableList.copyOf(list);
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_implements;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        Random random = rzr_32.id_class();
        for (rNt_1 rNt_12 : this.id_break) {
            UUID uUID = rNt_12.id_throws;
            if (uUID == null) {
                uUID = UUID.randomUUID();
            }
            rXQ rXQ2 = rqR_2.id_class(rNt_12.id_case, random);
            rdn_32.id_class(rNt_12.id_break, new ix_3(uUID, rNt_12.id_class, (double)rNt_12.id_protected.id_break(random), rNt_12.id_byte), rXQ2);
        }
        return rdn_32;
    }
}

