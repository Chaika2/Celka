/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Uq_1;
import celestial.Uy_1;
import celestial.dQ_2;
import celestial.eX_2;
import celestial.rdn_3;
import celestial.rhR_2;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.rrEm_1;
import java.util.Random;

public class Ug_1
extends Uy_1 {
    @Override
    protected void id_class(Uq_1 uq_1) {
        uq_1.id_catch().id_byte(1018, uq_1.id_protected(), 0);
    }

    @Override
    public rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        rpr_3 rpr_32 = uq_1.id_throws().id_byte(dQ_2.id_volatile);
        eX_2 eX_22 = dQ_2.id_class(uq_1);
        double d = eX_22.id_class() + (double)((float)rpr_32.id_implements() * 0.3f);
        double d2 = eX_22.id_break() + (double)((float)rpr_32.id_finally() * 0.3f);
        double d3 = eX_22.id_byte() + (double)((float)rpr_32.id_extends() * 0.3f);
        rrEm_1 rrEm_12 = uq_1.id_catch();
        Random random = rrEm_12.id_int;
        double d4 = random.nextGaussian() * 0.05 + (double)rpr_32.id_implements();
        double d5 = random.nextGaussian() * 0.05 + (double)rpr_32.id_finally();
        double d6 = random.nextGaussian() * 0.05 + (double)rpr_32.id_extends();
        rrEm_12.a_(rqR_2.id_class(new rhR_2(rrEm_12, d, d2, d3, d4, d5, d6), (T rhR_22) -> rhR_22.id_break(rdn_32)));
        rdn_32.id_catch(1);
        return rdn_32;
    }
}

