/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PX;
import celestial.rrTC;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTl_1
extends rrTC {
    private static short[] id_protected;
    private static byte[] id_throws;
    public Object[] id_byte;

    public rrTl_1(rrTC rrTC2, rrTC rrTC3) {
        super(rrTC3);
        this.id_private();
        rrTC rrTC4 = rrTC2;
        this.id_byte[rrTl_1.id_protected[0]] = rrTC4;
        PX pX = ((rrTC)this.id_byte[id_protected[1]]).id_throws();
        this.id_byte[rrTl_1.id_protected[2]] = pX;
    }

    static {
        rrTl_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-64, -36, 67, -103, 87, 110, -39, 36}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD1AAEAB0E58F4D93L;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x41BE3C81;
    }

    @Override
    public PX id_break(PX pX) {
        this.id_private();
        PX pX2 = super.id_break(pX);
        this.id_byte[rrTl_1.id_protected[3]] = pX2;
        return pX2;
    }

    @Override
    public PX id_throws() {
        this.id_private();
        return (PX)this.id_byte[id_protected[4]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrTl_1.id_catch();
        rrTl_1.id_case();
    }

    private static void id_catch() {
        short[] sArray = new short[5];
        sArray[0] = 1;
        sArray[1] = 1;
        id_protected = sArray;
    }

    private static void id_case() {
        id_throws = new byte[]{2};
    }

    private void id_private() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_throws[0]];
        }
    }
}

