/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LV;
import celestial.Ml_1;
import celestial.cN_2;
import celestial.cy_3;
import celestial.rCi_1;
import celestial.rdb_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rlP_2;
import celestial.rmI_2;
import celestial.rmf_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.vI_2;
import celestial.vm_3;
import celestial.vq_3;
import celestial.vt_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class vp_3
extends vm_3
implements cy_3 {
    private static final rgP_2 id_case = new rgn_3("multiplayer.downloadingStats");
    protected final vm_3 id_throws;
    private vq_3 id_catch;
    public vI_2 id_private;
    private vt_3 id_implements;
    public final rlP_2 id_finally;
    private LV<?> id_else;
    private boolean id_synchronized = true;

    public void id_byte(Ml_1 ml_1, int n, int n2, int n3, int n4) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(id_byte);
        vp_3.id_class(ml_1, n, n2, this.h_(), (float)n3, (float)n4, 18, 18, 128, 128);
    }

    public vp_3(vm_3 vm_32, rlP_2 rlP_22) {
        super(new rgn_3("gui.stats"));
        this.id_throws = vm_32;
        this.id_finally = rlP_22;
    }

    public void id_class(LV<?> lV) {
        this.id_native.remove(this.id_catch);
        this.id_native.remove(this.id_private);
        this.id_native.remove(this.id_implements);
        if (lV != null) {
            this.id_native.add(0, lV);
            this.id_else = lV;
        }
    }

    public void id_class(Ml_1 ml_1, int n, int n2, rdb_3 rdb_32) {
        this.id_byte(ml_1, n + 1, n2 + 1, 0, 0);
        RenderSystem.enableRescaleNormal();
        this.id_final.id_class(rdb_32.id_continue(), (float)(n + 2), (float)(n2 + 2));
        RenderSystem.disableRescaleNormal();
    }

    public static String id_class(rCi_1<rqO_2> rCi_12) {
        return "stat." + rCi_12.id_throws().toString().replace(':', '.');
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        if (this.id_synchronized) {
            this.id_class(ml_1);
            vp_3.id_class(ml_1, this.id_super, id_case, this.id_package / 2, this.id_int / 2, 0xFFFFFF);
            vp_3.id_class(ml_1, this.id_super, id_class[(int)(rqR_2.id_break() / 150L % (long)id_class.length)], this.id_package / 2, this.id_int / 2 + 18, 0xFFFFFF);
        } else {
            this.id_final().id_class(ml_1, n, n2, f);
            vp_3.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 20, 0xFFFFFF);
            super.id_class(ml_1, n, n2, f);
        }
    }

    @Override
    public void id_break() {
        if (this.id_synchronized) {
            this.id_finally();
            this.id_native();
            this.id_class(this.id_catch);
            this.id_synchronized = false;
        }
    }

    public int id_break(int n) {
        return 115 + 40 * n;
    }

    public void id_finally() {
        this.id_catch = new vq_3(this, this.id_volatile);
        this.id_private = new vI_2(this, this.id_volatile);
        this.id_implements = new vt_3(this, this.id_volatile);
    }

    public LV<?> id_final() {
        return this.id_else;
    }

    public void id_native() {
        this.id_class(new LF(this.id_package / 2 - 120, this.id_int - 52, 80, 20, new rgn_3("stat.generalButton"), lF -> this.id_class(this.id_catch)));
        LF lF2 = this.id_class(new LF(this.id_package / 2 - 40, this.id_int - 52, 80, 20, new rgn_3("stat.itemsButton"), lF -> this.id_class(this.id_private)));
        LF lF3 = this.id_class(new LF(this.id_package / 2 + 40, this.id_int - 52, 80, 20, new rgn_3("stat.mobsButton"), lF -> this.id_class(this.id_implements)));
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int - 28, 200, 20, cN_2.id_byte, lF -> this.id_volatile.id_break(this.id_throws)));
        if (this.id_private.x_().isEmpty()) {
            lF2.id_int = false;
        }
        if (this.id_implements.x_().isEmpty()) {
            lF3.id_int = false;
        }
    }

    @Override
    protected void v_() {
        this.id_synchronized = true;
        this.id_volatile.id_void().id_class(new rmI_2(rmf_3.REQUEST_STATS));
    }

    @Override
    public boolean z_() {
        return !this.id_synchronized;
    }
}

