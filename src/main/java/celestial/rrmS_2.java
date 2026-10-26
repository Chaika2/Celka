/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.k_1;
import celestial.rruq_1;
import celestial.rryd_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmS_2
implements rruq_1 {
    private static String[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_byte = new boolean[1];
    }

    static {
        rrmS_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1FC90D32B79A4822L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE6B8741D;
    }

    private static void id_class() {
        id_break = new short[1];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-86, -71, 40, -115, -26, -1, 103, -35}, "DES");
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
            ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_break[0]]).id_break(string);
        }
    }

    private static void id_break() {
        id_class = new String[]{new String(","), new String("\u041d\u0435 \u0443\u043a\u0430\u0437\u0430\u043d\u044b \u0438\u043c\u0435\u043d\u0430 \u0434\u043b\u044f \u0443\u0434\u0430\u043b\u0435\u043d\u0438\u044f"), new String("\""), new String("")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmS_2.id_byte();
        rrmS_2.id_break();
        rrmS_2.id_class();
    }
}

