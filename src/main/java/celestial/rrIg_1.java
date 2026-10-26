/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NY;
import celestial.rrIV;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIg_1
extends rrIV {
    private static boolean[] id_class;
    private static String[] id_break;

    public rrIg_1() {
        super(id_break[0]);
    }

    static {
        rrIg_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x16D72C3C8B9392FCL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4CE3FA04;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-101, -85, -88, 22, 13, -116, -83, -119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrIg_1.id_final();
        rrIg_1.id_package();
    }

    private static void id_package() {
        id_break = new String[]{new String("module_disable"), new String("module.disable")};
    }

    private static void id_final() {
        id_class = new boolean[1];
    }

    @Override
    public NY id_volatile() {
        return new NY(this, id_class[0], id_break[1]);
    }
}

