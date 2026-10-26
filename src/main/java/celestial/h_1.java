/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_for;
import celestial.C_static;
import celestial.C_switch;
import celestial.rjU_2;
import celestial.s_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class h_1
extends Enum<h_1>
implements C_switch<rjU_2, rjU_2> {
    private static short[] shortse900d351c8b53997a0ceaa72eeab0b7d;
    public static Object[] staticFieldse900d351c8b53997a0ceaa72eeab0b7d;
    private static boolean[] booleanse900d351c8b53997a0ceaa72eeab0b7d;
    private static byte[] bytese900d351c8b53997a0ceaa72eeab0b7d;
    private static String[] stringse900d351c8b53997a0ceaa72eeab0b7d;

    private static void id_byte() {
        bytese900d351c8b53997a0ceaa72eeab0b7d = new byte[]{4, 2, 2};
    }

    static {
        h_1.ntfClinit();
    }

    public static h_1[] values() {
        return (h_1[])((h_1[])staticFieldse900d351c8b53997a0ceaa72eeab0b7d[shortse900d351c8b53997a0ceaa72eeab0b7d[0]]).clone();
    }

    public static h_1 valueOf(String string) {
        return Enum.valueOf(h_1.class, string);
    }

    @Override
    public rjU_2 id_class(C_for c_for, rjU_2 rjU_22) throws x_1 {
        if (rjU_22 == null) {
            rjU_22 = rjU_2.id_class;
        }
        C_static c_static = c_for.id_class();
        return new rjU_2((Double)c_static.id_break((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortse900d351c8b53997a0ceaa72eeab0b7d[1]], rjU_22.id_break), (Double)c_static.id_break((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortse900d351c8b53997a0ceaa72eeab0b7d[2]], rjU_22.id_byte), (Double)c_static.id_break((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortse900d351c8b53997a0ceaa72eeab0b7d[3]], rjU_22.id_protected));
    }

    @Override
    public Stream<String> id_class(C_for c_for) throws x_1 {
        C_static c_static = c_for.id_class();
        if (c_static.id_final() && !c_static.id_break(bytese900d351c8b53997a0ceaa72eeab0b7d[0])) {
            while (c_static.id_break(bytese900d351c8b53997a0ceaa72eeab0b7d[1]) && c_static.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortse900d351c8b53997a0ceaa72eeab0b7d[4]]) != null) {
                c_static.id_throws();
            }
            return c_static.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortse900d351c8b53997a0ceaa72eeab0b7d[5]]);
        }
        return Stream.empty();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8011E1744B23CC7FL;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleanse900d351c8b53997a0ceaa72eeab0b7d = blArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x369E8825;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-93, -94, -22, 36, 31, 64, 48, -100}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new h_1(), new h_1[]{(h_1)objectArray[0]}};
        staticFieldse900d351c8b53997a0ceaa72eeab0b7d = objectArray;
    }

    private static void id_throws() {
        short[] sArray = new short[7];
        sArray[0] = 1;
        shortse900d351c8b53997a0ceaa72eeab0b7d = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        h_1.id_class();
        h_1.id_case();
        h_1.id_throws();
        h_1.id_byte();
        h_1.id_break();
    }

    private static void id_case() {
        stringse900d351c8b53997a0ceaa72eeab0b7d = new String[]{new String("INSTANCE")};
    }

    private static /* synthetic */ h_1[] id_protected() {
        h_1[] h_1Array = new h_1[booleanse900d351c8b53997a0ceaa72eeab0b7d[0]];
        h_1Array[h_1.booleanse900d351c8b53997a0ceaa72eeab0b7d[1]] = (h_1)staticFieldse900d351c8b53997a0ceaa72eeab0b7d[shortse900d351c8b53997a0ceaa72eeab0b7d[6]];
        return h_1Array;
    }
}

