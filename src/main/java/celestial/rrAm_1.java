/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAm_1 {
    private static boolean[] id_byte;
    private static short[] id_protected;
    public static Object[] id_class;
    public Object[] id_break;
    private static byte[] id_throws;

    private static void id_byte() {
        id_throws = new byte[]{2};
    }

    public rrAm_1() {
        this.id_protected();
    }

    static {
        rrAm_1.ntfClinit();
    }

    public vm_3 id_class() {
        return (vm_3)this.id_break[id_protected[5]];
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_break[rrAm_1.id_protected[7]] = bl2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-1, -83, -52, 68, 44, -38, -69, -74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC160293A;
    }

    public static rrAm_1 id_class(vm_3 vm_32) {
        vm_3 vm_33 = vm_32;
        ((rrAm_1)rrAm_1.id_class[rrAm_1.id_protected[0]]).id_break[rrAm_1.id_protected[1]] = vm_33;
        Boolean bl = id_byte[0];
        ((rrAm_1)rrAm_1.id_class[rrAm_1.id_protected[2]]).id_break[rrAm_1.id_protected[3]] = bl;
        return (rrAm_1)id_class[id_protected[4]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x88EC98B387650628L;
    }

    public boolean id_break() {
        return (Boolean)this.id_break[id_protected[6]];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrAm_1()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAm_1.id_catch();
        rrAm_1.id_case();
        rrAm_1.id_byte();
        rrAm_1.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[5];
        blArray[2] = true;
        blArray[4] = true;
        id_byte = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[8];
        sArray[3] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        id_protected = sArray;
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
            objectArray[rrAm_1.id_byte[2]] = id_byte[3];
        }
    }
}

