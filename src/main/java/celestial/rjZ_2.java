/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 */
package celestial;

import celestial.rjc_3;
import celestial.rju_3;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.ints.IntArrayList;

public final class rjZ_2
implements rjc_3 {
    private final DoubleArrayList id_class;
    private final IntArrayList id_break;
    private final IntArrayList id_byte;

    protected rjZ_2(DoubleList doubleList, DoubleList doubleList2, boolean bl, boolean bl2) {
        int n = 0;
        int n2 = 0;
        double d = Double.NaN;
        int n3 = doubleList.size();
        int n4 = doubleList2.size();
        int n5 = n3 + n4;
        this.id_class = new DoubleArrayList(n5);
        this.id_break = new IntArrayList(n5);
        this.id_byte = new IntArrayList(n5);
        while (true) {
            double d2;
            boolean bl3;
            boolean bl4 = n < n3;
            boolean bl5 = bl3 = n2 < n4;
            if (!bl4 && !bl3) {
                if (this.id_class.isEmpty()) {
                    this.id_class.add(Math.min(doubleList.getDouble(n3 - 1), doubleList2.getDouble(n4 - 1)));
                }
                return;
            }
            boolean bl6 = bl4 && (!bl3 || doubleList.getDouble(n) < doubleList2.getDouble(n2) + 1.0E-7);
            double d3 = d2 = bl6 ? doubleList.getDouble(n++) : doubleList2.getDouble(n2++);
            if ((n == 0 || !bl4) && !bl6 && !bl2 || (n2 == 0 || !bl3) && bl6 && !bl) continue;
            if (!(d >= d2 - 1.0E-7)) {
                this.id_break.add(n - 1);
                this.id_byte.add(n2 - 1);
                this.id_class.add(d2);
                d = d2;
                continue;
            }
            if (this.id_class.isEmpty()) continue;
            this.id_break.set(this.id_break.size() - 1, n - 1);
            this.id_byte.set(this.id_byte.size() - 1, n2 - 1);
        }
    }

    @Override
    public boolean id_class(rju_3 rju_32) {
        for (int i = 0; i < this.id_class.size() - 1; ++i) {
            if (rju_32.merge(this.id_break.getInt(i), this.id_byte.getInt(i), i)) continue;
            return false;
        }
        return true;
    }

    @Override
    public DoubleList id_class() {
        return this.id_class;
    }
}

