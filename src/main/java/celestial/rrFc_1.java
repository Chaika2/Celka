/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgF_2;
import celestial.rrFd_1;
import celestial.rrFk_1;
import celestial.rrFz_1;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFc_1
implements rrFz_1 {
    private static short[] id_break;
    private static float[] id_byte;
    public Object[] id_class;
    private static byte[] id_protected;
    private static boolean[] id_throws;

    @Override
    public boolean id_byte() {
        return id_throws[1];
    }

    public rrFc_1(rrFk_1 rrFk_12, String string, String string2, String string3) {
        this.id_extends();
        rrFk_1 rrFk_13 = rrFk_12;
        this.id_class[rrFc_1.id_break[0]] = rrFk_13;
        AnimValue animValue = new AnimValue(id_byte[0], id_throws[0]);
        this.id_class[rrFc_1.id_break[1]] = animValue;
        String string4 = string;
        this.id_class[rrFc_1.id_break[2]] = string4;
        String string5 = string2;
        this.id_class[rrFc_1.id_break[3]] = string5;
        String string6 = string3;
        this.id_class[rrFc_1.id_break[4]] = string6;
    }

    static {
        rrFc_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{59, 7, 82, 101, 46, -3, -47, 58}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x88162D7B;
    }

    @Override
    public void id_class(boolean bl) {
        ((AnimValue)this.id_class[id_break[7]]).id_class(bl);
    }

    @Override
    public AnimValue id_class() {
        return (AnimValue)this.id_class[id_break[12]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFCC3D609A4D1D41BL;
    }

    @Override
    public String id_break() {
        return (String)this.id_class[id_break[11]];
    }

    @Override
    public boolean id_throws() {
        return ((rrFd_1)((rrFk_1)this.id_class[rrFc_1.id_break[8]]).id_break[id_break[9]]).id_super();
    }

    private static /* synthetic */ void ntfClinit() {
        rrFc_1.id_finally();
        rrFc_1.id_implements();
        rrFc_1.id_private();
        rrFc_1.id_catch();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    private static void id_catch() {
        id_protected = new byte[]{5};
    }

    private void id_extends() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    public String id_case() {
        return (String)this.id_class[id_break[10]];
    }

    private static void id_implements() {
        short[] sArray = new short[13];
        sArray[0] = 4;
        sArray[1] = 3;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[6] = 1;
        sArray[7] = 3;
        sArray[8] = 4;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 3;
        id_break = sArray;
    }

    @Override
    public String id_protected() {
        return (String)this.id_class[id_break[5]] + " " + rgF_2.RED + (String)this.id_class[id_break[6]];
    }

    private static void id_private() {
        id_byte = new float[]{0.5f};
    }
}

