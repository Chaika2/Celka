/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rjG_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pi_1 {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    public Pi_1(iB_2 iB_22, rjG_2 rjG_22) {
        this.id_byte();
        iB_2 iB_23 = iB_22;
        this.id_class[Pi_1.id_byte[5]] = iB_23;
        rjG_2 rjG_23 = rjG_22;
        this.id_class[Pi_1.id_byte[6]] = rjG_23;
    }

    static {
        Pi_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_protected[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_protected[1];
        }
        Pi_1 pi_1 = (Pi_1)object;
        return Objects.equals((iB_2)this.id_class[id_byte[0]], (iB_2)pi_1.id_class[id_byte[1]]);
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_protected[2]];
        objectArray[Pi_1.id_protected[3]] = (iB_2)this.id_class[id_byte[2]];
        return Objects.hash(objectArray);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{116, -85, -8, 103, 37, 32, -69, -36}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAB26884D7758E8BFL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x63BB4040;
    }

    public rjG_2 id_class() {
        return (rjG_2)this.id_class[id_byte[4]];
    }

    public iB_2 id_break() {
        return (iB_2)this.id_class[id_byte[3]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[2] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Pi_1.id_throws();
        Pi_1.id_case();
        Pi_1.id_protected();
    }

    private static void id_case() {
        short[] sArray = new short[7];
        sArray[4] = 1;
        sArray[6] = 1;
        id_byte = sArray;
    }

    private static void id_protected() {
        id_break = new byte[]{2};
    }
}

