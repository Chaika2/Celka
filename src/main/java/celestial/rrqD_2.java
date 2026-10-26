/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rjU_2;
import celestial.rrqU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqD_2 {
    public Object[] id_class;
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;

    public rjU_2 id_byte() {
        return (rjU_2)this.id_class[id_byte[11]];
    }

    public rrqD_2(rrqU_2 rrqU_22, rfH_2 rfH_22, rfj_3 rfj_32) {
        this.id_private();
        rrqU_2 rrqU_23 = rrqU_22;
        this.id_class[rrqD_2.id_byte[0]] = rrqU_23;
        rfj_3 rfj_33 = rfj_32;
        this.id_class[rrqD_2.id_byte[1]] = rfj_33;
        rjU_2 rjU_22 = new rjU_2(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
        this.id_class[rrqD_2.id_byte[2]] = rjU_22;
        rfH_2 rfH_23 = new rfH_2((rjU_2)this.id_class[id_byte[3]]);
        this.id_class[rrqD_2.id_byte[4]] = rfH_23;
    }

    static {
        rrqD_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_protected[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_protected[1];
        }
        rrqD_2 rrqD_22 = (rrqD_2)object;
        return Objects.equals((rjU_2)this.id_class[id_byte[5]], (rjU_2)rrqD_22.id_class[id_byte[6]]);
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_protected[2]];
        objectArray[rrqD_2.id_protected[3]] = (rjU_2)this.id_class[id_byte[7]];
        return Objects.hash(objectArray);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5E694AD4E58C1A02L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB21DF14F;
    }

    public rfj_3 id_class() {
        return (rfj_3)this.id_class[id_byte[9]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-99, -122, -56, 61, 35, -87, -15, 119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrqU_2 id_break() {
        return (rrqU_2)this.id_class[id_byte[8]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[2] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrqD_2.id_throws();
        rrqD_2.id_catch();
        rrqD_2.id_case();
    }

    private static void id_catch() {
        short[] sArray = new short[12];
        sArray[1] = 1;
        sArray[2] = 3;
        sArray[3] = 3;
        sArray[4] = 2;
        sArray[5] = 3;
        sArray[6] = 3;
        sArray[7] = 3;
        sArray[9] = 1;
        sArray[10] = 2;
        sArray[11] = 3;
        id_byte = sArray;
    }

    private static void id_case() {
        id_break = new byte[]{4};
    }

    public rfH_2 id_protected() {
        return (rfH_2)this.id_class[id_byte[10]];
    }

    private void id_private() {
        if (this.id_class == null) {
            this.id_class = new Object[4];
        }
    }
}

