/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 */
package celestial;

import celestial.gy_3;
import celestial.rRn_1;
import celestial.rnW_2;
import com.mojang.brigadier.context.CommandContext;

public abstract class rRC<T extends rRC<T>> {
    protected final rRn_1<T> id_class;

    public abstract int id_byte();

    public rRC(rRn_1<T> rRn_12) {
        this.id_class = rRn_12;
    }

    public String toString() {
        return this.id_break();
    }

    protected /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.id_case();
    }

    protected abstract void id_class(CommandContext<gy_3> var1, String var2);

    public abstract void id_class(T var1, rnW_2 var2);

    protected void id_class(rnW_2 rnW_22) {
        if (rnW_22 != null) {
            this.id_class.id_byte.accept(rnW_22, (rnW_2)this.id_catch());
        }
    }

    protected abstract void id_class(String var1);

    public abstract String id_break();

    public void id_break(CommandContext<gy_3> commandContext, String string) {
        this.id_class(commandContext, string);
        this.id_class(((gy_3)commandContext.getSource()).id_super());
    }

    protected abstract T id_catch();

    protected abstract T id_case();
}

