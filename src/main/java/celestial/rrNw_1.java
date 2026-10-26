/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rdn_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrNw_1 {
    public Object[] id_break;
    private static byte[] id_class;
    private static String[] id_byte;
    private static boolean[] id_protected;
    private static short[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        id_protected = blArray;
    }

    public rrNw_1(rdn_3 rdn_32) {
        this.id_break();
        rdn_3 rdn_33 = rdn_32;
        this.id_break[rrNw_1.id_throws[6]] = rdn_33;
    }

    public rrNw_1(rJY rJY2, String string, int n) {
        this.id_break();
        rJY rJY3 = rJY2;
        this.id_break[rrNw_1.id_throws[0]] = rJY3;
        String string2 = string;
        this.id_break[rrNw_1.id_throws[1]] = string2;
        Integer n2 = n;
        this.id_break[rrNw_1.id_throws[2]] = n2;
    }

    public rrNw_1(rdn_3 rdn_32, String string, int n) {
        this.id_break();
        rdn_3 rdn_33 = rdn_32;
        this.id_break[rrNw_1.id_throws[3]] = rdn_33;
        String string2 = string;
        this.id_break[rrNw_1.id_throws[4]] = string2;
        Integer n2 = n;
        this.id_break[rrNw_1.id_throws[5]] = n2;
    }

    static {
        rrNw_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_protected[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_protected[1];
        }
        rrNw_1 rrNw_12 = (rrNw_1)object;
        return ((Integer)this.id_break[id_throws[11]]).intValue() == ((Integer)rrNw_12.id_break[id_throws[12]]).intValue() && Objects.equals(((rdn_3)this.id_break[id_throws[13]]).id_break(), ((rdn_3)rrNw_12.id_break[id_throws[14]]).id_break()) && Objects.equals(((rdn_3)this.id_break[id_throws[15]]).id_char(), ((rdn_3)rrNw_12.id_break[id_throws[16]]).id_char()) && Objects.equals((String)this.id_break[id_throws[17]], (String)rrNw_12.id_break[id_throws[18]]) ? id_protected[2] : id_protected[3];
    }

    public String toString() {
        return "ItemMetaData{, itemStack=" + ((rdn_3)this.id_break[id_throws[7]] == null ? id_byte[0] : ((rdn_3)this.id_break[id_throws[8]]).id_continue().id_byte()) + ", seller='" + (String)this.id_break[id_throws[9]] + "', price=" + (Integer)this.id_break[id_throws[10]] + "}";
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_class[0]];
        objectArray[rrNw_1.id_protected[4]] = (rdn_3)this.id_break[id_throws[19]];
        objectArray[rrNw_1.id_protected[5]] = (String)this.id_break[id_throws[20]];
        objectArray[rrNw_1.id_class[1]] = (int)((Integer)this.id_break[id_throws[21]]);
        return Objects.hash(objectArray);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x90BC68C4E7F444F8L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2455FCE3;
    }

    private static void id_class() {
        short[] sArray = new short[27];
        sArray[1] = 2;
        sArray[2] = 3;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 3;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 3;
        sArray[11] = 3;
        sArray[12] = 3;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[18] = 2;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[21] = 3;
        sArray[23] = 1;
        sArray[24] = 2;
        sArray[25] = 3;
        sArray[26] = 1;
        id_throws = sArray;
    }

    public void id_class(rdn_3 rdn_32) {
        rdn_3 rdn_33 = rdn_32;
        this.id_break[rrNw_1.id_throws[26]] = rdn_33;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{34, 31, -116, -128, 40, 87, -44, 98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_class[2]];
            objectArray[rrNw_1.id_class[3]] = id_protected[6];
        }
    }

    public rJY id_throws() {
        return (rJY)this.id_break[id_throws[22]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrNw_1.id_byte();
        rrNw_1.id_implements();
        rrNw_1.id_class();
        rrNw_1.id_private();
    }

    public String id_catch() {
        return (String)this.id_break[id_throws[24]];
    }

    public int id_case() {
        return (Integer)this.id_break[id_throws[25]];
    }

    private static void id_implements() {
        id_byte = new String[]{new String("null")};
    }

    public rdn_3 id_protected() {
        return (rdn_3)this.id_break[id_throws[23]];
    }

    private static void id_private() {
        id_class = new byte[]{3, 2, 4, 3};
    }
}

