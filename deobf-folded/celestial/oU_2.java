package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class oU_2 {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("commands.recipe.take.failed"));

   private static int id_class(gy_3 var0, Collection<rhN_2> var1, Collection<rkw_3<?>> var2) throws CommandSyntaxException {
      int var3 = 0;

      for (rhN_2 var5 : var1) {
         var3 += var5.id_break(var2);
      }

      if (var3 == 0) {
         throw id_class.create();
      } else {
         if (var1.size() == 1) {
            var0.id_class(new rgn_3("commands.recipe.give.success.single", var2.size(), ((rhN_2)var1.iterator().next()).L_()), true);
         } else {
            var0.id_class(new rgn_3("commands.recipe.give.success.multiple", var2.size(), var1.size()), true);
         }

         return var3;
      }
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("recipe").requires(var0x -> var0x.id_class(2)))
               .then(
                  gp_3.id_class("give")
                     .then(
                        ((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected())
                              .then(
                                 gp_3.id_class("recipe", Ym_1.id_class())
                                    .suggests(Yl_1.id_break)
                                    .executes(
                                       var0x -> id_class(
                                             (gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), Collections.singleton(Ym_1.id_break(var0x, "recipe"))
                                          )
                                    )
                              ))
                           .then(
                              gp_3.id_class("*")
                                 .executes(
                                    var0x -> id_class(
                                          (gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), ((gy_3)var0x.getSource()).id_super().V().id_break()
                                       )
                                 )
                           )
                     )
               ))
            .then(
               gp_3.id_class("take")
                  .then(
                     ((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected())
                           .then(
                              gp_3.id_class("recipe", Ym_1.id_class())
                                 .suggests(Yl_1.id_break)
                                 .executes(
                                    var0x -> id_break(
                                          (gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), Collections.singleton(Ym_1.id_break(var0x, "recipe"))
                                       )
                                 )
                           ))
                        .then(
                           gp_3.id_class("*")
                              .executes(
                                 var0x -> id_break((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), ((gy_3)var0x.getSource()).id_super().V().id_break())
                              )
                        )
                  )
            )
      );
   }

   private static int id_break(gy_3 var0, Collection<rhN_2> var1, Collection<rkw_3<?>> var2) throws CommandSyntaxException {
      int var3 = 0;

      for (rhN_2 var5 : var1) {
         var3 += var5.id_byte(var2);
      }

      if (var3 == 0) {
         throw id_break.create();
      } else {
         if (var1.size() == 1) {
            var0.id_class(new rgn_3("commands.recipe.take.success.single", var2.size(), ((rhN_2)var1.iterator().next()).L_()), true);
         } else {
            var0.id_class(new rgn_3("commands.recipe.take.success.multiple", var2.size(), var1.size()), true);
         }

         return var3;
      }
   }
}
