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

public abstract class rrIp_1
extends rrIl_1 {
    private static float[] id_class;
    private static boolean[] id_break;
    private static String[] id_byte;
    private static byte[] id_protected;

    private static void id_int() {
        id_byte = new String[]{new String("hitsound")};
    }

    public rrIp_1(String string) {
        super(string, id_class[0], id_class[1], id_break[0], NT.FILE, id_break[1], id_break[2], id_protected[0]);
    }

    static {
        rrIp_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC0A963FD;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x531810B0AF6ADD0AL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{67, -95, -4, 27, -97, 68, -52, 42}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrIp_1.id_package();
        rrIp_1.id_int();
        rrIp_1.id_final();
        rrIp_1.id_new();
    }

    private static void id_new() {
        id_protected = new byte[]{16};
    }

    private static void id_package() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        id_break = blArray;
    }

    @Override
    public rqO_2 id_protected() {
        return new rqO_2(this.id_native().id_byte(), "celestial/sounds/hitsounds/" + this.id_native().id_break() + ".ogg");
    }

    private static void id_final() {
        id_class = new float[]{1.0f, 1.0f};
    }

    @Override
    public NY id_volatile() {
        return new NY(this, id_break[3], id_byte[0]);
    }
}

