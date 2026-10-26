/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.aw_3;
import celestial.iO_2;
import celestial.rRP;
import celestial.rRr_1;
import celestial.rRu_1;
import celestial.rbf_3;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rhN_2;
import celestial.rrEj_1;
import celestial.rrEm_1;
import celestial.rrEq_1;
import celestial.rrrZ;
import java.util.List;
import java.util.Random;

public class rrEp_1
implements rrEq_1 {
    private int id_class;

    private int id_class(rfH_2 rfH_22, rrEm_1 rrEm_12) {
        rbf_3 rbf_32 = aI_2.id_private.id_class(rrEm_12);
        if (rbf_32 == null) {
            return 0;
        }
        rbf_32.id_class(rrEm_12, rrEm_12.id_throws(rfH_22), iO_2.NATURAL, (aU_2)null, (rcd_3)null);
        rbf_32.id_class(rfH_22, 0.0f, 0.0f);
        rrEm_12.id_class((an_3)rbf_32);
        return 1;
    }

    private int id_class(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        List<rbf_3> list;
        int n = 48;
        if (rrEm_12.d().id_class(rRP.id_continue.id_break(), rfH_22, 48, rRr_1.IS_OCCUPIED) > 4L && (list = rrEm_12.id_class(rbf_3.class, new rfl_3(rfH_22).id_byte(48.0, 8.0, 48.0))).size() < 5) {
            return this.id_class(rfH_22, rrEm_12);
        }
        return 0;
    }

    @Override
    public int id_class(rrEm_1 rrEm_12, boolean bl, boolean bl2) {
        if (bl2 && rrEm_12.B().id_break(rRu_1.id_protected)) {
            --this.id_class;
            if (this.id_class > 0) {
                return 0;
            }
            this.id_class = 1200;
            rhN_2 rhN_22 = rrEm_12.id_this();
            if (rhN_22 == null) {
                return 0;
            }
            Random random = rrEm_12.id_int;
            int n = (8 + random.nextInt(24)) * (random.nextBoolean() ? -1 : 1);
            int n2 = (8 + random.nextInt(24)) * (random.nextBoolean() ? -1 : 1);
            rfH_2 rfH_22 = rhN_22.Bs().id_break(n, 0, n2);
            if (!rrEm_12.id_class(rfH_22.b_() - 10, rfH_22.c_() - 10, rfH_22.d_() - 10, rfH_22.b_() + 10, rfH_22.c_() + 10, rfH_22.d_() + 10)) {
                return 0;
            }
            if (rrEj_1.id_class(aw_3.ON_GROUND, rrEm_12, rfH_22, aI_2.id_private)) {
                if (rrEm_12.id_byte(rfH_22, 2)) {
                    return this.id_class(rrEm_12, rfH_22);
                }
                if (rrEm_12.id_protected().id_class(rfH_22, true, rrrZ.id_finally).id_throws()) {
                    return this.id_break(rrEm_12, rfH_22);
                }
            }
            return 0;
        }
        return 0;
    }

    private int id_break(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        int n = 16;
        List<rbf_3> list = rrEm_12.id_class(rbf_3.class, new rfl_3(rfH_22).id_byte(16.0, 8.0, 16.0));
        return list.size() < 1 ? this.id_class(rfH_22, rrEm_12) : 0;
    }
}

