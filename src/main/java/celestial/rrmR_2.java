/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rrje_3;
import celestial.rruq_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmR_2
implements rruq_1 {
    private static String[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    private static void id_byte() {
        id_class = new String[]{new String(" ")};
    }

    static {
        rrmR_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-86, 90, 113, -66, -2, 60, -29, 112}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBA062838BF365BE0L;
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        ((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_byte[0]])).id_break(c_static.id_break(id_class[0]), id_break[0]);
    }

    private static void id_class() {
        id_break = new boolean[]{true};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB6FD2036;
    }

    private static void id_break() {
        id_byte = new short[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrmR_2.id_class();
        rrmR_2.id_byte();
        rrmR_2.id_break();
    }
}

