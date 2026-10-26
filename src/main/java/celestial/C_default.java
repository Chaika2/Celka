/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_double;
import celestial.C_for;
import celestial.aI_2;
import celestial.rVL;
import celestial.rqO_2;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_default
extends Enum<C_default>
implements C_double<aI_2> {
    private static boolean[] booleans7b24c69a4b2633ff8dbb4716d06bdfc3;
    private static String[] strings7b24c69a4b2633ff8dbb4716d06bdfc3;
    public static Object[] staticFields7b24c69a4b2633ff8dbb4716d06bdfc3;
    private static byte[] bytes7b24c69a4b2633ff8dbb4716d06bdfc3;
    private static short[] shorts7b24c69a4b2633ff8dbb4716d06bdfc3;

    @Override
    public /* synthetic */ Object id_byte(C_for c_for) throws x_1 {
        return this.id_break(c_for);
    }

    private static void id_byte() {
        strings7b24c69a4b2633ff8dbb4716d06bdfc3 = new String[]{new String("no entity found by that id"), new String("INSTANCE")};
    }

    static {
        C_default.ntfClinit();
    }

    public static C_default[] values() {
        return (C_default[])((C_default[])staticFields7b24c69a4b2633ff8dbb4716d06bdfc3[shorts7b24c69a4b2633ff8dbb4716d06bdfc3[0]]).clone();
    }

    public static C_default valueOf(String string) {
        return Enum.valueOf(C_default.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{67, -67, 100, 76, -110, 25, 104, 41}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDBF74FDC243DEEA9L;
    }

    @Override
    public Stream<String> id_class(C_for c_for) throws x_1 {
        return new v_1().id_break(rVL.id_transient.id_case().map(Object::toString)).id_break(c_for.id_class().id_extends()).id_break().id_protected();
    }

    private static /* synthetic */ C_default[] id_class() {
        C_default[] c_defaultArray = new C_default[booleans7b24c69a4b2633ff8dbb4716d06bdfc3[0]];
        c_defaultArray[C_default.booleans7b24c69a4b2633ff8dbb4716d06bdfc3[1]] = (C_default)staticFields7b24c69a4b2633ff8dbb4716d06bdfc3[shorts7b24c69a4b2633ff8dbb4716d06bdfc3[1]];
        return c_defaultArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6C07831A;
    }

    public aI_2 id_break(C_for c_for) throws x_1 {
        rqO_2 rqO_22 = new rqO_2(c_for.id_class().id_extends());
        aI_2 aI_22 = rVL.id_transient.id_break(rqO_22).orElse(null);
        if (aI_22 == null) {
            throw new IllegalArgumentException(strings7b24c69a4b2633ff8dbb4716d06bdfc3[0]);
        }
        return aI_22;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans7b24c69a4b2633ff8dbb4716d06bdfc3 = blArray;
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new C_default(), new C_default[]{(C_default)objectArray[0]}};
        staticFields7b24c69a4b2633ff8dbb4716d06bdfc3 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        C_default.id_break();
        C_default.id_byte();
        C_default.id_case();
        C_default.id_protected();
        C_default.id_throws();
    }

    private static void id_case() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shorts7b24c69a4b2633ff8dbb4716d06bdfc3 = sArray;
    }

    private static void id_protected() {
        bytes7b24c69a4b2633ff8dbb4716d06bdfc3 = new byte[]{2};
    }
}

