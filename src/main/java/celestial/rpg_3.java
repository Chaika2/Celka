/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpj_3;

public class rpg_3
extends rpj_3 {
    public final /* synthetic */ int[] id_class;
    public final /* synthetic */ int id_break;

    public rpg_3(int[] nArray, int n) {
        this.id_class = nArray;
        this.id_break = n;
    }

    @Override
    public void id_class(int n) {
        this.id_class[this.id_break] = n;
    }

    @Override
    public int id_break() {
        return this.id_class[this.id_break];
    }
}

