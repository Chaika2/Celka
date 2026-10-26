/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.HQ;
import celestial.HU;
import celestial.Hd_1;
import celestial.MH;
import celestial.fj_3;
import celestial.ju_3;
import celestial.lT_2;
import celestial.rfH_2;
import celestial.rjV_2;
import celestial.rja_3;
import celestial.rje_3;
import celestial.rjj_3;
import celestial.rrGH;
import celestial.rrME;
import celestial.rrbD_2;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rrxF_2;
import celestial.rrxq_3;
import celestial.wK_2;
import celestial.xc_3;
import celestial.xu_3;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Ok_1
extends rrGH {
    public static final Logger id_case = LogManager.getLogger();
    public static final ThreadLocal<rrxF_2> id_catch = ThreadLocal.withInitial(() -> new rrxF_2(xu_3.id_class.id_continue(), new rfH_2(0, 0, 0)));

    public Ok_1 id_byte(int var1, int var2);

    default public void id_byte(float f, float f2, float f3) {
    }

    default public Ok_1 id_byte(int n) {
        return this.id_break(n & 0xFFFF, n >> 16 & 0xFFFF);
    }

    default public int[] id_byte(int n, int n2, int n3, int n4) {
        return new int[]{n, n2, n3, n4};
    }

    default public HU id_byte() {
        return null;
    }

    default public void id_byte(MH mH, wK_2 wK_22, float[] fArray, float f, float f2, float f3, float f4, int[] nArray, int n, boolean bl) {
        rrbD_2 rrbD_22;
        boolean bl2;
        int[] nArray2 = this.id_break() ? wK_22.id_catch() : wK_22.id_class();
        this.id_class(wK_22.id_case());
        boolean bl3 = lT_2.id_protected();
        rja_3 rja_32 = wK_22.id_protected().id_int();
        float f5 = rja_32.b_();
        float f6 = rja_32.c_();
        float f7 = rja_32.d_();
        rjV_2 rjV_22 = mH.id_class();
        rjj_3 rjj_32 = mH.id_break();
        float f8 = rjj_32.id_throws(f5, f6, f7);
        float f9 = rjj_32.id_case(f5, f6, f7);
        float f10 = rjj_32.id_catch(f5, f6, f7);
        int n2 = ju_3.id_private.id_class();
        int n3 = nArray2.length / n2;
        boolean bl4 = bl2 = rrbb_3.rs() && rrdZ.p && rrbb_3.id_final();
        if (bl2 && (rrbD_22 = rrME.id_class()) != null) {
            rrxq_3[] rrxq_3Array = wK_22.id_class(rrbD_22.id_class());
            this.id_class(rrxq_3Array);
        }
        for (int i = 0; i < n3; ++i) {
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            int n4;
            float f19;
            int n5 = i * n2;
            float f20 = Float.intBitsToFloat(nArray2[n5]);
            float f21 = Float.intBitsToFloat(nArray2[n5 + 1]);
            float f22 = Float.intBitsToFloat(nArray2[n5 + 2]);
            float f23 = f19 = bl3 ? 1.0f : fArray[i];
            if (bl) {
                n4 = nArray2[n5 + 3];
                f18 = (float)(n4 & 0xFF) / 255.0f;
                f17 = (float)(n4 >> 8 & 0xFF) / 255.0f;
                f16 = (float)(n4 >> 16 & 0xFF) / 255.0f;
                f15 = f18 * f19 * f;
                f14 = f17 * f19 * f2;
                f13 = f16 * f19 * f3;
                f12 = (float)(n4 >> 24 & 0xFF) / 255.0f;
                f11 = f12 * f4;
            } else {
                f15 = f19 * f;
                f14 = f19 * f2;
                f13 = f19 * f3;
                f11 = f4;
            }
            n4 = nArray[i];
            f18 = Float.intBitsToFloat(nArray2[n5 + 4]);
            f17 = Float.intBitsToFloat(nArray2[n5 + 5]);
            f16 = rjV_22.id_break(f20, f21, f22, 1.0f);
            f12 = rjV_22.id_byte(f20, f21, f22, 1.0f);
            float f24 = rjV_22.id_protected(f20, f21, f22, 1.0f);
            if (bl3) {
                f11 = fArray[i];
            }
            this.id_class(f16, f12, f24, f15, f14, f13, f11, f18, f17, n, n4, f8, f9, f10);
        }
    }

    default public void id_class(HU hU) {
    }

    default public void id_class(MH mH, wK_2 wK_22, float[] fArray, float f, float f2, float f3, int[] nArray, int n, boolean bl) {
        this.id_byte(mH, wK_22, fArray, f, f2, f3, 1.0f, nArray, n, bl);
    }

    default public void id_class(fj_3 fj_32) {
    }

    default public Ok_1 id_class(rjV_2 rjV_22, float f, float f2, float f3) {
        rjV_2 rjV_23 = rjV_22;
        float f4 = rjV_23.id_break(f, f2, f3);
        float f5 = rjV_23.id_byte(f, f2, f3);
        float f6 = rjV_23.id_protected(f, f2, f3);
        return this.id_class((double)f4, (double)f5, (double)f6);
    }

    default public Ok_1 id_class(rjj_3 rjj_32, float f, float f2, float f3) {
        rjj_3 rjj_33 = rjj_32;
        float f4 = rjj_33.id_class(f, f2, f3);
        float f5 = rjj_33.id_break(f, f2, f3);
        float f6 = rjj_33.id_byte(f, f2, f3);
        return this.id_class(f4, f5, f6);
    }

    default public rrxF_2 id_class(xc_3 xc_32, rfH_2 rfH_22) {
        rrxF_2 rrxF_22 = id_catch.get();
        rrxF_22.id_class(xc_32, rfH_22);
        return rrxF_22;
    }

    default public rje_3 id_class(int[] nArray, int n, rjj_3 rjj_32) {
        int n2 = 7;
        int n3 = nArray[n + n2];
        byte by = (byte)(n3 >> 0 & 0xFF);
        byte by2 = (byte)(n3 >> 8 & 0xFF);
        byte by3 = (byte)(n3 >> 16 & 0xFF);
        if (by == 0 && by2 == 0 && by3 == 0) {
            return null;
        }
        rje_3 rje_32 = this.id_break((float)by / 127.0f, (float)by2 / 127.0f, (float)by3 / 127.0f);
        rje_32.id_class(rjj_32);
        return rje_32;
    }

    default public int id_class(int n, int[] nArray, int n2) {
        int n3 = Ok_1.id_protected(0);
        int n4 = HQ.id_class(nArray[n2 + n3]);
        int n5 = HQ.id_break(nArray[n2 + n3]);
        if (n4 == 0 && n5 == 0) {
            return n;
        }
        int n6 = HQ.id_class(n);
        int n7 = HQ.id_break(n);
        n6 = Math.max(n6, n4);
        n7 = Math.max(n7, n5);
        return HQ.id_class(n6, n7);
    }

    default public void id_class(rrxq_3[] rrxq_3Array) {
    }

    default public rje_3 id_class(rje_3 rje_32) {
        return rje_32.id_throws();
    }

    default public void id_class(boolean bl) {
    }

    public Ok_1 id_class(float var1, float var2, float var3);

    public void id_class();

    default public void id_class(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, float f10, float f11, float f12) {
        this.id_class((double)f, (double)f2, (double)f3);
        this.id_class(f4, f5, f6, f7);
        this.id_class(f8, f9);
        this.id_byte(n);
        this.id_break(n2);
        this.id_class(f10, f11, f12);
        this.id_class();
    }

    default public Ok_1 id_class(float f, float f2, float f3, float f4) {
        return this.id_break((int)(f * 255.0f), (int)(f2 * 255.0f), (int)(f3 * 255.0f), (int)(f4 * 255.0f));
    }

    public Ok_1 id_class(int var1);

    public Ok_1 id_class(int var1, int var2);

    public Ok_1 id_class(float var1, float var2);

    public Ok_1 id_class(double var1, double var3, double var5);

    default public void id_class(MH mH, wK_2 wK_22, float f, float f2, float f3, float f4, int n, int n2) {
        this.id_byte(mH, wK_22, this.id_break(1.0f, 1.0f, 1.0f, 1.0f), f, f2, f3, f4, this.id_byte(n, n, n, n), n2, false);
    }

    default public void id_class(MH mH, wK_2 wK_22, float[] fArray, float f, float f2, float f3, float f4, int[] nArray, int n, boolean bl) {
        this.id_byte(mH, wK_22, fArray, f, f2, f3, f4, nArray, n, bl);
    }

    default public void id_class(MH mH, wK_2 wK_22, float f, float f2, float f3, int n, int n2) {
        this.id_class(mH, wK_22, this.id_break(1.0f, 1.0f, 1.0f, 1.0f), f, f2, f3, this.id_byte(n, n, n, n), n2, false);
    }

    default public void id_break(MH mH, wK_2 wK_22, float[] fArray, float f, float f2, float f3, float f4, int[] nArray, int n, boolean bl) {
        this.id_byte(mH, wK_22, fArray, f, f2, f3, f4, nArray, n, bl);
    }

    default public void id_break(MH mH, wK_2 wK_22, float f, float f2, float f3, float f4, int n, int n2) {
        this.id_byte(mH, wK_22, this.id_break(1.0f, 1.0f, 1.0f, 1.0f), f, f2, f3, f4, this.id_byte(n, n, n, n), n2, false);
    }

    default public rje_3 id_break(float f, float f2, float f3) {
        return new rje_3(f, f2, f3);
    }

    public Ok_1 id_break(int var1, int var2, int var3, int var4);

    default public void id_break(fj_3 fj_32) {
    }

    default public boolean id_break() {
        return false;
    }

    default public float[] id_break(float f, float f2, float f3, float f4) {
        return new float[]{f, f2, f3, f4};
    }

    default public Ok_1 id_break(int n) {
        return this.id_byte(n & 0xFFFF, n >> 16 & 0xFFFF);
    }

    public Ok_1 id_break(int var1, int var2);

    default public Ok_1 id_throws() {
        return null;
    }

    public static int id_protected(int n) {
        return n * 8 + 6;
    }

    default public Hd_1 id_protected() {
        return null;
    }
}

