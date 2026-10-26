/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.iM_2;
import celestial.is_3;
import celestial.rFJ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rls_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqn_3;
import celestial.rsS_2;
import celestial.ruS_2;
import celestial.ryZ_2;
import java.util.List;

public class rsM_2
extends rsS_2 {
    public rsM_2(aI_2<? extends rsM_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rsS_2>)aI_22, rYB2);
    }

    public rsM_2(rYB rYB2, rfH_2 rfH_22) {
        super(aI_2.id_strictfp, rYB2, rfH_22);
        this.id_new((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5);
        float f = 0.125f;
        float f2 = 0.1875f;
        float f3 = 0.25f;
        this.id_class(new rfl_3(this.rx() - 0.1875, this.re() - 0.25 + 0.125, this.BO() - 0.1875, this.rx() + 0.1875, this.re() + 0.25 + 0.125, this.BO() + 0.1875));
        Boolean bl = true;
        this.id_throws[6] = bl;
    }

    @Override
    public void id_class(an_3 an_32) {
        this.id_class(rqn_3.GE, 1.0f, 1.0f);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
    }

    @Override
    public boolean id_class(double d) {
        return d < 1024.0;
    }

    @Override
    public ryZ_2 id_class(rhd_3 rhd_32, rpm_3 rpm_32) {
        if (((rYB)this.id_throws[7]).id_continue) {
            return ryZ_2.SUCCESS;
        }
        boolean bl = false;
        double d = 7.0;
        List<is_3> list = ((rYB)this.id_throws[7]).id_class(is_3.class, new rfl_3(this.rx() - 7.0, this.re() - 7.0, this.BO() - 7.0, this.rx() + 7.0, this.re() + 7.0, this.BO() + 7.0));
        for (is_3 is_32 : list) {
            if (is_32.N() != rhd_32) continue;
            is_32.id_break(this, true);
            bl = true;
        }
        if (!bl) {
            this.PD();
            if (((rhx_3)rhd_32.id_implements[18]).id_protected) {
                for (is_3 is_32 : list) {
                    if (!is_32.z() || is_32.N() != this) continue;
                    is_32.id_class(true, false);
                }
            }
        }
        return ryZ_2.CONSUME;
    }

    public static rsM_2 id_class(rYB rYB2, rfH_2 rfH_22) {
        int n = rfH_22.b_();
        int n2 = rfH_22.c_();
        int n3 = rfH_22.d_();
        for (rsM_2 rsM_22 : rYB2.id_class(rsM_2.class, new rfl_3((double)n - 1.0, (double)n2 - 1.0, (double)n3 - 1.0, (double)n + 1.0, (double)n2 + 1.0, (double)n3 + 1.0))) {
            if (!rsM_22.id_implements().equals(rfH_22)) continue;
            return rsM_22;
        }
        rsM_2 rsM_23 = new rsM_2(rYB2, rfH_22);
        rYB2.a_(rsM_23);
        rsM_23.id_private();
        return rsM_23;
    }

    @Override
    public rjU_2 id_class(float f) {
        return this.id_finally(f).id_break(0.0, 0.2, 0.0);
    }

    @Override
    public void id_class(rpr_3 rpr_32) {
    }

    @Override
    protected float id_class(iM_2 iM_22, ap_3 ap_32) {
        return -0.0625f;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
    }

    @Override
    public boolean id_throws() {
        return ((rYB)this.id_throws[7]).id_byte(this.id_break).id_break().id_class(rls_3.id_default);
    }

    @Override
    public int id_catch() {
        return 9;
    }

    @Override
    public int id_case() {
        return 9;
    }

    @Override
    public void id_new(double d, double d2, double d3) {
        super.id_new((double)rfU_2.id_byte(d) + 0.5, (double)rfU_2.id_byte(d2) + 0.5, (double)rfU_2.id_byte(d3) + 0.5);
    }

    @Override
    protected void id_protected() {
        this.id_volatile((double)this.id_break.b_() + 0.5, (double)this.id_break.c_() + 0.5, (double)this.id_break.d_() + 0.5);
    }

    @Override
    public void id_private() {
        this.id_class(rqn_3.GG, 1.0f, 1.0f);
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this, this.BC(), 0, this.id_implements());
    }
}

