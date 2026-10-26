/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aw_1;
import celestial.rnB_2;
import celestial.rrqM_2;
import celestial.rrqX_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqB_2
extends Enum<rrqB_2>
implements MinecraftAccessor {
    private static byte[] bytesf6ef226fb34a300d9c0c9540d4f17aea;
    private static short[] shortsf6ef226fb34a300d9c0c9540d4f17aea;
    public static Object[] staticFieldsf6ef226fb34a300d9c0c9540d4f17aea;
    public Object[] fieldsf6ef226fb34a300d9c0c9540d4f17aea;
    private static String[] stringsf6ef226fb34a300d9c0c9540d4f17aea;
    private static boolean[] booleansf6ef226fb34a300d9c0c9540d4f17aea;

    private static void id_byte() {
        stringsf6ef226fb34a300d9c0c9540d4f17aea = new String[]{new String(" "), new String("d."), new String("-"), new String("OWNER"), new String("owner"), new String("\u0441\u043e\u0437\u0434\u0430\u0442\u0435\u043b\u044c"), new String("\u043e\u0441\u043d\u043e\u0432\u0430\u0442\u0435\u043b\u044c"), new String("\u0432\u043b\u0430\u0434\u0435\u043b\u0435\u0446"), new String("DEVELOPER"), new String("developer"), new String("\u0440\u0430\u0437\u0440\u0430\u0431\u043e\u0442\u0447\u0438\u043a"), new String("ADMIN"), new String("staff"), new String("admin"), new String("administrator"), new String("\u0430\u0434\u043c\u0438\u043d"), new String("\u0430\u0434\u043c\u0438\u043d\u0438\u0441\u0442\u0440\u0430\u0442\u043e\u0440"), new String("\u0437.\u0430\u0434\u043c"), new String("MODER"), new String("moder"), new String("moderator"), new String("\u043c\u043e\u0434\u0435\u0440\u0430\u0442\u043e\u0440"), new String("YOUTUBE"), new String("yt"), new String("youtube"), new String("\u044e\u0442\u0443\u0431\u0435\u0440"), new String("HELPER"), new String("helper"), new String("\u0445\u0435\u043b\u043f\u0435\u0440"), new String("CURATOR"), new String("curator"), new String("\u043a\u0443\u0440\u0430\u0442\u043e\u0440"), new String("AGENT"), new String("\u0430\u0433\u0435\u043d\u0442"), new String("SUPPORT"), new String("support"), new String("\u0441\u0430\u043f\u043f\u043e\u0440\u0442"), new String("\u043f\u043e\u0434\u0434\u0435\u0440\u0436\u043a\u0430"), new String("\u0441\u043e\u0442\u0440\u0443\u0434\u043d\u0438\u043a"), new String("TRAINEE"), new String("trainee"), new String("\u0441\u0442\u0430\u0436\u0451\u0440"), new String("\u0441\u0442\u0430\u0436\u0435\u0440"), new String("\u0441\u0442\u1d00\u0436\u1d07\u0440"), new String("UNIQUE"), new String("unique")};
    }

    private rrqB_2(String ... stringArray) {
        String[] stringArray2;
        this.id_implements();
        this.fieldsf6ef226fb34a300d9c0c9540d4f17aea[rrqB_2.shortsf6ef226fb34a300d9c0c9540d4f17aea[1]] = stringArray2 = stringArray;
    }

    static {
        rrqB_2.ntfClinit();
    }

    public static rrqB_2[] values() {
        return (rrqB_2[])((rrqB_2[])staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[0]]).clone();
    }

    public static rrqB_2 valueOf(String string) {
        return Enum.valueOf(rrqB_2.class, string);
    }

    public static rrqB_2 id_class(Aw_1 aw_1, String string, String string2) {
        if (string.equalsIgnoreCase(id_import.id_while().id_byte().toLowerCase())) {
            return null;
        }
        for (String object2 : ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[shortsf6ef226fb34a300d9c0c9540d4f17aea[2]]).id_byte()) {
            if (!string.equalsIgnoreCase(object2.toLowerCase())) continue;
            return (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[3]];
        }
        String string3 = string2.toLowerCase();
        for (String string4 : ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[shortsf6ef226fb34a300d9c0c9540d4f17aea[4]]).id_byte()) {
            if (!string3.contains(string4.toLowerCase())) continue;
            return (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[5]];
        }
        String[] stringArray = string3.split(stringsf6ef226fb34a300d9c0c9540d4f17aea[0]);
        if (stringArray.length < booleansf6ef226fb34a300d9c0c9540d4f17aea[0]) {
            return null;
        }
        rrqB_2[] rrqB_2Array = (rrqB_2[])staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[6]];
        int n = rrqB_2Array.length;
        for (int i = booleansf6ef226fb34a300d9c0c9540d4f17aea[1]; i < n; ++i) {
            rrqB_2 rrqB_22 = rrqB_2Array[i];
            if (rrqB_22 == (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[7]]) continue;
            String[] stringArray2 = rrqB_22.id_break();
            int n2 = stringArray2.length;
            for (int j = booleansf6ef226fb34a300d9c0c9540d4f17aea[2]; j < n2; ++j) {
                String string5 = stringArray2[j];
                String[] stringArray3 = stringArray;
                int n3 = stringArray3.length;
                for (int k = booleansf6ef226fb34a300d9c0c9540d4f17aea[3]; k < n3; ++k) {
                    String string6 = stringArray3[k];
                    if (!string6.contains(string5) || rrqB_22 == (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[8]] && string6.startsWith(stringsf6ef226fb34a300d9c0c9540d4f17aea[1])) continue;
                    rnB_2 rnB_22 = aw_1.id_implements();
                    if (rnB_22 == null) {
                        return null;
                    }
                    String string7 = rnB_22.id_class();
                    if (string7.contains(stringsf6ef226fb34a300d9c0c9540d4f17aea[2])) continue;
                    return rrqB_22;
                }
            }
        }
        return null;
    }

    public static int id_class(rrqB_2 rrqB_22) {
        return rrqB_22.ordinal();
    }

    public boolean id_class() {
        return this == (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[9]] || this == (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[10]] || this == (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[11]] || this == (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[12]] || this == (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[13]] || this == (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[14]] ? booleansf6ef226fb34a300d9c0c9540d4f17aea[4] : booleansf6ef226fb34a300d9c0c9540d4f17aea[5];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x430656A2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x414720ABC17F8A59L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-111, 37, 86, 64, 14, -25, 52, 108}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String[] id_break() {
        return (String[])this.fieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[15]];
    }

    private static void id_throws() {
        short[] sArray = new short[27];
        sArray[0] = 12;
        sArray[3] = 10;
        sArray[5] = 10;
        sArray[6] = 11;
        sArray[7] = 10;
        sArray[8] = 5;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 3;
        sArray[13] = 6;
        sArray[14] = 10;
        sArray[17] = 1;
        sArray[18] = 2;
        sArray[19] = 3;
        sArray[20] = 4;
        sArray[21] = 5;
        sArray[22] = 6;
        sArray[23] = 7;
        sArray[24] = 8;
        sArray[25] = 9;
        sArray[26] = 10;
        shortsf6ef226fb34a300d9c0c9540d4f17aea = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrqB_2.id_catch();
        rrqB_2.id_byte();
        rrqB_2.id_throws();
        rrqB_2.id_private();
        rrqB_2.id_case();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[35];
        blArray[0] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[23] = true;
        blArray[25] = true;
        blArray[26] = true;
        blArray[29] = true;
        blArray[31] = true;
        blArray[32] = true;
        blArray[34] = true;
        booleansf6ef226fb34a300d9c0c9540d4f17aea = blArray;
    }

    private static void id_case() {
        Object[] objectArray = new Object[13];
        String[] stringArray = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[4], stringsf6ef226fb34a300d9c0c9540d4f17aea[5], stringsf6ef226fb34a300d9c0c9540d4f17aea[6], stringsf6ef226fb34a300d9c0c9540d4f17aea[7]};
        objectArray[0] = new rrqB_2(stringArray);
        String[] stringArray2 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[9], stringsf6ef226fb34a300d9c0c9540d4f17aea[10]};
        objectArray[1] = new rrqB_2(stringArray2);
        String[] stringArray3 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[12], stringsf6ef226fb34a300d9c0c9540d4f17aea[13], stringsf6ef226fb34a300d9c0c9540d4f17aea[14], stringsf6ef226fb34a300d9c0c9540d4f17aea[15], stringsf6ef226fb34a300d9c0c9540d4f17aea[16], stringsf6ef226fb34a300d9c0c9540d4f17aea[17]};
        objectArray[2] = new rrqB_2(stringArray3);
        String[] stringArray4 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[19], stringsf6ef226fb34a300d9c0c9540d4f17aea[20], stringsf6ef226fb34a300d9c0c9540d4f17aea[21]};
        objectArray[3] = new rrqB_2(stringArray4);
        String[] stringArray5 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[23], stringsf6ef226fb34a300d9c0c9540d4f17aea[24], stringsf6ef226fb34a300d9c0c9540d4f17aea[25]};
        objectArray[4] = new rrqB_2(stringArray5);
        String[] stringArray6 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[27], stringsf6ef226fb34a300d9c0c9540d4f17aea[28]};
        objectArray[5] = new rrqB_2(stringArray6);
        String[] stringArray7 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[30], stringsf6ef226fb34a300d9c0c9540d4f17aea[31]};
        objectArray[6] = new rrqB_2(stringArray7);
        String[] stringArray8 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[33]};
        objectArray[7] = new rrqB_2(stringArray8);
        String[] stringArray9 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[35], stringsf6ef226fb34a300d9c0c9540d4f17aea[36], stringsf6ef226fb34a300d9c0c9540d4f17aea[37], stringsf6ef226fb34a300d9c0c9540d4f17aea[38]};
        objectArray[8] = new rrqB_2(stringArray9);
        String[] stringArray10 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[40], stringsf6ef226fb34a300d9c0c9540d4f17aea[41], stringsf6ef226fb34a300d9c0c9540d4f17aea[42], stringsf6ef226fb34a300d9c0c9540d4f17aea[43]};
        objectArray[9] = new rrqB_2(stringArray10);
        String[] stringArray11 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[45]};
        objectArray[10] = new rrqB_2(stringArray11);
        objectArray[11] = new rrqB_2[]{(rrqB_2)objectArray[0], (rrqB_2)objectArray[1], (rrqB_2)objectArray[2], (rrqB_2)objectArray[3], (rrqB_2)objectArray[4], (rrqB_2)objectArray[5], (rrqB_2)objectArray[6], (rrqB_2)objectArray[7], (rrqB_2)objectArray[8], (rrqB_2)objectArray[9], (rrqB_2)objectArray[10]};
        objectArray[12] = new rrqB_2[]{(rrqB_2)objectArray[0], (rrqB_2)objectArray[1], (rrqB_2)objectArray[2], (rrqB_2)objectArray[3], (rrqB_2)objectArray[4], (rrqB_2)objectArray[5], (rrqB_2)objectArray[6], (rrqB_2)objectArray[7], (rrqB_2)objectArray[8], (rrqB_2)objectArray[9], (rrqB_2)objectArray[10]};
        staticFieldsf6ef226fb34a300d9c0c9540d4f17aea = objectArray;
    }

    private void id_implements() {
        if (this.fieldsf6ef226fb34a300d9c0c9540d4f17aea == null) {
            this.fieldsf6ef226fb34a300d9c0c9540d4f17aea = new Object[1];
        }
    }

    private static /* synthetic */ rrqB_2[] id_protected() {
        rrqB_2[] rrqB_2Array = new rrqB_2[bytesf6ef226fb34a300d9c0c9540d4f17aea[0]];
        rrqB_2Array[rrqB_2.booleansf6ef226fb34a300d9c0c9540d4f17aea[6]] = (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[16]];
        rrqB_2Array[rrqB_2.booleansf6ef226fb34a300d9c0c9540d4f17aea[7]] = (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[17]];
        rrqB_2Array[rrqB_2.bytesf6ef226fb34a300d9c0c9540d4f17aea[1]] = (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[18]];
        rrqB_2Array[rrqB_2.bytesf6ef226fb34a300d9c0c9540d4f17aea[2]] = (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[19]];
        rrqB_2Array[rrqB_2.bytesf6ef226fb34a300d9c0c9540d4f17aea[3]] = (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[20]];
        rrqB_2Array[rrqB_2.bytesf6ef226fb34a300d9c0c9540d4f17aea[4]] = (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[21]];
        rrqB_2Array[rrqB_2.bytesf6ef226fb34a300d9c0c9540d4f17aea[5]] = (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[22]];
        rrqB_2Array[rrqB_2.bytesf6ef226fb34a300d9c0c9540d4f17aea[6]] = (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[23]];
        rrqB_2Array[rrqB_2.bytesf6ef226fb34a300d9c0c9540d4f17aea[7]] = (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[24]];
        rrqB_2Array[rrqB_2.bytesf6ef226fb34a300d9c0c9540d4f17aea[8]] = (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[25]];
        rrqB_2Array[rrqB_2.bytesf6ef226fb34a300d9c0c9540d4f17aea[9]] = (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[26]];
        return rrqB_2Array;
    }

    private static void id_private() {
        bytesf6ef226fb34a300d9c0c9540d4f17aea = new byte[]{11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4, 2, 3, 2, 2, 6, 2, 3, 4, 5, 2, 3, 3, 2, 3, 4, 3, 2, 4, 5, 2, 5, 6, 2, 6, 7, 7, 8, 4, 2, 3, 8, 9, 4, 2, 3, 9, 10, 10, 12, 11, 13};
    }
}

