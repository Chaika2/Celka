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
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.experience.set.points.invalid"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      LiteralCommandNode var1 = var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("experience")
                     .requires(var0x -> var0x.class_(2)))
                  .then(
                     gp_3.class_("add")
                        .then(
                           gp_3.class_("targets", RZ.protected_())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("amount", IntegerArgumentType.integer())
                                          .executes(
                                             var0x -> class_(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.case_(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "amount"),
                                                   ou_3.POINTS
                                                )
                                          ))
                                       .then(
                                          gp_3.class_("points")
                                             .executes(
                                                var0x -> class_(
                                                      (gy_3)var0x.getSource(),
                                                      RZ.case_(var0x, "targets"),
                                                      IntegerArgumentType.getInteger(var0x, "amount"),
                                                      ou_3.POINTS
                                                   )
                                             )
                                       ))
                                    .then(
                                       gp_3.class_("levels")
                                          .executes(
                                             var0x -> class_(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.case_(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "amount"),
                                                   ou_3.LEVELS
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  gp_3.class_("set")
                     .then(
                        gp_3.class_("targets", RZ.protected_())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          var0x -> break_(
                                                (gy_3)var0x.getSource(),
                                                RZ.case_(var0x, "targets"),
                                                IntegerArgumentType.getInteger(var0x, "amount"),
                                                ou_3.POINTS
                                             )
                                       ))
                                    .then(
                                       gp_3.class_("points")
                                          .executes(
                                             var0x -> break_(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.case_(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "amount"),
                                                   ou_3.POINTS
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.class_("levels")
                                       .executes(
                                          var0x -> break_(
                                                (gy_3)var0x.getSource(),
                                                RZ.case_(var0x, "targets"),
                                                IntegerArgumentType.getInteger(var0x, "amount"),
                                                ou_3.LEVELS
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               gp_3.class_("query")
                  .then(
                     ((RequiredArgumentBuilder)gp_3.class_("targets", RZ.byte_())
                           .then(gp_3.class_("points").executes(var0x -> class_((gy_3)var0x.getSource(), RZ.throws_(var0x, "targets"), ou_3.POINTS))))
                        .then(gp_3.class_("levels").executes(var0x -> class_((gy_3)var0x.getSource(), RZ.throws_(var0x, "targets"), ou_3.LEVELS)))
                  )
            )
      );
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("xp").requires(var0x -> var0x.class_(2))).redirect(var1));
   }

   private static int class_(gy_3 var0, rhN_2 var1, ou_3 var2) {
      int var3 = var2.xpGetter.applyAsInt(var1);
      var0.class_(new rgn_3("commands.experience.query." + var2.name, var1.L_(), var3), false);
      return var3;
   }

   private static int class_(gy_3 var0, Collection<? extends rhN_2> var1, int var2, ou_3 var3) {
      for (rhN_2 var5 : var1) {
         var3.xpAdder.accept(var5, var2);
      }

      if (var1.size() == 1) {
         var0.class_(new rgn_3("commands.experience.add." + var3.name + ".success.single", var2, ((rhN_2)var1.iterator().next()).L_()), true);
      } else {
         var0.class_(new rgn_3("commands.experience.add." + var3.name + ".success.multiple", var2, var1.size()), true);
      }

      return var1.size();
   }

   private static int break_(gy_3 var0, Collection<? extends rhN_2> var1, int var2, ou_3 var3) throws CommandSyntaxException {
      int var4 = 0;

      for (rhN_2 var6 : var1) {
         if (var3.xpSetter.test(var6, var2)) {
            var4++;
         }
      }

      if (var4 == 0) {
         throw class_.create();
      } else {
         if (var1.size() == 1) {
            var0.class_(new rgn_3("commands.experience.set." + var3.name + ".success.single", var2, ((rhN_2)var1.iterator().next()).L_()), true);
         } else {
            var0.class_(new rgn_3("commands.experience.set." + var3.name + ".success.multiple", var2, var1.size()), true);
         }

         return var1.size();
      }
   }
}
