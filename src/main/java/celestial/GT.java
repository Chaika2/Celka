/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.GH;
import celestial.GI;
import celestial.Gt_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GT
implements Gt_1 {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    private static void id_byte() {
        id_break = new byte[]{2};
    }

    public GT(GH gH, Gt_1 gt_1, Gt_1 gt_12) {
        this.id_protected();
        Gt_1 gt_13 = gt_1;
        this.id_class[GT.id_byte[0]] = gt_13;
        Gt_1 gt_14 = gt_12;
        this.id_class[GT.id_byte[1]] = gt_14;
    }

    static {
        GT.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-65, -101, -80, 7, 46, -46, -122, -126}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3782F2FACB34F9BEL;
    }

    @Override
    public int id_class() {
        return Math.min(((Gt_1)this.id_class[id_byte[6]]).id_class(), ((Gt_1)this.id_class[id_byte[7]]).id_class());
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x79DC101E;
    }

    @Override
    public GI id_class(int n, int n2) {
        if (((Gt_1)this.id_class[id_byte[2]]).id_class(n, n2) == (GI)((Object)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[id_byte[3]])) {
            return (GI)((Object)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[id_byte[4]]);
        }
        return ((Gt_1)this.id_class[id_byte[5]]).id_class(n, n2);
    }

    private static void id_break() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        GT.id_break();
        GT.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }
}

