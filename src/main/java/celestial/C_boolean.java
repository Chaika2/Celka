/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_double;
import celestial.C_else;
import celestial.C_for;
import celestial.C_synchronized;
import celestial.C_this;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Comparator;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_boolean
extends Enum<C_boolean>
implements C_double<C_this[]> {
    private static short[] shorts1efcd1a6ae203b428c7ab1f68db4b5b6;
    public static Object[] staticFields1efcd1a6ae203b428c7ab1f68db4b5b6;
    private static byte[] bytes1efcd1a6ae203b428c7ab1f68db4b5b6;
    private static String[] strings1efcd1a6ae203b428c7ab1f68db4b5b6;
    private static boolean[] booleans1efcd1a6ae203b428c7ab1f68db4b5b6;

    @Override
    public /* synthetic */ Object id_byte(C_for c_for) throws x_1 {
        return this.id_break(c_for);
    }

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new C_boolean(), new C_boolean[]{(C_boolean)objectArray[0]}};
        staticFields1efcd1a6ae203b428c7ab1f68db4b5b6 = objectArray;
    }

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x640457EF;
    }

    public static String[] id_byte(C_case c_case) {
        return (String[])Stream.of(C_boolean.id_class(c_case)).map(C_this::id_byte).filter(string -> !string.isEmpty() ? booleans1efcd1a6ae203b428c7ab1f68db4b5b6[0] : booleans1efcd1a6ae203b428c7ab1f68db4b5b6[1]).toArray(String[]::new);
    }

    static {
        C_boolean.ntfClinit();
    }

    public static C_boolean[] values() {
        return (C_boolean[])((C_boolean[])staticFields1efcd1a6ae203b428c7ab1f68db4b5b6[shorts1efcd1a6ae203b428c7ab1f68db4b5b6[0]]).clone();
    }

    public static C_boolean valueOf(String string) {
        return Enum.valueOf(C_boolean.class, string);
    }

    private static void id_class() {
        strings1efcd1a6ae203b428c7ab1f68db4b5b6 = new String[]{new String("INSTANCE")};
    }

    public static C_this[] id_class(C_case c_case) {
        return (C_this[])C_boolean.id_break(c_case).id_class().stream().sorted(Comparator.comparingLong(C_this::id_protected).reversed()).toArray(C_this[]::new);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{1, -24, 0, 45, 23, 14, 7, -76}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static C_this[] id_class(C_case c_case, String string) {
        return (C_this[])Stream.of(C_boolean.id_class(c_case)).filter(c_this -> c_this.id_byte().equalsIgnoreCase(string)).toArray(C_this[]::new);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB46CC90323B472AFL;
    }

    public static C_this[] id_class(C_case c_case, C_else c_else) {
        return (C_this[])C_boolean.id_break(c_case).id_break(c_else).stream().sorted(Comparator.comparingLong(C_this::id_protected).reversed()).toArray(C_this[]::new);
    }

    @Override
    public Stream<String> id_class(C_for c_for) throws x_1 {
        return new v_1().id_break(C_boolean.id_byte(c_for.id_break())).id_break().id_class(C_else.id_break()).id_class(c_for.id_class().id_extends()).id_protected();
    }

    public static C_synchronized id_break(C_case c_case) {
        return c_case.id_implements().id_class().id_class();
    }

    private static void id_break() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[2] = true;
        blArray[6] = true;
        booleans1efcd1a6ae203b428c7ab1f68db4b5b6 = blArray;
    }

    public C_this[] id_break(C_for c_for) throws x_1 {
        String string = c_for.id_class().id_extends();
        C_else c_else = C_else.id_class(string);
        return c_else == null ? C_boolean.id_class(c_for.id_break(), string) : C_boolean.id_class(c_for.id_break(), c_else);
    }

    private static void id_throws() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shorts1efcd1a6ae203b428c7ab1f68db4b5b6 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        C_boolean.id_break();
        C_boolean.id_class();
        C_boolean.id_throws();
        C_boolean.id_case();
        C_boolean.id_byte();
    }

    private static void id_case() {
        bytes1efcd1a6ae203b428c7ab1f68db4b5b6 = new byte[]{2};
    }

    private static /* synthetic */ C_boolean[] id_protected() {
        C_boolean[] c_booleanArray = new C_boolean[booleans1efcd1a6ae203b428c7ab1f68db4b5b6[2]];
        c_booleanArray[C_boolean.booleans1efcd1a6ae203b428c7ab1f68db4b5b6[3]] = (C_boolean)staticFields1efcd1a6ae203b428c7ab1f68db4b5b6[shorts1efcd1a6ae203b428c7ab1f68db4b5b6[1]];
        return c_booleanArray;
    }
}

