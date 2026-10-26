/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_abstract;
import celestial.Sa_1;
import celestial.Si_1;
import celestial.sB_2;
import celestial.sP_2;
import celestial.sr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Se_1 {
    public static Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        Object[] objectArray = new Object[1];
        C_abstract[] c_abstractArray = new C_abstract[]{new sP_2(), new sB_2(), new sr_3(), new Si_1(), new Sa_1()};
        objectArray[0] = Arrays.asList((Object[])c_abstractArray);
        id_class = objectArray;
    }

    static {
        Se_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{41, -2, -85, 110, 100, 83, -68, 24}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x59CD4D68;
    }

    private static void id_class() {
        id_byte = new byte[]{5, 2, 3, 4};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8F6DC9B99F5D4E6AL;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[9];
        blArray[2] = true;
        blArray[8] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Se_1.id_break();
        Se_1.id_class();
        Se_1.id_byte();
    }
}

