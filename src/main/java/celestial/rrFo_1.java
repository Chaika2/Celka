/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.rrQX;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFo_1 {
    public Object[] id_class;
    private static byte[] id_byte;
    public static Object[] id_break;
    private static boolean[] id_protected;
    private static short[] id_throws;

    private static void id_byte() {
        id_byte = new byte[]{2};
    }

    public rrFo_1() {
        this.id_throws();
    }

    static {
        rrFo_1.ntfClinit();
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrFo_1.id_throws[9]] = bl2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5493127093F682BDL;
    }

    public boolean id_class() {
        return (Boolean)this.id_class[id_throws[8]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{4, -112, -7, -46, 71, -23, 10, -67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrFo_1 id_class(vm_3 vm_32) {
        vm_3 vm_33 = vm_32;
        ((rrFo_1)rrFo_1.id_break[rrFo_1.id_throws[0]]).id_class[rrFo_1.id_throws[1]] = vm_33;
        Boolean bl = id_protected[0];
        ((rrFo_1)rrFo_1.id_break[rrFo_1.id_throws[2]]).id_class[rrFo_1.id_throws[3]] = bl;
        return (rrFo_1)id_break[id_throws[4]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x85BCF935;
    }

    public static rrFo_1 id_break(vm_3 vm_32) {
        rrFo_1 rrFo_12 = rrFo_1.id_class(vm_32);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[5]]).id_finally().id_class(rrFo_12);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_throws[6]]).id_class(rrFo_12);
        return rrFo_12;
    }

    public vm_3 id_break() {
        return (vm_3)this.id_class[id_throws[7]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrFo_1.id_protected[2]] = id_protected[3];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrFo_1.id_case();
        rrFo_1.id_catch();
        rrFo_1.id_byte();
        rrFo_1.id_protected();
    }

    private static void id_catch() {
        short[] sArray = new short[10];
        sArray[3] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        id_throws = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[5];
        blArray[2] = true;
        blArray[4] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrFo_1()};
        id_break = objectArray;
    }
}

