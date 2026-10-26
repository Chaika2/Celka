/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqO_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQI {
    private static String[] id_break;
    public static Object[] id_class;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new String[]{new String("This is a utility class and cannot be instantiated"), new String("celestial/images/account/widgets.png")};
    }

    private rrQI() {
        throw new UnsupportedOperationException(id_break[0]);
    }

    static {
        rrQI.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{14, -5, 101, -115, 24, -67, 24, -18}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x89E1B8BFD6E68F95L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5F995AF2;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new rqO_2(id_break[1])};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQI.id_class();
        rrQI.id_byte();
        rrQI.id_break();
    }
}

