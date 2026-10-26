/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrfk_3;
import celestial.rrfx_3;
import celestial.rrfz_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfW_2
extends ArrayList<rrfz_3> {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    public rrfW_2(rrfk_3 rrfk_32) {
        this.id_byte();
        rrfk_3 rrfk_33 = rrfk_32;
        this.id_class[rrfW_2.id_byte[0]] = rrfk_33;
        rrfx_3[] rrfx_3Array = rrfx_3.values();
        int n = rrfx_3Array.length;
        for (int i = id_break[0]; i < n; ++i) {
            rrfx_3 rrfx_32 = rrfx_3Array[i];
            if (!rrfx_32.id_byte()) continue;
            this.add(new rrfz_3((rrfk_3)this.id_class[id_byte[1]], rrfx_32, rrfx_32.id_break()));
        }
    }

    static {
        rrfW_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x97BF6C9884171834L;
    }

    private static void id_class() {
        id_byte = new short[2];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{15, 57, 72, 62, -10, -57, 8, -35}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBC6B855E;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfW_2.id_break();
        rrfW_2.id_class();
    }
}

