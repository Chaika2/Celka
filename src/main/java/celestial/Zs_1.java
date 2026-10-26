/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Ml_1;
import celestial.Qi_1;
import celestial.Qw_1;
import celestial.cv_3;
import celestial.rgS_2;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.vm_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class Zs_1
extends vm_3 {
    private static final rqO_2 id_class = new rqO_2("textures/gui/demo_background.png");
    private cv_3 id_throws = cv_3.id_class;
    private cv_3 id_case = cv_3.id_class;

    public Zs_1() {
        super(new rgn_3("demo.help.title"));
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        int n3 = (this.id_package - 248) / 2 + 10;
        int n4 = (this.id_int - 166) / 2 + 8;
        this.id_super.id_byte(ml_1, this.id_extends, n3, n4, 0x1F1F1F);
        n4 = this.id_throws.id_byte(ml_1, n3, n4 + 12, 12, 0x4F4F4F);
        this.id_case.id_byte(ml_1, n3, n4 + 20, 9, 0x1F1F1F);
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public void id_class(Ml_1 ml_1) {
        super.id_class(ml_1);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(id_class);
        int n = (this.id_package - 248) / 2;
        int n2 = (this.id_int - 166) / 2;
        this.id_break(ml_1, n, n2, 0, 0, 248, 166);
    }

    @Override
    protected void v_() {
        int n = -16;
        this.id_class(new LF(this.id_package / 2 - 116, this.id_int / 2 + 62 + -16, 114, 20, new rgn_3("demo.help.buy"), lF -> {
            lF.id_int = false;
            rqR_2.id_implements().id_class("http://www.minecraft.net/store?source=demo");
        }));
        this.id_class(new LF(this.id_package / 2 + 2, this.id_int / 2 + 62 + -16, 114, 20, new rgn_3("demo.help.later"), lF -> {
            this.id_volatile.id_break((vm_3)null);
            ((Qi_1)this.id_volatile.id_class[22]).id_catch();
        }));
        Qw_1 qw_1 = (Qw_1)this.id_volatile.id_class[20];
        this.id_throws = cv_3.id_class(this.id_super, new rgn_3("demo.help.movementShort", qw_1.h.id_native(), qw_1.X.id_native(), qw_1.J.id_native(), qw_1.x.id_native()), new rgn_3("demo.help.movementMouse"), new rgn_3("demo.help.jump", qw_1.d.id_native()), new rgn_3("demo.help.inventory", qw_1.z.id_native()));
        this.id_case = cv_3.id_class(this.id_super, (rgS_2)new rgn_3("demo.help.fullWrapped"), 218);
    }
}

