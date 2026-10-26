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

public class SW
extends Bn_1 {
    private static String[] id_byte;
    private static short[] id_protected;

    public SW() {
        super(id_byte[0], (Pattern[])BH.id_class[id_protected[0]]);
    }

    static {
        SW.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x515158EFA8C7461FL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF362A7BC;
    }

    private static /* synthetic */ void ntfClinit() {
        SW.id_catch();
        SW.id_private();
    }

    private static void id_catch() {
        id_byte = new String[]{new String("\u0422\u043e\u0440\u0433\u043e\u0432\u0435\u0446")};
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{120, -114, 39, 105, -36, 11, -95, 40}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_private() {
        id_protected = new short[]{7};
    }
}

