/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rJr_1;
import celestial.rPm_1;
import celestial.rfY_2;
import celestial.rhd_3;
import celestial.rrEm_1;
import celestial.rsq_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rPv_1
extends rPm_1<rsq_3> {
    private final float id_class;

    @Override
    protected void id_byte(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        iZ_2<rsq_3> iZ_22 = rsq_32.SF();
        iZ_22.id_break(il_3.id_volatile);
        iZ_22.id_break(il_3.id_final);
    }

    @Override
    protected /* synthetic */ void id_byte(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_protected(rrEm_12, (rsq_3)iB_22, l);
    }

    public rPv_1(float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.REGISTERED), il_3.id_final, (Object)((Object)iC_2.REGISTERED)), Integer.MAX_VALUE);
        this.id_class = f;
    }

    private void id_class(rsq_3 rsq_32) {
        iZ_2<rsq_3> iZ_22 = rsq_32.SF();
        iZ_22.id_class(il_3.id_volatile, new iH_2(new rfY_2(rsq_32.id_class(), false), this.id_class, 2));
        iZ_22.id_class(il_3.id_final, new rfY_2(rsq_32.id_class(), true));
    }

    @Override
    protected boolean id_class(long l) {
        return false;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        rhd_3 rhd_32 = rsq_32.id_class();
        return rsq_32.BM() && rhd_32 != null && !rsq_32.rT() && (Boolean)rsq_32.id_throws[25] == false && rsq_32.id_int(rhd_32) <= 16.0 && (rJr_1)rhd_32.id_implements[4] != null;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        return this.id_class(rrEm_12, rsq_32);
    }

    @Override
    protected /* synthetic */ void id_break(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_byte(rrEm_12, (rsq_3)iB_22, l);
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        this.id_class(rsq_32);
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_break(rrEm_12, (rsq_3)iB_22, l);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        this.id_class(rsq_32);
    }
}

