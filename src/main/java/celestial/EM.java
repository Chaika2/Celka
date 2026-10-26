/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.Ps_1;
import celestial.rX_2;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EM
extends C_try {
    private static byte[] id_break;
    private static String[] id_throws;
    private static boolean[] id_case;
    private static short[] id_catch;

    public EM(C_case c_case) {
        String[] stringArray = new String[id_break[0]];
        stringArray[EM.id_case[0]] = id_throws[0];
        stringArray[EM.id_case[1]] = id_throws[1];
        super(c_case, stringArray);
    }

    static {
        EM.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB4A561C8;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_protected(id_case[2]);
        rX_2 rX_22 = rX_2.id_class(((Ps_1)this.id_class[id_catch[0]]).id_break(), ((Float)((Ps_1)this.id_class[EM.id_catch[1]]).id_catch().id_private[id_catch[2]]).floatValue(), c_static.id_catch(Double.class));
        ((C_case)this.id_class[id_catch[3]]).id_import().id_class(rX_22);
        Object[] objectArray = new Object[id_case[3]];
        objectArray[EM.id_case[4]] = rX_22;
        this.id_case(String.format(id_throws[2], objectArray));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEB5527733DC78702L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{36, 113, -110, 127, -24, 38, 50, 87}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_case = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        EM.id_throws();
        EM.id_finally();
        EM.id_extends();
        EM.id_protected();
    }

    private static void id_finally() {
        id_throws = new String[]{new String("thisway"), new String("forward"), new String("Goal: %s"), new String("Travel in your current direction"), new String("Creates a GoalXZ some amount of blocks in the direction you're currently looking"), new String(""), new String("Usage:"), new String("> thisway <distance> - makes a GoalXZ distance blocks in front of you")};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_break[1]];
        stringArray[EM.id_case[5]] = id_throws[4];
        stringArray[EM.id_case[6]] = id_throws[5];
        stringArray[EM.id_break[2]] = id_throws[6];
        stringArray[EM.id_break[3]] = id_throws[7];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        short[] sArray = new short[4];
        sArray[0] = 1;
        sArray[1] = 1;
        sArray[2] = 25;
        id_catch = sArray;
    }

    @Override
    public String id_implements() {
        return id_throws[3];
    }

    private static void id_protected() {
        id_break = new byte[]{2, 4, 2, 3};
    }
}

