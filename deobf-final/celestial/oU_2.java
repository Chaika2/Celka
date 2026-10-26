package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class oU_2 {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.recipe.take.failed"));

   private static int class_(gy_3 var0, Collection<rhN_2> var1, Collection<rkw_3<?>> var2) throws CommandSyntaxException {
      int var3 = 0;

      for (rhN_2 var5 : var1) {
         var3 += var5.break_(var2);
      }

      if (var3 == 0) {
         throw class_.create();
      } else {
         if (var1.size() == 1) {
            var0.class_(new rgn_3("commands.recipe.give.success.single", var2.size(), ((rhN_2)var1.iterator().next()).L_()), true);
         } else {
            var0.class_(new rgn_3("commands.recipe.give.success.multiple", var2.size(), var1.size()), true);
         }

         return var3;
      }
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("recipe").requires(var0x -> var0x.class_(2)))
               .then(
                  gp_3.class_("give")
                     .then(
                        ((RequiredArgumentBuilder)gp_3.class_("targets", RZ.protected_())
                              .then(
                                 gp_3.class_("recipe", Ym_1.class_())
                                    .suggests(Yl_1.break_)
                                    .executes(
                                       var0x -> class_((gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), Collections.singleton(Ym_1.break_(var0x, "recipe")))
                                    )
                              ))
                           .then(
                              gp_3.class_("*")
                                 .executes(
                                    var0x -> class_((gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), ((gy_3)var0x.getSource()).super_().V().break_())
                                 )
                           )
                     )
               ))
            .then(
               gp_3.class_("take")
                  .then(
                     ((RequiredArgumentBuilder)gp_3.class_("targets", RZ.protected_())
                           .then(
                              gp_3.class_("recipe", Ym_1.class_())
                                 .suggests(Yl_1.break_)
                                 .executes(
                                    var0x -> break_((gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), Collections.singleton(Ym_1.break_(var0x, "recipe")))
                                 )
                           ))
                        .then(
                           gp_3.class_("*")
                              .executes(var0x -> break_((gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), ((gy_3)var0x.getSource()).super_().V().break_()))
                        )
                  )
            )
      );
   }

   private static int break_(gy_3 var0, Collection<rhN_2> var1, Collection<rkw_3<?>> var2) throws CommandSyntaxException {
      int var3 = 0;

      for (rhN_2 var5 : var1) {
         var3 += var5.byte_(var2);
      }

      if (var3 == 0) {
         throw break_.create();
      } else {
         if (var1.size() == 1) {
            var0.class_(new rgn_3("commands.recipe.take.success.single", var2.size(), ((rhN_2)var1.iterator().next()).L_()), true);
         } else {
            var0.class_(new rgn_3("commands.recipe.take.success.multiple", var2.size(), var1.size()), true);
         }

         return var3;
      }
   }
}
