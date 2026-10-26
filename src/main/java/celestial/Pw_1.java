/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Pf_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.EnumMap;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pw_1
extends EnumMap<Pf_1, Pattern> {
    private static short[] id_class;
    private static String[] id_break;

    public Pw_1(Class clazz) {
        super(clazz);
        this.put((Pf_1)((Object)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[id_class[0]]), Pattern.compile(id_break[0]));
        this.put((Pf_1)((Object)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[id_class[1]]), Pattern.compile(id_break[1]));
        this.put((Pf_1)((Object)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[id_class[2]]), Pattern.compile(id_break[2]));
    }

    static {
        Pw_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{115, -87, -117, 83, 61, 50, 86, 22}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDC7A8868F74E7403L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x542CE509;
    }

    private static void id_class() {
        id_break = new String[]{new String("\u0410\u043d\u0430\u0440\u0445\u0438\u044f-(\\d+)"), new String("\u0413\u0440\u0438\u0444\u0435\u0440\u0441\u043a\u0438\u0439-(\\d+)"), new String("\u0425\u0430\u0431 #(\\d+)|%SERVER_NAME_TAB%")};
    }

    private static void id_break() {
        short[] sArray = new short[3];
        sArray[1] = 1;
        sArray[2] = 2;
        id_class = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Pw_1.id_class();
        Pw_1.id_break();
    }
}

