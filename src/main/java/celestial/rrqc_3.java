/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rja_3;
import celestial.rrqz_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqc_3 {
    private static byte[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static short[] id_protected;

    public rja_3 id_byte() {
        return (rja_3)this.id_class[id_protected[5]];
    }

    public rrqc_3(rrqz_3 rrqz_32, rfH_2 rfH_22, rja_3 rja_32) {
        this.id_case();
        rrqz_3 rrqz_33 = rrqz_32;
        this.id_class[rrqc_3.id_protected[6]] = rrqz_33;
        rfH_2 rfH_23 = rfH_22;
        this.id_class[rrqc_3.id_protected[7]] = rfH_23;
        rja_3 rja_33 = rja_32;
        this.id_class[rrqc_3.id_protected[8]] = rja_33;
    }

    static {
        rrqc_3.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[1];
        }
        rrqc_3 rrqc_32 = (rrqc_3)object;
        return Objects.equals((rja_3)this.id_class[id_protected[0]], (rja_3)rrqc_32.id_class[id_protected[1]]);
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_byte[2]];
        objectArray[rrqc_3.id_byte[3]] = (rja_3)this.id_class[id_protected[2]];
        return Objects.hash(objectArray);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1D6C44725CA3FBD9L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-102, -80, 54, -53, -12, 3, -28, -29}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrqz_3 id_class() {
        return (rrqz_3)this.id_class[id_protected[3]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x849ABB23;
    }

    public rfH_2 id_break() {
        return (rfH_2)this.id_class[id_protected[4]];
    }

    private static void id_throws() {
        short[] sArray = new short[9];
        sArray[0] = 2;
        sArray[1] = 2;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrqc_3.id_catch();
        rrqc_3.id_throws();
        rrqc_3.id_protected();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
        }
    }

    private static void id_protected() {
        id_break = new byte[]{3};
    }
}

