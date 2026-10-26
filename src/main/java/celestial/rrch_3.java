/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rrNw_1;
import celestial.rrcO_2;
import celestial.rrfG_2;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrch_3
extends rrfI_2<rrfG_2> {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;
    private static byte[] id_protected;

    @Override
    public boolean id_byte() {
        this.id_catch();
        rrfG_2 rrfG_22 = this.id_break();
        if (rrfG_22 == null) {
            return id_break[0];
        }
        return rrfG_22.equals((rrfG_2)((rrcO_2)this.id_class[rrch_3.id_byte[4]]).id_class[id_byte[5]]);
    }

    public rrch_3(rrcO_2 rrcO_22, rrNw_1 rrNw_12) {
        this.id_catch();
        rrcO_2 rrcO_23 = rrcO_22;
        this.id_class[rrch_3.id_byte[0]] = rrcO_23;
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrch_3.id_byte[1]] = rrNw_13;
    }

    static {
        rrch_3.ntfClinit();
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEBC409DC;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-73, 117, -86, -10, -88, 103, -55, 14}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1DF5CE25A6CDEA57L;
    }

    public rrfG_2 id_break() {
        this.id_catch();
        rJY rJY2 = ((rrNw_1)this.id_class[id_byte[2]]).id_throws();
        return rrfG_2.id_class(rJY2 == null ? ((rrNw_1)this.id_class[id_byte[3]]).id_protected() : rJY2.id_class());
    }

    private static void id_throws() {
        id_protected = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrch_3.id_protected();
        rrch_3.id_case();
        rrch_3.id_throws();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    private static void id_case() {
        short[] sArray = new short[6];
        sArray[0] = 1;
        sArray[4] = 1;
        id_byte = sArray;
    }

    private static void id_protected() {
        id_break = new boolean[1];
    }
}

