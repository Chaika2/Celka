/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ba_1
extends Enum<Ba_1> {
    private static String[] stringse1fb41940c3a3230bee21800e360fbb0;
    private static short[] shortse1fb41940c3a3230bee21800e360fbb0;
    public static Object[] staticFieldse1fb41940c3a3230bee21800e360fbb0;
    private static byte[] bytese1fb41940c3a3230bee21800e360fbb0;
    public Object[] fieldse1fb41940c3a3230bee21800e360fbb0;
    private static boolean[] booleanse1fb41940c3a3230bee21800e360fbb0;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new Ba_1(stringse1fb41940c3a3230bee21800e360fbb0[1]), new Ba_1(stringse1fb41940c3a3230bee21800e360fbb0[3]), new Ba_1(stringse1fb41940c3a3230bee21800e360fbb0[5]), new Ba_1(stringse1fb41940c3a3230bee21800e360fbb0[7]), new Ba_1(stringse1fb41940c3a3230bee21800e360fbb0[9]), new Ba_1[]{(Ba_1)((Object)objectArray[0]), (Ba_1)((Object)objectArray[1]), (Ba_1)((Object)objectArray[2]), (Ba_1)((Object)objectArray[3]), (Ba_1)((Object)objectArray[4])}};
        staticFieldse1fb41940c3a3230bee21800e360fbb0 = objectArray;
    }

    private Ba_1(String string2) {
        this.id_break();
        String string3 = string2;
        this.fieldse1fb41940c3a3230bee21800e360fbb0[Ba_1.shortse1fb41940c3a3230bee21800e360fbb0[2]] = string3;
    }

    static {
        Ba_1.ntfClinit();
    }

    public static Ba_1[] values() {
        return (Ba_1[])((Ba_1[])staticFieldse1fb41940c3a3230bee21800e360fbb0[shortse1fb41940c3a3230bee21800e360fbb0[0]]).clone();
    }

    public static Ba_1 valueOf(String string) {
        return Enum.valueOf(Ba_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3CDDBF65;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x203CABEB532A31C0L;
    }

    public String id_class() {
        return (String)this.fieldse1fb41940c3a3230bee21800e360fbb0[shortse1fb41940c3a3230bee21800e360fbb0[1]];
    }

    public static Ba_1 id_class(String string) {
        Ba_1[] ba_1Array = Ba_1.values();
        int n = ba_1Array.length;
        for (int i = booleanse1fb41940c3a3230bee21800e360fbb0[0]; i < n; ++i) {
            Ba_1 ba_1 = ba_1Array[i];
            if (!string.toLowerCase().contains("\u0443\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430: " + ba_1.id_class().toLowerCase())) continue;
            return ba_1;
        }
        return null;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{52, 90, 78, -100, 42, -102, 22, -115}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.fieldse1fb41940c3a3230bee21800e360fbb0 == null) {
            Object[] objectArray = this.fieldse1fb41940c3a3230bee21800e360fbb0 = new Object[booleanse1fb41940c3a3230bee21800e360fbb0[7]];
        }
    }

    private static void id_throws() {
        bytese1fb41940c3a3230bee21800e360fbb0 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    private static /* synthetic */ void ntfClinit() {
        Ba_1.id_private();
        Ba_1.id_case();
        Ba_1.id_catch();
        Ba_1.id_throws();
        Ba_1.id_byte();
    }

    private static void id_catch() {
        short[] sArray = new short[8];
        sArray[0] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        shortse1fb41940c3a3230bee21800e360fbb0 = sArray;
    }

    private static void id_case() {
        stringse1fb41940c3a3230bee21800e360fbb0 = new String[]{new String("LEGENDARY"), new String("\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u044b\u0439"), new String("ELITE"), new String("\u042d\u043b\u0438\u0442\u043d\u044b\u0439"), new String("RICH"), new String("\u0411\u043e\u0433\u0430\u0442\u044b\u0439"), new String("SOLID"), new String("\u0421\u043e\u043b\u0438\u0434\u043d\u044b\u0439"), new String("COMMON"), new String("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")};
    }

    private static /* synthetic */ Ba_1[] id_protected() {
        Ba_1[] ba_1Array = new Ba_1[bytese1fb41940c3a3230bee21800e360fbb0[0]];
        ba_1Array[Ba_1.booleanse1fb41940c3a3230bee21800e360fbb0[1]] = (Ba_1)((Object)staticFieldse1fb41940c3a3230bee21800e360fbb0[shortse1fb41940c3a3230bee21800e360fbb0[3]]);
        ba_1Array[Ba_1.booleanse1fb41940c3a3230bee21800e360fbb0[2]] = (Ba_1)((Object)staticFieldse1fb41940c3a3230bee21800e360fbb0[shortse1fb41940c3a3230bee21800e360fbb0[4]]);
        ba_1Array[Ba_1.bytese1fb41940c3a3230bee21800e360fbb0[1]] = (Ba_1)((Object)staticFieldse1fb41940c3a3230bee21800e360fbb0[shortse1fb41940c3a3230bee21800e360fbb0[5]]);
        ba_1Array[Ba_1.bytese1fb41940c3a3230bee21800e360fbb0[2]] = (Ba_1)((Object)staticFieldse1fb41940c3a3230bee21800e360fbb0[shortse1fb41940c3a3230bee21800e360fbb0[6]]);
        ba_1Array[Ba_1.bytese1fb41940c3a3230bee21800e360fbb0[3]] = (Ba_1)((Object)staticFieldse1fb41940c3a3230bee21800e360fbb0[shortse1fb41940c3a3230bee21800e360fbb0[7]]);
        return ba_1Array;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleanse1fb41940c3a3230bee21800e360fbb0 = blArray;
    }
}

