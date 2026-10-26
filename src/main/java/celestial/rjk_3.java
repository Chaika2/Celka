/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.math.IntMath
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
package celestial;

import celestial.rjW_2;
import celestial.rjc_3;
import celestial.rju_3;
import celestial.rjw_3;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class rjk_3
implements rjc_3 {
    private final rjW_2 id_class;
    private final int id_break;
    private final int id_byte;
    private final int id_protected;

    public rjk_3(int n, int n2) {
        this.id_class = new rjW_2((int)rjw_3.id_class(n, n2));
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = IntMath.gcd((int)n, (int)n2);
    }

    @Override
    public boolean id_class(rju_3 rju_32) {
        int n = this.id_break / this.id_protected;
        int n2 = this.id_byte / this.id_protected;
        for (int i = 0; i <= this.id_class.size(); ++i) {
            if (rju_32.merge(i / n2, i / n, i)) continue;
            return false;
        }
        return true;
    }

    @Override
    public DoubleList id_class() {
        return this.id_class;
    }
}

