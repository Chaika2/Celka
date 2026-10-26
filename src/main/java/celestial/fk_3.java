/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.fN_2;
import celestial.ff_3;
import celestial.fo_3;
import celestial.rAL;
import celestial.rrbb_3;
import celestial.rrdA;
import com.mojang.blaze3d.systems.RenderSystem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fk_3
extends ff_3 {
    private static final Logger id_class = LogManager.getLogger();
    private fN_2 id_break;

    public fk_3(fN_2 fN_22) {
        this.id_break = fN_22;
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> {
                fo_3.id_class(this.id_new(), this.id_break.id_class(), this.id_break.id_break());
                this.id_class();
                if (rrbb_3.rs()) {
                    rrdA.id_class(this);
                }
            });
        } else {
            fo_3.id_class(this.id_new(), this.id_break.id_class(), this.id_break.id_break());
            this.id_class();
            if (rrbb_3.rs()) {
                rrdA.id_class(this);
            }
        }
    }

    public fk_3(int n, int n2, boolean bl) {
        RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
        this.id_break = new fN_2(n, n2, bl);
        fo_3.id_class(this.id_new(), this.id_break.id_class(), this.id_break.id_break());
        if (rrbb_3.rs()) {
            rrdA.id_class(this);
        }
    }

    public void id_class() {
        if (this.id_break != null) {
            this.id_super();
            this.id_break.id_class(0, 0, 0, false);
        } else {
            id_class.warn("Trying to upload disposed texture {}", (Object)this.id_new());
        }
    }

    public void id_class(fN_2 fN_22) {
        if (this.id_break != null) {
            this.id_break.close();
        }
        this.id_break = fN_22;
    }

    @Override
    public void close() {
        if (this.id_break != null) {
            this.id_break.close();
            this.id_continue();
            this.id_break = null;
        }
    }

    public fN_2 id_break() {
        return this.id_break;
    }

    @Override
    public void a_(rAL rAL2) {
    }
}

