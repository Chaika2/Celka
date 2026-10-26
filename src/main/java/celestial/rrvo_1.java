/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FP;
import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.module.render.Hud;
import celestial.rrQX;
import celestial.rrfD_2;
import celestial.rrfi_3;
import celestial.rrtu_3;
import celestial.rrvK;
import celestial.rrvR_1;
import celestial.rrvU;
import celestial.rrvg_1;
import celestial.util.AnimValue;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvo_1
extends rrvR_1 {
    private static boolean[] id_native;
    private static byte[] id_volatile;
    private static String[] id_final;
    private static short[] id_package;
    private static float[] id_int;
    public Object[] id_protected;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{86, 55, -61, 50, 88, -94, 34, -56}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrvo_1() {
        super(id_final[0], new AnimValue(id_int[0], id_native[0]), new AnimValue(id_int[1], id_native[1]));
        this.E();
        rrvK rrvK2 = new rrvK(this);
        this.id_protected[rrvo_1.id_package[0]] = rrvK2;
        Float f = Float.valueOf(this.B());
        this.id_protected[rrvo_1.id_package[1]] = f;
        this.id_try().id_class(((Float)this.id_protected[id_package[2]]).floatValue());
    }

    static {
        rrvo_1.ntfClinit();
    }

    private float B() {
        this.E();
        boolean bl = id_native[8];
        int n = id_native[9];
        for (rrvU rrvU2 : ((rrvK)this.id_protected[id_package[11]]).id_class()) {
            int n2 = (int)((rrvK)this.id_protected[id_package[12]]).id_class(rrvU2);
            if (bl && n2 <= n) continue;
            bl = id_native[10];
            n = n2;
        }
        float f = bl ? (float)n : id_int[3];
        return Math.max(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_package[13]]).id_class().id_break(this.id_byte()) + id_int[4], f);
    }

    private static void S() {
        float[] fArray = new float[7];
        fArray[0] = 0.5f;
        fArray[1] = 0.5f;
        fArray[2] = 2.0f;
        fArray[4] = 57.0f;
        fArray[5] = 12.5f;
        id_int = fArray;
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
        id_native = blArray;
    }

    private static void h() {
        id_final = new String[]{new String("Cooldowns")};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBAE893B4;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA6F67AC73096A045L;
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
            rrfD_2.id_protected(ml_1, f, f2 + id_int[5], f3, f4, id_volatile[0]);
            rrfi_3.id_class(id_native[11]);
            ((rrvK)this.id_protected[id_package[15]]).id_class(ml_1, f, f2);
            rrfi_3.id_class();
        });
    }

    private static /* synthetic */ void ntfClinit() {
        rrvo_1.s();
        rrvo_1.h();
        rrvo_1.S();
        rrvo_1.G();
        rrvo_1.M();
    }

    private static void M() {
        id_volatile = new byte[]{-1, 2};
    }

    private static void G() {
        short[] sArray = new short[16];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[4] = 73;
        sArray[5] = 1;
        sArray[9] = 1;
        id_package = sArray;
    }

    @Override
    public float id_goto() {
        this.E();
        return ((Float)this.id_protected[id_package[9]]).floatValue();
    }

    @Override
    public void id_instanceof() {
        this.E();
        super.id_instanceof();
        this.id_break(!((rrvK)this.id_protected[id_package[3]]).id_case() && (vm_3)rrvo_1.id_import.id_class[id_package[4]] instanceof FP ? id_native[2] : id_native[3]);
        Float f = Float.valueOf(this.B());
        this.id_protected[rrvo_1.id_package[5]] = f;
        ((rrvK)this.id_protected[id_package[6]]).id_throws();
    }

    @Override
    public boolean id_package() {
        this.E();
        Hud hud = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_package[7]]).id_private().w();
        if (hud.aJ_() && hud.id_return()) {
            return this.id_super() || ((rrvK)this.id_protected[id_package[8]]).id_case() ? id_native[4] : id_native[5];
        }
        return id_native[6];
    }

    public rrvK id_throw() {
        this.E();
        return (rrvK)this.id_protected[id_package[14]];
    }

    @Override
    public float id_while() {
        this.E();
        return ((rrvK)this.id_protected[id_package[10]]).id_finally() - id_int[2];
    }

    @Override
    public boolean id_protected() {
        return id_native[7];
    }

    private void E() {
        if (this.id_protected == null) {
            Object[] objectArray = this.id_protected = new Object[id_volatile[1]];
            objectArray[rrvo_1.id_native[12]] = Float.valueOf(id_int[6]);
        }
    }

    @Override
    public float ao_() {
        return this.id_while();
    }
}

