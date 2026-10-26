/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrca_3;
import celestial.rrur_1;
import celestial.rrus_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruE {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;
    private static byte[] id_protected;

    private static void id_byte() {
        id_break = new boolean[5];
    }

    public rruE() {
        this.id_break();
        Integer n = id_protected[0];
        this.id_class[rruE.id_byte[0]] = n;
        rrus_1 rrus_12 = (rrus_1)((Object)rrus_1.staticFields671469053d923ac8912036fe43a40b51[id_byte[1]]);
        this.id_class[rruE.id_byte[2]] = rrus_12;
        rrur_1 rrur_12 = (rrur_1)((Object)rrur_1.staticFields11cf60dc087237409ab550ffa4a0389b[id_byte[3]]);
        this.id_class[rruE.id_byte[4]] = rrur_12;
        rrca_3 rrca_32 = (rrca_3)((Object)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[id_byte[5]]);
        this.id_class[rruE.id_byte[6]] = rrca_32;
        Integer n2 = id_protected[1];
        this.id_class[rruE.id_byte[7]] = n2;
        Integer n3 = id_protected[2];
        this.id_class[rruE.id_byte[8]] = n3;
        Integer n4 = id_protected[3];
        this.id_class[rruE.id_byte[9]] = n4;
    }

    static {
        rruE.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC0F5DE7D;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{13, -18, 54, -71, -80, 69, 89, 2}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xECE6255321A36186L;
    }

    private static void id_class() {
        short[] sArray = new short[10];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        sArray[8] = 5;
        sArray[9] = 6;
        id_byte = sArray;
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[4]];
            objectArray[rruE.id_break[0]] = id_break[1];
            objectArray[rruE.id_protected[5]] = id_break[2];
            objectArray[rruE.id_protected[6]] = id_break[3];
            objectArray[rruE.id_protected[7]] = id_break[4];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rruE.id_byte();
        rruE.id_class();
        rruE.id_protected();
    }

    private static void id_protected() {
        id_protected = new byte[]{2, 25, 6, 2, 7, 4, 5, 6};
    }
}

