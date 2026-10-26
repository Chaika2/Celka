/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_for;
import celestial.C_static;
import celestial.C_switch;
import celestial.rJ_2;
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

public class O
extends Enum<O>
implements C_switch<rJ_2, rU_2> {
    private static short[] shortse82c5f6cc67b3e92817497b25f379c73;
    private static boolean[] booleanse82c5f6cc67b3e92817497b25f379c73;
    private static String[] stringse82c5f6cc67b3e92817497b25f379c73;
    private static byte[] bytese82c5f6cc67b3e92817497b25f379c73;
    public static Object[] staticFieldse82c5f6cc67b3e92817497b25f379c73;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[1] = true;
        blArray[5] = true;
        booleanse82c5f6cc67b3e92817497b25f379c73 = blArray;
    }

    static {
        O.ntfClinit();
    }

    public static O[] values() {
        return (O[])((O[])staticFieldse82c5f6cc67b3e92817497b25f379c73[shortse82c5f6cc67b3e92817497b25f379c73[0]]).clone();
    }

    public static O valueOf(String string) {
        return Enum.valueOf(O.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xED1E2E536603A3D9L;
    }

    @Override
    public rJ_2 id_class(C_for c_for, rU_2 rU_22) throws x_1 {
        if (rU_22 == null) {
            rU_22 = (rU_2)rU_2.id_class[shortse82c5f6cc67b3e92817497b25f379c73[1]];
        }
        return new rJ_2(rfU_2.id_byte((Double)c_for.id_class().id_break((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortse82c5f6cc67b3e92817497b25f379c73[2]], Double.valueOf(((Integer)rU_22.id_break[shortse82c5f6cc67b3e92817497b25f379c73[3]]).intValue()))));
    }

    @Override
    public Stream<String> id_class(C_for c_for) {
        C_static c_static = c_for.id_class();
        if (c_static.id_catch(booleanse82c5f6cc67b3e92817497b25f379c73[0])) {
            return c_static.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortse82c5f6cc67b3e92817497b25f379c73[4]]);
        }
        return Stream.empty();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC83C6EDF;
    }

    private static void id_class() {
        short[] sArray = new short[6];
        sArray[0] = 1;
        sArray[3] = 1;
        shortse82c5f6cc67b3e92817497b25f379c73 = sArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-27, 119, -6, -85, 79, 93, -110, 116}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        stringse82c5f6cc67b3e92817497b25f379c73 = new String[]{new String("INSTANCE")};
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new O(), new O[]{(O)objectArray[0]}};
        staticFieldse82c5f6cc67b3e92817497b25f379c73 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        O.id_byte();
        O.id_break();
        O.id_class();
        O.id_case();
        O.id_throws();
    }

    private static void id_case() {
        bytese82c5f6cc67b3e92817497b25f379c73 = new byte[]{2};
    }

    private static /* synthetic */ O[] id_protected() {
        O[] oArray = new O[booleanse82c5f6cc67b3e92817497b25f379c73[1]];
        oArray[O.booleanse82c5f6cc67b3e92817497b25f379c73[2]] = (O)staticFieldse82c5f6cc67b3e92817497b25f379c73[shortse82c5f6cc67b3e92817497b25f379c73[5]];
        return oArray;
    }
}

