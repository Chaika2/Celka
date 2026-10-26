/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_for;
import celestial.C_static;
import celestial.C_switch;
import celestial.rU_2;
import celestial.s_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class S
extends Enum<S>
implements C_switch<rU_2, rU_2> {
    private static byte[] bytes2b61d3be194f3208a61ab56674f124f7;
    private static short[] shorts2b61d3be194f3208a61ab56674f124f7;
    public static Object[] staticFields2b61d3be194f3208a61ab56674f124f7;
    private static boolean[] booleans2b61d3be194f3208a61ab56674f124f7;
    private static String[] strings2b61d3be194f3208a61ab56674f124f7;

    private static void id_byte() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans2b61d3be194f3208a61ab56674f124f7 = blArray;
    }

    static {
        S.ntfClinit();
    }

    public static S[] values() {
        return (S[])((S[])staticFields2b61d3be194f3208a61ab56674f124f7[shorts2b61d3be194f3208a61ab56674f124f7[0]]).clone();
    }

    public static S valueOf(String string) {
        return Enum.valueOf(S.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x360970A257A40AC7L;
    }

    @Override
    public Stream<String> id_class(C_for c_for) throws x_1 {
        C_static c_static = c_for.id_class();
        if (c_static.id_final() && !c_static.id_break(bytes2b61d3be194f3208a61ab56674f124f7[0])) {
            while (c_static.id_break(bytes2b61d3be194f3208a61ab56674f124f7[1]) && c_static.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2b61d3be194f3208a61ab56674f124f7[8]]) != null) {
                c_static.id_throws();
            }
            return c_static.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2b61d3be194f3208a61ab56674f124f7[9]]);
        }
        return Stream.empty();
    }

    private static void id_class() {
        short[] sArray = new short[11];
        sArray[0] = 1;
        sArray[5] = 1;
        sArray[7] = 2;
        shorts2b61d3be194f3208a61ab56674f124f7 = sArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{27, -25, -93, -4, -68, 125, 86, 93}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAAF0AAB3;
    }

    @Override
    public rU_2 id_class(C_for c_for, rU_2 rU_22) throws x_1 {
        if (rU_22 == null) {
            rU_22 = (rU_2)rU_2.id_class[shorts2b61d3be194f3208a61ab56674f124f7[1]];
        }
        C_static c_static = c_for.id_class();
        return new rU_2((Double)c_static.id_break((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2b61d3be194f3208a61ab56674f124f7[2]], Double.valueOf(((Integer)rU_22.id_break[shorts2b61d3be194f3208a61ab56674f124f7[3]]).intValue())), (Double)c_static.id_break((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2b61d3be194f3208a61ab56674f124f7[4]], Double.valueOf(((Integer)rU_22.id_break[shorts2b61d3be194f3208a61ab56674f124f7[5]]).intValue())), (Double)c_static.id_break((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2b61d3be194f3208a61ab56674f124f7[6]], Double.valueOf(((Integer)rU_22.id_break[shorts2b61d3be194f3208a61ab56674f124f7[7]]).intValue())));
    }

    private static void id_break() {
        strings2b61d3be194f3208a61ab56674f124f7 = new String[]{new String("INSTANCE")};
    }

    private static void id_throws() {
        bytes2b61d3be194f3208a61ab56674f124f7 = new byte[]{4, 2, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        S.id_byte();
        S.id_break();
        S.id_class();
        S.id_throws();
        S.id_protected();
    }

    private static /* synthetic */ S[] id_case() {
        S[] sArray = new S[booleans2b61d3be194f3208a61ab56674f124f7[0]];
        sArray[S.booleans2b61d3be194f3208a61ab56674f124f7[1]] = (S)staticFields2b61d3be194f3208a61ab56674f124f7[shorts2b61d3be194f3208a61ab56674f124f7[10]];
        return sArray;
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new S(), new S[]{(S)objectArray[0]}};
        staticFields2b61d3be194f3208a61ab56674f124f7 = objectArray;
    }
}

