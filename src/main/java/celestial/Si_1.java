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

public class Si_1
extends Enum<Si_1>
implements C_float<Double> {
    private static byte[] bytes723689ef04ae388e9b4d79e790173501;
    private static short[] shorts723689ef04ae388e9b4d79e790173501;
    private static String[] strings723689ef04ae388e9b4d79e790173501;
    public static Object[] staticFields723689ef04ae388e9b4d79e790173501;
    private static boolean[] booleans723689ef04ae388e9b4d79e790173501;

    private static void id_byte() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shorts723689ef04ae388e9b4d79e790173501 = sArray;
    }

    static {
        Si_1.ntfClinit();
    }

    public static Si_1[] values() {
        return (Si_1[])((Si_1[])staticFields723689ef04ae388e9b4d79e790173501[shorts723689ef04ae388e9b4d79e790173501[0]]).clone();
    }

    public static Si_1 valueOf(String string) {
        return Enum.valueOf(Si_1.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE52415275B944362L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-71, -6, -59, -109, 85, 47, -72, -66}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public /* synthetic */ Object id_class(C_import c_import) throws Exception {
        return this.id_break(c_import);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5C06A703;
    }

    @Override
    public Class<Double> id_class() {
        return Double.class;
    }

    public Double id_break(C_import c_import) throws RuntimeException {
        String string = c_import.id_break();
        if (!string.matches(strings723689ef04ae388e9b4d79e790173501[0])) {
            throw new IllegalArgumentException(strings723689ef04ae388e9b4d79e790173501[1]);
        }
        return Double.parseDouble(string);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans723689ef04ae388e9b4d79e790173501 = blArray;
    }

    private static void id_throws() {
        strings723689ef04ae388e9b4d79e790173501 = new String[]{new String("^([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)|)$"), new String("failed double format check"), new String("INSTANCE")};
    }

    private static /* synthetic */ void ntfClinit() {
        Si_1.id_break();
        Si_1.id_throws();
        Si_1.id_byte();
        Si_1.id_case();
        Si_1.id_protected();
    }

    private static /* synthetic */ Si_1[] id_catch() {
        Si_1[] si_1Array = new Si_1[booleans723689ef04ae388e9b4d79e790173501[0]];
        si_1Array[Si_1.booleans723689ef04ae388e9b4d79e790173501[1]] = (Si_1)staticFields723689ef04ae388e9b4d79e790173501[shorts723689ef04ae388e9b4d79e790173501[1]];
        return si_1Array;
    }

    private static void id_case() {
        bytes723689ef04ae388e9b4d79e790173501 = new byte[]{2};
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new Si_1(), new Si_1[]{(Si_1)objectArray[0]}};
        staticFields723689ef04ae388e9b4d79e790173501 = objectArray;
    }
}

