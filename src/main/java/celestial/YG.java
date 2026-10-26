/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.YO;
import celestial.rcZ_2;
import celestial.rcx_3;
import celestial.rcy_3;
import java.util.List;
import java.util.function.Supplier;

public class YG
implements YO {
    private final int id_class;

    public YG(int n) {
        this.id_class = n;
    }

    @Override
    public rcZ_2 id_class() {
        return new rcy_3();
    }

    @Override
    public int id_class(rcZ_2 rcZ_22, Supplier<rcZ_2> supplier) {
        if (rcZ_22 instanceof rcx_3) {
            int n;
            rcx_3 rcx_32 = (rcx_3)rcZ_22;
            int n2 = rcx_32.size();
            int n3 = n = this.id_class < 0 ? n2 + this.id_class : this.id_class;
            if (0 <= n && n < n2) {
                rcZ_2 rcZ_23 = (rcZ_2)rcx_32.get(n);
                rcZ_2 rcZ_24 = supplier.get();
                if (!rcZ_24.equals(rcZ_23) && rcx_32.id_class(n, rcZ_24)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override
    public int id_class(rcZ_2 rcZ_22) {
        if (rcZ_22 instanceof rcx_3) {
            int n;
            rcx_3 rcx_32 = (rcx_3)rcZ_22;
            int n2 = rcx_32.size();
            int n3 = n = this.id_class < 0 ? n2 + this.id_class : this.id_class;
            if (0 <= n && n < n2) {
                rcx_32.id_byte(n);
                return 1;
            }
        }
        return 0;
    }

    @Override
    public void id_class(rcZ_2 rcZ_22, Supplier<rcZ_2> supplier, List<rcZ_2> list) {
        this.id_class(rcZ_22, list);
    }

    @Override
    public void id_class(rcZ_2 rcZ_22, List<rcZ_2> list) {
        if (rcZ_22 instanceof rcx_3) {
            int n;
            rcx_3 rcx_32 = (rcx_3)rcZ_22;
            int n2 = rcx_32.size();
            int n3 = n = this.id_class < 0 ? n2 + this.id_class : this.id_class;
            if (0 <= n && n < n2) {
                list.add((rcZ_2)rcx_32.get(n));
            }
        }
    }
}

