/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjW_2 {
    public static Object[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static String[] id_protected;

    private static void id_byte() {
        Object[] objectArray = new Object[]{id_protected[0], id_protected[1], id_protected[2], id_protected[3], id_protected[4], id_protected[5]};
        id_class = objectArray;
    }

    static {
        rrjW_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{32, -120, -81, -41, 102, -50, -55, 62}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF3012CD2DEF7AA53L;
    }

    private static void id_class() {
        id_protected = new String[]{new String("SnowBall"), new String("STUN_STAR"), new String("ExplosiveStuff"), new String("EXPLOSIVE_TRAP"), new String("ALTERNATIVE_TRAP"), new String("backpack-inventory")};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD906C18F;
    }

    private static void id_break() {
        id_break = new byte[]{6, 2, 3, 4, 5};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjW_2.id_protected();
        rrjW_2.id_class();
        rrjW_2.id_break();
        rrjW_2.id_byte();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }
}

