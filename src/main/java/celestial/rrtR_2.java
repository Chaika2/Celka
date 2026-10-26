/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtR_2 {
    private static boolean[] id_break;
    public static Object[] id_class;
    private static String[] id_byte;
    private static byte[] id_protected;

    private static void id_byte() {
        Object[] objectArray = new Object[]{Pattern.compile(id_byte[0]), Pattern.compile(id_byte[1]), Pattern.compile(id_byte[2]), Pattern.compile(id_byte[3]), Pattern.compile(id_byte[4]), Pattern.compile(id_byte[5]), Pattern.compile(id_byte[6]), Pattern.compile(id_byte[7]), Pattern.compile(id_byte[8])};
        id_class = objectArray;
    }

    static {
        rrtR_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-61, -103, 13, -106, -5, -88, 77, 36}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5DD06C4AA11C7707L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4E45A54D;
    }

    private static void id_class() {
        id_protected = new byte[]{2, 3, 4, 5, 6, 7, 8, 9};
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrtR_2.id_break();
        rrtR_2.id_protected();
        rrtR_2.id_class();
        rrtR_2.id_byte();
    }

    private static void id_protected() {
        id_byte = new String[]{new String("[a-zA-Z\u0430-\u044f\u0410-\u042f]+"), new String("[0-9]+"), new String("[a-zA-Z\u0430-\u044f\u0410-\u042f0-9]+"), new String("[a-zA-Z0-9]+"), new String("[a-zA-Z\u0430-\u044f\u0410-\u042f0-9 ]+"), new String("[\\w\u0430-\u044f\u0410-\u042f0-9-!@#$%^&~*<>,/\";\\[\\]{}()_+` ]+"), new String("[\\w\u0430-\u044f\u0410-\u042f0-9-!@#$%^&~*,\\[\\]{}()_+` ]+"), new String("^[a-zA-Z0-9_]+$"), new String("[a-zA-Z0-9!\\-=*@#$%^&()+/<>?_]+")};
    }
}

