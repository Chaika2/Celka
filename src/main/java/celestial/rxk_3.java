/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rSK;
import celestial.rSe_1;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjU_2;
import celestial.rjs_3;
import celestial.rlB_2;
import celestial.rpJ_2;
import celestial.rpm_3;
import celestial.rrTR;
import celestial.rym_3;
import java.util.List;
import java.util.function.Predicate;

public class rxk_3
extends rdb_3 {
    private static final Predicate<an_3> id_class = rpJ_2.id_catch.and(an_3::rY);
    private final rSe_1 id_break;

    public rxk_3(rSe_1 rSe_12, rdO_2 rdO_22) {
        super(rdO_22);
        this.id_break = rSe_12;
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rrTR rrTR2;
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rff_3 rff_32 = rxk_3.id_class(rYB2, rhd_32, rjs_3.ANY);
        if (((rjG_2)rff_32).id_byte() == rjM_2.MISS) {
            return rym_3.id_byte(rdn_32);
        }
        rjU_2 rjU_22 = rhd_32.id_break(1.0f);
        double d = 5.0;
        List<an_3> list = rYB2.id_break((an_3)rhd_32, rhd_32.rN().id_break(rjU_22.id_class(5.0)).id_class(1.0), id_class);
        if (!list.isEmpty()) {
            rrTR2 = rhd_32.id_new(1.0f);
            for (an_3 an_32 : list) {
                rfl_3 rfl_32 = an_32.rN().id_class(an_32.f());
                if (!rfl_32.id_case((rjU_2)rrTR2)) continue;
                return rym_3.id_byte(rdn_32);
            }
        }
        if (((rjG_2)rff_32).id_byte() == rjM_2.BLOCK) {
            rrTR2 = new rSK(rYB2, rff_32.id_case().id_break, rff_32.id_case().id_byte, rff_32.id_case().id_protected);
            ((rSK)rrTR2).id_class(this.id_break);
            Float f = Float.valueOf(((Float)rhd_32.id_throws[15]).floatValue());
            ((rSK)rrTR2).id_throws[15] = f;
            if (!rYB2.a_((an_3)rrTR2, ((an_3)rrTR2).rN().id_class(-0.1))) {
                return rym_3.id_protected(rdn_32);
            }
            if (!rYB2.id_continue) {
                rYB2.a_((an_3)rrTR2);
                if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    rdn_32.id_catch(1);
                }
            }
            rhd_32.id_class(rlB_2.id_byte.id_break(this));
            return rym_3.id_class(rdn_32, rYB2.id_import());
        }
        return rym_3.id_byte(rdn_32);
    }
}

