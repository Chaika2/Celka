/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL30
 */
package celestial;

import celestial.MT;
import celestial.rrdJ;
import celestial.rrdZ;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL30;

public class rrxK_2 {
    private String id_class;
    private int id_break;
    private int id_byte;
    private int[] id_protected;
    private int[] id_throws;
    private boolean id_case;
    private boolean id_catch;
    private int id_private;
    private int id_implements;
    private IntBuffer id_finally;

    public void id_byte() {
        if (this.id_private != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT((int)this.id_private);
            this.id_private = 0;
        }
        if (this.id_implements != 0) {
            MT.id_continue(this.id_implements);
            this.id_implements = 0;
        }
        this.id_finally = null;
    }

    public rrxK_2(String string, int n, int n2, int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        this.id_class = string;
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = nArray;
        this.id_throws = nArray2;
        this.id_case = bl;
        this.id_catch = bl2;
    }

    public String toString() {
        return this.id_class;
    }

    public void id_class() {
        int n;
        if (this.id_protected()) {
            this.id_byte();
        }
        this.id_private = EXTFramebufferObject.glGenFramebuffersEXT();
        this.id_break();
        GL30.glDrawBuffers((int)0);
        GL30.glReadBuffer((int)0);
        this.id_implements = GL30.glGenTextures();
        MT.id_super(this.id_implements);
        GL30.glTexParameteri((int)3553, (int)10242, (int)33071);
        GL30.glTexParameteri((int)3553, (int)10243, (int)33071);
        int n2 = this.id_case ? 9728 : 9729;
        GL30.glTexParameteri((int)3553, (int)10241, (int)n2);
        GL30.glTexParameteri((int)3553, (int)10240, (int)n2);
        if (this.id_catch) {
            GL30.glTexParameteri((int)3553, (int)34892, (int)34894);
        }
        GL30.glTexImage2D((int)3553, (int)0, (int)6402, (int)this.id_break, (int)this.id_byte, (int)0, (int)6402, (int)5126, (FloatBuffer)null);
        EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36096, (int)3553, (int)this.id_implements, (int)0);
        rrdZ.id_catch("FBS " + this.id_class + " depth");
        for (n = 0; n < this.id_protected.length; ++n) {
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)this.id_throws[n], (int)3553, (int)this.id_protected[n], (int)0);
            rrdZ.id_catch("FBS " + this.id_class + " color");
        }
        MT.id_super(0);
        if (this.id_protected.length > 0) {
            this.id_finally = BufferUtils.createIntBuffer((int)this.id_throws.length);
            for (n = 0; n < this.id_throws.length; ++n) {
                int n3 = this.id_throws[n];
                this.id_finally.put(n, n3);
            }
            GL30.glDrawBuffers((IntBuffer)this.id_finally);
            GL30.glReadBuffer((int)0);
        }
        if ((n = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160)) != 36053) {
            rrdZ.id_private("[Shaders] Error creating framebuffer: " + this.id_class + ", status: " + n);
        } else {
            rrdJ.id_byte("Framebuffer created: " + this.id_class);
        }
    }

    public void id_break() {
        MT.id_private(36160, this.id_private);
    }

    public boolean id_protected() {
        return this.id_private != 0;
    }
}

