/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.module.render.Hud;
import celestial.rrFm_1;
import celestial.rrQX;
import celestial.rrTB;
import celestial.rrtu_3;
import celestial.rrvR_1;
import celestial.rrvg_1;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFu_1
extends rrvR_1 {
    public Object[] id_protected;
    private static byte[] id_native;
    private static short[] id_volatile;
    private static String[] id_final;
    private static boolean[] id_package;
    private static float[] id_int;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-61, 108, 92, 122, -94, -5, 39, -52}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrFu_1() {
        super(id_final[0], new AnimValue(id_int[0], id_package[0]), new AnimValue(id_int[1], id_package[1]));
        this.id_throw();
        rrFm_1 rrFm_12 = new rrFm_1(this);
        this.id_protected[rrFu_1.id_volatile[0]] = rrFm_12;
        Float f = Float.valueOf(this.E());
        this.id_protected[rrFu_1.id_volatile[1]] = f;
        this.id_try().id_class(((Float)this.id_protected[id_volatile[2]]).floatValue());
    }

    static {
        rrFu_1.ntfClinit();
    }

    private static void B() {
        id_final = new String[]{new String("Schedules")};
    }

    private static void S() {
        id_native = new byte[]{2};
    }

    private static void s() {
        float[] fArray = new float[6];
        fArray[0] = 0.5f;
        fArray[1] = 0.5f;
        fArray[2] = 2.0f;
        fArray[4] = 70.0f;
        id_int = fArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x70D5B075;
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        super.id_class(ml_1, rrtu_32, n, n2, bl);
        float f = this.id_default();
        float f2 = this.id_abstract();
        rrvg_1.id_class(this, ml_1, () -> {
            this.id_throw();
            ((rrFm_1)this.id_protected[id_volatile[11]]).id_class(ml_1, f, f2);
        });
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x41AED91E9D259CE7L;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFu_1.M();
        rrFu_1.B();
        rrFu_1.s();
        rrFu_1.G();
        rrFu_1.S();
    }

    private static void M() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[7] = true;
        blArray[8] = true;
        id_package = blArray;
    }

    private static void G() {
        short[] sArray = new short[12];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[6] = 1;
        id_volatile = sArray;
    }

    @Override
    public float id_goto() {
        this.id_throw();
        return ((Float)this.id_protected[id_volatile[6]]).floatValue();
    }

    @Override
    public void id_instanceof() {
        this.id_throw();
        super.id_instanceof();
        Float f = Float.valueOf(this.E());
        this.id_protected[rrFu_1.id_volatile[3]] = f;
        ((rrFm_1)this.id_protected[id_volatile[4]]).id_throws();
    }

    @Override
    public boolean id_package() {
        Hud hud = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_volatile[5]]).id_private().w();
        return hud.aJ_() && hud.id_super() ? id_package[2] : id_package[3];
    }

    private void id_throw() {
        if (this.id_protected == null) {
            Object[] objectArray = this.id_protected = new Object[id_native[0]];
            objectArray[rrFu_1.id_package[8]] = Float.valueOf(id_int[5]);
        }
    }

    @Override
    public float id_while() {
        this.id_throw();
        return ((rrFm_1)this.id_protected[id_volatile[7]]).id_finally() - id_int[2];
    }

    @Override
    public boolean id_protected() {
        return id_package[4];
    }

    private float E() {
        this.id_throw();
        boolean bl = id_package[5];
        int n = id_package[6];
        for (List<rrTB> list : ((rrFm_1)this.id_protected[id_volatile[8]]).id_break().values()) {
            for (rrTB rrTB2 : list) {
                int n2 = (int)((rrFm_1)this.id_protected[id_volatile[9]]).id_class(rrTB2);
                if (bl && n2 <= n) continue;
                bl = id_package[7];
                n = n2;
            }
        }
        float f = bl ? (float)n : id_int[3];
        return Math.max(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_volatile[10]]).id_finally().id_break(this.id_byte()) + id_int[4], f);
    }
}

