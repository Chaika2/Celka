/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package celestial;

import celestial.BO;
import celestial.C_class;
import celestial.C_throws;
import celestial.Gh_1;
import celestial.Ml_1;
import celestial.PP;
import celestial.PZ;
import celestial.T;
import celestial.a_1;
import celestial.an_3;
import celestial.bf_3;
import celestial.bj_3;
import celestial.bw_3;
import celestial.fU_2;
import celestial.ju_3;
import celestial.rE_2;
import celestial.rG_2;
import celestial.rJ_2;
import celestial.rP_2;
import celestial.rRJ;
import celestial.rU_2;
import celestial.rX_2;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rh_3;
import celestial.rjC_2;
import celestial.rjV_2;
import celestial.rja_3;
import celestial.rjw_3;
import celestial.rqO_2;
import celestial.rs_3;
import celestial.vm_3;
import celestial.xc_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class bg_3
implements PP,
bj_3 {
    private static long[] id_break;
    private static boolean[] id_catch;
    private static float[] id_private;
    private static short[] id_implements;
    private static String[] id_finally;
    public static Object[] id_class;
    private static byte[] id_extends;
    private static double[] id_native;

    public static double id_byte() {
        return id_byte.id_case();
    }

    private bg_3() {
    }

    static {
        bg_3.ntfClinit();
    }

    public static void id_class(Ml_1 ml_1, an_3 an_32, rP_2 rP_22, float f, Color color) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        Object object;
        double d9 = bg_3.id_byte();
        double d10 = bg_3.id_break();
        double d11 = bg_3.id_class();
        double d12 = (Boolean)bg_3.id_protected.Pv.id_class[id_implements[40]] == false ? id_native[15] : (double)rfU_2.id_break((float)((double)((float)(System.nanoTime() / id_break[0] % id_break[1]) / id_private[3]) * id_native[16] * id_native[17]));
        if (rP_22 instanceof PZ) {
            object = ((PZ)((Object)rP_22)).id_break();
            d8 = (double)((rja_3)object).b_() + id_native[18] - d9;
            d7 = (double)(((rja_3)object).b_() + id_catch[12]) - id_native[19] - d9;
            d6 = (double)((rja_3)object).d_() + id_native[20] - d11;
            d5 = (double)(((rja_3)object).d_() + id_catch[13]) - id_native[21] - d11;
            if (rP_22 instanceof rE_2 || rP_22 instanceof rh_3) {
                d12 /= id_native[22];
            }
            d4 = id_native[23] + d12 + (double)((rja_3)object).c_() - d10;
            d3 = id_native[24] - d12 + (double)((rja_3)object).c_() - d10;
            d2 = (double)((rja_3)object).c_() - d10;
            d = d2 + id_native[25];
            if (rP_22 instanceof rE_2 || rP_22 instanceof rh_3) {
                d4 -= id_native[26];
                d3 -= id_native[27];
                d -= id_native[28];
            }
        } else if (rP_22 instanceof rX_2) {
            object = (rX_2)rP_22;
            if (((Boolean)bg_3.id_protected.id_const.id_class[id_implements[41]]).booleanValue()) {
                GL11.glPushAttrib((int)id_extends[6]);
                PP.b_.A().id_class((rqO_2)id_class[id_implements[42]]);
                if (((Boolean)bg_3.id_protected.PJ.id_class[id_implements[43]]).booleanValue()) {
                    RenderSystem.disableDepthTest();
                }
                ml_1.id_class();
                ml_1.id_class((double)((rX_2)object).id_byte() - d9, -d10, (double)((rX_2)object).id_break() - d11);
                fU_2.id_class(ml_1, b_.id_interface().id_break(), (rqO_2)id_class[id_implements[44]], (Boolean)bg_3.id_protected.Pv.id_class[id_implements[45]] != false ? f : id_private[4], id_private[5], (Boolean)bg_3.id_protected.Pv.id_class[id_implements[46]] != false ? ((rYB)an_32.id_throws[id_implements[47]]).r() : id_break[2], id_catch[14], id_implements[48], color.getColorComponents(null), id_private[6], id_private[7]);
                ml_1.id_break();
                if (((Boolean)bg_3.id_protected.PJ.id_class[id_implements[49]]).booleanValue()) {
                    RenderSystem.enableDepthTest();
                }
                GL11.glPopAttrib();
                return;
            }
            d8 = (double)((rX_2)object).id_byte() + id_native[29] - d9;
            d7 = (double)(((rX_2)object).id_byte() + id_catch[15]) - id_native[30] - d9;
            d6 = (double)((rX_2)object).id_break() + id_native[31] - d11;
            d5 = (double)(((rX_2)object).id_break() + id_catch[16]) - id_native[32] - d11;
            d4 = id_native[33];
            d3 = id_native[34];
            d2 = id_native[35] - d10;
            d = id_native[36] - d10;
        } else {
            if (rP_22 instanceof rs_3) {
                rP_2[] rP_2Array = ((rs_3)rP_22).id_break();
                int n = rP_2Array.length;
                for (int i = id_catch[17]; i < n; ++i) {
                    rP_2 rP_23 = rP_2Array[i];
                    bg_3.id_class(ml_1, an_32, rP_23, f, color);
                }
                return;
            }
            if (rP_22 instanceof rG_2) {
                bg_3.id_class(ml_1, an_32, (rP_2)((rG_2)rP_22).id_class[id_implements[50]], f, (Color)bg_3.id_protected.rc.id_class[id_implements[51]]);
                return;
            }
            if (rP_22 instanceof rJ_2) {
                object = (rJ_2)rP_22;
                d8 = an_32.Ps().id_break - (Double)bg_3.id_protected.rW.id_class[id_implements[52]] - d9;
                d6 = an_32.Ps().id_protected - (Double)bg_3.id_protected.rW.id_class[id_implements[53]] - d11;
                d7 = an_32.Ps().id_break + (Double)bg_3.id_protected.rW.id_class[id_implements[54]] - d9;
                d5 = an_32.Ps().id_protected + (Double)bg_3.id_protected.rW.id_class[id_implements[55]] - d11;
                d2 = (double)((Integer)((rJ_2)rP_22).id_class[id_implements[56]]).intValue() - d10;
                d = d2 + id_native[37];
                d4 = id_native[38] + d12 + (double)((Integer)((rJ_2)object).id_class[id_implements[57]]).intValue() - d10;
                d3 = id_native[39] - d12 + (double)((Integer)((rJ_2)object).id_class[id_implements[58]]).intValue() - d10;
            } else {
                return;
            }
        }
        bj_3.id_class(color, ((Float)bg_3.id_protected.rQ.id_class[id_implements[59]]).floatValue(), (Boolean)bg_3.id_protected.PJ.id_class[id_implements[60]]);
        bg_3.id_class(ml_1, d8, d7, d6, d5, d4);
        bg_3.id_class(ml_1, d8, d7, d6, d5, d3);
        object = ml_1.id_byte().id_class();
        id_case.id_class(id_catch[18], ju_3.id_super);
        id_case.id_class((rjV_2)object, (float)d8, (float)d2, (float)d6).id_class();
        id_case.id_class((rjV_2)object, (float)d8, (float)d, (float)d6).id_class();
        id_case.id_class((rjV_2)object, (float)d7, (float)d2, (float)d6).id_class();
        id_case.id_class((rjV_2)object, (float)d7, (float)d, (float)d6).id_class();
        id_case.id_class((rjV_2)object, (float)d7, (float)d2, (float)d5).id_class();
        id_case.id_class((rjV_2)object, (float)d7, (float)d, (float)d5).id_class();
        id_case.id_class((rjV_2)object, (float)d8, (float)d2, (float)d5).id_class();
        id_case.id_class((rjV_2)object, (float)d8, (float)d, (float)d5).id_class();
        id_throws.id_break();
        bj_3.id_class((Boolean)bg_3.id_protected.PJ.id_class[id_implements[61]]);
    }

    public static void id_class(Ml_1 ml_1, an_3 an_32, Collection<rfH_2> collection, Color color) {
        bj_3.id_class(color, ((Float)bg_3.id_protected.id_break.id_class[id_implements[37]]).floatValue(), (Boolean)bg_3.id_protected.rE.id_class[id_implements[38]]);
        bw_3 bw_32 = new bw_3(C_throws.id_class().id_break().id_throw());
        collection.forEach(rfH_22 -> {
            xc_3 xc_32 = bw_32.id_class((rfH_2)rfH_22);
            rjC_2 rjC_22 = xc_32.id_finally((rYB)an_32.id_throws[id_implements[62]], (rfH_2)rfH_22);
            rfl_3 rfl_32 = rjC_22.id_break() ? rjw_3.id_break().id_class() : rjC_22.id_class();
            rfl_32 = rfl_32.id_class((rfH_2)rfH_22);
            bj_3.id_class(ml_1, rfl_32, id_native[41]);
        });
        bj_3.id_class((Boolean)bg_3.id_protected.rE.id_class[id_implements[39]]);
    }

    public static double id_class() {
        return id_byte.id_private();
    }

    public static void id_class(Ml_1 ml_1, double d, double d2, double d3, double d4, double d5, double d6) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        double d7 = bg_3.id_byte();
        double d8 = bg_3.id_break();
        double d9 = bg_3.id_class();
        boolean bl = (Boolean)bg_3.id_protected.E.id_class[id_implements[36]] == false ? id_catch[9] : id_catch[10];
        id_case.id_class((int)(bl ? id_extends[5] : id_catch[11]), ju_3.id_super);
        id_case.id_class(rjV_22, (float)(d + id_native[0] - d7), (float)(d2 + id_native[1] - d8), (float)(d3 + id_native[2] - d9)).id_class();
        id_case.id_class(rjV_22, (float)(d4 + id_native[3] - d7), (float)(d5 + id_native[4] - d8), (float)(d6 + id_native[5] - d9)).id_class();
        if (bl) {
            id_case.id_class(rjV_22, (float)(d4 + id_native[6] - d7), (float)(d5 + id_native[7] - d8), (float)(d6 + id_native[8] - d9)).id_class();
            id_case.id_class(rjV_22, (float)(d + id_native[9] - d7), (float)(d2 + id_native[10] - d8), (float)(d3 + id_native[11] - d9)).id_class();
            id_case.id_class(rjV_22, (float)(d + id_native[12] - d7), (float)(d2 + id_native[13] - d8), (float)(d3 + id_native[14] - d9)).id_class();
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB22946D47BECDE86L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6A732C59;
    }

    public static void id_class(Ml_1 ml_1, a_1 a_12, int n, Color color, boolean bl, int n2, int n3) {
        bj_3.id_class(color, ((Float)bg_3.id_protected.id_break.id_class[id_implements[15]]).floatValue(), (Boolean)bg_3.id_protected.rk.id_class[id_implements[16]]);
        int n4 = n2 + n;
        int n5 = n3 + n;
        List<rU_2> list = a_12.id_break();
        int n6 = n;
        while (n6 < list.size() - id_catch[2]) {
            rU_2 rU_22 = list.get(n6);
            int n7 = n6 + id_catch[3];
            rU_2 rU_23 = list.get(n7);
            int n8 = (Integer)rU_23.id_break[id_implements[17]] - (Integer)rU_22.id_break[id_implements[18]];
            int n9 = (Integer)rU_23.id_break[id_implements[19]] - (Integer)rU_22.id_break[id_implements[20]];
            int n10 = (Integer)rU_23.id_break[id_implements[21]] - (Integer)rU_22.id_break[id_implements[22]];
            while (!(n7 + id_catch[4] >= list.size() || bl && n7 + id_catch[5] >= n4 || n8 != (Integer)list.get((int)(n7 + bg_3.id_catch[6])).id_break[id_implements[23]] - (Integer)rU_23.id_break[id_implements[24]] || n9 != (Integer)list.get((int)(n7 + bg_3.id_catch[7])).id_break[id_implements[25]] - (Integer)rU_23.id_break[id_implements[26]] || n10 != (Integer)list.get((int)(n7 + bg_3.id_catch[8])).id_break[id_implements[27]] - (Integer)rU_23.id_break[id_implements[28]])) {
                rU_23 = list.get(++n7);
            }
            if (bl) {
                float f;
                if (n6 <= n4) {
                    f = id_private[0];
                } else {
                    if (n6 > n5) break;
                    f = id_private[1] * (id_private[2] - (float)(n6 - n4) / (float)(n5 - n4));
                }
                bj_3.id_class(color, f);
            }
            bg_3.id_class(ml_1, ((Integer)rU_22.id_break[id_implements[29]]).intValue(), (double)((Integer)rU_22.id_break[id_implements[30]]).intValue(), ((Integer)rU_22.id_break[id_implements[31]]).intValue(), ((Integer)rU_23.id_break[id_implements[32]]).intValue(), (double)((Integer)rU_23.id_break[id_implements[33]]).intValue(), (double)((Integer)rU_23.id_break[id_implements[34]]).intValue());
            id_throws.id_break();
            n6 = n7;
        }
        bj_3.id_class((Boolean)bg_3.id_protected.rk.id_class[id_implements[35]]);
    }

    public static void id_class(T t, BO bO) {
        rRJ rRJ2;
        rRJ rRJ3;
        float f = t.id_break();
        rP_2 rP_22 = bO.id_byte();
        if ((vm_3)PP.b_.id_class[id_implements[0]] instanceof bf_3) {
            ((bf_3)((vm_3)PP.b_.id_class[id_implements[1]])).id_class(t.id_byte(), t.id_class());
        }
        if ((rRJ3 = ((C_class)bO.id_class[id_implements[2]]).id_throw().id_case().id_default()) != (rRJ2 = C_throws.id_class().id_break().id_throw().id_case().id_default())) {
            return;
        }
        an_3 an_32 = PP.b_.id_catch();
        if ((rYB)an_32.id_throws[id_implements[3]] != C_throws.id_class().id_break().id_throw().id_case()) {
            System.out.println(id_finally[0]);
            System.out.println(id_finally[1]);
            System.out.println(id_finally[2]);
            return;
        }
        if (rP_22 != null && ((Boolean)bg_3.id_protected.Ps.id_class[id_implements[4]]).booleanValue()) {
            bg_3.id_class(t.id_byte(), an_32, rP_22, f, (Color)bg_3.id_protected.Po.id_class[id_implements[5]]);
        }
        if (!((Boolean)bg_3.id_protected.x.id_class[id_implements[6]]).booleanValue()) {
            return;
        }
        Gh_1 gh_1 = bO.id_new();
        Gh_1 gh_12 = bO.id_package();
        if (gh_1 != null && ((Boolean)bg_3.id_protected.g.id_class[id_implements[7]]).booleanValue()) {
            bg_3.id_class(t.id_byte(), an_32, gh_1.id_catch(), (Color)bg_3.id_protected.rV.id_class[id_implements[8]]);
            bg_3.id_class(t.id_byte(), an_32, gh_1.id_case(), (Color)bg_3.id_protected.rD.id_class[id_implements[9]]);
            bg_3.id_class(t.id_byte(), an_32, gh_1.id_finally(), (Color)bg_3.id_protected.Px.id_class[id_implements[10]]);
        }
        if (gh_1 != null && gh_1.id_class() != null) {
            int n = Math.max(gh_1.id_break() - id_extends[0], id_catch[0]);
            bg_3.id_class(t.id_byte(), gh_1.id_class(), n, (Color)bg_3.id_protected.rf.id_class[id_implements[11]], (Boolean)bg_3.id_protected.rn.id_class[id_implements[12]], id_extends[1], id_extends[2]);
        }
        if (gh_12 != null && gh_12.id_class() != null) {
            bg_3.id_class(t.id_byte(), gh_12.id_class(), id_catch[1], (Color)bg_3.id_protected.L.id_class[id_implements[13]], (Boolean)bg_3.id_protected.rn.id_class[id_implements[14]], id_extends[3], id_extends[4]);
        }
        bO.id_case().ifPresent(eW -> {
            eW.id_class().ifPresent(a_12 -> bg_3.id_class(t.id_byte(), a_12, id_catch[20], (Color)bg_3.id_protected.ri.id_class[id_implements[66]], (Boolean)bg_3.id_protected.rn.id_class[id_implements[67]], id_extends[10], id_extends[11]));
            eW.id_protected().ifPresent(a_12 -> {
                bg_3.id_class(t.id_byte(), a_12, id_catch[19], (Color)bg_3.id_protected.R.id_class[id_implements[63]], (Boolean)bg_3.id_protected.rn.id_class[id_implements[64]], id_extends[8], id_extends[9]);
                bg_3.id_class(t.id_byte(), an_32, Collections.singletonList(a_12.id_protected()), (Color)bg_3.id_protected.R.id_class[id_implements[65]]);
            });
        });
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-57, 27, 77, 58, 123, 41, 39, -41}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class(Ml_1 ml_1, double d, double d2, double d3, double d4, double d5) {
        if (d5 != id_native[40]) {
            rjV_2 rjV_22 = ml_1.id_byte().id_class();
            id_case.id_class((int)id_extends[7], ju_3.id_super);
            id_case.id_class(rjV_22, (float)d, (float)d5, (float)d3).id_class();
            id_case.id_class(rjV_22, (float)d2, (float)d5, (float)d3).id_class();
            id_case.id_class(rjV_22, (float)d2, (float)d5, (float)d4).id_class();
            id_case.id_class(rjV_22, (float)d, (float)d5, (float)d4).id_class();
            id_throws.id_break();
        }
    }

    public static double id_break() {
        return id_byte.id_catch();
    }

    private static void id_throws() {
        float[] fArray = new float[8];
        fArray[0] = 0.4f;
        fArray[1] = 0.4f;
        fArray[2] = 1.0f;
        fArray[3] = 20000.0f;
        fArray[5] = 1.0f;
        fArray[6] = 0.2f;
        fArray[7] = 0.25f;
        id_private = fArray;
    }

    private static /* synthetic */ void ntfClinit() {
        bg_3.id_extends();
        bg_3.id_private();
        bg_3.id_protected();
        bg_3.id_finally();
        bg_3.id_throws();
        bg_3.id_catch();
        bg_3.id_implements();
        bg_3.id_case();
    }

    private static void id_finally() {
        short[] sArray = new short[68];
        sArray[0] = 73;
        sArray[1] = 73;
        sArray[3] = 7;
        sArray[19] = 1;
        sArray[20] = 1;
        sArray[21] = 2;
        sArray[22] = 2;
        sArray[25] = 1;
        sArray[26] = 1;
        sArray[27] = 2;
        sArray[28] = 2;
        sArray[30] = 1;
        sArray[31] = 2;
        sArray[33] = 1;
        sArray[34] = 2;
        sArray[47] = 7;
        sArray[48] = 256;
        sArray[62] = 7;
        id_implements = sArray;
    }

    private static void id_catch() {
        double[] dArray = new double[42];
        dArray[0] = 0.5;
        dArray[1] = 0.5;
        dArray[2] = 0.5;
        dArray[3] = 0.5;
        dArray[4] = 0.5;
        dArray[5] = 0.5;
        dArray[6] = 0.5;
        dArray[7] = 0.53;
        dArray[8] = 0.5;
        dArray[9] = 0.5;
        dArray[10] = 0.53;
        dArray[11] = 0.5;
        dArray[12] = 0.5;
        dArray[13] = 0.5;
        dArray[14] = 0.5;
        dArray[15] = 0.999f;
        dArray[16] = Math.PI;
        dArray[17] = 2.0;
        dArray[18] = 0.002;
        dArray[19] = 0.002;
        dArray[20] = 0.002;
        dArray[21] = 0.002;
        dArray[22] = 2.0;
        dArray[23] = 1.0;
        dArray[24] = 1.0;
        dArray[25] = 2.0;
        dArray[26] = 0.5;
        dArray[27] = 0.5;
        dArray[28] = 1.0;
        dArray[29] = 0.002;
        dArray[30] = 0.002;
        dArray[31] = 0.002;
        dArray[32] = 0.002;
        dArray[36] = 256.0;
        dArray[37] = 2.0;
        dArray[38] = 1.0;
        dArray[39] = 1.0;
        dArray[41] = 0.002;
        id_native = dArray;
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[23];
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[22] = true;
        id_catch = blArray;
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rqO_2(id_finally[3])};
        id_class = objectArray;
    }

    private static void id_implements() {
        id_extends = new byte[]{3, 10, 20, 10, 20, 3, 64, 2, 10, 20, 10, 20};
    }

    private static void id_protected() {
        long[] lArray = new long[3];
        lArray[0] = 100000L;
        lArray[1] = 20000L;
        id_break = lArray;
    }

    private static void id_private() {
        id_finally = new String[]{new String("I have no idea what's going on"), new String("The primary baritone is in a different world than the render view entity"), new String("Not rendering the path"), new String("textures/entity/beacon_beam.png")};
    }
}

