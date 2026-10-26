/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rqO_2;
import celestial.rrZO;
import celestial.rrfD_2;
import celestial.rrtm_3;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtF_2 {
    private static boolean[] id_class;
    private static short[] id_break;

    public static void id_byte(Ml_1 ml_1, rrtm_3 rrtm_32, rrZO rrZO2, String string, float f, float f2, int n, int n2) {
        rrZO2.id_break(ml_1, string, (double)f, (double)f2, ColorHelper.id_break(n, rrtm_32.id_class(n2)), id_class[5]);
    }

    static {
        rrtF_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x50E751E;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-90, 7, -62, 58, 33, -23, 87, 18}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, int n, int n2) {
        rrfD_2.id_class(ml_1, f, f2, f3, f4, f5, f5, f5, f5, ColorHelper.id_break(n, n2));
    }

    public static void id_class(Ml_1 ml_1, rrtm_3 rrtm_32, float f, float f2, float f3, int n, float f4) {
        rrfD_2.id_class(ml_1, f, f2, f3, ColorHelper.id_break(n, rrtm_32.id_class(id_break[0])), f4);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, int n, int n2, int n3) {
        rrfD_2.id_class(ml_1, f, f2, (float)((int)f3), (float)((int)f4), n, ColorHelper.id_break(n2, n3));
    }

    public static void id_class(Ml_1 ml_1, rrZO rrZO2, String string, float f, float f2, int n, int n2, int n3, float f3, float f4) {
        rrZO2.id_class(ml_1, string, f, f2, ColorHelper.id_break(n, n2), (float)n3, f3, f4);
    }

    public static void id_class(Ml_1 ml_1, rrZO rrZO2, String string, float f, float f2, int n, int n2, int n3) {
        rrZO2.id_class(ml_1, string, f, f2, ColorHelper.id_break(n, n2), (float)n3);
    }

    public static void id_class(Ml_1 ml_1, rrtm_3 rrtm_32, rrZO rrZO2, String string, float f, float f2, int n, int n2, boolean bl) {
        rrZO2.id_class(ml_1, string, (double)f, (double)f2, n, rrtm_32.id_class(n2), bl);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, int n, int n2) {
        rrfD_2.id_protected(ml_1, f, f2, f3, f4, ColorHelper.id_break(n, n2));
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, int n, int n2, int n3, int n4, int n5) {
        rrfD_2.id_break(ml_1, f, f2, f3, f4, f5, f5, f5, f5, ColorHelper.id_break(n, n5), ColorHelper.id_break(n2, n5), ColorHelper.id_break(n3, n5), ColorHelper.id_break(n4, n5));
    }

    public static void id_class(Ml_1 ml_1, rrtm_3 rrtm_32, rrZO rrZO2, String string, float f, float f2, int n, int n2) {
        rrZO2.id_class(ml_1, string, (double)f, (double)f2, ColorHelper.id_break(n, rrtm_32.id_class(n2)), id_class[2], id_class[3]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB72B8C3D1ABD1599L;
    }

    public static void id_class(Ml_1 ml_1, rrtm_3 rrtm_32, float f, float f2, float f3, float f4, int n, int n2) {
        rrfD_2.id_class(ml_1, f, f2, f4, ColorHelper.id_break(n, rrtm_32.id_class(n2)), f3);
    }

    public static void id_class(Ml_1 ml_1, rrZO rrZO2, String string, float f, float f2, int n, int n2) {
        rrZO2.id_protected(ml_1, string, f, f2, ColorHelper.id_break(n, n2), id_class[1]);
    }

    private static void id_class() {
        id_break = new short[]{255};
    }

    public static void id_class(Ml_1 ml_1, rrtm_3 rrtm_32, float f, float f2, float f3, int n, int n2, float f4) {
        rrfD_2.id_class(ml_1, (double)f, (double)f2, f3, ColorHelper.id_break(n, rrtm_32.id_class(n2)), f4);
    }

    public static void id_class(Ml_1 ml_1, rqO_2 rqO_22, float f, float f2, float f3, float f4, int n, int n2) {
        rrfD_2.id_class(ml_1, rqO_22, f, f2, f3, f4, ColorHelper.id_break(n, n2));
    }

    private static void id_break() {
        id_class = new boolean[6];
    }

    public static void id_break(Ml_1 ml_1, rrtm_3 rrtm_32, float f, float f2, float f3, float f4, int n, int n2) {
        rrfD_2.id_protected(ml_1, f, f2, f3, f4, ColorHelper.id_break(n, rrtm_32.id_class(n2)));
    }

    public static void id_break(Ml_1 ml_1, rrtm_3 rrtm_32, rrZO rrZO2, String string, float f, float f2, int n, int n2) {
        rrZO2.id_byte(ml_1, string, f, f2, ColorHelper.id_break(n, rrtm_32.id_class(n2)), id_class[4]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrtF_2.id_break();
        rrtF_2.id_class();
    }

    public static void id_protected(Ml_1 ml_1, rrtm_3 rrtm_32, rrZO rrZO2, String string, float f, float f2, int n, int n2) {
        rrZO2.id_protected(ml_1, string, f, f2, ColorHelper.id_break(n, rrtm_32.id_class(n2)), id_class[0]);
    }
}

