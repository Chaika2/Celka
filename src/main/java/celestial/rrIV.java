/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NT;
import celestial.rqO_2;
import celestial.rrIl_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrIV
extends rrIl_1 {
    private static byte[] id_class;
    private static float[] id_break;
    private static boolean[] id_byte;

    private static void id_int() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        id_byte = blArray;
    }

    public rrIV(String string) {
        super(string, id_break[0], id_break[1], id_byte[0], NT.FILE, id_byte[1], id_byte[2], id_class[0]);
    }

    static {
        rrIV.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC4FD8B6C9CFF6086L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{67, 120, -46, 112, -34, -72, -104, 109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF9CD241E;
    }

    private static /* synthetic */ void ntfClinit() {
        rrIV.id_int();
        rrIV.id_package();
        rrIV.id_final();
    }

    private static void id_package() {
        id_break = new float[]{1.0f, 1.0f};
    }

    @Override
    public rqO_2 id_protected() {
        return new rqO_2(this.id_native().id_byte(), "celestial/sounds/module/" + this.id_native().id_break() + ".ogg");
    }

    private static void id_final() {
        id_class = new byte[]{16};
    }
}

