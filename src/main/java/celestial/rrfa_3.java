/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package celestial;

import celestial.Hh_1;
import celestial.MT;
import celestial.Ml_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.cb_3;
import celestial.eX_2;
import celestial.rjK_2;
import celestial.rjU_2;
import celestial.rjV_2;
import celestial.rji_3;
import celestial.rrjZ_2;
import celestial.util.MinecraftAccessor;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class rrfa_3
implements MinecraftAccessor {
    private static short[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public static Object[] id_class;
    private static float[] id_throws;
    private static int[] id_case;

    private static void id_byte() {
        short[] sArray = new short[17];
        sArray[0] = 255;
        sArray[1] = 255;
        sArray[2] = 255;
        sArray[3] = 255;
        sArray[4] = 57;
        sArray[5] = 16;
        sArray[6] = 57;
        sArray[8] = 3089;
        sArray[9] = 1;
        sArray[10] = 3088;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 3089;
        id_break = sArray;
    }

    static {
        rrfa_3.ntfClinit();
    }

    public static void id_class(rjV_2 rjV_22, rjV_2 rjV_23, float f) {
        rjV_2 rjV_24 = new rjV_2(rjV_22);
        rjV_24.id_throws();
        rjV_2 rjV_25 = new rjV_2(rjV_23);
        rjV_25.id_throws();
        rji_3 rji_32 = new rji_3(id_throws[45], id_throws[46], id_throws[47], id_throws[48]);
        rji_32.id_class(rjV_24);
        rji_32.id_class(rjV_25);
        rji_32.id_class(rji_32.id_protected());
        rjU_2 rjU_22 = (cb_3)rrfa_3.id_import.id_class[id_break[4]] == null ? ((Hh_1)rrfa_3.id_import.id_class[id_break[5]]).id_finally().id_break() : ((cb_3)rrfa_3.id_import.id_class[id_break[6]]).id_new(f);
        rjU_2 rjU_23 = new rjU_2(rjU_22.id_break + (double)rji_32.id_class(), rjU_22.id_byte + (double)rji_32.id_break(), rjU_22.id_protected + (double)rji_32.id_byte());
        rrfa_3.id_class[rrfa_3.id_break[7]] = rjU_23;
    }

    public static rji_3 id_class(rjV_2 rjV_22, an_3 an_32, float f) {
        float f2 = an_32.Bd();
        float f3 = an_32.Bm();
        float f4 = (float)rrjZ_2.id_throws(an_32, f);
        float f5 = (float)rrjZ_2.id_private(an_32, f);
        float f6 = (float)rrjZ_2.id_class(an_32, f);
        if (an_32.BC() == aI_2.id_short) {
            f5 = an_32.id_extends(f);
        }
        float f7 = f4 - f2;
        float f8 = f6 - f2;
        float f9 = f4 + f2;
        float f10 = f5 + f3;
        float f11 = f6 + f2;
        float f12 = rjV_22.id_class;
        float f13 = rjV_22.id_break;
        float f14 = rjV_22.id_byte;
        float f15 = rjV_22.id_protected;
        float f16 = rjV_22.id_throws;
        float f17 = rjV_22.id_case;
        float f18 = rjV_22.id_catch;
        float f19 = rjV_22.id_private;
        float f20 = rjV_22.id_volatile;
        float f21 = rjV_22.id_final;
        float f22 = rjV_22.id_package;
        float f23 = rjV_22.id_int;
        float f24 = (f7 + f9) * id_throws[0];
        float f25 = (f5 + f10) * id_throws[1];
        float f26 = (f8 + f11) * id_throws[2];
        float f27 = (f9 - f7) * id_throws[3];
        float f28 = (f10 - f5) * id_throws[4];
        float f29 = (f11 - f8) * id_throws[5];
        float f30 = f20 * f24 + f21 * f25 + f22 * f26 + f23;
        float f31 = Math.abs(f20) * f27 + Math.abs(f21) * f28 + Math.abs(f22) * f29;
        if (f30 + f31 < id_throws[6]) {
            return new rji_3(id_throws[7], id_throws[8], id_throws[9], id_throws[10]);
        }
        float f32 = id_const.id_volatile();
        float f33 = id_const.id_final();
        float f34 = id_throws[11];
        float f35 = id_throws[12];
        float f36 = id_throws[13];
        float f37 = id_throws[14];
        for (int i = id_protected[0]; i < id_byte[0]; ++i) {
            float f38;
            float f39;
            float f40 = (i & id_protected[1]) == 0 ? f7 : f9;
            float f41 = f20 * f40 + f21 * (f39 = (i & id_byte[1]) == 0 ? f5 : f10) + f22 * (f38 = (i & id_byte[2]) == 0 ? f8 : f11) + f23;
            if (f41 < id_throws[15]) continue;
            float f42 = id_throws[16] / f41;
            float f43 = (f12 * f40 + f13 * f39 + f14 * f38 + f15) * f42;
            float f44 = (f16 * f40 + f17 * f39 + f18 * f38 + f19) * f42;
            float f45 = f32 * id_throws[17] + id_throws[18] * (f43 * f32 + id_throws[19]);
            float f46 = f33 * id_throws[20] - id_throws[21] * (f44 * f33 + id_throws[22]);
            if (f45 < f34) {
                f34 = f45;
            }
            if (f46 < f35) {
                f35 = f46;
            }
            if (f45 > f36) {
                f36 = f45;
            }
            if (!(f46 > f37)) continue;
            f37 = f46;
        }
        return new rji_3(f34, f35, f36, f37);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1316A38755E9B65BL;
    }

    public static void id_class(int n) {
        float f = (float)(n >> id_byte[3] & id_break[0]) / id_throws[37];
        float f2 = (float)(n >> id_byte[4] & id_break[1]) / id_throws[38];
        float f3 = (float)(n & id_break[2]) / id_throws[39];
        float f4 = (float)(n >> id_byte[5] & id_break[3]) / id_throws[40];
        MT.id_protected(f, f2, f3, f4);
    }

    private static boolean id_class(rjV_2 rjV_22, float f, float f2, float f3, rjK_2 rjK_22, float f4, float f5) {
        float f6 = rjV_22.id_volatile * f + rjV_22.id_final * f2 + rjV_22.id_package * f3 + rjV_22.id_int;
        if (f6 < id_throws[23]) {
            return id_protected[2];
        }
        float f7 = id_throws[24] / f6;
        float f8 = (rjV_22.id_class * f + rjV_22.id_break * f2 + rjV_22.id_byte * f3 + rjV_22.id_protected) * f7;
        float f9 = (rjV_22.id_throws * f + rjV_22.id_case * f2 + rjV_22.id_catch * f3 + rjV_22.id_private) * f7;
        rjK_22.id_class(f4 * id_throws[25] + id_throws[26] * (f8 * f4 + id_throws[27]), f5 * id_throws[28] - id_throws[29] * (f9 * f5 + id_throws[30]));
        return id_protected[3];
    }

    public static void id_class() {
        MT.id_protected(id_throws[41], id_throws[42], id_throws[43], id_throws[44]);
    }

    public static rji_3 id_class(rjV_2 rjV_22, eX_2 eX_22) {
        float f;
        float f2 = (float)(eX_22.id_class() - id_void.id_case());
        float f3 = (float)(eX_22.id_break() - id_void.id_catch());
        float f4 = (float)(eX_22.id_byte() - id_void.id_private());
        rji_3 rji_32 = new rji_3(id_throws[31], id_throws[32], id_throws[33], id_throws[34]);
        rjK_2 rjK_22 = new rjK_2(id_throws[35], id_throws[36]);
        float f5 = id_const.id_volatile();
        if (rrfa_3.id_class(rjV_22, f2, f3, f4, rjK_22, f5, f = id_const.id_final())) {
            rji_32.id_class(Math.min(rjK_22.id_byte, rji_32.id_class()), Math.min(rjK_22.id_protected, rji_32.id_break()), Math.max(rjK_22.id_byte, rji_32.id_byte()), Math.max(rjK_22.id_protected, rji_32.id_protected()));
        }
        return rji_32;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{65, -61, -107, 94, -128, 91, 79, -72}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static float id_class(Ml_1 ml_1) {
        return ml_1.id_throws();
    }

    public static void id_class(Ml_1 ml_1, Runnable runnable, float f, float f2, float f3, float f4) {
        ml_1.id_class();
        int n = (int)(f *= id_throws[51]);
        int n2 = (int)((float)id_const.id_continue() - ((f2 *= id_throws[52]) + (f4 *= id_throws[50])));
        int n3 = (int)(f3 *= id_throws[49]);
        int n4 = (int)f4;
        GL11.glPushAttrib((int)id_case[0]);
        if (GL11.glGetBoolean((int)id_break[8])) {
            ((IntBuffer)id_class[id_break[9]]).rewind();
            GL11.glGetIntegerv((int)id_break[10], (IntBuffer)((IntBuffer)id_class[id_break[11]]));
            n = Math.max(n, ((IntBuffer)id_class[id_break[12]]).get(id_protected[4]));
            n2 = Math.max(n2, ((IntBuffer)id_class[id_break[13]]).get(id_protected[5]));
            n3 = Math.min(n3, ((IntBuffer)id_class[id_break[14]]).get(id_byte[6]));
            n4 = Math.min(n4, ((IntBuffer)id_class[id_break[15]]).get(id_byte[7]));
        } else {
            GL11.glEnable((int)id_break[16]);
        }
        GL11.glScissor((int)n, (int)n2, (int)n3, (int)n4);
        runnable.run();
        GL11.glPopAttrib();
        ml_1.id_break();
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9851EAD;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        id_protected = blArray;
    }

    private static void id_throws() {
        Object[] objectArray = new Object[2];
        objectArray[1] = BufferUtils.createIntBuffer((int)16);
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfa_3.id_break();
        rrfa_3.id_catch();
        rrfa_3.id_byte();
        rrfa_3.id_case();
        rrfa_3.id_protected();
        rrfa_3.id_throws();
    }

    private static void id_catch() {
        float[] fArray = new float[53];
        fArray[0] = 0.5f;
        fArray[1] = 0.5f;
        fArray[2] = 0.5f;
        fArray[3] = 0.5f;
        fArray[4] = 0.5f;
        fArray[5] = 0.5f;
        fArray[6] = 0.01f;
        fArray[7] = Float.MAX_VALUE;
        fArray[8] = Float.MAX_VALUE;
        fArray[9] = Float.MIN_VALUE;
        fArray[10] = Float.MIN_VALUE;
        fArray[11] = Float.MAX_VALUE;
        fArray[12] = Float.MAX_VALUE;
        fArray[13] = Float.MIN_VALUE;
        fArray[14] = Float.MIN_VALUE;
        fArray[15] = 0.01f;
        fArray[16] = 1.0f;
        fArray[17] = 0.5f;
        fArray[18] = 0.5f;
        fArray[19] = 1.0f;
        fArray[20] = 0.5f;
        fArray[21] = 0.5f;
        fArray[22] = 1.0f;
        fArray[23] = 0.01f;
        fArray[24] = 1.0f;
        fArray[25] = 0.5f;
        fArray[26] = 0.5f;
        fArray[27] = 1.0f;
        fArray[28] = 0.5f;
        fArray[29] = 0.5f;
        fArray[30] = 1.0f;
        fArray[31] = Float.MAX_VALUE;
        fArray[32] = Float.MAX_VALUE;
        fArray[33] = -1.0f;
        fArray[34] = -1.0f;
        fArray[37] = 255.0f;
        fArray[38] = 255.0f;
        fArray[39] = 255.0f;
        fArray[40] = 255.0f;
        fArray[41] = 1.0f;
        fArray[42] = 1.0f;
        fArray[43] = 1.0f;
        fArray[44] = 1.0f;
        fArray[48] = 1.0f;
        fArray[49] = 2.0f;
        fArray[50] = 2.0f;
        fArray[51] = 2.0f;
        fArray[52] = 2.0f;
        id_throws = fArray;
    }

    private static void id_case() {
        id_byte = new byte[]{8, 2, 4, 16, 8, 24, 2, 3, 16, 2};
    }

    private static void id_protected() {
        id_case = new int[]{524288};
    }
}

