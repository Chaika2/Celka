/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrIk_1;
import celestial.rrtn_3;
import celestial.rruv_1;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwB_2
implements rrtn_3 {
    private static float[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;

    public String id_byte() {
        return ((rrIk_1)this.id_class[id_byte[7]]).id_throws();
    }

    public rrwB_2(rrIk_1 rrIk_12) {
        this.id_finally();
        rruv_1 rruv_12 = (rruv_1)rruv_1.id_class[id_byte[0]];
        this.id_class[rrwB_2.id_byte[1]] = rruv_12;
        rrIk_1 rrIk_13 = rrIk_12;
        this.id_class[rrwB_2.id_byte[2]] = rrIk_13;
        AnimValue animValue = new AnimValue(id_break[0], id_protected[0]);
        this.id_class[rrwB_2.id_byte[3]] = animValue;
        AnimValue animValue2 = new AnimValue(id_break[1], id_protected[1]);
        this.id_class[rrwB_2.id_byte[4]] = animValue2;
    }

    static {
        rrwB_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{26, 90, -111, -84, 38, 114, -11, -37}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public rruv_1 id_class() {
        return (rruv_1)this.id_class[id_byte[5]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFF4C4316;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2829F95A1DE734CAL;
    }

    public void id_class(rruv_1 rruv_12) {
        rruv_1 rruv_13 = rruv_12;
        this.id_class[rrwB_2.id_byte[6]] = rruv_13;
    }

    public AnimValue id_break() {
        return (AnimValue)this.id_class[id_byte[10]];
    }

    public AnimValue id_throws() {
        return (AnimValue)this.id_class[id_byte[11]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrwB_2.id_private();
        rrwB_2.id_extends();
        rrwB_2.id_catch();
        rrwB_2.id_implements();
    }

    private void id_finally() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
        }
    }

    private static void id_catch() {
        id_break = new float[]{0.3f, 0.6f};
    }

    private static void id_extends() {
        short[] sArray = new short[12];
        sArray[1] = 3;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 3;
        sArray[6] = 3;
        sArray[10] = 1;
        sArray[11] = 2;
        id_byte = sArray;
    }

    public rrIk_1 id_case() {
        return (rrIk_1)this.id_class[id_byte[9]];
    }

    private static void id_implements() {
        id_throws = new byte[]{4};
    }

    public boolean id_protected() {
        return ((rrIk_1)this.id_class[id_byte[8]]).id_class();
    }

    private static void id_private() {
        id_protected = new boolean[2];
    }
}

