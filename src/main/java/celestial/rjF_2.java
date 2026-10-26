/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.AbstractDoubleList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
package celestial;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class rjF_2
extends AbstractDoubleList {
    private final DoubleList id_class;
    private final double id_break;

    public rjF_2(DoubleList doubleList, double d) {
        this.id_class = doubleList;
        this.id_break = d;
    }

    public int size() {
        return this.id_class.size();
    }

    public double getDouble(int n) {
        return this.id_class.getDouble(n) + this.id_break;
    }
}

