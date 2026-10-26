/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
package celestial;

import celestial.gp_3;
import celestial.gy_3;
import celestial.oA_2;
import celestial.rRA;
import celestial.rRC;
import celestial.rRF;
import celestial.rRn_1;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class on_3
implements rRF {
    public final /* synthetic */ LiteralArgumentBuilder id_class;

    @Override
    public <T extends rRC<T>> void id_byte(rRA<T> rRA2, rRn_1<T> rRn_12) {
        this.id_class.then(((LiteralArgumentBuilder)gp_3.id_class(rRA2.id_class()).executes(commandContext -> oA_2.id_class((gy_3)commandContext.getSource(), rRA2))).then(rRn_12.id_class("value").executes(commandContext -> oA_2.id_class((CommandContext<gy_3>)commandContext, rRA2))));
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public on_3(LiteralArgumentBuilder literalArgumentBuilder) {
        this.id_class = literalArgumentBuilder;
    }
}

