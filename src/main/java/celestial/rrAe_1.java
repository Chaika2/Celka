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

public class rrAe_1
extends Om_1 {
    public static Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    static {
        rrAe_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC5961E32;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-124, 111, 104, -60, 80, -10, -92, 47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB101A882DE3CFD4EL;
    }

    public static rrAe_1 id_class() {
        ((rrAe_1)id_class[id_byte[0]]).id_class(id_break[0]);
        return (rrAe_1)id_class[id_byte[1]];
    }

    private static void id_break() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_break = blArray;
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrAe_1()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAe_1.id_break();
        rrAe_1.id_protected();
        rrAe_1.id_throws();
    }

    private static void id_protected() {
        id_byte = new short[2];
    }
}

