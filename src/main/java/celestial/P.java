/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_double;
import celestial.C_for;
import celestial.rVL;
import celestial.rdb_3;
import celestial.rqO_2;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class P
extends Enum<P>
implements C_double<rdb_3> {
    private static short[] shortsee62191719013ce696dd0417ea84d4fd;
    private static boolean[] booleansee62191719013ce696dd0417ea84d4fd;
    public static Object[] staticFieldsee62191719013ce696dd0417ea84d4fd;
    private static byte[] bytesee62191719013ce696dd0417ea84d4fd;
    private static String[] stringsee62191719013ce696dd0417ea84d4fd;

    private static void id_byte() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleansee62191719013ce696dd0417ea84d4fd = blArray;
    }

    @Override
    public /* synthetic */ Object id_byte(C_for c_for) throws x_1 {
        return this.id_break(c_for);
    }

    static {
        P.ntfClinit();
    }

    public static P[] values() {
        return (P[])((P[])staticFieldsee62191719013ce696dd0417ea84d4fd[shortsee62191719013ce696dd0417ea84d4fd[0]]).clone();
    }

    public static P valueOf(String string) {
        return Enum.valueOf(P.class, string);
    }

    private static /* synthetic */ P[] id_class() {
        P[] pArray = new P[booleansee62191719013ce696dd0417ea84d4fd[0]];
        pArray[P.booleansee62191719013ce696dd0417ea84d4fd[1]] = (P)staticFieldsee62191719013ce696dd0417ea84d4fd[shortsee62191719013ce696dd0417ea84d4fd[1]];
        return pArray;
    }

    @Override
    public Stream<String> id_class(C_for c_for) throws x_1 {
        return new v_1().id_break(rVL.id_for.id_protected().stream().map(rqO_2::toString)).id_break(c_for.id_class().id_extends()).id_break().id_protected();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{23, 106, 97, 125, -50, -97, 64, 38}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x33AB495C;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2F950C57BB4D8F3AL;
    }

    private static void id_break() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shortsee62191719013ce696dd0417ea84d4fd = sArray;
    }

    public rdb_3 id_break(C_for c_for) throws x_1 {
        rqO_2 rqO_22 = new rqO_2(c_for.id_class().id_extends());
        rdb_3 rdb_32 = rVL.id_for.id_break(rqO_22).orElse(null);
        if (rdb_32 == null) {
            throw new IllegalArgumentException(stringsee62191719013ce696dd0417ea84d4fd[0]);
        }
        return rdb_32;
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new P(), new P[]{(P)objectArray[0]}};
        staticFieldsee62191719013ce696dd0417ea84d4fd = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        P.id_byte();
        P.id_protected();
        P.id_break();
        P.id_case();
        P.id_throws();
    }

    private static void id_case() {
        bytesee62191719013ce696dd0417ea84d4fd = new byte[]{2};
    }

    private static void id_protected() {
        stringsee62191719013ce696dd0417ea84d4fd = new String[]{new String("\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u043e \u043d\u0438 \u043e\u0434\u043d\u043e\u0433\u043e \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430 \u043f\u043e \u044d\u0442\u043e\u043c\u0443 \u0438\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0443"), new String("INSTANCE")};
    }
}

