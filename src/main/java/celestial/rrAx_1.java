/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rrAd_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAx_1
extends Om_1 {
    public Object[] id_class;
    private static short[] id_byte;
    public static Object[] id_break;
    private static boolean[] id_protected;

    public rrAx_1() {
        this.id_throws();
    }

    static {
        rrAx_1.ntfClinit();
    }

    public rrAd_1 id_class() {
        this.id_throws();
        return (rrAd_1)((Object)this.id_class[id_byte[4]]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-121, 20, -2, 43, 39, -73, 99, -76}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrAx_1 id_class(rrAd_1 rrAd_12) {
        rrAd_1 rrAd_13 = rrAd_12;
        ((rrAx_1)rrAx_1.id_break[rrAx_1.id_byte[0]]).id_class[rrAx_1.id_byte[1]] = rrAd_13;
        ((rrAx_1)id_break[id_byte[2]]).id_class(id_protected[0]);
        return (rrAx_1)id_break[id_byte[3]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x161BEB225C3A7D1L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x390C2FA5;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[2]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrAx_1.id_break();
        rrAx_1.id_case();
        rrAx_1.id_protected();
    }

    private static void id_case() {
        id_byte = new short[5];
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrAx_1()};
        id_break = objectArray;
    }
}

