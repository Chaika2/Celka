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

public class rruY
extends Enum<rruY>
implements C_double<xd_3> {
    private static short[] shortsa8884e3b339234dd911c10ea97845ed5;
    private static byte[] bytesa8884e3b339234dd911c10ea97845ed5;
    private static String[] stringsa8884e3b339234dd911c10ea97845ed5;
    private static boolean[] booleansa8884e3b339234dd911c10ea97845ed5;
    public static Object[] staticFieldsa8884e3b339234dd911c10ea97845ed5;

    @Override
    public /* synthetic */ Object id_byte(C_for c_for) throws x_1 {
        return this.id_break(c_for);
    }

    private static void id_byte() {
        bytesa8884e3b339234dd911c10ea97845ed5 = new byte[]{2};
    }

    static {
        rruY.ntfClinit();
    }

    public static rruY[] values() {
        return (rruY[])((rruY[])staticFieldsa8884e3b339234dd911c10ea97845ed5[shortsa8884e3b339234dd911c10ea97845ed5[0]]).clone();
    }

    public static rruY valueOf(String string) {
        return Enum.valueOf(rruY.class, string);
    }

    @Override
    public Stream<String> id_class(C_for c_for) throws x_1 {
        C_static c_static = c_for.id_class();
        String string = c_static.id_extends();
        return new v_1().id_break(rVL.id_strictfp.id_protected().stream().map(Object::toString)).id_break(string).id_break().id_protected();
    }

    private static /* synthetic */ rruY[] id_class() {
        rruY[] rruYArray = new rruY[booleansa8884e3b339234dd911c10ea97845ed5[0]];
        rruYArray[rruY.booleansa8884e3b339234dd911c10ea97845ed5[1]] = (rruY)staticFieldsa8884e3b339234dd911c10ea97845ed5[shortsa8884e3b339234dd911c10ea97845ed5[1]];
        return rruYArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5430E289;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{41, -86, -41, 75, -51, 8, 92, -74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7D86DFB91CA7664EL;
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
        Object[] objectArray;
        objectArray = new Object[]{new rruY(), new rruY[]{(rruY)objectArray[0]}};
        staticFieldsa8884e3b339234dd911c10ea97845ed5 = objectArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleansa8884e3b339234dd911c10ea97845ed5 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rruY.id_throws();
        rruY.id_protected();
        rruY.id_case();
        rruY.id_byte();
        rruY.id_break();
    }

    private static void id_case() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shortsa8884e3b339234dd911c10ea97845ed5 = sArray;
    }

    private static void id_protected() {
        stringsa8884e3b339234dd911c10ea97845ed5 = new String[]{new String("INSTANCE")};
    }
}

