package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class oC_2 {
   private static int class_(gy_3 var0, RY var1, Collection<rhN_2> var2, int var3) throws CommandSyntaxException {
      for (rhN_2 var5 : var2) {
         int var6 = var3;

         while (var6 > 0) {
            int var7 = Math.min(var1.class_().implements_(), var6);
            var6 -= var7;
            rdn_3 var8 = var1.class_(var7, false);
            boolean var9 = ((rhz_3)var5.implements_[1]).throws_(var8);
            if (var9 && var8.class_()) {
               var8.throws_(1);
               rsE_2 var11 = var5.class_(var8, false);
               if (var11 != null) {
                  var11.new_();
               }

               ((rYB)var5.throws_[7])
                  .class_(
                     (rhd_3)null,
                     var5.rx(),
                     var5.re(),
                     var5.BO(),
                     rqn_3.ER,
                     rqL_2.PLAYERS,
                     0.2F,
                     ((var5.Sa().nextFloat() - var5.Sa().nextFloat()) * 0.7F + 1.0F) * 2.0F
                  );
               ((rJT)var5.implements_[3]).native_();
            } else {
               rsE_2 var10 = var5.class_(var8, false);
               if (var10 != null) {
                  var10.implements_();
                  var10.break_(var5.ro());
               }
            }
         }
      }

      if (var2.size() == 1) {
         var0.class_(new rgn_3("commands.give.success.single", var3, var1.class_(var3, false).throw_(), ((rhN_2)var2.iterator().next()).L_()), true);
      } else {
         var0.class_(new rgn_3("commands.give.success.single", var3, var1.class_(var3, false).throw_(), var2.size()), true);
      }

      return var2.size();
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("give").requires(var0x -> var0x.class_(2)))
            .then(
               gp_3.class_("targets", RZ.protected_())
                  .then(
                     ((RequiredArgumentBuilder)gp_3.class_("item", RR.class_())
                           .executes(var0x -> class_((gy_3)var0x.getSource(), RR.class_(var0x, "item"), RZ.case_(var0x, "targets"), 1)))
                        .then(
                           gp_3.class_("count", IntegerArgumentType.integer(1))
                              .executes(
                                 var0x -> class_(
                                       (gy_3)var0x.getSource(),
                                       RR.class_(var0x, "item"),
                                       RZ.case_(var0x, "targets"),
                                       IntegerArgumentType.getInteger(var0x, "count")
                                    )
                              )
                        )
                  )
            )
      );
   }
}
