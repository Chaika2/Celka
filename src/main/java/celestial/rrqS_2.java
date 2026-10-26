/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVa_1;
import celestial.rgP_2;
import celestial.rrfu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqS_2
extends Enum<rrqS_2> {
    private static boolean[] booleans76a63d849f9636f9a8b567c1e8edd09e;
    private static short[] shorts76a63d849f9636f9a8b567c1e8edd09e;
    private static String[] strings76a63d849f9636f9a8b567c1e8edd09e;
    public static Object[] staticFields76a63d849f9636f9a8b567c1e8edd09e;
    public Object[] fields76a63d849f9636f9a8b567c1e8edd09e;
    private static byte[] bytes76a63d849f9636f9a8b567c1e8edd09e;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans76a63d849f9636f9a8b567c1e8edd09e = blArray;
    }

    private rrqS_2(rgP_2 rgP_22) {
        this.id_protected();
        rgP_2 rgP_23 = rgP_22;
        this.fields76a63d849f9636f9a8b567c1e8edd09e[rrqS_2.shorts76a63d849f9636f9a8b567c1e8edd09e[1]] = rgP_23;
        String string2 = rgP_22.getString();
        this.fields76a63d849f9636f9a8b567c1e8edd09e[rrqS_2.shorts76a63d849f9636f9a8b567c1e8edd09e[2]] = string2;
    }

    static {
        rrqS_2.ntfClinit();
    }

    public static rrqS_2[] values() {
        return (rrqS_2[])((rrqS_2[])staticFields76a63d849f9636f9a8b567c1e8edd09e[shorts76a63d849f9636f9a8b567c1e8edd09e[0]]).clone();
    }

    public static rrqS_2 valueOf(String string) {
        return Enum.valueOf(rrqS_2.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-25, -76, -18, -2, 18, -34, 15, 20}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD21AE455;
    }

    public rgP_2 id_class() {
        return (rgP_2)this.fields76a63d849f9636f9a8b567c1e8edd09e[shorts76a63d849f9636f9a8b567c1e8edd09e[3]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEB6B525FE5D2FFEL;
    }

    public String id_break() {
        return (String)this.fields76a63d849f9636f9a8b567c1e8edd09e[shorts76a63d849f9636f9a8b567c1e8edd09e[4]];
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrqS_2(rrfu_3.id_class().id_break(rVa_1.id_class(strings76a63d849f9636f9a8b567c1e8edd09e[1]), rVa_1.id_class(strings76a63d849f9636f9a8b567c1e8edd09e[2])).id_class(strings76a63d849f9636f9a8b567c1e8edd09e[3]).id_break()), new rrqS_2(rrfu_3.id_class().id_break(rVa_1.id_class(strings76a63d849f9636f9a8b567c1e8edd09e[5]), rVa_1.id_class(strings76a63d849f9636f9a8b567c1e8edd09e[6])).id_class(strings76a63d849f9636f9a8b567c1e8edd09e[7]).id_break()), new rrqS_2(rrfu_3.id_class().id_break(rVa_1.id_class(strings76a63d849f9636f9a8b567c1e8edd09e[9]), rVa_1.id_class(strings76a63d849f9636f9a8b567c1e8edd09e[10])).id_class(strings76a63d849f9636f9a8b567c1e8edd09e[11]).id_break()), new rrqS_2(rrfu_3.id_class().id_break(rVa_1.id_class(strings76a63d849f9636f9a8b567c1e8edd09e[13]), rVa_1.id_class(strings76a63d849f9636f9a8b567c1e8edd09e[14])).id_class(strings76a63d849f9636f9a8b567c1e8edd09e[15]).id_break()), new rrqS_2(rrfu_3.id_class().id_break(rVa_1.id_class(strings76a63d849f9636f9a8b567c1e8edd09e[17]), rVa_1.id_class(strings76a63d849f9636f9a8b567c1e8edd09e[18])).id_class(strings76a63d849f9636f9a8b567c1e8edd09e[19]).id_break()), new rrqS_2(rrfu_3.id_class().id_break(rVa_1.id_class(strings76a63d849f9636f9a8b567c1e8edd09e[21]), rVa_1.id_class(strings76a63d849f9636f9a8b567c1e8edd09e[22])).id_class(strings76a63d849f9636f9a8b567c1e8edd09e[23]).id_break()), new rrqS_2[]{(rrqS_2)((Object)objectArray[0]), (rrqS_2)((Object)objectArray[1]), (rrqS_2)((Object)objectArray[2]), (rrqS_2)((Object)objectArray[3]), (rrqS_2)((Object)objectArray[4]), (rrqS_2)((Object)objectArray[5])}};
        staticFields76a63d849f9636f9a8b567c1e8edd09e = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrqS_2.id_byte();
        rrqS_2.id_implements();
        rrqS_2.id_private();
        rrqS_2.id_case();
        rrqS_2.id_throws();
    }

    private static /* synthetic */ rrqS_2[] id_catch() {
        rrqS_2[] rrqS_2Array = new rrqS_2[bytes76a63d849f9636f9a8b567c1e8edd09e[0]];
        rrqS_2Array[rrqS_2.booleans76a63d849f9636f9a8b567c1e8edd09e[0]] = (rrqS_2)((Object)staticFields76a63d849f9636f9a8b567c1e8edd09e[shorts76a63d849f9636f9a8b567c1e8edd09e[5]]);
        rrqS_2Array[rrqS_2.booleans76a63d849f9636f9a8b567c1e8edd09e[1]] = (rrqS_2)((Object)staticFields76a63d849f9636f9a8b567c1e8edd09e[shorts76a63d849f9636f9a8b567c1e8edd09e[6]]);
        rrqS_2Array[rrqS_2.bytes76a63d849f9636f9a8b567c1e8edd09e[1]] = (rrqS_2)((Object)staticFields76a63d849f9636f9a8b567c1e8edd09e[shorts76a63d849f9636f9a8b567c1e8edd09e[7]]);
        rrqS_2Array[rrqS_2.bytes76a63d849f9636f9a8b567c1e8edd09e[2]] = (rrqS_2)((Object)staticFields76a63d849f9636f9a8b567c1e8edd09e[shorts76a63d849f9636f9a8b567c1e8edd09e[8]]);
        rrqS_2Array[rrqS_2.bytes76a63d849f9636f9a8b567c1e8edd09e[3]] = (rrqS_2)((Object)staticFields76a63d849f9636f9a8b567c1e8edd09e[shorts76a63d849f9636f9a8b567c1e8edd09e[9]]);
        rrqS_2Array[rrqS_2.bytes76a63d849f9636f9a8b567c1e8edd09e[4]] = (rrqS_2)((Object)staticFields76a63d849f9636f9a8b567c1e8edd09e[shorts76a63d849f9636f9a8b567c1e8edd09e[10]]);
        return rrqS_2Array;
    }

    private static void id_case() {
        bytes76a63d849f9636f9a8b567c1e8edd09e = new byte[]{6, 2, 3, 4, 5, 2, 2, 3, 3, 4, 4, 5, 5, 6, 2, 7};
    }

    private static void id_implements() {
        strings76a63d849f9636f9a8b567c1e8edd09e = new String[]{new String("ACTIVE"), new String("#00ff00"), new String("#7fff7f"), new String("\u0410\u043a\u0442\u0438\u0432\u0435\u043d"), new String("VANISH"), new String("#ff0000"), new String("#ff7f7f"), new String("\u0412 \u0441\u043f\u0435\u043a\u0435"), new String("NEAR"), new String("#ff0000"), new String("#ff7f7f"), new String("\u0420\u044f\u0434\u043e\u043c"), new String("SPECTATOR"), new String("#ffd700"), new String("#ffddaf"), new String("GM3"), new String("LEFT_FROM_SERVER"), new String("#ff0000"), new String("#ff7f7f"), new String("\u0412\u044b\u0448\u0435\u043b"), new String("UNKNOWN"), new String("#ff0000"), new String("#ff7f7f"), new String("\u041d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u043e")};
    }

    private void id_protected() {
        if (this.fields76a63d849f9636f9a8b567c1e8edd09e == null) {
            this.fields76a63d849f9636f9a8b567c1e8edd09e = new Object[2];
        }
    }

    private static void id_private() {
        short[] sArray = new short[11];
        sArray[0] = 6;
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 3;
        sArray[9] = 4;
        sArray[10] = 5;
        shorts76a63d849f9636f9a8b567c1e8edd09e = sArray;
    }
}

