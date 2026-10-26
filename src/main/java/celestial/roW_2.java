/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.shorts.ShortList
 */
package celestial;

import celestial.rRV;
import celestial.rYr_1;
import celestial.rcy_3;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.roC_2;
import celestial.roR_2;
import celestial.rok_3;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.function.Function;
import java.util.function.Predicate;

public class roW_2<T>
implements rRV<T> {
    protected final Predicate<T> id_class;
    private final rfj_3 id_break;
    private final ShortList[] id_byte = new ShortList[16];

    public roW_2(Predicate<T> predicate, rfj_3 rfj_32) {
        this(predicate, rfj_32, new rcy_3());
    }

    public roW_2(Predicate<T> predicate, rfj_3 rfj_32, rcy_3 rcy_32) {
        this.id_class = predicate;
        this.id_break = rfj_32;
        for (int i = 0; i < rcy_32.size(); ++i) {
            rcy_3 rcy_33 = rcy_32.id_break(i);
            for (int j = 0; j < rcy_33.size(); ++j) {
                roC_2.id_class(this.id_byte, i).add(rcy_33.id_protected(j));
            }
        }
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, T t) {
        return false;
    }

    @Override
    public void id_class(rfH_2 rfH_22, T t, int n, rYr_1 rYr_12) {
        roC_2.id_class(this.id_byte, rfH_22.c_() >> 4).add(rok_3.id_finally(rfH_22));
    }

    public void id_class(rRV<T> rRV2, Function<rfH_2, T> function) {
        for (int i = 0; i < this.id_byte.length; ++i) {
            if (this.id_byte[i] == null) continue;
            for (Short s : this.id_byte[i]) {
                rfH_2 rfH_22 = rok_3.id_class(s, i, this.id_break);
                rRV2.id_class(rfH_22, function.apply(rfH_22), 0);
            }
            this.id_byte[i].clear();
        }
    }

    public rcy_3 id_class() {
        return roR_2.id_class(this.id_byte);
    }

    @Override
    public boolean id_break(rfH_2 rfH_22, T t) {
        return false;
    }
}

