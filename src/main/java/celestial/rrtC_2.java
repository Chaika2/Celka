/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.rrZF;
import celestial.rrZI;
import celestial.rrZO;
import celestial.rrtF_2;
import celestial.rrtN_2;
import celestial.rrtm_3;
import celestial.rrtu_3;
import celestial.rruv_1;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtC_2
extends rrtm_3 {
    private static boolean[] id_protected;
    private static byte[] id_throws;
    private static short[] id_native;
    public Object[] id_byte;
    private static float[] id_volatile;

    public rrtC_2(rrtN_2 rrtN_22, GroupSetting groupSetting, float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
        this.id_return();
        rrtN_2 rrtN_23 = rrtN_22;
        this.id_byte[rrtC_2.id_native[0]] = rrtN_23;
        GroupSetting groupSetting2 = groupSetting;
        this.id_byte[rrtC_2.id_native[1]] = groupSetting2;
    }

    static {
        rrtC_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCB142B4B5020E1DCL;
    }

    private void id_class(Ml_1 ml_1, rrZO rrZO2, String string, float f, float f2, float f3, float f4, int n) {
        float f5 = rrZO2.id_break(string);
        float f6 = f5 / id_volatile[0];
        rrtF_2.id_class(ml_1, f, f2 + id_volatile[1], f3, id_volatile[2], ColorHelper.id_break((int)((Integer)rrZI.id_break[id_native[5]]), id_volatile[3]), n);
        rrtF_2.id_class(ml_1, f + f3 / id_volatile[4] - f6 - id_volatile[5], f2 - id_volatile[6], f5 + id_volatile[7], (float)rrZO2.id_class(), rrZF.n_, n);
        rrtF_2.id_class(ml_1, this, rrZO2, string, f + f3 / id_volatile[8] - f6, f2, id_throws[0], n, id_protected[0]);
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2) {
        this.id_return();
        super.id_class(ml_1, rrtu_32, n, n2);
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_native[2]]).id_throws();
        String string = ((GroupSetting)this.id_byte[id_native[3]]).id_throws();
        float f = this.id_package();
        float f2 = this.id_final();
        float f3 = this.id_new();
        float f4 = this.id_continue();
        int n3 = this.id_class(id_native[4]);
        this.id_private().id_interface().id_class(ml_1, () -> this.id_class(ml_1, rrZO2, string, f, f2, f3, f4, n3));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{36, -57, -9, -122, 103, -128, -113, 52}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x98FC23A;
    }

    private static /* synthetic */ void ntfClinit() {
        rrtC_2.id_synchronized();
        rrtC_2.id_goto();
        rrtC_2.id_while();
        rrtC_2.id_public();
    }

    @Override
    public Setting<?> id_finally() {
        this.id_return();
        return (GroupSetting)this.id_byte[id_native[7]];
    }

    private static void id_goto() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[4] = 255;
        sArray[5] = 4;
        sArray[7] = 1;
        id_native = sArray;
    }

    private void id_return() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_throws[1]];
        }
    }

    private static void id_while() {
        id_volatile = new float[]{2.0f, 1.5f, 0.5f, 0.7f, 2.0f, 5.0f, 0.5f, 10.0f, 2.0f, 5.0f, 5.0f};
    }

    private static void id_public() {
        id_throws = new byte[]{15, 2};
    }

    @Override
    public rrtN_2 id_private() {
        this.id_return();
        return (rrtN_2)this.id_byte[id_native[6]];
    }

    @Override
    public rruv_1 id_volatile() {
        return new rruv_1(this.id_package(), this.id_final() - id_volatile[9], this.id_new(), this.id_continue() - id_volatile[10]);
    }

    private static void id_synchronized() {
        id_protected = new boolean[1];
    }
}

