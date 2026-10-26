/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package celestial;

import celestial.rrky_1;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.ARBShaderObjects;

public class rrkp_1
extends rrky_1 {
    private boolean id_class;
    private FloatBuffer id_break;

    public rrkp_1(String string) {
        super(string);
    }

    @Override
    protected void id_class(int n) {
    }

    public float id_class(int n, int n2) {
        if (this.id_break == null) {
            return 0.0f;
        }
        int n3 = this.id_class ? n2 * 4 + n : n * 4 + n2;
        return this.id_break.get(n3);
    }

    public void id_class(boolean bl, FloatBuffer floatBuffer) {
        this.id_class = bl;
        this.id_break = floatBuffer;
        int n = this.id_throws();
        if (n >= 0) {
            rrkp_1.id_finally();
            ARBShaderObjects.glUniformMatrix4fvARB((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
            this.id_implements();
        }
    }

    @Override
    protected void id_break() {
        this.id_break = null;
    }
}

