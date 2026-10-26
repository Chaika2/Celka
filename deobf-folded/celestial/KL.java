package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class KL {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("commands.trigger.failed.invalid"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)gp_3.id_class("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("objective", Yk_1.id_class())
                        .suggests((var0x, var1) -> id_class((gy_3)var0x.getSource(), var1))
                        .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(((gy_3)var0x.getSource()).id_new(), Yk_1.id_class(var0x, "objective")))))
                     .then(
                        gp_3.id_class("add")
                           .then(
                              gp_3.id_class("value", IntegerArgumentType.integer())
                                 .executes(
                                    var0x -> id_class(
                                          (gy_3)var0x.getSource(),
                                          id_class(((gy_3)var0x.getSource()).id_new(), Yk_1.id_class(var0x, "objective")),
                                          IntegerArgumentType.getInteger(var0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     gp_3.id_class("set")
                        .then(
                           gp_3.id_class("value", IntegerArgumentType.integer())
                              .executes(
                                 var0x -> id_break(
                                       (gy_3)var0x.getSource(),
                                       id_class(((gy_3)var0x.getSource()).id_new(), Yk_1.id_class(var0x, "objective")),
                                       IntegerArgumentType.getInteger(var0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static rAa_1 id_class(rhN_2 var0, rnP_2 var1) throws CommandSyntaxException {
      if (var1.id_byte() != rAi_1.id_byte) {
         throw id_break.create();
      } else {
         rns_3 var2 = var0.st();
         String var3 = var0.i();
         if (!var2.id_class(var3, var1)) {
            throw id_class.create();
         } else {
            rAa_1 var4 = var2.id_break(var3, var1);
            if (var4.id_catch()) {
               throw id_class.create();
            } else {
               var4.id_class(true);
               return var4;
            }
         }
      }
   }

   private static int id_class(gy_3 var0, rAa_1 var1, int var2) {
      var1.id_class(var2);
      var0.id_class(new rgn_3("commands.trigger.add.success", var1.id_protected().id_throws(), var2), true);
      return var1.id_break();
   }

   private static int id_class(gy_3 var0, rAa_1 var1) {
      var1.id_class(1);
      var0.id_class(new rgn_3("commands.trigger.simple.success", var1.id_protected().id_throws()), true);
      return var1.id_break();
   }

   public static CompletableFuture<Suggestions> id_class(gy_3 var0, SuggestionsBuilder var1) {
      an_3 var2 = var0.id_package();
      ArrayList var3 = Lists.newArrayList();
      if (var2 != null) {
         rnG_2 var4 = var0.id_super().R();
         String var5 = var2.i();

         for (rnP_2 var7 : var4.id_class()) {
            if (var7.id_byte() == rAi_1.id_byte && var4.id_class(var5, var7)) {
               rAa_1 var8 = var4.id_break(var5, var7);
               if (!var8.id_catch()) {
                  var3.add(var7.id_break());
               }
            }
         }
      }

      return gR_2.id_break(var3, var1);
   }

   private static int id_break(gy_3 var0, rAa_1 var1, int var2) {
      var1.id_break(var2);
      var0.id_class(new rgn_3("commands.trigger.set.success", var1.id_protected().id_throws(), var2), true);
      return var2;
   }
}
