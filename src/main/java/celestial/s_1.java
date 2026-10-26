/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_for;
import celestial.C_static;
import celestial.C_switch;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class s_1
extends Enum<s_1>
implements C_switch<Double, Double> {
    private static double[] doubles2f6c75eddeaf3dec901642e9ef998dc8;
    public static Object[] staticFields2f6c75eddeaf3dec901642e9ef998dc8;
    private static short[] shorts2f6c75eddeaf3dec901642e9ef998dc8;
    private static boolean[] booleans2f6c75eddeaf3dec901642e9ef998dc8;
    private static byte[] bytes2f6c75eddeaf3dec901642e9ef998dc8;
    private static String[] strings2f6c75eddeaf3dec901642e9ef998dc8;

    private static void id_byte() {
        bytes2f6c75eddeaf3dec901642e9ef998dc8 = new byte[]{2, 2, 2, 2, 2, 3, 2, 4};
    }

    static {
        s_1.ntfClinit();
    }

    public static s_1[] values() {
        return (s_1[])((s_1[])staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2f6c75eddeaf3dec901642e9ef998dc8[0]]).clone();
    }

    public static s_1 valueOf(String string) {
        return Enum.valueOf(s_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x59C4DC02;
    }

    @Override
    public Double id_class(C_for c_for, Double d) throws x_1 {
        double d2;
        Matcher matcher;
        if (d == null) {
            d = doubles2f6c75eddeaf3dec901642e9ef998dc8[0];
        }
        if (!(matcher = ((Pattern)staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2f6c75eddeaf3dec901642e9ef998dc8[1]]).matcher(c_for.id_class().id_extends())).matches()) {
            throw new IllegalArgumentException(strings2f6c75eddeaf3dec901642e9ef998dc8[0]);
        }
        boolean bl = !matcher.group(booleans2f6c75eddeaf3dec901642e9ef998dc8[0]).isEmpty() ? booleans2f6c75eddeaf3dec901642e9ef998dc8[1] : booleans2f6c75eddeaf3dec901642e9ef998dc8[2];
        double d3 = d2 = matcher.group(bytes2f6c75eddeaf3dec901642e9ef998dc8[0]).isEmpty() ? doubles2f6c75eddeaf3dec901642e9ef998dc8[1] : Double.parseDouble(matcher.group(bytes2f6c75eddeaf3dec901642e9ef998dc8[1]).replaceAll((String)staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2f6c75eddeaf3dec901642e9ef998dc8[2]], strings2f6c75eddeaf3dec901642e9ef998dc8[1]));
        if (matcher.group(bytes2f6c75eddeaf3dec901642e9ef998dc8[2]).toLowerCase().contains(strings2f6c75eddeaf3dec901642e9ef998dc8[2])) {
            d2 *= doubles2f6c75eddeaf3dec901642e9ef998dc8[2];
        }
        if (matcher.group(bytes2f6c75eddeaf3dec901642e9ef998dc8[3]).toLowerCase().contains(strings2f6c75eddeaf3dec901642e9ef998dc8[3])) {
            d2 *= doubles2f6c75eddeaf3dec901642e9ef998dc8[3];
        }
        if (bl) {
            return d + d2;
        }
        return d2;
    }

    @Override
    public Stream<String> id_class(C_for c_for) throws x_1 {
        C_static c_static = c_for.id_class();
        if (!c_static.id_break(bytes2f6c75eddeaf3dec901642e9ef998dc8[4]) && c_static.id_extends().matches(strings2f6c75eddeaf3dec901642e9ef998dc8[4])) {
            return Stream.of(strings2f6c75eddeaf3dec901642e9ef998dc8[5]);
        }
        return Stream.empty();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEB3C3BD8F96C1B24L;
    }

    private static /* synthetic */ s_1[] id_class() {
        s_1[] s_1Array = new s_1[booleans2f6c75eddeaf3dec901642e9ef998dc8[3]];
        s_1Array[s_1.booleans2f6c75eddeaf3dec901642e9ef998dc8[4]] = (s_1)staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2f6c75eddeaf3dec901642e9ef998dc8[3]];
        return s_1Array;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{32, -89, 80, 105, 23, -12, 10, 10}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        double[] dArray = new double[4];
        dArray[2] = 1000.0;
        dArray[3] = 1000000.0;
        doubles2f6c75eddeaf3dec901642e9ef998dc8 = dArray;
    }

    private static void id_throws() {
        strings2f6c75eddeaf3dec901642e9ef998dc8 = new String[]{new String("pattern doesn't match"), new String(""), new String("k"), new String("m"), new String("^(~|$)"), new String("~"), new String("INSTANCE"), new String("[kKmM]")};
    }

    private static /* synthetic */ void ntfClinit() {
        s_1.id_protected();
        s_1.id_throws();
        s_1.id_catch();
        s_1.id_break();
        s_1.id_byte();
        s_1.id_case();
    }

    private static void id_catch() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[1] = 2;
        sArray[2] = 1;
        shorts2f6c75eddeaf3dec901642e9ef998dc8 = sArray;
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new s_1(), strings2f6c75eddeaf3dec901642e9ef998dc8[7], Pattern.compile("^(~?)([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)([kKmM]?)|)$", 0), new s_1[]{(s_1)objectArray[0]}};
        staticFields2f6c75eddeaf3dec901642e9ef998dc8 = objectArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[7] = true;
        blArray[8] = true;
        booleans2f6c75eddeaf3dec901642e9ef998dc8 = blArray;
    }
}

