/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrFE;
import celestial.rrFS;
import celestial.rrFs_1;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFb_1
implements rrFE {
    private static float[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;
    private static boolean[] id_throws;

    @Override
    public String id_byte() {
        return (String)this.id_class[id_protected[4]];
    }

    public rrFb_1(rrFs_1 rrFs_12, String string, String string2) {
        this.id_finally();
        rrFs_1 rrFs_13 = rrFs_12;
        this.id_class[rrFb_1.id_protected[0]] = rrFs_13;
        AnimValue animValue = new AnimValue(id_break[0], id_throws[0]);
        this.id_class[rrFb_1.id_protected[1]] = animValue;
        String string3 = string;
        this.id_class[rrFb_1.id_protected[2]] = string3;
        String string4 = string2;
        this.id_class[rrFb_1.id_protected[3]] = string4;
    }

    static {
        rrFb_1.ntfClinit();
    }

    @Override
    public AnimValue id_class() {
        return (AnimValue)this.id_class[id_protected[6]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF7ED448BB9BF7845L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-108, 31, 91, -38, 40, 103, 28, 119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x69FCCF18;
    }

    @Override
    public void id_class(boolean bl) {
        ((AnimValue)this.id_class[id_protected[7]]).id_class(bl);
    }

    @Override
    public String id_break() {
        return (String)this.id_class[id_protected[5]];
    }

    @Override
    public boolean id_throws() {
        return ((rrFS)((rrFs_1)this.id_class[rrFb_1.id_protected[8]]).id_class[id_protected[9]]).id_super();
    }

    private static /* synthetic */ void ntfClinit() {
        rrFb_1.id_implements();
        rrFb_1.id_catch();
        rrFb_1.id_case();
        rrFb_1.id_private();
    }

    private void id_finally() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static void id_catch() {
        short[] sArray = new short[10];
        sArray[0] = 3;
        sArray[1] = 2;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 3;
        id_protected = sArray;
    }

    private static void id_case() {
        id_break = new float[]{0.5f};
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    @Override
    public boolean id_protected() {
        return id_throws[1];
    }

    private static void id_private() {
        id_byte = new byte[]{4};
    }
}

