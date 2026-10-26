/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_try;
import celestial.PJ;
import celestial.PX;
import celestial.cb_3;
import celestial.rrmI_2;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmO_2
extends C_try {
    private static String[] id_break;
    private static boolean[] id_throws;
    private static short[] id_case;
    private static byte[] id_catch;

    public rrmO_2(C_case c_case) {
        String[] stringArray = new String[id_throws[0]];
        stringArray[rrmO_2.id_throws[1]] = id_break[0];
        super(c_case, stringArray);
    }

    static {
        rrmO_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3472A38E;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_implements();
        rrmI_2.id_protected();
        if (c_static.id_final()) {
            double d = (Double)c_static.id_protected(Double.class);
            PX pX = PJ.id_class(((Float)((cb_3)rrmO_2.b_.id_class[rrmO_2.id_case[0]]).id_break[id_case[1]]).floatValue());
            ((cb_3)rrmO_2.b_.id_class[id_case[2]]).id_int(((cb_3)rrmO_2.b_.id_class[id_case[3]]).rx() + (double)pX.id_throws() * d, ((cb_3)rrmO_2.b_.id_class[id_case[4]]).re(), ((cb_3)rrmO_2.b_.id_class[id_case[5]]).BO() + (double)pX.id_protected() * d);
        }
        rrmI_2.id_protected();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA9CF7E427E75E873L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-16, 90, 65, -27, -79, 35, 15, 43}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        return Stream.empty();
    }

    private static void id_throws() {
        id_break = new String[]{new String("hclip"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0430 \u043f\u043e XZ \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0435"), new String("> %s%s <\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435>")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmO_2.id_finally();
        rrmO_2.id_throws();
        rrmO_2.id_extends();
        rrmO_2.id_protected();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        id_throws = blArray;
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_throws[2]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_case[6]];
        Object[] objectArray = new Object[id_catch[0]];
        objectArray[rrmO_2.id_throws[3]] = string2;
        objectArray[rrmO_2.id_throws[4]] = string;
        return List.of(id_break[2].formatted(objectArray));
    }

    private static void id_extends() {
        short[] sArray = new short[7];
        sArray[0] = 57;
        sArray[1] = 45;
        sArray[2] = 57;
        sArray[3] = 57;
        sArray[4] = 57;
        sArray[5] = 57;
        id_case = sArray;
    }

    @Override
    public String id_implements() {
        return id_break[1];
    }

    private static void id_protected() {
        id_catch = new byte[]{2};
    }
}

