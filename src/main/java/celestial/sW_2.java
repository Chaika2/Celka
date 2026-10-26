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

public class sW_2
extends Enum<sW_2> {
    private static String[] strings6b259e9d4f13397ca074ec4185749984;
    public static Object[] staticFields6b259e9d4f13397ca074ec4185749984;
    private static byte[] bytes6b259e9d4f13397ca074ec4185749984;
    private static boolean[] booleans6b259e9d4f13397ca074ec4185749984;
    public Object[] fields6b259e9d4f13397ca074ec4185749984;
    private static short[] shorts6b259e9d4f13397ca074ec4185749984;

    private static void id_byte() {
        strings6b259e9d4f13397ca074ec4185749984 = new String[]{new String("POS1"), new String("pos1"), new String("p1"), new String("POS2"), new String("pos2"), new String("p2"), new String("SELECTION"), new String("sel"), new String("selection"), new String("SAVE"), new String("save"), new String("REMOVE"), new String("remove"), new String("delete")};
    }

    private sW_2(String ... stringArray) {
        String[] stringArray2;
        this.id_throws();
        this.fields6b259e9d4f13397ca074ec4185749984[sW_2.shorts6b259e9d4f13397ca074ec4185749984[1]] = stringArray2 = stringArray;
    }

    static {
        sW_2.ntfClinit();
    }

    public static sW_2[] values() {
        return (sW_2[])((sW_2[])staticFields6b259e9d4f13397ca074ec4185749984[shorts6b259e9d4f13397ca074ec4185749984[0]]).clone();
    }

    public static sW_2 valueOf(String string) {
        return Enum.valueOf(sW_2.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB53269A7;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x39E02E4ED4DF3681L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-77, -18, 119, 71, -81, -116, -105, -90}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static String[] id_class() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        sW_2[] sW_2Array = sW_2.values();
        int n = sW_2Array.length;
        for (int i = booleans6b259e9d4f13397ca074ec4185749984[2]; i < n; ++i) {
            sW_2 sW_22 = sW_2Array[i];
            linkedHashSet.add(((String[])sW_22.fields6b259e9d4f13397ca074ec4185749984[shorts6b259e9d4f13397ca074ec4185749984[3]])[booleans6b259e9d4f13397ca074ec4185749984[3]]);
        }
        return linkedHashSet.toArray(new String[booleans6b259e9d4f13397ca074ec4185749984[4]]);
    }

    public static sW_2 id_break(String string) {
        sW_2[] sW_2Array = sW_2.values();
        int n = sW_2Array.length;
        for (int i = booleans6b259e9d4f13397ca074ec4185749984[0]; i < n; ++i) {
            sW_2 sW_22 = sW_2Array[i];
            String[] stringArray = (String[])sW_22.fields6b259e9d4f13397ca074ec4185749984[shorts6b259e9d4f13397ca074ec4185749984[2]];
            int n2 = stringArray.length;
            for (int j = booleans6b259e9d4f13397ca074ec4185749984[1]; j < n2; ++j) {
                String string2 = stringArray[j];
                if (!string2.equalsIgnoreCase(string)) continue;
                return sW_22;
            }
        }
        return null;
    }

    private static /* synthetic */ sW_2[] id_break() {
        sW_2[] sW_2Array = new sW_2[bytes6b259e9d4f13397ca074ec4185749984[0]];
        sW_2Array[sW_2.booleans6b259e9d4f13397ca074ec4185749984[5]] = (sW_2)((Object)staticFields6b259e9d4f13397ca074ec4185749984[shorts6b259e9d4f13397ca074ec4185749984[4]]);
        sW_2Array[sW_2.booleans6b259e9d4f13397ca074ec4185749984[6]] = (sW_2)((Object)staticFields6b259e9d4f13397ca074ec4185749984[shorts6b259e9d4f13397ca074ec4185749984[5]]);
        sW_2Array[sW_2.bytes6b259e9d4f13397ca074ec4185749984[1]] = (sW_2)((Object)staticFields6b259e9d4f13397ca074ec4185749984[shorts6b259e9d4f13397ca074ec4185749984[6]]);
        sW_2Array[sW_2.bytes6b259e9d4f13397ca074ec4185749984[2]] = (sW_2)((Object)staticFields6b259e9d4f13397ca074ec4185749984[shorts6b259e9d4f13397ca074ec4185749984[7]]);
        sW_2Array[sW_2.bytes6b259e9d4f13397ca074ec4185749984[3]] = (sW_2)((Object)staticFields6b259e9d4f13397ca074ec4185749984[shorts6b259e9d4f13397ca074ec4185749984[8]]);
        return sW_2Array;
    }

    private void id_throws() {
        if (this.fields6b259e9d4f13397ca074ec4185749984 == null) {
            Object[] objectArray = this.fields6b259e9d4f13397ca074ec4185749984 = new Object[booleans6b259e9d4f13397ca074ec4185749984[21]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        sW_2.id_catch();
        sW_2.id_byte();
        sW_2.id_case();
        sW_2.id_protected();
        sW_2.id_private();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[22];
        blArray[6] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[20] = true;
        blArray[21] = true;
        booleans6b259e9d4f13397ca074ec4185749984 = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[9];
        sArray[0] = 5;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        sArray[8] = 4;
        shorts6b259e9d4f13397ca074ec4185749984 = sArray;
    }

    private static void id_protected() {
        bytes6b259e9d4f13397ca074ec4185749984 = new byte[]{5, 2, 3, 4, 2, 2, 2, 2, 2, 3, 3, 4, 2, 4, 5, 6};
    }

    private static void id_private() {
        Object[] objectArray = new Object[6];
        String[] stringArray = new String[]{strings6b259e9d4f13397ca074ec4185749984[1], strings6b259e9d4f13397ca074ec4185749984[2]};
        objectArray[0] = new sW_2(stringArray);
        String[] stringArray2 = new String[]{strings6b259e9d4f13397ca074ec4185749984[4], strings6b259e9d4f13397ca074ec4185749984[5]};
        objectArray[1] = new sW_2(stringArray2);
        String[] stringArray3 = new String[]{strings6b259e9d4f13397ca074ec4185749984[7], strings6b259e9d4f13397ca074ec4185749984[8]};
        objectArray[2] = new sW_2(stringArray3);
        String[] stringArray4 = new String[]{strings6b259e9d4f13397ca074ec4185749984[10]};
        objectArray[3] = new sW_2(stringArray4);
        String[] stringArray5 = new String[]{strings6b259e9d4f13397ca074ec4185749984[12], strings6b259e9d4f13397ca074ec4185749984[13]};
        objectArray[4] = new sW_2(stringArray5);
        objectArray[5] = new sW_2[]{(sW_2)((Object)objectArray[0]), (sW_2)((Object)objectArray[1]), (sW_2)((Object)objectArray[2]), (sW_2)((Object)objectArray[3]), (sW_2)((Object)objectArray[4])};
        staticFields6b259e9d4f13397ca074ec4185749984 = objectArray;
    }
}

