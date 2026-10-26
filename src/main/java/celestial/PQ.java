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
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class PQ
extends PW {
    private static boolean[] booleansbab060a493723b199065fc02333b4856;
    private static String[] stringsbab060a493723b199065fc02333b4856;

    static {
        PQ.ntfClinit();
    }

    private static void id_class() {
        stringsbab060a493723b199065fc02333b4856 = new String[]{new String(",(?=[^,]*->)"), new String(","), new String("->")};
    }

    @Override
    public boolean id_class(Type type) {
        return Map.class.isAssignableFrom(Pc_1.id_class(type));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x92B386193F3CBBD2L;
    }

    @Override
    public Object id_class(PN pN, String string2) {
        Type type = ((ParameterizedType)pN.id_class().id_throws()).getActualTypeArguments()[booleansbab060a493723b199065fc02333b4856[0]];
        Type type2 = ((ParameterizedType)pN.id_class().id_throws()).getActualTypeArguments()[booleansbab060a493723b199065fc02333b4856[1]];
        PW pW = PW.id_break(type);
        PW pW2 = PW.id_break(type2);
        return Stream.of(string2.split(stringsbab060a493723b199065fc02333b4856[0])).map(string -> string.split(stringsbab060a493723b199065fc02333b4856[2])).collect(Collectors.toMap(stringArray -> pW.id_class(pN, stringArray[booleansbab060a493723b199065fc02333b4856[5]]), stringArray -> pW2.id_class(pN, stringArray[booleansbab060a493723b199065fc02333b4856[4]])));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD5FFAEFB;
    }

    @Override
    public String id_class(PN pN, Object object) {
        Type type = ((ParameterizedType)pN.id_class().id_throws()).getActualTypeArguments()[booleansbab060a493723b199065fc02333b4856[2]];
        Type type2 = ((ParameterizedType)pN.id_class().id_throws()).getActualTypeArguments()[booleansbab060a493723b199065fc02333b4856[3]];
        PW pW = PW.id_break(type);
        PW pW2 = PW.id_break(type2);
        return ((Map)object).entrySet().stream().map(entry -> pW.id_class(pN, entry.getKey()) + "->" + pW2.id_class(pN, entry.getValue())).collect(Collectors.joining(stringsbab060a493723b199065fc02333b4856[1]));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-117, 47, -58, -60, -8, 54, -110, 50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        booleansbab060a493723b199065fc02333b4856 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        PQ.id_break();
        PQ.id_class();
    }
}

