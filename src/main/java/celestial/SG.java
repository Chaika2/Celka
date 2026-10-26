/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SG
extends Enum<SG> {
    private static short[] shortse5c26292bc063f57a586f786ce621980;
    private static boolean[] booleanse5c26292bc063f57a586f786ce621980;
    private static byte[] bytese5c26292bc063f57a586f786ce621980;
    public static Object[] staticFieldse5c26292bc063f57a586f786ce621980;
    public Object[] fieldse5c26292bc063f57a586f786ce621980;
    private static String[] stringse5c26292bc063f57a586f786ce621980;

    private void id_byte() {
        if (this.fieldse5c26292bc063f57a586f786ce621980 == null) {
            Object[] objectArray = this.fieldse5c26292bc063f57a586f786ce621980 = new Object[booleanse5c26292bc063f57a586f786ce621980[7]];
        }
    }

    private SG(String string2) {
        this.id_byte();
        String string3 = string2;
        this.fieldse5c26292bc063f57a586f786ce621980[SG.shortse5c26292bc063f57a586f786ce621980[2]] = string3;
    }

    static {
        SG.ntfClinit();
    }

    public static SG[] values() {
        return (SG[])((SG[])staticFieldse5c26292bc063f57a586f786ce621980[shortse5c26292bc063f57a586f786ce621980[0]]).clone();
    }

    public static SG valueOf(String string) {
        return Enum.valueOf(SG.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF893FA68AE0FCF25L;
    }

    public static SG id_class(String string) {
        SG[] sGArray = SG.values();
        int n = sGArray.length;
        for (int i = booleanse5c26292bc063f57a586f786ce621980[0]; i < n; ++i) {
            SG sG = sGArray[i];
            if (!string.toLowerCase().contains("\u0443\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430: " + sG.id_class().toLowerCase())) continue;
            return sG;
        }
        return null;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6E463EF6;
    }

    public String id_class() {
        return (String)this.fieldse5c26292bc063f57a586f786ce621980[shortse5c26292bc063f57a586f786ce621980[1]];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{91, 6, 116, -78, -92, -108, -92, -75}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        stringse5c26292bc063f57a586f786ce621980 = new String[]{new String("LEGENDARY"), new String("\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u044b\u0439"), new String("ELITE"), new String("\u042d\u043b\u0438\u0442\u043d\u044b\u0439"), new String("RICH"), new String("\u0411\u043e\u0433\u0430\u0442\u044b\u0439"), new String("SOLID"), new String("\u0421\u043e\u043b\u0438\u0434\u043d\u044b\u0439"), new String("COMMON"), new String("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")};
    }

    private static void id_throws() {
        bytese5c26292bc063f57a586f786ce621980 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    private static /* synthetic */ void ntfClinit() {
        SG.id_private();
        SG.id_break();
        SG.id_case();
        SG.id_throws();
        SG.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray;
        objectArray = new Object[]{new SG(stringse5c26292bc063f57a586f786ce621980[1]), new SG(stringse5c26292bc063f57a586f786ce621980[3]), new SG(stringse5c26292bc063f57a586f786ce621980[5]), new SG(stringse5c26292bc063f57a586f786ce621980[7]), new SG(stringse5c26292bc063f57a586f786ce621980[9]), new SG[]{(SG)((Object)objectArray[0]), (SG)((Object)objectArray[1]), (SG)((Object)objectArray[2]), (SG)((Object)objectArray[3]), (SG)((Object)objectArray[4])}};
        staticFieldse5c26292bc063f57a586f786ce621980 = objectArray;
    }

    private static void id_case() {
        short[] sArray = new short[8];
        sArray[0] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        shortse5c26292bc063f57a586f786ce621980 = sArray;
    }

    private static /* synthetic */ SG[] id_protected() {
        SG[] sGArray = new SG[bytese5c26292bc063f57a586f786ce621980[0]];
        sGArray[SG.booleanse5c26292bc063f57a586f786ce621980[1]] = (SG)((Object)staticFieldse5c26292bc063f57a586f786ce621980[shortse5c26292bc063f57a586f786ce621980[3]]);
        sGArray[SG.booleanse5c26292bc063f57a586f786ce621980[2]] = (SG)((Object)staticFieldse5c26292bc063f57a586f786ce621980[shortse5c26292bc063f57a586f786ce621980[4]]);
        sGArray[SG.bytese5c26292bc063f57a586f786ce621980[1]] = (SG)((Object)staticFieldse5c26292bc063f57a586f786ce621980[shortse5c26292bc063f57a586f786ce621980[5]]);
        sGArray[SG.bytese5c26292bc063f57a586f786ce621980[2]] = (SG)((Object)staticFieldse5c26292bc063f57a586f786ce621980[shortse5c26292bc063f57a586f786ce621980[6]]);
        sGArray[SG.bytese5c26292bc063f57a586f786ce621980[3]] = (SG)((Object)staticFieldse5c26292bc063f57a586f786ce621980[shortse5c26292bc063f57a586f786ce621980[7]]);
        return sGArray;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleanse5c26292bc063f57a586f786ce621980 = blArray;
    }
}

