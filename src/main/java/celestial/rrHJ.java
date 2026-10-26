/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.xc_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHJ {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;

    public xd_3 id_byte() {
        return (xd_3)this.id_class[id_protected[6]];
    }

    public rrHJ(xd_3 xd_32, xc_3 xc_32, rfH_2 rfH_22) {
        this.id_catch();
        xd_3 xd_33 = xd_32;
        this.id_class[rrHJ.id_protected[9]] = xd_33;
        xc_3 xc_33 = xc_32;
        this.id_class[rrHJ.id_protected[10]] = xc_33;
        rfH_2 rfH_23 = rfH_22;
        this.id_class[rrHJ.id_protected[11]] = rfH_23;
    }

    static {
        rrHJ.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_break[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_break[1];
        }
        rrHJ rrHJ2 = (rrHJ)object;
        return Objects.equals((xd_3)this.id_class[id_protected[0]], (xd_3)rrHJ2.id_class[id_protected[1]]) && Objects.equals((rfH_2)this.id_class[id_protected[2]], (rfH_2)rrHJ2.id_class[id_protected[3]]) ? id_break[2] : id_break[3];
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_byte[0]];
        objectArray[rrHJ.id_break[4]] = (xd_3)this.id_class[id_protected[4]];
        objectArray[rrHJ.id_break[5]] = (rfH_2)this.id_class[id_protected[5]];
        return Objects.hash(objectArray);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD914CA03C42FFC00L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{65, -109, -118, -69, -85, 121, 73, -50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4E0E72DE;
    }

    public xc_3 id_class() {
        return (xc_3)this.id_class[id_protected[7]];
    }

    public rfH_2 id_break() {
        return (rfH_2)this.id_class[id_protected[8]];
    }

    private static void id_throws() {
        id_byte = new byte[]{2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrHJ.id_case();
        rrHJ.id_protected();
        rrHJ.id_throws();
    }

    private void id_catch() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
        }
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        id_break = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[12];
        sArray[2] = 2;
        sArray[3] = 2;
        sArray[5] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[10] = 1;
        sArray[11] = 2;
        id_protected = sArray;
    }
}

