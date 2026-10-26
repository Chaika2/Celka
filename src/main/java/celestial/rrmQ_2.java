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

public class rrmQ_2
extends Enum<rrmQ_2>
implements C_double<xd_3> {
    private static boolean[] booleansfc1bbf6223bd333fa50da06439bdcc78;
    private static String[] stringsfc1bbf6223bd333fa50da06439bdcc78;
    private static short[] shortsfc1bbf6223bd333fa50da06439bdcc78;
    public static Object[] staticFieldsfc1bbf6223bd333fa50da06439bdcc78;
    private static byte[] bytesfc1bbf6223bd333fa50da06439bdcc78;

    private static void id_byte() {
        stringsfc1bbf6223bd333fa50da06439bdcc78 = new String[]{new String("INSTANCE")};
    }

    @Override
    public /* synthetic */ Object id_byte(C_for c_for) throws x_1 {
        return this.id_break(c_for);
    }

    static {
        rrmQ_2.ntfClinit();
    }

    public static rrmQ_2[] values() {
        return (rrmQ_2[])((rrmQ_2[])staticFieldsfc1bbf6223bd333fa50da06439bdcc78[shortsfc1bbf6223bd333fa50da06439bdcc78[0]]).clone();
    }

    public static rrmQ_2 valueOf(String string) {
        return Enum.valueOf(rrmQ_2.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x15484F9C5964040EL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x278AA39C;
    }

    @Override
    public Stream<String> id_class(C_for c_for) throws x_1 {
        C_static c_static = c_for.id_class();
        String string = c_static.id_extends();
        return new v_1().id_break(rVL.id_strictfp.id_protected().stream().map(Object::toString)).id_break(string).id_break().id_protected();
    }

    private static void id_class() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shortsfc1bbf6223bd333fa50da06439bdcc78 = sArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{4, 9, -92, -71, 28, -34, 48, 80}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ rrmQ_2[] id_break() {
        rrmQ_2[] rrmQ_2Array = new rrmQ_2[booleansfc1bbf6223bd333fa50da06439bdcc78[0]];
        rrmQ_2Array[rrmQ_2.booleansfc1bbf6223bd333fa50da06439bdcc78[1]] = (rrmQ_2)staticFieldsfc1bbf6223bd333fa50da06439bdcc78[shortsfc1bbf6223bd333fa50da06439bdcc78[1]];
        return rrmQ_2Array;
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
        bytesfc1bbf6223bd333fa50da06439bdcc78 = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmQ_2.id_protected();
        rrmQ_2.id_byte();
        rrmQ_2.id_class();
        rrmQ_2.id_throws();
        rrmQ_2.id_case();
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new rrmQ_2(), new rrmQ_2[]{(rrmQ_2)objectArray[0]}};
        staticFieldsfc1bbf6223bd333fa50da06439bdcc78 = objectArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleansfc1bbf6223bd333fa50da06439bdcc78 = blArray;
    }
}

