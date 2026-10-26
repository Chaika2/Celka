/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_for;
import celestial.C_static;
import celestial.C_switch;
import celestial.rS_2;
import celestial.rU_2;
import celestial.rfU_2;
import celestial.s_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class b_1
extends Enum<b_1>
implements C_switch<rS_2, rU_2> {
    private static short[] shortsdf0e2a18debd3d38bfaf4a483a1d8c36;
    private static boolean[] booleansdf0e2a18debd3d38bfaf4a483a1d8c36;
    private static String[] stringsdf0e2a18debd3d38bfaf4a483a1d8c36;
    private static byte[] bytesdf0e2a18debd3d38bfaf4a483a1d8c36;
    public static Object[] staticFieldsdf0e2a18debd3d38bfaf4a483a1d8c36;

    private static void id_byte() {
        stringsdf0e2a18debd3d38bfaf4a483a1d8c36 = new String[]{new String("INSTANCE")};
    }

    static {
        b_1.ntfClinit();
    }

    public static b_1[] values() {
        return (b_1[])((b_1[])staticFieldsdf0e2a18debd3d38bfaf4a483a1d8c36[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[0]]).clone();
    }

    public static b_1 valueOf(String string) {
        return Enum.valueOf(b_1.class, string);
    }

    @Override
    public Stream<String> id_class(C_for c_for) {
        C_static c_static = c_for.id_class();
        if (c_static.id_catch(bytesdf0e2a18debd3d38bfaf4a483a1d8c36[0])) {
            return c_static.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[8]]);
        }
        return Stream.empty();
    }

    private static /* synthetic */ b_1[] id_class() {
        b_1[] b_1Array = new b_1[booleansdf0e2a18debd3d38bfaf4a483a1d8c36[0]];
        b_1Array[b_1.booleansdf0e2a18debd3d38bfaf4a483a1d8c36[1]] = (b_1)staticFieldsdf0e2a18debd3d38bfaf4a483a1d8c36[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[9]];
        return b_1Array;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{48, -100, 29, -15, 105, -123, 76, 57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public rS_2 id_class(C_for c_for, rU_2 rU_22) throws x_1 {
        if (rU_22 == null) {
            rU_22 = (rU_2)rU_2.id_class[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[1]];
        }
        C_static c_static = c_for.id_class();
        return new rS_2(rfU_2.id_byte((Double)c_static.id_break((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[2]], Double.valueOf(((Integer)rU_22.id_break[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[3]]).intValue()))), rfU_2.id_byte((Double)c_static.id_break((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[4]], Double.valueOf(((Integer)rU_22.id_break[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[5]]).intValue()))), rfU_2.id_byte((Double)c_static.id_break((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[6]], Double.valueOf(((Integer)rU_22.id_break[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[7]]).intValue()))));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x11E02825;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x592103D9B677995AL;
    }

    private static void id_break() {
        bytesdf0e2a18debd3d38bfaf4a483a1d8c36 = new byte[]{3, 2};
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleansdf0e2a18debd3d38bfaf4a483a1d8c36 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        b_1.id_throws();
        b_1.id_byte();
        b_1.id_protected();
        b_1.id_break();
        b_1.id_case();
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new b_1(), new b_1[]{(b_1)objectArray[0]}};
        staticFieldsdf0e2a18debd3d38bfaf4a483a1d8c36 = objectArray;
    }

    private static void id_protected() {
        short[] sArray = new short[10];
        sArray[0] = 1;
        sArray[5] = 1;
        sArray[7] = 2;
        shortsdf0e2a18debd3d38bfaf4a483a1d8c36 = sArray;
    }
}

