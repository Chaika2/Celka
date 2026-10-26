/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rpr_3;
import celestial.rrbb_3;
import celestial.rrxH_2;
import celestial.yQ_2;
import celestial.yX_2;
import celestial.yz_3;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class yO_2 {
    protected final yX_2 id_class;
    protected final rYB id_break;
    protected int id_byte;
    protected int id_protected;
    protected int id_throws;
    public yQ_2[] id_case;
    private Map<rfj_3, rrxH_2[]> id_catch = new HashMap<rfj_3, rrxH_2[]>();

    public yO_2(yz_3 yz_32, rYB rYB2, int n, yX_2 yX_22) {
        this.id_class = yX_22;
        this.id_break = rYB2;
        this.id_class(n);
        this.id_class(yz_32);
    }

    public void id_class(double d, double d2) {
        int n = rfU_2.id_byte(d);
        int n2 = rfU_2.id_byte(d2);
        for (int i = 0; i < this.id_protected; ++i) {
            int n3 = this.id_protected * 16;
            int n4 = n - 8 - n3 / 2;
            int n5 = n4 + Math.floorMod(i * 16 - n4, n3);
            for (int j = 0; j < this.id_throws; ++j) {
                int n6 = this.id_throws * 16;
                int n7 = n2 - 8 - n6 / 2;
                int n8 = n7 + Math.floorMod(j * 16 - n7, n6);
                for (int k = 0; k < this.id_byte; ++k) {
                    int n9 = k * 16;
                    yQ_2 yQ_22 = this.id_case[this.id_class(i, k, j)];
                    yQ_22.id_class(n5, n9, n8);
                }
            }
        }
    }

    public void id_class(int n, int n2, int n3, boolean bl) {
        int n4 = Math.floorMod(n, this.id_protected);
        int n5 = Math.floorMod(n2, this.id_byte);
        int n6 = Math.floorMod(n3, this.id_throws);
        yQ_2 yQ_22 = this.id_case[this.id_class(n4, n5, n6)];
        yQ_22.id_class(bl);
    }

    public yQ_2 id_class(rfH_2 rfH_22) {
        int n = rfH_22.b_() >> 4;
        int n2 = rfH_22.c_() >> 4;
        int n3 = rfH_22.d_() >> 4;
        if (n2 >= 0 && n2 < this.id_byte) {
            n = rfU_2.id_break(n, this.id_protected);
            n3 = rfU_2.id_break(n3, this.id_throws);
            return this.id_case[this.id_class(n, n2, n3)];
        }
        return null;
    }

    private void id_class(yQ_2 yQ_22) {
        int n;
        rfH_2 rfH_22 = yQ_22.id_throws();
        int n2 = rfH_22.b_() >> 8 << 8;
        int n3 = rfH_22.d_() >> 8 << 8;
        rfj_3 rfj_32 = new rfj_3(n2, n3);
        HU[] hUArray = HU.s;
        rrxH_2[] rrxH_2Array = this.id_catch.get(rfj_32);
        if (rrxH_2Array == null) {
            rrxH_2Array = new rrxH_2[hUArray.length];
            for (n = 0; n < hUArray.length; ++n) {
                rrxH_2Array[n] = new rrxH_2(hUArray[n]);
            }
            this.id_catch.put(rfj_32, rrxH_2Array);
        }
        for (n = 0; n < hUArray.length; ++n) {
            HU hU = hUArray[n];
            rrxH_2 rrxH_22 = rrxH_2Array[n];
            if (rrxH_22 == null) continue;
            yQ_22.id_class(hU).id_class(rrxH_22);
        }
    }

    protected void id_class(yz_3 yz_32) {
        int n;
        int n2;
        int n3 = this.id_protected * this.id_byte * this.id_throws;
        this.id_case = new yQ_2[n3];
        for (n2 = 0; n2 < this.id_protected; ++n2) {
            for (int i = 0; i < this.id_byte; ++i) {
                for (n = 0; n < this.id_throws; ++n) {
                    int n4 = this.id_class(n2, i, n);
                    yz_3 yz_33 = yz_32;
                    Objects.requireNonNull(yz_33);
                    this.id_case[n4] = new yQ_2(yz_33);
                    this.id_case[n4].id_class(n2 * 16, i * 16, n * 16);
                    if (!rrbb_3.rp() || !rrbb_3.ry()) continue;
                    this.id_class(this.id_case[n4]);
                }
            }
        }
        for (n2 = 0; n2 < this.id_case.length; ++n2) {
            yQ_2 yQ_22 = this.id_case[n2];
            for (n = 0; n < rpr_3.VALUES.length; ++n) {
                rpr_3 rpr_32 = rpr_3.VALUES[n];
                rfH_2 rfH_22 = yQ_22.id_class(rpr_32);
                yQ_2 yQ_23 = this.id_class(rfH_22);
                yQ_22.id_class(rpr_32, yQ_23);
            }
        }
    }

    public void id_class() {
        for (yQ_2 yQ_22 : this.id_case) {
            yQ_22.id_protected();
        }
        this.id_break();
    }

    private int id_class(int n, int n2, int n3) {
        return (n3 * this.id_byte + n2) * this.id_protected + n;
    }

    protected void id_class(int n) {
        int n2;
        this.id_protected = n2 = n * 2 + 1;
        this.id_byte = 16;
        this.id_throws = n2;
    }

    public void id_break() {
        for (rfj_3 rfj_32 : this.id_catch.keySet()) {
            rrxH_2[] rrxH_2Array = this.id_catch.get(rfj_32);
            for (int i = 0; i < rrxH_2Array.length; ++i) {
                rrxH_2 rrxH_22 = rrxH_2Array[i];
                if (rrxH_22 != null) {
                    rrxH_22.id_protected();
                }
                rrxH_2Array[i] = null;
            }
        }
        this.id_catch.clear();
    }
}

