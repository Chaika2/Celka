/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRo_1;
import celestial.rRp_1;
import celestial.rXE;
import celestial.rYG;
import celestial.rfH_2;
import celestial.roJ_2;
import celestial.rox_3;
import celestial.rpr_3;
import celestial.rrGi_1;
import celestial.rrka_1;
import celestial.rrsC_2;
import celestial.rrse_3;
import celestial.rrxF_2;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.yW_2;
import java.util.Arrays;

public class rrJI
implements rRp_1 {
    private final yW_2 id_class;
    private final int id_break;
    private final int id_byte;
    private final int id_protected;
    private final int id_throws;
    private final int id_case;
    private final int id_catch;
    private final int id_private;
    private int[] id_implements;
    private xc_3[] id_finally;
    private rYG[] id_extends;
    private final int id_native;
    private rrxF_2 id_volatile;
    private static final rrka_1 id_final = new rrka_1(Integer.TYPE, 16);
    private static final rrka_1 id_package = new rrka_1(xc_3.class, 16);
    private static final rrka_1 id_int = new rrka_1(rYG.class, 16);

    @Override
    public xc_3 id_byte(rfH_2 rfH_22) {
        int n = this.id_protected(rfH_22);
        if (n >= 0 && n < this.id_native && this.id_finally != null) {
            xc_3 xc_32 = this.id_finally[n];
            if (xc_32 == null) {
                this.id_finally[n] = xc_32 = this.id_class.id_byte(rfH_22);
            }
            return xc_32;
        }
        return this.id_class.id_byte(rfH_22);
    }

    public void id_byte() {
        id_final.id_class(this.id_implements);
        this.id_implements = null;
        id_package.id_class(this.id_finally);
        this.id_finally = null;
        id_int.id_class(this.id_extends);
        this.id_extends = null;
    }

    public rrJI(yW_2 yW_22, rfH_2 rfH_22, rfH_2 rfH_23, int n) {
        this.id_class = yW_22;
        int n2 = rfH_22.b_() - n >> 4;
        int n3 = rfH_22.c_() - n >> 4;
        int n4 = rfH_22.d_() - n >> 4;
        int n5 = rfH_23.b_() + n >> 4;
        int n6 = rfH_23.c_() + n >> 4;
        int n7 = rfH_23.d_() + n >> 4;
        this.id_throws = n5 - n2 + 1 << 4;
        this.id_case = n6 - n3 + 1 << 4;
        this.id_catch = n7 - n4 + 1 << 4;
        this.id_private = this.id_throws * this.id_catch;
        this.id_native = this.id_throws * this.id_case * this.id_catch;
        this.id_break = n2 << 4;
        this.id_byte = n3 << 4;
        this.id_protected = n4 << 4;
    }

    public void id_class(rrxF_2 rrxF_22) {
        this.id_volatile = rrxF_22;
    }

    @Override
    public rrse_3 id_class() {
        return this.id_class.id_class();
    }

    @Override
    public int id_class(rfH_2 rfH_22, rrsC_2 rrsC_22) {
        return this.id_class.id_class(rfH_22, rrsC_22);
    }

    public ryO_2 id_class(rfH_2 rfH_22, rox_3 rox_32) {
        return this.id_class.id_class(rfH_22, rox_32);
    }

    @Override
    public ryO_2 id_class(rfH_2 rfH_22) {
        return this.id_class.id_class(rfH_22, rox_3.CHECK);
    }

    @Override
    public float id_class(rpr_3 rpr_32, boolean bl) {
        return this.id_class.id_class(rpr_32, bl);
    }

    @Override
    public int id_class(rRo_1 rRo_12, rfH_2 rfH_22) {
        return this.id_class.id_class(rRo_12, rfH_22);
    }

    @Override
    public rXE id_break(rfH_2 rfH_22) {
        return this.id_byte(rfH_22).id_volatile();
    }

    public void id_break() {
        if (this.id_implements == null) {
            this.id_implements = (int[])id_final.id_class(this.id_native);
        }
        if (this.id_finally == null) {
            this.id_finally = (xc_3[])id_package.id_class(this.id_native);
        }
        if (this.id_extends == null) {
            this.id_extends = (rYG[])id_int.id_class(this.id_native);
        }
        Arrays.fill(this.id_implements, -1);
        Arrays.fill(this.id_finally, null);
        Arrays.fill(this.id_extends, null);
        this.id_case();
    }

    public rrxF_2 id_throws() {
        return this.id_volatile;
    }

    public rYG id_throws(rfH_2 rfH_22) {
        int n = this.id_protected(rfH_22);
        if (n >= 0 && n < this.id_native && this.id_extends != null) {
            rYG rYG2 = this.id_extends[n];
            if (rYG2 == null) {
                this.id_extends[n] = rYG2 = this.id_class.id_throws(rfH_22);
            }
            return rYG2;
        }
        return this.id_class.id_throws(rfH_22);
    }

    @Override
    public boolean id_case(rfH_2 rfH_22) {
        return this.id_class.id_case(rfH_22);
    }

    private void id_case() {
        if (this.id_throws == 48 && this.id_case == 48 && this.id_catch == 48) {
            roJ_2 roJ_22 = this.id_class.id_class(1, 1);
            rrGi_1 rrGi_12 = new rrGi_1();
            for (int i = 16; i < 32; ++i) {
                int n = i * this.id_private;
                for (int j = 16; j < 32; ++j) {
                    int n2 = j * this.id_throws;
                    for (int k = 16; k < 32; ++k) {
                        xc_3 xc_32;
                        rrGi_12.id_class(this.id_break + k, this.id_byte + i, this.id_protected + j);
                        int n3 = n + n2 + k;
                        this.id_finally[n3] = xc_32 = roJ_22.id_byte(rrGi_12);
                    }
                }
            }
        }
    }

    public int[] id_protected() {
        return this.id_implements;
    }

    public int id_protected(rfH_2 rfH_22) {
        int n = rfH_22.b_() - this.id_break;
        if (n >= 0 && n < this.id_throws) {
            int n2 = rfH_22.c_() - this.id_byte;
            if (n2 >= 0 && n2 < this.id_case) {
                int n3 = rfH_22.d_() - this.id_protected;
                return n3 >= 0 && n3 < this.id_catch ? n2 * this.id_private + n3 * this.id_throws + n : -1;
            }
            return -1;
        }
        return -1;
    }
}

