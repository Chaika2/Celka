/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.LF;
import celestial.Ml_1;
import celestial.Qi_1;
import celestial.Qw_1;
import celestial.ca_3;
import celestial.cb_3;
import celestial.mT_2;
import celestial.rgn_3;
import celestial.rrfZ_2;
import celestial.rrfo_3;
import celestial.vH_2;
import celestial.vM_2;
import celestial.vm_3;
import celestial.vp_3;

public class ZY
extends vm_3 {
    private final boolean id_class;

    public ZY(boolean bl) {
        super(bl ? new rgn_3("menu.game") : new rgn_3("menu.paused"));
        this.id_class = bl;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        if (this.id_class) {
            this.id_class(ml_1);
            ZY.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 40, 0xFFFFFF);
        } else {
            ZY.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 10, 0xFFFFFF);
        }
        super.id_class(ml_1, n, n2, f);
    }

    private void id_finally() {
        this.id_class(new LF(this.id_package / 2 - 102, this.id_int / 4 + 44 - 16, 204, 20, new rgn_3("menu.returnToGame"), lF -> {
            this.id_volatile.id_break((vm_3)null);
            ((Qi_1)this.id_volatile.id_class[22]).id_catch();
        }));
        this.id_class(new LF(this.id_package / 2 - 102, this.id_int / 4 + 69 - 16, 98, 20, new rgn_3("gui.advancements"), lF -> this.id_volatile.id_break(new ca_3(((Aq_1)((cb_3)this.id_volatile.id_class[57]).id_break[0]).id_private()))));
        this.id_class(new LF(this.id_package / 2 + 4, this.id_int / 4 + 69 - 16, 98, 20, new rgn_3("gui.stats"), lF -> this.id_volatile.id_break(new vp_3(this, ((cb_3)this.id_volatile.id_class[57]).id_abstract()))));
        this.id_class(new LF(this.id_package / 2 - 102, this.id_int / 4 + 94 - 16, 98, 20, new rgn_3("menu.options"), lF -> this.id_volatile.id_break(new vM_2(this, (Qw_1)this.id_volatile.id_class[20]))));
        LF lF2 = this.id_class(new LF(this.id_package / 2 + 4, this.id_int / 4 + 94 - 16, 98, 20, new rgn_3("menu.shareToLan"), lF -> this.id_volatile.id_break(new vH_2(this))));
        lF2.id_int = this.id_volatile.id_finally() && !this.id_volatile.id_this().d();
        LF lF3 = this.id_class(new LF(this.id_package / 2 - 102, this.id_int / 4 + 119 - 16, 204, 20, new rgn_3("menu.returnToMenu"), lF -> {
            if (rrfZ_2.id_byte()) {
                id_import.id_break(new mT_2(bl -> {
                    if (bl) {
                        lF.id_int = false;
                        rrfo_3.id_case();
                    } else {
                        id_import.id_break(this);
                    }
                }, new rgn_3("quit.confirm.title"), new rgn_3("quit.inpvp.confirm")));
            } else {
                lF.id_int = false;
                rrfo_3.id_case();
            }
        }));
        if (!this.id_volatile.id_switch()) {
            lF3.id_break(new rgn_3("menu.disconnect"));
            this.id_class(new LF(this.id_package / 2 - 102, this.id_int / 4 + 144 - 16, 204, 20, new rgn_3("menu.reconnect"), lF -> {
                if (rrfZ_2.id_byte()) {
                    id_import.id_break(new mT_2(bl -> {
                        if (bl) {
                            lF.id_int = false;
                            rrfo_3.id_break();
                        } else {
                            id_import.id_break(this);
                        }
                    }, new rgn_3("reconnect.confirm.title"), new rgn_3("reconnect.inpvp.confirm")));
                } else {
                    rrfo_3.id_break();
                }
            }));
        }
    }

    @Override
    protected void v_() {
        if (this.id_class) {
            this.id_finally();
        }
    }
}

