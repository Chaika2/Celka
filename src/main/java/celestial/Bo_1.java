/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bo_1
extends Enum<Bo_1> {
    private static boolean[] booleansde151cace23f3e089965a701a59baa11;
    private static byte[] bytesde151cace23f3e089965a701a59baa11;
    public Object[] fieldsde151cace23f3e089965a701a59baa11;
    public static Object[] staticFieldsde151cace23f3e089965a701a59baa11;
    private static String[] stringsde151cace23f3e089965a701a59baa11;
    private static short[] shortsde151cace23f3e089965a701a59baa11;

    private void id_byte() {
        if (this.fieldsde151cace23f3e089965a701a59baa11 == null) {
            Object[] objectArray = this.fieldsde151cace23f3e089965a701a59baa11 = new Object[booleansde151cace23f3e089965a701a59baa11[7]];
        }
    }

    private Bo_1(String string2) {
        this.id_byte();
        String string3 = string2;
        this.fieldsde151cace23f3e089965a701a59baa11[Bo_1.shortsde151cace23f3e089965a701a59baa11[2]] = string3;
    }

    static {
        Bo_1.ntfClinit();
    }

    public static Bo_1[] values() {
        return (Bo_1[])((Bo_1[])staticFieldsde151cace23f3e089965a701a59baa11[shortsde151cace23f3e089965a701a59baa11[0]]).clone();
    }

    public static Bo_1 valueOf(String string) {
        return Enum.valueOf(Bo_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3289CF9B;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE724392A41227B24L;
    }

    public String id_class() {
        return (String)this.fieldsde151cace23f3e089965a701a59baa11[shortsde151cace23f3e089965a701a59baa11[1]];
    }

    public static Bo_1 id_class(String string) {
        Bo_1[] bo_1Array = Bo_1.values();
        int n = bo_1Array.length;
        for (int i = booleansde151cace23f3e089965a701a59baa11[0]; i < n; ++i) {
            Bo_1 bo_1 = bo_1Array[i];
            if (!string.toLowerCase().contains("\u0443\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430: " + bo_1.id_class().toLowerCase())) continue;
            return bo_1;
        }
        return null;
    }

    private static /* synthetic */ Bo_1[] id_break() {
        Bo_1[] bo_1Array = new Bo_1[bytesde151cace23f3e089965a701a59baa11[0]];
        bo_1Array[Bo_1.booleansde151cace23f3e089965a701a59baa11[1]] = (Bo_1)((Object)staticFieldsde151cace23f3e089965a701a59baa11[shortsde151cace23f3e089965a701a59baa11[3]]);
        bo_1Array[Bo_1.booleansde151cace23f3e089965a701a59baa11[2]] = (Bo_1)((Object)staticFieldsde151cace23f3e089965a701a59baa11[shortsde151cace23f3e089965a701a59baa11[4]]);
        bo_1Array[Bo_1.bytesde151cace23f3e089965a701a59baa11[1]] = (Bo_1)((Object)staticFieldsde151cace23f3e089965a701a59baa11[shortsde151cace23f3e089965a701a59baa11[5]]);
        bo_1Array[Bo_1.bytesde151cace23f3e089965a701a59baa11[2]] = (Bo_1)((Object)staticFieldsde151cace23f3e089965a701a59baa11[shortsde151cace23f3e089965a701a59baa11[6]]);
        bo_1Array[Bo_1.bytesde151cace23f3e089965a701a59baa11[3]] = (Bo_1)((Object)staticFieldsde151cace23f3e089965a701a59baa11[shortsde151cace23f3e089965a701a59baa11[7]]);
        return bo_1Array;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{98, -30, 29, 68, 114, 57, -52, 81}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        short[] sArray = new short[8];
        sArray[0] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        shortsde151cace23f3e089965a701a59baa11 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Bo_1.id_protected();
        Bo_1.id_catch();
        Bo_1.id_throws();
        Bo_1.id_case();
        Bo_1.id_private();
    }

    private static void id_catch() {
        stringsde151cace23f3e089965a701a59baa11 = new String[]{new String("LEGENDARY"), new String("\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u044b\u0439"), new String("ELITE"), new String("\u042d\u043b\u0438\u0442\u043d\u044b\u0439"), new String("RICH"), new String("\u0411\u043e\u0433\u0430\u0442\u044b\u0439"), new String("SOLID"), new String("\u0421\u043e\u043b\u0438\u0434\u043d\u044b\u0439"), new String("COMMON"), new String("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")};
    }

    private static void id_case() {
        bytesde151cace23f3e089965a701a59baa11 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleansde151cace23f3e089965a701a59baa11 = blArray;
    }

    private static void id_private() {
        Object[] objectArray;
        objectArray = new Object[]{new Bo_1(stringsde151cace23f3e089965a701a59baa11[1]), new Bo_1(stringsde151cace23f3e089965a701a59baa11[3]), new Bo_1(stringsde151cace23f3e089965a701a59baa11[5]), new Bo_1(stringsde151cace23f3e089965a701a59baa11[7]), new Bo_1(stringsde151cace23f3e089965a701a59baa11[9]), new Bo_1[]{(Bo_1)((Object)objectArray[0]), (Bo_1)((Object)objectArray[1]), (Bo_1)((Object)objectArray[2]), (Bo_1)((Object)objectArray[3]), (Bo_1)((Object)objectArray[4])}};
        staticFieldsde151cace23f3e089965a701a59baa11 = objectArray;
    }
}

