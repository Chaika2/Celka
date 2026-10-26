/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.AbstractDoubleList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
package celestial;

import celestial.rjc_3;
import celestial.rju_3;
import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class rjv_3
extends AbstractDoubleList
implements rjc_3 {
    private final DoubleList id_class;
    private final DoubleList id_break;
    private final boolean id_byte;

    public rjv_3(DoubleList doubleList, DoubleList doubleList2, boolean bl) {
        this.id_class = doubleList;
        this.id_break = doubleList2;
        this.id_byte = bl;
    }

    public int size() {
        return this.id_class.size() + this.id_break.size();
    }

    public double getDouble(int n) {
        return n < this.id_class.size() ? this.id_class.getDouble(n) : this.id_break.getDouble(n - this.id_class.size());
    }

    @Override
    public DoubleList id_class() {
        return this;
    }

    @Override
    public boolean id_class(rju_3 rju_32) {
        return this.id_byte ? this.id_break((n, n2, n3) -> rju_32.merge(n2, n, n3)) : this.id_break(rju_32);
    }

    private boolean id_break(rju_3 rju_32) {
        int n;
        int n2 = this.id_class.size() - 1;
        for (n = 0; n < n2; ++n) {
            if (rju_32.merge(n, -1, n)) continue;
            return false;
        }
        if (!rju_32.merge(n2, -1, n2)) {
            return false;
        }
        for (n = 0; n < this.id_break.size(); ++n) {
            if (rju_32.merge(n2, n, n2 + 1 + n)) continue;
            return false;
        }
        return true;
    }
}

