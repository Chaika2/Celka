/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.k_1;
import celestial.rG_2;
import celestial.rP_2;
import celestial.rc_3;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sg_3
extends C_try {
    private static short[] id_break;
    private static boolean[] id_throws;
    private static byte[] id_case;
    private static String[] id_catch;

    public sg_3(C_case c_case) {
        String[] stringArray = new String[id_throws[0]];
        stringArray[sg_3.id_throws[1]] = id_catch[0];
        super(c_case, stringArray);
    }

    static {
        sg_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBAF4E06E;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x121A30B4DFDABF7L;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_throws[2]);
        rc_3 rc_32 = ((C_case)this.id_class[id_break[0]]).id_import();
        rP_2 rP_22 = rc_32.id_private();
        if (rP_22 == null) {
            throw new k_1(id_catch[1]);
        }
        rP_22 = rP_22 instanceof rG_2 ? (rP_2)((rG_2)rP_22).id_class[id_break[1]] : new rG_2(rP_22);
        rc_32.id_break(rP_22);
        Object[] objectArray = new Object[id_throws[3]];
        objectArray[sg_3.id_throws[4]] = rP_22.toString();
        this.id_case(String.format(id_catch[2], objectArray));
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-87, -116, -39, -33, -108, -30, 38, 77}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_case = new byte[]{4, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        sg_3.id_finally();
        sg_3.id_protected();
        sg_3.id_extends();
        sg_3.id_throws();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_throws = blArray;
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_case[0]];
        stringArray[sg_3.id_throws[5]] = id_catch[4];
        stringArray[sg_3.id_throws[6]] = id_catch[5];
        stringArray[sg_3.id_case[1]] = id_catch[6];
        stringArray[sg_3.id_case[2]] = id_catch[7];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_break = new short[2];
    }

    @Override
    public String id_implements() {
        return id_catch[3];
    }

    private static void id_protected() {
        id_catch = new String[]{new String("invert"), new String("No goal"), new String("Goal: %s"), new String("Run away from the current goal"), new String("The invert command tells Baritone to head away from the current goal rather than towards it."), new String(""), new String("Usage:"), new String("> invert - Invert the current goal.")};
    }
}

