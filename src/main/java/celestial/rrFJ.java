/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.rrAM;
import celestial.rrFK;
import celestial.rrFO;
import celestial.rrFX;
import celestial.rrLf_1;
import celestial.rrfD_2;
import celestial.rrfi_3;
import celestial.rrtu_3;
import celestial.rrvR_1;
import celestial.rrvg_1;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFJ
extends rrvR_1 {
    private static String[] id_native;
    private static float[] id_volatile;
    public Object[] id_protected;
    private static short[] id_final;
    private static boolean[] id_package;
    private static byte[] id_int;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{3, 90, 104, -118, 125, -106, -124, -76}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrFJ() {
        super(id_native[0], new AnimValue(id_volatile[0], id_package[0]), new AnimValue(id_volatile[1], id_package[1]));
        this.s();
        rrFO rrFO2 = new rrFO(this);
        this.id_protected[rrFJ.id_final[0]] = rrFO2;
        this.id_try().id_class(this.id_goto());
    }

    static {
        rrFJ.ntfClinit();
    }

    private static void B() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[10] = true;
        id_package = blArray;
    }

    private static void S() {
        float[] fArray = new float[6];
        fArray[0] = 0.5f;
        fArray[1] = 0.5f;
        fArray[3] = 50.0f;
        fArray[4] = 2.0f;
        fArray[5] = 13.0f;
        id_volatile = fArray;
    }

    private void s() {
        if (this.id_protected == null) {
            Object[] objectArray = this.id_protected = new Object[id_package[10]];
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        super.id_class(ml_1, rrtu_32, n, n2, bl);
        float f = this.id_default();
        float f2 = this.id_abstract();
        float f3 = this.id_implements();
        float f4 = this.ao_();
        rrvg_1.id_class(this, ml_1, () -> {
            this.s();
            rrfi_3.id_break();
            rrfD_2.id_protected(ml_1, f, f2 + id_volatile[5], f3, f4, id_int[0]);
            rrfi_3.id_class(id_package[9]);
            ((rrFO)this.id_protected[id_final[10]]).id_class(ml_1, f, f2);
            rrfi_3.id_class();
        });
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x158144B0;
    }

    public void id_class(rrFK rrFK2) {
        this.s();
        ((rrFO)this.id_protected[id_final[3]]).id_class(rrFK2);
    }

    public void id_class(rrLf_1 rrLf_12) {
        this.s();
        ((rrFO)this.id_protected[id_final[1]]).id_class(rrLf_12);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF7DFB419F44DBAE6L;
    }

    public void id_class(rrAM rrAM2) {
        this.s();
        ((rrFO)this.id_protected[id_final[2]]).id_class(rrAM2);
    }

    private static /* synthetic */ void ntfClinit() {
        rrFJ.B();
        rrFJ.G();
        rrFJ.S();
        rrFJ.E();
        rrFJ.M();
    }

    private static void M() {
        id_int = new byte[]{-1};
    }

    private static void G() {
        id_native = new String[]{new String("Pickup Viewer")};
    }

    @Override
    public float id_goto() {
        this.s();
        boolean bl = id_package[5];
        int n = id_package[6];
        for (rrFX rrFX2 : ((rrFO)this.id_protected[id_final[6]]).id_break()) {
            int n2 = (int)((rrFO)this.id_protected[id_final[7]]).id_class(rrFX2);
            if (bl && n2 <= n) continue;
            bl = id_package[7];
            n = n2;
        }
        float f = bl ? (float)n : id_volatile[2];
        return Math.max(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_final[8]]).id_finally().id_break(this.id_byte()) + id_volatile[3], f);
    }

    @Override
    public void id_instanceof() {
        this.s();
        super.id_instanceof();
        ((rrFO)this.id_protected[id_final[4]]).id_throws();
    }

    @Override
    public boolean id_package() {
        this.s();
        return this.id_throw() && !((rrFO)this.id_protected[id_final[5]]).id_break().isEmpty() ? id_package[2] : id_package[3];
    }

    public boolean id_throw() {
        return id_package[4];
    }

    @Override
    public float id_while() {
        this.s();
        return ((rrFO)this.id_protected[id_final[9]]).id_finally() - id_volatile[4];
    }

    @Override
    public boolean id_protected() {
        return id_package[8];
    }

    private static void E() {
        id_final = new short[11];
    }

    @Override
    public float ao_() {
        return this.id_while();
    }
}

