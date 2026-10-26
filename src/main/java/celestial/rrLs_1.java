/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.Om_1;
import celestial.Va_1;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLs_1
extends Om_1 {
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;
    public Object[] id_class;
    public static Object[] id_break;

    public rrLs_1() {
        this.id_throws();
    }

    static {
        rrLs_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4D778EC9;
    }

    public static rrLs_1 id_class(Va_1 va_1, int n, int n2) {
        rrLs_1 rrLs_12 = rrLs_1.id_break(va_1, n, n2);
        if (n2 == id_protected[1]) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[8]]).id_finally().id_class(rrLs_12);
            ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[9]]).id_class(rrLs_12);
        }
        return rrLs_12;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{45, -26, 23, -36, 8, 17, 53, 116}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCC5403813E0619DCL;
    }

    public int id_class() {
        this.id_throws();
        return (Integer)this.id_class[id_byte[12]];
    }

    private static rrLs_1 id_break(Va_1 va_1, int n, int n2) {
        Va_1 va_12 = va_1;
        ((rrLs_1)rrLs_1.id_break[rrLs_1.id_byte[0]]).id_class[rrLs_1.id_byte[1]] = va_12;
        Integer n3 = n;
        ((rrLs_1)rrLs_1.id_break[rrLs_1.id_byte[2]]).id_class[rrLs_1.id_byte[3]] = n3;
        Integer n4 = n2;
        ((rrLs_1)rrLs_1.id_break[rrLs_1.id_byte[4]]).id_class[rrLs_1.id_byte[5]] = n4;
        ((rrLs_1)id_break[id_byte[6]]).id_class(id_protected[0]);
        return (rrLs_1)id_break[id_byte[7]];
    }

    public Va_1 id_break() {
        this.id_throws();
        return (Va_1)this.id_class[id_byte[10]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrLs_1.id_protected[3]] = id_protected[4];
            objectArray[rrLs_1.id_throws[1]] = id_protected[5];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrLs_1.id_case();
        rrLs_1.id_private();
        rrLs_1.id_catch();
        rrLs_1.id_implements();
    }

    private static void id_catch() {
        id_throws = new byte[]{3, 2};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_protected = blArray;
    }

    private static void id_implements() {
        Object[] objectArray = new Object[]{new rrLs_1()};
        id_break = objectArray;
    }

    public int id_protected() {
        this.id_throws();
        return (Integer)this.id_class[id_byte[11]];
    }

    private static void id_private() {
        short[] sArray = new short[13];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[11] = 1;
        sArray[12] = 2;
        id_byte = sArray;
    }
}

