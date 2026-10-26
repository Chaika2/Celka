/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.dO_2;
import celestial.eX_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rXA;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfI_2;
import celestial.rfw_3;
import celestial.rrEm_1;
import celestial.rsq_3;
import celestial.rxW_2;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rrX_2
extends rPm_1<rsq_3> {
    private long id_class;
    private long id_byte;
    private int id_protected;
    private Optional<rfH_2> id_throws = Optional.empty();

    @Override
    protected void id_byte(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        rsq_32.id_class(rXQ.MAINHAND, rdn_3.id_break);
        this.id_byte = ((Integer)rsq_32.id_throws[41]).intValue();
    }

    @Override
    protected /* synthetic */ void id_byte(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_protected(rrEm_12, (rsq_3)iB_22, l);
    }

    public rrX_2() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_final, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT)));
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        return this.id_protected < 80 && this.id_throws.isPresent();
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        if ((Integer)rsq_32.id_throws[41] % 10 == 0 && (this.id_byte == 0L || this.id_byte + 160L <= (long)((Integer)rsq_32.id_throws[41]).intValue())) {
            if (rsq_32.sd().id_class(rdy_3.Xg) <= 0) {
                return false;
            }
            this.id_throws = this.id_break(rrEm_12, rsq_32);
            return this.id_throws.isPresent();
        }
        return false;
    }

    private boolean id_class(rfH_2 rfH_22, rrEm_1 rrEm_12) {
        xc_3 xc_32 = rrEm_12.id_byte(rfH_22);
        xd_3 xd_32 = xc_32.id_break();
        return xd_32 instanceof dO_2 && !((dO_2)xd_32).id_implements(xc_32);
    }

    private void id_class(rsq_3 rsq_32) {
        this.id_throws.ifPresent(rfH_22 -> {
            rfI_2 rfI_22 = new rfI_2((rfH_2)rfH_22);
            rsq_32.SF().id_class(il_3.id_final, rfI_22);
            rsq_32.SF().id_class(il_3.id_volatile, new iH_2(rfI_22, 0.5f, 1));
        });
    }

    private Optional<rfH_2> id_break(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        rfw_3 rfw_32 = new rfw_3();
        Optional<rfH_2> optional = Optional.empty();
        int n = 0;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    rfw_32.id_class(rsq_32.Bs(), i, j, k);
                    if (!this.id_class(rfw_32, rrEm_12) || rrEm_12.id_int.nextInt(++n) != 0) continue;
                    optional = Optional.of(rfw_32.id_int());
                }
            }
        }
        return optional;
    }

    @Override
    protected /* synthetic */ void id_break(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_byte(rrEm_12, (rsq_3)iB_22, l);
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        this.id_class(rsq_32);
        rsq_32.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.Xg));
        this.id_class = l;
        this.id_protected = 0;
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_break(rrEm_12, (rsq_3)iB_22, l);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        rfH_2 rfH_22 = this.id_throws.get();
        if (l >= this.id_class && rfH_22.id_class((eX_2)rsq_32.Ps(), 1.0)) {
            rdn_3 rdn_32 = rdn_3.id_break;
            rXA rXA2 = rsq_32.sd();
            int n = rXA2.id_else();
            for (int i = 0; i < n; ++i) {
                rdn_3 rdn_33 = rXA2.id_extends(i);
                if (rdn_33.id_break() != rdy_3.Xg) continue;
                rdn_32 = rdn_33;
                break;
            }
            if (!rdn_32.id_class() && rxW_2.id_class(rdn_32, rrEm_12, rfH_22)) {
                rrEm_12.id_byte(2005, rfH_22, 0);
                this.id_throws = this.id_break(rrEm_12, rsq_32);
                this.id_class(rsq_32);
                this.id_class = l + 40L;
            }
            ++this.id_protected;
        }
    }
}

