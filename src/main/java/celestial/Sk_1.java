/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BH;
import celestial.Bn_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sk_1
extends Bn_1 {
    private static short[] id_byte;
    private static String[] id_protected;

    public Sk_1() {
        super(id_protected[0], (Pattern[])BH.id_class[id_byte[0]]);
    }

    static {
        Sk_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9705F5B0;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA5BF6E7D261A82EBL;
    }

    private static /* synthetic */ void ntfClinit() {
        Sk_1.id_catch();
        Sk_1.id_private();
    }

    private static void id_catch() {
        id_protected = new String[]{new String("\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d")};
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{108, 43, 76, -44, -122, 22, -118, -51}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_private() {
        id_byte = new short[]{6};
    }
}

