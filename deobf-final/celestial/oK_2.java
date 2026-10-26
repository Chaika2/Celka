package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class oK_2 {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.playsound.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      RequiredArgumentBuilder var1 = gp_3.class_("sound", Ym_1.class_()).suggests(Yl_1.byte_);

      for (rqL_2 var5 : rqL_2.values()) {
         var1.then(class_(var5));
      }

      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("playsound").requires(var0x -> var0x.class_(2))).then(var1));
   }

   private static LiteralArgumentBuilder<gy_3> class_(rqL_2 var0) {
      return (LiteralArgumentBuilder<gy_3>)gp_3.class_(var0.class_())
         .then(
            ((RequiredArgumentBuilder)gp_3.class_("targets", RZ.protected_())
                  .executes(
                     var1 -> class_(
                           (gy_3)var1.getSource(),
                           RZ.case_(var1, "targets"),
                           Ym_1.throws_(var1, "sound"),
                           var0,
                           ((gy_3)var1.getSource()).volatile_(),
                           1.0F,
                           1.0F,
                           0.0F
                        )
                  ))
               .then(
                  ((RequiredArgumentBuilder)gp_3.class_("pos", Yw_1.class_())
                        .executes(
                           var1 -> class_(
                                 (gy_3)var1.getSource(),
                                 RZ.case_(var1, "targets"),
                                 Ym_1.throws_(var1, "sound"),
                                 var0,
                                 Yw_1.class_(var1, "pos"),
                                 1.0F,
                                 1.0F,
                                 0.0F
                              )
                        ))
                     .then(
                        ((RequiredArgumentBuilder)gp_3.class_("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 var1 -> class_(
                                       (gy_3)var1.getSource(),
                                       RZ.case_(var1, "targets"),
                                       Ym_1.throws_(var1, "sound"),
                                       var0,
                                       Yw_1.class_(var1, "pos"),
                                       (Float)var1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)gp_3.class_("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       var1 -> class_(
                                             (gy_3)var1.getSource(),
                                             RZ.case_(var1, "targets"),
                                             Ym_1.throws_(var1, "sound"),
                                             var0,
                                             Yw_1.class_(var1, "pos"),
                                             (Float)var1.getArgument("volume", Float.class),
                                             (Float)var1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    gp_3.class_("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          var1 -> class_(
                                                (gy_3)var1.getSource(),
                                                RZ.case_(var1, "targets"),
                                                Ym_1.throws_(var1, "sound"),
                                                var0,
                                                Yw_1.class_(var1, "pos"),
                                                (Float)var1.getArgument("volume", Float.class),
                                                (Float)var1.getArgument("pitch", Float.class),
                                                (Float)var1.getArgument("minVolume", Float.class)
                                             )
                                       )
                                 )
                           )
                     )
               )
         );
   }

   private static int class_(gy_3 var0, Collection<rhN_2> var1, rqO_2 var2, rqL_2 var3, rjU_2 var4, float var5, float var6, float var7) throws CommandSyntaxException {
      double var8 = Math.pow(var5 > 1.0F ? (double)(var5 * 16.0F) : 16.0, 2.0);
      int var10 = 0;

      for (rhN_2 var12 : var1) {
         double var15 = var4.break_ - var12.rx();
         double var17 = var4.byte_ - var12.re();
         double var19 = var4.protected_ - var12.BO();
         double var21 = var15 * var15 + var17 * var17 + var19 * var19;
         rjU_2 var13 = var4;
         float var14 = var5;
         if (var21 > var8) {
            if (var7 <= 0.0F) {
               continue;
            }

            double var23 = (double)rfU_2.class_(var21);
            var13 = new rjU_2(var12.rx() + var15 / var23 * 2.0, var12.re() + var17 / var23 * 2.0, var12.BO() + var19 / var23 * 2.0);
            var14 = var7;
         }

         var12.class_.class_(new rvI_2(var2, var3, var13, var14, var6));
         var10++;
      }

      if (var10 == 0) {
         throw class_.create();
      } else {
         if (var1.size() == 1) {
            var0.class_(new rgn_3("commands.playsound.success.single", var2, ((rhN_2)var1.iterator().next()).L_()), true);
         } else {
            var0.class_(new rgn_3("commands.playsound.success.multiple", var2, var1.size()), true);
         }

         return var10;
      }
   }
}
