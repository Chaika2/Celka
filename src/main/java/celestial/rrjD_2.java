/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eX_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjD_2
implements Cloneable {
    private static short[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;
    private static byte[] id_protected;

    public String id_byte() {
        return (String)this.id_class[id_break[18]];
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-9, 25, 22, 115, 63, 21, 13, 64}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrjD_2(String string, eX_2 eX_22, String string2) {
        this.id_throws();
        String string3 = string;
        this.id_class[rrjD_2.id_break[0]] = string3;
        eX_2 eX_23 = eX_22;
        this.id_class[rrjD_2.id_break[1]] = eX_23;
        String string4 = string2;
        this.id_class[rrjD_2.id_break[2]] = string4;
    }

    static {
        rrjD_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[1];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[2];
        }
        rrjD_2 rrjD_22 = (rrjD_2)object;
        return Objects.equals((String)this.id_class[id_break[8]], (String)rrjD_22.id_class[id_break[9]]) && Objects.equals((String)this.id_class[id_break[10]], (String)rrjD_22.id_class[id_break[11]]) ? id_byte[3] : id_byte[4];
    }

    public String toString() {
        return (String)this.id_class[id_break[14]] + " | X: " + (int)((eX_2)this.id_class[id_break[15]]).id_class() + " Y: " + (int)((eX_2)this.id_class[id_break[16]]).id_break() + " Z: " + (int)((eX_2)this.id_class[id_break[17]]).id_byte();
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_protected[0]];
        objectArray[rrjD_2.id_byte[5]] = (String)this.id_class[id_break[12]];
        objectArray[rrjD_2.id_byte[6]] = (String)this.id_class[id_break[13]];
        return Objects.hash(objectArray);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.id_class();
    }

    public void id_class(eX_2 eX_22) {
        eX_2 eX_23 = eX_22;
        this.id_class[rrjD_2.id_break[22]] = eX_23;
    }

    public rrjD_2 id_class() {
        try {
            return (rrjD_2)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return new rrjD_2((String)this.id_class[id_break[5]], (eX_2)this.id_class[id_break[6]], (String)this.id_class[id_break[7]]);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9039301C;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE91C9C7593066DF5L;
    }

    public void id_class(String string) {
        String string2 = string;
        this.id_class[rrjD_2.id_break[21]] = string2;
    }

    public boolean id_break(String string) {
        if ((String)this.id_class[id_break[3]] == null) {
            return id_byte[0];
        }
        return ((String)this.id_class[id_break[4]]).equals(string);
    }

    public eX_2 id_break() {
        return (eX_2)this.id_class[id_break[19]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[1]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrjD_2.id_private();
        rrjD_2.id_case();
        rrjD_2.id_catch();
    }

    private static void id_catch() {
        id_protected = new byte[]{2, 3};
    }

    private static void id_case() {
        short[] sArray = new short[24];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 2;
        sArray[4] = 2;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[10] = 2;
        sArray[11] = 2;
        sArray[13] = 2;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 1;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[22] = 1;
        sArray[23] = 2;
        id_break = sArray;
    }

    public void id_protected(String string) {
        String string2 = string;
        this.id_class[rrjD_2.id_break[23]] = string2;
    }

    public String id_protected() {
        return (String)this.id_class[id_break[20]];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_byte = blArray;
    }
}

