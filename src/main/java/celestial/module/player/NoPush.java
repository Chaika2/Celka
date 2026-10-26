/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.player;

import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rrAd_1;
import celestial.rrAx_1;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrLu_1;
import celestial.ruS_2;
import celestial.rvQ_2;

public class NoPush
extends Module {
    public Object[] id_break;

    public NoPush() {
        super("No Push", "\u0418\u0433\u043d\u043e\u0440\u0438\u0440\u0443\u0435\u0442 \u043e\u0442\u0442\u0430\u043b\u043a\u0438\u0432\u0430\u043d\u0438\u0435 \u043e\u0442\\n\u0447\u0435\u0433\u043e-\u043b\u0438\u0431\u043e", Category.PLAYER);
        this.id_super();
        rrIk_1 var5 = new rrIk_1("\u0411\u043b\u043e\u043a\u0438", true);
        this.id_break[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u0421\u0443\u0449\u043d\u043e\u0441\u0442\u0438", true);
        this.id_break[1] = var6;
        rrIk_1 var7 = new rrIk_1("\u0423\u0434\u043e\u0447\u043a\u0438", true);
        this.id_break[2] = var7;
        rrIk_1 var8 = new rrIk_1("\u0412\u043e\u0434\u0443", false);
        this.id_break[3] = var8;
        rrIk_1 var9 = new rrIk_1("\u041f\u0443\u0437\u044b\u0440\u0438", false);
        this.id_break[4] = var9;
        rrIk_1 var10 = new rrIk_1("\u0413\u0440\u0430\u043d\u0438\u0446\u0443", false);
        this.id_break[5] = var10;
        this.id_class(new rrIc_1("\u0418\u0433\u043d\u043e\u0440\u0438\u0440\u043e\u0432\u0430\u0442\u044c", (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[5]));
    }

    @EventTarget
    public void id_class(rrAx_1 var1) {
        this.id_super();
        rrAd_1 var2 = var1.id_class();
        if (var2 == (rrAd_1)((Object)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[2]) && ((rrIk_1)this.id_break[0]).id_class().booleanValue()) {
            var1.id_class(true);
        } else if (var2 == (rrAd_1)((Object)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[1]) && ((rrIk_1)this.id_break[1]).id_class().booleanValue()) {
            var1.id_class(true);
        } else if (var2 == (rrAd_1)((Object)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[0]) && ((rrIk_1)this.id_break[3]).id_class().booleanValue()) {
            var1.id_class(true);
        } else if (var2 == (rrAd_1)((Object)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[3]) && ((rrIk_1)this.id_break[4]).id_class().booleanValue()) {
            var1.id_class(true);
        }
    }

    @EventTarget
    public void id_class(rrLu_1 var1) {
        rvQ_2 var2;
        this.id_super();
        ruS_2<?> ruS_22 = var1.id_class();
        if (ruS_22 instanceof rvQ_2 && (var2 = (rvQ_2)ruS_22).id_break() == 31 && ((rrIk_1)this.id_break[2]).id_class().booleanValue()) {
            var1.id_class(true);
        }
    }

    public boolean id_new() {
        this.id_super();
        return this.aJ_() && ((rrIk_1)this.id_break[5]).id_class() != false;
    }

    private void id_super() {
        if (this.id_break == null) {
            this.id_break = new Object[6];
        }
    }
}

