/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Va_1;
import celestial.Ve_1;
import celestial.Vu_1;
import celestial.setting.KeyBind;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfC_2
implements MinecraftAccessor {
    private static short[] id_break;
    public static Object[] id_class;
    private static boolean[] id_byte;
    private static byte[] id_protected;

    private static void id_byte() {
        id_protected = new byte[]{8};
    }

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x43A7060A;
    }

    static {
        rrfC_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{20, 24, 50, 41, -91, 84, 52, -63}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_break = new short[2];
    }

    public static KeyBind id_class(int n) {
        return ((Map)id_class[id_break[0]]).getOrDefault(n, (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_break[1]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x979B6EF409FA69FEL;
    }

    public static boolean id_class(Vu_1 vu_1) {
        if (vu_1.id_implements().isEmpty()) {
            return rrfC_2.id_break(vu_1.id_int().id_break());
        }
        for (Va_1 va_1 : vu_1.id_implements()) {
            if (rrfC_2.id_break(va_1.id_break())) continue;
            return id_byte[1];
        }
        return id_byte[2];
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[2] = true;
        blArray[4] = true;
        id_byte = blArray;
    }

    public static boolean id_break(int n) {
        if (n < 0) {
            return id_byte[0];
        }
        return n <= id_protected[0] ? Ve_1.id_break(id_const.id_implements(), n) : Ve_1.id_class(id_const.id_implements(), n);
    }

    private static /* synthetic */ void ntfClinit() {
        rrfC_2.id_break();
        rrfC_2.id_class();
        rrfC_2.id_byte();
        rrfC_2.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new LinkedHashMap()};
        id_class = objectArray;
    }
}

