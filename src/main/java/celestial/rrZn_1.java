/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.Category;
import celestial.rjK_2;
import celestial.rji_3;
import celestial.rqO_2;
import celestial.rrZO;
import celestial.rruH;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZn_1
extends rruH {
    private static boolean[] id_throws;
    public Object[] id_protected;
    private static short[] id_case;
    private static float[] id_catch;

    public rrZn_1(Category category, rrZO rrZO2, Supplier<rqO_2> supplier, Supplier<rjK_2> supplier2, Supplier<rjK_2> supplier3, Supplier<Integer> supplier4, Supplier<String> supplier5, Supplier<rjK_2> supplier6, Supplier<rjK_2> supplier7, Supplier<rjK_2> supplier8, Supplier<Integer> supplier9, Supplier<rji_3> supplier10) {
        super(supplier, supplier2, supplier3, supplier4, rrZO2, supplier5, supplier6, supplier7, supplier8, supplier9, supplier10);
        this.id_synchronized();
        Category category2 = category;
        this.id_protected[rrZn_1.id_case[0]] = category2;
    }

    static {
        rrZn_1.ntfClinit();
    }

    public Category id_this() {
        this.id_synchronized();
        return (Category)((Object)this.id_protected[id_case[1]]);
    }

    @Override
    public void id_class(boolean bl) {
        super.id_class(bl || !this.id_native() ? id_throws[0] : id_throws[1]);
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC4B4D628776E0397L;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1636B070;
    }

    public static String id_throws(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{104, -120, 51, -100, 77, 109, -82, -2}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrZn_1.id_public();
        rrZn_1.id_return();
        rrZn_1.id_else();
    }

    @Override
    public float id_finally() {
        return id_catch[0] + id_catch[1] * this.id_protected();
    }

    private static void id_else() {
        id_catch = new float[]{0.7f, 0.3f};
    }

    private static void id_return() {
        id_case = new short[2];
    }

    private static void id_public() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_throws = blArray;
    }

    private void id_synchronized() {
        if (this.id_protected == null) {
            Object[] objectArray = this.id_protected = new Object[id_throws[2]];
        }
    }
}

