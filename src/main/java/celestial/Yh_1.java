/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.YE;
import celestial.YO;
import celestial.rcZ_2;
import celestial.rcd_3;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Yh_1
implements YO {
    private final String id_class;
    private final rcd_3 id_break;
    private final Predicate<rcZ_2> id_byte;

    public Yh_1(String string, rcd_3 rcd_32) {
        this.id_class = string;
        this.id_break = rcd_32;
        this.id_byte = YE.id_class(rcd_32);
    }

    @Override
    public rcZ_2 id_class() {
        return new rcd_3();
    }

    @Override
    public int id_class(rcZ_2 rcZ_22, Supplier<rcZ_2> supplier) {
        rcZ_2 rcZ_23;
        rcd_3 rcd_32;
        rcZ_2 rcZ_24;
        if (rcZ_22 instanceof rcd_3 && this.id_byte.test(rcZ_24 = (rcd_32 = (rcd_3)rcZ_22).id_byte(this.id_class)) && !(rcZ_23 = supplier.get()).equals(rcZ_24)) {
            rcd_32.id_class(this.id_class, rcZ_23);
            return 1;
        }
        return 0;
    }

    @Override
    public int id_class(rcZ_2 rcZ_22) {
        rcd_3 rcd_32;
        rcZ_2 rcZ_23;
        if (rcZ_22 instanceof rcd_3 && this.id_byte.test(rcZ_23 = (rcd_32 = (rcd_3)rcZ_22).id_byte(this.id_class))) {
            rcd_32.id_continue(this.id_class);
            return 1;
        }
        return 0;
    }

    @Override
    public void id_class(rcZ_2 rcZ_22, Supplier<rcZ_2> supplier, List<rcZ_2> list) {
        if (rcZ_22 instanceof rcd_3) {
            rcd_3 rcd_32 = (rcd_3)rcZ_22;
            rcZ_2 rcZ_23 = rcd_32.id_byte(this.id_class);
            if (rcZ_23 == null) {
                rcd_3 rcd_33 = this.id_break.id_catch();
                rcd_32.id_class(this.id_class, rcd_33);
                list.add(rcd_33);
            } else if (this.id_byte.test(rcZ_23)) {
                list.add(rcZ_23);
            }
        }
    }

    @Override
    public void id_class(rcZ_2 rcZ_22, List<rcZ_2> list) {
        rcZ_2 rcZ_23;
        if (rcZ_22 instanceof rcd_3 && this.id_byte.test(rcZ_23 = ((rcd_3)rcZ_22).id_byte(this.id_class))) {
            list.add(rcZ_23);
        }
    }
}

