/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLY;
import celestial.rrHU;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHD
implements Comparator<rLY> {
    private static byte[] id_break;
    public static Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    static {
        rrHD.ntfClinit();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((rLY)object, (rLY)object2);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-36, -62, -46, -114, -20, 18, -44, 39}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x469B3A17;
    }

    public int id_class(rLY rLY2, rLY rLY3) {
        int n = ((List)id_class[id_byte[0]]).indexOf(rLY2.id_class());
        int n2 = ((List)id_class[id_byte[1]]).indexOf(rLY3.id_class());
        if (n == id_break[0] && n2 == id_break[1]) {
            return id_protected[0];
        }
        if (n == id_break[2]) {
            return id_protected[1];
        }
        if (n2 == id_break[3]) {
            return id_break[4];
        }
        return Integer.compare(n, n2);
    }

    private static void id_class() {
        id_break = new byte[]{-1, -1, -1, -1, -1};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x39A5EDC8B7615AB7L;
    }

    private static void id_break() {
        id_byte = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrHD.id_byte();
        rrHD.id_break();
        rrHD.id_class();
        rrHD.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrHU()};
        id_class = objectArray;
    }
}

