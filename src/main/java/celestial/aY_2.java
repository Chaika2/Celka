/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aa_3;
import celestial.iB_2;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rhf_3;
import celestial.rhj_3;
import celestial.rjU_2;
import celestial.rjY_2;
import celestial.rje_3;
import celestial.rpm_3;
import celestial.rqn_3;
import celestial.rxm_3;

public interface aY_2
extends aa_3 {
    default public void id_class(iB_2 iB_22, iB_2 iB_23, rhf_3 rhf_32, float f, float f2) {
        double d = iB_23.rx() - iB_22.rx();
        double d2 = iB_23.BO() - iB_22.BO();
        double d3 = rfU_2.id_class(d * d + d2 * d2);
        double d4 = iB_23.id_byte(0.3333333333333333) - rhf_32.re() + d3 * (double)0.2f;
        rje_3 rje_32 = this.id_class(iB_22, new rjU_2(d, d4, d2), f);
        rhf_32.id_byte(rje_32.id_class(), rje_32.id_break(), rje_32.id_byte(), f2, 14 - ((rYB)iB_22.id_throws[7]).id_abstract().id_class() * 4);
        iB_22.id_class(rqn_3.PH, 1.0f, 1.0f / (iB_22.Sa().nextFloat() * 0.4f + 0.8f));
    }

    default public void id_class(iB_2 iB_22, float f) {
        rpm_3 rpm_32 = rhj_3.id_class(iB_22, rdy_3.kU);
        rdn_3 rdn_32 = iB_22.id_protected(rpm_32);
        if (iB_22.id_class(rdy_3.kU)) {
            rxm_3.id_class((rYB)iB_22.id_throws[7], iB_22, rpm_32, rdn_32, f, 14 - ((rYB)iB_22.id_throws[7]).id_abstract().id_class() * 4);
        }
        this.id_class();
    }

    default public rje_3 id_class(iB_2 iB_22, rjU_2 rjU_22, float f) {
        rjU_2 rjU_23 = rjU_22.id_protected();
        rjU_2 rjU_24 = rjU_23.id_byte(new rjU_2(0.0, 1.0, 0.0));
        if (rjU_24.id_catch() <= 1.0E-7) {
            rjU_24 = rjU_23.id_byte(iB_22.id_continue(1.0f));
        }
        rjY_2 rjY_22 = new rjY_2(new rje_3(rjU_24), 90.0f, true);
        rje_3 rje_32 = new rje_3(rjU_23);
        rje_32.id_class(rjY_22);
        rjY_2 rjY_23 = new rjY_2(rje_32, f, true);
        rje_3 rje_33 = new rje_3(rjU_23);
        rje_33.id_class(rjY_23);
        return rje_33;
    }

    public void id_class();

    public void id_class(iB_2 var1, rdn_3 var2, rhf_3 var3, float var4);

    public void id_break(boolean var1);

    public iB_2 I_();
}

