/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HG;
import celestial.Hh_1;
import celestial.MD;
import celestial.QY;
import celestial.Qw_1;
import celestial.cb_3;
import celestial.gm_3;
import celestial.iB_2;
import celestial.ly_3;
import celestial.rLD;
import celestial.rXE;
import celestial.rYA;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rje_3;
import celestial.rlG_2;
import celestial.rqR_2;
import celestial.rrQX;
import celestial.rrbN_2;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.ryD_2;
import com.mojang.blaze3d.systems.RenderSystem;

public class HE {
    public static float id_class;
    public static float id_break;
    public static float id_byte;
    private static int id_throws;
    private static int id_case;
    private static long id_catch;
    public static boolean id_protected;

    static {
        id_throws = -1;
        id_case = -1;
        id_catch = -1L;
        id_protected = false;
    }

    public static void id_class(ly_3 ly_32, HG hG, float f, boolean bl, float f2) {
        float f3;
        float f4;
        if (bl) {
            id_protected = true;
            f4 = f * 0.05f;
            f3 = Math.min(f, 192.0f) * 0.5f;
        } else if (hG == HG.FOG_SKY) {
            id_protected = true;
            f4 = 0.0f;
            f3 = f;
        } else {
            id_protected = true;
            f4 = f * rrbb_3.id_public();
            f3 = f;
        }
        RenderSystem.fogStart(f4);
        RenderSystem.fogEnd(f3);
        RenderSystem.fogMode(MD.LINEAR);
        RenderSystem.setupNvFogDistance();
    }

    public static void id_class(ly_3 ly_32, float f, gm_3 gm_32, int n4, float f2) {
        rXE rXE2 = ly_32.id_finally();
        if (rXE2.id_class(rlG_2.id_break)) {
            long l = rqR_2.id_break();
            int n5 = gm_32.id_implements(new rfH_2(ly_32.id_break())).id_final();
            if (id_catch < 0L) {
                id_throws = n5;
                id_case = n5;
                id_catch = l;
            }
            int n6 = id_throws >> 16 & 0xFF;
            int n7 = id_throws >> 8 & 0xFF;
            int n8 = id_throws & 0xFF;
            int n9 = id_case >> 16 & 0xFF;
            int n10 = id_case >> 8 & 0xFF;
            int n11 = id_case & 0xFF;
            float f3 = rfU_2.id_class((float)(l - id_catch) / 5000.0f, 0.0f, 1.0f);
            float f4 = rfU_2.id_catch(f3, n9, n6);
            float f5 = rfU_2.id_catch(f3, n10, n7);
            float f6 = rfU_2.id_catch(f3, n11, n8);
            id_class = f4 / 255.0f;
            id_break = f5 / 255.0f;
            id_byte = f6 / 255.0f;
            if (id_throws != n5) {
                id_throws = n5;
                id_case = rfU_2.id_protected(f4) << 16 | rfU_2.id_protected(f5) << 8 | rfU_2.id_protected(f6);
                id_catch = l;
            }
        } else if (rXE2.id_class(rlG_2.id_byte)) {
            id_class = 0.6f;
            id_break = 0.1f;
            id_byte = 0.0f;
            id_catch = -1L;
        } else {
            float f7;
            float f8;
            float f9;
            float f10 = 0.25f + 0.75f * (float)n4 / 32.0f;
            f10 = 1.0f - (float)Math.pow(f10, 0.25);
            rjU_2 rjU_22 = gm_32.id_class(ly_32.id_byte(), f);
            rjU_22 = rrbN_2.id_break(rjU_22, gm_32, ly_32.id_catch(), f);
            float f11 = (float)rjU_22.id_break;
            float f12 = (float)rjU_22.id_byte;
            float f13 = (float)rjU_22.id_protected;
            float f14 = rfU_2.id_class(rfU_2.id_break(gm_32.id_protected(f) * ((float)Math.PI * 2)) * 2.0f + 0.5f, 0.0f, 1.0f);
            rYA rYA2 = gm_32.id_static();
            rjU_2 rjU_23 = ly_32.id_break().id_class(2.0, 2.0, 2.0).id_class(0.25);
            rjU_2 rjU_24 = ryD_2.id_class(rjU_23, (n, n2, n3) -> gm_32.id_break().id_class(rjU_2.id_class(rYA2.id_class(n, n2, n3).id_case()), f14));
            rjU_24 = rrbN_2.id_class(rjU_24, gm_32, ly_32.id_catch(), f);
            id_class = (float)rjU_24.id_class();
            id_break = (float)rjU_24.id_break();
            id_byte = (float)rjU_24.id_byte();
            if (n4 >= 4) {
                float[] fArray;
                f9 = rfU_2.id_class(gm_32.id_throws(f)) > 0.0f ? -1.0f : 1.0f;
                rje_3 rje_32 = new rje_3(f9, 0.0f, 0.0f);
                f8 = ly_32.id_volatile().id_byte(rje_32);
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                if (f8 > 0.0f && (fArray = gm_32.id_break().id_class(gm_32.id_protected(f), f)) != null) {
                    id_class = id_class * (1.0f - (f8 *= fArray[3])) + fArray[0] * f8;
                    id_break = id_break * (1.0f - f8) + fArray[1] * f8;
                    id_byte = id_byte * (1.0f - f8) + fArray[2] * f8;
                }
            }
            id_class += (f11 - id_class) * f10;
            id_break += (f12 - id_break) * f10;
            id_byte += (f13 - id_byte) * f10;
            f9 = gm_32.id_private(f);
            if (f9 > 0.0f) {
                float f15 = 1.0f - f9 * 0.5f;
                f8 = 1.0f - f9 * 0.4f;
                id_class *= f15;
                id_break *= f15;
                id_byte *= f8;
            }
            if ((f7 = gm_32.id_case(f)) > 0.0f) {
                f8 = 1.0f - f7 * 0.5f;
                id_class *= f8;
                id_break *= f8;
                id_byte *= f8;
            }
            id_catch = -1L;
        }
        double d = ly_32.id_break().id_byte * gm_32.id_synchronized().id_final();
        if (d < 1.0 && !rXE2.id_class(rlG_2.id_byte)) {
            if (d < 0.0) {
                d = 0.0;
            }
            d *= d;
            id_class = (float)((double)id_class * d);
            id_break = (float)((double)id_break * d);
            id_byte = (float)((double)id_byte * d);
        }
        if (f2 > 0.0f) {
            id_class = id_class * (1.0f - f2) + id_class * 0.7f * f2;
            id_break = id_break * (1.0f - f2) + id_break * 0.6f * f2;
            id_byte = id_byte * (1.0f - f2) + id_byte * 0.6f * f2;
        }
        if (rXE2.id_class(rlG_2.id_break)) {
            float f16;
            float f17 = 0.0f;
            if (ly_32.id_catch() == (cb_3)QY.id_instanceof().id_class[57]) {
                f17 = ((cb_3)QY.id_instanceof().id_class[57]).id_public();
            }
            if (Float.isInfinite(f16 = Math.min(1.0f / id_class, Math.min(1.0f / id_break, 1.0f / id_byte)))) {
                f16 = Math.nextAfter(f16, 0.0);
            }
            id_class = id_class * (1.0f - f17) + id_class * f16 * f17;
            id_break = id_break * (1.0f - f17) + id_break * f16 * f17;
            id_byte = id_byte * (1.0f - f17) + id_byte * f16 * f17;
        } else if (((Qw_1)QY.id_instanceof().id_class[20]).a == 100.0) {
            float f18 = 1.0f;
            float f19 = Math.min(1.0f / id_class, Math.min(1.0f / id_break, 1.0f / id_byte));
            if (Float.isInfinite(f19)) {
                f19 = Math.nextAfter(f19, 0.0);
            }
            id_class = id_class * (1.0f - f18) + id_class * f19 * f18;
            id_break = id_break * (1.0f - f18) + id_break * f19 * f18;
            id_byte = id_byte * (1.0f - f18) + id_byte * f19 * f18;
        } else if (ly_32.id_catch() instanceof iB_2 && ((iB_2)ly_32.id_catch()).id_break(rLD.id_int)) {
            float f20 = Hh_1.id_class((iB_2)ly_32.id_catch(), f);
            float f21 = Math.min(1.0f / id_class, Math.min(1.0f / id_break, 1.0f / id_byte));
            if (Float.isInfinite(f21)) {
                f21 = Math.nextAfter(f21, 0.0);
            }
            id_class = id_class * (1.0f - f20) + id_class * f21 * f20;
            id_break = id_break * (1.0f - f20) + id_break * f21 * f20;
            id_byte = id_byte * (1.0f - f20) + id_byte * f21 * f20;
        }
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().id_else()) {
            float f22 = 0.2f;
            rrdZ.id_class(f22, f22, f22, 0.0f);
            RenderSystem.clearColor(f22, f22, f22, 0.0f);
        } else {
            rrdZ.id_class(id_class, id_break, id_byte, 0.0f);
            RenderSystem.clearColor(id_class, id_break, id_byte, 0.0f);
        }
    }

    public static void id_class(ly_3 ly_32, HG hG, float f, boolean bl) {
        HE.id_class(ly_32, hG, f, bl, 0.0f);
    }

    public static void id_class() {
        RenderSystem.fogDensity(0.0f);
        RenderSystem.fogMode(MD.EXP2);
    }

    public static void id_break() {
        RenderSystem.fog(2918, id_class, id_break, id_byte, 1.0f);
        if (rrbb_3.rs()) {
            rrdZ.id_class(id_class, id_break, id_byte);
        }
    }
}

