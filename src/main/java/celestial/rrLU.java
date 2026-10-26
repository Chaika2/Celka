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

public class rrLU {
    public Object[] id_class;
    public static Object[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    public rrLU() {
        this.id_break();
    }

    static {
        rrLU.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{93, -40, -92, -1, 36, 29, 124, -104}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x79BA0B2D;
    }

    public static void id_class(vm_3 vm_32) {
        rrLU rrLU2 = rrLU.id_break(vm_32);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[3]]).id_class(rrLU2);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[4]]).id_finally().id_class(rrLU2);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3318CBB61D2CFDBFL;
    }

    public vm_3 id_class() {
        return (vm_3)this.id_class[id_protected[5]];
    }

    private static rrLU id_break(vm_3 vm_32) {
        vm_3 vm_33 = vm_32;
        ((rrLU)rrLU.id_break[rrLU.id_protected[0]]).id_class[rrLU.id_protected[1]] = vm_33;
        return (rrLU)id_break[id_protected[2]];
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    private static void id_throws() {
        id_protected = new short[6];
    }

    private static /* synthetic */ void ntfClinit() {
        rrLU.id_byte();
        rrLU.id_throws();
        rrLU.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrLU()};
        id_break = objectArray;
    }
}

