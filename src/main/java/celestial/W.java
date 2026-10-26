/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_import;
import celestial.d_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class W
extends d_1 {
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static String[] id_protected;

    private static void id_byte() {
        id_byte = new byte[]{2};
    }

    public W(C_import c_import, Throwable throwable) {
        super(c_import, throwable.getMessage());
    }

    public W(C_import c_import, String string) {
        Object[] objectArray = new Object[id_break[2]];
        objectArray[W.id_break[3]] = string;
        super(c_import, String.format(id_protected[1], objectArray));
    }

    public W(C_import c_import, String string, Throwable throwable) {
        Object[] objectArray = new Object[id_break[0]];
        objectArray[W.id_break[1]] = string;
        super(c_import, String.format(id_protected[0], objectArray), throwable);
    }

    public W(C_import c_import, String string, String string2) {
        Object[] objectArray = new Object[id_byte[0]];
        objectArray[W.id_break[4]] = string;
        objectArray[W.id_break[5]] = string2;
        super(c_import, String.format(id_protected[2], objectArray));
    }

    static {
        W.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4A834445;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2DCB93EA78626027L;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        id_break = blArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-98, -69, -121, -21, -36, -55, -38, -3}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_protected = new String[]{new String("\u041e\u0436\u0438\u0434\u0430\u0435\u0442\u0441\u044f %s"), new String("\u041e\u0436\u0438\u0434\u0430\u0435\u0442\u0441\u044f %s"), new String("\u041e\u0436\u0438\u0434\u0430\u043b\u043e\u0441\u044c %s, \u043d\u043e \u0432\u043c\u0435\u0441\u0442\u043e \u044d\u0442\u043e\u0433\u043e \u043f\u043e\u043b\u0443\u0447\u0435\u043d\u043e %s")};
    }

    private static /* synthetic */ void ntfClinit() {
        W.id_class();
        W.id_break();
        W.id_byte();
    }
}

