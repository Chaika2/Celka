/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRp_1;
import celestial.rXE;
import celestial.rYB;
import celestial.rYG;
import celestial.rfH_2;
import celestial.roJ_2;
import celestial.rox_3;
import celestial.rpr_3;
import celestial.rrsC_2;
import celestial.rrse_3;
import celestial.ryO_2;
import celestial.xc_3;

public class yW_2
implements rRp_1 {
    protected final int id_class;
    protected final int id_break;
    protected final rfH_2 id_byte;
    protected final int id_protected;
    protected final int id_throws;
    protected final int id_case;
    protected final roJ_2[][] id_catch;
    protected final xc_3[] id_private;
    protected final rXE[] id_implements;
    protected final rYB id_finally;

    @Override
    public xc_3 id_byte(rfH_2 rfH_22) {
        int n = (rfH_22.b_() >> 4) - this.id_class;
        int n2 = (rfH_22.d_() >> 4) - this.id_break;
        return this.id_catch[n][n2].id_byte(rfH_22);
    }

    public yW_2(rYB rYB2, int n, int n2, roJ_2[][] roJ_2Array, rfH_2 rfH_22, rfH_2 rfH_23) {
        this.id_finally = rYB2;
        this.id_class = n;
        this.id_break = n2;
        this.id_catch = roJ_2Array;
        this.id_byte = rfH_22;
        this.id_protected = rfH_23.b_() - rfH_22.b_() + 1;
        this.id_throws = rfH_23.c_() - rfH_22.c_() + 1;
        this.id_case = rfH_23.d_() - rfH_22.d_() + 1;
        this.id_private = null;
        this.id_implements = null;
    }

    @Override
    public rrse_3 id_class() {
        return this.id_finally.id_class();
    }

    @Override
    public float id_class(rpr_3 rpr_32, boolean bl) {
        return this.id_finally.id_class(rpr_32, bl);
    }

    public roJ_2 id_class(int n, int n2) {
        return this.id_catch[n][n2];
    }

    @Override
    public ryO_2 id_class(rfH_2 rfH_22) {
        return this.id_class(rfH_22, rox_3.IMMEDIATE);
    }

    public ryO_2 id_class(rfH_2 rfH_22, rox_3 rox_32) {
        int n = (rfH_22.b_() >> 4) - this.id_class;
        int n2 = (rfH_22.d_() >> 4) - this.id_break;
        return this.id_catch[n][n2].id_class(rfH_22, rox_32);
    }

    @Override
    public int id_class(rfH_2 rfH_22, rrsC_2 rrsC_22) {
        return this.id_finally.id_class(rfH_22, rrsC_22);
    }

    public static yW_2 id_class(rYB rYB2, rfH_2 rfH_22, rfH_2 rfH_23, int n) {
        return yW_2.id_class(rYB2, rfH_22, rfH_23, n, true);
    }

    public static yW_2 id_class(rYB rYB2, rfH_2 rfH_22, rfH_2 rfH_23, int n, boolean bl) {
        int n2;
        int n3 = rfH_22.b_() - n >> 4;
        int n4 = rfH_22.d_() - n >> 4;
        int n5 = rfH_23.b_() + n >> 4;
        int n6 = rfH_23.d_() + n >> 4;
        roJ_2[][] roJ_2Array = new roJ_2[n5 - n3 + 1][n6 - n4 + 1];
        for (n2 = n3; n2 <= n5; ++n2) {
            for (int i = n4; i <= n6; ++i) {
                roJ_2Array[n2 - n3][i - n4] = rYB2.id_throws(n2, i);
            }
        }
        if (bl && yW_2.id_class(rfH_22, rfH_23, n3, n4, roJ_2Array)) {
            return null;
        }
        n2 = 1;
        rfH_2 rfH_24 = rfH_22.id_break(-1, -1, -1);
        rfH_2 rfH_25 = rfH_23.id_break(1, 1, 1);
        return new yW_2(rYB2, n3, n4, roJ_2Array, rfH_24, rfH_25);
    }

    public static boolean id_class(rfH_2 rfH_22, rfH_2 rfH_23, int n, int n2, roJ_2[][] roJ_2Array) {
        for (int i = rfH_22.b_() >> 4; i <= rfH_23.b_() >> 4; ++i) {
            for (int j = rfH_22.d_() >> 4; j <= rfH_23.d_() >> 4; ++j) {
                roJ_2 roJ_22 = roJ_2Array[i - n][j - n2];
                if (roJ_22.id_class(rfH_22.c_(), rfH_23.c_())) continue;
                return false;
            }
        }
        return true;
    }

    protected int id_class(int n, int n2, int n3) {
        int n4 = n - this.id_byte.b_();
        int n5 = n2 - this.id_byte.c_();
        int n6 = n3 - this.id_byte.d_();
        return n6 * this.id_protected * this.id_throws + n5 * this.id_protected + n4;
    }

    @Override
    public rXE id_break(rfH_2 rfH_22) {
        int n = (rfH_22.b_() >> 4) - this.id_class;
        int n2 = (rfH_22.d_() >> 4) - this.id_break;
        return this.id_catch[n][n2].id_break(rfH_22);
    }

    public rYG id_throws(rfH_2 rfH_22) {
        return this.id_finally.id_implements(rfH_22);
    }

    protected final int id_protected(rfH_2 rfH_22) {
        return this.id_class(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }
}

