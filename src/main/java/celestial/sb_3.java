/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.rB_2;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sb_3
extends C_try {
    private static short[] id_break;
    private static boolean[] id_throws;
    private static byte[] id_case;
    private static String[] id_catch;

    public sb_3(C_case c_case) {
        String[] stringArray = new String[id_case[0]];
        stringArray[sb_3.id_throws[0]] = id_catch[0];
        stringArray[sb_3.id_throws[1]] = id_catch[1];
        super(c_case, stringArray);
    }

    static {
        sb_3.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_throws[2]);
        rB_2 rB_22 = new rB_2();
        ((C_case)this.id_class[id_break[0]]).id_import().id_class(rB_22);
        Object[] objectArray = new Object[id_throws[3]];
        objectArray[sb_3.id_throws[4]] = ((Object)rB_22).toString();
        this.id_case(String.format(id_catch[2], objectArray));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9967E64B981817BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x27AD2325;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-46, 16, -123, -114, 31, -41, -60, -111}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_catch = new String[]{new String("axis"), new String("highway"), new String("Goal: %s"), new String("Set a goal to the axes"), new String("The axis command sets a goal that tells Baritone to head towards the nearest axis. That is, X=0 or Z=0."), new String(""), new String("Usage:"), new String("> axis")};
    }

    private static /* synthetic */ void ntfClinit() {
        sb_3.id_finally();
        sb_3.id_throws();
        sb_3.id_protected();
        sb_3.id_extends();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_throws = blArray;
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_case[1]];
        stringArray[sb_3.id_throws[5]] = id_catch[4];
        stringArray[sb_3.id_throws[6]] = id_catch[5];
        stringArray[sb_3.id_case[2]] = id_catch[6];
        stringArray[sb_3.id_case[3]] = id_catch[7];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_case = new byte[]{2, 4, 2, 3};
    }

    @Override
    public String id_implements() {
        return id_catch[3];
    }

    private static void id_protected() {
        id_break = new short[1];
    }
}

