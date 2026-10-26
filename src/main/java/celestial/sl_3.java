/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.LinkedHashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sl_3
extends Enum<sl_3> {
    private static boolean[] booleans30c4eacb1e233b1abdfca916ea51d438;
    private static short[] shorts30c4eacb1e233b1abdfca916ea51d438;
    private static String[] strings30c4eacb1e233b1abdfca916ea51d438;
    public Object[] fields30c4eacb1e233b1abdfca916ea51d438;
    private static byte[] bytes30c4eacb1e233b1abdfca916ea51d438;
    public static Object[] staticFields30c4eacb1e233b1abdfca916ea51d438;

    private static /* synthetic */ sl_3[] id_byte() {
        sl_3[] sl_3Array = new sl_3[bytes30c4eacb1e233b1abdfca916ea51d438[0]];
        sl_3Array[sl_3.booleans30c4eacb1e233b1abdfca916ea51d438[5]] = (sl_3)((Object)staticFields30c4eacb1e233b1abdfca916ea51d438[shorts30c4eacb1e233b1abdfca916ea51d438[4]]);
        sl_3Array[sl_3.booleans30c4eacb1e233b1abdfca916ea51d438[6]] = (sl_3)((Object)staticFields30c4eacb1e233b1abdfca916ea51d438[shorts30c4eacb1e233b1abdfca916ea51d438[5]]);
        sl_3Array[sl_3.bytes30c4eacb1e233b1abdfca916ea51d438[1]] = (sl_3)((Object)staticFields30c4eacb1e233b1abdfca916ea51d438[shorts30c4eacb1e233b1abdfca916ea51d438[6]]);
        return sl_3Array;
    }

    private sl_3(String ... stringArray) {
        String[] stringArray2;
        this.id_catch();
        this.fields30c4eacb1e233b1abdfca916ea51d438[sl_3.shorts30c4eacb1e233b1abdfca916ea51d438[1]] = stringArray2 = stringArray;
    }

    static {
        sl_3.ntfClinit();
    }

    public static sl_3[] values() {
        return (sl_3[])((sl_3[])staticFields30c4eacb1e233b1abdfca916ea51d438[shorts30c4eacb1e233b1abdfca916ea51d438[0]]).clone();
    }

    public static sl_3 valueOf(String string) {
        return Enum.valueOf(sl_3.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2F5B3736147C26EDL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x38FB9CAC;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-102, -128, -54, -128, -7, 0, -76, 8}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static String[] id_class() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        sl_3[] sl_3Array = sl_3.values();
        int n = sl_3Array.length;
        for (int i = booleans30c4eacb1e233b1abdfca916ea51d438[2]; i < n; ++i) {
            sl_3 sl_32 = sl_3Array[i];
            linkedHashSet.add(((String[])sl_32.fields30c4eacb1e233b1abdfca916ea51d438[shorts30c4eacb1e233b1abdfca916ea51d438[3]])[booleans30c4eacb1e233b1abdfca916ea51d438[3]]);
        }
        return linkedHashSet.toArray(new String[booleans30c4eacb1e233b1abdfca916ea51d438[4]]);
    }

    public static sl_3 id_break(String string) {
        sl_3[] sl_3Array = sl_3.values();
        int n = sl_3Array.length;
        for (int i = booleans30c4eacb1e233b1abdfca916ea51d438[0]; i < n; ++i) {
            sl_3 sl_32 = sl_3Array[i];
            String[] stringArray = (String[])sl_32.fields30c4eacb1e233b1abdfca916ea51d438[shorts30c4eacb1e233b1abdfca916ea51d438[2]];
            int n2 = stringArray.length;
            for (int j = booleans30c4eacb1e233b1abdfca916ea51d438[1]; j < n2; ++j) {
                String string2 = stringArray[j];
                if (!string2.equalsIgnoreCase(string)) continue;
                return sl_32;
            }
        }
        return null;
    }

    private static void id_break() {
        bytes30c4eacb1e233b1abdfca916ea51d438 = new byte[]{3, 2, 2, 2, 2, 2, 2, 3, 4};
    }

    private static void id_throws() {
        strings30c4eacb1e233b1abdfca916ea51d438 = new String[]{new String("POS1"), new String("pos1"), new String("p1"), new String("POS2"), new String("pos2"), new String("p2"), new String("SELECTION"), new String("sel"), new String("selection")};
    }

    private static /* synthetic */ void ntfClinit() {
        sl_3.id_case();
        sl_3.id_throws();
        sl_3.id_private();
        sl_3.id_break();
        sl_3.id_protected();
    }

    private void id_catch() {
        if (this.fields30c4eacb1e233b1abdfca916ea51d438 == null) {
            Object[] objectArray = this.fields30c4eacb1e233b1abdfca916ea51d438 = new Object[booleans30c4eacb1e233b1abdfca916ea51d438[17]];
        }
    }

    private static void id_case() {
        boolean[] blArray = new boolean[18];
        blArray[6] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[17] = true;
        booleans30c4eacb1e233b1abdfca916ea51d438 = blArray;
    }

    private static void id_protected() {
        Object[] objectArray = new Object[4];
        String[] stringArray = new String[]{strings30c4eacb1e233b1abdfca916ea51d438[1], strings30c4eacb1e233b1abdfca916ea51d438[2]};
        objectArray[0] = new sl_3(stringArray);
        String[] stringArray2 = new String[]{strings30c4eacb1e233b1abdfca916ea51d438[4], strings30c4eacb1e233b1abdfca916ea51d438[5]};
        objectArray[1] = new sl_3(stringArray2);
        String[] stringArray3 = new String[]{strings30c4eacb1e233b1abdfca916ea51d438[7], strings30c4eacb1e233b1abdfca916ea51d438[8]};
        objectArray[2] = new sl_3(stringArray3);
        objectArray[3] = new sl_3[]{(sl_3)((Object)objectArray[0]), (sl_3)((Object)objectArray[1]), (sl_3)((Object)objectArray[2])};
        staticFields30c4eacb1e233b1abdfca916ea51d438 = objectArray;
    }

    private static void id_private() {
        short[] sArray = new short[7];
        sArray[0] = 3;
        sArray[5] = 1;
        sArray[6] = 2;
        shorts30c4eacb1e233b1abdfca916ea51d438 = sArray;
    }
}

