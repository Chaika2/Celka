/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Fu_1;
import celestial.Ml_1;
import celestial.Qw_1;
import celestial.cb_3;
import celestial.rJr_1;
import celestial.rgP_2;
import celestial.rqO_2;
import celestial.vm_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTW
extends Fu_1<rJr_1> {
    private static boolean[] id_case;
    private static float[] id_catch;
    private static short[] id_private;
    public Object[] id_class;
    private static String[] id_implements;
    private static byte[] id_finally;
    public static Object[] id_throws;

    private static void id_char() {
        id_catch = new float[]{1.0f};
    }

    public rrTW(vm_3 vm_32, rJr_1 rJr_12, rJr_1 rJr_13, rgP_2 rgP_22, float[] fArray) {
        super(rJr_13, null, rgP_22);
        this.id_final();
        if (fArray == null || fArray.length != id_finally[0]) {
            throw new IllegalArgumentException(id_implements[0]);
        }
        vm_3 vm_33 = vm_32;
        this.id_class[rrTW.id_private[0]] = vm_33;
        rJr_1 rJr_14 = rJr_12;
        this.id_class[rrTW.id_private[1]] = rJr_14;
        float[] fArray2 = fArray;
        this.id_class[rrTW.id_private[2]] = fArray2;
        this.id_synchronized = id_private[3];
        this.id_return = id_finally[1];
    }

    static {
        rrTW.ntfClinit();
    }

    private static void id_interface() {
        boolean[] blArray = new boolean[9];
        blArray[1] = true;
        blArray[5] = true;
        blArray[8] = true;
        id_case = blArray;
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        this.id_final();
        if ((n == id_private[6] || ((Qw_1)this.id_volatile.id_class[rrTW.id_private[7]]).z.id_class(n, n2)) && (vm_3)this.id_class[id_private[8]] != null) {
            this.id_volatile.id_break((vm_3)this.id_class[id_private[9]]);
            if ((rJr_1)this.id_class[id_private[10]] != null && (cb_3)this.id_volatile.id_class[id_private[11]] != null) {
                rJr_1 rJr_12 = (rJr_1)this.id_class[id_private[13]];
                ((cb_3)this.id_volatile.id_class[rrTW.id_private[12]]).id_implements[rrTW.id_private[14]] = rJr_12;
            }
            return id_case[5];
        }
        return id_case[6];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7961B234549B948CL;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        super.id_class(ml_1, n, n2, f);
        this.id_break(ml_1, n, n2);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-11, 72, 107, -44, -52, 82, -127, 4}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(Ml_1 ml_1, float f, int n, int n2) {
        this.id_final();
        float[] fArray = (float[])this.id_class[id_private[4]];
        RenderSystem.color4f(fArray[id_case[0]], fArray[id_case[1]], fArray[id_finally[2]], id_catch[0]);
        this.id_volatile.A().id_class((rqO_2)id_throws[id_private[5]]);
        int n3 = this.id_char;
        int n4 = this.id_abstract;
        this.id_break(ml_1, n3, n4, id_case[2], id_case[3], this.id_synchronized, this.id_return);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        return id_case[4];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCF8FB579;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTW.id_interface();
        rrTW.id_finally();
        rrTW.id_abstract();
        rrTW.id_char();
        rrTW.id_native();
        rrTW.id_package();
    }

    private static void id_finally() {
        id_implements = new String[]{new String("ShulkerColors must be an array of three float values representing RGB colors."), new String("celestial/images/shulker_preview/container_with_title.png")};
    }

    private static void id_package() {
        Object[] objectArray = new Object[]{new rqO_2(id_implements[1])};
        id_throws = objectArray;
    }

    private static void id_abstract() {
        short[] sArray = new short[15];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 176;
        sArray[4] = 2;
        sArray[6] = 256;
        sArray[7] = 20;
        sArray[10] = 1;
        sArray[11] = 57;
        sArray[12] = 57;
        sArray[13] = 1;
        sArray[14] = 4;
        id_private = sArray;
    }

    private void id_final() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
        }
    }

    private static void id_native() {
        id_finally = new byte[]{3, 78, 2, 3};
    }
}

