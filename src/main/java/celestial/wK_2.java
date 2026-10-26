/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ih_1;
import celestial.fj_3;
import celestial.ju_3;
import celestial.rpr_3;
import celestial.rrGT;
import celestial.rrGt_1;
import celestial.rrJl_1;
import celestial.rrJt_1;
import celestial.rrbb_3;
import celestial.rrxq_3;
import celestial.rrxr_3;
import celestial.rrxv_3;

public class wK_2
implements rrGt_1 {
    protected int[] id_class;
    protected final int id_break;
    protected rpr_3 id_byte;
    protected fj_3 id_protected;
    private final boolean id_throws;
    private int[] id_case = null;
    private rrJt_1 id_catch;
    private boolean id_private;
    private wK_2 id_implements;
    private rrxv_3 id_finally;
    private final boolean id_extends;

    public int id_byte() {
        return this.id_break;
    }

    public wK_2 id_int() {
        if (this.id_private) {
            return this.id_implements;
        }
        if (this.id_implements == null && this.id_protected != null && this.id_protected.id_final != null) {
            this.id_implements = new rrJl_1(this, this.id_protected.id_final);
        }
        this.id_private = true;
        return this.id_implements;
    }

    public wK_2(int[] nArray, int n, rpr_3 rpr_32, fj_3 fj_32, boolean bl) {
        this.id_class = nArray;
        this.id_break = n;
        this.id_byte = rpr_32;
        this.id_protected = fj_32;
        this.id_throws = bl;
        this.id_extends = n != -1;
        this.id_private();
    }

    public String toString() {
        return "vertexData: " + this.id_class.length + ", tint: " + this.id_break + ", facing: " + this.id_byte + ", sprite: " + this.id_protected;
    }

    @Override
    public void id_class(rrGT rrGT2) {
        rrxr_3.id_class(rrxr_3.BX, rrGT2, this);
    }

    private static int[] id_class(int[] nArray, fj_3 fj_32) {
        int[] nArray2 = (int[])nArray.clone();
        int n = nArray2.length / 4;
        for (int i = 0; i < 4; ++i) {
            int n2 = i * n;
            float f = Float.intBitsToFloat(nArray2[n2 + 4]);
            float f2 = Float.intBitsToFloat(nArray2[n2 + 4 + 1]);
            float f3 = fj_32.id_byte(f);
            float f4 = fj_32.id_protected(f2);
            nArray2[n2 + 4] = Float.floatToRawIntBits(f3);
            nArray2[n2 + 4 + 1] = Float.floatToRawIntBits(f4);
        }
        return nArray2;
    }

    public int[] id_class() {
        this.id_private();
        return this.id_class;
    }

    private static fj_3 id_class(int[] nArray) {
        float f = 1.0f;
        float f2 = 1.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int n = nArray.length / 4;
        for (int i = 0; i < 4; ++i) {
            int n2 = i * n;
            float f5 = Float.intBitsToFloat(nArray[n2 + 4]);
            float f6 = Float.intBitsToFloat(nArray[n2 + 4 + 1]);
            f = Math.min(f, f5);
            f2 = Math.min(f2, f6);
            f3 = Math.max(f3, f5);
            f4 = Math.max(f4, f6);
        }
        float f7 = (f + f3) / 2.0f;
        float f8 = (f2 + f4) / 2.0f;
        return rrbb_3.rF().id_class(f7, f8);
    }

    public rrxq_3[] id_class(int n) {
        if (this.id_finally == null) {
            this.id_finally = new rrxv_3();
        }
        return (rrxq_3[])this.id_finally.id_class(n);
    }

    private static int[] id_class(int[] nArray, int n) {
        int n2 = nArray.length / 4;
        int n3 = n / 4;
        int[] nArray2 = new int[n3 * 4];
        for (int i = 0; i < 4; ++i) {
            int n4 = Math.min(n2, n3);
            System.arraycopy(nArray, i * n2, nArray2, i * n3, n4);
        }
        return nArray2;
    }

    public boolean id_break() {
        return this.id_extends;
    }

    public boolean id_throws() {
        return this.id_throws;
    }

    public float id_finally() {
        rrJt_1 rrJt_12 = this.id_implements();
        return (rrJt_12.id_protected() + rrJt_12.id_class()) / 2.0f;
    }

    public int[] id_catch() {
        if (this.id_case == null) {
            this.id_case = wK_2.id_class(this.id_class(), this.id_case());
        }
        if (this.id_case.length != this.id_class().length) {
            this.id_case = wK_2.id_class(this.id_class(), this.id_case());
        }
        return this.id_case;
    }

    public double id_extends() {
        rrJt_1 rrJt_12 = this.id_implements();
        return (rrJt_12.id_throws() + rrJt_12.id_break()) / 2.0f;
    }

    public fj_3 id_case() {
        if (this.id_protected == null) {
            this.id_protected = wK_2.id_class(this.id_class());
        }
        return this.id_protected;
    }

    public rrJt_1 id_implements() {
        if (this.id_catch == null) {
            this.id_catch = new rrJt_1(this.id_class());
        }
        return this.id_catch;
    }

    public boolean id_package() {
        return this.id_final() && this.id_volatile();
    }

    public rpr_3 id_protected() {
        if (this.id_byte == null) {
            this.id_byte = Ih_1.id_class(this.id_class());
        }
        return this.id_byte;
    }

    protected void id_private() {
        if (rrbb_3.rs()) {
            if (this.id_class.length == ju_3.id_native) {
                this.id_class = wK_2.id_class(this.id_class, ju_3.id_volatile);
            }
        } else if (this.id_class.length == ju_3.id_volatile) {
            this.id_class = wK_2.id_class(this.id_class, ju_3.id_native);
        }
    }

    public boolean id_final() {
        rrJt_1 rrJt_12 = this.id_implements();
        return rrJt_12.id_break(this.id_byte);
    }

    public boolean id_volatile() {
        rrJt_1 rrJt_12 = this.id_implements();
        return rrJt_12.id_class(this.id_byte);
    }

    public double id_native() {
        rrJt_1 rrJt_12 = this.id_implements();
        return (rrJt_12.id_case() + rrJt_12.id_byte()) / 2.0f;
    }
}

