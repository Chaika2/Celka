/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrQH
extends vm_3 {
    private static byte[] id_throws;
    private static short[] id_case;
    private static boolean[] id_catch;
    public Object[] id_class;

    public rrQH(rgP_2 rgP_22, vm_3 vm_32, vm_3 vm_33) {
        super(rgP_22);
        this.id_package();
        vm_3 vm_34 = vm_32;
        this.id_class[rrQH.id_case[0]] = vm_34;
        vm_3 vm_35 = vm_33;
        this.id_class[rrQH.id_case[1]] = vm_35;
    }

    static {
        rrQH.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-29, -25, -39, 21, -96, 6, -122, -4}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9BD606AA1F8370ABL;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEBD45762;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQH.id_final();
        rrQH.id_finally();
        rrQH.id_native();
    }

    private static void id_finally() {
        short[] sArray = new short[7];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 2;
        sArray[5] = 1;
        id_case = sArray;
    }

    private void id_package() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrQH.id_throws[1]] = id_catch[0];
            objectArray[rrQH.id_throws[2]] = id_catch[1];
        }
    }

    @Override
    public void id_private() {
        this.id_package();
        super.id_private();
        if (((Boolean)this.id_class[id_case[2]]).booleanValue() && ((Boolean)this.id_class[id_case[3]]).booleanValue()) {
            this.id_volatile();
        }
    }

    private static void id_final() {
        id_catch = new boolean[2];
    }

    @Override
    public void id_volatile() {
        this.id_package();
        super.id_volatile();
        id_import.id_break((Boolean)this.id_class[id_case[4]] != false ? (vm_3)this.id_class[id_case[5]] : (vm_3)this.id_class[id_case[6]]);
    }

    private static void id_native() {
        id_throws = new byte[]{4, 2, 3};
    }

    @Override
    public void v_() {
        super.v_();
    }
}

