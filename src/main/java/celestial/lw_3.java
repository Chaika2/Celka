/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HQ;
import celestial.lR_2;
import celestial.lT_2;
import celestial.lV_2;
import celestial.rRp_1;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rrGi_1;
import celestial.rrxc_3;
import celestial.xc_3;
import java.util.BitSet;

public class lw_3 {
    public final float[] id_class = new float[4];
    public final int[] id_break = new int[4];
    private rrGi_1 id_byte = new rrGi_1();

    public lw_3() {
        this(null);
    }

    public lw_3(lT_2 lT_22) {
    }

    private int id_class(int n, int n2, int n3, int n4) {
        if (n == 0) {
            n = n4;
        }
        if (n2 == 0) {
            n2 = n4;
        }
        if (n3 == 0) {
            n3 = n4;
        }
        return n + n2 + n3 + n4 >> 2 & 0xFF00FF;
    }

    private int id_class(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        int n5 = (int)((float)(n >> 16 & 0xFF) * f + (float)(n2 >> 16 & 0xFF) * f2 + (float)(n3 >> 16 & 0xFF) * f3 + (float)(n4 >> 16 & 0xFF) * f4) & 0xFF;
        int n6 = (int)((float)(n & 0xFF) * f + (float)(n2 & 0xFF) * f2 + (float)(n3 & 0xFF) * f3 + (float)(n4 & 0xFF) * f4) & 0xFF;
        return n5 << 16 | n6;
    }

    public void id_class(rRp_1 rRp_12, xc_3 xc_32, rfH_2 rfH_22, rpr_3 rpr_32, float[] fArray, BitSet bitSet, boolean bl) {
        float f;
        int n;
        float f2;
        int n2;
        float f3;
        int n3;
        float f4;
        int n4;
        float f5;
        boolean bl2;
        rfH_2 rfH_23 = bitSet.get(0) ? rfH_22.id_break(rpr_32) : rfH_22;
        lV_2 lV_22 = lV_2.id_class(rpr_32);
        rrGi_1 rrGi_12 = this.id_byte;
        rrxc_3 rrxc_32 = lT_2.id_throws;
        rrGi_12.id_class(rfH_23, lV_22.corners[0]);
        xc_3 xc_33 = rRp_12.id_byte(rrGi_12);
        int n5 = rrxc_3.id_break(xc_33, rRp_12, rrGi_12);
        float f6 = rrxc_3.id_class(xc_33, rRp_12, rrGi_12);
        rrGi_12.id_class(rfH_23, lV_22.corners[1]);
        xc_3 xc_34 = rRp_12.id_byte(rrGi_12);
        int n6 = rrxc_3.id_break(xc_34, rRp_12, rrGi_12);
        float f7 = rrxc_3.id_class(xc_34, rRp_12, rrGi_12);
        rrGi_12.id_class(rfH_23, lV_22.corners[2]);
        xc_3 xc_35 = rRp_12.id_byte(rrGi_12);
        int n7 = rrxc_3.id_break(xc_35, rRp_12, rrGi_12);
        float f8 = rrxc_3.id_class(xc_35, rRp_12, rrGi_12);
        rrGi_12.id_class(rfH_23, lV_22.corners[3]);
        xc_3 xc_36 = rRp_12.id_byte(rrGi_12);
        int n8 = rrxc_3.id_break(xc_36, rRp_12, rrGi_12);
        float f9 = rrxc_3.id_class(xc_36, rRp_12, rrGi_12);
        rrGi_12.id_class(rfH_23, lV_22.corners[0], rpr_32);
        boolean bl3 = rRp_12.id_byte(rrGi_12).id_break(rRp_12, (rfH_2)rrGi_12) == 0;
        rrGi_12.id_class(rfH_23, lV_22.corners[1], rpr_32);
        boolean bl4 = rRp_12.id_byte(rrGi_12).id_break(rRp_12, (rfH_2)rrGi_12) == 0;
        rrGi_12.id_class(rfH_23, lV_22.corners[2], rpr_32);
        boolean bl5 = rRp_12.id_byte(rrGi_12).id_break(rRp_12, (rfH_2)rrGi_12) == 0;
        rrGi_12.id_class(rfH_23, lV_22.corners[3], rpr_32);
        boolean bl6 = bl2 = rRp_12.id_byte(rrGi_12).id_break(rRp_12, (rfH_2)rrGi_12) == 0;
        if (!bl5 && !bl3) {
            f5 = f6;
            n4 = n5;
        } else {
            rrGi_12.id_class(rfH_23, lV_22.corners[0], lV_22.corners[2]);
            xc_3 xc_37 = rRp_12.id_byte(rrGi_12);
            f5 = rrxc_3.id_class(xc_37, rRp_12, rrGi_12);
            n4 = rrxc_3.id_break(xc_37, rRp_12, rrGi_12);
        }
        if (!bl2 && !bl3) {
            f4 = f6;
            n3 = n5;
        } else {
            rrGi_12.id_class(rfH_23, lV_22.corners[0], lV_22.corners[3]);
            xc_3 xc_38 = rRp_12.id_byte(rrGi_12);
            f4 = rrxc_3.id_class(xc_38, rRp_12, rrGi_12);
            n3 = rrxc_3.id_break(xc_38, rRp_12, rrGi_12);
        }
        if (!bl5 && !bl4) {
            f3 = f6;
            n2 = n5;
        } else {
            rrGi_12.id_class(rfH_23, lV_22.corners[1], lV_22.corners[2]);
            xc_3 xc_39 = rRp_12.id_byte(rrGi_12);
            f3 = rrxc_3.id_class(xc_39, rRp_12, rrGi_12);
            n2 = rrxc_3.id_break(xc_39, rRp_12, rrGi_12);
        }
        if (!bl2 && !bl4) {
            f2 = f6;
            n = n5;
        } else {
            rrGi_12.id_class(rfH_23, lV_22.corners[1], lV_22.corners[3]);
            xc_3 xc_310 = rRp_12.id_byte(rrGi_12);
            f2 = rrxc_3.id_class(xc_310, rRp_12, rrGi_12);
            n = rrxc_3.id_break(xc_310, rRp_12, rrGi_12);
        }
        int n9 = rrxc_3.id_break(xc_32, rRp_12, rfH_22);
        rrGi_12.id_class(rfH_22, rpr_32);
        xc_3 xc_311 = rRp_12.id_byte(rrGi_12);
        if (bitSet.get(0) || !xc_311.id_implements(rRp_12, rrGi_12)) {
            n9 = rrxc_3.id_break(xc_311, rRp_12, rrGi_12);
        }
        float f10 = bitSet.get(0) ? rrxc_3.id_class(rRp_12.id_byte(rfH_23), rRp_12, rfH_23) : rrxc_3.id_class(rRp_12.id_byte(rfH_22), rRp_12, rfH_22);
        lR_2 lR_22 = lR_2.id_class(rpr_32);
        if (bitSet.get(1) && lV_22.doNonCubicWeight) {
            f = (f9 + f6 + f4 + f10) * 0.25f;
            var41_45 = (f8 + f6 + f5 + f10) * 0.25f;
            var42_47 = (f8 + f7 + f3 + f10) * 0.25f;
            var43_48 = (f9 + f7 + f2 + f10) * 0.25f;
            float f11 = fArray[lV_22.vert0Weights[0].shape] * fArray[lV_22.vert0Weights[1].shape];
            float f12 = fArray[lV_22.vert0Weights[2].shape] * fArray[lV_22.vert0Weights[3].shape];
            float f13 = fArray[lV_22.vert0Weights[4].shape] * fArray[lV_22.vert0Weights[5].shape];
            float f14 = fArray[lV_22.vert0Weights[6].shape] * fArray[lV_22.vert0Weights[7].shape];
            float f15 = fArray[lV_22.vert1Weights[0].shape] * fArray[lV_22.vert1Weights[1].shape];
            float f16 = fArray[lV_22.vert1Weights[2].shape] * fArray[lV_22.vert1Weights[3].shape];
            float f17 = fArray[lV_22.vert1Weights[4].shape] * fArray[lV_22.vert1Weights[5].shape];
            float f18 = fArray[lV_22.vert1Weights[6].shape] * fArray[lV_22.vert1Weights[7].shape];
            float f19 = fArray[lV_22.vert2Weights[0].shape] * fArray[lV_22.vert2Weights[1].shape];
            float f20 = fArray[lV_22.vert2Weights[2].shape] * fArray[lV_22.vert2Weights[3].shape];
            float f21 = fArray[lV_22.vert2Weights[4].shape] * fArray[lV_22.vert2Weights[5].shape];
            float f22 = fArray[lV_22.vert2Weights[6].shape] * fArray[lV_22.vert2Weights[7].shape];
            float f23 = fArray[lV_22.vert3Weights[0].shape] * fArray[lV_22.vert3Weights[1].shape];
            float f24 = fArray[lV_22.vert3Weights[2].shape] * fArray[lV_22.vert3Weights[3].shape];
            float f25 = fArray[lV_22.vert3Weights[4].shape] * fArray[lV_22.vert3Weights[5].shape];
            float f26 = fArray[lV_22.vert3Weights[6].shape] * fArray[lV_22.vert3Weights[7].shape];
            this.id_class[lR_22.vert0] = f * f11 + var41_45 * f12 + var42_47 * f13 + var43_48 * f14;
            this.id_class[lR_22.vert1] = f * f15 + var41_45 * f16 + var42_47 * f17 + var43_48 * f18;
            this.id_class[lR_22.vert2] = f * f19 + var41_45 * f20 + var42_47 * f21 + var43_48 * f22;
            this.id_class[lR_22.vert3] = f * f23 + var41_45 * f24 + var42_47 * f25 + var43_48 * f26;
            int n10 = this.id_class(n8, n5, n3, n9);
            int n11 = this.id_class(n7, n5, n4, n9);
            int n12 = this.id_class(n7, n6, n2, n9);
            int n13 = this.id_class(n8, n6, n, n9);
            this.id_break[lR_22.vert0] = this.id_class(n10, n11, n12, n13, f11, f12, f13, f14);
            this.id_break[lR_22.vert1] = this.id_class(n10, n11, n12, n13, f15, f16, f17, f18);
            this.id_break[lR_22.vert2] = this.id_class(n10, n11, n12, n13, f19, f20, f21, f22);
            this.id_break[lR_22.vert3] = this.id_class(n10, n11, n12, n13, f23, f24, f25, f26);
        } else {
            f = (f9 + f6 + f4 + f10) * 0.25f;
            var41_45 = (f8 + f6 + f5 + f10) * 0.25f;
            var42_47 = (f8 + f7 + f3 + f10) * 0.25f;
            var43_48 = (f9 + f7 + f2 + f10) * 0.25f;
            this.id_break[lR_22.vert0] = this.id_class(n8, n5, n3, n9);
            this.id_break[lR_22.vert1] = this.id_class(n7, n5, n4, n9);
            this.id_break[lR_22.vert2] = this.id_class(n7, n6, n2, n9);
            this.id_break[lR_22.vert3] = this.id_class(n8, n6, n, n9);
            this.id_class[lR_22.vert0] = f;
            this.id_class[lR_22.vert1] = var41_45;
            this.id_class[lR_22.vert2] = var42_47;
            this.id_class[lR_22.vert3] = var43_48;
        }
        f = rRp_12.id_class(rpr_32, bl);
        int n14 = 0;
        while (n14 < this.id_class.length) {
            int n15 = n14++;
            this.id_class[n15] = this.id_class[n15] * f;
        }
    }

    public void id_class() {
        int n;
        this.id_break[0] = n = HQ.id_class;
        this.id_break[1] = n;
        this.id_break[2] = n;
        this.id_break[3] = n;
        this.id_class[0] = 1.0f;
        this.id_class[1] = 1.0f;
        this.id_class[2] = 1.0f;
        this.id_class[3] = 1.0f;
    }
}

