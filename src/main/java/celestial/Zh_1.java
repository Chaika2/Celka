/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HZ;
import celestial.ZM;
import celestial.ZO;
import celestial.ZX;
import celestial.cm_3;
import celestial.rgc_3;

public class Zh_1 {
    public static final Zh_1 id_class = new Zh_1("", new ZX(0, 0), true, new int[]{0}, new ZO[]{new ZO(rgc_3.id_class, "", 0, 0)}, new HZ[0]);
    private final String id_break;
    public final ZX id_byte;
    public final boolean id_protected;
    private final int[] id_throws;
    public final ZO[] id_case;
    public final HZ[] id_catch;

    public Zh_1(String string, ZX zX, boolean bl, int[] nArray, ZO[] zOArray, HZ[] hZArray) {
        this.id_break = string;
        this.id_byte = zX;
        this.id_protected = bl;
        this.id_throws = nArray;
        this.id_case = zOArray;
        this.id_catch = hZArray;
    }

    public int id_class(int n) {
        int n2 = ZM.id_class(this.id_throws, n);
        return this.id_throws[n2];
    }

    public int id_class(cm_3 cm_32, ZX zX) {
        int n = zX.id_break / 9;
        if (n < 0) {
            return 0;
        }
        if (n >= this.id_case.length) {
            return this.id_break.length();
        }
        ZO zO = this.id_case[n];
        return this.id_throws[n] + cm_32.id_break().id_class(zO.id_break, zX.id_class, zO.id_class);
    }

    public int id_class(int n, int n2) {
        int n3;
        int n4 = ZM.id_class(this.id_throws, n);
        int n5 = n4 + n2;
        if (0 <= n5 && n5 < this.id_throws.length) {
            int n6 = n - this.id_throws[n4];
            int n7 = this.id_case[n5].id_break.length();
            n3 = this.id_throws[n5] + Math.min(n6, n7);
        } else {
            n3 = n;
        }
        return n3;
    }

    public int id_break(int n) {
        int n2 = ZM.id_class(this.id_throws, n);
        return this.id_throws[n2] + this.id_case[n2].id_break.length();
    }
}

