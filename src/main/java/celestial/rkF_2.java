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
import celestial.rds_3;
import celestial.rkf_3;
import celestial.rqO_2;
import celestial.rxA_2;
import com.google.common.collect.Lists;
import java.util.ArrayList;

public class rkF_2
extends rWN {
    public rkF_2(rqO_2 rqO_22) {
        super(rqO_22);
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n * n2 >= 2;
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        ArrayList arrayList = Lists.newArrayList();
        rdn_3 rdn_32 = rdn_3.id_break;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_33 = rXk_12.id_extends(i);
            if (rdn_33.id_class()) continue;
            rdb_3 rdb_32 = rdn_33.id_break();
            if (rdb_32 instanceof rds_3) {
                if (!rdn_32.id_class()) {
                    return rdn_3.id_break;
                }
                rdn_32 = rdn_33.id_implements();
                continue;
            }
            if (!(rdb_32 instanceof rxA_2)) {
                return rdn_3.id_break;
            }
            arrayList.add((rxA_2)rdb_32);
        }
        return !rdn_32.id_class() && !arrayList.isEmpty() ? rds_3.id_class(rdn_32, arrayList) : rdn_3.id_break;
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        rdn_3 rdn_32 = rdn_3.id_break;
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_33 = rXk_12.id_extends(i);
            if (rdn_33.id_class()) continue;
            if (rdn_33.id_break() instanceof rds_3) {
                if (!rdn_32.id_class()) {
                    return false;
                }
                rdn_32 = rdn_33;
                continue;
            }
            if (!(rdn_33.id_break() instanceof rxA_2)) {
                return false;
            }
            arrayList.add(rdn_33);
        }
        return !rdn_32.id_class() && !arrayList.isEmpty();
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_byte;
    }
}

