/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCZ;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rfH_2;
import celestial.rrEm_1;
import celestial.ryO_2;
import celestial.ryw_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Set;
import java.util.function.Predicate;

public class Rd_1
implements Predicate<ryw_3> {
    private final xc_3 id_class;
    private final Set<rCZ<?>> id_break;
    private final rcd_3 id_byte;

    public Rd_1(xc_3 xc_32, Set<rCZ<?>> set, rcd_3 rcd_32) {
        this.id_class = xc_32;
        this.id_break = set;
        this.id_byte = rcd_32;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((ryw_3)object);
    }

    public xc_3 id_class() {
        return this.id_class;
    }

    public boolean id_class(rrEm_1 rrEm_12, rfH_2 rfH_22, int n) {
        ryO_2 ryO_22;
        xc_3 xc_32 = xd_3.id_break(this.id_class, rrEm_12, rfH_22);
        if (xc_32.id_catch()) {
            xc_32 = this.id_class;
        }
        if (!rrEm_12.id_class(rfH_22, xc_32, n)) {
            return false;
        }
        if (this.id_byte != null && (ryO_22 = rrEm_12.id_class(rfH_22)) != null) {
            rcd_3 rcd_32 = this.id_byte.id_catch();
            rcd_32.id_break("x", rfH_22.b_());
            rcd_32.id_break("y", rfH_22.c_());
            rcd_32.id_break("z", rfH_22.d_());
            ryO_22.id_class(xc_32, rcd_32);
        }
        return true;
    }

    public boolean id_class(ryw_3 ryw_32) {
        xc_3 xc_32 = ryw_32.id_class();
        if (!xc_32.id_class(this.id_class.id_break())) {
            return false;
        }
        for (rCZ<?> rCZ2 : this.id_break) {
            if (xc_32.id_byte(rCZ2) == this.id_class.id_byte(rCZ2)) continue;
            return false;
        }
        if (this.id_byte == null) {
            return true;
        }
        ryO_2 ryO_22 = ryw_32.id_break();
        return ryO_22 != null && rco_3.id_class(this.id_byte, ryO_22.id_class(new rcd_3()), true);
    }
}

