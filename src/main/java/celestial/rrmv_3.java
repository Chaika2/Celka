/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_instanceof;
import celestial.C_static;
import celestial.rrQJ;
import celestial.rrZr_1;
import celestial.rrfu_3;
import celestial.rrvu_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmv_3
extends C_instanceof {
    private static boolean[] id_throws;
    private static String[] id_case;
    private static byte[] id_catch;
    private static long[] id_private;
    private static short[] id_implements;

    public rrmv_3(C_case c_case) {
        String[] stringArray = new String[id_catch[0]];
        stringArray[rrmv_3.id_throws[0]] = id_case[0];
        stringArray[rrmv_3.id_throws[1]] = id_case[1];
        super(c_case, Duration.ofMinutes(id_private[0]), stringArray);
    }

    static {
        rrmv_3.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        String string2 = c_static.id_class(id_case[2], id_throws[2]);
        if (string2.isEmpty()) {
            rrfu_3.id_byte(id_case[3]);
            return;
        }
        ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[id_implements[0]]).id_class((rrZr_1)rrQJ.id_class[id_implements[1]], string2, () -> rrfu_3.id_byte(id_case[6]));
        super.id_class(string, c_static);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x247D389C;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2B053D1669FF66FAL;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        return Stream.empty();
    }

    private static /* synthetic */ void ntfClinit() {
        rrmv_3.id_final();
        rrmv_3.id_package();
        rrmv_3.id_finally();
        rrmv_3.id_volatile();
        rrmv_3.id_extends();
    }

    private static void id_finally() {
        id_private = new long[]{2L};
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_throws[3]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_implements[2]];
        Object[] objectArray = new Object[id_catch[1]];
        objectArray[rrmv_3.id_throws[4]] = string2;
        objectArray[rrmv_3.id_throws[5]] = string;
        return List.of(id_case[5].formatted(objectArray));
    }

    private static void id_extends() {
        id_catch = new byte[]{2, 2};
    }

    @Override
    public String id_implements() {
        return id_case[4];
    }

    private static void id_package() {
        id_case = new String[]{new String("report"), new String("rep"), new String(" "), new String("\u0423\u043a\u0430\u0436\u0438\u0442\u0435 \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u043c\u043e\u0435 \u0440\u0435\u043f\u043e\u0440\u0442\u0430"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u043e\u0442\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u0440\u0435\u043f\u043e\u0440\u0442\u043e\u0432"), new String("> %s%s <\u0441\u043e\u0434\u0435\u0440\u0436\u0438\u043c\u043e\u0435>"), new String("\u0420\u0435\u043f\u043e\u0440\u0442 \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u043e\u0442\u043f\u0440\u0430\u0432\u043b\u0435\u043d")};
    }

    public static String id_private(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-86, 65, -86, -26, 80, -31, -87, 18}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_final() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[5] = true;
        id_throws = blArray;
    }

    private static void id_volatile() {
        short[] sArray = new short[3];
        sArray[1] = 5;
        id_implements = sArray;
    }
}

