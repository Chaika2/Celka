/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
package celestial;

import celestial.YE;
import celestial.YO;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcy_3;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class YX
implements YO {
    private final rcd_3 id_class;
    private final Predicate<rcZ_2> id_break;

    public YX(rcd_3 rcd_32) {
        this.id_class = rcd_32;
        this.id_break = YE.id_class(rcd_32);
    }

    @Override
    public int id_class(rcZ_2 rcZ_22, Supplier<rcZ_2> supplier) {
        int n = 0;
        if (rcZ_22 instanceof rcy_3) {
            rcy_3 rcy_32 = (rcy_3)rcZ_22;
            int n2 = rcy_32.size();
            if (n2 == 0) {
                rcy_32.add(supplier.get());
                ++n;
            } else {
                for (int i = 0; i < n2; ++i) {
                    rcZ_2 rcZ_23;
                    rcZ_2 rcZ_24 = rcy_32.id_finally(i);
                    if (!this.id_break.test(rcZ_24) || (rcZ_23 = supplier.get()).equals(rcZ_24) || !rcy_32.id_class(i, rcZ_23)) continue;
                    ++n;
                }
            }
        }
        return n;
    }

    @Override
    public int id_class(rcZ_2 rcZ_22) {
        int n = 0;
        if (rcZ_22 instanceof rcy_3) {
            rcy_3 rcy_32 = (rcy_3)rcZ_22;
            for (int i = rcy_32.size() - 1; i >= 0; --i) {
                if (!this.id_break.test(rcy_32.id_finally(i))) continue;
                rcy_32.id_byte(i);
                ++n;
            }
        }
        return n;
    }

    @Override
    public rcZ_2 id_class() {
        return new rcy_3();
    }

    @Override
    public void id_class(rcZ_2 rcZ_23, Supplier<rcZ_2> supplier, List<rcZ_2> list) {
        MutableBoolean mutableBoolean = new MutableBoolean();
        if (rcZ_23 instanceof rcy_3) {
            rcy_3 rcy_32 = (rcy_3)rcZ_23;
            rcy_32.stream().filter(this.id_break).forEach(rcZ_22 -> {
                list.add((rcZ_2)rcZ_22);
                mutableBoolean.setTrue();
            });
            if (mutableBoolean.isFalse()) {
                rcd_3 rcd_32 = this.id_class.id_catch();
                rcy_32.add(rcd_32);
                list.add(rcd_32);
            }
        }
    }

    @Override
    public void id_class(rcZ_2 rcZ_22, List<rcZ_2> list) {
        if (rcZ_22 instanceof rcy_3) {
            rcy_3 rcy_32 = (rcy_3)rcZ_22;
            rcy_32.stream().filter(this.id_break).forEach(list::add);
        }
    }
}

