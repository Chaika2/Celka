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

public class rrAZ {
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    public static Object[] id_break;

    private static void id_byte() {
        id_protected = new short[6];
    }

    public rrAZ() {
        this.id_throws();
    }

    static {
        rrAZ.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD9112BBB;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6A572E36ACEA9CD4L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-83, -92, 22, -113, -42, -102, 53, 59}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public vm_3 id_class() {
        return (vm_3)this.id_class[id_protected[5]];
    }

    public static void id_class(vm_3 vm_32) {
        rrAZ rrAZ2 = rrAZ.id_break(vm_32);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[3]]).id_finally().id_class(rrAZ2);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[4]]).id_class(rrAZ2);
    }

    public static rrAZ id_break(vm_3 vm_32) {
        vm_3 vm_33 = vm_32;
        ((rrAZ)rrAZ.id_break[rrAZ.id_protected[0]]).id_class[rrAZ.id_protected[1]] = vm_33;
        return (rrAZ)id_break[id_protected[2]];
    }

    private static void id_break() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrAZ.id_break();
        rrAZ.id_byte();
        rrAZ.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrAZ()};
        id_break = objectArray;
    }
}

