/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.QY;
import celestial.Vs_1;
import celestial.fN_2;
import celestial.ff_3;
import celestial.fo_3;
import celestial.fy_3;
import celestial.rAL;
import celestial.rqO_2;
import celestial.rrbY_2;
import celestial.rrbb_3;
import celestial.rrdA;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fH_2
extends ff_3 {
    public static final Logger id_class = LogManager.getLogger();
    protected final rqO_2 id_byte;
    private rAL id_break;
    public rqO_2 id_protected;
    public boolean id_throws;

    public rqO_2 id_byte() {
        return this.id_byte;
    }

    public fH_2(rqO_2 rqO_22) {
        this.id_byte = rqO_22;
    }

    protected fy_3 id_class(rAL rAL2) {
        return fy_3.id_class(rAL2, this.id_byte);
    }

    private void id_class(fN_2 fN_22, boolean bl, boolean bl2) {
        fo_3.id_class(this.id_new(), 0, fN_22.id_class(), fN_22.id_break());
        fN_22.id_class(0, 0, 0, 0, 0, fN_22.id_class(), fN_22.id_break(), bl, bl2, false, true);
        if (rrbb_3.rs()) {
            rrdA.id_class(this.id_new(), fN_22, bl, bl2, this.id_break, this.id_byte, this.id_this());
        }
        if (rrbY_2.id_class()) {
            rrbY_2.id_class(this.id_byte, this);
        }
    }

    public fy_3 id_break() {
        return fy_3.id_class(QY.id_instanceof().F(), this.id_byte);
    }

    @Override
    public void a_(rAL rAL2) throws IOException {
        boolean bl;
        boolean bl2;
        this.id_break = rAL2;
        fy_3 fy_32 = this.id_class(rAL2);
        fy_32.id_byte();
        Vs_1 vs_1 = fy_32.id_class();
        if (vs_1 != null) {
            bl2 = vs_1.id_class();
            bl = vs_1.id_break();
        } else {
            bl2 = false;
            bl = false;
        }
        fN_2 fN_22 = fy_32.id_break();
        if (!RenderSystem.isOnRenderThreadOrInit()) {
            RenderSystem.recordRenderCall(() -> this.id_class(fN_22, bl2, bl));
        } else {
            this.id_class(fN_22, bl2, bl);
        }
    }
}

