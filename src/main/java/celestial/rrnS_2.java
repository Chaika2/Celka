/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnS_2 {
    public Object[] id_class;
    public static Object[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;
    private static float[] id_case;

    public int id_byte() {
        return (Integer)this.id_class[id_protected[14]];
    }

    public rrnS_2() {
        this.id_private();
    }

    static {
        rrnS_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x22720099055261A3L;
    }

    public static rrnS_2 id_class(vm_3 vm_32, Ml_1 ml_1, int n, int n2, float f) {
        vm_3 vm_33 = vm_32;
        ((rrnS_2)rrnS_2.id_break[rrnS_2.id_protected[0]]).id_class[rrnS_2.id_protected[1]] = vm_33;
        Ml_1 ml_12 = ml_1;
        ((rrnS_2)rrnS_2.id_break[rrnS_2.id_protected[2]]).id_class[rrnS_2.id_protected[3]] = ml_12;
        Integer n3 = n;
        ((rrnS_2)rrnS_2.id_break[rrnS_2.id_protected[4]]).id_class[rrnS_2.id_protected[5]] = n3;
        Integer n4 = n2;
        ((rrnS_2)rrnS_2.id_break[rrnS_2.id_protected[6]]).id_class[rrnS_2.id_protected[7]] = n4;
        Float f2 = Float.valueOf(f);
        ((rrnS_2)rrnS_2.id_break[rrnS_2.id_protected[8]]).id_class[rrnS_2.id_protected[9]] = f2;
        return (rrnS_2)id_break[id_protected[10]];
    }

    public float id_class() {
        return ((Float)this.id_class[id_protected[15]]).floatValue();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBBD58D62;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{113, -55, -106, -9, 70, -72, -64, 40}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public vm_3 id_break() {
        return (vm_3)this.id_class[id_protected[11]];
    }

    public Ml_1 id_throws() {
        return (Ml_1)this.id_class[id_protected[12]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrnS_2.id_catch();
        rrnS_2.id_implements();
        rrnS_2.id_extends();
        rrnS_2.id_case();
        rrnS_2.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{new rrnS_2()};
        id_break = objectArray;
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[4];
        blArray[3] = true;
        id_byte = blArray;
    }

    private static void id_extends() {
        id_case = new float[1];
    }

    private static void id_case() {
        id_throws = new byte[]{5, 2, 3, 4};
    }

    private static void id_implements() {
        short[] sArray = new short[16];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[7] = 3;
        sArray[9] = 4;
        sArray[12] = 1;
        sArray[13] = 2;
        sArray[14] = 3;
        sArray[15] = 4;
        id_protected = sArray;
    }

    public int id_protected() {
        return (Integer)this.id_class[id_protected[13]];
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrnS_2.id_throws[1]] = id_byte[1];
            objectArray[rrnS_2.id_throws[2]] = id_byte[2];
            objectArray[rrnS_2.id_throws[3]] = Float.valueOf(id_case[0]);
        }
    }
}

