/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_float;
import celestial.C_import;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sa_1
implements C_float<Boolean> {
    private static short[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static String[] id_throws;
    public static Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        id_protected = blArray;
    }

    static {
        Sa_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDB242BB7;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4A7FC0D40A09B4A4L;
    }

    @Override
    public Class<Boolean> id_class() {
        return Boolean.class;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-72, -98, 118, 9, 60, 42, -46, 37}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public /* synthetic */ Object id_class(C_import c_import) throws Exception {
        return this.id_break(c_import);
    }

    private static void id_break() {
        id_throws = new String[]{new String("invalid boolean"), new String("1"), new String("true"), new String("yes"), new String("t"), new String("y"), new String("on"), new String("enable"), new String("0"), new String("false"), new String("no"), new String("f"), new String("n"), new String("off"), new String("disable")};
    }

    public Boolean id_break(C_import c_import) throws RuntimeException {
        String string = c_import.id_break();
        if (((List)id_class[id_break[0]]).contains(string.toLowerCase(Locale.US))) {
            return id_protected[0];
        }
        if (((List)id_class[id_break[1]]).contains(string.toLowerCase(Locale.US))) {
            return id_protected[1];
        }
        throw new IllegalArgumentException(id_throws[0]);
    }

    private static void id_throws() {
        id_break = new short[]{1, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        Sa_1.id_byte();
        Sa_1.id_break();
        Sa_1.id_throws();
        Sa_1.id_protected();
        Sa_1.id_case();
    }

    private static void id_case() {
        Object[] objectArray = new Object[3];
        objectArray[0] = new Sa_1();
        String[] stringArray = new String[]{id_throws[1], id_throws[2], id_throws[3], id_throws[4], id_throws[5], id_throws[6], id_throws[7]};
        objectArray[1] = Arrays.asList((Object[])stringArray);
        String[] stringArray2 = new String[]{id_throws[8], id_throws[9], id_throws[10], id_throws[11], id_throws[12], id_throws[13], id_throws[14]};
        objectArray[2] = Arrays.asList((Object[])stringArray2);
        id_class = objectArray;
    }

    private static void id_protected() {
        id_byte = new byte[]{7, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5, 6, 2, 3};
    }
}

