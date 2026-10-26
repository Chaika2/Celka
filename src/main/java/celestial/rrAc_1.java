/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAc_1
extends Om_1 {
    public static Object[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    static {
        rrAc_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF0E242AA;
    }

    public static rrAc_1 id_class() {
        return (rrAc_1)id_class[id_break[0]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6E11289710556D63L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-34, -115, -79, -74, -102, 102, -126, 121}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrAc_1 id_break() {
        rrAc_1 rrAc_12 = rrAc_1.id_class();
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[1]]).id_finally().id_class(rrAc_12);
        return rrAc_12;
    }

    private static void id_throws() {
        id_break = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrAc_1.id_case();
        rrAc_1.id_throws();
        rrAc_1.id_protected();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrAc_1()};
        id_class = objectArray;
    }
}

