/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_double;
import celestial.C_for;
import celestial.C_static;
import celestial.rruK;
import celestial.util.ColorHelper;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruD
extends Enum<rruD>
implements C_double<Integer> {
    private static String[] stringsba29985e322c382da8479b6f59b746b0;
    private static byte[] bytesba29985e322c382da8479b6f59b746b0;
    private static boolean[] booleansba29985e322c382da8479b6f59b746b0;
    private static short[] shortsba29985e322c382da8479b6f59b746b0;
    public static Object[] staticFieldsba29985e322c382da8479b6f59b746b0;

    private static void id_byte() {
        stringsba29985e322c382da8479b6f59b746b0 = new String[]{new String("#"), new String("\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u0446\u0432\u0435\u0442, \u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u0432\u044b \u0437\u0430\u0431\u044b\u043b\u0438 \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c # \u043f\u0435\u0440\u0435\u0434 hex \u043a\u043e\u0434\u043e\u043c"), new String("INSTANCE")};
    }

    @Override
    public /* synthetic */ Object id_byte(C_for c_for) throws x_1 {
        return this.id_break(c_for);
    }

    static {
        rruD.ntfClinit();
    }

    public static rruD[] values() {
        return (rruD[])((rruD[])staticFieldsba29985e322c382da8479b6f59b746b0[shortsba29985e322c382da8479b6f59b746b0[0]]).clone();
    }

    public static rruD valueOf(String string) {
        return Enum.valueOf(rruD.class, string);
    }

    @Override
    public Stream<String> id_class(C_for c_for) throws x_1 {
        C_static c_static = c_for.id_class();
        String string = c_static.id_extends();
        return new v_1().id_break(Stream.of(rruK.values()).map(rruK::id_class)).id_class(string).id_protected();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x86FC6CC1D6AE3D4L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x25D2A53C;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[2] = true;
        blArray[6] = true;
        booleansba29985e322c382da8479b6f59b746b0 = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-73, -112, -19, 17, 61, -53, -40, -21}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Integer id_break(C_for c_for) throws x_1 {
        String string = c_for.id_class().id_extends().toLowerCase();
        if (string.startsWith(stringsba29985e322c382da8479b6f59b746b0[0])) {
            int n = Integer.parseInt(string.substring(booleansba29985e322c382da8479b6f59b746b0[0]), bytesba29985e322c382da8479b6f59b746b0[0]);
            if (ColorHelper.id_throws(n) == 0) {
                n = ColorHelper.id_break(n, shortsba29985e322c382da8479b6f59b746b0[1]);
            }
            return n;
        }
        rruK[] rruKArray = rruK.values();
        int n = rruKArray.length;
        for (int i = booleansba29985e322c382da8479b6f59b746b0[1]; i < n; ++i) {
            rruK rruK2 = rruKArray[i];
            if (!rruK2.id_class().equals(string)) continue;
            return rruK2.id_break().get();
        }
        throw new IllegalArgumentException(stringsba29985e322c382da8479b6f59b746b0[1]);
    }

    private static /* synthetic */ rruD[] id_break() {
        rruD[] rruDArray = new rruD[booleansba29985e322c382da8479b6f59b746b0[2]];
        rruDArray[rruD.booleansba29985e322c382da8479b6f59b746b0[3]] = (rruD)staticFieldsba29985e322c382da8479b6f59b746b0[shortsba29985e322c382da8479b6f59b746b0[2]];
        return rruDArray;
    }

    private static void id_throws() {
        short[] sArray = new short[3];
        sArray[0] = 1;
        sArray[1] = 255;
        shortsba29985e322c382da8479b6f59b746b0 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rruD.id_class();
        rruD.id_byte();
        rruD.id_throws();
        rruD.id_protected();
        rruD.id_case();
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new rruD(), new rruD[]{(rruD)objectArray[0]}};
        staticFieldsba29985e322c382da8479b6f59b746b0 = objectArray;
    }

    private static void id_protected() {
        bytesba29985e322c382da8479b6f59b746b0 = new byte[]{16, 2};
    }
}

