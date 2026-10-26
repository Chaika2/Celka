package celestial;

import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
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

   public gp_3(gq_3 var1) {
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
      KE.id_class(this.id_break, var1 != gq_3.INTEGRATED);
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

      if (var1.field_237220_e_) {
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

      if (var1.field_237219_d_) {
         oD_2.id_class(this.id_break);
      }

      this.id_break
         .findAmbiguities(
            (var1x, var2, var3, var4) -> id_class.warn(
                  "Ambiguity between arguments {} and {} with inputs: {}", this.id_break.getPath(var2), this.id_break.getPath(var3), var4
               )
         );
      this.id_break.setConsumer((var0, var1x, var2) -> ((gy_3)var0.getSource()).id_class(var0, var1x, var2));
   }

   public int id_class(gy_3 var1, String var2) {
      StringReader var3 = new StringReader(var2);
      if (var3.canRead() && var3.peek() == '/') {
         var3.skip();
      }

      try {
         return this.id_break.execute(var3, var1);
      } catch (gH_2 var8) {
         var1.id_class(var8.id_class());
         return 0;
      } catch (CommandSyntaxException var9) {
         var1.id_class(rgv_3.id_class(var9.getRawMessage()));
         if (var9.getInput() != null && var9.getCursor() >= 0) {
            int var11 = Math.min(var9.getInput().length(), var9.getCursor());
            rVi_1 var12 = new rgN_2("").id_class(rgF_2.GRAY).id_class(var1x -> var1x.id_class(new rgl_3(rgH_2.SUGGEST_COMMAND, var2)));
            if (var11 > 10) {
               var12.id_break("...");
            }

            var12.id_break(var9.getInput().substring(Math.max(0, var11 - 10), var11));
            if (var11 < var9.getInput().length()) {
               rVi_1 var13 = new rgN_2(var9.getInput().substring(var11)).id_class(new rgF_2[]{rgF_2.RED, rgF_2.UNDERLINE});
               var12.id_class(var13);
            }

            var12.id_class(new rgn_3("command.context.here").id_class(new rgF_2[]{rgF_2.RED, rgF_2.ITALIC}));
            var1.id_class(var12);
         }

         return 0;
      } catch (Exception var10) {
         rgN_2 var5 = new rgN_2(var10.getMessage() == null ? var10.getClass().getName() : var10.getMessage());
         if (id_class.isDebugEnabled()) {
            id_class.error("Command exception: {}", var2, var10);
            StackTraceElement[] var6 = var10.getStackTrace();

            for (int var7 = 0; var7 < Math.min(var6.length, 3); var7++) {
               var5.id_break("\n\n")
                  .id_break(var6[var7].getMethodName())
                  .id_break("\n ")
                  .id_break(var6[var7].getFileName())
                  .id_break(":")
                  .id_break(String.valueOf(var6[var7].getLineNumber()));
            }
         }

         var1.id_class(new rgn_3("command.failed").id_class(var1x -> var1x.id_class(new rgy_3(rgp_3.id_class, var5))));
         if (rqu_3.id_byte) {
            var1.id_class(new rgN_2(rqR_2.id_protected(var10)));
            id_class.error("'" + var2 + "' threw an exception", var10);
         }

         return 0;
      }
   }

   public static Predicate<String> id_class(gT_2 var0) {
      return var1 -> {
         try {
            var0.parse(new StringReader(var1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public void id_class(rhN_2 var1) {
      HashMap var2 = Maps.newHashMap();
      RootCommandNode var3 = new RootCommandNode();
      var2.put(this.id_break.getRoot(), var3);
      this.id_class(this.id_break.getRoot(), var3, var1.PL(), var2);
      var1.id_class.id_class(new rvP_2(var3));
   }

   public static LiteralArgumentBuilder<gy_3> id_class(String var0) {
      return LiteralArgumentBuilder.literal(var0);
   }

   private void id_class(CommandNode<gy_3> var1, CommandNode<gR_2> var2, gy_3 var3, Map<CommandNode<gy_3>, CommandNode<gR_2>> var4) {
      for (CommandNode var6 : var1.getChildren()) {
         if (var6.canUse(var3)) {
            ArgumentBuilder var7 = var6.createBuilder();
            var7.requires(var0 -> true);
            if (var7.getCommand() != null) {
               var7.executes(var0 -> 0);
            }

            if (var7 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder var8 = (RequiredArgumentBuilder)var7;
               if (var8.getSuggestionsProvider() != null) {
                  var8.suggests(Yl_1.id_break(var8.getSuggestionsProvider()));
               }
            }

            if (var7.getRedirect() != null) {
               var7.redirect((CommandNode)var4.get(var7.getRedirect()));
            }

            CommandNode var9 = var7.build();
            var4.put(var6, var9);
            var2.addChild(var9);
            if (!var6.getChildren().isEmpty()) {
               this.id_class(var6, var9, var3, var4);
            }
         }
      }
   }

   public static <T> RequiredArgumentBuilder<gy_3, T> id_class(String var0, ArgumentType<T> var1) {
      return RequiredArgumentBuilder.argument(var0, var1);
   }

   public static <S> CommandSyntaxException id_class(ParseResults<S> var0) {
      if (!var0.getReader().canRead()) {
         return null;
      } else if (var0.getExceptions().size() == 1) {
         return (CommandSyntaxException)var0.getExceptions().values().iterator().next();
      } else {
         return var0.getContext().getRange().isEmpty()
            ? CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(var0.getReader())
            : CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext(var0.getReader());
      }
   }

   public CommandDispatcher<gy_3> id_class() {
      return this.id_break;
   }

   public static void id_break() {
      RootCommandNode var0 = new gp_3(gq_3.ALL).id_class().getRoot();
      Set var1 = RG.id_class(var0);
      Set var2 = var1.stream().filter(var0x -> !RG.id_class((ArgumentType<?>)var0x)).collect(Collectors.toSet());
      if (!var2.isEmpty()) {
         id_class.warn("Missing type registration for following arguments:\n {}", var2.stream().map(var0x -> "\t" + var0x).collect(Collectors.joining(",\n")));
         throw new IllegalStateException("Unregistered argument types");
      }
   }
}
