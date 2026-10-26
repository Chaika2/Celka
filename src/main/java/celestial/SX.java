/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BH;
import celestial.Bt_1;
import celestial.Bw_1;
import celestial.SJ;
import celestial.SW;
import celestial.Sd_1;
import celestial.Sk_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SX
implements Bw_1 {
    private static boolean[] id_class;
    private static short[] id_break;

    static {
        SX.ntfClinit();
    }

    @Override
    public Bt_1 id_class(String string) {
        String string2;
        int n;
        string = string.toLowerCase();
        String[] stringArray = (String[])BH.id_class[id_break[0]];
        int n2 = stringArray.length;
        for (n = id_class[0]; n < n2; ++n) {
            string2 = stringArray[n];
            if (!string.contains(string2)) continue;
            return new SJ();
        }
        stringArray = (String[])BH.id_class[id_break[1]];
        n2 = stringArray.length;
        for (n = id_class[1]; n < n2; ++n) {
            string2 = stringArray[n];
            if (!string.contains(string2)) continue;
            return new Sd_1();
        }
        stringArray = (String[])BH.id_class[id_break[2]];
        n2 = stringArray.length;
        for (n = id_class[2]; n < n2; ++n) {
            string2 = stringArray[n];
            if (!string.contains(string2)) continue;
            return new Sk_1();
        }
        stringArray = (String[])BH.id_class[id_break[3]];
        n2 = stringArray.length;
        for (n = id_class[3]; n < n2; ++n) {
            string2 = stringArray[n];
            if (!string.contains(string2)) continue;
            return new SW();
        }
        return null;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD72DC090;
    }

    private static void id_class() {
        id_class = new boolean[4];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x14BB9136E2463857L;
    }

    private static void id_break() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        id_break = sArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-27, -50, 81, 86, -22, 59, -1, 2}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        SX.id_class();
        SX.id_break();
    }
}

