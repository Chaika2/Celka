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

public class Yb_1
implements YO {
    private final Predicate<rcZ_2> id_class;

    public Yb_1(rcd_3 rcd_32) {
        this.id_class = YE.id_class(rcd_32);
    }

    @Override
    public rcZ_2 id_class() {
        return new rcd_3();
    }

    @Override
    public int id_class(rcZ_2 rcZ_22, Supplier<rcZ_2> supplier) {
        return 0;
    }

    @Override
    public int id_class(rcZ_2 rcZ_22) {
        return 0;
    }

    @Override
    public void id_class(rcZ_2 rcZ_22, Supplier<rcZ_2> supplier, List<rcZ_2> list) {
        this.id_class(rcZ_22, list);
    }

    @Override
    public void id_class(rcZ_2 rcZ_22, List<rcZ_2> list) {
        if (rcZ_22 instanceof rcd_3 && this.id_class.test(rcZ_22)) {
            list.add(rcZ_22);
        }
    }
}

