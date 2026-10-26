/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_double;
import celestial.C_for;
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

public class C_short
extends Enum<C_short>
implements C_double<xd_3> {
    public static Object[] staticFields527f5e1fd5d43b2790a2d9e0b8d76cee;
    private static short[] shorts527f5e1fd5d43b2790a2d9e0b8d76cee;
    private static byte[] bytes527f5e1fd5d43b2790a2d9e0b8d76cee;
    private static boolean[] booleans527f5e1fd5d43b2790a2d9e0b8d76cee;
    private static String[] strings527f5e1fd5d43b2790a2d9e0b8d76cee;

    @Override
    public /* synthetic */ Object id_byte(C_for c_for) throws x_1 {
        return this.id_break(c_for);
    }

    private static /* synthetic */ C_short[] id_byte() {
        C_short[] c_shortArray = new C_short[booleans527f5e1fd5d43b2790a2d9e0b8d76cee[0]];
        c_shortArray[C_short.booleans527f5e1fd5d43b2790a2d9e0b8d76cee[1]] = (C_short)staticFields527f5e1fd5d43b2790a2d9e0b8d76cee[shorts527f5e1fd5d43b2790a2d9e0b8d76cee[1]];
        return c_shortArray;
    }

    static {
        C_short.ntfClinit();
    }

    public static C_short[] values() {
        return (C_short[])((C_short[])staticFields527f5e1fd5d43b2790a2d9e0b8d76cee[shorts527f5e1fd5d43b2790a2d9e0b8d76cee[0]]).clone();
    }

    public static C_short valueOf(String string) {
        return Enum.valueOf(C_short.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4E9AF1B5C5CFECB8L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA95796C3;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{53, 107, -10, 49, 112, -45, 74, 59}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_class(C_for c_for) throws x_1 {
        String string = c_for.id_class().id_extends();
        return new v_1().id_break(rVL.id_strictfp.id_protected().stream().map(Object::toString)).id_break(string).id_break().id_protected();
    }

    private static void id_class() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans527f5e1fd5d43b2790a2d9e0b8d76cee = blArray;
    }

    public xd_3 id_break(C_for c_for) throws x_1 {
        rqO_2 rqO_22 = new rqO_2(c_for.id_class().id_extends());
        xd_3 xd_32 = rVL.id_strictfp.id_break(rqO_22).orElse(null);
        if (xd_32 == null) {
            throw new IllegalArgumentException("\u041d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u044b\u0439 \u0431\u043b\u043e\u043a: " + rqO_22);
        }
        return xd_32;
    }

    private static void id_break() {
        strings527f5e1fd5d43b2790a2d9e0b8d76cee = new String[]{new String("INSTANCE")};
    }

    private static void id_throws() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shorts527f5e1fd5d43b2790a2d9e0b8d76cee = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        C_short.id_class();
        C_short.id_break();
        C_short.id_throws();
        C_short.id_protected();
        C_short.id_case();
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new C_short(), new C_short[]{(C_short)objectArray[0]}};
        staticFields527f5e1fd5d43b2790a2d9e0b8d76cee = objectArray;
    }

    private static void id_protected() {
        bytes527f5e1fd5d43b2790a2d9e0b8d76cee = new byte[]{2};
    }
}

