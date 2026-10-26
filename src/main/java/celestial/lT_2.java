/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HQ;
import celestial.HU;
import celestial.Hv_1;
import celestial.IJ;
import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.MH;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.ju_3;
import celestial.lD_2;
import celestial.lI_2;
import celestial.lw_3;
import celestial.rRp_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rpr_3;
import celestial.rrGe_1;
import celestial.rrGp_1;
import celestial.rrGq_1;
import celestial.rrJH;
import celestial.rrJp_1;
import celestial.rrWP;
import celestial.rrbN_2;
import celestial.rrbY_2;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rrdk_1;
import celestial.rrxA_2;
import celestial.rrxF_2;
import celestial.rrxc_3;
import celestial.rrxr_3;
import celestial.wK_2;
import celestial.xc_3;
import celestial.yC_2;
import celestial.yX_2;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class lT_2 {
    private final yC_2 id_class;
    private static final ThreadLocal<lI_2> id_break = ThreadLocal.withInitial(() -> new lI_2());
    private static float id_byte = 0.2f;
    private static boolean id_protected = false;
    public static final rrxc_3 id_throws = new rrxc_3();
    private static final HU[] id_case = new HU[]{rrxA_2.id_byte, rrxA_2.id_break, rrxA_2.id_protected};
    private boolean id_catch = rrxr_3.rb.id_byte();

    public boolean id_byte(rRp_1 rRp_12, IJ iJ, xc_3 xc_32, rfH_2 rfH_22, Ml_1 ml_1, Ok_1 ok_1, boolean bl, Random random, long l, int n) {
        return this.id_byte(rRp_12, iJ, xc_32, rfH_22, ml_1, ok_1, bl, random, l, n, rrGp_1.id_class);
    }

    public static void id_byte() {
        id_byte = 1.0f - rrbb_3.h() * 0.8f;
        id_protected = rrbb_3.rs() && rrdZ.id_synchronized();
    }

    public boolean id_byte(rRp_1 rRp_12, IJ iJ, xc_3 xc_32, rfH_2 rfH_22, Ml_1 ml_1, Ok_1 ok_1, boolean bl, Random random, long l, int n, rrGq_1 rrGq_12) {
        boolean bl2 = false;
        rrxF_2 rrxF_22 = ok_1.id_class(xc_32, rfH_22);
        HU hU = ok_1.id_byte();
        Object object = rpr_3.VALUES;
        int n2 = ((rpr_3[])object).length;
        for (int i = 0; i < n2; ++i) {
            rpr_3 rpr_32 = object[i];
            if (bl && !rrWP.id_class(xc_32, rRp_12, rfH_22, rpr_32, rrxF_22)) continue;
            random.setSeed(l);
            List<wK_2> list = this.id_catch ? iJ.id_class(xc_32, rpr_32, random, rrGq_12) : iJ.id_class(xc_32, rpr_32, random);
            int n3 = yX_2.id_class(rRp_12, xc_32, rfH_22.id_break(rpr_32));
            list = rrJH.id_class(list, rRp_12, xc_32, rfH_22, rpr_32, hU, l, rrxF_22);
            this.id_class(rRp_12, xc_32, rfH_22, n3, n, false, ml_1, ok_1, list, rrxF_22);
            bl2 = true;
        }
        random.setSeed(l);
        Object object2 = object = this.id_catch ? iJ.id_class(xc_32, (rpr_3)null, random, rrGq_12) : iJ.id_class(xc_32, null, random);
        if (!object.isEmpty()) {
            object = rrJH.id_class((List<wK_2>)object, rRp_12, xc_32, rfH_22, null, hU, l, rrxF_22);
            this.id_class(rRp_12, xc_32, rfH_22, -1, n, true, ml_1, ok_1, (List<wK_2>)object, rrxF_22);
            bl2 = true;
        }
        return bl2;
    }

    public lT_2(yC_2 yC_22) {
        this.id_class = yC_22;
    }

    public static void id_class() {
        id_break.get().id_class();
    }

    public void id_class(MH mH, Ok_1 ok_1, xc_3 xc_32, IJ iJ, float f, float f2, float f3, int n, int n2) {
        this.id_class(mH, ok_1, xc_32, iJ, f, f2, f3, n, n2, rrGp_1.id_class);
    }

    public void id_class(MH mH, Ok_1 ok_1, xc_3 xc_32, IJ iJ, float f, float f2, float f3, int n, int n2, rrGq_1 rrGq_12) {
        Random random = new Random();
        long l = 42L;
        for (rpr_3 rpr_32 : rpr_3.VALUES) {
            random.setSeed(42L);
            if (this.id_catch) {
                lT_2.id_class(mH, ok_1, f, f2, f3, iJ.id_class(xc_32, rpr_32, random, rrGq_12), n, n2);
                continue;
            }
            lT_2.id_class(mH, ok_1, f, f2, f3, iJ.id_class(xc_32, rpr_32, random), n, n2);
        }
        random.setSeed(42L);
        if (this.id_catch) {
            lT_2.id_class(mH, ok_1, f, f2, f3, iJ.id_class(xc_32, (rpr_3)null, random, rrGq_12), n, n2);
        } else {
            lT_2.id_class(mH, ok_1, f, f2, f3, iJ.id_class(xc_32, null, random), n, n2);
        }
    }

    public boolean id_class(rRp_1 rRp_12, IJ iJ, xc_3 xc_32, rfH_2 rfH_22, Ml_1 ml_1, Ok_1 ok_1, boolean bl, Random random, long l, int n, rrGq_1 rrGq_12) {
        boolean bl2;
        boolean bl3 = bl2 = QY.L() && xc_32.id_case() == 0 && iJ.id_class();
        if (this.id_catch) {
            rrGq_12 = iJ.id_class(rRp_12, rfH_22, xc_32, rrGq_12);
        }
        rjU_2 rjU_22 = xc_32.id_class(rfH_22);
        ml_1.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
        try {
            boolean bl4;
            if (rrbb_3.rs()) {
                rrdk_1.id_class(xc_32, ok_1);
            }
            if (!rrbb_3.rJ()) {
                l = 0L;
            }
            rrxF_2 rrxF_22 = ok_1.id_class(xc_32, rfH_22);
            iJ = rrJH.id_class(iJ, xc_32, rrxF_22);
            boolean bl5 = bl4 = bl2 ? this.id_break(rRp_12, iJ, xc_32, rfH_22, ml_1, ok_1, bl, random, l, n, rrGq_12) : this.id_byte(rRp_12, iJ, xc_32, rfH_22, ml_1, ok_1, bl, random, l, n, rrGq_12);
            if (bl4) {
                this.id_class(rRp_12, iJ, xc_32, rfH_22, ml_1, ok_1, n, bl, random, l, rrxF_22, bl2, rjU_22);
            }
            if (rrbb_3.rs()) {
                rrdk_1.id_class(ok_1);
            }
            return bl4;
        }
        catch (Throwable throwable) {
            KY kY = KY.id_class(throwable, "Tesselating block model");
            Ko_1 ko_1 = kY.id_class("Block model being tesselated");
            Ko_1.id_class(ko_1, rfH_22, xc_32);
            ko_1.id_class("Using AO", bl2);
            throw new KU(kY);
        }
    }

    public static float id_class(float f) {
        return f == 0.2f ? id_byte : f;
    }

    public boolean id_class(rRp_1 rRp_12, IJ iJ, xc_3 xc_32, rfH_2 rfH_22, Ml_1 ml_1, Ok_1 ok_1, boolean bl, Random random, long l, int n) {
        return this.id_class(rRp_12, iJ, xc_32, rfH_22, ml_1, ok_1, bl, random, l, n, rrGp_1.id_class);
    }

    private void id_class(rRp_1 rRp_12, IJ iJ, xc_3 xc_32, rfH_2 rfH_22, Ml_1 ml_1, Ok_1 ok_1, int n, boolean bl, Random random, long l, rrxF_2 rrxF_22, boolean bl2, rjU_2 rjU_22) {
        Object object;
        if (rrxF_22.id_int()) {
            for (int i = 0; i < id_case.length; ++i) {
                object = id_case[i];
                rrJp_1 rrJp_12 = rrxF_22.id_class((HU)object);
                if (rrJp_12.id_class() <= 0) continue;
                Hv_1 hv_1 = rrxF_22.id_package();
                if (hv_1 != null) {
                    lD_2 lD_22 = hv_1.id_class((HU)object);
                    if (!lD_22.id_final()) {
                        lD_22.id_class(7, ju_3.id_private);
                    }
                    for (int j = 0; j < rrJp_12.id_class(); ++j) {
                        wK_2 wK_22 = rrJp_12.id_class(j);
                        List<wK_2> list = rrJp_12.id_class(wK_22);
                        xc_3 xc_33 = rrJp_12.id_break(j);
                        if (wK_22.id_int() != null) {
                            rrJp_12.id_class(wK_22.id_int(), xc_33);
                        }
                        rrxF_22.id_class(xc_33, rfH_22);
                        if (bl2) {
                            this.id_class(rRp_12, xc_33, rfH_22, ml_1, lD_22, list, n, rrxF_22);
                            continue;
                        }
                        int n2 = yX_2.id_class(rRp_12, xc_33, rfH_22.id_break(wK_22.id_protected()));
                        this.id_class(rRp_12, xc_33, rfH_22, n2, n, false, ml_1, lD_22, list, rrxF_22);
                    }
                }
                rrJp_12.id_break();
            }
        }
        if (rrbb_3.f() && !rrxF_22.id_case() && rrGe_1.id_class(rRp_12, xc_32, rfH_22)) {
            IJ iJ2 = rrGe_1.id_break();
            object = rrGe_1.id_byte();
            ml_1.id_class(-rjU_22.id_break, -rjU_22.id_byte, -rjU_22.id_protected);
            this.id_class(rRp_12, iJ2, (xc_3)object, rfH_22, ml_1, ok_1, bl, random, l, n);
        }
    }

    private void id_class(rRp_1 rRp_12, xc_3 xc_32, rfH_2 rfH_22, Ml_1 ml_1, Ok_1 ok_1, List<wK_2> list, int n, rrxF_2 rrxF_22) {
        float[] fArray = rrxF_22.id_byte();
        BitSet bitSet = rrxF_22.id_protected();
        lw_3 lw_32 = rrxF_22.id_throws();
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            wK_2 wK_22 = list.get(i);
            this.id_class(rRp_12, xc_32, rfH_22, wK_22.id_class(), wK_22.id_protected(), fArray, bitSet);
            lw_32.id_class(rRp_12, xc_32, rfH_22, wK_22.id_protected(), fArray, bitSet, wK_22.id_throws());
            if (wK_22.id_case().id_package) {
                lw_32.id_class();
            }
            this.id_class(rRp_12, xc_32, rfH_22, ok_1, ml_1.id_byte(), wK_22, lw_32.id_class[0], lw_32.id_class[1], lw_32.id_class[2], lw_32.id_class[3], lw_32.id_break[0], lw_32.id_break[1], lw_32.id_break[2], lw_32.id_break[3], n, rrxF_22);
        }
    }

    private static void id_class(MH mH, Ok_1 ok_1, float f, float f2, float f3, List<wK_2> list, int n, int n2) {
        boolean bl = rrbY_2.id_class();
        Iterator<wK_2> iterator = list.iterator();
        while (iterator.hasNext()) {
            float f4;
            float f5;
            float f6;
            wK_2 wK_22 = iterator.next();
            if (bl && (wK_22 = rrbY_2.id_class(wK_22)) == null) continue;
            if (wK_22.id_break()) {
                f6 = rfU_2.id_class(f, 0.0f, 1.0f);
                f5 = rfU_2.id_class(f2, 0.0f, 1.0f);
                f4 = rfU_2.id_class(f3, 0.0f, 1.0f);
            } else {
                f6 = 1.0f;
                f5 = 1.0f;
                f4 = 1.0f;
            }
            ok_1.id_class(mH, wK_22, f6, f5, f4, n, n2);
        }
        return;
    }

    private void id_class(rRp_1 rRp_12, xc_3 xc_32, rfH_2 rfH_22, Ok_1 ok_1, MH mH, wK_2 wK_22, float f, float f2, float f3, float f4, int n, int n2, int n3, int n4, int n5, rrxF_2 rrxF_22) {
        float f5;
        float f6;
        float f7;
        int n6 = rrbN_2.id_class(wK_22, xc_32, rRp_12, rfH_22, rrxF_22);
        if (!wK_22.id_break() && n6 == -1) {
            f7 = 1.0f;
            f6 = 1.0f;
            f5 = 1.0f;
        } else {
            int n7 = n6 != -1 ? n6 : this.id_class.id_class(xc_32, rRp_12, rfH_22, wK_22.id_byte());
            f7 = (float)(n7 >> 16 & 0xFF) / 255.0f;
            f6 = (float)(n7 >> 8 & 0xFF) / 255.0f;
            f5 = (float)(n7 & 0xFF) / 255.0f;
        }
        ok_1.id_class(mH, wK_22, ok_1.id_break(f, f2, f3, f4), f7, f6, f5, ok_1.id_byte(n, n2, n3, n4), n5, true);
    }

    private void id_class(rRp_1 rRp_12, xc_3 xc_32, rfH_2 rfH_22, int[] nArray, rpr_3 rpr_32, float[] fArray, BitSet bitSet) {
        int n;
        float f = 32.0f;
        float f2 = 32.0f;
        float f3 = 32.0f;
        float f4 = -32.0f;
        float f5 = -32.0f;
        float f6 = -32.0f;
        int n2 = nArray.length / 4;
        for (n = 0; n < 4; ++n) {
            float f7 = Float.intBitsToFloat(nArray[n * n2]);
            float f8 = Float.intBitsToFloat(nArray[n * n2 + 1]);
            float f9 = Float.intBitsToFloat(nArray[n * n2 + 2]);
            f = Math.min(f, f7);
            f2 = Math.min(f2, f8);
            f3 = Math.min(f3, f9);
            f4 = Math.max(f4, f7);
            f5 = Math.max(f5, f8);
            f6 = Math.max(f6, f9);
        }
        if (fArray != null) {
            fArray[rpr_3.WEST.id_byte()] = f;
            fArray[rpr_3.EAST.id_byte()] = f4;
            fArray[rpr_3.DOWN.id_byte()] = f2;
            fArray[rpr_3.UP.id_byte()] = f5;
            fArray[rpr_3.NORTH.id_byte()] = f3;
            fArray[rpr_3.SOUTH.id_byte()] = f6;
            n = rpr_3.VALUES.length;
            fArray[rpr_3.WEST.id_byte() + n] = 1.0f - f;
            fArray[rpr_3.EAST.id_byte() + n] = 1.0f - f4;
            fArray[rpr_3.DOWN.id_byte() + n] = 1.0f - f2;
            fArray[rpr_3.UP.id_byte() + n] = 1.0f - f5;
            fArray[rpr_3.NORTH.id_byte() + n] = 1.0f - f3;
            fArray[rpr_3.SOUTH.id_byte() + n] = 1.0f - f6;
        }
        switch (rpr_32) {
            case DOWN: {
                bitSet.set(1, f >= 1.0E-4f || f3 >= 1.0E-4f || f4 <= 0.9999f || f6 <= 0.9999f);
                bitSet.set(0, f2 == f5 && (f2 < 1.0E-4f || xc_32.id_new(rRp_12, rfH_22)));
                break;
            }
            case UP: {
                bitSet.set(1, f >= 1.0E-4f || f3 >= 1.0E-4f || f4 <= 0.9999f || f6 <= 0.9999f);
                bitSet.set(0, f2 == f5 && (f5 > 0.9999f || xc_32.id_new(rRp_12, rfH_22)));
                break;
            }
            case NORTH: {
                bitSet.set(1, f >= 1.0E-4f || f2 >= 1.0E-4f || f4 <= 0.9999f || f5 <= 0.9999f);
                bitSet.set(0, f3 == f6 && (f3 < 1.0E-4f || xc_32.id_new(rRp_12, rfH_22)));
                break;
            }
            case SOUTH: {
                bitSet.set(1, f >= 1.0E-4f || f2 >= 1.0E-4f || f4 <= 0.9999f || f5 <= 0.9999f);
                bitSet.set(0, f3 == f6 && (f6 > 0.9999f || xc_32.id_new(rRp_12, rfH_22)));
                break;
            }
            case WEST: {
                bitSet.set(1, f2 >= 1.0E-4f || f3 >= 1.0E-4f || f5 <= 0.9999f || f6 <= 0.9999f);
                bitSet.set(0, f == f4 && (f < 1.0E-4f || xc_32.id_new(rRp_12, rfH_22)));
                break;
            }
            case EAST: {
                bitSet.set(1, f2 >= 1.0E-4f || f3 >= 1.0E-4f || f5 <= 0.9999f || f6 <= 0.9999f);
                bitSet.set(0, f == f4 && (f4 > 0.9999f || xc_32.id_new(rRp_12, rfH_22)));
            }
        }
    }

    private void id_class(rRp_1 rRp_12, xc_3 xc_32, rfH_2 rfH_22, int n, int n2, boolean bl, Ml_1 ml_1, Ok_1 ok_1, List<wK_2> list, rrxF_2 rrxF_22) {
        BitSet bitSet = rrxF_22.id_protected();
        int n3 = list.size();
        for (int i = 0; i < n3; ++i) {
            wK_2 wK_22 = list.get(i);
            if (bl) {
                this.id_class(rRp_12, xc_32, rfH_22, wK_22.id_class(), wK_22.id_protected(), null, bitSet);
                rfH_2 rfH_23 = bitSet.get(0) ? rfH_22.id_break(wK_22.id_protected()) : rfH_22;
                n = yX_2.id_class(rRp_12, xc_32, rfH_23);
            }
            if (wK_22.id_case().id_package) {
                n = HQ.id_class;
            }
            float f = rRp_12.id_class(wK_22.id_protected(), wK_22.id_throws());
            this.id_class(rRp_12, xc_32, rfH_22, ok_1, ml_1.id_byte(), wK_22, f, f, f, f, n, n, n, n, n2, rrxF_22);
        }
    }

    public boolean id_break(rRp_1 rRp_12, IJ iJ, xc_3 xc_32, rfH_2 rfH_22, Ml_1 ml_1, Ok_1 ok_1, boolean bl, Random random, long l, int n, rrGq_1 rrGq_12) {
        boolean bl2 = false;
        rrxF_2 rrxF_22 = ok_1.id_class(xc_32, rfH_22);
        HU hU = ok_1.id_byte();
        Object object = rpr_3.VALUES;
        int n2 = ((rpr_3[])object).length;
        for (int i = 0; i < n2; ++i) {
            rpr_3 rpr_32 = object[i];
            if (bl && !rrWP.id_class(xc_32, rRp_12, rfH_22, rpr_32, rrxF_22)) continue;
            random.setSeed(l);
            List<wK_2> list = this.id_catch ? iJ.id_class(xc_32, rpr_32, random, rrGq_12) : iJ.id_class(xc_32, rpr_32, random);
            list = rrJH.id_class(list, rRp_12, xc_32, rfH_22, rpr_32, hU, l, rrxF_22);
            this.id_class(rRp_12, xc_32, rfH_22, ml_1, ok_1, list, n, rrxF_22);
            bl2 = true;
        }
        random.setSeed(l);
        Object object2 = object = this.id_catch ? iJ.id_class(xc_32, (rpr_3)null, random, rrGq_12) : iJ.id_class(xc_32, null, random);
        if (!object.isEmpty()) {
            object = rrJH.id_class((List<wK_2>)object, rRp_12, xc_32, rfH_22, null, hU, l, rrxF_22);
            this.id_class(rRp_12, xc_32, rfH_22, ml_1, ok_1, (List<wK_2>)object, n, rrxF_22);
            bl2 = true;
        }
        return bl2;
    }

    public static void id_break() {
        id_break.get().id_break();
    }

    public boolean id_break(rRp_1 rRp_12, IJ iJ, xc_3 xc_32, rfH_2 rfH_22, Ml_1 ml_1, Ok_1 ok_1, boolean bl, Random random, long l, int n) {
        return this.id_break(rRp_12, iJ, xc_32, rfH_22, ml_1, ok_1, bl, random, l, n, rrGp_1.id_class);
    }

    public static boolean id_protected() {
        return id_protected;
    }
}

