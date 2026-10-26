/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.combat;

import celestial.event.EventTarget;
import celestial.iB_2;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrFj_1;
import celestial.rrIQ;
import celestial.rrIm_1;
import celestial.rrIy_1;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class HitSounds
extends Module {
    public Object[] id_break;

    public HitSounds() {
        super("Hit Sounds", "\u0412\u043e\u0441\u043f\u0440\u043e\u0438\u0437\u0432\u043e\u0434\u0438\u0442 \u0437\u0432\u0443\u043a\u0438 \u043f\u0440\u0438 \u0443\u0434\u0430\u0440\u0435", Category.COMBAT);
        this.id_goto();
        rrIQ var5 = new rrIQ("\u0412\u044b\u0431\u043e\u0440 \u0437\u0432\u0443\u043a\u0430", "UwU", "UwU", "\u0411\u043e\u043d\u043a", "\u0421\u0442\u043e\u043d\u044b", "\u041c\u0430\u0440\u043a\u0435\u0440");
        this.id_break[0] = var5;
        rrIm_1 var6 = new rrIm_1("\u041f\u0438\u0442\u0447 \u0437\u0432\u0443\u043a\u0430", Float.valueOf(1.0f), Float.valueOf(0.1f), Float.valueOf(2.0f), Float.valueOf(0.1f));
        this.id_break[1] = var6;
        this.id_class((rrIQ)this.id_break[0], (rrIm_1)this.id_break[1]);
        ((rrIQ)this.id_break[0]).id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_goto();
            if (!((Boolean)var2.getRight()).booleanValue()) {
                String var3 = (String)var1.id_byte();
                float var4 = ((Float)((rrIm_1)this.id_break[1]).id_byte()).floatValue();
                this.id_class(var3, var4);
            }
        });
    }

    @EventTarget
    public void id_class(rrFj_1 var1) {
        this.id_goto();
        if (var1.id_class() instanceof iB_2) {
            this.id_class((String)((rrIQ)this.id_break[0]).id_byte(), ((Float)((rrIm_1)this.id_break[1]).id_byte()).floatValue());
        }
    }

    private void id_class(String var1, float var2) {
        int var4 = -1;
        switch (var1.hashCode()) {
            case 85459: {
                if (!var1.equals("UwU")) break;
                var4 = 0;
                break;
            }
            case 32090794: {
                if (!var1.equals("\u0411\u043e\u043d\u043a")) break;
                var4 = 1;
                break;
            }
            case 1009712267: {
                if (!var1.equals("\u0421\u0442\u043e\u043d\u044b")) break;
                var4 = 3;
                break;
            }
            case 1076597177: {
                if (!var1.equals("\u041c\u0430\u0440\u043a\u0435\u0440")) break;
                var4 = 2;
            }
        }
        switch (var4) {
            case 0: {
                rrIy_1.id_class(rqn_3.zx, 1.0f, var2);
                break;
            }
            case 1: {
                rrIy_1.id_class(rqn_3.zd, 1.0f, var2);
                break;
            }
            case 2: {
                rrIy_1.id_class(rqn_3.zk, 1.0f, var2);
                break;
            }
            case 3: {
                rrIy_1.id_class(this.id_public(), 1.0f, var2);
            }
        }
    }

    private void id_goto() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
        }
    }

    private rqA_2 id_public() {
        return switch ((int)(Math.random() * 4.0)) {
            case 1 -> rqn_3.zz;
            case 2 -> rqn_3.zQ;
            case 3 -> rqn_3.zN;
            default -> rqn_3.zW;
        };
    }
}

