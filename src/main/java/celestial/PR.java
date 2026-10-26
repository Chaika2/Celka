/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PK;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.EnumMap;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PR
extends EnumMap<PK, Pattern> {
    private static short[] id_class;
    private static String[] id_break;

    public PR(Class clazz) {
        super(clazz);
        this.put((PK)((Object)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_class[0]]), Pattern.compile(id_break[0]));
        this.put((PK)((Object)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_class[1]]), Pattern.compile(id_break[1]));
        this.put((PK)((Object)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_class[2]]), Pattern.compile(id_break[2]));
        this.put((PK)((Object)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_class[3]]), Pattern.compile(id_break[3]));
        this.put((PK)((Object)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_class[4]]), Pattern.compile(id_break[4]));
        this.put((PK)((Object)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_class[5]]), Pattern.compile(id_break[5]));
        this.put((PK)((Object)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_class[6]]), Pattern.compile(id_break[6]));
    }

    static {
        PR.ntfClinit();
    }

    private static void id_class() {
        short[] sArray = new short[7];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 4;
        sArray[5] = 5;
        sArray[6] = 6;
        id_class = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x839CAD94A740174EL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC0D812C8;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-63, -40, 88, 117, 29, 33, 69, 32}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new String[]{new String("\u0421\u043e\u043b\u043e\u041b\u0430\u0439\u0442 #(\\d+)"), new String("\u0414\u0443\u043e\u041b\u0430\u0439\u0442 #(\\d+)"), new String("\u0422\u0440\u0438\u043e\u041b\u0430\u0439\u0442 #(\\d+)"), new String("\u041a\u043b\u0430\u043d\u041b\u0430\u0439\u0442 #(\\d+)"), new String("\u041b\u0430\u0439\u0442 #(\\d+)"), new String("\u041a\u043b\u0430\u0441\u0441\u0438\u043a #(\\d+)"), new String("\u041b\u043e\u0431\u0431\u0438 #(\\d+)")};
    }

    private static /* synthetic */ void ntfClinit() {
        PR.id_break();
        PR.id_class();
    }
}

