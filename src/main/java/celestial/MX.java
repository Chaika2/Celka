/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MO;
import celestial.MW;
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

public non-sealed class MX
extends MO {
    private static String[] stringsd2fe04b6c6f939bbbb913f5ab83b18e0;

    public MX(String string2) {
    }

    static {
        MX.id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x965A30AB;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA23D20C5085B22B3L;
    }

    private static void id_class() {
        stringsd2fe04b6c6f939bbbb913f5ab83b18e0 = new String[]{new String("Version"), new String("Unsupported Version of a Sponge Schematic")};
    }

    @Override
    public rw_3 id_class(InputStream inputStream) throws IOException {
        rcd_3 rcd_32 = rcW_2.id_class(inputStream);
        int n = rcd_32.id_private(stringsd2fe04b6c6f939bbbb913f5ab83b18e0[0]);
        switch (n) {
            case 1: 
            case 2: {
                return new MW(rcd_32);
            }
        }
        throw new UnsupportedOperationException(stringsd2fe04b6c6f939bbbb913f5ab83b18e0[1]);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{118, 18, -79, 28, 81, -43, 1, -120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

