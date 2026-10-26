/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_else
extends Enum<C_else> {
    private static short[] shortsbc7116b836d43454b9c0677570bd159e;
    public static Object[] staticFieldsbc7116b836d43454b9c0677570bd159e;
    private static byte[] bytesbc7116b836d43454b9c0677570bd159e;
    private static String[] stringsbc7116b836d43454b9c0677570bd159e;
    private static boolean[] booleansbc7116b836d43454b9c0677570bd159e;
    public Object[] fieldsbc7116b836d43454b9c0677570bd159e;

    private void id_byte() {
        if (this.fieldsbc7116b836d43454b9c0677570bd159e == null) {
            Object[] objectArray = this.fieldsbc7116b836d43454b9c0677570bd159e = new Object[booleansbc7116b836d43454b9c0677570bd159e[19]];
        }
    }

    private C_else(String ... stringArray) {
        String[] stringArray2;
        this.id_byte();
        this.fieldsbc7116b836d43454b9c0677570bd159e[C_else.shortsbc7116b836d43454b9c0677570bd159e[1]] = stringArray2 = stringArray;
    }

    static {
        C_else.ntfClinit();
    }

    public static C_else[] values() {
        return (C_else[])((C_else[])staticFieldsbc7116b836d43454b9c0677570bd159e[shortsbc7116b836d43454b9c0677570bd159e[0]]).clone();
    }

    public static C_else valueOf(String string) {
        return Enum.valueOf(C_else.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8B9C694F1AD681L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x20F5A23D;
    }

    public static C_else id_class(String string) {
        C_else[] c_elseArray = C_else.values();
        int n = c_elseArray.length;
        for (int i = booleansbc7116b836d43454b9c0677570bd159e[1]; i < n; ++i) {
            C_else c_else = c_elseArray[i];
            String[] stringArray = (String[])c_else.fieldsbc7116b836d43454b9c0677570bd159e[shortsbc7116b836d43454b9c0677570bd159e[3]];
            int n2 = stringArray.length;
            for (int j = booleansbc7116b836d43454b9c0677570bd159e[2]; j < n2; ++j) {
                String string2 = stringArray[j];
                if (!string2.equalsIgnoreCase(string)) continue;
                return c_else;
            }
        }
        return null;
    }

    public String id_class() {
        return ((String[])this.fieldsbc7116b836d43454b9c0677570bd159e[shortsbc7116b836d43454b9c0677570bd159e[2]])[booleansbc7116b836d43454b9c0677570bd159e[0]];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-40, 4, -19, 73, 9, 106, 0, -54}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static String[] id_break() {
        HashSet<String> hashSet = new HashSet<String>();
        C_else[] c_elseArray = C_else.values();
        int n = c_elseArray.length;
        for (int i = booleansbc7116b836d43454b9c0677570bd159e[3]; i < n; ++i) {
            C_else c_else = c_elseArray[i];
            hashSet.addAll(Arrays.asList((String[])c_else.fieldsbc7116b836d43454b9c0677570bd159e[shortsbc7116b836d43454b9c0677570bd159e[4]]));
        }
        return hashSet.toArray(new String[booleansbc7116b836d43454b9c0677570bd159e[4]]);
    }

    private static /* synthetic */ C_else[] id_throws() {
        C_else[] c_elseArray = new C_else[bytesbc7116b836d43454b9c0677570bd159e[0]];
        c_elseArray[C_else.booleansbc7116b836d43454b9c0677570bd159e[5]] = (C_else)((Object)staticFieldsbc7116b836d43454b9c0677570bd159e[shortsbc7116b836d43454b9c0677570bd159e[5]]);
        c_elseArray[C_else.booleansbc7116b836d43454b9c0677570bd159e[6]] = (C_else)((Object)staticFieldsbc7116b836d43454b9c0677570bd159e[shortsbc7116b836d43454b9c0677570bd159e[6]]);
        c_elseArray[C_else.bytesbc7116b836d43454b9c0677570bd159e[1]] = (C_else)((Object)staticFieldsbc7116b836d43454b9c0677570bd159e[shortsbc7116b836d43454b9c0677570bd159e[7]]);
        c_elseArray[C_else.bytesbc7116b836d43454b9c0677570bd159e[2]] = (C_else)((Object)staticFieldsbc7116b836d43454b9c0677570bd159e[shortsbc7116b836d43454b9c0677570bd159e[8]]);
        return c_elseArray;
    }

    private static /* synthetic */ void ntfClinit() {
        C_else.id_protected();
        C_else.id_private();
        C_else.id_implements();
        C_else.id_case();
        C_else.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[6];
        String[] stringArray = new String[]{stringsbc7116b836d43454b9c0677570bd159e[1], stringsbc7116b836d43454b9c0677570bd159e[2]};
        objectArray[0] = new C_else(stringArray);
        String[] stringArray2 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[4]};
        objectArray[1] = new C_else(stringArray2);
        String[] stringArray3 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[6], stringsbc7116b836d43454b9c0677570bd159e[7]};
        objectArray[2] = new C_else(stringArray3);
        String[] stringArray4 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[9]};
        objectArray[3] = new C_else(stringArray4);
        C_else[] c_elseArray = new C_else[4];
        String[] stringArray5 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[1], stringsbc7116b836d43454b9c0677570bd159e[2]};
        c_elseArray[0] = new C_else(stringArray5);
        String[] stringArray6 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[4]};
        c_elseArray[1] = new C_else(stringArray6);
        String[] stringArray7 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[6], stringsbc7116b836d43454b9c0677570bd159e[7]};
        c_elseArray[2] = new C_else(stringArray7);
        String[] stringArray8 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[9]};
        c_elseArray[3] = new C_else(stringArray8);
        objectArray[4] = Collections.unmodifiableList(Arrays.asList((Object[])c_elseArray));
        objectArray[5] = new C_else[]{(C_else)((Object)objectArray[0]), (C_else)((Object)objectArray[1]), (C_else)((Object)objectArray[2]), (C_else)((Object)objectArray[3])};
        staticFieldsbc7116b836d43454b9c0677570bd159e = objectArray;
    }

    private static void id_case() {
        bytesbc7116b836d43454b9c0677570bd159e = new byte[]{4, 2, 3, 2, 2, 2, 2, 3, 3, 5, 4, 6};
    }

    private static void id_implements() {
        short[] sArray = new short[9];
        sArray[0] = 5;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 3;
        shortsbc7116b836d43454b9c0677570bd159e = sArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[20];
        blArray[6] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[19] = true;
        booleansbc7116b836d43454b9c0677570bd159e = blArray;
    }

    private static void id_private() {
        stringsbc7116b836d43454b9c0677570bd159e = new String[]{new String("HOME"), new String("home"), new String("base"), new String("DEATH"), new String("death"), new String("BED"), new String("bed"), new String("spawn"), new String("USER"), new String("user")};
    }
}

