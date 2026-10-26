/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rWN;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rqO_2;
import celestial.rxA_2;
import com.google.common.collect.Lists;
import java.util.ArrayList;

public class rkp_3
extends rWN {
    private static final rkg_3 id_class = rkg_3.id_class(rdy_3.du);

    public rkp_3(rqO_2 rqO_22) {
        super(rqO_22);
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_32 = rXk_12.id_extends(i);
            if (rdn_32.id_class()) continue;
            if (rdn_32.id_break() instanceof rxA_2) {
                bl = true;
                continue;
            }
            if (!id_class.id_class(rdn_32)) {
                return false;
            }
            if (bl2) {
                return false;
            }
            bl2 = true;
        }
        return bl2 && bl;
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n * n2 >= 2;
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        ArrayList arrayList = Lists.newArrayList();
        rdn_3 rdn_32 = null;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_33 = rXk_12.id_extends(i);
            rdb_3 rdb_32 = rdn_33.id_break();
            if (rdb_32 instanceof rxA_2) {
                arrayList.add(((rxA_2)rdb_32).id_byte().id_case());
                continue;
            }
            if (!id_class.id_class(rdn_33)) continue;
            rdn_32 = rdn_33.id_implements();
            rdn_32.id_throws(1);
        }
        if (rdn_32 != null && !arrayList.isEmpty()) {
            rdn_32.id_class("Explosion").id_class("FadeColors", arrayList);
            return rdn_32;
        }
        return rdn_3.id_break;
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_implements;
    }
}

