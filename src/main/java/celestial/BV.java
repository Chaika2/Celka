/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BV
extends Enum<BV> {
    private static boolean[] booleansb1ef2a77de6235bb9d31938bdf7ffd8a;
    public Object[] fieldsb1ef2a77de6235bb9d31938bdf7ffd8a;
    public static Object[] staticFieldsb1ef2a77de6235bb9d31938bdf7ffd8a;
    private static byte[] bytesb1ef2a77de6235bb9d31938bdf7ffd8a;
    private static short[] shortsb1ef2a77de6235bb9d31938bdf7ffd8a;
    private static String[] stringsb1ef2a77de6235bb9d31938bdf7ffd8a;

    private static void id_byte() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleansb1ef2a77de6235bb9d31938bdf7ffd8a = blArray;
    }

    private BV(String string2) {
        this.id_case();
        String string3 = string2;
        this.fieldsb1ef2a77de6235bb9d31938bdf7ffd8a[BV.shortsb1ef2a77de6235bb9d31938bdf7ffd8a[2]] = string3;
    }

    static {
        BV.ntfClinit();
    }

    public static BV[] values() {
        return (BV[])((BV[])staticFieldsb1ef2a77de6235bb9d31938bdf7ffd8a[shortsb1ef2a77de6235bb9d31938bdf7ffd8a[0]]).clone();
    }

    public static BV valueOf(String string) {
        return Enum.valueOf(BV.class, string);
    }

    public String id_class() {
        return (String)this.fieldsb1ef2a77de6235bb9d31938bdf7ffd8a[shortsb1ef2a77de6235bb9d31938bdf7ffd8a[1]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAD6394493DEE1A99L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-108, 4, 41, -15, -88, -75, 87, -35}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x56BD15DB;
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new BV(stringsb1ef2a77de6235bb9d31938bdf7ffd8a[1]), new BV(stringsb1ef2a77de6235bb9d31938bdf7ffd8a[3]), new BV(stringsb1ef2a77de6235bb9d31938bdf7ffd8a[5]), new BV(stringsb1ef2a77de6235bb9d31938bdf7ffd8a[7]), new BV(stringsb1ef2a77de6235bb9d31938bdf7ffd8a[9]), new BV[]{(BV)((Object)objectArray[0]), (BV)((Object)objectArray[1]), (BV)((Object)objectArray[2]), (BV)((Object)objectArray[3]), (BV)((Object)objectArray[4])}};
        staticFieldsb1ef2a77de6235bb9d31938bdf7ffd8a = objectArray;
    }

    public static BV id_break(String string) {
        BV[] bVArray = BV.values();
        int n = bVArray.length;
        for (int i = booleansb1ef2a77de6235bb9d31938bdf7ffd8a[0]; i < n; ++i) {
            BV bV = bVArray[i];
            if (!string.toLowerCase().contains("\u0443\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430: " + bV.id_class().toLowerCase())) continue;
            return bV;
        }
        return null;
    }

    private static void id_throws() {
        bytesb1ef2a77de6235bb9d31938bdf7ffd8a = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    private static /* synthetic */ void ntfClinit() {
        BV.id_byte();
        BV.id_private();
        BV.id_catch();
        BV.id_throws();
        BV.id_break();
    }

    private static void id_catch() {
        short[] sArray = new short[8];
        sArray[0] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        shortsb1ef2a77de6235bb9d31938bdf7ffd8a = sArray;
    }

    private void id_case() {
        if (this.fieldsb1ef2a77de6235bb9d31938bdf7ffd8a == null) {
            Object[] objectArray = this.fieldsb1ef2a77de6235bb9d31938bdf7ffd8a = new Object[booleansb1ef2a77de6235bb9d31938bdf7ffd8a[7]];
        }
    }

    private static /* synthetic */ BV[] id_protected() {
        BV[] bVArray = new BV[bytesb1ef2a77de6235bb9d31938bdf7ffd8a[0]];
        bVArray[BV.booleansb1ef2a77de6235bb9d31938bdf7ffd8a[1]] = (BV)((Object)staticFieldsb1ef2a77de6235bb9d31938bdf7ffd8a[shortsb1ef2a77de6235bb9d31938bdf7ffd8a[3]]);
        bVArray[BV.booleansb1ef2a77de6235bb9d31938bdf7ffd8a[2]] = (BV)((Object)staticFieldsb1ef2a77de6235bb9d31938bdf7ffd8a[shortsb1ef2a77de6235bb9d31938bdf7ffd8a[4]]);
        bVArray[BV.bytesb1ef2a77de6235bb9d31938bdf7ffd8a[1]] = (BV)((Object)staticFieldsb1ef2a77de6235bb9d31938bdf7ffd8a[shortsb1ef2a77de6235bb9d31938bdf7ffd8a[5]]);
        bVArray[BV.bytesb1ef2a77de6235bb9d31938bdf7ffd8a[2]] = (BV)((Object)staticFieldsb1ef2a77de6235bb9d31938bdf7ffd8a[shortsb1ef2a77de6235bb9d31938bdf7ffd8a[6]]);
        bVArray[BV.bytesb1ef2a77de6235bb9d31938bdf7ffd8a[3]] = (BV)((Object)staticFieldsb1ef2a77de6235bb9d31938bdf7ffd8a[shortsb1ef2a77de6235bb9d31938bdf7ffd8a[7]]);
        return bVArray;
    }

    private static void id_private() {
        stringsb1ef2a77de6235bb9d31938bdf7ffd8a = new String[]{new String("LEGENDARY"), new String("\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u044b\u0439"), new String("ELITE"), new String("\u042d\u043b\u0438\u0442\u043d\u044b\u0439"), new String("RICH"), new String("\u0411\u043e\u0433\u0430\u0442\u044b\u0439"), new String("SOLID"), new String("\u0421\u043e\u043b\u0438\u0434\u043d\u044b\u0439"), new String("COMMON"), new String("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")};
    }
}

