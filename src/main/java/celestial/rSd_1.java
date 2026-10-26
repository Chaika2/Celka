/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.iX_2;
import celestial.kZ_2;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rls_3;
import celestial.rpr_3;
import celestial.xd_3;

public class rSd_1
extends rSk_1 {
    public rSd_1(aA_2 aA_22, double d) {
        super(aA_22, d);
    }

    private rjU_2 id_finally() {
        rfH_2 rfH_22 = this.id_class.Bs();
        rfw_3 rfw_32 = new rfw_3();
        rfw_3 rfw_33 = new rfw_3();
        for (rfH_2 rfH_23 : rfH_2.id_break(rfU_2.id_byte(this.id_class.rx() - 3.0), rfU_2.id_byte(this.id_class.re() - 6.0), rfU_2.id_byte(this.id_class.BO() - 3.0), rfU_2.id_byte(this.id_class.rx() + 3.0), rfU_2.id_byte(this.id_class.re() + 6.0), rfU_2.id_byte(this.id_class.BO() + 3.0))) {
            xd_3 xd_32;
            boolean bl;
            if (rfH_22.equals(rfH_23) || !(bl = (xd_32 = ((rYB)this.id_class.id_throws[7]).id_byte(rfw_33.id_class((rja_3)rfH_23, rpr_3.DOWN)).id_break()) instanceof kZ_2 || xd_32.id_class(rls_3.id_super)) || !((rYB)this.id_class.id_throws[7]).id_finally(rfH_23) || !((rYB)this.id_class.id_throws[7]).id_finally(rfw_32.id_class((rja_3)rfH_23, rpr_3.UP))) continue;
            return rjU_2.id_protected(rfH_23);
        }
        return null;
    }

    @Override
    protected rjU_2 id_catch() {
        rjU_2 rjU_22 = null;
        if (this.id_class.rT()) {
            rjU_22 = iX_2.id_break(this.id_class, 15, 15);
        }
        if (this.id_class.Sa().nextFloat() >= this.id_private) {
            rjU_22 = this.id_finally();
        }
        return rjU_22 == null ? super.id_catch() : rjU_22;
    }
}

