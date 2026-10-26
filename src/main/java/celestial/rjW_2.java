/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.AbstractDoubleList
 */
package celestial;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;

public class rjW_2
extends AbstractDoubleList {
    private final int id_class;

    public rjW_2(int n) {
        this.id_class = n;
    }

    public int size() {
        return this.id_class + 1;
    }

    public double getDouble(int n) {
        return (double)n / (double)this.id_class;
    }
}

