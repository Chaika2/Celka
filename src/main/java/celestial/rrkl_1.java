/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package celestial;

import celestial.rrky_1;
import org.lwjgl.opengl.ARBShaderObjects;

public class rrkl_1
extends rrky_1 {
    private float[][] id_class;
    private static final float id_break = -3.4028235E38f;

    public rrkl_1(String string) {
        super(string);
        this.id_break();
    }

    @Override
    protected void id_class(int n) {
        if (n >= this.id_class.length) {
            float[][] fArray = this.id_class;
            float[][] fArrayArray = new float[n + 10][];
            System.arraycopy(fArray, 0, fArrayArray, 0, fArray.length);
            this.id_class = fArrayArray;
        }
        if (this.id_class[n] == null) {
            this.id_class[n] = new float[]{-3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f};
        }
    }

    public float[] id_class() {
        int n = this.id_protected();
        return this.id_class[n];
    }

    public void id_class(float f, float f2, float f3, float f4) {
        int n = this.id_protected();
        float[] fArray = this.id_class[n];
        if (fArray[0] != f || fArray[1] != f2 || fArray[2] != f3 || fArray[3] != f4) {
            fArray[0] = f;
            fArray[1] = f2;
            fArray[2] = f3;
            fArray[3] = f4;
            int n2 = this.id_throws();
            if (n2 >= 0) {
                rrkl_1.id_finally();
                ARBShaderObjects.glUniform4fARB((int)n2, (float)f, (float)f2, (float)f3, (float)f4);
                this.id_implements();
            }
        }
    }

    @Override
    protected void id_break() {
        this.id_class = new float[][]{{-3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f}};
    }
}

