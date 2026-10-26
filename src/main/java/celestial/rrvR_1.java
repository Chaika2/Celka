/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rrtu_3;
import celestial.rrvj_1;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrvR_1
extends rrvj_1 {
    public Object[] id_byte;
    private static short[] id_protected;
    private static float[] id_native;
    private static byte[] id_volatile;

    public rrvR_1(String string, AnimValue animValue, AnimValue animValue2) {
        super(string, () -> Float.valueOf(id_native[1]), () -> Float.valueOf(id_native[0]));
        this.id_throw();
        AnimValue animValue3 = animValue;
        this.id_byte[rrvR_1.id_protected[0]] = animValue3;
        AnimValue animValue4 = animValue2;
        this.id_byte[rrvR_1.id_protected[1]] = animValue4;
    }

    static {
        rrvR_1.ntfClinit();
    }

    private static void B() {
        id_volatile = new byte[]{2};
    }

    private static void s() {
        id_native = new float[2];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7081F1FB;
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        this.id_throw();
        super.id_class(ml_1, rrtu_32, n, n2, bl);
        ((AnimValue)this.id_byte[id_protected[2]]).id_break(this.id_goto());
        ((AnimValue)this.id_byte[id_protected[3]]).id_break(this.id_while());
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x571784EDE0DFF3C3L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{35, -7, -100, -28, -71, 0, 100, -109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrvR_1.E();
        rrvR_1.s();
        rrvR_1.B();
    }

    public abstract float id_goto();

    @Override
    public float id_implements() {
        this.id_throw();
        return ((AnimValue)this.id_byte[id_protected[4]]).id_byte();
    }

    private void id_throw() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_volatile[0]];
        }
    }

    public AnimValue id_try() {
        this.id_throw();
        return (AnimValue)this.id_byte[id_protected[6]];
    }

    public abstract float id_while();

    public AnimValue id_public() {
        this.id_throw();
        return (AnimValue)this.id_byte[id_protected[7]];
    }

    private static void E() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        id_protected = sArray;
    }

    @Override
    public float ao_() {
        this.id_throw();
        return ((AnimValue)this.id_byte[id_protected[5]]).id_byte();
    }
}

