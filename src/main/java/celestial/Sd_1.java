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

public class Sd_1
extends Bn_1 {
    private static String[] id_byte;
    private static short[] id_protected;

    public Sd_1() {
        super(id_byte[0], (Pattern[])BH.id_class[id_protected[0]]);
    }

    static {
        Sd_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x41309086;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEE53EB43BD04EB9DL;
    }

    private static /* synthetic */ void ntfClinit() {
        Sd_1.id_private();
        Sd_1.id_catch();
    }

    private static void id_catch() {
        id_protected = new short[]{5};
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{73, 64, 41, -9, -5, 43, 127, -113}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_private() {
        id_byte = new String[]{new String("\u0421\u043a\u0443\u0440\u0434\u0436")};
    }
}

