/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrbb_3;
import celestial.rsT_2;

public class rrMC {
    private rsT_2 id_class;
    private int[] id_break;

    public rrMC(rsT_2 rsT_22, int[] nArray) {
        this.id_class = rsT_22;
        this.id_break = nArray;
    }

    public rrMC(rsT_2 rsT_22, int n) {
        this(rsT_22, new int[]{n});
    }

    public rrMC(rsT_2 rsT_22) {
        this(rsT_22, null);
    }

    public String toString() {
        return this.id_break == null ? "" + this.id_class : this.id_class + ":" + rrbb_3.id_class(this.id_break);
    }

    public static boolean id_class(rsT_2 rsT_22, int n, rrMC[] rrMCArray) {
        if (rrMCArray == null) {
            return false;
        }
        for (int i = 0; i < rrMCArray.length; ++i) {
            rrMC rrMC2 = rrMCArray[i];
            if (!rrMC2.id_class(rsT_22, n)) continue;
            return true;
        }
        return false;
    }

    public rsT_2 id_class() {
        return this.id_class;
    }

    public boolean id_class(rsT_2 rsT_22, int n) {
        if (this.id_class != rsT_22) {
            return false;
        }
        return this.id_break == null || rrbb_3.id_class(n, this.id_break);
    }

    public boolean id_class(int n) {
        if (this.id_break == null) {
            this.id_break = new int[]{n};
            return true;
        }
        if (this.id_break(n)) {
            return false;
        }
        this.id_break = rrbb_3.id_class(this.id_break, n);
        return true;
    }

    private boolean id_break(int n) {
        return this.id_break == null ? false : rrbb_3.id_class(n, this.id_break);
    }

    public int[] id_break() {
        return this.id_break;
    }
}

