/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet
 */
package celestial;

import celestial.rrsw_3;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;

public class rrsI_2
extends LongLinkedOpenHashSet {
    public final /* synthetic */ int id_class;
    public final /* synthetic */ rrsw_3 id_break;

    public rrsI_2(rrsw_3 rrsw_32, int n, float f, int n2) {
        this.id_break = rrsw_32;
        this.id_class = n2;
        super(n, f);
    }

    protected void rehash(int n) {
        if (n > this.id_class) {
            super.rehash(n);
        }
    }
}

