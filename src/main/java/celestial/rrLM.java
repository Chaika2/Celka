/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLM {
    private static boolean[] id_break;
    public static Object[] id_class;
    private static short[] id_byte;

    private static void id_byte() {
        id_byte = new short[1];
    }

    static {
        rrLM.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDD46E8FC49987109L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x34FBF7B9;
    }

    public static rrLM id_class() {
        return (rrLM)id_class[id_byte[0]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{111, -30, -35, -88, 49, 15, 4, 127}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLM.id_break();
        rrLM.id_byte();
        rrLM.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrLM()};
        id_class = objectArray;
    }
}

