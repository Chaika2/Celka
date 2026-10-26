/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Es_1
extends Enum<Es_1> {
    private static byte[] bytes5696f710d79436c0a6411ece0fff2016;
    private static String[] strings5696f710d79436c0a6411ece0fff2016;
    private static boolean[] booleans5696f710d79436c0a6411ece0fff2016;
    public static Object[] staticFields5696f710d79436c0a6411ece0fff2016;
    private static short[] shorts5696f710d79436c0a6411ece0fff2016;
    public Object[] fields5696f710d79436c0a6411ece0fff2016;

    private static void id_byte() {
        Object[] objectArray = new Object[15];
        String[] stringArray = new String[]{strings5696f710d79436c0a6411ece0fff2016[1], strings5696f710d79436c0a6411ece0fff2016[2], strings5696f710d79436c0a6411ece0fff2016[3]};
        objectArray[0] = new Es_1(stringArray);
        String[] stringArray2 = new String[]{strings5696f710d79436c0a6411ece0fff2016[5], strings5696f710d79436c0a6411ece0fff2016[6], strings5696f710d79436c0a6411ece0fff2016[7]};
        objectArray[1] = new Es_1(stringArray2);
        String[] stringArray3 = new String[]{strings5696f710d79436c0a6411ece0fff2016[9], strings5696f710d79436c0a6411ece0fff2016[10]};
        objectArray[2] = new Es_1(stringArray3);
        String[] stringArray4 = new String[]{strings5696f710d79436c0a6411ece0fff2016[12], strings5696f710d79436c0a6411ece0fff2016[13]};
        objectArray[3] = new Es_1(stringArray4);
        String[] stringArray5 = new String[]{strings5696f710d79436c0a6411ece0fff2016[15], strings5696f710d79436c0a6411ece0fff2016[16], strings5696f710d79436c0a6411ece0fff2016[17], strings5696f710d79436c0a6411ece0fff2016[18]};
        objectArray[4] = new Es_1(stringArray5);
        String[] stringArray6 = new String[]{strings5696f710d79436c0a6411ece0fff2016[20], strings5696f710d79436c0a6411ece0fff2016[21]};
        objectArray[5] = new Es_1(stringArray6);
        String[] stringArray7 = new String[]{strings5696f710d79436c0a6411ece0fff2016[23], strings5696f710d79436c0a6411ece0fff2016[24]};
        objectArray[6] = new Es_1(stringArray7);
        String[] stringArray8 = new String[]{strings5696f710d79436c0a6411ece0fff2016[26], strings5696f710d79436c0a6411ece0fff2016[27]};
        objectArray[7] = new Es_1(stringArray8);
        String[] stringArray9 = new String[]{strings5696f710d79436c0a6411ece0fff2016[29], strings5696f710d79436c0a6411ece0fff2016[30]};
        objectArray[8] = new Es_1(stringArray9);
        String[] stringArray10 = new String[]{strings5696f710d79436c0a6411ece0fff2016[32], strings5696f710d79436c0a6411ece0fff2016[33]};
        objectArray[9] = new Es_1(stringArray10);
        String[] stringArray11 = new String[]{strings5696f710d79436c0a6411ece0fff2016[35], strings5696f710d79436c0a6411ece0fff2016[36]};
        objectArray[10] = new Es_1(stringArray11);
        String[] stringArray12 = new String[]{strings5696f710d79436c0a6411ece0fff2016[38], strings5696f710d79436c0a6411ece0fff2016[39]};
        objectArray[11] = new Es_1(stringArray12);
        String[] stringArray13 = new String[]{strings5696f710d79436c0a6411ece0fff2016[41], strings5696f710d79436c0a6411ece0fff2016[42]};
        objectArray[12] = new Es_1(stringArray13);
        String[] stringArray14 = new String[]{strings5696f710d79436c0a6411ece0fff2016[44], strings5696f710d79436c0a6411ece0fff2016[45]};
        objectArray[13] = new Es_1(stringArray14);
        objectArray[14] = new Es_1[]{(Es_1)((Object)objectArray[0]), (Es_1)((Object)objectArray[1]), (Es_1)((Object)objectArray[2]), (Es_1)((Object)objectArray[3]), (Es_1)((Object)objectArray[4]), (Es_1)((Object)objectArray[5]), (Es_1)((Object)objectArray[6]), (Es_1)((Object)objectArray[7]), (Es_1)((Object)objectArray[8]), (Es_1)((Object)objectArray[9]), (Es_1)((Object)objectArray[10]), (Es_1)((Object)objectArray[11]), (Es_1)((Object)objectArray[12]), (Es_1)((Object)objectArray[13])};
        staticFields5696f710d79436c0a6411ece0fff2016 = objectArray;
    }

    private Es_1(String ... stringArray) {
        String[] stringArray2;
        this.id_case();
        this.fields5696f710d79436c0a6411ece0fff2016[Es_1.shorts5696f710d79436c0a6411ece0fff2016[1]] = stringArray2 = stringArray;
    }

    static {
        Es_1.ntfClinit();
    }

    public static Es_1[] values() {
        return (Es_1[])((Es_1[])staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[0]]).clone();
    }

    public static Es_1 valueOf(String string) {
        return Enum.valueOf(Es_1.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7A4BBE3011BBB21FL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFFE9474B;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{38, 4, 53, 90, 12, 63, -95, 31}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static String[] id_class() {
        HashSet<String> hashSet = new HashSet<String>();
        Es_1[] es_1Array = Es_1.values();
        int n = es_1Array.length;
        for (int i = booleans5696f710d79436c0a6411ece0fff2016[2]; i < n; ++i) {
            Es_1 es_1 = es_1Array[i];
            hashSet.addAll(Arrays.asList((String[])es_1.fields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[3]]));
        }
        return hashSet.toArray(new String[booleans5696f710d79436c0a6411ece0fff2016[3]]);
    }

    public static Es_1 id_break(String string) {
        Es_1[] es_1Array = Es_1.values();
        int n = es_1Array.length;
        for (int i = booleans5696f710d79436c0a6411ece0fff2016[0]; i < n; ++i) {
            Es_1 es_1 = es_1Array[i];
            String[] stringArray = (String[])es_1.fields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[2]];
            int n2 = stringArray.length;
            for (int j = booleans5696f710d79436c0a6411ece0fff2016[1]; j < n2; ++j) {
                String string2 = stringArray[j];
                if (!string2.equalsIgnoreCase(string)) continue;
                return es_1;
            }
        }
        return null;
    }

    private static /* synthetic */ Es_1[] id_break() {
        Es_1[] es_1Array = new Es_1[bytes5696f710d79436c0a6411ece0fff2016[0]];
        es_1Array[Es_1.booleans5696f710d79436c0a6411ece0fff2016[4]] = (Es_1)((Object)staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[4]]);
        es_1Array[Es_1.booleans5696f710d79436c0a6411ece0fff2016[5]] = (Es_1)((Object)staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[5]]);
        es_1Array[Es_1.bytes5696f710d79436c0a6411ece0fff2016[1]] = (Es_1)((Object)staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[6]]);
        es_1Array[Es_1.bytes5696f710d79436c0a6411ece0fff2016[2]] = (Es_1)((Object)staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[7]]);
        es_1Array[Es_1.bytes5696f710d79436c0a6411ece0fff2016[3]] = (Es_1)((Object)staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[8]]);
        es_1Array[Es_1.bytes5696f710d79436c0a6411ece0fff2016[4]] = (Es_1)((Object)staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[9]]);
        es_1Array[Es_1.bytes5696f710d79436c0a6411ece0fff2016[5]] = (Es_1)((Object)staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[10]]);
        es_1Array[Es_1.bytes5696f710d79436c0a6411ece0fff2016[6]] = (Es_1)((Object)staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[11]]);
        es_1Array[Es_1.bytes5696f710d79436c0a6411ece0fff2016[7]] = (Es_1)((Object)staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[12]]);
        es_1Array[Es_1.bytes5696f710d79436c0a6411ece0fff2016[8]] = (Es_1)((Object)staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[13]]);
        es_1Array[Es_1.bytes5696f710d79436c0a6411ece0fff2016[9]] = (Es_1)((Object)staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[14]]);
        es_1Array[Es_1.bytes5696f710d79436c0a6411ece0fff2016[10]] = (Es_1)((Object)staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[15]]);
        es_1Array[Es_1.bytes5696f710d79436c0a6411ece0fff2016[11]] = (Es_1)((Object)staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[16]]);
        es_1Array[Es_1.bytes5696f710d79436c0a6411ece0fff2016[12]] = (Es_1)((Object)staticFields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[17]]);
        return es_1Array;
    }

    private static void id_throws() {
        short[] sArray = new short[18];
        sArray[0] = 14;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        sArray[8] = 4;
        sArray[9] = 5;
        sArray[10] = 6;
        sArray[11] = 7;
        sArray[12] = 8;
        sArray[13] = 9;
        sArray[14] = 10;
        sArray[15] = 11;
        sArray[16] = 12;
        sArray[17] = 13;
        shorts5696f710d79436c0a6411ece0fff2016 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Es_1.id_private();
        Es_1.id_protected();
        Es_1.id_throws();
        Es_1.id_catch();
        Es_1.id_byte();
    }

    private static void id_catch() {
        bytes5696f710d79436c0a6411ece0fff2016 = new byte[]{14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 3, 2, 3, 2, 2, 2, 2, 3, 2, 3, 4, 4, 2, 3, 4, 5, 2, 5, 6, 2, 6, 7, 2, 7, 8, 2, 8, 9, 2, 9, 10, 2, 10, 11, 2, 11, 12, 2, 12, 13, 2, 13, 14, 15};
    }

    private void id_case() {
        if (this.fields5696f710d79436c0a6411ece0fff2016 == null) {
            Object[] objectArray = this.fields5696f710d79436c0a6411ece0fff2016 = new Object[booleans5696f710d79436c0a6411ece0fff2016[38]];
        }
    }

    private static void id_protected() {
        strings5696f710d79436c0a6411ece0fff2016 = new String[]{new String("POS1"), new String("pos1"), new String("p1"), new String("1"), new String("POS2"), new String("pos2"), new String("p2"), new String("2"), new String("CLEAR"), new String("clear"), new String("c"), new String("UNDO"), new String("undo"), new String("u"), new String("SET"), new String("set"), new String("fill"), new String("s"), new String("f"), new String("WALLS"), new String("walls"), new String("w"), new String("SHELL"), new String("shell"), new String("shl"), new String("CLEARAREA"), new String("cleararea"), new String("ca"), new String("REPLACE"), new String("replace"), new String("r"), new String("EXPAND"), new String("expand"), new String("ex"), new String("COPY"), new String("copy"), new String("cp"), new String("PASTE"), new String("paste"), new String("p"), new String("CONTRACT"), new String("contract"), new String("ct"), new String("SHIFT"), new String("shift"), new String("sh")};
    }

    private static void id_private() {
        boolean[] blArray = new boolean[39];
        blArray[5] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[23] = true;
        blArray[25] = true;
        blArray[27] = true;
        blArray[29] = true;
        blArray[31] = true;
        blArray[33] = true;
        blArray[35] = true;
        blArray[37] = true;
        blArray[38] = true;
        booleans5696f710d79436c0a6411ece0fff2016 = blArray;
    }
}

