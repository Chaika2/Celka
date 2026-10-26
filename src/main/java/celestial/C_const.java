/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_double;
import celestial.C_for;
import celestial.C_short;
import celestial.re_3;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_const
extends Enum<C_const>
implements C_double<re_3> {
    private static boolean[] booleansa08d321dfe9f33979ad5f9dfda99c615;
    private static short[] shortsa08d321dfe9f33979ad5f9dfda99c615;
    private static byte[] bytesa08d321dfe9f33979ad5f9dfda99c615;
    public static Object[] staticFieldsa08d321dfe9f33979ad5f9dfda99c615;
    private static String[] stringsa08d321dfe9f33979ad5f9dfda99c615;

    private static void id_byte() {
        bytesa08d321dfe9f33979ad5f9dfda99c615 = new byte[]{2};
    }

    @Override
    public /* synthetic */ Object id_byte(C_for c_for) throws x_1 {
        return this.id_break(c_for);
    }

    static {
        C_const.ntfClinit();
    }

    public static C_const[] values() {
        return (C_const[])((C_const[])staticFieldsa08d321dfe9f33979ad5f9dfda99c615[shortsa08d321dfe9f33979ad5f9dfda99c615[0]]).clone();
    }

    public static C_const valueOf(String string) {
        return Enum.valueOf(C_const.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x569CD1AC993AB19DL;
    }

    @Override
    public Stream<String> id_class(C_for c_for) {
        return c_for.id_class().id_class((C_short)C_short.staticFields527f5e1fd5d43b2790a2d9e0b8d76cee[shortsa08d321dfe9f33979ad5f9dfda99c615[1]]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x22D3AFE2;
    }

    private static void id_class() {
        short[] sArray = new short[3];
        sArray[0] = 1;
        shortsa08d321dfe9f33979ad5f9dfda99c615 = sArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{62, -54, -38, -61, 68, 41, 53, -50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public re_3 id_break(C_for c_for) throws x_1 {
        return new re_3(c_for.id_class().id_extends());
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleansa08d321dfe9f33979ad5f9dfda99c615 = blArray;
    }

    private static void id_throws() {
        stringsa08d321dfe9f33979ad5f9dfda99c615 = new String[]{new String("INSTANCE")};
    }

    private static /* synthetic */ void ntfClinit() {
        C_const.id_break();
        C_const.id_throws();
        C_const.id_class();
        C_const.id_byte();
        C_const.id_case();
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new C_const(), new C_const[]{(C_const)objectArray[0]}};
        staticFieldsa08d321dfe9f33979ad5f9dfda99c615 = objectArray;
    }

    private static /* synthetic */ C_const[] id_protected() {
        C_const[] c_constArray = new C_const[booleansa08d321dfe9f33979ad5f9dfda99c615[0]];
        c_constArray[C_const.booleansa08d321dfe9f33979ad5f9dfda99c615[1]] = (C_const)staticFieldsa08d321dfe9f33979ad5f9dfda99c615[shortsa08d321dfe9f33979ad5f9dfda99c615[2]];
        return c_constArray;
    }
}

