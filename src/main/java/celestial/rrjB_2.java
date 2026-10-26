/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hd_1;
import celestial.Ok_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjB_2
implements Ok_1 {
    private static byte[] id_break;
    private static float[] id_byte;
    private static short[] id_protected;
    private static int[] id_throws;
    private static boolean[] id_private;
    public Object[] id_class;

    @Override
    public Ok_1 id_byte(int n, int n2) {
        ((Ok_1)this.id_class[id_protected[10]]).id_byte(n, n2);
        return this;
    }

    public rrjB_2() {
        this.id_case();
        Float f = Float.valueOf(id_byte[0]);
        this.id_class[rrjB_2.id_protected[0]] = f;
    }

    static {
        rrjB_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{29, -59, 55, -47, -58, 118, -15, 48}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Ok_1 id_class(float f, float f2) {
        ((Ok_1)this.id_class[id_protected[8]]).id_class(f, f2);
        return this;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6D5288246E45C098L;
    }

    @Override
    public Ok_1 id_class(int n) {
        int n2 = n >>> id_break[0] & id_protected[5];
        int n3 = n & id_throws[0];
        ((Ok_1)this.id_class[id_protected[6]]).id_class(n3 | this.id_throws(n2) << id_break[1]);
        return this;
    }

    @Override
    public Ok_1 id_class(int n, int n2) {
        ((Ok_1)this.id_class[id_protected[7]]).id_class(n, this.id_throws(n2));
        return this;
    }

    @Override
    public Ok_1 id_class(double d, double d2, double d3) {
        ((Ok_1)this.id_class[id_protected[3]]).id_class(d, d2, d3);
        return this;
    }

    @Override
    public void id_class() {
        ((Ok_1)this.id_class[id_protected[12]]).id_class();
    }

    public rrjB_2 id_class(Ok_1 ok_1, float f) {
        Ok_1 ok_12 = ok_1;
        this.id_class[rrjB_2.id_protected[1]] = ok_12;
        Float f2 = Float.valueOf(f);
        this.id_class[rrjB_2.id_protected[2]] = f2;
        return this;
    }

    @Override
    public Ok_1 id_class(float f, float f2, float f3) {
        ((Ok_1)this.id_class[id_protected[11]]).id_class(f, f2, f3);
        return this;
    }

    @Override
    public Ok_1 id_break(int n, int n2, int n3, int n4) {
        ((Ok_1)this.id_class[id_protected[4]]).id_break(n, n2, n3, this.id_throws(n4));
        return this;
    }

    @Override
    public Ok_1 id_break(int n, int n2) {
        ((Ok_1)this.id_class[id_protected[9]]).id_break(n, n2);
        return this;
    }

    private int id_throws(int n) {
        int n2 = (int)((float)n * ((Float)this.id_class[id_protected[14]]).floatValue());
        return n2 < 0 ? id_private[0] : Math.min(n2, id_protected[15]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrjB_2.id_finally();
        rrjB_2.id_catch();
        rrjB_2.id_implements();
        rrjB_2.id_private();
        rrjB_2.id_extends();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_private = blArray;
    }

    private static void id_catch() {
        float[] fArray = new float[2];
        fArray[0] = 1.0f;
        id_byte = fArray;
    }

    private static void id_extends() {
        id_throws = new int[]{0xFFFFFF};
    }

    private void id_case() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
            this.id_class[1] = Float.valueOf(0.0f);
        }
    }

    private static int id_case(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3DBFA5F2;
    }

    private static void id_implements() {
        short[] sArray = new short[16];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[5] = 255;
        sArray[14] = 1;
        sArray[15] = 255;
        id_protected = sArray;
    }

    @Override
    public Hd_1 id_protected() {
        return ((Ok_1)this.id_class[id_protected[13]]).id_protected();
    }

    private static void id_private() {
        id_break = new byte[]{24, 24, 2};
    }
}

