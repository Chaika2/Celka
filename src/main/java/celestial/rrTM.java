/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrTE;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.DayOfWeek;
import java.time.LocalTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTM {
    public static Object[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new byte[]{9, 9, 11, 2, 13, 3, 15, 4, 17, 5, 19, 6, 21, 7, 23, 8, 7, 7, 45, 10, 45, 2, 13, 45, 3, 16, 45, 4, 19, 45, 5, 22, 45, 6, 45, 8, 10, 4, 10, 2, 7, 10, 3, 10, 10, 4, 13, 10, 5, 16, 10, 6, 19, 10, 7, 22, 10, 2, 3, 17, 30, 17, 30, 2, 17, 30, 3, 17, 30, 4, 15, 30, 5, 19, 30, 6, 7};
    }

    static {
        rrTM.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA49D81F97A16452L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA76F1419;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-84, -14, -76, 19, 21, 37, -29, 11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[28];
        blArray[2] = true;
        blArray[10] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[26] = true;
        id_byte = blArray;
    }

    private static void id_break() {
        Object[] objectArray = new Object[7];
        rrTE[] rrTEArray = new rrTE[]{rrTE.id_class(LocalTime.of(9, 0)), rrTE.id_class(LocalTime.of(11, 0)), rrTE.id_class(LocalTime.of(13, 0)), rrTE.id_class(LocalTime.of(15, 0)), rrTE.id_class(LocalTime.of(17, 0)), rrTE.id_class(LocalTime.of(19, 0)), rrTE.id_class(LocalTime.of(21, 0)), rrTE.id_class(LocalTime.of(23, 0)), rrTE.id_class(LocalTime.of(1, 0))};
        objectArray[0] = rrTEArray;
        rrTE[] rrTEArray2 = new rrTE[]{rrTE.id_class(LocalTime.of(7, 45)), rrTE.id_class(LocalTime.of(10, 45)), rrTE.id_class(LocalTime.of(13, 45)), rrTE.id_class(LocalTime.of(16, 45)), rrTE.id_class(LocalTime.of(19, 45)), rrTE.id_class(LocalTime.of(22, 45)), rrTE.id_class(LocalTime.of(1, 45))};
        objectArray[1] = rrTEArray2;
        rrTE[] rrTEArray3 = new rrTE[]{rrTE.id_class(LocalTime.of(1, 10)), rrTE.id_class(LocalTime.of(4, 10)), rrTE.id_class(LocalTime.of(7, 10)), rrTE.id_class(LocalTime.of(10, 10)), rrTE.id_class(LocalTime.of(13, 10)), rrTE.id_class(LocalTime.of(16, 10)), rrTE.id_class(LocalTime.of(19, 10)), rrTE.id_class(LocalTime.of(22, 10))};
        objectArray[2] = rrTEArray3;
        rrTE[] rrTEArray4 = new rrTE[]{rrTE.id_class(Enum.valueOf(DayOfWeek.class, "MONDAY"), LocalTime.of(17, 30)), rrTE.id_class(Enum.valueOf(DayOfWeek.class, "WEDNESDAY"), LocalTime.of(17, 30)), rrTE.id_class(Enum.valueOf(DayOfWeek.class, "FRIDAY"), LocalTime.of(17, 30))};
        objectArray[3] = rrTEArray4;
        rrTE[] rrTEArray5 = new rrTE[]{rrTE.id_class(Enum.valueOf(DayOfWeek.class, "SUNDAY"), LocalTime.of(17, 30))};
        objectArray[4] = rrTEArray5;
        rrTE[] rrTEArray6 = new rrTE[]{rrTE.id_class(LocalTime.of(15, 30))};
        objectArray[5] = rrTEArray6;
        rrTE[] rrTEArray7 = new rrTE[]{rrTE.id_class(LocalTime.of(19, 30))};
        objectArray[6] = rrTEArray7;
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTM.id_class();
        rrTM.id_byte();
        rrTM.id_break();
    }
}

