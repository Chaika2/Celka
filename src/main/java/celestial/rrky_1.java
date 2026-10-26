/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package celestial;

import celestial.rrdZ;
import java.util.Arrays;
import org.lwjgl.opengl.ARBShaderObjects;

public abstract class rrky_1 {
    private String id_class;
    private int id_break = 0;
    private int[] id_byte = new int[]{-1};
    private static final int id_protected = -1;
    private static final int id_throws = Integer.MIN_VALUE;

    public String id_byte() {
        return this.id_class;
    }

    public void id_byte(int n) {
        if (this.id_break != n) {
            this.id_break = n;
            this.id_class();
            this.id_class(n);
        }
    }

    public rrky_1(String string) {
        this.id_class = string;
    }

    public String toString() {
        return this.id_class;
    }

    private void id_class() {
        if (this.id_break >= this.id_byte.length) {
            int[] nArray = new int[this.id_break * 2];
            Arrays.fill(nArray, Integer.MIN_VALUE);
            System.arraycopy(this.id_byte, 0, nArray, 0, this.id_byte.length);
            this.id_byte = nArray;
        }
    }

    protected abstract void id_class(int var1);

    protected abstract void id_break();

    public int id_throws() {
        if (this.id_break <= 0) {
            return -1;
        }
        int n = this.id_byte[this.id_break];
        if (n == Integer.MIN_VALUE) {
            this.id_byte[this.id_break] = n = ARBShaderObjects.glGetUniformLocationARB((int)this.id_break, (CharSequence)this.id_class);
        }
        return n;
    }

    protected static final void id_finally() {
        rrdZ.rP();
    }

    public void id_catch() {
        this.id_byte[this.id_break] = -1;
    }

    public boolean id_case() {
        return this.id_throws() >= 0;
    }

    protected void id_implements() {
        if (rrdZ.id_catch(this.id_class) != 0) {
            this.id_catch();
        }
    }

    public int id_protected() {
        return this.id_break;
    }

    public void id_private() {
        this.id_break = 0;
        this.id_byte = new int[]{-1};
        this.id_break();
    }
}

