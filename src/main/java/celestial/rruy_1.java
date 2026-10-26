/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rjK_2;
import celestial.rqO_2;
import celestial.rrZO;
import celestial.rrtu_3;
import celestial.rrun_1;
import celestial.rruv_1;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruy_1
extends rrun_1 {
    public Object[] id_byte;
    private static float[] id_protected;
    private static short[] id_throws;
    private static byte[] id_case;
    private static boolean[] id_catch;

    private static void id_int() {
        id_catch = new boolean[2];
    }

    public rruy_1(Supplier<String> supplier, rrZO rrZO2, Supplier<Integer> supplier2, Supplier<rjK_2> supplier3, Supplier<rqO_2> supplier4, Supplier<rjK_2> supplier5, Supplier<rjK_2> supplier6, Supplier<Integer> supplier7) {
        super(supplier4, supplier5, supplier6, supplier7);
        Supplier<rjK_2> supplier8;
        Supplier<Integer> supplier9;
        Supplier<String> supplier10;
        this.id_new();
        this.id_byte[rruy_1.id_throws[0]] = supplier10 = supplier;
        rrZO rrZO3 = rrZO2;
        this.id_byte[rruy_1.id_throws[1]] = rrZO3;
        this.id_byte[rruy_1.id_throws[2]] = supplier9 = supplier2;
        this.id_byte[rruy_1.id_throws[3]] = supplier8 = supplier3;
    }

    static {
        rruy_1.ntfClinit();
    }

    private static void id_this() {
        short[] sArray = new short[8];
        sArray[0] = 3;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[7] = 3;
        id_throws = sArray;
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        this.id_new();
        super.id_class(ml_1, rrtu_32, n, n2, bl);
        rruv_1 rruv_12 = this.id_catch();
        rjK_2 rjK_22 = (rjK_2)((Supplier)this.id_byte[id_throws[4]]).get();
        int n3 = ColorHelper.id_class((int)((Integer)((Supplier)this.id_byte[id_throws[5]]).get()), this.id_finally());
        ((rrZO)this.id_byte[id_throws[6]]).id_break(ml_1, (String)((Supplier)this.id_byte[id_throws[7]]).get(), rruv_12.id_break() + rjK_22.id_byte, rruv_12.id_protected() + rjK_22.id_protected, ColorHelper.id_break(n3, (int)(id_protected[0] * this.id_package().get().floatValue())), id_catch[0], id_catch[1]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4076422D;
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5453E7C761FC57C7L;
    }

    private static /* synthetic */ void ntfClinit() {
        rruy_1.id_int();
        rruy_1.id_this();
        rruy_1.id_continue();
        rruy_1.id_super();
    }

    private static void id_continue() {
        id_protected = new float[]{255.0f};
    }

    private void id_new() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_case[0]];
        }
    }

    private static void id_super() {
        id_case = new byte[]{4};
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{126, -81, 47, -112, 55, -109, -53, -27}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

