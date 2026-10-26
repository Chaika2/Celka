/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.SC;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sl_1
extends SC {
    public Object[] id_class;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static short[] id_throws;

    public Sl_1(String string, int n) {
        super(string);
        this.id_case();
        Integer n2 = n;
        this.id_class[Sl_1.id_throws[0]] = n2;
    }

    public Sl_1(String string) {
        this(string, id_byte[0]);
    }

    static {
        Sl_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDF5EC762;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-9, 6, 34, 6, -76, -21, -11, -43}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_byte = new byte[]{-1};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7EA1B81B3A732FA1L;
    }

    @Override
    public int id_break() {
        this.id_case();
        return (Integer)this.id_class[id_throws[1]];
    }

    private static void id_throws() {
        id_throws = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        Sl_1.id_protected();
        Sl_1.id_throws();
        Sl_1.id_class();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[Sl_1.id_protected[1]] = id_protected[2];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        id_protected = blArray;
    }
}

