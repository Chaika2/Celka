/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rqR_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryO {
    private static short[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static long[] id_protected;
    private static boolean[] id_throws;

    public boolean id_byte() {
        return (Boolean)this.id_class[id_break[6]];
    }

    public rryO(rhd_3 rhd_32, rdn_3 rdn_32) {
        this.id_case();
        Long l = rqR_2.id_break();
        this.id_class[rryO.id_break[7]] = l;
        rhd_3 rhd_33 = rhd_32;
        this.id_class[rryO.id_break[8]] = rhd_33;
        rdn_3 rdn_33 = rdn_32;
        this.id_class[rryO.id_break[9]] = rdn_33;
    }

    static {
        rryO.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_throws[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_throws[1];
        }
        rryO rryO2 = (rryO)object;
        return Objects.equals((rhd_3)this.id_class[id_break[0]], (rhd_3)rryO2.id_class[id_break[1]]);
    }

    public int hashCode() {
        return Objects.hashCode((rhd_3)this.id_class[id_break[2]]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{56, -71, 19, -9, -88, -21, -87, -24}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rryO.id_break[10]] = bl2;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x873CEF29;
    }

    public rdn_3 id_class() {
        return (rdn_3)this.id_class[id_break[4]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBF027C36BFAD6B56L;
    }

    public long id_break() {
        return (Long)this.id_class[id_break[5]];
    }

    private static void id_throws() {
        short[] sArray = new short[11];
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 2;
        sArray[9] = 1;
        sArray[10] = 3;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rryO.id_implements();
        rryO.id_private();
        rryO.id_throws();
        rryO.id_catch();
    }

    private static void id_catch() {
        id_byte = new byte[]{4, 2, 3};
    }

    private void id_case() {
        if (this.id_class == null) {
            this.id_class = new Object[4];
            this.id_class[2] = 0L;
            this.id_class[3] = false;
        }
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        id_throws = blArray;
    }

    public rhd_3 id_protected() {
        return (rhd_3)this.id_class[id_break[3]];
    }

    private static void id_private() {
        id_protected = new long[1];
    }
}

