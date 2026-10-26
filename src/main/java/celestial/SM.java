/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SM
extends Enum<SM> {
    public static Object[] staticFieldsb13e79bae31f3ba4bc6e5cebabe1a91c;
    private static short[] shortsb13e79bae31f3ba4bc6e5cebabe1a91c;
    private static String[] stringsb13e79bae31f3ba4bc6e5cebabe1a91c;
    public Object[] fieldsb13e79bae31f3ba4bc6e5cebabe1a91c;
    private static byte[] bytesb13e79bae31f3ba4bc6e5cebabe1a91c;
    private static boolean[] booleansb13e79bae31f3ba4bc6e5cebabe1a91c;

    private static void id_byte() {
        short[] sArray = new short[8];
        sArray[0] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        shortsb13e79bae31f3ba4bc6e5cebabe1a91c = sArray;
    }

    private SM(String string2) {
        this.id_protected();
        String string3 = string2;
        this.fieldsb13e79bae31f3ba4bc6e5cebabe1a91c[SM.shortsb13e79bae31f3ba4bc6e5cebabe1a91c[2]] = string3;
    }

    static {
        SM.ntfClinit();
    }

    public static SM[] values() {
        return (SM[])((SM[])staticFieldsb13e79bae31f3ba4bc6e5cebabe1a91c[shortsb13e79bae31f3ba4bc6e5cebabe1a91c[0]]).clone();
    }

    public static SM valueOf(String string) {
        return Enum.valueOf(SM.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA901D6A47EFF89E7L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1ED37F37;
    }

    public String id_class() {
        return (String)this.fieldsb13e79bae31f3ba4bc6e5cebabe1a91c[shortsb13e79bae31f3ba4bc6e5cebabe1a91c[1]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-30, -19, 10, 46, -109, -101, 28, -128}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static SM id_break(String string) {
        SM[] sMArray = SM.values();
        int n = sMArray.length;
        for (int i = booleansb13e79bae31f3ba4bc6e5cebabe1a91c[0]; i < n; ++i) {
            SM sM = sMArray[i];
            if (!string.toLowerCase().contains("\u0443\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430: " + sM.id_class().toLowerCase())) continue;
            return sM;
        }
        return null;
    }

    private static void id_break() {
        stringsb13e79bae31f3ba4bc6e5cebabe1a91c = new String[]{new String("LEGENDARY"), new String("\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u044b\u0439"), new String("ELITE"), new String("\u042d\u043b\u0438\u0442\u043d\u044b\u0439"), new String("RICH"), new String("\u0411\u043e\u0433\u0430\u0442\u044b\u0439"), new String("SOLID"), new String("\u0421\u043e\u043b\u0438\u0434\u043d\u044b\u0439"), new String("COMMON"), new String("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")};
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new SM(stringsb13e79bae31f3ba4bc6e5cebabe1a91c[1]), new SM(stringsb13e79bae31f3ba4bc6e5cebabe1a91c[3]), new SM(stringsb13e79bae31f3ba4bc6e5cebabe1a91c[5]), new SM(stringsb13e79bae31f3ba4bc6e5cebabe1a91c[7]), new SM(stringsb13e79bae31f3ba4bc6e5cebabe1a91c[9]), new SM[]{(SM)((Object)objectArray[0]), (SM)((Object)objectArray[1]), (SM)((Object)objectArray[2]), (SM)((Object)objectArray[3]), (SM)((Object)objectArray[4])}};
        staticFieldsb13e79bae31f3ba4bc6e5cebabe1a91c = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        SM.id_private();
        SM.id_break();
        SM.id_byte();
        SM.id_case();
        SM.id_throws();
    }

    private static /* synthetic */ SM[] id_catch() {
        SM[] sMArray = new SM[bytesb13e79bae31f3ba4bc6e5cebabe1a91c[0]];
        sMArray[SM.booleansb13e79bae31f3ba4bc6e5cebabe1a91c[1]] = (SM)((Object)staticFieldsb13e79bae31f3ba4bc6e5cebabe1a91c[shortsb13e79bae31f3ba4bc6e5cebabe1a91c[3]]);
        sMArray[SM.booleansb13e79bae31f3ba4bc6e5cebabe1a91c[2]] = (SM)((Object)staticFieldsb13e79bae31f3ba4bc6e5cebabe1a91c[shortsb13e79bae31f3ba4bc6e5cebabe1a91c[4]]);
        sMArray[SM.bytesb13e79bae31f3ba4bc6e5cebabe1a91c[1]] = (SM)((Object)staticFieldsb13e79bae31f3ba4bc6e5cebabe1a91c[shortsb13e79bae31f3ba4bc6e5cebabe1a91c[5]]);
        sMArray[SM.bytesb13e79bae31f3ba4bc6e5cebabe1a91c[2]] = (SM)((Object)staticFieldsb13e79bae31f3ba4bc6e5cebabe1a91c[shortsb13e79bae31f3ba4bc6e5cebabe1a91c[6]]);
        sMArray[SM.bytesb13e79bae31f3ba4bc6e5cebabe1a91c[3]] = (SM)((Object)staticFieldsb13e79bae31f3ba4bc6e5cebabe1a91c[shortsb13e79bae31f3ba4bc6e5cebabe1a91c[7]]);
        return sMArray;
    }

    private static void id_case() {
        bytesb13e79bae31f3ba4bc6e5cebabe1a91c = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    private void id_protected() {
        if (this.fieldsb13e79bae31f3ba4bc6e5cebabe1a91c == null) {
            Object[] objectArray = this.fieldsb13e79bae31f3ba4bc6e5cebabe1a91c = new Object[booleansb13e79bae31f3ba4bc6e5cebabe1a91c[7]];
        }
    }

    private static void id_private() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleansb13e79bae31f3ba4bc6e5cebabe1a91c = blArray;
    }
}

