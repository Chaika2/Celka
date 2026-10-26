/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFD
extends Enum<rrFD> {
    private static byte[] bytes1658baa549203f63991cdcef51acf497;
    private static short[] shorts1658baa549203f63991cdcef51acf497;
    public static Object[] staticFields1658baa549203f63991cdcef51acf497;
    private static String[] strings1658baa549203f63991cdcef51acf497;
    private static boolean[] booleans1658baa549203f63991cdcef51acf497;

    private static void id_byte() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts1658baa549203f63991cdcef51acf497 = sArray;
    }

    static {
        rrFD.ntfClinit();
    }

    public static rrFD[] values() {
        return (rrFD[])((rrFD[])staticFields1658baa549203f63991cdcef51acf497[shorts1658baa549203f63991cdcef51acf497[0]]).clone();
    }

    public static rrFD valueOf(String string) {
        return Enum.valueOf(rrFD.class, string);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans1658baa549203f63991cdcef51acf497 = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{99, 124, 120, 113, 104, 55, 23, 62}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE0423348;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x44FF0DE168693E4L;
    }

    private static void id_break() {
        bytes1658baa549203f63991cdcef51acf497 = new byte[]{2, 2, 3};
    }

    private static /* synthetic */ rrFD[] id_throws() {
        rrFD[] rrFDArray = new rrFD[bytes1658baa549203f63991cdcef51acf497[0]];
        rrFDArray[rrFD.booleans1658baa549203f63991cdcef51acf497[0]] = (rrFD)((Object)staticFields1658baa549203f63991cdcef51acf497[shorts1658baa549203f63991cdcef51acf497[1]]);
        rrFDArray[rrFD.booleans1658baa549203f63991cdcef51acf497[1]] = (rrFD)((Object)staticFields1658baa549203f63991cdcef51acf497[shorts1658baa549203f63991cdcef51acf497[2]]);
        return rrFDArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFD.id_class();
        rrFD.id_protected();
        rrFD.id_byte();
        rrFD.id_break();
        rrFD.id_case();
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new rrFD(), new rrFD(), new rrFD[]{(rrFD)((Object)objectArray[0]), (rrFD)((Object)objectArray[1])}};
        staticFields1658baa549203f63991cdcef51acf497 = objectArray;
    }

    private static void id_protected() {
        strings1658baa549203f63991cdcef51acf497 = new String[]{new String("CONNECTING"), new String("DISCONNECTING")};
    }
}

