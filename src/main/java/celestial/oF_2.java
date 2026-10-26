/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
package celestial;

import celestial.Oa_1;
import celestial.RH;
import celestial.gR_2;
import celestial.gp_3;
import celestial.gt_3;
import celestial.gy_3;
import celestial.rgn_3;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;

public class oF_2 {
    public static final SuggestionProvider<gy_3> id_class = (commandContext, suggestionsBuilder) -> {
        Oa_1 oa_1 = ((gy_3)commandContext.getSource()).id_super().w();
        gR_2.id_class(oa_1.id_case(), suggestionsBuilder, "#");
        return gR_2.id_class(oa_1.id_throws(), suggestionsBuilder);
    };

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("function").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("name", RH.id_class()).suggests(id_class).executes(commandContext -> oF_2.id_class((gy_3)commandContext.getSource(), RH.id_class((CommandContext<gy_3>)commandContext, "name")))));
    }

    private static int id_class(gy_3 gy_32, Collection<gt_3> collection) {
        int n = 0;
        for (gt_3 gt_32 : collection) {
            n += gy_32.id_super().w().id_class(gt_32, gy_32.id_finally().id_byte(2));
        }
        if (collection.size() == 1) {
            gy_32.id_class(new rgn_3("commands.function.success.single", n, collection.iterator().next().id_class()), true);
        } else {
            gy_32.id_class(new rgn_3("commands.function.success.multiple", n, collection.size()), true);
        }
        return n;
    }
}

