/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.eA_2;
import celestial.iO_2;
import celestial.rBk_1;
import celestial.rGL;
import celestial.rOD;
import celestial.rRh_1;
import celestial.rSg_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhG_2;
import celestial.rrEm_1;

public class rSJ
extends rBk_1 {
    private final rhG_2 id_class;

    public rSJ(rhG_2 rhG_22) {
        this.id_class = rhG_22;
    }

    private rOD id_class(rRh_1 rRh_12) {
        rhG_2 rhG_22 = aI_2.n.id_class((rYB)this.id_class.id_throws[7]);
        rhG_22.id_class((rrEm_1)((rYB)this.id_class.id_throws[7]), rRh_12, iO_2.TRIGGERED, (aU_2)null, (rcd_3)null);
        rhG_22.id_new(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
        Integer n = 60;
        rhG_22.id_throws[47] = n;
        rhG_22.b();
        rhG_22.id_else(true);
        rhG_22.e_(0);
        return rhG_22;
    }

    private rGL id_class(rRh_1 rRh_12, rOD rOD2) {
        rGL rGL2 = aI_2.A.id_class((rYB)rOD2.id_throws[7]);
        rGL2.id_class((rrEm_1)((rYB)rOD2.id_throws[7]), rRh_12, iO_2.TRIGGERED, (aU_2)null, (rcd_3)null);
        rGL2.id_new(rOD2.rx(), rOD2.re(), rOD2.BO());
        Integer n = 60;
        rGL2.id_throws[47] = n;
        rGL2.b();
        if (rGL2.id_class(rXQ.HEAD).id_class()) {
            rGL2.id_class(rXQ.HEAD, new rdn_3(rdy_3.hJ));
        }
        rGL2.id_class(rXQ.MAINHAND, eA_2.id_class(rGL2.Sa(), this.id_class(rGL2.ss()), (int)(5.0f + rRh_12.id_byte() * (float)rGL2.Sa().nextInt(18)), false));
        rGL2.id_class(rXQ.HEAD, eA_2.id_class(rGL2.Sa(), this.id_class(rGL2.id_class(rXQ.HEAD)), (int)(5.0f + rRh_12.id_byte() * (float)rGL2.Sa().nextInt(18)), false));
        return rGL2;
    }

    private rdn_3 id_class(rdn_3 rdn_32) {
        rdn_32.id_byte("Enchantments");
        return rdn_32;
    }

    @Override
    public boolean id_class() {
        return ((rYB)this.id_class.id_throws[7]).id_class(this.id_class.rx(), this.id_class.re(), this.id_class.BO(), 10.0);
    }

    @Override
    public void id_throws() {
        rrEm_1 rrEm_12 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
        rRh_1 rRh_12 = rrEm_12.id_throws(this.id_class.Bs());
        this.id_class.id_this(false);
        this.id_class.id_else(true);
        this.id_class.e_(0);
        rSg_1 rSg_12 = aI_2.id_boolean.id_class(rrEm_12);
        rSg_12.id_private(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
        rSg_12.id_class(true);
        rrEm_12.a_(rSg_12);
        rGL rGL2 = this.id_class(rRh_12, this.id_class);
        rGL2.id_this(this.id_class);
        rrEm_12.id_class((an_3)rGL2);
        for (int i = 0; i < 3; ++i) {
            rOD rOD2 = this.id_class(rRh_12);
            rGL rGL3 = this.id_class(rRh_12, rOD2);
            rGL3.id_this(rOD2);
            rOD2.id_implements(this.id_class.Sa().nextGaussian() * 0.5, 0.0, this.id_class.Sa().nextGaussian() * 0.5);
            rrEm_12.id_class((an_3)rOD2);
        }
    }
}

