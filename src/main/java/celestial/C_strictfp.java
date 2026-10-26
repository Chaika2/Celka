/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_double;
import celestial.C_for;
import celestial.rpr_3;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Locale;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_strictfp
extends Enum<C_strictfp>
implements C_double<rpr_3> {
    private static byte[] bytes1f0c66f23770348389d783dc475286cf;
    public static Object[] staticFields1f0c66f23770348389d783dc475286cf;
    private static boolean[] booleans1f0c66f23770348389d783dc475286cf;
    private static short[] shorts1f0c66f23770348389d783dc475286cf;
    private static String[] strings1f0c66f23770348389d783dc475286cf;

    @Override
    public /* synthetic */ Object id_byte(C_for c_for) throws x_1 {
        return this.id_break(c_for);
    }

    private static void id_byte() {
        strings1f0c66f23770348389d783dc475286cf = new String[]{new String("INSTANCE")};
    }

    static {
        C_strictfp.ntfClinit();
    }

    public static C_strictfp[] values() {
        return (C_strictfp[])((C_strictfp[])staticFields1f0c66f23770348389d783dc475286cf[shorts1f0c66f23770348389d783dc475286cf[0]]).clone();
    }

    public static C_strictfp valueOf(String string) {
        return Enum.valueOf(C_strictfp.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x90F9C4486F96799AL;
    }

    @Override
    public Stream<String> id_class(C_for c_for) throws x_1 {
        return new v_1().id_break(Stream.of(rpr_3.values()).map(rpr_3::id_volatile).map(String::toLowerCase)).id_class(c_for.id_class().id_extends()).id_protected();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x22386A3A;
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new C_strictfp(), new C_strictfp[]{(C_strictfp)objectArray[0]}};
        staticFields1f0c66f23770348389d783dc475286cf = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-101, -97, 42, -93, -46, 40, -42, -98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ C_strictfp[] id_break() {
        C_strictfp[] c_strictfpArray = new C_strictfp[booleans1f0c66f23770348389d783dc475286cf[0]];
        c_strictfpArray[C_strictfp.booleans1f0c66f23770348389d783dc475286cf[1]] = (C_strictfp)staticFields1f0c66f23770348389d783dc475286cf[shorts1f0c66f23770348389d783dc475286cf[1]];
        return c_strictfpArray;
    }

    public rpr_3 id_break(C_for c_for) throws x_1 {
        return rpr_3.valueOf(c_for.id_class().id_extends().toUpperCase(Locale.US));
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans1f0c66f23770348389d783dc475286cf = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        C_strictfp.id_throws();
        C_strictfp.id_byte();
        C_strictfp.id_protected();
        C_strictfp.id_case();
        C_strictfp.id_class();
    }

    private static void id_case() {
        bytes1f0c66f23770348389d783dc475286cf = new byte[]{2};
    }

    private static void id_protected() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shorts1f0c66f23770348389d783dc475286cf = sArray;
    }
}

