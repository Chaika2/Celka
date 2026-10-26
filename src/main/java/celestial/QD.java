/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class QD
extends Enum<QD> {
    private static short[] shorts25f7c1a34dee3bdaa6c7082af054c49d;
    private static String[] strings25f7c1a34dee3bdaa6c7082af054c49d;
    public static Object[] staticFields25f7c1a34dee3bdaa6c7082af054c49d;
    private static boolean[] booleans25f7c1a34dee3bdaa6c7082af054c49d;
    private static byte[] bytes25f7c1a34dee3bdaa6c7082af054c49d;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans25f7c1a34dee3bdaa6c7082af054c49d = blArray;
    }

    static {
        QD.ntfClinit();
    }

    public static QD[] values() {
        return (QD[])((QD[])staticFields25f7c1a34dee3bdaa6c7082af054c49d[shorts25f7c1a34dee3bdaa6c7082af054c49d[0]]).clone();
    }

    public static QD valueOf(String string) {
        return Enum.valueOf(QD.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF1AC71AC;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-45, -58, -116, 61, 52, 50, 39, 93}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        strings25f7c1a34dee3bdaa6c7082af054c49d = new String[]{new String("NONE"), new String("CREATE"), new String("BACKUP")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x89A7D968D06C9119L;
    }

    private static void id_break() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts25f7c1a34dee3bdaa6c7082af054c49d = sArray;
    }

    private static /* synthetic */ QD[] id_throws() {
        QD[] qDArray = new QD[bytes25f7c1a34dee3bdaa6c7082af054c49d[0]];
        qDArray[QD.booleans25f7c1a34dee3bdaa6c7082af054c49d[0]] = (QD)((Object)staticFields25f7c1a34dee3bdaa6c7082af054c49d[shorts25f7c1a34dee3bdaa6c7082af054c49d[1]]);
        qDArray[QD.booleans25f7c1a34dee3bdaa6c7082af054c49d[1]] = (QD)((Object)staticFields25f7c1a34dee3bdaa6c7082af054c49d[shorts25f7c1a34dee3bdaa6c7082af054c49d[2]]);
        qDArray[QD.bytes25f7c1a34dee3bdaa6c7082af054c49d[1]] = (QD)((Object)staticFields25f7c1a34dee3bdaa6c7082af054c49d[shorts25f7c1a34dee3bdaa6c7082af054c49d[3]]);
        return qDArray;
    }

    private static /* synthetic */ void ntfClinit() {
        QD.id_byte();
        QD.id_class();
        QD.id_break();
        QD.id_protected();
        QD.id_case();
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new QD(), new QD(), new QD(), new QD[]{(QD)((Object)objectArray[0]), (QD)((Object)objectArray[1]), (QD)((Object)objectArray[2])}};
        staticFields25f7c1a34dee3bdaa6c7082af054c49d = objectArray;
    }

    private static void id_protected() {
        bytes25f7c1a34dee3bdaa6c7082af054c49d = new byte[]{3, 2, 2, 2, 3, 4};
    }
}

