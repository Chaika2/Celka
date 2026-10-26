/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_byte;
import celestial.C_catch;
import celestial.C_class;
import celestial.C_private;
import celestial.Pd_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_throws {
    private static boolean[] id_break;
    private static short[] id_byte;
    public static Object[] id_class;
    private static byte[] id_protected;

    public static C_class id_byte() {
        return (C_class)C_throws.id_class().id_break();
    }

    static {
        C_throws.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-35, 29, 32, 25, 1, -40, 37, 45}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9649F06D;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x501D2CED4D99B0A3L;
    }

    public static C_catch id_class() {
        return (C_catch)id_class[id_byte[0]];
    }

    public static C_private id_break() {
        return (C_private)id_class[id_byte[1]];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[2];
        id_class = objectArray;
        Pd_1.id_byte(new C_private());
        objectArray[0] = new C_byte();
    }

    private static /* synthetic */ void ntfClinit() {
        C_throws.id_catch();
        C_throws.id_case();
        C_throws.id_protected();
        C_throws.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[1] = true;
        id_break = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[2];
        sArray[1] = 1;
        id_byte = sArray;
    }

    private static void id_protected() {
        id_protected = new byte[]{2};
    }
}

