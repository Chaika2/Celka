/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rrFr_1;
import celestial.rrvi_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFB
extends rrFr_1 {
    public Object[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    private static boolean[] id_throws;

    @Override
    public boolean id_byte() {
        return id_throws[0];
    }

    private static long id_byte(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF9987490481B7439L;
    }

    public rrFB(rrvi_1 rrvi_12, rdb_3 rdb_32, String string) {
        this.id_extends();
        rrvi_1 rrvi_13 = rrvi_12;
        this.id_break[rrFB.id_protected[0]] = rrvi_13;
        rdn_3 rdn_32 = new rdn_3(rdb_32);
        this.id_break[rrFB.id_protected[1]] = rdn_32;
        String string2 = string;
        this.id_break[rrFB.id_protected[2]] = string2;
    }

    static {
        rrFB.ntfClinit();
    }

    @Override
    public rdn_3 id_class() {
        this.id_extends();
        return (rdn_3)this.id_break[id_protected[3]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1AD646F5;
    }

    @Override
    public boolean id_break(boolean bl) {
        this.id_extends();
        return ((rrvi_1)this.id_break[id_protected[6]]).id_package();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-3, 21, -55, -8, -66, -24, -121, -4}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public boolean id_throws() {
        return id_throws[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrFB.id_native();
        rrFB.id_final();
        rrFB.id_volatile();
    }

    private void id_extends() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
        }
    }

    @Override
    public String id_implements() {
        this.id_extends();
        return (String)this.id_break[id_protected[4]];
    }

    @Override
    public boolean id_protected() {
        this.id_extends();
        return ((rrvi_1)this.id_break[id_protected[5]]).x();
    }

    private static void id_final() {
        short[] sArray = new short[7];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 2;
        id_protected = sArray;
    }

    private static void id_volatile() {
        id_byte = new byte[]{3};
    }

    private static void id_native() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_throws = blArray;
    }
}

