/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.ri_3;
import celestial.rrqU_2;
import celestial.rrqY_2;
import celestial.rruD;
import celestial.rruq_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruR
implements rruq_1 {
    private static short[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_break = blArray;
    }

    static {
        rruR.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-114, 37, -30, -79, -29, -1, -7, 90}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDF420572610EA08CL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x27F6DC87;
    }

    private static void id_class() {
        id_class = new short[2];
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        String string = c_static.id_extends();
        int n = c_static.id_case(id_break[0]) ? id_byte[0] : (Integer)c_static.id_break((rruD)rruD.staticFieldsba29985e322c382da8479b6f59b746b0[id_class[0]]);
        ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[id_class[1]]).id_class(new rrqU_2(ri_3.id_class(string), n), string, id_break[1]);
    }

    private static void id_break() {
        id_byte = new byte[]{-1};
    }

    private static /* synthetic */ void ntfClinit() {
        rruR.id_byte();
        rruR.id_class();
        rruR.id_break();
    }
}

