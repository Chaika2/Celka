/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.player;

import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhz_3;
import celestial.rrLH;
import celestial.rrLy_1;
import celestial.xc_3;
import org.apache.commons.lang3.tuple.Pair;

public class AutoTool
extends Module {
    public Object[] id_break;
    private static float[] id_private = new float[2];

    public AutoTool() {
        super("Auto Tool", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0431\u0435\u0440\u0435\u0442 \u043b\u0443\u0447\u0448\u0438\u0439\n\u0438\u043d\u0441\u0442\u0440\u0443\u043c\u0435\u043d\u0442 \u0434\u043b\u044f \u043b\u043e\u043c\u0430\u043d\u0438\u044f \u0431\u043b\u043e\u043a\u0430", Category.PLAYER);
        this.id_else();
        this.id_break[0] = -1;
    }

    @EventTarget
    public void id_class(rrLH var1) {
        this.id_else();
        if (var1.id_protected() == (rrLy_1)((Object)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[0])) {
            Pair<rdn_3, Integer> var2;
            if (var1.id_byte() || ((cb_3)AutoTool.id_import.id_class[57]).id_native()) {
                return;
            }
            if ((Integer)this.id_break[0] != -1) {
                ((rhz_3)((cb_3)AutoTool.id_import.id_class[57]).id_implements[1]).id_protected = (Integer)this.id_break[0];
            }
            if ((var2 = this.id_class(var1.id_class(), var1.id_break())) == null) {
                return;
            }
            int var3 = (Integer)var2.getRight();
            if (var3 == -1 || var3 == ((rhz_3)((cb_3)AutoTool.id_import.id_class[57]).id_implements[1]).id_protected) {
                return;
            }
            this.id_break[0] = ((rhz_3)((cb_3)AutoTool.id_import.id_class[57]).id_implements[1]).id_protected;
            ((rhz_3)((cb_3)AutoTool.id_import.id_class[57]).id_implements[1]).id_protected = var3;
        } else if (var1.id_protected() == (rrLy_1)((Object)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[1]) && (Integer)this.id_break[0] != -1) {
            ((rhz_3)((cb_3)AutoTool.id_import.id_class[57]).id_implements[1]).id_protected = (Integer)this.id_break[0];
            this.id_break[0] = -1;
        }
    }

    public Pair<rdn_3, Integer> id_class(xc_3 var1, rfH_2 var2) {
        rdn_3 var3 = rdn_3.id_break;
        int var4 = -1;
        float var5 = id_private[0];
        for (int var6 = 0; var6 < 9; ++var6) {
            float var8;
            rdn_3 var7 = ((rhz_3)((cb_3)AutoTool.id_import.id_class[57]).id_implements[1]).id_class.get(var6);
            if (var7.id_class() || !var7.id_break().id_class(var1, (rYB)((gm_3)AutoTool.id_import.id_class[56]), var2, (cb_3)AutoTool.id_import.id_class[57]) || (var8 = var1.id_class((cb_3)AutoTool.id_import.id_class[57], var7, (gm_3)AutoTool.id_import.id_class[56], var2)) <= id_private[1] || !(var8 > var5)) continue;
            var5 = var8;
            var4 = var6;
            var3 = var7;
        }
        return Pair.of((Object)var3, (Object)var4);
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_else();
        super.id_throws(var1);
        this.id_break[0] = -1;
    }

    private void id_else() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
            this.id_break[0] = 0;
        }
    }

    private static void id_new() {
        id_private = new float[2];
    }
}

