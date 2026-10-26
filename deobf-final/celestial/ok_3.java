package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ok_3 {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.effect.clear.everything.failed"));
   private static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("commands.effect.clear.specific.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("effect").requires(var0x -> var0x.class_(2)))
               .then(
                  ((LiteralArgumentBuilder)gp_3.class_("clear")
                        .executes(var0x -> class_((gy_3)var0x.getSource(), ImmutableList.of(((gy_3)var0x.getSource()).int_()))))
                     .then(
                        ((RequiredArgumentBuilder)gp_3.class_("targets", RZ.break_())
                              .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.break_(var0x, "targets"))))
                           .then(
                              gp_3.class_("effect", Yu_1.class_())
                                 .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.break_(var0x, "targets"), Yu_1.class_(var0x, "effect")))
                           )
                     )
               ))
            .then(
               gp_3.class_("give")
                  .then(
                     gp_3.class_("targets", RZ.break_())
                        .then(
                           ((RequiredArgumentBuilder)gp_3.class_("effect", Yu_1.class_())
                                 .executes(
                                    var0x -> class_((gy_3)var0x.getSource(), RZ.break_(var0x, "targets"), Yu_1.class_(var0x, "effect"), (Integer)null, 0, true)
                                 ))
                              .then(
                                 ((RequiredArgumentBuilder)gp_3.class_("seconds", IntegerArgumentType.integer(1, 1000000))
                                       .executes(
                                          var0x -> class_(
                                                (gy_3)var0x.getSource(),
                                                RZ.break_(var0x, "targets"),
                                                Yu_1.class_(var0x, "effect"),
                                                IntegerArgumentType.getInteger(var0x, "seconds"),
                                                0,
                                                true
                                             )
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)gp_3.class_("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                var0x -> class_(
                                                      (gy_3)var0x.getSource(),
                                                      RZ.break_(var0x, "targets"),
                                                      Yu_1.class_(var0x, "effect"),
                                                      IntegerArgumentType.getInteger(var0x, "seconds"),
                                                      IntegerArgumentType.getInteger(var0x, "amplifier"),
                                                      true
                                                   )
                                             ))
                                          .then(
                                             gp_3.class_("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   var0x -> class_(
                                                         (gy_3)var0x.getSource(),
                                                         RZ.break_(var0x, "targets"),
                                                         Yu_1.class_(var0x, "effect"),
                                                         IntegerArgumentType.getInteger(var0x, "seconds"),
                                                         IntegerArgumentType.getInteger(var0x, "amplifier"),
                                                         !BoolArgumentType.getBool(var0x, "hideParticles")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int class_(gy_3 var0, Collection<? extends an_3> var1, rLR var2, Integer var3, int var4, boolean var5) throws CommandSyntaxException {
      int var6 = 0;
      int var7;
      if (var3 != null) {
         if (var2.class_()) {
            var7 = var3;
         } else {
            var7 = var3 * 20;
         }
      } else if (var2.class_()) {
         var7 = 1;
      } else {
         var7 = 600;
      }

      for (an_3 var9 : var1) {
         if (var9 instanceof iB_2) {
            rLY var10 = new rLY(var2, var7, var4, false, var5);
            if (((iB_2)var9).break_(var10)) {
               var6++;
            }
         }
      }

      if (var6 == 0) {
         throw class_.create();
      } else {
         if (var1.size() == 1) {
            var0.class_(new rgn_3("commands.effect.give.success.single", var2.protected_(), ((an_3)var1.iterator().next()).L_(), var7 / 20), true);
         } else {
            var0.class_(new rgn_3("commands.effect.give.success.multiple", var2.protected_(), var1.size(), var7 / 20), true);
         }

         return var6;
      }
   }

   private static int class_(gy_3 var0, Collection<? extends an_3> var1) throws CommandSyntaxException {
      int var2 = 0;

      for (an_3 var4 : var1) {
         if (var4 instanceof iB_2 && ((iB_2)var4).SY()) {
            var2++;
         }
      }

      if (var2 == 0) {
         throw break_.create();
      } else {
         if (var1.size() == 1) {
            var0.class_(new rgn_3("commands.effect.clear.everything.success.single", ((an_3)var1.iterator().next()).L_()), true);
         } else {
            var0.class_(new rgn_3("commands.effect.clear.everything.success.multiple", var1.size()), true);
         }

         return var2;
      }
   }

   private static int class_(gy_3 var0, Collection<? extends an_3> var1, rLR var2) throws CommandSyntaxException {
      int var3 = 0;

      for (an_3 var5 : var1) {
         if (var5 instanceof iB_2 && ((iB_2)var5).protected_(var2)) {
            var3++;
         }
      }

      if (var3 == 0) {
         throw byte_.create();
      } else {
         if (var1.size() == 1) {
            var0.class_(new rgn_3("commands.effect.clear.specific.success.single", var2.protected_(), ((an_3)var1.iterator().next()).L_()), true);
         } else {
            var0.class_(new rgn_3("commands.effect.clear.specific.success.multiple", var2.protected_(), var1.size()), true);
         }

         return var3;
      }
   }
}
