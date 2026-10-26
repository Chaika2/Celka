/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrwp_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwA_2
extends rrwp_3 {
    private static byte[] id_extends;
    private static String[] id_native;

    public rrwA_2() {
        super(id_native[0], id_native[1], id_extends[0], id_native[2]);
    }

    static {
        rrwA_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB271C692;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x97B10773A4055DD8L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{40, -62, -39, -127, -97, 70, -103, -83}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrwA_2.id_extends();
        rrwA_2.id_native();
    }

    @Override
    public /* synthetic */ rrwp_3 id_catch() {
        return this.id_case();
    }

    private static void id_extends() {
        id_native = new String[]{new String("FunTime"), new String("mc.funtime.su"), new String("Most Popular")};
    }

    public rrwA_2 id_case() {
        rrwA_2 rrwA_22 = new rrwA_2();
        rrwA_22.id_class(this);
        return rrwA_22;
    }

    private static void id_native() {
        id_extends = new byte[]{-1};
    }
}

