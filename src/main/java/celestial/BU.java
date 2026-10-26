/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BU
extends Enum<BU> {
    private static boolean[] booleanse462c7c8b20936b69781915dd77e35b5;
    private static byte[] bytese462c7c8b20936b69781915dd77e35b5;
    private static String[] stringse462c7c8b20936b69781915dd77e35b5;
    private static short[] shortse462c7c8b20936b69781915dd77e35b5;
    public static Object[] staticFieldse462c7c8b20936b69781915dd77e35b5;
    public Object[] fieldse462c7c8b20936b69781915dd77e35b5;

    private void id_byte() {
        if (this.fieldse462c7c8b20936b69781915dd77e35b5 == null) {
            Object[] objectArray = this.fieldse462c7c8b20936b69781915dd77e35b5 = new Object[booleanse462c7c8b20936b69781915dd77e35b5[7]];
        }
    }

    private BU(String string2) {
        this.id_byte();
        String string3 = string2;
        this.fieldse462c7c8b20936b69781915dd77e35b5[BU.shortse462c7c8b20936b69781915dd77e35b5[2]] = string3;
    }

    static {
        BU.ntfClinit();
    }

    public static BU[] values() {
        return (BU[])((BU[])staticFieldse462c7c8b20936b69781915dd77e35b5[shortse462c7c8b20936b69781915dd77e35b5[0]]).clone();
    }

    public static BU valueOf(String string) {
        return Enum.valueOf(BU.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEBF4DF6F;
    }

    public String id_class() {
        return (String)this.fieldse462c7c8b20936b69781915dd77e35b5[shortse462c7c8b20936b69781915dd77e35b5[1]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEF5EA56118C0702CL;
    }

    public static BU id_class(String string) {
        BU[] bUArray = BU.values();
        int n = bUArray.length;
        for (int i = booleanse462c7c8b20936b69781915dd77e35b5[0]; i < n; ++i) {
            BU bU = bUArray[i];
            if (!string.toLowerCase().contains("\u0443\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430: " + bU.id_class().toLowerCase())) continue;
            return bU;
        }
        return null;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-104, -94, 91, -84, 44, -16, -127, 51}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new BU(stringse462c7c8b20936b69781915dd77e35b5[1]), new BU(stringse462c7c8b20936b69781915dd77e35b5[3]), new BU(stringse462c7c8b20936b69781915dd77e35b5[5]), new BU(stringse462c7c8b20936b69781915dd77e35b5[7]), new BU(stringse462c7c8b20936b69781915dd77e35b5[9]), new BU[]{(BU)((Object)objectArray[0]), (BU)((Object)objectArray[1]), (BU)((Object)objectArray[2]), (BU)((Object)objectArray[3]), (BU)((Object)objectArray[4])}};
        staticFieldse462c7c8b20936b69781915dd77e35b5 = objectArray;
    }

    private static void id_throws() {
        short[] sArray = new short[8];
        sArray[0] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        shortse462c7c8b20936b69781915dd77e35b5 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        BU.id_catch();
        BU.id_private();
        BU.id_throws();
        BU.id_case();
        BU.id_break();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleanse462c7c8b20936b69781915dd77e35b5 = blArray;
    }

    private static void id_case() {
        bytese462c7c8b20936b69781915dd77e35b5 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    private static /* synthetic */ BU[] id_protected() {
        BU[] bUArray = new BU[bytese462c7c8b20936b69781915dd77e35b5[0]];
        bUArray[BU.booleanse462c7c8b20936b69781915dd77e35b5[1]] = (BU)((Object)staticFieldse462c7c8b20936b69781915dd77e35b5[shortse462c7c8b20936b69781915dd77e35b5[3]]);
        bUArray[BU.booleanse462c7c8b20936b69781915dd77e35b5[2]] = (BU)((Object)staticFieldse462c7c8b20936b69781915dd77e35b5[shortse462c7c8b20936b69781915dd77e35b5[4]]);
        bUArray[BU.bytese462c7c8b20936b69781915dd77e35b5[1]] = (BU)((Object)staticFieldse462c7c8b20936b69781915dd77e35b5[shortse462c7c8b20936b69781915dd77e35b5[5]]);
        bUArray[BU.bytese462c7c8b20936b69781915dd77e35b5[2]] = (BU)((Object)staticFieldse462c7c8b20936b69781915dd77e35b5[shortse462c7c8b20936b69781915dd77e35b5[6]]);
        bUArray[BU.bytese462c7c8b20936b69781915dd77e35b5[3]] = (BU)((Object)staticFieldse462c7c8b20936b69781915dd77e35b5[shortse462c7c8b20936b69781915dd77e35b5[7]]);
        return bUArray;
    }

    private static void id_private() {
        stringse462c7c8b20936b69781915dd77e35b5 = new String[]{new String("LEGENDARY"), new String("\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u044b\u0439"), new String("ELITE"), new String("\u042d\u043b\u0438\u0442\u043d\u044b\u0439"), new String("RICH"), new String("\u0411\u043e\u0433\u0430\u0442\u044b\u0439"), new String("SOLID"), new String("\u0421\u043e\u043b\u0438\u0434\u043d\u044b\u0439"), new String("COMMON"), new String("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")};
    }
}

