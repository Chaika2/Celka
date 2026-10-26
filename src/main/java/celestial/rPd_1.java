/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.aI_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rXQ;
import celestial.rdI_2;
import celestial.rdn_3;
import celestial.rfY_2;
import celestial.rrEm_1;
import celestial.rsq_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;

public class rPd_1
extends rPm_1<rsq_3> {
    private rdn_3 id_class;
    private final List<rdn_3> id_byte = Lists.newArrayList();
    private int id_protected;
    private int id_throws;
    private int id_case;

    private iB_2 id_byte(rsq_3 rsq_32) {
        iZ_2<rsq_3> iZ_22 = rsq_32.SF();
        iB_2 iB_22 = iZ_22.id_byte(il_3.id_new).get();
        iZ_22.id_class(il_3.id_final, new rfY_2(iB_22, true));
        return iB_22;
    }

    @Override
    public void id_byte(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        iB_2 iB_22 = this.id_byte(rsq_32);
        this.id_class(iB_22, rsq_32);
        if (!this.id_byte.isEmpty()) {
            this.id_protected(rsq_32);
        } else {
            rsq_32.id_class(rXQ.MAINHAND, rdn_3.id_break);
            this.id_case = Math.min(this.id_case, 40);
        }
        --this.id_case;
    }

    public rPd_1(int n, int n2) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_new, (Object)((Object)iC_2.VALUE_PRESENT)), n, n2);
    }

    private void id_class(rsq_3 rsq_32) {
        rsq_32.id_class(rXQ.MAINHAND, this.id_byte.get(0));
    }

    private boolean id_class(rdI_2 rdI_22) {
        return rdn_3.id_byte(this.id_class, rdI_22.id_break()) || rdn_3.id_byte(this.id_class, rdI_22.id_byte());
    }

    @Override
    public boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        iZ_2<rsq_3> iZ_22 = rsq_32.SF();
        if (!iZ_22.id_byte(il_3.id_new).isPresent()) {
            return false;
        }
        iB_2 iB_22 = iZ_22.id_byte(il_3.id_new).get();
        return iB_22.BC() == aI_2.rM && rsq_32.BM() && iB_22.BM() && !rsq_32.n_() && rsq_32.id_int(iB_22) <= 17.0;
    }

    @Override
    public boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        return this.id_class(rrEm_12, rsq_32) && this.id_case > 0 && rsq_32.SF().id_byte(il_3.id_new).isPresent();
    }

    private void id_class(iB_2 iB_22, rsq_3 rsq_32) {
        boolean bl = false;
        rdn_3 rdn_32 = iB_22.ss();
        if (this.id_class == null || !rdn_3.id_byte(this.id_class, rdn_32)) {
            this.id_class = rdn_32;
            bl = true;
            this.id_byte.clear();
        }
        if (bl && !this.id_class.id_class()) {
            this.id_break(rsq_32);
            if (!this.id_byte.isEmpty()) {
                this.id_case = 900;
                this.id_class(rsq_32);
            }
        }
    }

    @Override
    public /* synthetic */ void id_break(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_protected(rrEm_12, (rsq_3)iB_22, l);
    }

    private void id_break(rsq_3 rsq_32) {
        for (rdI_2 rdI_22 : rsq_32.id_break()) {
            if (rdI_22.id_int() || !this.id_class(rdI_22)) continue;
            this.id_byte.add(rdI_22.id_protected());
        }
    }

    @Override
    public void id_break(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        super.id_protected(rrEm_12, rsq_32, l);
        this.id_byte(rsq_32);
        this.id_protected = 0;
        this.id_throws = 0;
        this.id_case = 40;
    }

    @Override
    public /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_break(rrEm_12, (rsq_3)iB_22, l);
    }

    @Override
    public void id_protected(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        super.id_break(rrEm_12, rsq_32, l);
        rsq_32.SF().id_break(il_3.id_new);
        rsq_32.id_class(rXQ.MAINHAND, rdn_3.id_break);
        this.id_class = null;
    }

    private void id_protected(rsq_3 rsq_32) {
        if (this.id_byte.size() >= 2 && ++this.id_protected >= 40) {
            ++this.id_throws;
            this.id_protected = 0;
            if (this.id_throws > this.id_byte.size() - 1) {
                this.id_throws = 0;
            }
            rsq_32.id_class(rXQ.MAINHAND, this.id_byte.get(this.id_throws));
        }
    }
}

