/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFR
extends Om_1 {
    private static boolean[] id_break;
    public static Object[] id_class;
    private static short[] id_byte;

    static {
        rrFR.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{25, 58, 85, -79, 36, 121, -76, 22}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x60DBEC98;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA352582BCD5CC692L;
    }

    public static rrFR id_class() {
        ((rrFR)id_class[id_byte[0]]).id_class(id_break[0]);
        return (rrFR)id_class[id_byte[1]];
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new rrFR()};
        id_class = objectArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFR.id_throws();
        rrFR.id_protected();
        rrFR.id_break();
    }

    private static void id_protected() {
        id_byte = new short[2];
    }
}

