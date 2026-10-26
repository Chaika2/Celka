/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.movement;

import celestial.module.Category;
import celestial.module.Module;
import celestial.rrCD;
import celestial.rrCK;
import celestial.rrCo_1;
import celestial.rrIQ;
import celestial.rrIm_1;
import celestial.rrTF;
import celestial.rrnZ_2;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class Flight
extends Module
implements rrnZ_2 {
    public Object[] id_break;

    public Flight() {
        super("Flight", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u043b\u0435\u0442\u0430\u0442\u044c \u0431\u0435\u0437 \u043a\u0440\u0435\u0430\u0442\u0438\u0432\n\u0440\u0435\u0436\u0438\u043c\u0430", Category.MOVEMENT);
        this.id_throw();
        rrIQ var5 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Vanilla", "Vanilla", "\ufffd\ufffd\ufffdI\ufffd\t\ufffdu\ufffd]\u0006F\ufffd\u0697", "Jump");
        this.id_break[1] = var5;
        rrIm_1 var6 = (rrIm_1)new rrIm_1("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", Float.valueOf(2.0f), Float.valueOf(0.5f), Float.valueOf(10.0f), Float.valueOf(0.1f)).id_class(() -> {
            this.id_throw();
            return this.id_new() == (rrCD)this.id_break[4];
        });
        this.id_break[2] = var6;
        rrIm_1 var7 = (rrIm_1)new rrIm_1("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", Float.valueOf(1.0f), Float.valueOf(0.6f), Float.valueOf(5.0f), Float.valueOf(0.1f)).id_class(() -> {
            this.id_throw();
            return this.id_new() == (rrCK)this.id_break[5];
        });
        this.id_break[3] = var7;
        rrCD var8 = new rrCD(this);
        this.id_break[4] = var8;
        rrCK var9 = new rrCK(this);
        this.id_break[5] = var9;
        rrCo_1 var10 = new rrCo_1(this);
        this.id_break[6] = var10;
        this.id_class((rrIQ)this.id_break[1], (rrIm_1)this.id_break[2], (rrIm_1)this.id_break[3]);
        rrCD var11 = (rrCD)this.id_break[4];
        this.id_break[0] = var11;
        ((rrIQ)this.id_break[1]).id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_throw();
            if ((rrTF)this.id_break[0] != null && this.aJ_()) {
                ((rrTF)this.id_break[0]).aK_();
            }
            rrCD var9x = switch ((String)var2.getLeft()) {
                case "Vanilla" -> (rrCD)this.id_break[4];
                case "\ufffd\ufffd\ufffdI\ufffd\t\ufffdu\ufffd]\u0006F\ufffd\u0697" -> (rrCK)this.id_break[5];
                case "Jump" -> (rrCo_1)this.id_break[6];
                default -> null;
            };
            this.id_break[0] = var9x;
            if ((rrTF)this.id_break[0] != null && this.aJ_()) {
                ((rrTF)this.id_break[0]).aI_();
            }
        });
    }

    public rrIm_1 id_this() {
        this.id_throw();
        return (rrIm_1)this.id_break[2];
    }

    @Override
    public void id_class(boolean var1) {
        super.id_class(var1);
        this.id_new().aI_();
    }

    @Override
    public void id_class() {
        this.id_byte(false);
        this.id_new().id_super();
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        this.id_new().aK_();
    }

    public rrIQ id_continue() {
        this.id_throw();
        return (rrIQ)this.id_break[1];
    }

    public rrTF<Flight> id_new() {
        this.id_throw();
        return (rrTF)this.id_break[0];
    }

    public rrIm_1 id_super() {
        this.id_throw();
        return (rrIm_1)this.id_break[3];
    }

    private void id_throw() {
        if (this.id_break == null) {
            this.id_break = new Object[7];
        }
    }
}

