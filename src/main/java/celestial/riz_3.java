/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpr_3;

public class riz_3 {
    public final int id_class;
    public final riz_3[] id_break = new riz_3[6];
    public final boolean[] id_byte = new boolean[6];
    public boolean id_protected;
    public boolean id_throws;
    private int id_case;

    public int id_byte() {
        int n = 0;
        for (int i = 0; i < 6; ++i) {
            if (!this.id_byte[i]) continue;
            ++n;
        }
        return n;
    }

    public riz_3(int n) {
        this.id_class = n;
    }

    public boolean id_class(int n) {
        if (this.id_throws) {
            return true;
        }
        this.id_case = n;
        for (int i = 0; i < 6; ++i) {
            if (this.id_break[i] == null || !this.id_byte[i] || this.id_break[i].id_case == n || !this.id_break[i].id_class(n)) continue;
            return true;
        }
        return false;
    }

    public void id_class(rpr_3 rpr_32, riz_3 riz_32) {
        this.id_break[rpr_32.id_byte()] = riz_32;
        riz_32.id_break[rpr_32.id_case().id_byte()] = this;
    }

    public void id_class() {
        for (int i = 0; i < 6; ++i) {
            this.id_byte[i] = this.id_break[i] != null;
        }
    }

    public boolean id_break() {
        return this.id_class >= 75;
    }
}

