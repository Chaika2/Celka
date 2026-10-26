/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MT;
import celestial.fY_2;
import celestial.fo_3;
import celestial.rAL;
import celestial.rqO_2;
import celestial.rrbb_3;
import celestial.rrdA;
import celestial.rrdE;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.concurrent.Executor;

public abstract class ff_3
implements AutoCloseable {
    protected int id_case = -1;
    protected boolean id_catch;
    protected boolean id_private;
    public rrdE id_implements;
    private boolean id_class;
    private boolean id_break;
    private boolean id_byte;

    public rrdE id_this() {
        return rrdA.id_class(this);
    }

    public void id_class(boolean bl, boolean bl2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        if (!this.id_class || this.id_catch != bl || this.id_private != bl2) {
            int n;
            int n2;
            this.id_class = true;
            this.id_catch = bl;
            this.id_private = bl2;
            if (bl) {
                n2 = bl2 ? 9987 : 9729;
                n = 9729;
            } else {
                int n3 = rrbb_3.id_new();
                n2 = bl2 ? n3 : 9728;
                n = 9728;
            }
            MT.id_super(this.id_new());
            MT.id_break(3553, 10241, n2);
            MT.id_break(3553, 10240, n);
        }
    }

    public void id_class(fY_2 fY_22, rAL rAL2, rqO_2 rqO_22, Executor executor) {
        fY_22.id_class(rqO_22, this);
    }

    @Override
    public void close() {
    }

    public void id_break(boolean bl, boolean bl2) {
        this.id_break = this.id_catch;
        this.id_byte = this.id_private;
        this.id_class(bl, bl2);
    }

    public void id_continue() {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> {
                rrdA.id_class(this, this.id_case);
                this.id_class = false;
                if (this.id_case != -1) {
                    fo_3.id_class(this.id_case);
                    this.id_case = -1;
                }
            });
        } else if (this.id_case != -1) {
            rrdA.id_class(this, this.id_case);
            this.id_class = false;
            fo_3.id_class(this.id_case);
            this.id_case = -1;
        }
    }

    public void id_else() {
        this.id_class(this.id_break, this.id_byte);
    }

    public int id_new() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        if (this.id_case == -1) {
            this.id_case = fo_3.id_class();
        }
        return this.id_case;
    }

    public void id_super() {
        if (!RenderSystem.isOnRenderThreadOrInit()) {
            RenderSystem.recordRenderCall(() -> MT.id_super(this.id_new()));
        } else {
            MT.id_super(this.id_new());
        }
    }

    public abstract void a_(rAL var1) throws IOException;
}

