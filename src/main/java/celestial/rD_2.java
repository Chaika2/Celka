/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PX;
import celestial.rK_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rD_2
extends rK_2 {
    public Object[] id_break;
    private static short[] id_byte;
    private static byte[] id_protected;

    @Override
    public PX id_byte() {
        this.id_case();
        return (PX)this.id_break[id_byte[4]];
    }

    public rD_2(rK_2 rK_22, rK_2 rK_23) {
        super(rK_23);
        this.id_case();
        rK_2 rK_24 = rK_22;
        this.id_break[rD_2.id_byte[0]] = rK_24;
        PX pX = ((rK_2)this.id_break[id_byte[1]]).id_byte();
        this.id_break[rD_2.id_byte[2]] = pX;
    }

    static {
        rD_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6E34F8F2ED6BDE0L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{76, -48, 12, -53, 72, 99, 117, -18}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD8B5AD6D;
    }

    @Override
    public PX id_break(PX pX) {
        this.id_case();
        PX pX2 = super.id_break(pX);
        this.id_break[rD_2.id_byte[3]] = pX2;
        return pX2;
    }

    private static void id_throws() {
        id_protected = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rD_2.id_protected();
        rD_2.id_throws();
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[0]];
        }
    }

    private static void id_protected() {
        short[] sArray = new short[5];
        sArray[0] = 1;
        sArray[1] = 1;
        id_byte = sArray;
    }
}

