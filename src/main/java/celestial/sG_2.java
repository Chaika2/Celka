/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_import;
import celestial.sE_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sG_2 {
    private static short[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;
    private static byte[] id_protected;
    private static String[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_byte = blArray;
    }

    private sG_2() {
    }

    static {
        sG_2.ntfClinit();
    }

    public static List<C_import> id_class(String string, boolean bl) {
        ArrayList<C_import> arrayList = new ArrayList<C_import>();
        Matcher matcher = ((Pattern)id_class[id_break[0]]).matcher(string);
        int n = id_protected[0];
        while (matcher.find()) {
            arrayList.add(new sE_2(arrayList.size(), matcher.group(), string.substring(matcher.start())));
            n = matcher.end();
        }
        if (bl && n < string.length()) {
            arrayList.add(new sE_2(arrayList.size(), id_throws[0], id_throws[1]));
        }
        return arrayList;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5F9E4CAD8C7C987CL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x19D85365;
    }

    public static List<C_import> id_class(String string) {
        return sG_2.id_class(string, id_byte[0]);
    }

    public static sE_2 id_class() {
        return new sE_2(id_protected[1], id_throws[2], id_throws[3]);
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{Pattern.compile(id_throws[4])};
        id_class = objectArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-77, 99, 108, -8, -84, -86, 28, 108}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_protected = new byte[]{-1, -1};
    }

    private static /* synthetic */ void ntfClinit() {
        sG_2.id_byte();
        sG_2.id_case();
        sG_2.id_protected();
        sG_2.id_throws();
        sG_2.id_break();
    }

    private static void id_case() {
        id_throws = new String[]{new String(""), new String(""), new String("<unknown>"), new String(""), new String("\\S+")};
    }

    private static void id_protected() {
        id_break = new short[1];
    }
}

