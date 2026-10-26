/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrtF_2;
import celestial.rrtN_2;
import celestial.rrtn_3;
import celestial.rrtt_3;
import celestial.rrtu_3;
import celestial.rruv_1;
import celestial.rrwP_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtj_3
extends rrtt_3 {
    private static short[] id_throws;
    public Object[] id_protected;
    private static float[] id_native;
    private static byte[] id_volatile;
    private static boolean[] id_final;
    private static int[] id_package;

    private static void id_char() {
        boolean[] blArray = new boolean[10];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        id_final = blArray;
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{12, 1, -70, 85, -75, -63, -94, 89}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrtj_3(rrtN_2 rrtN_22, rrIc_1 rrIc_12, float f, float f2, float f3, float f4) {
        super(rrtN_22, rrIc_12, f, f2, f3, f4);
        ArrayList arrayList;
        this.id_interface();
        this.id_protected[rrtj_3.id_throws[0]] = arrayList = new ArrayList();
        for (rrIk_1 rrIk_12 : rrIc_12.id_class()) {
            ((List)this.id_protected[id_throws[1]]).add(new rrwP_2(rrIk_12));
        }
        Float f5 = Float.valueOf(f4);
        this.id_protected[rrtj_3.id_throws[2]] = f5;
    }

    static {
        rrtj_3.ntfClinit();
    }

    private void id_interface() {
        if (this.id_protected == null) {
            Object[] objectArray = this.id_protected = new Object[id_volatile[2]];
            objectArray[rrtj_3.id_final[9]] = Float.valueOf(id_native[5]);
        }
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        if (!super.id_class(rrtu_32, n, n2, n3, bl)) {
            return id_final[0];
        }
        for (rrwP_2 rrwP_22 : this.id_goto()) {
            if (n3 != 0 || !rrwP_22.id_class().id_break(n, n2)) continue;
            rrwP_22.id_case().id_class(!rrwP_22.id_protected() ? id_final[1] : id_final[2], id_final[3], id_final[4]);
            return id_final[5];
        }
        return id_final[6];
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2) {
        super.id_class(ml_1, rrtu_32, n, n2);
        this.id_private().id_interface().id_class(ml_1, () -> this.id_class(ml_1));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x235A6F7DF5775BB4L;
    }

    private void id_class(Ml_1 ml_1) {
        this.id_interface();
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[3]]).id_finally();
        float f = this.id_package();
        float f2 = this.id_final();
        float f3 = this.id_new();
        float f4 = f;
        float f5 = f2 + id_native[0];
        byte by = id_volatile[0];
        byte by2 = id_volatile[1];
        rrtF_2.id_protected(ml_1, this, rrZO2, this.id_finally().id_throws(), f, f2, rrZF.k_, id_throws[4]);
        float f6 = id_native[1];
        for (rrwP_2 rrwP_22 : this.id_goto()) {
            rrIk_1 rrIk_12 = rrwP_22.id_case();
            float f7 = rrZO2.id_break(rrIk_12.id_throws());
            float f8 = rrZO2.id_class();
            if (f4 + f7 > f + f3) {
                f4 = f;
                f5 += (float)by2;
            }
            rrwP_22.id_class(new rruv_1(f4, f5, f7, f8).id_class(id_native[2], id_native[3]));
            rruv_1 rruv_12 = rrwP_22.id_class();
            rrtF_2.id_protected(ml_1, this, rrZO2, rrIk_12.id_throws(), f4, f5, rrIk_12.id_class() != false ? id_package[0] : id_package[1], id_throws[5]);
            f4 += f7 + (float)by;
            f6 = Math.max(f6, rruv_12.id_protected() + f8 - f2);
        }
        Float f9 = Float.valueOf(f6 + id_native[4]);
        this.id_protected[rrtj_3.id_throws[6]] = f9;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBC1CD98E;
    }

    private static /* synthetic */ void ntfClinit() {
        rrtj_3.id_char();
        rrtj_3.id_instanceof();
        rrtj_3.id_try();
        rrtj_3.id_throw();
        rrtj_3.id_while();
    }

    private List<rrwP_2> id_goto() {
        this.id_interface();
        return ((List)this.id_protected[id_throws[9]]).stream().filter(rrwP_22 -> rrwP_22.id_case().id_private() || rrwP_22.id_throws().id_case() ? id_final[7] : id_final[8]).toList();
    }

    @Override
    public float id_continue() {
        this.id_interface();
        return ((Float)this.id_protected[id_throws[7]]).floatValue();
    }

    private static void id_instanceof() {
        short[] sArray = new short[12];
        sArray[2] = 1;
        sArray[4] = 255;
        sArray[5] = 255;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[11] = 1;
        id_throws = sArray;
    }

    public List<rrwP_2> id_return() {
        this.id_interface();
        return (List)this.id_protected[id_throws[10]];
    }

    private static void id_throw() {
        id_volatile = new byte[]{5, 10, 2};
    }

    private static void id_try() {
        float[] fArray = new float[6];
        fArray[0] = 10.0f;
        fArray[2] = 1.0f;
        fArray[3] = 1.0f;
        fArray[4] = 15.0f;
        id_native = fArray;
    }

    private static void id_while() {
        id_package = new int[]{-16711936, -65536};
    }

    public float id_public() {
        this.id_interface();
        return ((Float)this.id_protected[id_throws[11]]).floatValue();
    }

    @Override
    public List<? extends rrtn_3> id_protected() {
        this.id_interface();
        return (List)this.id_protected[id_throws[8]];
    }
}

