/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrFQ;
import celestial.rrFk_1;
import celestial.rrFz_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFN
implements Comparator<rrFz_1> {
    private static byte[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_byte = blArray;
    }

    static {
        rrFN.ntfClinit();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((rrFz_1)object, (rrFz_1)object2);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x492761A241206A23L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4561F122;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-126, 71, 91, 79, -15, 86, -111, -108}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_break = new short[2];
    }

    public int id_class(rrFz_1 rrFz_12, rrFz_1 rrFz_13) {
        if (rrFz_12.id_byte() || rrFz_13.id_byte()) {
            return id_byte[0];
        }
        rrFQ rrFQ2 = (rrFQ)rrFz_12;
        rrFQ rrFQ3 = (rrFQ)rrFz_13;
        int n = ((List)rrFk_1.id_class[id_break[0]]).indexOf(rrFQ2.id_private().id_class());
        int n2 = ((List)rrFk_1.id_class[id_break[1]]).indexOf(rrFQ3.id_private().id_class());
        if (n == id_class[0] && n2 == id_class[1]) {
            return id_byte[1];
        }
        if (n == id_class[2]) {
            return id_byte[2];
        }
        if (n2 == id_class[3]) {
            return id_class[4];
        }
        return Integer.compare(n, n2);
    }

    private static void id_break() {
        id_class = new byte[]{-1, -1, -1, -1, -1};
    }

    private static /* synthetic */ void ntfClinit() {
        rrFN.id_byte();
        rrFN.id_class();
        rrFN.id_break();
    }
}

