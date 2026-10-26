/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_import;
import celestial.J;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class d_1
extends J {
    public Object[] id_class;
    private static byte[] id_break;
    private static String[] id_byte;
    private static short[] id_protected;
    private static boolean[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        id_throws = blArray;
    }

    public d_1(C_import c_import, String string) {
        super(d_1.id_class(c_import, string));
        this.id_class();
        C_import c_import2 = c_import;
        this.id_class[d_1.id_protected[0]] = c_import2;
    }

    public d_1(C_import c_import, String string, Throwable throwable) {
        super(d_1.id_class(c_import, string), throwable);
        this.id_class();
        C_import c_import2 = c_import;
        this.id_class[d_1.id_protected[1]] = c_import2;
    }

    static {
        d_1.ntfClinit();
    }

    private static String id_class(C_import c_import, String string) {
        Object[] objectArray = new Object[id_break[0]];
        objectArray[d_1.id_throws[0]] = c_import.id_class() == id_break[1] ? id_byte[1] : Integer.toString(c_import.id_class() + id_throws[1]);
        objectArray[d_1.id_throws[2]] = string;
        return String.format(id_byte[0], objectArray);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFC314B13;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x67E479D621D30AF1L;
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[3]];
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{12, 92, 81, 57, -108, -50, -111, 82}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_byte = new String[]{new String("\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0430\u0440\u0433\u0443\u043c\u0435\u043d\u0442\u0435 #%s: %s"), new String("<unknown>")};
    }

    private static void id_throws() {
        id_protected = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        d_1.id_byte();
        d_1.id_break();
        d_1.id_throws();
        d_1.id_protected();
    }

    private static void id_protected() {
        id_break = new byte[]{2, -1};
    }
}

