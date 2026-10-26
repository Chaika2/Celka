/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.YO;
import celestial.rcZ_2;
import celestial.rcd_3;
import java.util.List;
import java.util.function.Supplier;

public class Yx_1
implements YO {
    private final String id_class;

    public Yx_1(String string) {
        this.id_class = string;
    }

    @Override
    public rcZ_2 id_class() {
        return new rcd_3();
    }

    @Override
    public int id_class(rcZ_2 rcZ_22, Supplier<rcZ_2> supplier) {
        if (rcZ_22 instanceof rcd_3) {
            rcZ_2 rcZ_23;
            rcd_3 rcd_32 = (rcd_3)rcZ_22;
            rcZ_2 rcZ_24 = supplier.get();
            if (!rcZ_24.equals(rcZ_23 = rcd_32.id_class(this.id_class, rcZ_24))) {
                return 1;
            }
        }
        return 0;
    }

    @Override
    public int id_class(rcZ_2 rcZ_22) {
        rcd_3 rcd_32;
        if (rcZ_22 instanceof rcd_3 && (rcd_32 = (rcd_3)rcZ_22).id_throws(this.id_class)) {
            rcd_32.id_continue(this.id_class);
            return 1;
        }
        return 0;
    }

    @Override
    public void id_class(rcZ_2 rcZ_22, Supplier<rcZ_2> supplier, List<rcZ_2> list) {
        if (rcZ_22 instanceof rcd_3) {
            rcZ_2 rcZ_23;
            rcd_3 rcd_32 = (rcd_3)rcZ_22;
            if (rcd_32.id_throws(this.id_class)) {
                rcZ_23 = rcd_32.id_byte(this.id_class);
            } else {
                rcZ_23 = supplier.get();
                rcd_32.id_class(this.id_class, rcZ_23);
            }
            list.add(rcZ_23);
        }
    }

    @Override
    public void id_class(rcZ_2 rcZ_22, List<rcZ_2> list) {
        rcZ_2 rcZ_23;
        if (rcZ_22 instanceof rcd_3 && (rcZ_23 = ((rcd_3)rcZ_22).id_byte(this.id_class)) != null) {
            list.add(rcZ_23);
        }
    }
}

