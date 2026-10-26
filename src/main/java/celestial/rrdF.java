/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 */
package celestial;

import celestial.MT;
import celestial.rji_3;
import celestial.rrWJ;
import celestial.rrWx_1;
import celestial.rrWz_1;
import celestial.rrdJ;
import celestial.rrdZ;
import celestial.rrki_1;
import celestial.rrxD_2;
import celestial.rrxK_2;
import celestial.rrxU_2;
import celestial.rrxY_2;
import java.awt.Dimension;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public class rrdF {
    private String id_class;
    private int id_break;
    private int id_byte;
    private int id_protected;
    private int id_throws;
    private int id_case;
    private boolean[] id_catch;
    private boolean[] id_private;
    private boolean[] id_implements;
    private rrWz_1[] id_finally;
    private int[] id_extends;
    private int[] id_native;
    private int[] id_volatile;
    private int[] id_final;
    private int id_package;
    private rrxD_2 id_int;
    private IntBuffer id_new;
    private final rrxY_2 id_continue;
    private rrxY_2 id_super;
    private int[] id_this;
    private int[] id_else;
    private boolean[] id_synchronized;
    private Map<rrWx_1, rrxK_2> id_return = new HashMap<rrWx_1, rrxK_2>();

    public boolean id_byte(int n) {
        return n >= 0 && n < this.id_case;
    }

    public String id_byte() {
        return this.id_class;
    }

    public rrdF(String string, int n, int n2, int n3, int n4, int n5, boolean[] blArray, boolean[] blArray2, boolean[] blArray3, rrWz_1[] rrWz_1Array, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, rrxY_2 rrxY_22) {
        this.id_class = string;
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
        this.id_throws = n4;
        this.id_case = n5;
        this.id_catch = blArray;
        this.id_private = blArray2;
        this.id_implements = blArray3;
        this.id_finally = rrWz_1Array;
        this.id_extends = nArray;
        this.id_native = nArray2;
        this.id_volatile = nArray3;
        this.id_final = nArray4;
        this.id_continue = rrxY_22;
    }

    public String toString() {
        return this.id_class + ", width: " + this.id_break + ", height: " + this.id_byte + ", usedColorBuffers: " + this.id_protected + ", usedDepthBuffers: " + this.id_throws + ", maxDrawBuffers: " + this.id_case;
    }

    public void id_class(int n, boolean bl) {
        if (this.id_final != null) {
            if (n >= 0 && n < this.id_final.length) {
                int n2 = rrdZ.id_break(this.id_extends[n]);
                MT.id_class(this.id_final[n], this.id_int.id_class(bl, n), 0, false, 0, 35002, n2);
            }
            MT.id_new(33984);
        }
    }

    public void id_class(int[] nArray) {
        for (int i = 0; i < this.id_throws; ++i) {
            MT.id_new(33984 + nArray[i]);
            MT.id_super(this.id_new.get(i));
        }
        MT.id_new(33984);
    }

    public void id_class(rrxY_2 rrxY_22) {
        if (rrxY_22 == null) {
            rrxY_22 = rrdZ.EZ;
        }
        this.id_break(rrxY_22.id_protected());
        this.id_super = rrxY_22;
        this.id_private();
        GL30.glDrawBuffers((IntBuffer)rrxY_22.id_throws());
        rrdZ.id_catch("setDrawBuffers");
    }

    public boolean id_class(int n) {
        return n >= 0 && n < this.id_protected;
    }

    public rrxK_2 id_class(int n, int n2, rrxY_2 rrxY_22, boolean bl) {
        IntBuffer intBuffer = rrxY_22.id_throws();
        int n3 = rrxY_22.id_break();
        int[] nArray = new int[n3];
        int[] nArray2 = new int[n3];
        for (int i = 0; i < nArray.length; ++i) {
            int n4 = rrxY_22.id_class(i);
            int n5 = n4 - 36064;
            if (!this.id_class(n5)) continue;
            nArray[i] = this.id_int.id_class(bl, n5);
            nArray2[i] = intBuffer.get(i);
        }
        rrWx_1 rrWx_12 = new rrWx_1(new rrWJ(nArray), new rrWJ(nArray2));
        rrxK_2 rrxK_22 = this.id_return.get(rrWx_12);
        if (rrxK_22 == null) {
            String string = this.id_class + ", [" + rrki_1.id_class(nArray) + "], [" + rrki_1.id_class(nArray2) + "]";
            rrxK_22 = new rrxK_2(string, n, n2, nArray, nArray2, this.id_catch[0], this.id_private[0]);
            rrxK_22.id_class();
            this.id_return.put(rrWx_12, rrxK_22);
        }
        return rrxK_22;
    }

    public void id_class(rji_3 rji_32) {
        this.id_class(36160, 36096, 3553, this.id_new.get(0), 0);
        GL30.glClearColor((float)rji_32.id_class(), (float)rji_32.id_break(), (float)rji_32.id_byte(), (float)rji_32.id_protected());
        GL30.glClear((int)256);
    }

    public void id_class(boolean[] blArray, rji_3[] rji_3Array) {
        for (int i = 0; i < this.id_protected; ++i) {
            if (!blArray[i]) continue;
            rji_3 rji_32 = rji_3Array[i];
            if (rji_32 != null) {
                GL30.glClearColor((float)rji_32.id_class(), (float)rji_32.id_break(), (float)rji_32.id_byte(), (float)rji_32.id_protected());
            }
            if (this.id_finally[i] != null) {
                if (this.id_int.id_case(i)) {
                    this.id_break(i, false);
                }
                this.id_break(i, true);
                continue;
            }
            if (this.id_int.id_case(i)) {
                this.id_class(36160, 36064 + i, 3553, this.id_int.id_protected(i), 0);
                this.id_class(rrdZ.Ev[i]);
                GL30.glClear((int)16384);
                this.id_class(36160, 36064 + i, 3553, this.id_int.id_byte(i), 0);
            }
            this.id_class(rrdZ.Ev[i]);
            GL30.glClear((int)16384);
        }
    }

    public void id_class(boolean bl, boolean[] blArray) {
        for (int i = 0; i < this.id_protected; ++i) {
            if (!blArray[i]) continue;
            MT.id_new(33984 + this.id_native[i]);
            MT.id_super(this.id_int.id_class(bl, i));
            GL30.glGenerateMipmap((int)3553);
            GL30.glTexParameteri((int)3553, (int)10241, (int)(this.id_implements[i] ? 9984 : 9987));
        }
        MT.id_new(33984);
    }

    public void id_class(boolean[] blArray) {
        for (int i = 0; i < this.id_throws; ++i) {
            if (!blArray[i]) continue;
            MT.id_new(33984 + this.id_volatile[i]);
            MT.id_super(this.id_new.get(i));
            GL30.glGenerateMipmap((int)3553);
            GL30.glTexParameteri((int)3553, (int)10241, (int)(this.id_catch[i] ? 9984 : 9987));
        }
        MT.id_new(33984);
    }

    public void id_class() {
        Dimension dimension;
        int n;
        int n2;
        if (this.id_catch()) {
            this.id_break();
        }
        this.id_int = new rrxD_2(this.id_class + "ColorTexturesFlip", this.id_protected);
        this.id_new = BufferUtils.createIntBuffer((int)this.id_throws);
        this.id_this = new int[this.id_protected];
        this.id_else = new int[this.id_protected];
        this.id_synchronized = new boolean[this.id_case];
        Arrays.fill(this.id_this, 0);
        Arrays.fill(this.id_else, -1);
        Arrays.fill(this.id_synchronized, false);
        for (n2 = 0; n2 < this.id_continue.id_break(); ++n2) {
            this.id_continue.id_class(n2, 36064 + n2);
        }
        this.id_package = EXTFramebufferObject.glGenFramebuffersEXT();
        this.id_private();
        GL30.glDrawBuffers((int)0);
        GL30.glReadBuffer((int)0);
        GL30.glGenTextures((IntBuffer)((IntBuffer)((Buffer)this.id_new).clear().limit(this.id_throws)));
        this.id_int.id_catch().id_break(this.id_protected).id_throws();
        ((Buffer)this.id_new).position(0);
        this.id_int.id_class(0);
        for (n2 = 0; n2 < this.id_throws; ++n2) {
            MT.id_super(this.id_new.get(n2));
            GL30.glTexParameteri((int)3553, (int)10242, (int)33071);
            GL30.glTexParameteri((int)3553, (int)10243, (int)33071);
            n = this.id_catch[n2] ? 9728 : 9729;
            GL30.glTexParameteri((int)3553, (int)10241, (int)n);
            GL30.glTexParameteri((int)3553, (int)10240, (int)n);
            if (this.id_private[n2]) {
                GL30.glTexParameteri((int)3553, (int)34892, (int)34894);
            }
            GL30.glTexImage2D((int)3553, (int)0, (int)6402, (int)this.id_break, (int)this.id_byte, (int)0, (int)6402, (int)5126, (FloatBuffer)null);
        }
        this.id_class(36160, 36096, 3553, this.id_new.get(0), 0);
        rrdZ.id_catch("FBS " + this.id_class + " depth");
        for (n2 = 0; n2 < this.id_protected; ++n2) {
            MT.id_super(this.id_int.id_byte(n2));
            GL30.glTexParameteri((int)3553, (int)10242, (int)33071);
            GL30.glTexParameteri((int)3553, (int)10243, (int)33071);
            n = this.id_implements[n2] ? 9728 : 9729;
            GL30.glTexParameteri((int)3553, (int)10241, (int)n);
            GL30.glTexParameteri((int)3553, (int)10240, (int)n);
            dimension = this.id_finally[n2] != null ? this.id_finally[n2].id_class(this.id_break, this.id_byte) : new Dimension(this.id_break, this.id_byte);
            GL30.glTexImage2D((int)3553, (int)0, (int)this.id_extends[n2], (int)dimension.width, (int)dimension.height, (int)0, (int)rrdZ.id_byte(this.id_extends[n2]), (int)33639, (ByteBuffer)null);
            this.id_class(36160, 36064 + n2, 3553, this.id_int.id_byte(n2), 0);
            rrdZ.id_catch("FBS " + this.id_class + " colorA");
        }
        for (n2 = 0; n2 < this.id_protected; ++n2) {
            MT.id_super(this.id_int.id_protected(n2));
            GL30.glTexParameteri((int)3553, (int)10242, (int)33071);
            GL30.glTexParameteri((int)3553, (int)10243, (int)33071);
            n = this.id_implements[n2] ? 9728 : 9729;
            GL30.glTexParameteri((int)3553, (int)10241, (int)n);
            GL30.glTexParameteri((int)3553, (int)10240, (int)n);
            dimension = this.id_finally[n2] != null ? this.id_finally[n2].id_class(this.id_break, this.id_byte) : new Dimension(this.id_break, this.id_byte);
            GL30.glTexImage2D((int)3553, (int)0, (int)this.id_extends[n2], (int)dimension.width, (int)dimension.height, (int)0, (int)rrdZ.id_byte(this.id_extends[n2]), (int)33639, (ByteBuffer)null);
            rrdZ.id_catch("FBS " + this.id_class + " colorB");
        }
        MT.id_super(0);
        if (this.id_protected > 0) {
            this.id_class(this.id_continue);
            GL30.glReadBuffer((int)0);
        }
        if ((n2 = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160)) != 36053) {
            rrdZ.id_private("[Shaders] Error creating framebuffer: " + this.id_class + ", status: " + n2);
        } else {
            rrdJ.id_byte("Framebuffer created: " + this.id_class);
        }
    }

    public void id_class(boolean bl) {
        for (int i = 0; i < this.id_protected; ++i) {
            this.id_class(36160, 36064 + i, 3553, this.id_int.id_class(bl, i), 0);
        }
    }

    public void id_class(int n, int n2) {
        MT.id_new(33984);
        for (int i = 0; i < this.id_protected; ++i) {
            MT.id_super(this.id_int.id_byte(i));
            GL11.glTexParameteri((int)3553, (int)10241, (int)n);
            GL11.glTexParameteri((int)3553, (int)10240, (int)n2);
            MT.id_super(this.id_int.id_protected(i));
            GL11.glTexParameteri((int)3553, (int)10241, (int)n);
            GL11.glTexParameteri((int)3553, (int)10240, (int)n2);
        }
        MT.id_super(0);
    }

    public void id_class(int n, int n2, int n3, int n4, int n5) {
        int n6 = n2 - 36064;
        if (this.id_class(n6)) {
            if (this.id_finally[n6] != null) {
                if (this.id_break(n6)) {
                    return;
                }
                n4 = 0;
            }
            this.id_this[n6] = n4;
            if (n6 >= this.id_case) {
                int n7 = this.id_else[n6];
                if (!this.id_byte(n7)) {
                    return;
                }
                n2 = 36064 + n7;
            }
        }
        this.id_private();
        EXTFramebufferObject.glFramebufferTexture2DEXT((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
    }

    public boolean id_break(int n) {
        return n >= this.id_case && n < this.id_protected;
    }

    private void id_break(int n, boolean bl) {
        Dimension dimension = this.id_finally[n].id_class(this.id_break, this.id_byte);
        if (dimension != null) {
            rrxK_2 rrxK_22 = this.id_class(dimension.width, dimension.height, rrdZ.Ev[n], bl);
            rrxK_22.id_break();
            GL30.glClear((int)16384);
        }
    }

    public void id_break(boolean bl) {
        if (this.id_final != null) {
            for (int i = 0; i < this.id_protected; ++i) {
                this.id_class(i, bl);
            }
        }
    }

    public void id_break(boolean[] blArray) {
        for (int i = 0; i < this.id_int.id_byte(); ++i) {
            if (!blArray[i]) continue;
            this.id_case(i);
        }
    }

    private void id_break(int[] nArray) {
        int n;
        int n2;
        this.id_private();
        for (n2 = 0; n2 < this.id_case; ++n2) {
            if (!this.id_synchronized[n2]) continue;
            n = this.id_this[n2];
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + n2), (int)3553, (int)n, (int)0);
            this.id_synchronized[n2] = false;
        }
        this.id_else = nArray;
        for (n2 = this.id_case; n2 < this.id_else.length; ++n2) {
            n = this.id_else[n2];
            if (n < 0) continue;
            int n3 = this.id_this[n2];
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + n), (int)3553, (int)n3, (int)0);
            this.id_synchronized[n] = true;
        }
    }

    public void id_break() {
        if (this.id_package != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT((int)this.id_package);
            this.id_package = 0;
        }
        if (this.id_int != null) {
            this.id_int.id_case();
            this.id_int = null;
        }
        if (this.id_new != null) {
            MT.id_break(this.id_new);
            this.id_new = null;
        }
        this.id_continue.id_byte(0).id_throws(0);
        for (rrxK_2 rrxK_22 : this.id_return.values()) {
            rrxK_22.id_byte();
        }
        this.id_return.clear();
    }

    public void id_throws(int n) {
        if (rrdZ.id_implements) {
            for (int i = 0; i < this.id_protected; ++i) {
                if ((n & 1 << i) == 0) continue;
                MT.id_new(33984 + this.id_native[i]);
                GL30.glTexParameteri((int)3553, (int)10241, (int)9987);
                GL30.glGenerateMipmap((int)3553);
            }
            MT.id_new(33984);
        }
    }

    public int id_throws() {
        return this.id_byte;
    }

    public void id_finally() {
        this.id_class(this.id_continue);
    }

    public boolean id_catch() {
        return this.id_package != 0;
    }

    public rrxY_2 id_extends() {
        return this.id_super;
    }

    public void id_case(int n) {
        this.id_int.id_throws(n);
        MT.id_new(33984 + this.id_native[n]);
        MT.id_super(this.id_int.id_byte(n));
        this.id_class(n, true);
        this.id_class(36160, 36064 + n, 3553, this.id_int.id_protected(n), 0);
        MT.id_new(33984);
    }

    public int id_case() {
        return this.id_package;
    }

    public void id_implements() {
        this.id_class(36160, 36096, 3553, this.id_new.get(0), 0);
    }

    public int id_protected() {
        return this.id_break;
    }

    public void id_protected(int n) {
        for (int i = n; i < this.id_protected; ++i) {
            MT.id_new(33984 + this.id_native[i]);
            MT.id_super(this.id_int.id_byte(i));
            this.id_class(i, true);
        }
    }

    public void id_private() {
        rrxU_2.id_class(this);
    }
}

