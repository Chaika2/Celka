/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SB
extends Enum<SB> {
    private static short[] shortsf97e83773d1d3413a5d252db949e1945;
    public Object[] fieldsf97e83773d1d3413a5d252db949e1945;
    private static boolean[] booleansf97e83773d1d3413a5d252db949e1945;
    private static String[] stringsf97e83773d1d3413a5d252db949e1945;
    private static byte[] bytesf97e83773d1d3413a5d252db949e1945;
    public static Object[] staticFieldsf97e83773d1d3413a5d252db949e1945;

    private static void id_byte() {
        bytesf97e83773d1d3413a5d252db949e1945 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    private SB(String string2) {
        this.id_private();
        String string3 = string2;
        this.fieldsf97e83773d1d3413a5d252db949e1945[SB.shortsf97e83773d1d3413a5d252db949e1945[2]] = string3;
    }

    static {
        SB.ntfClinit();
    }

    public static SB[] values() {
        return (SB[])((SB[])staticFieldsf97e83773d1d3413a5d252db949e1945[shortsf97e83773d1d3413a5d252db949e1945[0]]).clone();
    }

    public static SB valueOf(String string) {
        return Enum.valueOf(SB.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x854141DC;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF01C3383D13ACCB9L;
    }

    public static SB id_class(String string) {
        SB[] sBArray = SB.values();
        int n = sBArray.length;
        for (int i = booleansf97e83773d1d3413a5d252db949e1945[0]; i < n; ++i) {
            SB sB = sBArray[i];
            if (!string.toLowerCase().contains("\u0443\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430: " + sB.id_class().toLowerCase())) continue;
            return sB;
        }
        return null;
    }

    public String id_class() {
        return (String)this.fieldsf97e83773d1d3413a5d252db949e1945[shortsf97e83773d1d3413a5d252db949e1945[1]];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{37, 68, 103, -75, 92, -10, 27, 124}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleansf97e83773d1d3413a5d252db949e1945 = blArray;
    }

    private static void id_throws() {
        stringsf97e83773d1d3413a5d252db949e1945 = new String[]{new String("LEGENDARY"), new String("\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u044b\u0439"), new String("ELITE"), new String("\u042d\u043b\u0438\u0442\u043d\u044b\u0439"), new String("RICH"), new String("\u0411\u043e\u0433\u0430\u0442\u044b\u0439"), new String("SOLID"), new String("\u0421\u043e\u043b\u0438\u0434\u043d\u044b\u0439"), new String("COMMON"), new String("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")};
    }

    private static /* synthetic */ void ntfClinit() {
        SB.id_break();
        SB.id_throws();
        SB.id_protected();
        SB.id_byte();
        SB.id_case();
    }

    private static /* synthetic */ SB[] id_catch() {
        SB[] sBArray = new SB[bytesf97e83773d1d3413a5d252db949e1945[0]];
        sBArray[SB.booleansf97e83773d1d3413a5d252db949e1945[1]] = (SB)((Object)staticFieldsf97e83773d1d3413a5d252db949e1945[shortsf97e83773d1d3413a5d252db949e1945[3]]);
        sBArray[SB.booleansf97e83773d1d3413a5d252db949e1945[2]] = (SB)((Object)staticFieldsf97e83773d1d3413a5d252db949e1945[shortsf97e83773d1d3413a5d252db949e1945[4]]);
        sBArray[SB.bytesf97e83773d1d3413a5d252db949e1945[1]] = (SB)((Object)staticFieldsf97e83773d1d3413a5d252db949e1945[shortsf97e83773d1d3413a5d252db949e1945[5]]);
        sBArray[SB.bytesf97e83773d1d3413a5d252db949e1945[2]] = (SB)((Object)staticFieldsf97e83773d1d3413a5d252db949e1945[shortsf97e83773d1d3413a5d252db949e1945[6]]);
        sBArray[SB.bytesf97e83773d1d3413a5d252db949e1945[3]] = (SB)((Object)staticFieldsf97e83773d1d3413a5d252db949e1945[shortsf97e83773d1d3413a5d252db949e1945[7]]);
        return sBArray;
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new SB(stringsf97e83773d1d3413a5d252db949e1945[1]), new SB(stringsf97e83773d1d3413a5d252db949e1945[3]), new SB(stringsf97e83773d1d3413a5d252db949e1945[5]), new SB(stringsf97e83773d1d3413a5d252db949e1945[7]), new SB(stringsf97e83773d1d3413a5d252db949e1945[9]), new SB[]{(SB)((Object)objectArray[0]), (SB)((Object)objectArray[1]), (SB)((Object)objectArray[2]), (SB)((Object)objectArray[3]), (SB)((Object)objectArray[4])}};
        staticFieldsf97e83773d1d3413a5d252db949e1945 = objectArray;
    }

    private static void id_protected() {
        short[] sArray = new short[8];
        sArray[0] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        shortsf97e83773d1d3413a5d252db949e1945 = sArray;
    }

    private void id_private() {
        if (this.fieldsf97e83773d1d3413a5d252db949e1945 == null) {
            Object[] objectArray = this.fieldsf97e83773d1d3413a5d252db949e1945 = new Object[booleansf97e83773d1d3413a5d252db949e1945[7]];
        }
    }
}

