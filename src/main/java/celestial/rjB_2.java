/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjS_2;
import celestial.rjU_2;
import celestial.rjm_3;
import celestial.rjs_3;
import celestial.rjw_3;
import celestial.xc_3;
import java.util.function.Predicate;

public class rjB_2 {
    private final rjU_2 id_class;
    private final rjU_2 id_break;
    private final rjS_2 id_byte;
    private final rjs_3 id_protected;
    private final rjm_3 id_throws;
    private Predicate<xc_3> id_case = xc_32 -> true;

    public rjS_2 id_byte() {
        return this.id_byte;
    }

    public rjB_2(rjU_2 rjU_22, rjU_2 rjU_23, rjS_2 rjS_22, rjs_3 rjs_32, an_3 an_32) {
        this.id_class = rjU_22;
        this.id_break = rjU_23;
        this.id_byte = rjS_22;
        this.id_protected = rjs_32;
        this.id_throws = rjm_3.id_class(an_32);
    }

    public rjC_2 id_class(rXE rXE2, rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_protected.id_class(rXE2) ? rXE2.id_protected(rRq_12, rfH_22) : rjw_3.id_class();
    }

    public void id_class(Predicate<xc_3> predicate) {
        this.id_case = predicate;
    }

    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        if (this.id_case != null && !this.id_case.test(xc_32)) {
            return rjw_3.id_class();
        }
        return this.id_byte.get(xc_32, rRq_12, rfH_22, this.id_throws);
    }

    public rjU_2 id_class() {
        return this.id_break;
    }

    public rjU_2 id_break() {
        return this.id_class;
    }
}

