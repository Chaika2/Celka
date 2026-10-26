/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.RootCommandNode
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KA;
import celestial.KB;
import celestial.KC;
import celestial.KE;
import celestial.KF;
import celestial.KG;
import celestial.KJ;
import celestial.KL;
import celestial.KN;
import celestial.KO;
import celestial.KP;
import celestial.KQ;
import celestial.KS;
import celestial.KW;
import celestial.KX;
import celestial.KZ;
import celestial.Kc_1;
import celestial.Kh_1;
import celestial.Kk_1;
import celestial.Kn_1;
import celestial.Kr_1;
import celestial.Ks_1;
import celestial.Ku_1;
import celestial.Kv_1;
import celestial.Kx_1;
import celestial.Ky_1;
import celestial.Kz_1;
import celestial.RG;
import celestial.YD;
import celestial.Yl_1;
import celestial.gH_2;
import celestial.gR_2;
import celestial.gT_2;
import celestial.gq_3;
import celestial.gy_3;
import celestial.oA_2;
import celestial.oB_2;
import celestial.oC_2;
import celestial.oD_2;
import celestial.oE_2;
import celestial.oF_2;
import celestial.oG_2;
import celestial.oH_2;
import celestial.oJ_2;
import celestial.oK_2;
import celestial.oL_2;
import celestial.oO_2;
import celestial.oP_2;
import celestial.oR_2;
import celestial.oS_2;
import celestial.oT_2;
import celestial.oU_2;
import celestial.oV_2;
import celestial.oW_2;
import celestial.oX_2;
import celestial.oY_2;
import celestial.oa_3;
import celestial.oc_3;
import celestial.od_3;
import celestial.oe_3;
import celestial.og_3;
import celestial.oi_3;
import celestial.oj_3;
import celestial.ok_3;
import celestial.ol_3;
import celestial.om_3;
import celestial.oo_3;
import celestial.op_3;
import celestial.oq_3;
import celestial.or_3;
import celestial.os_3;
import celestial.ot_3;
import celestial.ov_3;
import celestial.ox_3;
import celestial.oy_3;
import celestial.oz_3;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgn_3;
import celestial.rgp_3;
import celestial.rgv_3;
import celestial.rgy_3;
import celestial.rhN_2;
import celestial.rlt_3;
import celestial.rqR_2;
import celestial.rqu_3;
import celestial.rvP_2;
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class gp_3 {
    private static final Logger id_class = LogManager.getLogger();
    private final CommandDispatcher<gy_3> id_break = new CommandDispatcher();

    public gp_3(gq_3 gq_32) {
        YD.id_class(this.id_break);
        or_3.id_class(this.id_break);
        oz_3.id_class(this.id_break);
        os_3.id_class(this.id_break);
        oE_2.id_class(this.id_break);
        oG_2.id_class(this.id_break);
        Ky_1.id_class(this.id_break);
        oO_2.id_class(this.id_break);
        oJ_2.id_class(this.id_break);
        ox_3.id_class(this.id_break);
        od_3.id_class(this.id_break);
        ok_3.id_class(this.id_break);
        oj_3.id_class(this.id_break);
        oW_2.id_class(this.id_break);
        oc_3.id_class(this.id_break);
        om_3.id_class(this.id_break);
        ov_3.id_class(this.id_break);
        oF_2.id_class(this.id_break);
        oL_2.id_class(this.id_break);
        oA_2.id_class(this.id_break);
        oC_2.id_class(this.id_break);
        ol_3.id_class(this.id_break);
        oH_2.id_class(this.id_break);
        oy_3.id_class(this.id_break);
        op_3.id_class(this.id_break);
        oT_2.id_class(this.id_break);
        oq_3.id_class(this.id_break);
        ot_3.id_class(this.id_break);
        oV_2.id_class(this.id_break);
        oo_3.id_class(this.id_break);
        oK_2.id_class(this.id_break);
        oe_3.id_class(this.id_break);
        oU_2.id_class(this.id_break);
        oa_3.id_class(this.id_break);
        KB.id_class(this.id_break);
        KS.id_class(this.id_break);
        Ks_1.id_class(this.id_break);
        KE.id_class(this.id_break, gq_32 != gq_3.INTEGRATED);
        KG.id_class(this.id_break);
        KX.id_class(this.id_break);
        Kh_1.id_class(this.id_break);
        KJ.id_class(this.id_break);
        Kx_1.id_class(this.id_break);
        KW.id_class(this.id_break);
        Kz_1.id_class(this.id_break);
        KQ.id_class(this.id_break);
        KN.id_class(this.id_break);
        Kc_1.id_class(this.id_break);
        Ku_1.id_class(this.id_break);
        KZ.id_class(this.id_break);
        Kv_1.id_class(this.id_break);
        KF.id_class(this.id_break);
        KL.id_class(this.id_break);
        KA.id_class(this.id_break);
        KC.id_class(this.id_break);
        if (rqu_3.id_byte) {
            rlt_3.id_class(this.id_break);
        }
        if (gq_32.field_237220_e_) {
            oB_2.id_class(this.id_break);
            oS_2.id_class(this.id_break);
            oP_2.id_class(this.id_break);
            oX_2.id_class(this.id_break);
            og_3.id_class(this.id_break);
            oR_2.id_class(this.id_break);
            oY_2.id_class(this.id_break);
            oi_3.id_class(this.id_break);
            Kr_1.id_class(this.id_break);
            KP.id_class(this.id_break);
            KO.id_class(this.id_break);
            Kk_1.id_class(this.id_break);
            Kn_1.id_class(this.id_break);
        }
        if (gq_32.field_237219_d_) {
            oD_2.id_class(this.id_break);
        }
        this.id_break.findAmbiguities((commandNode, commandNode2, commandNode3, collection) -> id_class.warn("Ambiguity between arguments {} and {} with inputs: {}", (Object)this.id_break.getPath(commandNode2), (Object)this.id_break.getPath(commandNode3), (Object)collection));
        this.id_break.setConsumer((commandContext, bl, n) -> ((gy_3)commandContext.getSource()).id_class((CommandContext<gy_3>)commandContext, bl, n));
    }

    public int id_class(gy_3 gy_32, String string) {
        StringReader stringReader = new StringReader(string);
        if (stringReader.canRead() && stringReader.peek() == '/') {
            stringReader.skip();
        }
        try {
            return this.id_break.execute(stringReader, (Object)gy_32);
        }
        catch (gH_2 gH_22) {
            gy_32.id_class(gH_22.id_class());
            return 0;
        }
        catch (CommandSyntaxException commandSyntaxException) {
            gy_32.id_class(rgv_3.id_class(commandSyntaxException.getRawMessage()));
            if (commandSyntaxException.getInput() != null && commandSyntaxException.getCursor() >= 0) {
                int n = Math.min(commandSyntaxException.getInput().length(), commandSyntaxException.getCursor());
                rVi_1 rVi_12 = new rgN_2("").id_class(rgF_2.GRAY).id_class(rgc_32 -> rgc_32.id_class(new rgl_3(rgH_2.SUGGEST_COMMAND, string)));
                if (n > 10) {
                    rVi_12.id_break("...");
                }
                rVi_12.id_break(commandSyntaxException.getInput().substring(Math.max(0, n - 10), n));
                if (n < commandSyntaxException.getInput().length()) {
                    rVi_1 rVi_13 = new rgN_2(commandSyntaxException.getInput().substring(n)).id_class(rgF_2.RED, rgF_2.UNDERLINE);
                    rVi_12.id_class(rVi_13);
                }
                rVi_12.id_class(new rgn_3("command.context.here").id_class(rgF_2.RED, rgF_2.ITALIC));
                gy_32.id_class(rVi_12);
            }
        }
        catch (Exception exception) {
            rgN_2 rgN_22 = new rgN_2(exception.getMessage() == null ? exception.getClass().getName() : exception.getMessage());
            if (id_class.isDebugEnabled()) {
                id_class.error("Command exception: {}", (Object)string, (Object)exception);
                StackTraceElement[] stackTraceElementArray = exception.getStackTrace();
                for (int i = 0; i < Math.min(stackTraceElementArray.length, 3); ++i) {
                    rgN_22.id_break("\n\n").id_break(stackTraceElementArray[i].getMethodName()).id_break("\n ").id_break(stackTraceElementArray[i].getFileName()).id_break(":").id_break(String.valueOf(stackTraceElementArray[i].getLineNumber()));
                }
            }
            gy_32.id_class(new rgn_3("command.failed").id_class(rgc_32 -> rgc_32.id_class(new rgy_3(rgp_3.id_class, rgN_22))));
            if (rqu_3.id_byte) {
                gy_32.id_class(new rgN_2(rqR_2.id_protected(exception)));
                id_class.error("'" + string + "' threw an exception", (Throwable)exception);
            }
            return 0;
        }
        return 0;
    }

    public static Predicate<String> id_class(gT_2 gT_22) {
        return string -> {
            try {
                gT_22.parse(new StringReader(string));
                return true;
            }
            catch (CommandSyntaxException commandSyntaxException) {
                return false;
            }
        };
    }

    public void id_class(rhN_2 rhN_22) {
        HashMap hashMap = Maps.newHashMap();
        RootCommandNode rootCommandNode = new RootCommandNode();
        hashMap.put(this.id_break.getRoot(), rootCommandNode);
        this.id_class((CommandNode<gy_3>)this.id_break.getRoot(), (CommandNode<gR_2>)rootCommandNode, rhN_22.PL(), hashMap);
        rhN_22.id_class.id_class(new rvP_2((RootCommandNode<gR_2>)rootCommandNode));
    }

    public static LiteralArgumentBuilder<gy_3> id_class(String string) {
        return LiteralArgumentBuilder.literal((String)string);
    }

    private void id_class(CommandNode<gy_3> commandNode, CommandNode<gR_2> commandNode2, gy_3 gy_32, Map<CommandNode<gy_3>, CommandNode<gR_2>> map) {
        for (CommandNode commandNode3 : commandNode.getChildren()) {
            RequiredArgumentBuilder requiredArgumentBuilder;
            if (!commandNode3.canUse((Object)gy_32)) continue;
            ArgumentBuilder argumentBuilder = commandNode3.createBuilder();
            argumentBuilder.requires(gR_22 -> true);
            if (argumentBuilder.getCommand() != null) {
                argumentBuilder.executes(commandContext -> 0);
            }
            if (argumentBuilder instanceof RequiredArgumentBuilder && (requiredArgumentBuilder = (RequiredArgumentBuilder)argumentBuilder).getSuggestionsProvider() != null) {
                requiredArgumentBuilder.suggests(Yl_1.id_break((SuggestionProvider<gR_2>)requiredArgumentBuilder.getSuggestionsProvider()));
            }
            if (argumentBuilder.getRedirect() != null) {
                argumentBuilder.redirect(map.get(argumentBuilder.getRedirect()));
            }
            requiredArgumentBuilder = argumentBuilder.build();
            map.put((CommandNode<gy_3>)commandNode3, (CommandNode<gR_2>)requiredArgumentBuilder);
            commandNode2.addChild((CommandNode)requiredArgumentBuilder);
            if (commandNode3.getChildren().isEmpty()) continue;
            this.id_class((CommandNode<gy_3>)commandNode3, (CommandNode<gR_2>)requiredArgumentBuilder, gy_32, map);
        }
    }

    public static <T> RequiredArgumentBuilder<gy_3, T> id_class(String string, ArgumentType<T> argumentType) {
        return RequiredArgumentBuilder.argument((String)string, argumentType);
    }

    public static <S> CommandSyntaxException id_class(ParseResults<S> parseResults) {
        if (!parseResults.getReader().canRead()) {
            return null;
        }
        if (parseResults.getExceptions().size() == 1) {
            return (CommandSyntaxException)((Object)parseResults.getExceptions().values().iterator().next());
        }
        return parseResults.getContext().getRange().isEmpty() ? CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(parseResults.getReader()) : CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext(parseResults.getReader());
    }

    public CommandDispatcher<gy_3> id_class() {
        return this.id_break;
    }

    public static void id_break() {
        RootCommandNode rootCommandNode = new gp_3(gq_3.ALL).id_class().getRoot();
        Set<ArgumentType<?>> set = RG.id_class(rootCommandNode);
        Set set2 = set.stream().filter(argumentType -> !RG.id_class(argumentType)).collect(Collectors.toSet());
        if (!set2.isEmpty()) {
            id_class.warn("Missing type registration for following arguments:\n {}", (Object)set2.stream().map(argumentType -> "\t" + argumentType).collect(Collectors.joining(",\n")));
            throw new IllegalStateException("Unregistered argument types");
        }
    }
}

