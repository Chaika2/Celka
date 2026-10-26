/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package celestial;

import celestial.rrky_1;
import org.lwjgl.opengl.ARBShaderObjects;

public class rrkL
extends rrky_1 {
    private int[] id_class;
    private static final int id_break = Integer.MIN_VALUE;

    public rrkL(String string) {
        super(string);
        this.id_break();
    }

    @Override
    protected void id_class(int n) {
        if (n >= this.id_class.length) {
            int[] nArray = this.id_class;
            int[] nArray2 = new int[n + 10];
            System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
            for (int i = nArray.length; i < nArray2.length; ++i) {
                nArray2[i] = Integer.MIN_VALUE;
            }
            this.id_class = nArray2;
        }
    }

    public int id_class() {
        int n = this.id_protected();
        return this.id_class[n];
    }

    public void id_break(int n) {
        int n2 = this.id_protected();
        int n3 = this.id_class[n2];
        if (n != n3) {
            this.id_class[n2] = n;
            int n4 = this.id_throws();
            if (n4 >= 0) {
                rrkL.id_finally();
                ARBShaderObjects.glUniform1iARB((int)n4, (int)n);
                this.id_implements();
            }
        }
    }

    @Override
    protected void id_break() {
        this.id_class = new int[]{Integer.MIN_VALUE};
    }
}

