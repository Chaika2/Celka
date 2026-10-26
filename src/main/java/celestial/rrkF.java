/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package celestial;

import celestial.rrky_1;
import org.lwjgl.opengl.ARBShaderObjects;

public class rrkF
extends rrky_1 {
    private float[] id_class;
    private static final float id_break = -3.4028235E38f;

    public rrkF(String string) {
        super(string);
        this.id_break();
    }

    @Override
    protected void id_class(int n) {
        if (n >= this.id_class.length) {
            float[] fArray = this.id_class;
            float[] fArray2 = new float[n + 10];
            System.arraycopy(fArray, 0, fArray2, 0, fArray.length);
            for (int i = fArray.length; i < fArray2.length; ++i) {
                fArray2[i] = -3.4028235E38f;
            }
            this.id_class = fArray2;
        }
    }

    public float id_class() {
        int n = this.id_protected();
        return this.id_class[n];
    }

    public void id_class(float f) {
        int n = this.id_protected();
        float f2 = this.id_class[n];
        if (f != f2) {
            this.id_class[n] = f;
            int n2 = this.id_throws();
            if (n2 >= 0) {
                rrkF.id_finally();
                ARBShaderObjects.glUniform1fARB((int)n2, (float)f);
                this.id_implements();
            }
        }
    }

    @Override
    protected void id_break() {
        this.id_class = new float[]{-3.4028235E38f};
    }
}

