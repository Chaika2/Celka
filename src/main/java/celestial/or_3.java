/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
package celestial;

import celestial.RZ;
import celestial.YT;
import celestial.Ym_1;
import celestial.an_3;
import celestial.gR_2;
import celestial.gp_3;
import celestial.gy_3;
import celestial.iB_2;
import celestial.iJ_2;
import celestial.ic_3;
import celestial.id_3;
import celestial.ik_3;
import celestial.ix_3;
import celestial.rVL;
import celestial.rgn_3;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.UUID;

public class or_3 {
    private static final SuggestionProvider<gy_3> id_class = (commandContext, suggestionsBuilder) -> gR_2.id_class(rVL.O.id_protected(), suggestionsBuilder);
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("commands.attribute.failed.entity", object));
    private static final Dynamic2CommandExceptionType id_byte = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("commands.attribute.failed.no_attribute", object, object2));
    private static final Dynamic3CommandExceptionType id_protected = new Dynamic3CommandExceptionType((object, object2, object3) -> new rgn_3("commands.attribute.failed.no_modifier", object2, object, object3));
    private static final Dynamic3CommandExceptionType id_throws = new Dynamic3CommandExceptionType((object, object2, object3) -> new rgn_3("commands.attribute.failed.modifier_already_present", object3, object2, object));

    private static int id_byte(gy_3 gy_32, an_3 an_32, iJ_2 iJ_22, double d) throws CommandSyntaxException {
        or_3.id_class(an_32, iJ_22).id_class(d);
        gy_32.id_class(new rgn_3("commands.attribute.base_value.set.success", new rgn_3(iJ_22.id_byte()), an_32.g(), d), false);
        return 1;
    }

    private static ic_3 id_class(an_3 an_32, iJ_2 iJ_22) throws CommandSyntaxException {
        ic_3 ic_32 = or_3.id_class(an_32).BT().id_class(iJ_22);
        if (ic_32 == null) {
            throw id_byte.create((Object)an_32.g(), (Object)new rgn_3(iJ_22.id_byte()));
        }
        return ic_32;
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("attribute").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("target", RZ.id_class()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("attribute", Ym_1.id_class()).suggests(id_class).then(((LiteralArgumentBuilder)gp_3.id_class("get").executes(commandContext -> or_3.id_class((gy_3)commandContext.getSource(), RZ.id_class((CommandContext<gy_3>)commandContext, "target"), Ym_1.id_protected((CommandContext<gy_3>)commandContext, "attribute"), 1.0))).then(gp_3.id_class("scale", DoubleArgumentType.doubleArg()).executes(commandContext -> or_3.id_class((gy_3)commandContext.getSource(), RZ.id_class((CommandContext<gy_3>)commandContext, "target"), Ym_1.id_protected((CommandContext<gy_3>)commandContext, "attribute"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale")))))).then(((LiteralArgumentBuilder)gp_3.id_class("base").then(gp_3.id_class("set").then(gp_3.id_class("value", DoubleArgumentType.doubleArg()).executes(commandContext -> or_3.id_byte((gy_3)commandContext.getSource(), RZ.id_class((CommandContext<gy_3>)commandContext, "target"), Ym_1.id_protected((CommandContext<gy_3>)commandContext, "attribute"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"value")))))).then(((LiteralArgumentBuilder)gp_3.id_class("get").executes(commandContext -> or_3.id_break((gy_3)commandContext.getSource(), RZ.id_class((CommandContext<gy_3>)commandContext, "target"), Ym_1.id_protected((CommandContext<gy_3>)commandContext, "attribute"), 1.0))).then(gp_3.id_class("scale", DoubleArgumentType.doubleArg()).executes(commandContext -> or_3.id_break((gy_3)commandContext.getSource(), RZ.id_class((CommandContext<gy_3>)commandContext, "target"), Ym_1.id_protected((CommandContext<gy_3>)commandContext, "attribute"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale"))))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("modifier").then(gp_3.id_class("add").then(gp_3.id_class("uuid", YT.id_class()).then(gp_3.id_class("name", StringArgumentType.string()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("value", DoubleArgumentType.doubleArg()).then(gp_3.id_class("add").executes(commandContext -> or_3.id_class((gy_3)commandContext.getSource(), RZ.id_class((CommandContext<gy_3>)commandContext, "target"), Ym_1.id_protected((CommandContext<gy_3>)commandContext, "attribute"), YT.id_class((CommandContext<gy_3>)commandContext, "uuid"), StringArgumentType.getString((CommandContext)commandContext, (String)"name"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"value"), id_3.ADDITION)))).then(gp_3.id_class("multiply").executes(commandContext -> or_3.id_class((gy_3)commandContext.getSource(), RZ.id_class((CommandContext<gy_3>)commandContext, "target"), Ym_1.id_protected((CommandContext<gy_3>)commandContext, "attribute"), YT.id_class((CommandContext<gy_3>)commandContext, "uuid"), StringArgumentType.getString((CommandContext)commandContext, (String)"name"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"value"), id_3.MULTIPLY_TOTAL)))).then(gp_3.id_class("multiply_base").executes(commandContext -> or_3.id_class((gy_3)commandContext.getSource(), RZ.id_class((CommandContext<gy_3>)commandContext, "target"), Ym_1.id_protected((CommandContext<gy_3>)commandContext, "attribute"), YT.id_class((CommandContext<gy_3>)commandContext, "uuid"), StringArgumentType.getString((CommandContext)commandContext, (String)"name"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"value"), id_3.MULTIPLY_BASE)))))))).then(gp_3.id_class("remove").then(gp_3.id_class("uuid", YT.id_class()).executes(commandContext -> or_3.id_class((gy_3)commandContext.getSource(), RZ.id_class((CommandContext<gy_3>)commandContext, "target"), Ym_1.id_protected((CommandContext<gy_3>)commandContext, "attribute"), YT.id_class((CommandContext<gy_3>)commandContext, "uuid")))))).then(gp_3.id_class("value").then(gp_3.id_class("get").then(((RequiredArgumentBuilder)gp_3.id_class("uuid", YT.id_class()).executes(commandContext -> or_3.id_class((gy_3)commandContext.getSource(), RZ.id_class((CommandContext<gy_3>)commandContext, "target"), Ym_1.id_protected((CommandContext<gy_3>)commandContext, "attribute"), YT.id_class((CommandContext<gy_3>)commandContext, "uuid"), 1.0))).then(gp_3.id_class("scale", DoubleArgumentType.doubleArg()).executes(commandContext -> or_3.id_class((gy_3)commandContext.getSource(), RZ.id_class((CommandContext<gy_3>)commandContext, "target"), Ym_1.id_protected((CommandContext<gy_3>)commandContext, "attribute"), YT.id_class((CommandContext<gy_3>)commandContext, "uuid"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale")))))))))));
    }

    private static int id_class(gy_3 gy_32, an_3 an_32, iJ_2 iJ_22, double d) throws CommandSyntaxException {
        iB_2 iB_22 = or_3.id_break(an_32, iJ_22);
        double d2 = iB_22.id_class(iJ_22);
        gy_32.id_class(new rgn_3("commands.attribute.value.get.success", new rgn_3(iJ_22.id_byte()), an_32.g(), d2), false);
        return (int)(d2 * d);
    }

    private static int id_class(gy_3 gy_32, an_3 an_32, iJ_2 iJ_22, UUID uUID, double d) throws CommandSyntaxException {
        iB_2 iB_22 = or_3.id_break(an_32, iJ_22);
        ik_3 ik_32 = iB_22.BT();
        if (!ik_32.id_class(iJ_22, uUID)) {
            throw id_protected.create((Object)an_32.g(), (Object)new rgn_3(iJ_22.id_byte()), (Object)uUID);
        }
        double d2 = ik_32.id_break(iJ_22, uUID);
        gy_32.id_class(new rgn_3("commands.attribute.modifier.value.get.success", uUID, new rgn_3(iJ_22.id_byte()), an_32.g(), d2), false);
        return (int)(d2 * d);
    }

    private static int id_class(gy_3 gy_32, an_3 an_32, iJ_2 iJ_22, UUID uUID) throws CommandSyntaxException {
        ic_3 ic_32 = or_3.id_class(an_32, iJ_22);
        if (ic_32.id_byte(uUID)) {
            gy_32.id_class(new rgn_3("commands.attribute.modifier.remove.success", uUID, new rgn_3(iJ_22.id_byte()), an_32.g()), false);
            return 1;
        }
        throw id_protected.create((Object)an_32.g(), (Object)new rgn_3(iJ_22.id_byte()), (Object)uUID);
    }

    private static int id_class(gy_3 gy_32, an_3 an_32, iJ_2 iJ_22, UUID uUID, String string, double d, id_3 id_32) throws CommandSyntaxException {
        ix_3 ix_32;
        ic_3 ic_32 = or_3.id_class(an_32, iJ_22);
        if (ic_32.id_class(ix_32 = new ix_3(uUID, string, d, id_32))) {
            throw id_throws.create((Object)an_32.g(), (Object)new rgn_3(iJ_22.id_byte()), (Object)uUID);
        }
        ic_32.id_byte(ix_32);
        gy_32.id_class(new rgn_3("commands.attribute.modifier.add.success", uUID, new rgn_3(iJ_22.id_byte()), an_32.g()), false);
        return 1;
    }

    private static iB_2 id_class(an_3 an_32) throws CommandSyntaxException {
        if (!(an_32 instanceof iB_2)) {
            throw id_break.create((Object)an_32.g());
        }
        return (iB_2)an_32;
    }

    private static iB_2 id_break(an_3 an_32, iJ_2 iJ_22) throws CommandSyntaxException {
        iB_2 iB_22 = or_3.id_class(an_32);
        if (!iB_22.BT().id_break(iJ_22)) {
            throw id_byte.create((Object)an_32.g(), (Object)new rgn_3(iJ_22.id_byte()));
        }
        return iB_22;
    }

    private static int id_break(gy_3 gy_32, an_3 an_32, iJ_2 iJ_22, double d) throws CommandSyntaxException {
        iB_2 iB_22 = or_3.id_break(an_32, iJ_22);
        double d2 = iB_22.id_break(iJ_22);
        gy_32.id_class(new rgn_3("commands.attribute.base_value.get.success", new rgn_3(iJ_22.id_byte()), an_32.g(), d2), false);
        return (int)(d2 * d);
    }
}

