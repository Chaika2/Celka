/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BD;
import celestial.BI;
import celestial.BK;
import celestial.BY;
import celestial.Be_1;
import celestial.Bg_1;
import celestial.Bi_1;
import celestial.Bj_1;
import celestial.Bl_1;
import celestial.Bt_1;
import celestial.Bw_1;
import celestial.SE;
import celestial.SP;
import celestial.SS;
import celestial.Sb_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bf_1
implements Bw_1 {
    private static short[] id_class;

    static {
        Bf_1.id_class();
    }

    @Override
    public Bt_1 id_class(String string) {
        if (BI.id_class(string = string.toLowerCase(), (String[])Bl_1.id_class[id_class[0]])) {
            return new Be_1();
        }
        if (BI.id_class(string, (String[])Bl_1.id_class[id_class[1]])) {
            return new SP();
        }
        if (BI.id_class(string, (String[])Bl_1.id_class[id_class[2]])) {
            return new Bg_1();
        }
        if (BI.id_class(string, (String[])Bl_1.id_class[id_class[3]])) {
            return new Bi_1();
        }
        if (BI.id_class(string, (String[])Bl_1.id_class[id_class[4]])) {
            return new BY();
        }
        if (BI.id_class(string, (String[])Bl_1.id_class[id_class[5]])) {
            return new SE();
        }
        if (BI.id_class(string, (String[])Bl_1.id_class[id_class[6]])) {
            return new Sb_1();
        }
        if (BI.id_class(string, (String[])Bl_1.id_class[id_class[7]])) {
            return new Bj_1();
        }
        if (BI.id_class(string, (String[])Bl_1.id_class[id_class[8]])) {
            return new SS();
        }
        if (BI.id_class(string, (String[])Bl_1.id_class[id_class[9]])) {
            return new BK();
        }
        if (BI.id_class(string, (String[])Bl_1.id_class[id_class[10]])) {
            return new BD();
        }
        return null;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF1303880;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD1EA1735CC06F5A4L;
    }

    private static void id_class() {
        id_class = new short[]{4, 5, 7, 6, 8, 9, 10, 11, 12, 13, 14};
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{102, 40, 107, 51, 86, 97, 33, 82}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

