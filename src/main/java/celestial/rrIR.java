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

public class rrIR
extends rrIV {
    private static String[] id_class;
    private static boolean[] id_break;

    public rrIR() {
        super(id_class[0]);
    }

    static {
        rrIR.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7815E089;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4E4BA03CA9AA6517L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-124, -22, 121, 31, -26, 126, -80, 57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrIR.id_package();
        rrIR.id_final();
    }

    private static void id_package() {
        id_break = new boolean[1];
    }

    private static void id_final() {
        id_class = new String[]{new String("module_enable"), new String("module.enable")};
    }

    @Override
    public NY id_volatile() {
        return new NY(this, id_break[0], id_class[1]);
    }
}

