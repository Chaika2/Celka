/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rjK_2;
import celestial.rji_3;
import celestial.rqO_2;
import celestial.rrZO;
import celestial.rrfD_2;
import celestial.rrtu_3;
import celestial.rrup_1;
import celestial.rruv_1;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruH
extends rrup_1 {
    private static short[] id_protected;
    private static byte[] id_throws;
    public Object[] id_break;
    private static float[] id_case;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{27, 107, -44, 24, -67, -89, 19, -15}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Supplier<rqO_2> id_int() {
        this.id_synchronized();
        return (Supplier)this.id_break[id_protected[8]];
    }

    public rruH(Supplier<rqO_2> supplier, Supplier<rjK_2> supplier2, Supplier<rjK_2> supplier3, Supplier<Integer> supplier4, rrZO rrZO2, Supplier<String> supplier5, Supplier<rjK_2> supplier6, Supplier<rjK_2> supplier7, Supplier<rjK_2> supplier8, Supplier<Integer> supplier9, Supplier<rji_3> supplier10) {
        super(rrZO2, supplier5, supplier6, supplier7, supplier8, supplier9, supplier10);
        Supplier<rqO_2> supplier11;
        Supplier<Integer> supplier12;
        Supplier<rjK_2> supplier13;
        Supplier<rjK_2> supplier14;
        this.id_synchronized();
        this.id_break[rruH.id_protected[0]] = supplier14 = supplier2;
        this.id_break[rruH.id_protected[1]] = supplier13 = supplier3;
        this.id_break[rruH.id_protected[2]] = supplier12 = supplier4;
        this.id_break[rruH.id_protected[3]] = supplier11 = supplier;
    }

    static {
        rruH.ntfClinit();
    }

    private static void id_this() {
        id_throws = new byte[]{4};
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        this.id_synchronized();
        super.id_class(ml_1, rrtu_32, n, n2, bl);
        rruv_1 rruv_12 = this.id_catch();
        rjK_2 rjK_22 = this.id_new().get();
        rjK_2 rjK_23 = this.id_package().get();
        int n3 = ColorHelper.id_class((int)((Integer)((Supplier)this.id_break[id_protected[4]]).get()), this.id_finally());
        rrfD_2.id_class(ml_1, (rqO_2)((Supplier)this.id_break[id_protected[5]]).get(), rruv_12.id_break() + rjK_22.id_byte, rruv_12.id_protected() + rjK_22.id_protected, rjK_23.id_byte, rjK_23.id_protected, ColorHelper.id_break(n3, (int)(id_case[0] * this.id_continue().get().floatValue())));
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBCA61810EC66476FL;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6C9AB67E;
    }

    private static /* synthetic */ void ntfClinit() {
        rruH.id_else();
        rruH.id_return();
        rruH.id_this();
    }

    @Override
    public float id_finally() {
        return id_case[1] - id_case[2] * this.id_protected();
    }

    private static void id_else() {
        short[] sArray = new short[9];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 2;
        sArray[5] = 3;
        sArray[7] = 1;
        sArray[8] = 3;
        id_protected = sArray;
    }

    public Supplier<rjK_2> id_new() {
        this.id_synchronized();
        return (Supplier)this.id_break[id_protected[6]];
    }

    public Supplier<rjK_2> id_package() {
        this.id_synchronized();
        return (Supplier)this.id_break[id_protected[7]];
    }

    private static void id_return() {
        id_case = new float[]{255.0f, 1.0f, 0.2f};
    }

    private void id_synchronized() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }
}

