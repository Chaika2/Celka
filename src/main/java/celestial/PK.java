/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PK
extends Enum<PK> {
    private static String[] strings6a264fee257833ddb403077ab7e90d84;
    private static short[] shorts6a264fee257833ddb403077ab7e90d84;
    public static Object[] staticFields6a264fee257833ddb403077ab7e90d84;
    private static byte[] bytes6a264fee257833ddb403077ab7e90d84;
    private static boolean[] booleans6a264fee257833ddb403077ab7e90d84;
    public Object[] fields6a264fee257833ddb403077ab7e90d84;

    public boolean id_byte() {
        return this == (PK)((Object)staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[6]]) ? booleans6a264fee257833ddb403077ab7e90d84[4] : booleans6a264fee257833ddb403077ab7e90d84[5];
    }

    private PK(String string2) {
        this.id_extends();
        String string3 = string2;
        this.fields6a264fee257833ddb403077ab7e90d84[PK.shorts6a264fee257833ddb403077ab7e90d84[9]] = string3;
    }

    static {
        PK.ntfClinit();
    }

    public static PK[] values() {
        return (PK[])((PK[])staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[0]]).clone();
    }

    public static PK valueOf(String string) {
        return Enum.valueOf(PK.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x211481D8E5DC0243L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{21, 111, 22, 1, -4, -42, -40, -41}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_class() {
        return (String)this.fields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[8]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDAA38068;
    }

    public boolean id_break() {
        return this != (PK)((Object)staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[1]]) ? booleans6a264fee257833ddb403077ab7e90d84[0] : booleans6a264fee257833ddb403077ab7e90d84[1];
    }

    public boolean id_throws() {
        return this == (PK)((Object)staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[7]]) ? booleans6a264fee257833ddb403077ab7e90d84[6] : booleans6a264fee257833ddb403077ab7e90d84[7];
    }

    private static /* synthetic */ void ntfClinit() {
        PK.id_private();
        PK.id_implements();
        PK.id_catch();
        PK.id_native();
        PK.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray;
        objectArray = new Object[]{new PK(strings6a264fee257833ddb403077ab7e90d84[1]), new PK(strings6a264fee257833ddb403077ab7e90d84[3]), new PK(strings6a264fee257833ddb403077ab7e90d84[5]), new PK(strings6a264fee257833ddb403077ab7e90d84[7]), new PK(strings6a264fee257833ddb403077ab7e90d84[9]), new PK(strings6a264fee257833ddb403077ab7e90d84[11]), new PK(strings6a264fee257833ddb403077ab7e90d84[13]), new PK[]{(PK)((Object)objectArray[0]), (PK)((Object)objectArray[1]), (PK)((Object)objectArray[2]), (PK)((Object)objectArray[3]), (PK)((Object)objectArray[4]), (PK)((Object)objectArray[5]), (PK)((Object)objectArray[6])}, new PK[]{(PK)((Object)objectArray[0]), (PK)((Object)objectArray[1]), (PK)((Object)objectArray[2]), (PK)((Object)objectArray[3]), (PK)((Object)objectArray[4]), (PK)((Object)objectArray[5]), (PK)((Object)objectArray[6])}};
        staticFields6a264fee257833ddb403077ab7e90d84 = objectArray;
    }

    private static void id_catch() {
        short[] sArray = new short[17];
        sArray[0] = 8;
        sArray[1] = 6;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 3;
        sArray[6] = 4;
        sArray[7] = 5;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 3;
        sArray[14] = 4;
        sArray[15] = 5;
        sArray[16] = 6;
        shorts6a264fee257833ddb403077ab7e90d84 = sArray;
    }

    private void id_extends() {
        if (this.fields6a264fee257833ddb403077ab7e90d84 == null) {
            Object[] objectArray = this.fields6a264fee257833ddb403077ab7e90d84 = new Object[booleans6a264fee257833ddb403077ab7e90d84[14]];
        }
    }

    private static /* synthetic */ PK[] id_case() {
        PK[] pKArray = new PK[bytes6a264fee257833ddb403077ab7e90d84[0]];
        pKArray[PK.booleans6a264fee257833ddb403077ab7e90d84[8]] = (PK)((Object)staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[10]]);
        pKArray[PK.booleans6a264fee257833ddb403077ab7e90d84[9]] = (PK)((Object)staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[11]]);
        pKArray[PK.bytes6a264fee257833ddb403077ab7e90d84[1]] = (PK)((Object)staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[12]]);
        pKArray[PK.bytes6a264fee257833ddb403077ab7e90d84[2]] = (PK)((Object)staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[13]]);
        pKArray[PK.bytes6a264fee257833ddb403077ab7e90d84[3]] = (PK)((Object)staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[14]]);
        pKArray[PK.bytes6a264fee257833ddb403077ab7e90d84[4]] = (PK)((Object)staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[15]]);
        pKArray[PK.bytes6a264fee257833ddb403077ab7e90d84[5]] = (PK)((Object)staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[16]]);
        return pKArray;
    }

    private static void id_implements() {
        strings6a264fee257833ddb403077ab7e90d84 = new String[]{new String("SOLO_LITE"), new String("\u0421\u043e\u043b\u043e\u041b\u0430\u0439\u0442"), new String("DUO_LITE"), new String("\u0414\u0443\u043e\u041b\u0430\u0439\u0442"), new String("TRIO_LITE"), new String("\u0422\u0440\u0438\u043e\u041b\u0430\u0439\u0442"), new String("CLAN_LITE"), new String("\u041a\u043b\u0430\u043d\u041b\u0430\u0439\u0442"), new String("LITE_120"), new String("\u041b\u0430\u0439\u0442120"), new String("CLASSIC"), new String("\u041a\u043b\u0430\u0441\u0441\u0438\u043a"), new String("LOBBY"), new String("\u041b\u043e\u0431\u0431\u0438")};
    }

    public boolean id_protected() {
        return this == (PK)((Object)staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[2]]) || this == (PK)((Object)staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[3]]) || this == (PK)((Object)staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[4]]) || this == (PK)((Object)staticFields6a264fee257833ddb403077ab7e90d84[shorts6a264fee257833ddb403077ab7e90d84[5]]) ? booleans6a264fee257833ddb403077ab7e90d84[2] : booleans6a264fee257833ddb403077ab7e90d84[3];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[15];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[9] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        booleans6a264fee257833ddb403077ab7e90d84 = blArray;
    }

    private static void id_native() {
        bytes6a264fee257833ddb403077ab7e90d84 = new byte[]{7, 2, 3, 4, 5, 6, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 8, 7, 9};
    }
}

