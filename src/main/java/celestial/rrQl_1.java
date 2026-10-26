/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Ll_1;
import celestial.Ml_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.rrQC;
import celestial.rrQI;
import celestial.rrQg_1;
import celestial.rrQp_1;
import celestial.rrQq_1;
import celestial.rrQy_1;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQl_1
extends vm_3 {
    private static boolean[] id_throws;
    private static byte[] id_case;
    private static short[] id_catch;
    private static int[] id_private;
    public Object[] id_class;
    private static String[] id_implements;

    private static void id_int() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        id_throws = blArray;
    }

    public rrQl_1(rrQC rrQC2, vm_3 vm_32) {
        super(new rgn_3(id_implements[0]));
        this.id_package();
        Object var7_3 = null;
        this.id_class[rrQl_1.id_catch[0]] = var7_3;
        vm_3 vm_33 = vm_32;
        this.id_class[rrQl_1.id_catch[1]] = vm_33;
        rrQC rrQC3 = rrQC2;
        this.id_class[rrQl_1.id_catch[2]] = rrQC3;
    }

    static {
        rrQl_1.ntfClinit();
    }

    private static void id_interface() {
        short[] sArray = new short[22];
        sArray[0] = 2;
        sArray[1] = 1;
        sArray[3] = 2;
        sArray[5] = 128;
        sArray[6] = 128;
        sArray[8] = 128;
        sArray[9] = 128;
        sArray[11] = 128;
        sArray[12] = 128;
        sArray[13] = 2;
        sArray[14] = 2;
        sArray[15] = 1;
        sArray[17] = 1;
        sArray[19] = 1;
        sArray[21] = 1;
        id_catch = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBAB037F6119DE472L;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_package();
        this.id_class(ml_1);
        this.id_super.id_class(ml_1, this.id_extends, this.id_package / id_case[32], this.id_int / id_case[33] - id_case[34], id_private[0]);
        if ((rgP_2)this.id_class[id_catch[13]] != null) {
            this.id_super.id_class(ml_1, (rgP_2)this.id_class[id_catch[14]], this.id_package / id_case[35], this.id_int / id_case[36] - id_case[37], id_private[1]);
        }
        super.id_class(ml_1, n, n2, f);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{57, 109, -80, 35, -110, 80, -46, -118}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6B8D2BEB;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQl_1.id_int();
        rrQl_1.id_finally();
        rrQl_1.id_interface();
        rrQl_1.id_final();
        rrQl_1.id_native();
    }

    private static void id_finally() {
        id_implements = new String[]{new String("gui.authme.method.title"), new String("gui.authme.method.greeting"), new String("gui.authme.method.button.microsoft"), new String("gui.authme.method.button.mojang"), new String("gui.authme.method.button.offline"), new String("gui.back"), new String("gui.authme.method.button.offline"), new String("gui.authme.method.button.mojang"), new String("gui.authme.method.button.microsoft")};
    }

    private void id_package() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[38]];
        }
    }

    private static void id_final() {
        id_case = new byte[]{2, 20, 10, 4, 2, 5, 20, 20, 20, 2, 10, 2, 5, 20, 20, 20, 20, 2, 10, 4, 2, 5, 20, 20, 40, 20, 2, 50, 2, 27, 100, 20, 2, 2, 27, 2, 2, 47, 3};
    }

    @Override
    public void id_volatile() {
        this.id_package();
        super.id_volatile();
        id_import.id_break((vm_3)this.id_class[id_catch[15]]);
    }

    private static void id_native() {
        id_private = new int[]{0xFFFFFF, 0xA0A0A0};
    }

    @Override
    public void v_() {
        this.id_package();
        super.v_();
        Object[] objectArray = new Object[id_throws[0]];
        objectArray[rrQl_1.id_throws[1]] = new rgN_2(rrQg_1.id_protected().id_byte()).id_class(rgF_2.YELLOW);
        rgn_3 rgn_32 = new rgn_3(id_implements[1], objectArray);
        this.id_class[rrQl_1.id_catch[3]] = rgn_32;
        this.id_class(new Ll_1(this.id_package / id_case[0] - id_case[1] - id_case[2] - id_case[3], this.id_int / id_case[4] - id_case[5], id_case[6], id_case[7], id_throws[2], id_throws[3], id_case[8], (rqO_2)rrQI.id_class[id_catch[4]], id_catch[5], id_catch[6], lF -> {
            this.id_package();
            id_import.id_break(new rrQy_1((rrQC)this.id_class[id_catch[20]], (vm_3)this, (vm_3)this.id_class[id_catch[21]]));
        }, (lF, ml_1, n, n2) -> this.id_class(ml_1, new rgn_3(id_implements[8]), n, n2), new rgn_3(id_implements[2])));
        this.id_class(new Ll_1(this.id_package / id_case[9] - id_case[10], this.id_int / id_case[11] - id_case[12], id_case[13], id_case[14], id_case[15], id_throws[4], id_case[16], (rqO_2)rrQI.id_class[id_catch[7]], id_catch[8], id_catch[9], lF -> {
            this.id_package();
            id_import.id_break(new rrQp_1((rrQC)this.id_class[id_catch[18]], (vm_3)this, (vm_3)this.id_class[id_catch[19]]));
        }, (lF, ml_1, n, n2) -> this.id_class(ml_1, new rgn_3(id_implements[7]), n, n2), new rgn_3(id_implements[3])));
        this.id_class(new Ll_1(this.id_package / id_case[17] + id_case[18] + id_case[19], this.id_int / id_case[20] - id_case[21], id_case[22], id_case[23], id_case[24], id_throws[5], id_case[25], (rqO_2)rrQI.id_class[id_catch[10]], id_catch[11], id_catch[12], lF -> {
            this.id_package();
            id_import.id_break(new rrQq_1((rrQC)this.id_class[id_catch[16]], (vm_3)this, (vm_3)this.id_class[id_catch[17]]));
        }, (lF, ml_1, n, n2) -> this.id_class(ml_1, new rgn_3(id_implements[6]), n, n2), new rgn_3(id_implements[4])));
        this.id_class(new LF(this.id_package / id_case[26] - id_case[27], this.id_int / id_case[28] + id_case[29], id_case[30], id_case[31], new rgn_3(id_implements[5]), lF -> this.id_volatile()));
    }
}

