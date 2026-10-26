/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package celestial;

import celestial.rrky_1;
import org.lwjgl.opengl.ARBShaderObjects;

public class rrkn_1
extends rrky_1 {
    private int[][] id_class;
    private static final int id_break = Integer.MIN_VALUE;

    public rrkn_1(String string) {
        super(string);
        this.id_break();
    }

    @Override
    protected void id_class(int n) {
        if (n >= this.id_class.length) {
            int[][] nArray = this.id_class;
            int[][] nArrayArray = new int[n + 10][];
            System.arraycopy(nArray, 0, nArrayArray, 0, nArray.length);
            this.id_class = nArrayArray;
        }
        if (this.id_class[n] == null) {
            this.id_class[n] = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        }
    }

    public int[] id_class() {
        int n = this.id_protected();
        return this.id_class[n];
    }

    public void id_class(int n, int n2) {
        int n3 = this.id_protected();
        int[] nArray = this.id_class[n3];
        if (nArray[0] != n || nArray[1] != n2) {
            nArray[0] = n;
            nArray[1] = n2;
            int n4 = this.id_throws();
            if (n4 >= 0) {
                rrkn_1.id_finally();
                ARBShaderObjects.glUniform2iARB((int)n4, (int)n, (int)n2);
                this.id_implements();
            }
        }
    }

    @Override
    protected void id_break() {
        this.id_class = new int[][]{{Integer.MIN_VALUE, Integer.MIN_VALUE}};
    }
}

