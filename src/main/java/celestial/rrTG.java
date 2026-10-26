/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.rql_3;
import celestial.rqy_3;
import celestial.rrTE;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTG {
    public static Object[] id_class;
    private static long[] id_break;
    private static float[] id_byte;
    private static String[] id_protected;
    private static boolean[] id_throws;

    private static void id_byte() {
        id_protected = new String[]{new String("\u041d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u043e"), new String("Europe/Moscow")};
    }

    static {
        rrTG.ntfClinit();
    }

    private static LocalDateTime id_class(rrTE rrTE2, LocalDateTime localDateTime) {
        LocalTime localTime = rrTE2.id_class();
        LocalDateTime localDateTime2 = localDateTime.withHour(localTime.getHour()).withMinute(localTime.getMinute()).withSecond(id_throws[3]);
        if (rrTE2.id_break() != null) {
            localDateTime2 = localDateTime2.with(rrTE2.id_break());
        }
        return localDateTime2;
    }

    public static LocalDateTime id_class(rrTE[] rrTEArray, LocalDateTime localDateTime) {
        LocalDateTime localDateTime2 = null;
        Object object = rrTEArray;
        int n = ((rrTE[])object).length;
        for (int i = id_throws[1]; i < n; ++i) {
            rrTE rrTE2 = object[i];
            LocalDateTime localDateTime3 = rrTG.id_class(rrTE2, localDateTime);
            if (!localDateTime3.isAfter(localDateTime.minusSeconds(id_break[0])) || localDateTime2 != null && !localDateTime3.isBefore(localDateTime2)) continue;
            localDateTime2 = localDateTime3;
        }
        if (localDateTime2 == null) {
            object = rrTEArray[id_throws[2]];
            localDateTime2 = ((rrTE)object).id_break() != null ? rrTG.id_class((rrTE)object, localDateTime.plusWeeks(id_break[1])) : rrTG.id_class((rrTE)object, localDateTime.plusDays(id_break[2]));
        }
        return localDateTime2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x845C376A9A79442AL;
    }

    public static String id_class(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        if (localDateTime2 == null) {
            return id_protected[0];
        }
        return rql_3.id_class(Duration.between(localDateTime, localDateTime2), new rqy_3[id_throws[0]]);
    }

    private static void id_class() {
        id_break = new long[]{1L, 1L, 1L, 1L};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC1282A45;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{98, -80, -89, 122, 8, -89, -85, 47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[5] = true;
        id_throws = blArray;
    }

    public static float id_break(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        if (localDateTime2 == null || localDateTime.isAfter(localDateTime2)) {
            return id_byte[0];
        }
        Duration duration = Duration.between(localDateTime, localDateTime2);
        Duration duration2 = Duration.between(localDateTime, localDateTime.plusDays(id_break[3]));
        float f = id_byte[1] - (float)duration.toMillis() / (float)duration2.toMillis();
        return rfU_2.id_class(f, id_byte[2], id_byte[3]);
    }

    private static void id_throws() {
        float[] fArray = new float[4];
        fArray[1] = 1.0f;
        fArray[3] = 1.0f;
        id_byte = fArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTG.id_break();
        rrTG.id_byte();
        rrTG.id_class();
        rrTG.id_throws();
        rrTG.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{ZoneId.of(id_protected[1])};
        id_class = objectArray;
    }
}

