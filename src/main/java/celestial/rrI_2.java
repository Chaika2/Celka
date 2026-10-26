/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.iA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rLD;
import celestial.rPm_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rrEm_1;
import celestial.rsT_2;
import celestial.rsq_3;
import celestial.rzL_2;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzl_3;
import celestial.rzz_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class rrI_2
extends rPm_1<rsq_3> {
    private static final Map<rsT_2, rqO_2> id_class = rqR_2.id_class(Maps.newHashMap(), hashMap -> {
        hashMap.put(rsT_2.id_break, rzl_3.z);
        hashMap.put(rsT_2.id_byte, rzl_3.Q);
        hashMap.put(rsT_2.id_protected, rzl_3.N);
        hashMap.put(rsT_2.id_throws, rzl_3.c);
        hashMap.put(rsT_2.id_case, rzl_3.u);
        hashMap.put(rsT_2.id_catch, rzl_3.m);
        hashMap.put(rsT_2.id_private, rzl_3.Z);
        hashMap.put(rsT_2.id_implements, rzl_3.v);
        hashMap.put(rsT_2.id_finally, rzl_3.F);
        hashMap.put(rsT_2.id_extends, rzl_3.L);
        hashMap.put(rsT_2.id_volatile, rzl_3.A);
        hashMap.put(rsT_2.id_final, rzl_3.n);
        hashMap.put(rsT_2.id_package, rzl_3.C);
    });
    private int id_byte = 600;
    private boolean id_protected;
    private long id_throws;

    @Override
    protected void id_byte(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        rhd_3 rhd_32 = this.id_byte(rsq_32).get();
        iA_2.id_class((iB_2)rsq_32, (iB_2)rhd_32);
        if (this.id_class(rsq_32, rhd_32)) {
            if (l - this.id_throws > 20L) {
                this.id_class(rsq_32, (iB_2)rhd_32);
                this.id_protected = true;
            }
        } else {
            iA_2.id_class((iB_2)rsq_32, rhd_32, 0.5f, 5);
        }
    }

    private Optional<rhd_3> id_byte(rsq_3 rsq_32) {
        return rsq_32.SF().id_byte(il_3.id_extends).filter(this::id_class);
    }

    public rrI_2(int n) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.REGISTERED), il_3.id_final, (Object)((Object)iC_2.REGISTERED), il_3.id_new, (Object)((Object)iC_2.REGISTERED), il_3.id_extends, (Object)((Object)iC_2.VALUE_PRESENT)), n);
    }

    private boolean id_class(rsq_3 rsq_32, rhd_3 rhd_32) {
        rfH_2 rfH_22 = rhd_32.Bs();
        rfH_2 rfH_23 = rsq_32.Bs();
        return rfH_23.id_class(rfH_22, 5.0);
    }

    private boolean id_class(rhd_3 rhd_32) {
        return rhd_32.id_break(rLD.id_abstract);
    }

    @Override
    protected /* synthetic */ boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        return this.id_break(rrEm_12, (rsq_3)iB_22, l);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        if (!this.id_break(rsq_32)) {
            return false;
        }
        if (this.id_byte > 0) {
            --this.id_byte;
            return false;
        }
        return true;
    }

    private List<rdn_3> id_class(rsq_3 rsq_32) {
        if (rsq_32.n_()) {
            return ImmutableList.of((Object)new rdn_3(rdy_3.rd));
        }
        rsT_2 rsT_22 = rsq_32.su().id_break();
        if (id_class.containsKey(rsT_22)) {
            rzL_2 rzL_22 = ((rYB)rsq_32.id_throws[7]).id_const().o().id_class(id_class.get(rsT_22));
            rzP_2 rzP_22 = new rzP_2((rrEm_1)((rYB)rsq_32.id_throws[7])).id_class(rzQ_2.id_case, rsq_32.Ps()).id_class(rzQ_2.id_class, rsq_32).id_class(rsq_32.Sa());
            return rzL_22.id_class(rzP_22.id_class(rzz_3.id_catch));
        }
        return ImmutableList.of((Object)new rdn_3(rdy_3.hP));
    }

    private void id_class(rsq_3 rsq_32, iB_2 iB_22) {
        for (rdn_3 rdn_32 : this.id_class(rsq_32)) {
            iA_2.id_class((iB_2)rsq_32, rdn_32, iB_22.Ps());
        }
    }

    private static int id_class(rrEm_1 rrEm_12) {
        return 600 + rrEm_12.id_int.nextInt(6001);
    }

    protected void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        this.id_protected = false;
        this.id_throws = l;
        rhd_3 rhd_32 = this.id_byte(rsq_32).get();
        rsq_32.SF().id_class(il_3.id_new, rhd_32);
        iA_2.id_class((iB_2)rsq_32, (iB_2)rhd_32);
    }

    @Override
    protected /* synthetic */ void id_break(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_protected(rrEm_12, (rsq_3)iB_22, l);
    }

    protected boolean id_break(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        return this.id_break(rsq_32) && !this.id_protected;
    }

    private boolean id_break(rsq_3 rsq_32) {
        return this.id_byte(rsq_32).isPresent();
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rsq_3)iB_22, l);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        this.id_byte = rrI_2.id_class(rrEm_12);
        rsq_32.SF().id_break(il_3.id_new);
        rsq_32.SF().id_break(il_3.id_volatile);
        rsq_32.SF().id_break(il_3.id_final);
    }
}

