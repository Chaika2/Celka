/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rrIv_1;
import celestial.rrtK_2;
import celestial.rrtN_2;
import celestial.rrtY_2;
import celestial.rrtm_3;
import celestial.rrtu_3;
import celestial.rruv_1;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtq_3
extends rrtm_3 {
    public Object[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;
    private static boolean[] id_native;
    private static float[] id_volatile;

    @Override
    public void id_byte(int n, int n2, int n3) {
        this.id_public();
        super.id_byte(n, n2, n3);
        ((rrtY_2)this.id_byte[id_protected[9]]).id_byte(n, n2, n3);
    }

    public rrtq_3(rrtN_2 rrtN_22, rrIv_1 rrIv_12, float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
        this.id_public();
        rrtN_2 rrtN_23 = rrtN_22;
        this.id_byte[rrtq_3.id_protected[0]] = rrtN_23;
        rrIv_1 rrIv_13 = rrIv_12;
        this.id_byte[rrtq_3.id_protected[1]] = rrIv_13;
        rrtY_2 rrtY_22 = new rrtY_2(this, rrIv_12, (rrtK_2)((Object)rrtK_2.staticFieldsc4d05dcb6ab834399a1b48042de01686[id_protected[2]]));
        this.id_byte[rrtq_3.id_protected[3]] = rrtY_22;
        ((rrIv_1)this.id_byte[id_protected[4]]).id_class((rrtY_2)this.id_byte[id_protected[5]]);
    }

    static {
        rrtq_3.ntfClinit();
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_public();
        if (n3 == 0 && super.id_class(rrtu_32, n, n2, n3, bl)) {
            ((rrtY_2)this.id_byte[id_protected[6]]).id_class(rrtu_32, n, n2, n3, id_native[0]);
            return id_native[1];
        }
        return id_native[2];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x17C6651AC5439355L;
    }

    @Override
    public boolean id_class(char c, int n) {
        this.id_public();
        ((rrtY_2)this.id_byte[id_protected[10]]).id_class(c, n);
        return super.id_class(c, n);
    }

    @Override
    public void id_class(int n, int n2, int n3) {
        this.id_public();
        super.id_class(n, n2, n3);
        ((rrtY_2)this.id_byte[id_protected[8]]).id_class(n, n2, n3);
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3) {
        this.id_public();
        super.id_class(rrtu_32, n, n2, n3);
        ((rrtY_2)this.id_byte[id_protected[7]]).id_throws();
        return id_native[3];
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2) {
        super.id_class(ml_1, rrtu_32, n, n2);
        rruv_1 rruv_12 = this.id_volatile();
        float f = this.id_package();
        float f2 = this.id_final();
        float f3 = this.id_new();
        float f4 = rruv_12.id_class();
        this.id_private().id_interface().id_class(ml_1, () -> {
            this.id_public();
            ((rrtY_2)this.id_byte[id_protected[15]]).id_class(ml_1, rrtu_32, f, f2, f3, f4, n, n2, id_native[4]);
        });
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB6F5AC89;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{12, -128, 122, 46, -75, 15, -86, -94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrtq_3.id_while();
        rrtq_3.id_synchronized();
        rrtq_3.id_goto();
        rrtq_3.id_return();
    }

    @Override
    public Setting<?> id_finally() {
        this.id_public();
        return (rrIv_1)this.id_byte[id_protected[14]];
    }

    private static void id_goto() {
        id_volatile = new float[]{3.0f, 10.0f};
    }

    @Override
    public void id_case() {
        this.id_public();
        super.id_case();
        ((rrtY_2)this.id_byte[id_protected[11]]).id_private();
    }

    @Override
    public void id_else() {
        this.id_public();
        super.id_else();
        ((rrtY_2)this.id_byte[id_protected[12]]).id_protected();
    }

    private static void id_return() {
        id_throws = new byte[]{3};
    }

    private static void id_while() {
        boolean[] blArray = new boolean[5];
        blArray[1] = true;
        id_native = blArray;
    }

    private void id_public() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_throws[0]];
        }
    }

    @Override
    public rrtN_2 id_private() {
        this.id_public();
        return (rrtN_2)this.id_byte[id_protected[13]];
    }

    @Override
    public rruv_1 id_volatile() {
        return new rruv_1(this.id_package(), this.id_final() - id_volatile[0], this.id_new(), this.id_continue() - id_volatile[1]);
    }

    private static void id_synchronized() {
        short[] sArray = new short[16];
        sArray[1] = 1;
        sArray[3] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[11] = 2;
        sArray[12] = 2;
        sArray[14] = 1;
        sArray[15] = 2;
        id_protected = sArray;
    }
}

