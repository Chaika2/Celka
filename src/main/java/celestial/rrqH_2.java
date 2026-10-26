/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqH_2 {
    private static float[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    private static boolean[] id_throws;

    public void id_byte() {
        ((AnimValue)this.id_class[id_protected[3]]).id_class((Boolean)((Supplier)this.id_class[id_protected[4]]).get());
    }

    public rrqH_2(Supplier<StringBuilder> supplier, Supplier<Boolean> supplier2) {
        Supplier<Boolean> supplier3;
        Supplier<StringBuilder> supplier4;
        this.id_finally();
        AnimValue animValue = new AnimValue(id_break[0], id_throws[0]);
        this.id_class[rrqH_2.id_protected[0]] = animValue;
        this.id_class[rrqH_2.id_protected[1]] = supplier4 = supplier;
        this.id_class[rrqH_2.id_protected[2]] = supplier3 = supplier2;
    }

    static {
        rrqH_2.ntfClinit();
    }

    public void id_class(AnimValue animValue) {
        AnimValue animValue2 = animValue;
        this.id_class[rrqH_2.id_protected[11]] = animValue2;
    }

    public Supplier<StringBuilder> id_class() {
        return (Supplier)this.id_class[id_protected[6]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{43, -22, 94, -34, 1, 5, -53, -107}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA3496ADD;
    }

    public void id_class(Supplier<Boolean> supplier) {
        Supplier<Boolean> supplier2;
        this.id_class[rrqH_2.id_protected[10]] = supplier2 = supplier;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDF51BB63595B0ADBL;
    }

    public float id_break() {
        return ((AnimValue)this.id_class[id_protected[5]]).id_byte() * id_break[1];
    }

    public void id_break(Supplier<StringBuilder> supplier) {
        Supplier<StringBuilder> supplier2;
        this.id_class[rrqH_2.id_protected[9]] = supplier2 = supplier;
    }

    public AnimValue id_throws() {
        return (AnimValue)this.id_class[id_protected[8]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrqH_2.id_case();
        rrqH_2.id_implements();
        rrqH_2.id_catch();
        rrqH_2.id_private();
    }

    private void id_finally() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
        }
    }

    private static void id_catch() {
        short[] sArray = new short[12];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[10] = 1;
        sArray[11] = 2;
        id_protected = sArray;
    }

    private static void id_case() {
        id_throws = new boolean[1];
    }

    private static void id_implements() {
        id_break = new float[]{0.5f, 8.0f};
    }

    public Supplier<Boolean> id_protected() {
        return (Supplier)this.id_class[id_protected[7]];
    }

    private static void id_private() {
        id_byte = new byte[]{3};
    }
}

