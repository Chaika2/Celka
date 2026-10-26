/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLD;
import celestial.rLR;
import celestial.rrIk_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnH_2
extends Enum<rrnH_2> {
    private static boolean[] booleansba1a444f212636b2b8a611cbfb64503e;
    public static Object[] staticFieldsba1a444f212636b2b8a611cbfb64503e;
    private static short[] shortsba1a444f212636b2b8a611cbfb64503e;
    private static String[] stringsba1a444f212636b2b8a611cbfb64503e;
    private static byte[] bytesba1a444f212636b2b8a611cbfb64503e;
    public Object[] fieldsba1a444f212636b2b8a611cbfb64503e;

    public rLR id_byte() {
        return (rLR)this.fieldsba1a444f212636b2b8a611cbfb64503e[shortsba1a444f212636b2b8a611cbfb64503e[4]];
    }

    private rrnH_2(rLR rLR2, int n2, Supplier<Boolean> supplier) {
        Supplier<Boolean> supplier2;
        this.id_implements();
        rLR rLR3 = rLR2;
        this.fieldsba1a444f212636b2b8a611cbfb64503e[rrnH_2.shortsba1a444f212636b2b8a611cbfb64503e[1]] = rLR3;
        Integer n3 = n2;
        this.fieldsba1a444f212636b2b8a611cbfb64503e[rrnH_2.shortsba1a444f212636b2b8a611cbfb64503e[2]] = n3;
        this.fieldsba1a444f212636b2b8a611cbfb64503e[rrnH_2.shortsba1a444f212636b2b8a611cbfb64503e[3]] = supplier2 = supplier;
    }

    static {
        rrnH_2.ntfClinit();
    }

    public static rrnH_2[] values() {
        return (rrnH_2[])((rrnH_2[])staticFieldsba1a444f212636b2b8a611cbfb64503e[shortsba1a444f212636b2b8a611cbfb64503e[0]]).clone();
    }

    public static rrnH_2 valueOf(String string) {
        return Enum.valueOf(rrnH_2.class, string);
    }

    public int id_class() {
        return (Integer)this.fieldsba1a444f212636b2b8a611cbfb64503e[shortsba1a444f212636b2b8a611cbfb64503e[5]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{116, 84, -4, 118, -5, 77, -68, 45}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD70A59BB;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6AD0D0F6E23C990L;
    }

    public Supplier<Boolean> id_break() {
        return (Supplier)this.fieldsba1a444f212636b2b8a611cbfb64503e[shortsba1a444f212636b2b8a611cbfb64503e[6]];
    }

    private static void id_throws() {
        stringsba1a444f212636b2b8a611cbfb64503e = new String[]{new String("STRENGTH"), new String("SPEED"), new String("FIRE_RESISTANCE")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrnH_2.id_catch();
        rrnH_2.id_throws();
        rrnH_2.id_finally();
        rrnH_2.id_protected();
        rrnH_2.id_private();
    }

    private static void id_finally() {
        short[] sArray = new short[10];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        shortsba1a444f212636b2b8a611cbfb64503e = sArray;
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[11];
        blArray[1] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        booleansba1a444f212636b2b8a611cbfb64503e = blArray;
    }

    private static /* synthetic */ rrnH_2[] id_case() {
        rrnH_2[] rrnH_2Array = new rrnH_2[bytesba1a444f212636b2b8a611cbfb64503e[0]];
        rrnH_2Array[rrnH_2.booleansba1a444f212636b2b8a611cbfb64503e[0]] = (rrnH_2)((Object)staticFieldsba1a444f212636b2b8a611cbfb64503e[shortsba1a444f212636b2b8a611cbfb64503e[7]]);
        rrnH_2Array[rrnH_2.booleansba1a444f212636b2b8a611cbfb64503e[1]] = (rrnH_2)((Object)staticFieldsba1a444f212636b2b8a611cbfb64503e[shortsba1a444f212636b2b8a611cbfb64503e[8]]);
        rrnH_2Array[rrnH_2.bytesba1a444f212636b2b8a611cbfb64503e[1]] = (rrnH_2)((Object)staticFieldsba1a444f212636b2b8a611cbfb64503e[shortsba1a444f212636b2b8a611cbfb64503e[9]]);
        return rrnH_2Array;
    }

    private void id_implements() {
        if (this.fieldsba1a444f212636b2b8a611cbfb64503e == null) {
            this.fieldsba1a444f212636b2b8a611cbfb64503e = new Object[3];
            this.fieldsba1a444f212636b2b8a611cbfb64503e[1] = 0;
        }
    }

    private static void id_protected() {
        bytesba1a444f212636b2b8a611cbfb64503e = new byte[]{3, 2, 5, 2, 12, 2, 2, 3, 3, 4};
    }

    private static void id_private() {
        Object[] objectArray;
        objectArray = new Object[]{new rrnH_2(rLD.id_throws, 5, new rrIk_1("\u0421\u0438\u043b\u0443", true)::id_class), new rrnH_2(rLD.id_class, 1, new rrIk_1("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", true)::id_class), new rrnH_2(rLD.id_native, 12, new rrIk_1("\u0417\u0430\u0449\u0438\u0442\u0443 \u043e\u0442 \u043e\u0433\u043d\u044f", true)::id_class), new rrnH_2[]{(rrnH_2)((Object)objectArray[0]), (rrnH_2)((Object)objectArray[1]), (rrnH_2)((Object)objectArray[2])}};
        staticFieldsba1a444f212636b2b8a611cbfb64503e = objectArray;
    }
}

