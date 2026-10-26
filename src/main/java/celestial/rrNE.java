/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNE
extends Enum<rrNE> {
    private static boolean[] booleansf494c4277fc533979058c6d61fda001b;
    private static short[] shortsf494c4277fc533979058c6d61fda001b;
    private static String[] stringsf494c4277fc533979058c6d61fda001b;
    public static Object[] staticFieldsf494c4277fc533979058c6d61fda001b;
    private static byte[] bytesf494c4277fc533979058c6d61fda001b;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrNE(), new rrNE(), new rrNE[]{(rrNE)((Object)objectArray[0]), (rrNE)((Object)objectArray[1])}};
        staticFieldsf494c4277fc533979058c6d61fda001b = objectArray;
    }

    static {
        rrNE.ntfClinit();
    }

    public static rrNE[] values() {
        return (rrNE[])((rrNE[])staticFieldsf494c4277fc533979058c6d61fda001b[shortsf494c4277fc533979058c6d61fda001b[0]]).clone();
    }

    public static rrNE valueOf(String string) {
        return Enum.valueOf(rrNE.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-123, -13, -25, 68, 48, 47, 113, 120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7BC99940E50966BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1828DC1C;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansf494c4277fc533979058c6d61fda001b = blArray;
    }

    private static void id_break() {
        bytesf494c4277fc533979058c6d61fda001b = new byte[]{2, 2, 3};
    }

    private static /* synthetic */ rrNE[] id_throws() {
        rrNE[] rrNEArray = new rrNE[bytesf494c4277fc533979058c6d61fda001b[0]];
        rrNEArray[rrNE.booleansf494c4277fc533979058c6d61fda001b[0]] = (rrNE)((Object)staticFieldsf494c4277fc533979058c6d61fda001b[shortsf494c4277fc533979058c6d61fda001b[1]]);
        rrNEArray[rrNE.booleansf494c4277fc533979058c6d61fda001b[1]] = (rrNE)((Object)staticFieldsf494c4277fc533979058c6d61fda001b[shortsf494c4277fc533979058c6d61fda001b[2]]);
        return rrNEArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrNE.id_class();
        rrNE.id_protected();
        rrNE.id_case();
        rrNE.id_break();
        rrNE.id_byte();
    }

    private static void id_case() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shortsf494c4277fc533979058c6d61fda001b = sArray;
    }

    private static void id_protected() {
        stringsf494c4277fc533979058c6d61fda001b = new String[]{new String("FORWARD"), new String("BACKWARD")};
    }
}

