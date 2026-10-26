/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MO;
import celestial.Mx_1;
import celestial.rcW_2;
import celestial.rcd_3;
import celestial.rw_3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class MJ
extends MO {
    private static String[] strings0d5b709486283861898e8c1ef233f216;
    private static boolean[] booleans0d5b709486283861898e8c1ef233f216;

    public MJ(String string2) {
    }

    static {
        MJ.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8AA97746F924E09DL;
    }

    private static void id_class() {
        strings0d5b709486283861898e8c1ef233f216 = new String[]{new String("Version"), new String("This litematic Version is too old."), new String("This litematic Version is too new."), new String("Unsuported Version of a Litematica Schematic")};
    }

    @Override
    public rw_3 id_class(InputStream inputStream) throws IOException {
        rcd_3 rcd_32 = rcW_2.id_class(inputStream);
        int n = rcd_32.id_private(strings0d5b709486283861898e8c1ef233f216[0]);
        switch (n) {
            case 4: {
                throw new UnsupportedOperationException(strings0d5b709486283861898e8c1ef233f216[1]);
            }
            case 5: {
                return new Mx_1(rcd_32, booleans0d5b709486283861898e8c1ef233f216[0]);
            }
            case 6: {
                throw new UnsupportedOperationException(strings0d5b709486283861898e8c1ef233f216[2]);
            }
        }
        throw new UnsupportedOperationException(strings0d5b709486283861898e8c1ef233f216[3]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBB27EA74;
    }

    private static void id_break() {
        booleans0d5b709486283861898e8c1ef233f216 = new boolean[1];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{34, 40, -29, -102, -17, -27, -27, 117}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        MJ.id_break();
        MJ.id_class();
    }
}

