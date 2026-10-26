/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iO_2;
import celestial.rSY;
import celestial.rYB;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rjO_2;
import celestial.rjU_2;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.ryZ_2;
import java.util.Random;

public class rxG_2
extends rdb_3 {
    public rxG_2(rdO_2 rdO_22) {
        super(rdO_22);
    }

    private void id_class(rSY rSY2, Random random) {
        rjO_2 rjO_22 = rSY2.id_final();
        float f = random.nextFloat() * 5.0f;
        float f2 = random.nextFloat() * 20.0f - 10.0f;
        rjO_2 rjO_23 = new rjO_2(rjO_22.id_break() + f, rjO_22.id_byte() + f2, rjO_22.id_protected());
        rSY2.id_class(rjO_23);
        rjO_22 = rSY2.id_package();
        f = random.nextFloat() * 10.0f - 5.0f;
        rjO_23 = new rjO_2(rjO_22.id_break(), rjO_22.id_byte() + f, rjO_22.id_protected());
        rSY2.id_break(rjO_23);
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rpr_3 rpr_32 = rdH_22.id_finally();
        if (rpr_32 == rpr_3.DOWN) {
            return ryZ_2.FAIL;
        }
        rYB rYB2 = rdH_22.id_int();
        rxx_3 rxx_32 = new rxx_3(rdH_22);
        rfH_2 rfH_22 = rxx_32.id_class();
        rdn_3 rdn_32 = rdH_22.id_volatile();
        rjU_2 rjU_22 = rjU_2.id_protected(rfH_22);
        rfl_3 rfl_32 = aI_2.id_break.id_volatile().id_class(rjU_22.id_class(), rjU_22.id_break(), rjU_22.id_byte());
        if (rYB2.a_(null, rfl_32, an_32 -> true) && rYB2.id_class((an_3)null, rfl_32).isEmpty()) {
            if (rYB2 instanceof rrEm_1) {
                rrEm_1 rrEm_12 = (rrEm_1)rYB2;
                rSY rSY2 = aI_2.id_break.id_break(rrEm_12, rdn_32.id_package(), null, rdH_22.id_final(), rfH_22, iO_2.SPAWN_EGG, true, true);
                if (rSY2 == null) {
                    return ryZ_2.FAIL;
                }
                rrEm_12.id_class((an_3)rSY2);
                float f = (float)rfU_2.id_protected((rfU_2.id_catch(rdH_22.id_private() - 180.0f) + 22.5f) / 45.0f) * 45.0f;
                rSY2.id_class(rSY2.rx(), rSY2.re(), rSY2.BO(), f, 0.0f);
                this.id_class(rSY2, rYB2.id_int);
                rYB2.a_(rSY2);
                rYB2.id_class((rhd_3)null, rSY2.rx(), rSY2.re(), rSY2.BO(), rqn_3.P, rqL_2.BLOCKS, 0.75f, 0.8f);
            }
            rdn_32.id_catch(1);
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return ryZ_2.FAIL;
    }
}

