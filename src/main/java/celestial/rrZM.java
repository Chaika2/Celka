/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZM {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[2] = true;
        id_byte = blArray;
    }

    public rrZM() {
        this.id_break();
    }

    static {
        rrZM.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x196EE4F5;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC8BF96AB56FA10A5L;
    }

    private static void id_class() {
        id_break = new byte[]{4, 2, 3};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-107, -74, -10, -124, 68, -101, -25, 17}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[rrZM.id_byte[0]] = id_byte[1];
            objectArray[rrZM.id_byte[2]] = id_byte[3];
            objectArray[rrZM.id_break[1]] = id_byte[4];
            objectArray[rrZM.id_break[2]] = id_byte[5];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrZM.id_byte();
        rrZM.id_class();
    }
}

