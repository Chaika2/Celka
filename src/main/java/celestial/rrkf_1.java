/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrWH;
import celestial.rrkY;

public class rrkf_1
implements rrkY {
    private int id_class;
    private boolean id_break;

    public rrkf_1(int n, boolean bl) {
        this.id_class = n;
        this.id_break = bl;
    }

    public String toString() {
        return "BlenderSplit: " + this.id_class + ", " + this.id_break;
    }

    @Override
    public int id_class(int n, int n2, int n3, int n4) {
        boolean bl;
        if (n == n2 && n2 == n3 && n3 == n4) {
            return n;
        }
        boolean bl2 = n < this.id_class;
        boolean bl3 = n2 < this.id_class;
        boolean bl4 = n3 < this.id_class;
        boolean bl5 = bl = n4 < this.id_class;
        if (bl2 == bl3 && bl3 == bl4 && bl4 == bl) {
            return !bl2 && this.id_break ? n : (n + n2 + n3 + n4) / 4;
        }
        rrWH rrWH2 = new rrWH(4);
        rrWH rrWH3 = new rrWH(4);
        this.id_class(n, rrWH2, rrWH3);
        this.id_class(n2, rrWH2, rrWH3);
        this.id_class(n3, rrWH2, rrWH3);
        this.id_class(n4, rrWH2, rrWH3);
        if (rrWH3.id_protected() > rrWH2.id_protected()) {
            return this.id_break ? rrWH3.id_byte(0) : this.id_class(rrWH3);
        }
        return this.id_class(rrWH2);
    }

    private int id_class(rrWH rrWH2) {
        int n = rrWH2.id_byte();
        switch (n) {
            case 2: {
                return (rrWH2.id_byte(0) + rrWH2.id_byte(1)) / 2;
            }
            case 3: {
                return (rrWH2.id_byte(0) + rrWH2.id_byte(1) + rrWH2.id_byte(2)) / 3;
            }
        }
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            n2 += rrWH2.id_byte(i);
        }
        return n2 / n;
    }

    private void id_class(int n, rrWH rrWH2, rrWH rrWH3) {
        if (n < this.id_class) {
            rrWH2.id_class(n);
        } else {
            rrWH3.id_class(n);
        }
    }
}

