/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_double;
import celestial.C_for;
import celestial.C_static;
import celestial.rVL;
import celestial.rqO_2;
import celestial.v_1;
import celestial.x_1;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmK_2
extends Enum<rrmK_2>
implements C_double<xd_3> {
    private static boolean[] booleans917222c690e13acf9dc05da7a804490a;
    private static byte[] bytes917222c690e13acf9dc05da7a804490a;
    private static short[] shorts917222c690e13acf9dc05da7a804490a;
    public static Object[] staticFields917222c690e13acf9dc05da7a804490a;
    private static String[] strings917222c690e13acf9dc05da7a804490a;

    private static void id_byte() {
        strings917222c690e13acf9dc05da7a804490a = new String[]{new String("INSTANCE")};
    }

    @Override
    public /* synthetic */ Object id_byte(C_for c_for) throws x_1 {
        return this.id_break(c_for);
    }

    static {
        rrmK_2.ntfClinit();
    }

    public static rrmK_2[] values() {
        return (rrmK_2[])((rrmK_2[])staticFields917222c690e13acf9dc05da7a804490a[shorts917222c690e13acf9dc05da7a804490a[0]]).clone();
    }

    public static rrmK_2 valueOf(String string) {
        return Enum.valueOf(rrmK_2.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8AA1B3F7E180A3B6L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{127, 41, 72, 88, 101, -41, -100, -21}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF5B0299A;
    }

    private static /* synthetic */ rrmK_2[] id_class() {
        rrmK_2[] rrmK_2Array = new rrmK_2[booleans917222c690e13acf9dc05da7a804490a[0]];
        rrmK_2Array[rrmK_2.booleans917222c690e13acf9dc05da7a804490a[1]] = (rrmK_2)staticFields917222c690e13acf9dc05da7a804490a[shorts917222c690e13acf9dc05da7a804490a[1]];
        return rrmK_2Array;
    }

    @Override
    public Stream<String> id_class(C_for c_for) throws x_1 {
        C_static c_static = c_for.id_class();
        String string = c_static.id_extends();
        return new v_1().id_break(rVL.id_strictfp.id_protected().stream().map(Object::toString)).id_break(string).id_break().id_protected();
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans917222c690e13acf9dc05da7a804490a = blArray;
    }

    public xd_3 id_break(C_for c_for) throws x_1 {
        rqO_2 rqO_22 = new rqO_2(c_for.id_class().id_extends());
        xd_3 xd_32 = rVL.id_strictfp.id_break(rqO_22).orElse(null);
        if (xd_32 == null) {
            throw new IllegalArgumentException("\u041d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u044b\u0439 \u0431\u043b\u043e\u043a: " + rqO_22);
        }
        return xd_32;
    }

    private static void id_throws() {
        bytes917222c690e13acf9dc05da7a804490a = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmK_2.id_break();
        rrmK_2.id_byte();
        rrmK_2.id_case();
        rrmK_2.id_throws();
        rrmK_2.id_protected();
    }

    private static void id_case() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shorts917222c690e13acf9dc05da7a804490a = sArray;
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new rrmK_2(), new rrmK_2[]{(rrmK_2)objectArray[0]}};
        staticFields917222c690e13acf9dc05da7a804490a = objectArray;
    }
}

