/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAw_1
extends Enum<rrAw_1> {
    private static String[] stringsfdd9e1cda53536f3a280666af211bfa1;
    public static Object[] staticFieldsfdd9e1cda53536f3a280666af211bfa1;
    private static byte[] bytesfdd9e1cda53536f3a280666af211bfa1;
    private static boolean[] booleansfdd9e1cda53536f3a280666af211bfa1;
    private static short[] shortsfdd9e1cda53536f3a280666af211bfa1;

    private static void id_byte() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shortsfdd9e1cda53536f3a280666af211bfa1 = sArray;
    }

    static {
        rrAw_1.ntfClinit();
    }

    public static rrAw_1[] values() {
        return (rrAw_1[])((rrAw_1[])staticFieldsfdd9e1cda53536f3a280666af211bfa1[shortsfdd9e1cda53536f3a280666af211bfa1[0]]).clone();
    }

    public static rrAw_1 valueOf(String string) {
        return Enum.valueOf(rrAw_1.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFE0C5FC91F3CCF73L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6F9283D6;
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new rrAw_1(), new rrAw_1(), new rrAw_1[]{(rrAw_1)((Object)objectArray[0]), (rrAw_1)((Object)objectArray[1])}};
        staticFieldsfdd9e1cda53536f3a280666af211bfa1 = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-88, 84, 10, -17, -41, -34, -69, 65}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        bytesfdd9e1cda53536f3a280666af211bfa1 = new byte[]{2, 2, 3};
    }

    private static /* synthetic */ rrAw_1[] id_throws() {
        rrAw_1[] rrAw_1Array = new rrAw_1[bytesfdd9e1cda53536f3a280666af211bfa1[0]];
        rrAw_1Array[rrAw_1.booleansfdd9e1cda53536f3a280666af211bfa1[0]] = (rrAw_1)((Object)staticFieldsfdd9e1cda53536f3a280666af211bfa1[shortsfdd9e1cda53536f3a280666af211bfa1[1]]);
        rrAw_1Array[rrAw_1.booleansfdd9e1cda53536f3a280666af211bfa1[1]] = (rrAw_1)((Object)staticFieldsfdd9e1cda53536f3a280666af211bfa1[shortsfdd9e1cda53536f3a280666af211bfa1[2]]);
        return rrAw_1Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAw_1.id_case();
        rrAw_1.id_protected();
        rrAw_1.id_byte();
        rrAw_1.id_break();
        rrAw_1.id_class();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansfdd9e1cda53536f3a280666af211bfa1 = blArray;
    }

    private static void id_protected() {
        stringsfdd9e1cda53536f3a280666af211bfa1 = new String[]{new String("START"), new String("STOP")};
    }
}

