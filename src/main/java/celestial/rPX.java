/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.aI_2;
import celestial.iA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rXA;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rrEm_1;
import celestial.rsT_2;
import celestial.rsq_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class rPX
extends rPm_1<rsq_3> {
    private Set<rdb_3> id_class = ImmutableSet.of();

    @Override
    protected void id_byte(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        rsq_3 rsq_33 = (rsq_3)rsq_32.SF().id_byte(il_3.id_new).get();
        if (!(rsq_32.id_int(rsq_33) > 5.0)) {
            iA_2.id_class((iB_2)rsq_32, (iB_2)rsq_33, 0.5f);
            rsq_32.id_class(rrEm_12, rsq_33, l);
            if (rsq_32.sZ() && (rsq_32.su().id_break() == rsT_2.id_case || rsq_33.sv())) {
                rPX.id_class(rsq_32, rsq_3.id_this.keySet(), rsq_33);
            }
            if (rsq_33.su().id_break() == rsT_2.id_case && rsq_32.sd().id_class(rdy_3.hB) > rdy_3.hB.id_implements() / 2) {
                rPX.id_class(rsq_32, (Set<rdb_3>)ImmutableSet.of((Object)rdy_3.hB), rsq_33);
            }
            if (!this.id_class.isEmpty() && rsq_32.sd().id_class(this.id_class)) {
                rPX.id_class(rsq_32, this.id_class, rsq_33);
            }
        }
    }

    public rPX() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_new, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_private, (Object)((Object)iC_2.VALUE_PRESENT)));
    }

    private static void id_class(rsq_3 rsq_32, Set<rdb_3> set, iB_2 iB_22) {
        rXA rXA2 = rsq_32.sd();
        rdn_3 rdn_32 = rdn_3.id_break;
        for (int i = 0; i < rXA2.id_else(); ++i) {
            int n;
            rdb_3 rdb_32;
            rdn_3 rdn_33 = rXA2.id_extends(i);
            if (rdn_33.id_class() || !set.contains(rdb_32 = rdn_33.id_break())) continue;
            if (rdn_33.id_char() > rdn_33.id_byte() / 2) {
                n = rdn_33.id_char() / 2;
            } else {
                if (rdn_33.id_char() <= 24) continue;
                n = rdn_33.id_char() - 24;
            }
            rdn_33.id_catch(n);
            rdn_32 = new rdn_3(rdb_32, n);
            break;
        }
        if (!rdn_32.id_class()) {
            iA_2.id_class((iB_2)rsq_32, rdn_32, iB_22.Ps());
        }
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        return this.id_class(rrEm_12, rsq_32);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        return iA_2.id_class(rsq_32.SF(), il_3.id_new, aI_2.D);
    }

    private static Set<rdb_3> id_class(rsq_3 rsq_32, rsq_3 rsq_33) {
        ImmutableSet<rdb_3> immutableSet = rsq_33.su().id_break().id_break();
        ImmutableSet<rdb_3> immutableSet2 = rsq_32.su().id_break().id_break();
        return immutableSet.stream().filter(rdb_32 -> !immutableSet2.contains(rdb_32)).collect(Collectors.toSet());
    }

    @Override
    protected /* synthetic */ void id_break(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_protected(rrEm_12, (rsq_3)iB_22, l);
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        rsq_3 rsq_33 = (rsq_3)rsq_32.SF().id_byte(il_3.id_new).get();
        iA_2.id_class((iB_2)rsq_32, (iB_2)rsq_33, 0.5f);
        this.id_class = rPX.id_class(rsq_32, rsq_33);
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_break(rrEm_12, (rsq_3)iB_22, l);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        rsq_32.SF().id_break(il_3.id_new);
    }
}

