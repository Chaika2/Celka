/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_double;
import celestial.C_for;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class B
extends Enum<B>
implements C_double<rhd_3> {
    private static String[] strings08d11b4a38f53d99ba3c071826b34fcc;
    private static short[] shorts08d11b4a38f53d99ba3c071826b34fcc;
    public static Object[] staticFields08d11b4a38f53d99ba3c071826b34fcc;
    private static boolean[] booleans08d11b4a38f53d99ba3c071826b34fcc;
    private static byte[] bytes08d11b4a38f53d99ba3c071826b34fcc;

    private static void id_byte() {
        strings08d11b4a38f53d99ba3c071826b34fcc = new String[]{new String("INSTANCE")};
    }

    @Override
    public /* synthetic */ Object id_byte(C_for c_for) throws x_1 {
        return this.id_break(c_for);
    }

    static {
        B.ntfClinit();
    }

    public static B[] values() {
        return (B[])((B[])staticFields08d11b4a38f53d99ba3c071826b34fcc[shorts08d11b4a38f53d99ba3c071826b34fcc[0]]).clone();
    }

    public static B valueOf(String string) {
        return Enum.valueOf(B.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-84, -61, 116, -7, 54, -127, -125, -94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_class(C_for c_for) throws x_1 {
        return new v_1().id_break(B.id_protected(c_for).stream().map(rhd_3::g).map(rgP_2::getString)).id_class(c_for.id_class().id_extends()).id_break().id_protected();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x46D4CD9E93915BB6L;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans08d11b4a38f53d99ba3c071826b34fcc = blArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3F774A39;
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new B(), new B[]{(B)objectArray[0]}};
        staticFields08d11b4a38f53d99ba3c071826b34fcc = objectArray;
    }

    public rhd_3 id_break(C_for c_for) throws x_1 {
        String string = c_for.id_class().id_extends();
        return B.id_protected(c_for).stream().filter(rhd_32 -> rhd_32.g().getString().equalsIgnoreCase(string)).findFirst().orElse(null);
    }

    private static void id_throws() {
        bytes08d11b4a38f53d99ba3c071826b34fcc = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        B.id_class();
        B.id_byte();
        B.id_case();
        B.id_throws();
        B.id_break();
    }

    private static void id_case() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shorts08d11b4a38f53d99ba3c071826b34fcc = sArray;
    }

    private static List<? extends rhd_3> id_protected(C_for c_for) {
        return c_for.id_break().id_throw().id_case().id_continue();
    }

    private static /* synthetic */ B[] id_protected() {
        B[] bArray = new B[booleans08d11b4a38f53d99ba3c071826b34fcc[0]];
        bArray[B.booleans08d11b4a38f53d99ba3c071826b34fcc[1]] = (B)staticFields08d11b4a38f53d99ba3c071826b34fcc[shorts08d11b4a38f53d99ba3c071826b34fcc[1]];
        return bArray;
    }
}

