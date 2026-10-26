/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjU_2;
import celestial.rqR_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BW {
    public Object[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static long[] id_protected;
    private static short[] id_throws;

    public int id_byte() {
        return (Integer)this.id_class[id_throws[7]];
    }

    public BW(rjU_2 rjU_22, int n) {
        this.id_private();
        Long l = rqR_2.id_break();
        this.id_class[BW.id_throws[9]] = l;
        rjU_2 rjU_23 = rjU_22;
        this.id_class[BW.id_throws[10]] = rjU_23;
        Integer n2 = n;
        this.id_class[BW.id_throws[11]] = n2;
    }

    static {
        BW.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[1];
        }
        BW bW = (BW)object;
        return ((Integer)this.id_class[id_throws[0]]).intValue() == ((Integer)bW.id_class[id_throws[1]]).intValue() && Objects.equals((rjU_2)this.id_class[id_throws[2]], (rjU_2)bW.id_class[id_throws[3]]) ? id_byte[2] : id_byte[3];
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_break[0]];
        objectArray[BW.id_byte[4]] = (rjU_2)this.id_class[id_throws[4]];
        objectArray[BW.id_byte[5]] = (int)((Integer)this.id_class[id_throws[5]]);
        return Objects.hash(objectArray);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x52B705A;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC50CCCC7BC1EA199L;
    }

    public long id_class() {
        return (Long)this.id_class[id_throws[8]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-100, 69, -24, -33, -10, -91, -49, 61}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rjU_2 id_break() {
        return (rjU_2)this.id_class[id_throws[6]];
    }

    private static void id_throws() {
        id_protected = new long[1];
    }

    private static /* synthetic */ void ntfClinit() {
        BW.id_protected();
        BW.id_throws();
        BW.id_catch();
        BW.id_case();
    }

    private static void id_catch() {
        short[] sArray = new short[12];
        sArray[0] = 1;
        sArray[1] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[11] = 1;
        id_throws = sArray;
    }

    private static void id_case() {
        id_break = new byte[]{2, 3, 2};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        id_byte = blArray;
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[1]];
            objectArray[BW.id_byte[6]] = id_byte[7];
            objectArray[BW.id_break[2]] = id_protected[0];
        }
    }
}

