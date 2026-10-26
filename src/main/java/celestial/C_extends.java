/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_private;
import celestial.Pc_1;
import celestial.Pd_1;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_extends<T> {
    public Object[] id_class;
    private static String[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;

    public Class<T> id_byte() {
        return Pc_1.id_class(this.id_throws());
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public C_extends(C_private c_private, Object object) {
        Object object2;
        Object object3;
        this.id_case();
        C_private c_private2 = c_private;
        this.id_class[C_extends.id_protected[0]] = c_private2;
        if (object == null) {
            throw new IllegalArgumentException(id_break[0]);
        }
        this.id_class[C_extends.id_protected[1]] = object3 = object;
        this.id_class[C_extends.id_protected[2]] = object2 = object;
    }

    static {
        C_extends.ntfClinit();
    }

    public String toString() {
        return Pd_1.id_byte(this);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x48B49F93BF25B146L;
    }

    @Deprecated
    public T id_class() {
        return (T)this.id_class[id_protected[3]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x467096A8;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{5, -20, -66, -87, -59, 24, 113, -26}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_break() {
        Object object;
        this.id_class[C_extends.id_protected[6]] = object = this.id_class[id_protected[5]];
    }

    public Type id_throws() {
        return (Type)((Map)((C_private)this.id_class[C_extends.id_protected[7]]).Pj[id_protected[8]]).get(this);
    }

    private static /* synthetic */ void ntfClinit() {
        C_extends.id_implements();
        C_extends.id_catch();
        C_extends.id_private();
    }

    private static void id_catch() {
        short[] sArray = new short[9];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[7] = 3;
        sArray[8] = 2;
        id_protected = sArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static void id_implements() {
        id_break = new String[]{new String("Cannot determine value type class from null")};
    }

    public String id_protected() {
        return (String)this.id_class[id_protected[4]];
    }

    private static void id_private() {
        id_byte = new byte[]{4};
    }
}

