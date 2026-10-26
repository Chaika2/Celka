/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.movement;

import celestial.Qw_1;
import celestial.Vu_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rhx_3;
import celestial.rrHB;
import celestial.rrHS;
import celestial.rrHr_1;
import celestial.rrIQ;
import celestial.rrIk_1;
import celestial.rrTF;
import celestial.rrfC_2;
import celestial.rrli_3;
import celestial.rrvd_1;
import celestial.setting.Setting;
import celestial.vm_3;
import celestial.vs_3;
import java.util.function.Function;
import org.apache.commons.lang3.tuple.Pair;

public class GuiMove
extends Module {
    public Object[] id_break;
    private static long[] id_catch;

    public GuiMove() {
        super("Gui Move", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0445\u043e\u0434\u0438\u0442\u044c \u0432 \u043e\u0442\u043a\u0440\u044b\u0442\u044b\u0445\n\u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440\u0430\u0445", Category.PLAYER);
        this.id_while();
        rrIQ var5 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Advanced", "Advanced", "Funtime", "Vanilla");
        this.id_break[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u041d\u0435 \u0432 \u0442\u0435\u043a\u0441\u0442\u043e\u0432\u044b\u0445 \u043f\u043e\u043b\u044f\u0445", true);
        this.id_break[1] = var6;
        this.id_class((rrIQ)this.id_break[0], (rrIk_1)this.id_break[1]);
        rrHr_1 var7 = new rrHr_1(this);
        this.id_break[2] = var7;
        rrHB var8 = new rrHB(this);
        this.id_break[3] = var8;
        rrHS var9 = new rrHS(this);
        this.id_break[4] = var9;
        rrHB var10 = (rrHB)this.id_break[3];
        this.id_break[5] = var10;
        ((rrIQ)this.id_break[0]).id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_while();
            if ((rrli_3)this.id_break[5] != null && this.aJ_()) {
                ((rrli_3)this.id_break[5]).aK_();
            }
            rrHr_1 var9x = switch ((String)var2.getLeft()) {
                case "Advanced" -> (rrHr_1)this.id_break[2];
                case "Funtime" -> (rrHB)this.id_break[3];
                case "Vanilla" -> (rrHS)this.id_break[4];
                default -> null;
            };
            this.id_break[5] = var9x;
            if ((rrli_3)this.id_break[5] != null && this.aJ_()) {
                ((rrli_3)this.id_break[5]).aI_();
            }
        });
    }

    @Override
    public void id_class(boolean var1) {
        if (this.id_new().aI_()) {
            super.id_class(var1);
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_while();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            if (!this.id_super()) {
                this.id_break[6] = System.currentTimeMillis();
            }
            if ((vm_3)GuiMove.id_import.id_class[73] == null) {
                return;
            }
            if (this.id_class((vm_3)GuiMove.id_import.id_class[73])) {
                this.id_class((Vu_1 var0) -> false);
                return;
            }
            this.id_class((Vu_1 var0) -> rrfC_2.id_break(var0.id_int().id_break()));
            if (((rhx_3)((cb_3)GuiMove.id_import.id_class[57]).id_implements[18]).id_break && !((cb_3)GuiMove.id_import.id_class[57]).BL()) {
                ((Qw_1)GuiMove.id_import.id_class[20]).k.id_class(rrfC_2.id_break(((Qw_1)GuiMove.id_import.id_class[20]).k.id_int().id_break()));
            }
        }
    }

    private void id_class(Function<Vu_1, Boolean> var1) {
        for (Vu_1 var5 : ((Qw_1)GuiMove.id_import.id_class[20]).Pj) {
            var5.id_class(var1.apply(var5));
        }
    }

    private boolean id_class(vm_3 var1) {
        this.id_while();
        if (!((rrIk_1)this.id_break[1]).id_class().booleanValue() || !((rrvd_1)((Object)rrvd_1.staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7[0])).id_break() && !vs_3.INSTANCE.id_break()) {
            return ((rrli_3)this.id_break[5]).id_class(var1);
        }
        return true;
    }

    @Override
    public void id_throws(boolean var1) {
        if (this.id_new().aK_()) {
            super.id_throws(var1);
        }
        this.id_class((Vu_1 var0) -> false);
    }

    public long id_continue() {
        this.id_while();
        return (Long)this.id_break[6];
    }

    private static void id_else() {
        id_catch = new long[1];
    }

    public rrTF<GuiMove> id_new() {
        this.id_while();
        return (rrli_3)this.id_break[5];
    }

    public boolean id_super() {
        this.id_while();
        if ((rrli_3)this.id_break[5] == (rrHB)this.id_break[3]) {
            return ((rrHB)this.id_break[3]).id_class();
        }
        return (rrli_3)this.id_break[5] == (rrHr_1)this.id_break[2] ? ((rrHr_1)this.id_break[2]).id_class() : true;
    }

    private void id_while() {
        if (this.id_break == null) {
            this.id_break = new Object[7];
            this.id_break[6] = 0L;
        }
    }
}

