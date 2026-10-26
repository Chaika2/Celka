/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntComparator
 */
package celestial;

import celestial.gz_3;
import it.unimi.dsi.fastutil.ints.IntComparator;

public class gQ_2
implements IntComparator {
    public final /* synthetic */ int[] id_class;
    public final /* synthetic */ int[] id_break;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public gQ_2(gz_3 gz_32, int[] nArray, int[] nArray2) {
        this.id_class = nArray;
        this.id_break = nArray2;
    }

    public int compare(Integer n, Integer n2) {
        return this.compare((int)n, (int)n2);
    }

    public int compare(int n, int n2) {
        return this.id_class[n] == this.id_class[n2] ? Integer.compare(this.id_break[n], this.id_break[n2]) : Integer.compare(this.id_class[n], this.id_class[n2]);
    }
}

