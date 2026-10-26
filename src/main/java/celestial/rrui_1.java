/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rruq_1;
import celestial.rryd_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrui_1
implements rruq_1 {
    private static short[] id_class;
    private static boolean[] id_break;
    private static String[] id_byte;

    private static void id_byte() {
        id_break = new boolean[]{true, true};
    }

    static {
        rrui_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x19E46FC27AB1DA44L;
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        String string = c_static.id_extends().replaceAll(id_byte[0], id_byte[1]);
        CharSequence[] charSequenceArray = c_static.id_class(id_byte[2]);
        String string2 = charSequenceArray.length == 0 ? null : String.join((CharSequence)id_byte[3], charSequenceArray);
        ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_class[0]]).id_class(string, string2, id_break[0], id_break[1]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-72, 123, 121, -4, 15, -13, 49, -6}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_class = new short[1];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x31265750;
    }

    private static void id_break() {
        id_byte = new String[]{new String(","), new String(""), new String(" "), new String(" ")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrui_1.id_byte();
        rrui_1.id_break();
        rrui_1.id_class();
    }
}

