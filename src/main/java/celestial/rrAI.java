/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rfH_2;
import celestial.ryZ_2;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAI {
    private static short[] id_byte;
    public static Object[] id_class;
    private static boolean[] id_protected;
    private static byte[] id_throws;
    public Object[] id_break;

    public xd_3 id_byte() {
        return (xd_3)this.id_break[id_byte[11]];
    }

    public rrAI() {
        this.id_implements();
    }

    static {
        rrAI.ntfClinit();
    }

    public static rrAI id_class(rdn_3 rdn_32, rfH_2 rfH_22, xd_3 xd_32, ryZ_2 ryZ_22) {
        rdn_3 rdn_33 = rdn_32;
        ((rrAI)rrAI.id_class[rrAI.id_byte[0]]).id_break[rrAI.id_byte[1]] = rdn_33;
        rfH_2 rfH_23 = rfH_22;
        ((rrAI)rrAI.id_class[rrAI.id_byte[2]]).id_break[rrAI.id_byte[3]] = rfH_23;
        xd_3 xd_33 = xd_32;
        ((rrAI)rrAI.id_class[rrAI.id_byte[4]]).id_break[rrAI.id_byte[5]] = xd_33;
        ryZ_2 ryZ_23 = ryZ_22;
        ((rrAI)rrAI.id_class[rrAI.id_byte[6]]).id_break[rrAI.id_byte[7]] = ryZ_23;
        return (rrAI)id_class[id_byte[8]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4DDB76365CF200E4L;
    }

    public rfH_2 id_class() {
        return (rfH_2)this.id_break[id_byte[10]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x22AEFC8;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-116, 14, 55, -74, 103, -95, -1, -15}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public ryZ_2 id_break() {
        return (ryZ_2)((Object)this.id_break[id_byte[12]]);
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrAI()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAI.id_case();
        rrAI.id_catch();
        rrAI.id_private();
        rrAI.id_throws();
    }

    private static void id_catch() {
        short[] sArray = new short[13];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[7] = 3;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 3;
        id_byte = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    private void id_implements() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }

    public rdn_3 id_protected() {
        return (rdn_3)this.id_break[id_byte[9]];
    }

    private static void id_private() {
        id_throws = new byte[]{4};
    }
}

