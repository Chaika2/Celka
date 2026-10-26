/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.render;

import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgv_3;
import celestial.rja_3;
import celestial.rrAG;
import celestial.rrfp_3;
import celestial.rrfu_3;
import celestial.rrjD_2;
import celestial.rrje_3;
import celestial.rrtd_3;
import celestial.rrth_3;

public class DeathCoords
extends Module {
    public DeathCoords() {
        super("Death Coords", "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b \u0432\u0430\u0448\u0435\u0439\n\u0441\u043c\u0435\u0440\u0442\u0438", Category.UTIL);
    }

    private String id_this() {
        String var1 = "\u0422\u043e\u0447\u043a\u0430 \u0441\u043c\u0435\u0440\u0442\u0438";
        int var2 = 1;
        while (((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0])).id_protected(var1)) {
            var1 = String.format("\u0422\u043e\u0447\u043a\u0430 \u0441\u043c\u0435\u0440\u0442\u0438 %d", ++var2);
        }
        return var1;
    }

    private void id_class(String var1, rja_3 var2) {
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtd_3(this.id_final(), var1, 5000));
        rVi_1 var3 = rgv_3.id_class(rrfu_3.id_break(this).id_class(rgF_2.GRAY).id_break(var1).id_class(new rgN_2(" (\u041d\u0430\u0436\u043c\u0438\u0442\u0435, \u0447\u0442\u043e\u0431\u044b \u0441\u043e\u0437\u0434\u0430\u0442\u044c \u0442\u043e\u0447\u043a\u0443)").id_class(rgF_2.RED)), new rgl_3(() -> this.id_class(var2)));
        rrfu_3.id_class(var3);
    }

    private void id_class(rja_3 var1) {
        ((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0])).id_class(new rrjD_2(this.id_this(), var1.id_else(), rrfp_3.id_throws()), true);
    }

    @EventTarget
    public void id_class(rrAG var1) {
        rja_3 var2 = var1.id_class().id_finally();
        String var3 = String.format("X: %d Y: %d Z: %d", var2.b_(), var2.c_(), var2.d_());
        String var4 = String.format("\u0412\u0430\u0448\u0438 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b \u0441\u043c\u0435\u0440\u0442\u0438: %s", var3);
        this.id_class(var4, var2);
    }
}

