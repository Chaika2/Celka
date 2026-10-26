/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrfD_2;
import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.rrvj_1;
import celestial.rrwh_3;
import celestial.rrws_3;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import celestial.util.MinecraftAccessor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwb_3 {
    public static Object[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;
    private static float[] id_protected;
    private static boolean[] id_throws;
    private static String[] id_case;

    private static void id_byte() {
        short[] sArray = new short[13];
        sArray[2] = 4;
        sArray[3] = 4;
        sArray[5] = 5;
        sArray[6] = 5;
        sArray[8] = 12;
        sArray[9] = 230;
        sArray[10] = 200;
        sArray[11] = 230;
        sArray[12] = 200;
        id_break = sArray;
    }

    private rrwb_3() {
    }

    static {
        rrwb_3.ntfClinit();
    }

    private static void id_class(Ml_1 ml_1, rrtN_2 rrtN_22) {
        rrws_3 rrws_32 = rrtN_22.id_short();
        if (!rrws_32.id_class()) {
            return;
        }
        float f = rrws_32.id_byte();
        float f2 = rrws_32.id_throws();
        float f3 = rrws_32.id_extends();
        float f4 = rrws_32.id_private();
        float f5 = ((AnimValue)id_class[id_break[8]]).id_final();
        int n = (int)(id_protected[14] + id_protected[15] * f5);
        rrfD_2.id_class(ml_1, f, f2, f3, f4, ColorHelper.id_break(rrZF.d_, n));
        float f6 = Math.min(Math.max(Math.min(f3, f4) * id_protected[16], id_protected[17]), id_protected[18]);
        float f7 = id_protected[19];
        int n2 = ColorHelper.id_break(rrZF.d_, id_break[9]);
        rrfD_2.id_class(ml_1, f, f2, f6, f7, n2);
        rrfD_2.id_class(ml_1, f, f2, f7, f6, n2);
        rrfD_2.id_class(ml_1, f + f3 - f6, f2, f6, f7, n2);
        rrfD_2.id_class(ml_1, f + f3 - f7, f2, f7, f6, n2);
        rrfD_2.id_class(ml_1, f, f2 + f4 - f7, f6, f7, n2);
        rrfD_2.id_class(ml_1, f, f2 + f4 - f6, f7, f6, n2);
        rrfD_2.id_class(ml_1, f + f3 - f6, f2 + f4 - f7, f6, f7, n2);
        rrfD_2.id_class(ml_1, f + f3 - f7, f2 + f4 - f6, f7, f6, n2);
        float f8 = f + f3 / id_protected[20];
        float f9 = f2 + f4 / id_protected[21];
        int n3 = ColorHelper.id_break(rrZF.d_, id_break[10]);
        rrfD_2.id_class(ml_1, f8 - id_protected[22], f9 - id_protected[23], id_protected[24], id_protected[25], n3);
        rrfD_2.id_class(ml_1, f8 - id_protected[26], f9 - id_protected[27], id_protected[28], id_protected[29], n3);
    }

    public static void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, float f, float f2) {
        rrvj_1 rrvj_12;
        MinecraftAccessor minecraftAccessor;
        rrtN_2 rrtN_22 = rrwb_3.id_class(rrtu_32);
        if (rrtN_22 == null) {
            return;
        }
        rrwh_3 rrwh_32 = rrtN_22.id_short().id_implements();
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.defaultBlendFunc();
        rrfD_2.id_throws(MinecraftAccessor.id_strictfp);
        if (rrwh_32 != null) {
            rrwb_3.id_class(ml_1, rrwh_32, f, f2);
        }
        rrwb_3.id_class(ml_1, rrtN_22);
        rrfD_2.id_break();
        if (rrtN_22 instanceof rrvj_1 && ((rrvj_1)(minecraftAccessor = (rrvj_1)rrtN_22)).id_return().id_byte() > id_protected[5]) {
            return;
        }
        minecraftAccessor = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_break[1]]).id_implements();
        float f3 = rrtN_22.id_default() + rrtN_22.id_implements() / id_protected[6];
        float f4 = rrtN_22.id_abstract() - rrtN_22.au_() - id_protected[7];
        String string = rrtN_22 instanceof rrvj_1 && (rrvj_12 = (rrvj_1)rrtN_22).id_continue() ? id_case[0] : id_case[1];
        ((rrZO)minecraftAccessor).id_byte(ml_1, string, f3, f4, rrZF.d_, id_throws[1]);
    }

    private static rrtN_2 id_class(rrtu_3 rrtu_32) {
        for (rrtN_2 rrtN_22 : rrtu_32.id_class()) {
            if (!(rrtN_22 instanceof rrvj_1) || !rrtN_22.id_short().id_catch()) continue;
            return rrtN_22;
        }
        return null;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD7F13782;
    }

    private static void id_class(Ml_1 ml_1, rrwh_3 rrwh_32, float f, float f2) {
        if ((Float)rrwh_32.id_class[id_break[2]] != null) {
            rrfD_2.id_class(ml_1, ((Float)rrwh_32.id_class[id_break[3]]).floatValue() - id_protected[8], id_protected[9], id_protected[10], f2, (Integer)id_class[id_break[4]]);
        }
        if ((Float)rrwh_32.id_class[id_break[5]] != null) {
            rrfD_2.id_class(ml_1, id_protected[11], ((Float)rrwh_32.id_class[id_break[6]]).floatValue() - id_protected[12], f, id_protected[13], (Integer)id_class[id_break[7]]);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCA4FB4096E5861B3L;
    }

    public static void id_class(Ml_1 ml_1, rrtu_3 rrtu_32) {
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_break[0]]).id_implements();
        for (rrtN_2 rrtN_22 : rrtu_32.id_class()) {
            if (!(rrtN_22 instanceof rrvj_1)) continue;
            rrvj_1 rrvj_12 = (rrvj_1)rrtN_22;
            if (!rrtN_22.aq_()) continue;
            rrvj_12.id_else();
            float f = rrvj_12.id_return().id_byte();
            float f2 = rrvj_12.id_long();
            if (f <= id_protected[0] || f2 <= id_protected[1] || rrvj_12.id_break() == null) continue;
            int n = (int)(f * f2 * id_protected[2]);
            int n2 = ColorHelper.id_break(rrZF.d_, n);
            float f3 = rrtN_22.id_default() + rrtN_22.id_implements() / id_protected[3];
            float f4 = rrtN_22.id_abstract() - rrtN_22.au_() - id_protected[4];
            rrZO2.id_byte(ml_1, rrvj_12.id_break(), f3, f4, n2, id_throws[0]);
        }
    }

    private static void id_class() {
        id_byte = new byte[]{7, 12, 16, 2, 30, 3, 80, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-48, 22, 124, 46, -108, -103, 18, -120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{-1315861, Float.valueOf(0.0f), 30, 80, 230, 200, Float.valueOf(0.0f), Float.valueOf(-0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), new AnimValue(0.25f, false), id_case[2], id_case[3], Float.valueOf(0.0f)};
        id_class = objectArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[7];
        blArray[6] = true;
        id_throws = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrwb_3.id_throws();
        rrwb_3.id_case();
        rrwb_3.id_byte();
        rrwb_3.id_protected();
        rrwb_3.id_class();
        rrwb_3.id_break();
    }

    private static void id_case() {
        id_case = new String[]{new String("\u041f\u041a\u041c - \u041e\u0442\u043a\u043b\u044e\u0447\u0438\u0442\u044c \u0446\u0435\u043d\u0442\u0440\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435"), new String("\u041f\u041a\u041c - \u0412\u043a\u043b\u044e\u0447\u0438\u0442\u044c \u0446\u0435\u043d\u0442\u0440\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435"), new String("\u041f\u041a\u041c - \u0412\u043a\u043b\u044e\u0447\u0438\u0442\u044c \u0446\u0435\u043d\u0442\u0440\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435"), new String("\u041f\u041a\u041c - \u041e\u0442\u043a\u043b\u044e\u0447\u0438\u0442\u044c \u0446\u0435\u043d\u0442\u0440\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435")};
    }

    private static void id_protected() {
        float[] fArray = new float[39];
        fArray[2] = 255.0f;
        fArray[3] = 2.0f;
        fArray[4] = 8.0f;
        fArray[5] = 0.01f;
        fArray[6] = 2.0f;
        fArray[7] = 8.0f;
        fArray[8] = 0.25f;
        fArray[10] = 0.5f;
        fArray[12] = 0.25f;
        fArray[13] = 0.5f;
        fArray[14] = 30.0f;
        fArray[15] = 50.0f;
        fArray[16] = 0.18f;
        fArray[17] = 6.0f;
        fArray[18] = 18.0f;
        fArray[19] = 1.0f;
        fArray[20] = 2.0f;
        fArray[21] = 2.0f;
        fArray[22] = 2.5f;
        fArray[23] = 0.5f;
        fArray[24] = 5.0f;
        fArray[25] = 1.0f;
        fArray[26] = 0.5f;
        fArray[27] = 2.5f;
        fArray[28] = 1.0f;
        fArray[29] = 5.0f;
        fArray[30] = 0.25f;
        fArray[31] = 0.5f;
        fArray[32] = 1.0f;
        fArray[33] = 0.18f;
        fArray[34] = 6.0f;
        fArray[35] = 18.0f;
        fArray[36] = 2.5f;
        fArray[37] = 1.0f;
        fArray[38] = 8.0f;
        id_protected = fArray;
    }
}

