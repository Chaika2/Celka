/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.k_1;
import celestial.rrqM_2;
import celestial.rruq_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmL_2
implements rruq_1 {
    private static short[] id_class;
    private static boolean[] id_break;
    private static String[] id_byte;

    private static void id_byte() {
        id_byte = new String[]{new String(","), new String("\u041d\u0435 \u0443\u043a\u0430\u0437\u0430\u043d\u044b \u0438\u043c\u0435\u043d\u0430 \u0434\u043b\u044f \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0438\u044f"), new String("\""), new String("")};
    }

    static {
        rrmL_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-99, -101, 34, -60, -7, -97, 88, 112}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCE83634F6DD1574L;
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        String[] stringArray = c_static.id_class(id_byte[0]);
        if (stringArray == null || stringArray.length == 0) {
            throw new k_1(id_byte[1]);
        }
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        for (int i = id_break[0]; i < n; ++i) {
            String string = stringArray2[i];
            string = string.replaceAll(id_byte[2], id_byte[3]);
            ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_class[0]]).id_class(string, id_break[1], id_break[2]);
        }
    }

    private static void id_class() {
        id_class = new short[1];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEB9AA3A5;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrmL_2.id_break();
        rrmL_2.id_byte();
        rrmL_2.id_class();
    }
}

