/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.X;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.Duration;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class C_instanceof
extends C_try {
    private static byte[] id_throws;
    private static short[] id_case;
    private static float[] id_catch;
    private static boolean[] id_private;
    private static long[] id_implements;
    public Object[] id_break;
    private static String[] id_finally;

    @Override
    public x_1 id_byte() {
        this.id_volatile();
        if (System.currentTimeMillis() - (Long)this.id_break[id_case[2]] < ((Duration)this.id_break[id_case[3]]).toMillis()) {
            return new X("\u041f\u043e\u0434\u043e\u0436\u0434\u0438\u0442\u0435 " + this.id_new() + " \u043f\u0435\u0440\u0435\u0434 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435\u043c \u044d\u0442\u043e\u0439 \u043a\u043e\u043c\u0430\u043d\u0434\u044b");
        }
        return null;
    }

    private static void id_int() {
        id_finally = new String[]{new String("%.1fc")};
    }

    public C_instanceof(C_case c_case, Duration duration, String ... stringArray) {
        super(c_case, stringArray);
        this.id_volatile();
        Duration duration2 = duration;
        this.id_break[C_instanceof.id_case[0]] = duration2;
    }

    static {
        C_instanceof.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB4ABAA3911C7706AL;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        this.id_volatile();
        Long l = System.currentTimeMillis();
        this.id_break[C_instanceof.id_case[1]] = l;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE4E6A0C2;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{55, -75, -120, 85, -17, 83, -117, -100}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public long id_throws() {
        this.id_volatile();
        return (Long)this.id_break[id_case[7]];
    }

    private static /* synthetic */ void ntfClinit() {
        C_instanceof.id_final();
        C_instanceof.id_int();
        C_instanceof.id_finally();
        C_instanceof.id_package();
        C_instanceof.id_native();
        C_instanceof.id_extends();
    }

    private static void id_finally() {
        long[] lArray = new long[4];
        lArray[0] = 1000L;
        lArray[2] = 1000L;
        id_implements = lArray;
    }

    private static void id_extends() {
        id_throws = new byte[]{2};
    }

    private String id_new() {
        this.id_volatile();
        long l = ((Duration)this.id_break[id_case[4]]).toMillis() - (System.currentTimeMillis() - (Long)this.id_break[id_case[5]]);
        if (l / id_implements[0] <= id_implements[1]) {
            Object[] objectArray = new Object[id_private[0]];
            objectArray[C_instanceof.id_private[1]] = Float.valueOf((float)l / id_catch[0]);
            return String.format(id_finally[0], objectArray);
        }
        return l / id_implements[2] + "c";
    }

    private static void id_package() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        id_case = sArray;
    }

    public Duration id_protected() {
        this.id_volatile();
        return (Duration)this.id_break[id_case[6]];
    }

    private static void id_final() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_private = blArray;
    }

    private void id_volatile() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
            objectArray[C_instanceof.id_private[2]] = id_implements[3];
        }
    }

    private static void id_native() {
        id_catch = new float[]{1000.0f};
    }
}

