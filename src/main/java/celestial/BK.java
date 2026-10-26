/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Bl_1;
import celestial.Bn_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BK
extends Bn_1 {
    private static String[] id_byte;
    private static short[] id_protected;

    public BK() {
        super(id_byte[0], (Pattern[])Bl_1.id_class[id_protected[0]]);
    }

    static {
        BK.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x383C225D578763EFL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2AB0C2C9;
    }

    private static /* synthetic */ void ntfClinit() {
        BK.id_catch();
        BK.id_private();
    }

    private static void id_catch() {
        id_byte = new String[]{new String("\u0413\u043e\u0440\u044f\u0449\u0438\u0439 \u0447\u0435\u0440\u0435\u043f")};
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{103, 63, -36, -35, 101, 91, 98, 4}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_private() {
        id_protected = new short[]{22};
    }
}

