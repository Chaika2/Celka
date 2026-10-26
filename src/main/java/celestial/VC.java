/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MT;
import celestial.QY;
import celestial.Vl_1;
import celestial.fo_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.yb_3;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;

public class VC {
    public int id_class;
    public int id_break;
    public int id_byte;
    public int id_protected;
    public final boolean id_throws;
    public int id_case;
    private int id_implements;
    private int id_finally;
    public final float[] id_catch;
    public int id_private;
    private boolean id_extends = false;

    private void id_byte(boolean bl) {
        if (GLX.isUsingFBOs()) {
            RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
            MT.id_private(Vl_1.id_class, this.id_case);
            if (bl) {
                MT.id_protected(0, 0, this.id_byte, this.id_protected);
            }
        }
    }

    public void id_byte(int n, int n2, boolean bl) {
        RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
        if (!RenderSystem.isInInitPhase()) {
            RenderSystem.recordRenderCall(() -> this.id_throws(n, n2, bl));
        } else {
            this.id_throws(n, n2, bl);
        }
    }

    public void id_byte() {
        if (GLX.isUsingFBOs()) {
            RenderSystem.assertThread(RenderSystem::isOnRenderThread);
            MT.id_super(this.id_implements);
        }
    }

    public VC(int n, int n2, boolean bl, boolean bl2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        this.id_throws = bl;
        this.id_case = -1;
        this.id_implements = -1;
        this.id_finally = -1;
        this.id_catch = new float[4];
        this.id_catch[0] = 1.0f;
        this.id_catch[1] = 1.0f;
        this.id_catch[2] = 1.0f;
        this.id_catch[3] = 0.0f;
        this.id_class(n, n2, bl2);
    }

    public void id_class(int n, int n2) {
        this.id_byte(n, n2, true);
    }

    public void id_class(boolean bl) {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> this.id_byte(bl));
        } else {
            this.id_byte(bl);
        }
    }

    public void id_class(float f, float f2, float f3, float f4) {
        this.id_catch[0] = f;
        this.id_catch[1] = f2;
        this.id_catch[2] = f3;
        this.id_catch[3] = f4;
    }

    public void id_class(VC vC) {
        if (GLX.isUsingFBOs()) {
            RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
            if (MT.r()) {
                MT.id_private(36008, vC.id_case);
                MT.id_private(36009, this.id_case);
                MT.id_class(0, 0, vC.id_class, vC.id_break, 0, 0, this.id_class, this.id_break, 256, 9728);
            } else {
                MT.id_private(Vl_1.id_class, this.id_case);
                int n = MT.id_continue();
                if (n != 0) {
                    int n2 = MT.id_this();
                    MT.id_super(n);
                    MT.id_private(Vl_1.id_class, vC.id_case);
                    MT.id_class(3553, 0, 0, 0, 0, 0, Math.min(this.id_class, vC.id_class), Math.min(this.id_break, vC.id_break));
                    MT.id_super(n2);
                }
            }
            MT.id_private(Vl_1.id_class, 0);
        }
    }

    public void id_class(int n, int n2, boolean bl) {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> this.id_protected(n, n2, bl));
        } else {
            this.id_protected(n, n2, bl);
        }
    }

    public void id_class() {
        if (GLX.isUsingFBOs()) {
            RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
            this.id_protected();
            this.id_throws();
            if (this.id_finally > -1) {
                fo_3.id_class(this.id_finally);
                this.id_finally = -1;
            }
            if (this.id_implements > -1) {
                fo_3.id_class(this.id_implements);
                this.id_implements = -1;
            }
            if (this.id_case > -1) {
                MT.id_private(Vl_1.id_class, 0);
                MT.id_extends(this.id_case);
                this.id_case = -1;
            }
        }
    }

    public void id_class(int n) {
        if (GLX.isUsingFBOs()) {
            RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
            this.id_private = n;
            MT.id_super(this.id_implements);
            MT.id_break(3553, 10241, n);
            MT.id_break(3553, 10240, n);
            MT.id_break(3553, 10242, 10496);
            MT.id_break(3553, 10243, 10496);
            MT.id_super(0);
        }
    }

    public void id_break() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        int n = MT.id_native(Vl_1.id_class);
        if (n != Vl_1.id_throws) {
            if (n == Vl_1.id_case) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
            }
            if (n == Vl_1.id_catch) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
            }
            if (n == Vl_1.id_private) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
            }
            if (n == Vl_1.id_implements) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
            }
            throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + n);
        }
    }

    public void id_break(boolean bl) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        this.id_class(true);
        MT.id_break(this.id_catch[0], this.id_catch[1], this.id_catch[2], this.id_catch[3]);
        int n = 16384;
        if (this.id_throws) {
            MT.id_class(1.0);
            n |= 0x100;
        }
        MT.id_class(n, bl);
        this.id_throws();
    }

    public void id_break(int n) {
        this.id_finally = n;
    }

    public void id_break(int n, int n2, boolean bl) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        this.id_byte = n;
        this.id_protected = n2;
        this.id_class = n;
        this.id_break = n2;
        if (!GLX.isUsingFBOs()) {
            this.id_break(bl);
        } else {
            this.id_case = MT.id_super();
            this.id_implements = fo_3.id_class();
            if (this.id_throws) {
                this.id_finally = fo_3.id_class();
                MT.id_super(this.id_finally);
                MT.id_break(3553, 10241, 9728);
                MT.id_break(3553, 10240, 9728);
                MT.id_break(3553, 10242, 10496);
                MT.id_break(3553, 10243, 10496);
                MT.id_break(3553, 34892, 0);
                if (this.id_extends) {
                    MT.id_class(3553, 0, 36013, this.id_class, this.id_break, 0, 34041, 36269, null);
                } else {
                    MT.id_class(3553, 0, 6402, this.id_class, this.id_break, 0, 6402, 5126, null);
                }
            }
            this.id_class(9728);
            MT.id_super(this.id_implements);
            MT.id_class(3553, 0, 32856, this.id_class, this.id_break, 0, 6408, 5121, null);
            MT.id_private(Vl_1.id_class, this.id_case);
            MT.id_class(Vl_1.id_class, Vl_1.id_byte, 3553, this.id_implements, 0);
            if (this.id_throws) {
                if (this.id_extends) {
                    MT.id_class(Vl_1.id_class, 36096, 3553, this.id_finally, 0);
                    MT.id_class(Vl_1.id_class, 36128, 3553, this.id_finally, 0);
                } else {
                    MT.id_class(Vl_1.id_class, Vl_1.id_protected, 3553, this.id_finally, 0);
                }
            }
            this.id_break();
            this.id_break(bl);
            this.id_protected();
        }
    }

    private void id_throws(int n, int n2, boolean bl) {
        if (GLX.isUsingFBOs()) {
            RenderSystem.assertThread(RenderSystem::isOnRenderThread);
            MT.id_class(true, true, true, false);
            MT.id_native();
            MT.id_class(false);
            MT.id_return(5889);
            MT.id_boolean();
            MT.id_class(0.0, (double)n, (double)n2, 0.0, 1000.0, 3000.0);
            MT.id_return(5888);
            MT.id_boolean();
            MT.id_byte(0.0f, 0.0f, -2000.0f);
            MT.id_protected(0, 0, n, n2);
            MT.id_import();
            MT.id_catch();
            MT.id_protected();
            if (bl) {
                MT.id_final();
                MT.id_private();
            }
            MT.id_protected(1.0f, 1.0f, 1.0f, 1.0f);
            this.id_byte();
            float f = n;
            float f2 = n2;
            float f3 = (float)this.id_byte / (float)this.id_class;
            float f4 = (float)this.id_protected / (float)this.id_break;
            yb_3 yb_32 = RenderSystem.renderThreadTesselator();
            lD_2 lD_22 = yb_32.id_byte();
            lD_22.id_class(7, ju_3.id_public);
            lD_22.id_class(0.0, (double)f2, 0.0).id_class(0.0f, 0.0f).id_break(255, 255, 255, 255).id_class();
            lD_22.id_class((double)f, (double)f2, 0.0).id_class(f3, 0.0f).id_break(255, 255, 255, 255).id_class();
            lD_22.id_class((double)f, 0.0, 0.0).id_class(f3, f4).id_break(255, 255, 255, 255).id_class();
            lD_22.id_class(0.0, 0.0, 0.0).id_class(0.0f, f4).id_break(255, 255, 255, 255).id_class();
            yb_32.id_break();
            this.id_protected();
            MT.id_class(true);
            MT.id_class(true, true, true, true);
        }
    }

    public void id_throws() {
        if (GLX.isUsingFBOs()) {
            if (!RenderSystem.isOnRenderThread()) {
                RenderSystem.recordRenderCall(() -> MT.id_private(Vl_1.id_class, 0));
            } else {
                MT.id_private(Vl_1.id_class, 0);
            }
        }
    }

    public int id_finally() {
        return this.id_finally;
    }

    public int id_catch() {
        return this.id_finally;
    }

    public int id_extends() {
        return this.id_implements;
    }

    public int id_case() {
        return this.id_implements;
    }

    public boolean id_implements() {
        return this.id_extends;
    }

    private void id_protected(int n, int n2, boolean bl) {
        if (!GLX.isUsingFBOs()) {
            this.id_byte = n;
            this.id_protected = n2;
        } else {
            RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
            MT.id_volatile();
            if (this.id_case >= 0) {
                this.id_class();
            }
            this.id_break(n, n2, bl);
            MT.id_private(Vl_1.id_class, 0);
        }
    }

    public void id_protected() {
        if (GLX.isUsingFBOs()) {
            RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
            MT.id_super(0);
        }
    }

    public void id_private() {
        if (!this.id_extends) {
            this.id_extends = true;
            this.id_class(this.id_byte, this.id_protected, (Boolean)QY.id_break[2]);
        }
    }
}

