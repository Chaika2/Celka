/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NT;
import celestial.NY;
import celestial.rqO_2;
import celestial.rrIl_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIY
extends rrIl_1 {
    private static byte[] id_class;
    private static float[] id_break;
    private static boolean[] id_byte;
    private static String[] id_protected;

    private static void id_int() {
        id_protected = new String[]{new String("notification"), new String("notification")};
    }

    public rrIY() {
        super(id_protected[0], id_break[0], id_break[1], id_byte[0], NT.FILE, id_byte[1], id_byte[2], id_class[0]);
    }

    static {
        rrIY.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x87876EC67E94CA3BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF9446293;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-103, -97, -84, -89, 119, 79, 109, 62}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrIY.id_final();
        rrIY.id_int();
        rrIY.id_new();
        rrIY.id_package();
    }

    private static void id_new() {
        id_break = new float[]{1.0f, 1.0f};
    }

    private static void id_package() {
        id_class = new byte[]{16};
    }

    @Override
    public rqO_2 id_protected() {
        return new rqO_2(this.id_native().id_byte(), "celestial/sounds/notifications/" + this.id_native().id_break() + ".ogg");
    }

    private static void id_final() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        id_byte = blArray;
    }

    @Override
    public NY id_volatile() {
        return new NY(this, id_byte[3], id_protected[1]);
    }
}

