/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVL;
import celestial.rqO_2;
import celestial.xd_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ri_3 {
    private static boolean[] id_break;
    private static short[] id_byte;
    public static Object[] id_class;
    private static String[] id_protected;

    private static void id_byte() {
        id_protected = new String[]{new String("minecraft"), new String("Invalid block name %s"), new String(":")};
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-13, 51, -88, -58, -16, 21, 104, 124}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private ri_3() {
    }

    static {
        ri_3.ntfClinit();
    }

    public static String id_class(xd_3 xd_32) {
        rqO_2 rqO_22 = rVL.id_strictfp.id_break(xd_32);
        String string = rqO_22.id_break();
        if (!rqO_22.id_byte().equals(id_protected[0])) {
            string = rqO_22.toString();
        }
        return string;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[3] = true;
        id_break = blArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9FD908DCE69CFED5L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x92860898;
    }

    public static xd_3 id_class(String string) {
        xd_3 xd_32 = ri_3.id_protected(string);
        if (xd_32 == null) {
            return xu_3.id_class;
        }
        return xd_32;
    }

    public static xd_3 id_break(String string) {
        xd_3 xd_32 = ri_3.id_protected(string);
        if (xd_32 == null) {
            Object[] objectArray = new Object[id_break[0]];
            objectArray[ri_3.id_break[1]] = string;
            throw new IllegalArgumentException(String.format(id_protected[1], objectArray));
        }
        return xd_32;
    }

    private static void id_break() {
        id_byte = new short[4];
    }

    private static /* synthetic */ void ntfClinit() {
        ri_3.id_class();
        ri_3.id_byte();
        ri_3.id_break();
        ri_3.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new HashMap()};
        id_class = objectArray;
    }

    public static xd_3 id_protected(String string) {
        HashMap<String, xd_3> hashMap;
        xd_3 xd_32 = (xd_3)((Map)id_class[id_byte[0]]).get(string);
        if (xd_32 != null) {
            return xd_32;
        }
        if (((Map)id_class[id_byte[1]]).containsKey(string)) {
            return null;
        }
        xd_32 = rVL.id_strictfp.id_break(rqO_2.id_break((String)(string.contains(id_protected[2]) ? string : "minecraft:" + string))).orElse(null);
        HashMap<String, xd_3> hashMap2 = new HashMap<String, xd_3>((Map)id_class[id_byte[2]]);
        hashMap2.put(string, xd_32);
        ri_3.id_class[ri_3.id_byte[3]] = hashMap = hashMap2;
        return xd_32;
    }
}

