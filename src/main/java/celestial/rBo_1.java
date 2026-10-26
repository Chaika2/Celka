/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.iX_2;
import celestial.rBU;
import celestial.rRr_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rgU_2;
import celestial.rga_3;
import celestial.rjU_2;
import celestial.rjh_3;
import celestial.rrEm_1;
import celestial.rsq_3;
import java.util.List;
import java.util.stream.Collectors;

public class rBo_1
extends rBU {
    public rBo_1(aA_2 aA_22, double d) {
        super(aA_22, d, 240, false);
    }

    private rfH_2 id_class(rjh_3 rjh_32) {
        rrEm_1 rrEm_12 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
        rga_3 rga_32 = rrEm_12.d();
        List list = rga_32.id_byte(rRP2 -> true, rjh_32.id_int(), 8, rRr_1.IS_OCCUPIED).map(rgU_2::id_throws).collect(Collectors.toList());
        return list.isEmpty() ? null : (rfH_2)list.get(rrEm_12.id_int.nextInt(list.size()));
    }

    private boolean id_class(rsq_3 rsq_32) {
        return rsq_32.id_class(((rYB)this.id_class.id_throws[7]).r());
    }

    private rjU_2 id_finally() {
        return iX_2.id_break(this.id_class, 10, 7);
    }

    @Override
    protected rjU_2 id_catch() {
        rjU_2 rjU_22;
        float f = ((rYB)this.id_class.id_throws[7]).id_int.nextFloat();
        if (((rYB)this.id_class.id_throws[7]).id_int.nextFloat() < 0.3f) {
            return this.id_finally();
        }
        if (f < 0.7f) {
            rjU_22 = this.id_extends();
            if (rjU_22 == null) {
                rjU_22 = this.id_native();
            }
        } else {
            rjU_22 = this.id_native();
            if (rjU_22 == null) {
                rjU_22 = this.id_extends();
            }
        }
        return rjU_22 == null ? this.id_finally() : rjU_22;
    }

    private rjU_2 id_extends() {
        rrEm_1 rrEm_12 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
        List<rsq_3> list = rrEm_12.id_class(aI_2.D, this.id_class.rN().id_class(32.0), this::id_class);
        if (list.isEmpty()) {
            return null;
        }
        rsq_3 rsq_32 = list.get(((rYB)this.id_class.id_throws[7]).id_int.nextInt(list.size()));
        rjU_2 rjU_22 = rsq_32.Ps();
        return iX_2.id_class(this.id_class, 10, 7, rjU_22);
    }

    private rjh_3 id_volatile() {
        rrEm_1 rrEm_12 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
        List list = rjh_3.id_class(rjh_3.id_class(this.id_class), 2).filter(rjh_32 -> rrEm_12.id_break((rjh_3)rjh_32) == 0).collect(Collectors.toList());
        return list.isEmpty() ? null : (rjh_3)list.get(rrEm_12.id_int.nextInt(list.size()));
    }

    private rjU_2 id_native() {
        rjh_3 rjh_32 = this.id_volatile();
        if (rjh_32 == null) {
            return null;
        }
        rfH_2 rfH_22 = this.id_class(rjh_32);
        return rfH_22 == null ? null : iX_2.id_class(this.id_class, 10, 7, rjU_2.id_protected(rfH_22));
    }
}

