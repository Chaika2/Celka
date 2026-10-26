/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.ri_3;
import celestial.rrqQ_2;
import celestial.rrqz_3;
import celestial.rruD;
import celestial.rruq_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmo_3
implements rruq_1 {
    private static short[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    static {
        rrmo_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD35D64EB;
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        String string = c_static.id_extends();
        int n = c_static.id_case(id_byte[0]) ? id_break[0] : (Integer)c_static.id_break((rruD)rruD.staticFieldsba29985e322c382da8479b6f59b746b0[id_class[0]]);
        ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_class[1]]).id_class(new rrqz_3(ri_3.id_class(string), n), string, id_byte[1]);
    }

    private static void id_class() {
        id_break = new byte[]{-1};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-93, 76, -21, 42, -8, 24, -54, 11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5BB45F94F3E2DF9BL;
    }

    private static void id_break() {
        id_class = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrmo_3.id_byte();
        rrmo_3.id_break();
        rrmo_3.id_class();
    }
}

