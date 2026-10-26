/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rruE;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruS {
    private static boolean[] id_break;
    public static Object[] id_class;

    static {
        rruS.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-65, 86, -121, -33, 70, 63, 88, -8}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_break = blArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFEE21D619C9D7F68L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x60B532F1;
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new rruE()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rruS.id_class();
        rruS.id_break();
    }
}

