/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryF
extends Enum<rryF> {
    private static byte[] bytesfd087588ab503ef5ba48903746a1e506;
    private static boolean[] booleansfd087588ab503ef5ba48903746a1e506;
    private static short[] shortsfd087588ab503ef5ba48903746a1e506;
    private static String[] stringsfd087588ab503ef5ba48903746a1e506;
    public static Object[] staticFieldsfd087588ab503ef5ba48903746a1e506;

    private static void id_byte() {
        bytesfd087588ab503ef5ba48903746a1e506 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    static {
        rryF.ntfClinit();
    }

    public static rryF[] values() {
        return (rryF[])((rryF[])staticFieldsfd087588ab503ef5ba48903746a1e506[shortsfd087588ab503ef5ba48903746a1e506[0]]).clone();
    }

    public static rryF valueOf(String string) {
        return Enum.valueOf(rryF.class, string);
    }

    private static void id_class() {
        stringsfd087588ab503ef5ba48903746a1e506 = new String[]{new String("VALID"), new String("FRIEND"), new String("BLACKLISTED")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDB4F6C7D90CBD2C8L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-28, 97, 114, -48, 6, 34, 20, 75}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x86BDB06A;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansfd087588ab503ef5ba48903746a1e506 = blArray;
    }

    private static void id_throws() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortsfd087588ab503ef5ba48903746a1e506 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rryF.id_break();
        rryF.id_class();
        rryF.id_throws();
        rryF.id_byte();
        rryF.id_protected();
    }

    private static /* synthetic */ rryF[] id_case() {
        rryF[] rryFArray = new rryF[bytesfd087588ab503ef5ba48903746a1e506[0]];
        rryFArray[rryF.booleansfd087588ab503ef5ba48903746a1e506[0]] = (rryF)((Object)staticFieldsfd087588ab503ef5ba48903746a1e506[shortsfd087588ab503ef5ba48903746a1e506[1]]);
        rryFArray[rryF.booleansfd087588ab503ef5ba48903746a1e506[1]] = (rryF)((Object)staticFieldsfd087588ab503ef5ba48903746a1e506[shortsfd087588ab503ef5ba48903746a1e506[2]]);
        rryFArray[rryF.bytesfd087588ab503ef5ba48903746a1e506[1]] = (rryF)((Object)staticFieldsfd087588ab503ef5ba48903746a1e506[shortsfd087588ab503ef5ba48903746a1e506[3]]);
        return rryFArray;
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new rryF(), new rryF(), new rryF(), new rryF[]{(rryF)((Object)objectArray[0]), (rryF)((Object)objectArray[1]), (rryF)((Object)objectArray[2])}};
        staticFieldsfd087588ab503ef5ba48903746a1e506 = objectArray;
    }
}

