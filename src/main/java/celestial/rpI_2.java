/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpF_2;

public class rpI_2
implements rpF_2 {
    private final int[] id_class;

    public rpI_2(int n) {
        this.id_class = new int[n];
    }

    @Override
    public int id_class() {
        return this.id_class.length;
    }

    @Override
    public void id_class(int n, int n2) {
        this.id_class[n] = n2;
    }

    @Override
    public int id_class(int n) {
        return this.id_class[n];
    }
}

