/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.DayOfWeek;
import java.time.LocalTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTE {
    private static byte[] id_break;
    public Object[] id_class;
    private static short[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
        }
    }

    private rrTE(DayOfWeek dayOfWeek, LocalTime localTime) {
        this.id_byte();
        DayOfWeek dayOfWeek2 = dayOfWeek;
        this.id_class[rrTE.id_byte[0]] = dayOfWeek2;
        LocalTime localTime2 = localTime;
        this.id_class[rrTE.id_byte[1]] = localTime2;
    }

    private rrTE(LocalTime localTime) {
        this(null, localTime);
    }

    static {
        rrTE.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{123, -4, -76, -51, -75, -28, 35, 119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAA7A874840DF51EBL;
    }

    public static rrTE id_class(LocalTime localTime) {
        return new rrTE(localTime);
    }

    public LocalTime id_class() {
        return (LocalTime)this.id_class[id_byte[3]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA8DC0EF6;
    }

    public static rrTE id_class(DayOfWeek dayOfWeek, LocalTime localTime) {
        return new rrTE(dayOfWeek, localTime);
    }

    public DayOfWeek id_break() {
        return (DayOfWeek)this.id_class[id_byte[2]];
    }

    private static void id_throws() {
        id_break = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrTE.id_protected();
        rrTE.id_throws();
    }

    private static void id_protected() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_byte = sArray;
    }
}

