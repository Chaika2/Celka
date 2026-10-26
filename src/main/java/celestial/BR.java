/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BR
extends Enum<BR> {
    public Object[] fields106ab800b639370da43e6ac2a2275f07;
    private static boolean[] booleans106ab800b639370da43e6ac2a2275f07;
    private static byte[] bytes106ab800b639370da43e6ac2a2275f07;
    private static String[] strings106ab800b639370da43e6ac2a2275f07;
    public static Object[] staticFields106ab800b639370da43e6ac2a2275f07;
    private static short[] shorts106ab800b639370da43e6ac2a2275f07;

    private void id_byte() {
        if (this.fields106ab800b639370da43e6ac2a2275f07 == null) {
            Object[] objectArray = this.fields106ab800b639370da43e6ac2a2275f07 = new Object[booleans106ab800b639370da43e6ac2a2275f07[7]];
        }
    }

    private BR(String string2) {
        this.id_byte();
        String string3 = string2;
        this.fields106ab800b639370da43e6ac2a2275f07[BR.shorts106ab800b639370da43e6ac2a2275f07[2]] = string3;
    }

    static {
        BR.ntfClinit();
    }

    public static BR[] values() {
        return (BR[])((BR[])staticFields106ab800b639370da43e6ac2a2275f07[shorts106ab800b639370da43e6ac2a2275f07[0]]).clone();
    }

    public static BR valueOf(String string) {
        return Enum.valueOf(BR.class, string);
    }

    public static BR id_class(String string) {
        BR[] bRArray = BR.values();
        int n = bRArray.length;
        for (int i = booleans106ab800b639370da43e6ac2a2275f07[0]; i < n; ++i) {
            BR bR = bRArray[i];
            if (!string.toLowerCase().contains("\u0443\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430: " + bR.id_class().toLowerCase())) continue;
            return bR;
        }
        return null;
    }

    public String id_class() {
        return (String)this.fields106ab800b639370da43e6ac2a2275f07[shorts106ab800b639370da43e6ac2a2275f07[1]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9B9847F4;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE73C7EE96E3B9A64L;
    }

    private static void id_break() {
        bytes106ab800b639370da43e6ac2a2275f07 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-61, 15, 90, 59, -48, 88, 84, 57}, "DES");
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
        shorts106ab800b639370da43e6ac2a2275f07 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        BR.id_case();
        BR.id_private();
        BR.id_throws();
        BR.id_break();
        BR.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray;
        objectArray = new Object[]{new BR(strings106ab800b639370da43e6ac2a2275f07[1]), new BR(strings106ab800b639370da43e6ac2a2275f07[3]), new BR(strings106ab800b639370da43e6ac2a2275f07[5]), new BR(strings106ab800b639370da43e6ac2a2275f07[7]), new BR(strings106ab800b639370da43e6ac2a2275f07[9]), new BR[]{(BR)((Object)objectArray[0]), (BR)((Object)objectArray[1]), (BR)((Object)objectArray[2]), (BR)((Object)objectArray[3]), (BR)((Object)objectArray[4])}};
        staticFields106ab800b639370da43e6ac2a2275f07 = objectArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleans106ab800b639370da43e6ac2a2275f07 = blArray;
    }

    private static /* synthetic */ BR[] id_protected() {
        BR[] bRArray = new BR[bytes106ab800b639370da43e6ac2a2275f07[0]];
        bRArray[BR.booleans106ab800b639370da43e6ac2a2275f07[1]] = (BR)((Object)staticFields106ab800b639370da43e6ac2a2275f07[shorts106ab800b639370da43e6ac2a2275f07[3]]);
        bRArray[BR.booleans106ab800b639370da43e6ac2a2275f07[2]] = (BR)((Object)staticFields106ab800b639370da43e6ac2a2275f07[shorts106ab800b639370da43e6ac2a2275f07[4]]);
        bRArray[BR.bytes106ab800b639370da43e6ac2a2275f07[1]] = (BR)((Object)staticFields106ab800b639370da43e6ac2a2275f07[shorts106ab800b639370da43e6ac2a2275f07[5]]);
        bRArray[BR.bytes106ab800b639370da43e6ac2a2275f07[2]] = (BR)((Object)staticFields106ab800b639370da43e6ac2a2275f07[shorts106ab800b639370da43e6ac2a2275f07[6]]);
        bRArray[BR.bytes106ab800b639370da43e6ac2a2275f07[3]] = (BR)((Object)staticFields106ab800b639370da43e6ac2a2275f07[shorts106ab800b639370da43e6ac2a2275f07[7]]);
        return bRArray;
    }

    private static void id_private() {
        strings106ab800b639370da43e6ac2a2275f07 = new String[]{new String("LEGENDARY"), new String("\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u044b\u0439"), new String("ELITE"), new String("\u042d\u043b\u0438\u0442\u043d\u044b\u0439"), new String("RICH"), new String("\u0411\u043e\u0433\u0430\u0442\u044b\u0439"), new String("SOLID"), new String("\u0421\u043e\u043b\u0438\u0434\u043d\u044b\u0439"), new String("COMMON"), new String("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")};
    }
}

