/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQR
extends Enum<rrQR> {
    private static short[] shorts390584fa19b23798828925cb0991ad90;
    private static boolean[] booleans390584fa19b23798828925cb0991ad90;
    private static byte[] bytes390584fa19b23798828925cb0991ad90;
    public static Object[] staticFields390584fa19b23798828925cb0991ad90;
    private static String[] strings390584fa19b23798828925cb0991ad90;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrQR(), new rrQR(), new rrQR(), new rrQR(), new rrQR[]{(rrQR)((Object)objectArray[0]), (rrQR)((Object)objectArray[1]), (rrQR)((Object)objectArray[2]), (rrQR)((Object)objectArray[3])}};
        staticFields390584fa19b23798828925cb0991ad90 = objectArray;
    }

    static {
        rrQR.ntfClinit();
    }

    public static rrQR[] values() {
        return (rrQR[])((rrQR[])staticFields390584fa19b23798828925cb0991ad90[shorts390584fa19b23798828925cb0991ad90[0]]).clone();
    }

    public static rrQR valueOf(String string) {
        return Enum.valueOf(rrQR.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{14, 42, -42, 109, 100, -105, -99, 5}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans390584fa19b23798828925cb0991ad90 = blArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x47CB86D923D9ECF9L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1495BD23;
    }

    private static /* synthetic */ rrQR[] id_break() {
        rrQR[] rrQRArray = new rrQR[bytes390584fa19b23798828925cb0991ad90[0]];
        rrQRArray[rrQR.booleans390584fa19b23798828925cb0991ad90[0]] = (rrQR)((Object)staticFields390584fa19b23798828925cb0991ad90[shorts390584fa19b23798828925cb0991ad90[1]]);
        rrQRArray[rrQR.booleans390584fa19b23798828925cb0991ad90[1]] = (rrQR)((Object)staticFields390584fa19b23798828925cb0991ad90[shorts390584fa19b23798828925cb0991ad90[2]]);
        rrQRArray[rrQR.bytes390584fa19b23798828925cb0991ad90[1]] = (rrQR)((Object)staticFields390584fa19b23798828925cb0991ad90[shorts390584fa19b23798828925cb0991ad90[3]]);
        rrQRArray[rrQR.bytes390584fa19b23798828925cb0991ad90[2]] = (rrQR)((Object)staticFields390584fa19b23798828925cb0991ad90[shorts390584fa19b23798828925cb0991ad90[4]]);
        return rrQRArray;
    }

    private static void id_throws() {
        bytes390584fa19b23798828925cb0991ad90 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
    }

    private static /* synthetic */ void ntfClinit() {
        rrQR.id_class();
        rrQR.id_case();
        rrQR.id_protected();
        rrQR.id_throws();
        rrQR.id_byte();
    }

    private static void id_case() {
        strings390584fa19b23798828925cb0991ad90 = new String[]{new String("VALID"), new String("INVALID"), new String("OFFLINE"), new String("UNKNOWN")};
    }

    private static void id_protected() {
        short[] sArray = new short[5];
        sArray[0] = 4;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        shorts390584fa19b23798828925cb0991ad90 = sArray;
    }
}

