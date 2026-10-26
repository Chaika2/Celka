/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.k_1;
import celestial.rrqX_2;
import celestial.rruq_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmt_3
implements rruq_1 {
    private static String[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_class = new String[]{new String(","), new String("\u041d\u0435 \u0443\u043a\u0430\u0437\u0430\u043d\u044b \u043f\u0440\u0435\u0444\u0438\u043a\u0441\u044b \u0434\u043b\u044f \u0443\u0434\u0430\u043b\u0435\u043d\u0438\u044f"), new String("\""), new String("")};
    }

    static {
        rrmt_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD7B672D9F42423D5L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBF4B231B;
    }

    private static void id_class() {
        id_byte = new boolean[1];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-6, 116, 61, 37, 40, -63, 121, 1}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        String[] stringArray = c_static.id_class(id_class[0]);
        if (stringArray == null || stringArray.length == 0) {
            throw new k_1(id_class[1]);
        }
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        for (int i = id_byte[0]; i < n; ++i) {
            String string = stringArray2[i];
            string = string.replaceAll(id_class[2], id_class[3]);
            ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[id_break[0]]).id_protected(string);
        }
    }

    private static void id_break() {
        id_break = new short[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrmt_3.id_class();
        rrmt_3.id_byte();
        rrmt_3.id_break();
    }
}

