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

public class rrnG_2 {
    public Object[] id_class;
    public static Object[] id_break;
    private static float[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;
    private static boolean[] id_case;

    public Ml_1 id_byte() {
        return (Ml_1)this.id_class[id_protected[12]];
    }

    public rrnG_2() {
        this.id_case();
    }

    static {
        rrnG_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8BEC8ADB;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x754402E7F1050B7FL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-101, 104, -8, -57, -33, -37, 13, -114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(vm_3 vm_32) {
        vm_3 vm_33 = vm_32;
        this.id_class[rrnG_2.id_protected[16]] = vm_33;
    }

    public static rrnG_2 id_class(vm_3 vm_32, Ml_1 ml_1, int n, int n2, float f) {
        vm_3 vm_33 = vm_32;
        ((rrnG_2)rrnG_2.id_break[rrnG_2.id_protected[0]]).id_class[rrnG_2.id_protected[1]] = vm_33;
        Ml_1 ml_12 = ml_1;
        ((rrnG_2)rrnG_2.id_break[rrnG_2.id_protected[2]]).id_class[rrnG_2.id_protected[3]] = ml_12;
        Integer n3 = n;
        ((rrnG_2)rrnG_2.id_break[rrnG_2.id_protected[4]]).id_class[rrnG_2.id_protected[5]] = n3;
        Integer n4 = n2;
        ((rrnG_2)rrnG_2.id_break[rrnG_2.id_protected[6]]).id_class[rrnG_2.id_protected[7]] = n4;
        Float f2 = Float.valueOf(f);
        ((rrnG_2)rrnG_2.id_break[rrnG_2.id_protected[8]]).id_class[rrnG_2.id_protected[9]] = f2;
        return (rrnG_2)id_break[id_protected[10]];
    }

    public int id_class() {
        return (Integer)this.id_class[id_protected[14]];
    }

    public vm_3 id_break() {
        return (vm_3)this.id_class[id_protected[11]];
    }

    public int id_throws() {
        return (Integer)this.id_class[id_protected[13]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrnG_2.id_finally();
        rrnG_2.id_catch();
        rrnG_2.id_private();
        rrnG_2.id_implements();
        rrnG_2.id_extends();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[4];
        blArray[3] = true;
        id_case = blArray;
    }

    private static void id_catch() {
        short[] sArray = new short[17];
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

    private static void id_extends() {
        Object[] objectArray = new Object[]{new rrnG_2()};
        id_break = objectArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrnG_2.id_throws[1]] = id_case[1];
            objectArray[rrnG_2.id_throws[2]] = id_case[2];
            objectArray[rrnG_2.id_throws[3]] = Float.valueOf(id_byte[0]);
        }
    }

    private static void id_implements() {
        id_throws = new byte[]{5, 2, 3, 4};
    }

    public float id_protected() {
        return ((Float)this.id_class[id_protected[15]]).floatValue();
    }

    private static void id_private() {
        id_byte = new float[1];
    }
}

