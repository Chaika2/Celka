/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.Om_1;
import celestial.rrQX;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFY
extends Om_1 {
    public Object[] id_class;
    public static Object[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;

    public rrFY() {
        this.id_break();
    }

    static {
        rrFY.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9A79F1B07E3AA6C5L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9C9913A;
    }

    public vm_3 id_class() {
        this.id_break();
        return (vm_3)this.id_class[id_protected[6]];
    }

    public static rrFY id_class(vm_3 vm_32) {
        rrFY rrFY2 = rrFY.id_break(vm_32);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[4]]).id_class(rrFY2);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[5]]).id_finally().id_class(rrFY2);
        return rrFY2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-65, -7, 52, -100, -16, 93, -65, 112}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static rrFY id_break(vm_3 vm_32) {
        vm_3 vm_33 = vm_32;
        ((rrFY)rrFY.id_break[rrFY.id_protected[0]]).id_class[rrFY.id_protected[1]] = vm_33;
        ((rrFY)id_break[id_protected[2]]).id_class(id_byte[0]);
        return (rrFY)id_break[id_protected[3]];
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[2]];
        }
    }

    private static void id_throws() {
        id_protected = new short[7];
    }

    private static /* synthetic */ void ntfClinit() {
        rrFY.id_protected();
        rrFY.id_throws();
        rrFY.id_case();
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrFY()};
        id_break = objectArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_byte = blArray;
    }
}

