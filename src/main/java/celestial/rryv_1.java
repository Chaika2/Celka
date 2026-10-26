/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rryF;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rryv_1 {
    private static short[] id_class;
    private static boolean[] id_break;

    public boolean id_byte() {
        return this.id_class() == (rryF)((Object)rryF.staticFieldsfd087588ab503ef5ba48903746a1e506[id_class[2]]) ? id_break[4] : id_break[5];
    }

    static {
        rryv_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x76D57FAC49970357L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x61318BAB;
    }

    public abstract rryF id_class();

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-102, -94, 69, -113, -107, -72, -5, -14}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[3];
        sArray[1] = 1;
        sArray[2] = 2;
        id_class = sArray;
    }

    public boolean id_throws() {
        return this.id_class() == (rryF)((Object)rryF.staticFieldsfd087588ab503ef5ba48903746a1e506[id_class[1]]) ? id_break[2] : id_break[3];
    }

    private static /* synthetic */ void ntfClinit() {
        rryv_1.id_case();
        rryv_1.id_break();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_break = blArray;
    }

    public boolean id_protected() {
        return this.id_class() == (rryF)((Object)rryF.staticFieldsfd087588ab503ef5ba48903746a1e506[id_class[0]]) ? id_break[0] : id_break[1];
    }
}

