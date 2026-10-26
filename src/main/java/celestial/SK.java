/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_char;
import celestial.C_void;
import celestial.SU;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SK
extends Enum<SK>
implements C_char {
    private static String[] strings84fbf20de4d13027acc13a6866788039;
    private static short[] shorts84fbf20de4d13027acc13a6866788039;
    private static byte[] bytes84fbf20de4d13027acc13a6866788039;
    private static boolean[] booleans84fbf20de4d13027acc13a6866788039;
    public static Object[] staticFields84fbf20de4d13027acc13a6866788039;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new SK(), new SK[]{(SK)objectArray[0]}};
        staticFields84fbf20de4d13027acc13a6866788039 = objectArray;
    }

    static {
        SK.ntfClinit();
    }

    public static SK[] values() {
        return (SK[])((SK[])staticFields84fbf20de4d13027acc13a6866788039[shorts84fbf20de4d13027acc13a6866788039[0]]).clone();
    }

    public static SK valueOf(String string) {
        return Enum.valueOf(SK.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{44, -29, -63, 18, -54, -8, -4, 25}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public C_void id_class() {
        return (SU)SU.staticFields60242b15623d3e12b4eaac026de79971[shorts84fbf20de4d13027acc13a6866788039[1]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFDF5F6359274F9BEL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC59EB060;
    }

    private static void id_break() {
        bytes84fbf20de4d13027acc13a6866788039 = new byte[]{2};
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans84fbf20de4d13027acc13a6866788039 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        SK.id_throws();
        SK.id_protected();
        SK.id_case();
        SK.id_break();
        SK.id_byte();
    }

    private static /* synthetic */ SK[] id_catch() {
        SK[] sKArray = new SK[booleans84fbf20de4d13027acc13a6866788039[0]];
        sKArray[SK.booleans84fbf20de4d13027acc13a6866788039[1]] = (SK)staticFields84fbf20de4d13027acc13a6866788039[shorts84fbf20de4d13027acc13a6866788039[2]];
        return sKArray;
    }

    private static void id_case() {
        short[] sArray = new short[3];
        sArray[0] = 1;
        shorts84fbf20de4d13027acc13a6866788039 = sArray;
    }

    private static void id_protected() {
        strings84fbf20de4d13027acc13a6866788039 = new String[]{new String("INSTANCE")};
    }
}

