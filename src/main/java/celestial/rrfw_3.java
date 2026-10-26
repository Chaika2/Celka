/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfw_3 {
    private static double[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;
    private static long[] id_throws;

    public void id_byte() {
        Long l = id_throws[0];
        this.id_class[rrfw_3.id_byte[3]] = l;
    }

    public rrfw_3() {
        this.id_private();
        Long l = this.id_case();
        this.id_class[rrfw_3.id_byte[0]] = l;
    }

    static {
        rrfw_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAA8E9FF4F5FB4B86L;
    }

    public boolean id_class(double d) {
        if (d <= id_break[0]) {
            return id_protected[0];
        }
        return (double)(this.id_case() - (Long)this.id_class[id_byte[1]]) > d ? id_protected[1] : id_protected[2];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-123, 14, 25, 48, -84, -20, 120, 0}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBC4CE71;
    }

    public void id_class() {
        Long l = this.id_case();
        this.id_class[rrfw_3.id_byte[2]] = l;
    }

    public long id_break() {
        return this.id_case() - (Long)this.id_class[id_byte[4]];
    }

    private static void id_throws() {
        id_break = new double[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrfw_3.id_protected();
        rrfw_3.id_implements();
        rrfw_3.id_catch();
        rrfw_3.id_throws();
    }

    private static void id_catch() {
        id_byte = new short[5];
    }

    private long id_case() {
        return System.currentTimeMillis();
    }

    private static void id_implements() {
        id_throws = new long[2];
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private void id_private() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
            this.id_class[0] = 0L;
        }
    }
}

