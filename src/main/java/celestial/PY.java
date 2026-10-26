/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.LinkedHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PY
extends LinkedHashMap<String, String> {
    private static String[] id_class;

    public PY() {
        this.put(id_class[0], id_class[1]);
        this.put(id_class[2], id_class[3]);
        this.put(id_class[4], id_class[5]);
        this.put(id_class[6], id_class[7]);
        this.put(id_class[8], id_class[9]);
        this.put(id_class[10], id_class[11]);
    }

    static {
        PY.id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCA370D2A;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-30, 65, 33, -111, -2, 48, -15, -71}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_class = new String[]{new String("sololite"), new String("\u0421\u043e\u043b\u043e\u041b\u0430\u0439\u0442"), new String("duolite"), new String("\u0414\u0443\u043e\u041b\u0430\u0439\u0442"), new String("triolite"), new String("\u0422\u0440\u0438\u043e\u041b\u0430\u0439\u0442"), new String("clanlite"), new String("\u041a\u043b\u0430\u043d\u041b\u0430\u0439\u0442"), new String("lite120"), new String("\u041b\u0430\u0439\u0442120"), new String("classic"), new String("\u041a\u043b\u0430\u0441\u0441\u0438\u043a")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x70FC4FA6A8135C37L;
    }
}

