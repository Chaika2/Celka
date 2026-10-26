/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FP;
import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.module.render.Hud;
import celestial.rrFE;
import celestial.rrFs_1;
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

public class rrFS
extends rrvR_1 {
    private static byte[] id_native;
    private static float[] id_volatile;
    private static short[] id_final;
    private static String[] id_package;
    public Object[] id_protected;
    private static boolean[] id_int;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{119, 46, -128, -94, 14, 39, 13, 48}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrFS() {
        super(id_package[0], new AnimValue(id_volatile[0], id_int[0]), new AnimValue(id_volatile[1], id_int[1]));
        this.M();
        rrFs_1 rrFs_12 = new rrFs_1(this);
        this.id_protected[rrFS.id_final[0]] = rrFs_12;
        Float f = Float.valueOf(this.E());
        this.id_protected[rrFS.id_final[1]] = f;
        this.id_try().id_class(this.id_goto());
    }

    static {
        rrFS.ntfClinit();
    }

    private static void B() {
        id_package = new String[]{new String("Keybinds")};
    }

    private static void S() {
        boolean[] blArray = new boolean[13];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        id_int = blArray;
    }

    private static void s() {
        id_native = new byte[]{-1, 2};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x68B44108C562EA52L;
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        super.id_class(ml_1, rrtu_32, n, n2, bl);
        float f = this.id_default();
        float f2 = this.id_abstract();
        float f3 = this.id_implements();
        float f4 = this.ao_();
        rrvg_1.id_class(this, ml_1, () -> {
            this.M();
            rrfi_3.id_break();
            rrfD_2.id_protected(ml_1, f, f2 + id_volatile[5], f3, f4, id_native[0]);
            rrfi_3.id_class(id_int[11]);
            ((rrFs_1)this.id_protected[id_final[13]]).id_class(ml_1, f, f2);
            rrfi_3.id_class();
        });
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x88CBD010;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFS.S();
        rrFS.B();
        rrFS.G();
        rrFS.id_throw();
        rrFS.s();
    }

    private void M() {
        if (this.id_protected == null) {
            Object[] objectArray = this.id_protected = new Object[id_native[1]];
            objectArray[rrFS.id_int[12]] = Float.valueOf(id_volatile[6]);
        }
    }

    private static void G() {
        float[] fArray = new float[7];
        fArray[0] = 0.5f;
        fArray[1] = 0.5f;
        fArray[2] = 2.0f;
        fArray[4] = 47.0f;
        fArray[5] = 12.5f;
        id_volatile = fArray;
    }

    @Override
    public float id_goto() {
        this.M();
        return ((Float)this.id_protected[id_final[8]]).floatValue();
    }

    @Override
    public void id_instanceof() {
        this.M();
        super.id_instanceof();
        this.id_break(!((rrFs_1)this.id_protected[id_final[2]]).id_break() && (vm_3)rrFS.id_import.id_class[id_final[3]] instanceof FP ? id_int[2] : id_int[3]);
        Float f = Float.valueOf(this.E());
        this.id_protected[rrFS.id_final[4]] = f;
        ((rrFs_1)this.id_protected[id_final[5]]).id_throws();
    }

    @Override
    public boolean id_package() {
        this.M();
        Hud hud = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_final[6]]).id_private().w();
        if (hud.aJ_() && hud.id_try()) {
            return this.id_super() || ((rrFs_1)this.id_protected[id_final[7]]).id_break() ? id_int[4] : id_int[5];
        }
        return id_int[6];
    }

    private static void id_throw() {
        short[] sArray = new short[14];
        sArray[1] = 1;
        sArray[3] = 73;
        sArray[4] = 1;
        sArray[8] = 1;
        id_final = sArray;
    }

    @Override
    public float id_while() {
        this.M();
        return ((rrFs_1)this.id_protected[id_final[9]]).id_finally() - id_volatile[2];
    }

    @Override
    public boolean id_protected() {
        return id_int[7];
    }

    private float E() {
        this.M();
        boolean bl = id_int[8];
        int n = id_int[9];
        for (rrFE rrFE2 : ((rrFs_1)this.id_protected[id_final[10]]).id_class()) {
            int n2 = (int)((rrFs_1)this.id_protected[id_final[11]]).id_class(rrFE2);
            if (bl && n2 <= n) continue;
            bl = id_int[10];
            n = n2;
        }
        float f = bl ? (float)n : id_volatile[3];
        return Math.max(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_final[12]]).id_class().id_break(this.id_byte()) + id_volatile[4], f);
    }

    @Override
    public float ao_() {
        return this.id_while();
    }
}

