/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rrNw_1;
import celestial.rrck_3;
import celestial.rrfI_2;
import celestial.rrfh_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcW_2
extends rrfI_2<rrfh_3> {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    public Object[] id_class;

    @Override
    public boolean id_byte() {
        this.id_protected();
        return this.id_break() == (rrfh_3)((Object)((rrck_3)this.id_class[rrcW_2.id_break[4]]).id_class[id_break[5]]) ? id_byte[0] : id_byte[1];
    }

    public rrcW_2(rrck_3 rrck_32, rrNw_1 rrNw_12) {
        this.id_protected();
        rrck_3 rrck_33 = rrck_32;
        this.id_class[rrcW_2.id_break[0]] = rrck_33;
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcW_2.id_break[1]] = rrNw_13;
    }

    static {
        rrcW_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-108, 117, -1, -7, 81, 74, 122, 12}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE5E83AEF;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB0C9E01A3B14C3ADL;
    }

    public rrfh_3 id_break() {
        this.id_protected();
        rJY rJY2 = ((rrNw_1)this.id_class[id_break[2]]).id_throws();
        return rrfh_3.id_class(rJY2 == null ? ((rrNw_1)this.id_class[id_break[3]]).id_protected() : rJY2.id_class());
    }

    private static void id_throws() {
        short[] sArray = new short[6];
        sArray[0] = 1;
        sArray[4] = 1;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrcW_2.id_catch();
        rrcW_2.id_throws();
        rrcW_2.id_case();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_byte = blArray;
    }

    private static void id_case() {
        id_protected = new byte[]{2};
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }
}

