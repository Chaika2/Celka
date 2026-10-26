/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIN
extends Enum<rrIN> {
    private static byte[] bytes6143465a63de38df9c2f3f3e8f0ab649;
    private static String[] strings6143465a63de38df9c2f3f3e8f0ab649;
    private static short[] shorts6143465a63de38df9c2f3f3e8f0ab649;
    private static boolean[] booleans6143465a63de38df9c2f3f3e8f0ab649;
    public static Object[] staticFields6143465a63de38df9c2f3f3e8f0ab649;

    private static void id_byte() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts6143465a63de38df9c2f3f3e8f0ab649 = sArray;
    }

    static {
        rrIN.ntfClinit();
    }

    public static rrIN[] values() {
        return (rrIN[])((rrIN[])staticFields6143465a63de38df9c2f3f3e8f0ab649[shorts6143465a63de38df9c2f3f3e8f0ab649[0]]).clone();
    }

    public static rrIN valueOf(String string) {
        return Enum.valueOf(rrIN.class, string);
    }

    private static void id_class() {
        strings6143465a63de38df9c2f3f3e8f0ab649 = new String[]{new String("LIST"), new String("BOX")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x68D67900C87EF3CAL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA8A5F08F;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-104, -60, -48, -13, -61, 53, -96, 3}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ rrIN[] id_break() {
        rrIN[] rrINArray = new rrIN[bytes6143465a63de38df9c2f3f3e8f0ab649[0]];
        rrINArray[rrIN.booleans6143465a63de38df9c2f3f3e8f0ab649[0]] = (rrIN)((Object)staticFields6143465a63de38df9c2f3f3e8f0ab649[shorts6143465a63de38df9c2f3f3e8f0ab649[1]]);
        rrINArray[rrIN.booleans6143465a63de38df9c2f3f3e8f0ab649[1]] = (rrIN)((Object)staticFields6143465a63de38df9c2f3f3e8f0ab649[shorts6143465a63de38df9c2f3f3e8f0ab649[2]]);
        return rrINArray;
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrIN(), new rrIN(), new rrIN[]{(rrIN)((Object)objectArray[0]), (rrIN)((Object)objectArray[1])}};
        staticFields6143465a63de38df9c2f3f3e8f0ab649 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrIN.id_protected();
        rrIN.id_class();
        rrIN.id_byte();
        rrIN.id_case();
        rrIN.id_throws();
    }

    private static void id_case() {
        bytes6143465a63de38df9c2f3f3e8f0ab649 = new byte[]{2, 2, 3};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans6143465a63de38df9c2f3f3e8f0ab649 = blArray;
    }
}

