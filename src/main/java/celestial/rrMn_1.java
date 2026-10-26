/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrMl_1;
import celestial.rrbb_3;
import celestial.xc_3;

public class rrMn_1 {
    private int id_class = -1;
    private int[] id_break = null;

    public rrMn_1(int n, int[] nArray) {
        this.id_class = n;
        this.id_break = nArray;
    }

    public rrMn_1(int n, int n2) {
        this.id_class = n;
        if (n2 >= 0) {
            this.id_break = new int[]{n2};
        }
    }

    public rrMn_1(int n) {
        this.id_class = n;
    }

    public String toString() {
        return this.id_class + ":" + rrbb_3.id_class(this.id_break);
    }

    public void id_class(int[] nArray) {
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            this.id_class(n);
        }
    }

    public boolean id_class(xc_3 xc_32) {
        if (xc_32.id_continue() != this.id_class) {
            return false;
        }
        return rrMl_1.id_class(xc_32.id_super(), this.id_break);
    }

    public boolean id_class(int n, int n2) {
        if (n != this.id_class) {
            return false;
        }
        return rrMl_1.id_class(n2, this.id_break);
    }

    public int id_class() {
        return this.id_class;
    }

    public void id_class(int n) {
        if (this.id_break != null && n >= 0) {
            for (int i = 0; i < this.id_break.length; ++i) {
                if (this.id_break[i] != n) continue;
                return;
            }
            this.id_break = rrbb_3.id_class(this.id_break, n);
        }
    }

    public int[] id_break() {
        return this.id_break;
    }
}

