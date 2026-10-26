/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrjx_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjs_3
extends rrjx_3 {
    private static String[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;
    private static boolean[] id_case;
    public static Object[] id_class;

    public rrjs_3(int n) {
        super((String[])id_class[id_protected[0]], n);
    }

    static {
        rrjs_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x51AD80D408367ADCL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2609152A;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{98, -127, -49, 13, 37, 113, -87, -49}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_protected = new short[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrjs_3.id_private();
        rrjs_3.id_case();
        rrjs_3.id_throws();
        rrjs_3.id_catch();
        rrjs_3.id_protected();
    }

    private static void id_catch() {
        id_throws = new byte[]{2};
    }

    private static void id_case() {
        id_byte = new String[]{new String("an"), new String("anarchy")};
    }

    private static void id_protected() {
        Object[] objectArray = new Object[1];
        String[] stringArray = new String[]{id_byte[0], id_byte[1]};
        objectArray[0] = stringArray;
        id_class = objectArray;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        blArray[3] = true;
        id_case = blArray;
    }
}

