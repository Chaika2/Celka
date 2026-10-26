/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ss_1
extends Enum<Ss_1> {
    public static Object[] staticFieldsfbe4174146d2323d9047521d90bbb1bc;
    private static byte[] bytesfbe4174146d2323d9047521d90bbb1bc;
    private static String[] stringsfbe4174146d2323d9047521d90bbb1bc;
    private static boolean[] booleansfbe4174146d2323d9047521d90bbb1bc;
    public Object[] fieldsfbe4174146d2323d9047521d90bbb1bc;
    private static short[] shortsfbe4174146d2323d9047521d90bbb1bc;

    private static void id_byte() {
        short[] sArray = new short[8];
        sArray[0] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        shortsfbe4174146d2323d9047521d90bbb1bc = sArray;
    }

    private Ss_1(String string2) {
        this.id_private();
        String string3 = string2;
        this.fieldsfbe4174146d2323d9047521d90bbb1bc[Ss_1.shortsfbe4174146d2323d9047521d90bbb1bc[2]] = string3;
    }

    static {
        Ss_1.ntfClinit();
    }

    public static Ss_1[] values() {
        return (Ss_1[])((Ss_1[])staticFieldsfbe4174146d2323d9047521d90bbb1bc[shortsfbe4174146d2323d9047521d90bbb1bc[0]]).clone();
    }

    public static Ss_1 valueOf(String string) {
        return Enum.valueOf(Ss_1.class, string);
    }

    public String id_class() {
        return (String)this.fieldsfbe4174146d2323d9047521d90bbb1bc[shortsfbe4174146d2323d9047521d90bbb1bc[1]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x84B5503F9429EE5DL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA36A7D26;
    }

    public static Ss_1 id_class(String string) {
        Ss_1[] ss_1Array = Ss_1.values();
        int n = ss_1Array.length;
        for (int i = booleansfbe4174146d2323d9047521d90bbb1bc[0]; i < n; ++i) {
            Ss_1 ss_1 = ss_1Array[i];
            if (!string.toLowerCase().contains("\u0443\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430: " + ss_1.id_class().toLowerCase())) continue;
            return ss_1;
        }
        return null;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{76, 106, -96, -3, -23, 111, 51, 61}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        bytesfbe4174146d2323d9047521d90bbb1bc = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new Ss_1(stringsfbe4174146d2323d9047521d90bbb1bc[1]), new Ss_1(stringsfbe4174146d2323d9047521d90bbb1bc[3]), new Ss_1(stringsfbe4174146d2323d9047521d90bbb1bc[5]), new Ss_1(stringsfbe4174146d2323d9047521d90bbb1bc[7]), new Ss_1(stringsfbe4174146d2323d9047521d90bbb1bc[9]), new Ss_1[]{(Ss_1)((Object)objectArray[0]), (Ss_1)((Object)objectArray[1]), (Ss_1)((Object)objectArray[2]), (Ss_1)((Object)objectArray[3]), (Ss_1)((Object)objectArray[4])}};
        staticFieldsfbe4174146d2323d9047521d90bbb1bc = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Ss_1.id_protected();
        Ss_1.id_catch();
        Ss_1.id_byte();
        Ss_1.id_break();
        Ss_1.id_throws();
    }

    private static void id_catch() {
        stringsfbe4174146d2323d9047521d90bbb1bc = new String[]{new String("LEGENDARY"), new String("\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u044b\u0439"), new String("ELITE"), new String("\u042d\u043b\u0438\u0442\u043d\u044b\u0439"), new String("RICH"), new String("\u0411\u043e\u0433\u0430\u0442\u044b\u0439"), new String("SOLID"), new String("\u0421\u043e\u043b\u0438\u0434\u043d\u044b\u0439"), new String("COMMON"), new String("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")};
    }

    private static /* synthetic */ Ss_1[] id_case() {
        Ss_1[] ss_1Array = new Ss_1[bytesfbe4174146d2323d9047521d90bbb1bc[0]];
        ss_1Array[Ss_1.booleansfbe4174146d2323d9047521d90bbb1bc[1]] = (Ss_1)((Object)staticFieldsfbe4174146d2323d9047521d90bbb1bc[shortsfbe4174146d2323d9047521d90bbb1bc[3]]);
        ss_1Array[Ss_1.booleansfbe4174146d2323d9047521d90bbb1bc[2]] = (Ss_1)((Object)staticFieldsfbe4174146d2323d9047521d90bbb1bc[shortsfbe4174146d2323d9047521d90bbb1bc[4]]);
        ss_1Array[Ss_1.bytesfbe4174146d2323d9047521d90bbb1bc[1]] = (Ss_1)((Object)staticFieldsfbe4174146d2323d9047521d90bbb1bc[shortsfbe4174146d2323d9047521d90bbb1bc[5]]);
        ss_1Array[Ss_1.bytesfbe4174146d2323d9047521d90bbb1bc[2]] = (Ss_1)((Object)staticFieldsfbe4174146d2323d9047521d90bbb1bc[shortsfbe4174146d2323d9047521d90bbb1bc[6]]);
        ss_1Array[Ss_1.bytesfbe4174146d2323d9047521d90bbb1bc[3]] = (Ss_1)((Object)staticFieldsfbe4174146d2323d9047521d90bbb1bc[shortsfbe4174146d2323d9047521d90bbb1bc[7]]);
        return ss_1Array;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleansfbe4174146d2323d9047521d90bbb1bc = blArray;
    }

    private void id_private() {
        if (this.fieldsfbe4174146d2323d9047521d90bbb1bc == null) {
            Object[] objectArray = this.fieldsfbe4174146d2323d9047521d90bbb1bc = new Object[booleansfbe4174146d2323d9047521d90bbb1bc[7]];
        }
    }
}

