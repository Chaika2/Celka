package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class oC_2 {
   private static int id_class(gy_3 var0, RY var1, Collection<rhN_2> var2, int var3) throws CommandSyntaxException {
      for (rhN_2 var5 : var2) {
         int var6 = var3;

         while (var6 > 0) {
            int var7 = Math.min(var1.id_class().id_implements(), var6);
            var6 -= var7;
            rdn_3 var8 = var1.id_class(var7, false);
            boolean var9 = ((rhz_3)var5.id_implements[1]).id_throws(var8);
            if (var9 && var8.id_class()) {
               var8.id_throws(1);
               rsE_2 var11 = var5.id_class(var8, false);
               if (var11 != null) {
                  var11.id_new();
               }

               ((rYB)var5.id_throws[7])
                  .id_class(
                     (rhd_3)null,
                     var5.rx(),
                     var5.re(),
                     var5.BO(),
                     rqn_3.ER,
                     rqL_2.PLAYERS,
                     0.2F,
                     ((var5.Sa().nextFloat() - var5.Sa().nextFloat()) * 0.7F + 1.0F) * 2.0F
                  );
               ((rJT)var5.id_implements[3]).id_native();
            } else {
               rsE_2 var10 = var5.id_class(var8, false);
               if (var10 != null) {
                  var10.id_implements();
                  var10.id_break(var5.ro());
               }
            }
         }
      }

      if (var2.size() == 1) {
         var0.id_class(new rgn_3("commands.give.success.single", var3, var1.id_class(var3, false).id_throw(), ((rhN_2)var2.iterator().next()).L_()), true);
      } else {
         var0.id_class(new rgn_3("commands.give.success.single", var3, var1.id_class(var3, false).id_throw(), var2.size()), true);
      }

      return var2.size();
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("give").requires(var0x -> var0x.id_class(2)))
            .then(
               gp_3.id_class("targets", RZ.id_protected())
                  .then(
                     ((RequiredArgumentBuilder)gp_3.id_class("item", RR.id_class())
                           .executes(var0x -> id_class((gy_3)var0x.getSource(), RR.id_class(var0x, "item"), RZ.id_case(var0x, "targets"), 1)))
                        .then(
                           gp_3.id_class("count", IntegerArgumentType.integer(1))
                              .executes(
                                 var0x -> id_class(
                                       (gy_3)var0x.getSource(),
                                       RR.id_class(var0x, "item"),
                                       RZ.id_case(var0x, "targets"),
                                       IntegerArgumentType.getInteger(var0x, "count")
                                    )
                              )
                        )
                  )
            )
      );
   }
}
