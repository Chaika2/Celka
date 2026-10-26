/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Ax_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Ve_1;
import celestial.ZI;
import celestial.Zf_1;
import celestial.cb_3;
import celestial.rRl_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.vm_3;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Optional;

public class Zt_1
extends vm_3 {
    public static final rqO_2 id_class = new rqO_2("textures/gui/container/gamemode_switcher.png");
    private static final int id_throws = ZI.values().length * 30 - 5;
    private static final rgP_2 id_case = new rgn_3("debug.gamemodes.select_next", new rgn_3("debug.gamemodes.press_f4").id_class(rgF_2.AQUA));
    private final Optional<ZI> id_catch;
    private Optional<ZI> id_private = Optional.empty();
    private int id_implements;
    private int id_finally;
    private boolean id_else;
    private final List<Zf_1> id_synchronized = Lists.newArrayList();

    public Zt_1() {
        super(rgN_2.id_byte);
        this.id_catch = ZI.id_class(this.id_finally());
    }

    private static void id_class(QY qY, Optional<ZI> optional) {
        if ((Ax_1)qY.id_class[55] != null && (cb_3)qY.id_class[57] != null && optional.isPresent()) {
            Optional<ZI> optional2 = ZI.id_class(((Ax_1)qY.id_class[55]).id_native());
            ZI zI = optional.get();
            if (optional2.isPresent() && ((cb_3)qY.id_class[57]).id_catch(2) && zI != optional2.get()) {
                ((cb_3)qY.id_class[57]).id_protected(zI.id_break());
            }
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        if (!this.id_final()) {
            ml_1.id_class();
            RenderSystem.enableBlend();
            this.id_volatile.A().id_class(id_class);
            int n3 = this.id_package / 2 - 62;
            int n4 = this.id_int / 2 - 30 - 27;
            Zt_1.id_class(ml_1, n3, n4, 0.0f, 0.0f, 125, 75, 128, 128);
            ml_1.id_break();
            super.id_class(ml_1, n, n2, f);
            this.id_private.ifPresent(zI -> Zt_1.id_class(ml_1, this.id_super, zI.id_class(), this.id_package / 2, this.id_int / 2 - 30 - 20, -1));
            Zt_1.id_class(ml_1, this.id_super, id_case, this.id_package / 2, this.id_int / 2 + 5, 0xFFFFFF);
            if (!this.id_else) {
                this.id_implements = n;
                this.id_finally = n2;
                this.id_else = true;
            }
            boolean bl = this.id_implements == n && this.id_finally == n2;
            for (Zf_1 zf_1 : this.id_synchronized) {
                zf_1.id_class(ml_1, n, n2, f);
                this.id_private.ifPresent(zI -> zf_1.id_class(zI == zf_1.id_throws));
                if (bl || !zf_1.B_()) continue;
                this.id_private = Optional.of(zf_1.id_throws);
            }
        }
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (n == 293 && this.id_private.isPresent()) {
            this.id_else = false;
            this.id_private = this.id_private.get().id_byte();
            return true;
        }
        return super.id_class(n, n2, n3);
    }

    private rRl_1 id_finally() {
        rRl_1 rRl_12 = ((Ax_1)QY.id_instanceof().id_class[55]).id_native();
        rRl_1 rRl_13 = ((Ax_1)QY.id_instanceof().id_class[55]).id_extends();
        if (rRl_13 == rRl_1.NOT_SET) {
            rRl_13 = rRl_12 == rRl_1.CREATIVE ? rRl_1.SURVIVAL : rRl_1.CREATIVE;
        }
        return rRl_13;
    }

    private boolean id_final() {
        if (!Ve_1.id_class(this.id_volatile.id_else().id_implements(), 292)) {
            this.id_native();
            this.id_volatile.id_break((vm_3)null);
            return true;
        }
        return false;
    }

    private void id_native() {
        Zt_1.id_class(this.id_volatile, this.id_private);
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_private = this.id_catch.isPresent() ? this.id_catch : ZI.id_class(((Ax_1)this.id_volatile.id_class[55]).id_native());
        for (int i = 0; i < ZI.field_238721_e_.length; ++i) {
            ZI zI = ZI.field_238721_e_[i];
            this.id_synchronized.add(new Zf_1(this, zI, this.id_package / 2 - id_throws / 2 + i * 30, this.id_int / 2 - 30));
        }
    }

    @Override
    public boolean z_() {
        return false;
    }
}

