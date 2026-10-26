/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtU_2
extends Record {
    private static boolean[] id_byte;
    private static String[] id_protected;
    public boolean id_class;
    public String id_break;

    public boolean id_byte() {
        return this.id_class;
    }

    public rrtU_2(boolean bl, String string) {
        this.id_class = bl;
        this.id_break = string;
    }

    static {
        rrtU_2.ntfClinit();
    }

    @Override
    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{rrtU_2.class, "isValid;errorMessage", "id_class", "id_break"}, this, object);
    }

    @Override
    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{rrtU_2.class, "isValid;errorMessage", "id_class", "id_break"}, this);
    }

    @Override
    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{rrtU_2.class, "isValid;errorMessage", "id_class", "id_break"}, this);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x605FE76887D0AB9L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF2BC8CB3;
    }

    public static rrtU_2 id_class() {
        return new rrtU_2(id_byte[1], id_protected[0]);
    }

    public static rrtU_2 id_class(String string) {
        return new rrtU_2(id_byte[0], string);
    }

    public String id_break() {
        return this.id_break;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{124, -14, 79, 68, -39, -1, -41, 35}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_protected = new String[]{new String("")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrtU_2.id_protected();
        rrtU_2.id_throws();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }
}

