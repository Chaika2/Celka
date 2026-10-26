/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
package celestial;

import celestial.rjc_3;
import celestial.rju_3;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class rjA_2
implements rjc_3 {
    private final DoubleList id_class;

    public rjA_2(DoubleList doubleList) {
        this.id_class = doubleList;
    }

    @Override
    public boolean id_class(rju_3 rju_32) {
        for (int i = 0; i <= this.id_class.size(); ++i) {
            if (rju_32.merge(i, i, i)) continue;
            return false;
        }
        return true;
    }

    @Override
    public DoubleList id_class() {
        return this.id_class;
    }
}

