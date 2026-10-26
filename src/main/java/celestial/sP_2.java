/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_float;
import celestial.C_import;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sP_2
extends Enum<sP_2>
implements C_float<Integer> {
    private static short[] shorts5c83ec99d465346696c888af73f3fafe;
    private static String[] strings5c83ec99d465346696c888af73f3fafe;
    public static Object[] staticFields5c83ec99d465346696c888af73f3fafe;
    private static byte[] bytes5c83ec99d465346696c888af73f3fafe;
    private static boolean[] booleans5c83ec99d465346696c888af73f3fafe;

    private static void id_byte() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shorts5c83ec99d465346696c888af73f3fafe = sArray;
    }

    static {
        sP_2.ntfClinit();
    }

    public static sP_2[] values() {
        return (sP_2[])((sP_2[])staticFields5c83ec99d465346696c888af73f3fafe[shorts5c83ec99d465346696c888af73f3fafe[0]]).clone();
    }

    public static sP_2 valueOf(String string) {
        return Enum.valueOf(sP_2.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC506DB387740A81BL;
    }

    @Override
    public Class<Integer> id_class() {
        return Integer.class;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEFE546F;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-107, -92, 34, -52, 51, 38, 59, 88}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public /* synthetic */ Object id_class(C_import c_import) throws Exception {
        return this.id_break(c_import);
    }

    public Integer id_break(C_import c_import) throws RuntimeException {
        return Integer.parseInt(c_import.id_break());
    }

    private static void id_break() {
        bytes5c83ec99d465346696c888af73f3fafe = new byte[]{2};
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new sP_2(), new sP_2[]{(sP_2)objectArray[0]}};
        staticFields5c83ec99d465346696c888af73f3fafe = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sP_2.id_catch();
        sP_2.id_case();
        sP_2.id_byte();
        sP_2.id_break();
        sP_2.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans5c83ec99d465346696c888af73f3fafe = blArray;
    }

    private static void id_case() {
        strings5c83ec99d465346696c888af73f3fafe = new String[]{new String("INSTANCE")};
    }

    private static /* synthetic */ sP_2[] id_protected() {
        sP_2[] sP_2Array = new sP_2[booleans5c83ec99d465346696c888af73f3fafe[0]];
        sP_2Array[sP_2.booleans5c83ec99d465346696c888af73f3fafe[1]] = (sP_2)staticFields5c83ec99d465346696c888af73f3fafe[shorts5c83ec99d465346696c888af73f3fafe[1]];
        return sP_2Array;
    }
}

