/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Qw_1;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfN_2 {
    private static short[] id_class;
    private static double[] id_break;
    private static float[] id_byte;

    private static void id_byte() {
        id_class = new short[]{20};
    }

    static {
        rrfN_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2F5A373E;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6426AA52FADB453BL;
    }

    private static void id_class() {
        id_break = new double[]{0.15, 0.6, 0.2};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-3, -50, 114, 55, 10, -92, 30, -100}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static float id_class(float f) {
        return rrfN_2.id_break(f) * rrfN_2.id_break();
    }

    private static float id_break(float f) {
        return Math.round(f / rrfN_2.id_break());
    }

    private static float id_break() {
        return (float)((double)rrfN_2.id_throws() * id_break[0]);
    }

    private static float id_throws() {
        float f = (float)(((Qw_1)MinecraftAccessor.id_import.id_class[rrfN_2.id_class[0]]).id_class * id_break[1] + id_break[2]);
        return f * f * f * id_byte[0];
    }

    private static /* synthetic */ void ntfClinit() {
        rrfN_2.id_class();
        rrfN_2.id_byte();
        rrfN_2.id_protected();
    }

    private static void id_protected() {
        id_byte = new float[]{8.0f};
    }
}

