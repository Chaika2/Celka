/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.FP;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.rrLE;
import celestial.rrQX;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PV
extends Pv_1 {
    private static short[] id_break;
    private static boolean[] id_byte;

    public PV(C_class c_class) {
        super(c_class);
    }

    static {
        PV.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB33E6DD4;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6F5D54295C6B9E44L;
    }

    @Override
    public void id_class(rrLE rrLE2) {
        vm_3 vm_32 = (vm_3)((Ps_1)this.id_class[PV.id_break[0]]).id_throws().id_class[id_break[1]];
        if (vm_32 instanceof FP) {
            FP fP = (FP)vm_32;
            if (fP.id_class != null && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[2]]).id_private().id_throws().id_protected(fP.id_class.id_private())) {
                rrLE2.id_class(id_byte[0]);
            }
        }
    }

    private static void id_class() {
        id_byte = new boolean[]{true};
    }

    private static void id_break() {
        short[] sArray = new short[3];
        sArray[0] = 1;
        sArray[1] = 73;
        id_break = sArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-39, -116, 104, 53, -4, -92, 99, 84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        PV.id_class();
        PV.id_break();
    }
}

