/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FP;
import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.module.render.Hud;
import celestial.rrFk_1;
import celestial.rrFz_1;
import celestial.rrQX;
import celestial.rrfD_2;
import celestial.rrfi_3;
import celestial.rrtu_3;
import celestial.rrvR_1;
import celestial.rrvg_1;
import celestial.util.AnimValue;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFd_1
extends rrvR_1 {
    private static short[] id_native;
    private static String[] id_volatile;
    private static boolean[] id_final;
    public Object[] id_protected;
    private static float[] id_package;
    private static byte[] id_int;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-80, -89, -64, 116, -91, -5, -89, -11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrFd_1() {
        super(id_volatile[0], new AnimValue(id_package[0], id_final[0]), new AnimValue(id_package[1], id_final[1]));
        this.E();
        rrFk_1 rrFk_12 = new rrFk_1(this);
        this.id_protected[rrFd_1.id_native[0]] = rrFk_12;
        Float f = Float.valueOf(this.M());
        this.id_protected[rrFd_1.id_native[1]] = f;
        this.id_try().id_class(((Float)this.id_protected[id_native[2]]).floatValue());
    }

    static {
        rrFd_1.ntfClinit();
    }

    private static void B() {
        id_volatile = new String[]{new String("Potions")};
    }

    private static void S() {
        short[] sArray = new short[17];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[5] = 73;
        sArray[6] = 1;
        sArray[10] = 1;
        id_native = sArray;
    }

    private static void s() {
        boolean[] blArray = new boolean[13];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        id_final = blArray;
    }

    private static void h() {
        float[] fArray = new float[7];
        fArray[0] = 0.5f;
        fArray[1] = 0.5f;
        fArray[2] = 2.0f;
        fArray[4] = 70.0f;
        fArray[5] = 12.5f;
        id_package = fArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x436E1048;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDA2ECB5A42FD3B1L;
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        super.id_class(ml_1, rrtu_32, n, n2, bl);
        float f = this.id_default();
        float f2 = this.id_abstract();
        float f3 = this.id_implements();
        float f4 = this.ao_();
        rrvg_1.id_class(this, ml_1, () -> {
            this.E();
            rrfi_3.id_break();
            rrfD_2.id_protected(ml_1, f, f2 + id_package[5], f3, f4, id_int[0]);
            rrfi_3.id_class(id_final[11]);
            ((rrFk_1)this.id_protected[id_native[16]]).id_class(ml_1, f, f2);
            rrfi_3.id_class();
        });
    }

    private static /* synthetic */ void ntfClinit() {
        rrFd_1.s();
        rrFd_1.B();
        rrFd_1.h();
        rrFd_1.S();
        rrFd_1.G();
    }

    private float M() {
        this.E();
        boolean bl = id_final[8];
        int n = id_final[9];
        for (rrFz_1 rrFz_12 : ((rrFk_1)this.id_protected[id_native[12]]).id_class()) {
            int n2 = (int)((rrFk_1)this.id_protected[id_native[13]]).id_class(rrFz_12);
            if (bl && n2 <= n) continue;
            bl = id_final[10];
            n = n2;
        }
        float f = bl ? (float)n : id_package[3];
        return Math.max(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_native[14]]).id_class().id_break(this.id_byte()) + id_package[4], f);
    }

    private static void G() {
        id_int = new byte[]{-1, 2};
    }

    @Override
    public float id_goto() {
        this.E();
        return ((Float)this.id_protected[id_native[10]]).floatValue();
    }

    @Override
    public void id_instanceof() {
        this.E();
        super.id_instanceof();
        this.id_break(!((rrFk_1)this.id_protected[id_native[4]]).id_private() && (vm_3)rrFd_1.id_import.id_class[id_native[5]] instanceof FP ? id_final[2] : id_final[3]);
        Float f = Float.valueOf(this.M());
        this.id_protected[rrFd_1.id_native[6]] = f;
        ((rrFk_1)this.id_protected[id_native[7]]).id_throws();
    }

    @Override
    public boolean id_package() {
        this.E();
        Hud hud = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_native[8]]).id_private().w();
        if (hud.aJ_() && hud.id_this() && hud.id_throw()) {
            return this.id_super() || ((rrFk_1)this.id_protected[id_native[9]]).id_private() ? id_final[4] : id_final[5];
        }
        return id_final[6];
    }

    public rrFk_1 id_throw() {
        this.E();
        return (rrFk_1)this.id_protected[id_native[15]];
    }

    @Override
    public float id_while() {
        this.E();
        return ((rrFk_1)this.id_protected[id_native[11]]).id_finally() - id_package[2];
    }

    @Override
    public boolean id_protected() {
        return id_final[7];
    }

    private void E() {
        if (this.id_protected == null) {
            Object[] objectArray = this.id_protected = new Object[id_int[1]];
            objectArray[rrFd_1.id_final[12]] = Float.valueOf(id_package[6]);
        }
    }

    @Override
    public void as_() {
        this.E();
        super.as_();
        ((rrFk_1)this.id_protected[id_native[3]]).id_catch();
    }

    @Override
    public float ao_() {
        return this.id_while();
    }
}

