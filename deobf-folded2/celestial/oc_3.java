package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class oc_3 {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.experience.set.points.invalid"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      LiteralCommandNode var1 = var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("experience")
                     .requires(var0x -> var0x.id_class(2)))
                  .then(
                     gp_3.id_class("add")
                        .then(
                           gp_3.id_class("targets", RZ.id_protected())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("amount", IntegerArgumentType.integer())
                                          .executes(
                                             var0x -> id_class(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.id_case(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "amount"),
                                                   ou_3.POINTS
                                                )
                                          ))
                                       .then(
                                          gp_3.id_class("points")
                                             .executes(
                                                var0x -> id_class(
                                                      (gy_3)var0x.getSource(),
                                                      RZ.id_case(var0x, "targets"),
                                                      IntegerArgumentType.getInteger(var0x, "amount"),
                                                      ou_3.POINTS
                                                   )
                                             )
                                       ))
                                    .then(
                                       gp_3.id_class("levels")
                                          .executes(
                                             var0x -> id_class(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.id_case(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "amount"),
                                                   ou_3.LEVELS
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  gp_3.id_class("set")
                     .then(
                        gp_3.id_class("targets", RZ.id_protected())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          var0x -> id_break(
                                                (gy_3)var0x.getSource(),
                                                RZ.id_case(var0x, "targets"),
                                                IntegerArgumentType.getInteger(var0x, "amount"),
                                                ou_3.POINTS
                                             )
                                       ))
                                    .then(
                                       gp_3.id_class("points")
                                          .executes(
                                             var0x -> id_break(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.id_case(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "amount"),
                                                   ou_3.POINTS
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.id_class("levels")
                                       .executes(
                                          var0x -> id_break(
                                                (gy_3)var0x.getSource(),
                                                RZ.id_case(var0x, "targets"),
                                                IntegerArgumentType.getInteger(var0x, "amount"),
                                                ou_3.LEVELS
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               gp_3.id_class("query")
                  .then(
                     ((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_byte())
                           .then(gp_3.id_class("points").executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_throws(var0x, "targets"), ou_3.POINTS))))
                        .then(gp_3.id_class("levels").executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_throws(var0x, "targets"), ou_3.LEVELS)))
                  )
            )
      );
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("xp").requires(var0x -> var0x.id_class(2))).redirect(var1));
   }

   private static int id_class(gy_3 var0, rhN_2 var1, ou_3 var2) {
      int var3 = var2.xpGetter.applyAsInt(var1);
      var0.id_class(new rgn_3("commands.experience.query." + var2.name, var1.L_(), var3), false);
      return var3;
   }

   private static int id_class(gy_3 var0, Collection<? extends rhN_2> var1, int var2, ou_3 var3) {
      for (rhN_2 var5 : var1) {
         var3.xpAdder.accept(var5, var2);
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.experience.add." + var3.name + ".success.single", var2, ((rhN_2)var1.iterator().next()).L_()), true);
      } else {
         var0.id_class(new rgn_3("commands.experience.add." + var3.name + ".success.multiple", var2, var1.size()), true);
      }

      return var1.size();
   }

   private static int id_break(gy_3 var0, Collection<? extends rhN_2> var1, int var2, ou_3 var3) throws CommandSyntaxException {
      int var4 = 0;

      for (rhN_2 var6 : var1) {
         if (var3.xpSetter.test(var6, var2)) {
            var4++;
         }
      }

      if (var4 == 0) {
         throw id_class.create();
      } else {
         if (var1.size() == 1) {
            var0.id_class(new rgn_3("commands.experience.set." + var3.name + ".success.single", var2, ((rhN_2)var1.iterator().next()).L_()), true);
         } else {
            var0.id_class(new rgn_3("commands.experience.set." + var3.name + ".success.multiple", var2, var1.size()), true);
         }

         return var1.size();
      }
   }
}
