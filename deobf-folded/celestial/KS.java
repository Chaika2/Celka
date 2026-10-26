package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;

public class KS {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.schedule.cleared.failure", var0));
   private static final SuggestionProvider<gy_3> id_byte = (var0, var1) -> gR_2.id_break(
         ((gy_3)var0.getSource()).id_super().rB().id_instanceof().id_else().id_class(), var1
      );

   private static int id_class(gy_3 var0, Pair<rqO_2, Either<gt_3, rlb_3<gt_3>>> var1, int var2, boolean var3) throws CommandSyntaxException {
      if (var2 == 0) {
         throw id_class.create();
      } else {
         long var4 = var0.id_final().r() + (long)var2;
         rqO_2 var6 = (rqO_2)var1.getFirst();
         gi_3 var7 = var0.id_super().rB().id_instanceof().id_else();
         ((Either)var1.getSecond()).ifLeft(var7x -> {
            String var8 = var6.toString();
            if (var3) {
               var7.id_class(var8);
            }

            var7.id_class(var8, var4, new gD_2(var6));
            var0.id_class(new rgn_3("commands.schedule.created.function", var6, var2, var4), true);
         }).ifRight(var7x -> {
            String var8 = "#" + var6.toString();
            if (var3) {
               var7.id_class(var8);
            }

            var7.id_class(var8, var4, new ge_3(var6));
            var0.id_class(new rgn_3("commands.schedule.created.tag", var6, var2, var4), true);
         });
         return (int)Math.floorMod(var4, 2147483647L);
      }
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("schedule").requires(var0x -> var0x.id_class(2)))
               .then(
                  gp_3.id_class("function")
                     .then(
                        gp_3.id_class("function", RH.id_class())
                           .suggests(oF_2.id_class)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("time", Yq_1.id_class())
                                       .executes(
                                          var0x -> id_class(
                                                (gy_3)var0x.getSource(), RH.id_break(var0x, "function"), IntegerArgumentType.getInteger(var0x, "time"), true
                                             )
                                       ))
                                    .then(
                                       gp_3.id_class("append")
                                          .executes(
                                             var0x -> id_class(
                                                   (gy_3)var0x.getSource(),
                                                   RH.id_break(var0x, "function"),
                                                   IntegerArgumentType.getInteger(var0x, "time"),
                                                   false
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.id_class("replace")
                                       .executes(
                                          var0x -> id_class(
                                                (gy_3)var0x.getSource(), RH.id_break(var0x, "function"), IntegerArgumentType.getInteger(var0x, "time"), true
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               gp_3.id_class("clear")
                  .then(
                     gp_3.id_class("function", StringArgumentType.greedyString())
                        .suggests(id_byte)
                        .executes(var0x -> id_class((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "function")))
                  )
            )
      );
   }

   private static int id_class(gy_3 var0, String var1) throws CommandSyntaxException {
      int var2 = var0.id_super().rB().id_instanceof().id_else().id_class(var1);
      if (var2 == 0) {
         throw id_break.create(var1);
      } else {
         var0.id_class(new rgn_3("commands.schedule.cleared.success", var2, var1), true);
         return var2;
      }
   }
}
