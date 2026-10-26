/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.player;

import celestial.Wp_1;
import celestial.event.EventTarget;
import celestial.iB_2;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rrAR;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrLe_1;
import celestial.rrfZ_2;
import celestial.rrlA_2;
import celestial.rrln_3;
import celestial.rxJ_2;
import celestial.xd_3;

public class NoInteract
extends Module {
    public Object[] id_break;
    public static Object[] id_byte;

    public NoInteract() {
        super("No Interact", "\u041d\u0435 \u0434\u0430\u0435\u0442 \u043d\u0430\u0436\u0438\u043c\u0430\u0442\u044c \u041f\u041a\u041c \u043f\u043e\n\u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u043c \u043e\u0431\u044a\u0435\u043a\u0442\u0430\u043c", Category.PLAYER);
        this.id_while();
        rrIk_1 var5 = new rrIk_1("\u0422\u043e\u043b\u044c\u043a\u043e \u0432 \u041f\u0412\u041f", false);
        this.id_break[0] = var5;
        this.id_class(new rrIc_1("\u0412\u044b\u0431\u043e\u0440", (rrIk_1)id_byte[0], (rrIk_1)id_byte[1], (rrIk_1)id_byte[2], (rrIk_1)id_byte[3], (rrIk_1)id_byte[4], (rrIk_1)id_byte[5], (rrIk_1)id_byte[6], (rrIk_1)id_byte[7], (rrIk_1)id_byte[8], (rrIk_1)id_byte[9], (rrIk_1)id_byte[10], (rrIk_1)id_byte[11], (rrIk_1)id_byte[12], (rrIk_1)id_byte[13], (rrIk_1)id_byte[14], (rrIk_1)id_byte[15]), (rrIk_1)this.id_break[0]);
    }

    @EventTarget
    public void id_class(rrAR var1) {
        rxJ_2 var4;
        rdn_3 var2;
        rdb_3 var3;
        this.id_while();
        if (!(((rrIk_1)this.id_break[0]).id_class().booleanValue() && !rrfZ_2.id_byte() || (var3 = (var2 = var1.id_class()).id_break()) == rdy_3.dJ || var3 instanceof rxJ_2 && (var4 = (rxJ_2)var3).id_catch() instanceof Wp_1)) {
            if (((rrIk_1)id_byte[0]).id_class().booleanValue()) {
                var1.id_class(true);
            } else {
                xd_3 var9 = var1.id_protected();
                for (rrlA_2 var8 : rrlA_2.values()) {
                    if (!var8.id_class().get().booleanValue() || !var8.id_break().isInstance(var9)) continue;
                    var1.id_class(true);
                    break;
                }
            }
        }
    }

    @EventTarget
    public void id_class(rrLe_1 var1) {
        this.id_while();
        if (!((rrIk_1)this.id_break[0]).id_class().booleanValue() || rrfZ_2.id_byte()) {
            if (((rrIk_1)id_byte[0]).id_class().booleanValue()) {
                var1.id_class(true);
            } else {
                iB_2 var2 = var1.id_break();
                for (rrln_3 var6 : rrln_3.values()) {
                    if (!var6.id_break().get().booleanValue() || !var6.id_class().test(var2)) continue;
                    var1.id_class(true);
                    break;
                }
            }
        }
    }

    private void id_while() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
        }
    }

    static {
        Object[] var0 = new Object[]{new rrIk_1("\u0412\u0441\u0435 \u043e\u0431\u044a\u0435\u043a\u0442\u044b", false), new rrIk_1("\u0418\u0433\u0440\u043e\u043a\u0438", false).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false), new rrIk_1("\u0410\u0440\u043c\u043e\u0440 \u0441\u0442\u0435\u043d\u0434\u044b", true).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false), new rrIk_1("\u0421\u0443\u043d\u0434\u0443\u043a\u0438", false).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false), new rrIk_1("\u0411\u043e\u0447\u043a\u0438", false).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false), new rrIk_1("\u0414\u0432\u0435\u0440\u0438", true).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false), new rrIk_1("\u0412\u043e\u0440\u043e\u043d\u043a\u0438", true).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false), new rrIk_1("\u041a\u043d\u043e\u043f\u043a\u0438", true).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false), new rrIk_1("\u0420\u0430\u0437\u0434\u0430\u0442\u0447\u0438\u043a\u0438", true).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false), new rrIk_1("\u041d\u043e\u0442\u043d\u044b\u0435 \u0431\u043b\u043e\u043a\u0438", false).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false), new rrIk_1("\u0412\u0435\u0440\u0441\u0442\u0430\u043a\u0438", true).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false), new rrIk_1("\u041b\u044e\u043a\u0438", true).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false), new rrIk_1("\u041f\u0435\u0447\u043a\u0438", true).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false), new rrIk_1("\u041a\u0430\u043b\u0438\u0442\u043a\u0438", true).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false), new rrIk_1("\u041d\u0430\u043a\u043e\u0432\u0430\u043b\u044c\u043d\u0438", false).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false), new rrIk_1("\u0420\u044b\u0447\u0430\u0433\u0438", false).id_class(() -> ((rrIk_1)id_byte[0]).id_class() == false)};
        id_byte = var0;
    }
}

