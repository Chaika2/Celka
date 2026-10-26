/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.yt_3;

public class rrxI_2
extends yt_3 {
    private static rrxI_2 id_private = new rrxI_2();
    public float[] id_break = new float[6];
    public float[][] id_byte = new float[10][4];
    public int id_protected;
    public float[] id_throws = new float[16];
    public float[] id_case = new float[4];
    public float[][] id_catch;

    private void id_byte(float[] fArray) {
        this.id_break(this.id_byte[this.id_protected++], fArray);
    }

    public rrxI_2() {
        super(null, null);
    }

    private double id_class(float[] fArray, double d, double d2, double d3) {
        return (double)fArray[0] * d + (double)fArray[1] * d2 + (double)fArray[2] * d3 + (double)fArray[3];
    }

    private void id_class(float[] fArray, float[] fArray2, float[] fArray3) {
        fArray[0] = fArray2[1] * fArray3[2] - fArray2[2] * fArray3[1];
        fArray[1] = fArray2[2] * fArray3[0] - fArray2[0] * fArray3[2];
        fArray[2] = fArray2[0] * fArray3[1] - fArray2[1] * fArray3[0];
    }

    private float id_class(float f, float f2, float f3) {
        return (float)Math.sqrt(f * f + f2 * f2 + f3 * f3);
    }

    private float id_class(float f, float f2, float f3, float f4, float f5, float f6) {
        return this.id_class(f - f4, f2 - f5, f3 - f6);
    }

    private void id_class(float[] fArray, float[] fArray2, float[] fArray3, float[] fArray4) {
        this.id_class(this.id_case, fArray2, fArray3);
        this.id_class(fArray, this.id_case, fArray4);
        this.id_break(fArray);
        float f = (float)this.id_class(fArray2, fArray3);
        float f2 = (float)this.id_class(fArray, fArray3);
        float f3 = this.id_class(fArray[0], fArray[1], fArray[2], fArray3[0] * f2, fArray3[1] * f2, fArray3[2] * f2);
        float f4 = this.id_class(fArray2[0], fArray2[1], fArray2[2], fArray3[0] * f, fArray3[1] * f, fArray3[2] * f);
        float f5 = f3 / f4;
        float f6 = (float)this.id_class(fArray, fArray2);
        float f7 = this.id_class(fArray[0], fArray[1], fArray[2], fArray2[0] * f6, fArray2[1] * f6, fArray2[2] * f6);
        float f8 = this.id_class(fArray3[0], fArray3[1], fArray3[2], fArray2[0] * f, fArray2[1] * f, fArray2[2] * f);
        float f9 = f7 / f8;
        fArray[3] = fArray2[3] * f5 + fArray3[3] * f9;
    }

    private void id_class(float[] fArray) {
        float f = rfU_2.id_byte(fArray[0] * fArray[0] + fArray[1] * fArray[1] + fArray[2] * fArray[2]);
        fArray[0] = fArray[0] / f;
        fArray[1] = fArray[1] / f;
        fArray[2] = fArray[2] / f;
        fArray[3] = fArray[3] / f;
    }

    private double id_class(float[] fArray, float[] fArray2) {
        return (double)fArray[0] * (double)fArray2[0] + (double)fArray[1] * (double)fArray2[1] + (double)fArray[2] * (double)fArray2[2];
    }

    private void id_class(float[] fArray, float f, float f2, float f3, float f4) {
        float f5 = (float)Math.sqrt(f * f + f2 * f2 + f3 * f3);
        fArray[0] = f / f5;
        fArray[1] = f2 / f5;
        fArray[2] = f3 / f5;
        fArray[3] = f4 / f5;
    }

    private void id_break(float[] fArray, float[] fArray2) {
        fArray[0] = fArray2[0];
        fArray[1] = fArray2[1];
        fArray[2] = fArray2[2];
        fArray[3] = fArray2[3];
    }

    public boolean id_break(double d, double d2, double d3, double d4, double d5, double d6) {
        for (int i = 0; i < this.id_protected; ++i) {
            float[] fArray = this.id_byte[i];
            if (!(this.id_class(fArray, d, d2, d3) <= 0.0) || !(this.id_class(fArray, d4, d2, d3) <= 0.0) || !(this.id_class(fArray, d, d5, d3) <= 0.0) || !(this.id_class(fArray, d4, d5, d3) <= 0.0) || !(this.id_class(fArray, d, d2, d6) <= 0.0) || !(this.id_class(fArray, d4, d2, d6) <= 0.0) || !(this.id_class(fArray, d, d5, d6) <= 0.0) || !(this.id_class(fArray, d4, d5, d6) <= 0.0)) continue;
            return false;
        }
        return true;
    }

    private void id_break(float[] fArray) {
        float f = rfU_2.id_byte(fArray[0] * fArray[0] + fArray[1] * fArray[1] + fArray[2] * fArray[2]);
        if (f == 0.0f) {
            f = 1.0f;
        }
        fArray[0] = fArray[0] / f;
        fArray[1] = fArray[1] / f;
        fArray[2] = fArray[2] / f;
    }

    public static yt_3 id_throws() {
        id_private.id_case();
        return id_private;
    }

    public void id_case() {
    }
}

