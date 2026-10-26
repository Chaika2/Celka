/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PN;
import celestial.PW;
import celestial.Pc_1;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class Pz_1
extends PW {
    private static String[] strings5ff9f1b2215d36c898aa3528e9a4bba3;
    private static boolean[] booleans5ff9f1b2215d36c898aa3528e9a4bba3;

    static {
        Pz_1.ntfClinit();
    }

    private static void id_class() {
        strings5ff9f1b2215d36c898aa3528e9a4bba3 = new String[]{new String(","), new String(",")};
    }

    @Override
    public boolean id_class(Type type) {
        return List.class.isAssignableFrom(Pc_1.id_class(type));
    }

    @Override
    public Object id_class(PN pN, String string2) {
        Type type = ((ParameterizedType)pN.id_class().id_throws()).getActualTypeArguments()[booleans5ff9f1b2215d36c898aa3528e9a4bba3[0]];
        PW pW = PW.id_break(type);
        return Stream.of(string2.split(strings5ff9f1b2215d36c898aa3528e9a4bba3[0])).map(string -> pW.id_class(pN, (String)string)).collect(Collectors.toList());
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8C4F45C5AE5166EL;
    }

    @Override
    public String id_class(PN pN, Object object2) {
        Type type = ((ParameterizedType)pN.id_class().id_throws()).getActualTypeArguments()[booleans5ff9f1b2215d36c898aa3528e9a4bba3[1]];
        PW pW = PW.id_break(type);
        return ((List)object2).stream().map(object -> pW.id_class(pN, object)).collect(Collectors.joining(strings5ff9f1b2215d36c898aa3528e9a4bba3[1]));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6CD66B45;
    }

    private static void id_break() {
        booleans5ff9f1b2215d36c898aa3528e9a4bba3 = new boolean[2];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-72, 33, 56, 83, 91, -108, -1, -80}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        Pz_1.id_break();
        Pz_1.id_class();
    }
}

