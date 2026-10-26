/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.UT;
import celestial.Uy_1;
import celestial.dQ_2;
import celestial.ek_3;
import celestial.rHC;
import celestial.rHl_1;
import celestial.rHt_1;
import celestial.rRq_1;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.ryO_2;

public class dZ_2
extends dQ_2 {
    private static final UT id_package = new Uy_1();

    public dZ_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    protected UT id_class(rdn_3 rdn_32) {
        return id_package;
    }

    @Override
    protected void id_class(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        ek_3 ek_32 = new ek_3(rrEm_12, rfH_22);
        rHC rHC2 = (rHC)ek_32.id_case();
        int n = rHC2.id_catch();
        if (n < 0) {
            rrEm_12.id_byte(1001, rfH_22, 0);
        } else {
            rdn_3 rdn_32 = rHC2.id_extends(n);
            if (!rdn_32.id_class()) {
                rdn_3 rdn_33;
                rpr_3 rpr_32 = rrEm_12.id_byte(rfH_22).id_byte(id_volatile);
                rXu_1 rXu_12 = rHt_1.id_class(rrEm_12, rfH_22.id_break(rpr_32));
                if (rXu_12 == null) {
                    rdn_33 = id_package.dispense(ek_32, rdn_32);
                } else {
                    rdn_33 = rHt_1.id_class((rXu_1)rHC2, rXu_12, rdn_32.id_implements().id_class(1), rpr_32.id_case());
                    if (rdn_33.id_class()) {
                        rdn_33 = rdn_32.id_implements();
                        rdn_33.id_catch(1);
                    } else {
                        rdn_33 = rdn_32.id_implements();
                    }
                }
                rHC2.id_break(n, rdn_33);
            }
        }
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHl_1();
    }
}

