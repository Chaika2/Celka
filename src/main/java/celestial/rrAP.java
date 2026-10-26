/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrLi_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class rrAP
extends rrLi_1 {
    private static boolean[] id_break;
    public static Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_break = blArray;
    }

    private rrAP() {
    }

    static {
        rrAP.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x709AC658CC6525C6L;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x146563F8;
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new rrAP()};
        id_class = objectArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-104, -76, -97, 119, 61, -91, 96, -115}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrAP.id_byte();
        rrAP.id_break();
    }
}

