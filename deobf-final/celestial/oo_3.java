package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class oo_3 {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.particle.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("particle").requires(var0x -> var0x.class_(2)))
            .then(
               ((RequiredArgumentBuilder)gp_3.class_("name", Yc_1.class_())
                     .executes(
                        var0x -> class_(
                              (gy_3)var0x.getSource(),
                              Yc_1.class_(var0x, "name"),
                              ((gy_3)var0x.getSource()).volatile_(),
                              rjU_2.class_,
                              0.0F,
                              0,
                              false,
                              ((gy_3)var0x.getSource()).super_().x().super_()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)gp_3.class_("pos", Yw_1.class_())
                           .executes(
                              var0x -> class_(
                                    (gy_3)var0x.getSource(),
                                    Yc_1.class_(var0x, "name"),
                                    Yw_1.class_(var0x, "pos"),
                                    rjU_2.class_,
                                    0.0F,
                                    0,
                                    false,
                                    ((gy_3)var0x.getSource()).super_().x().super_()
                                 )
                           ))
                        .then(
                           gp_3.class_("delta", Yw_1.class_(false))
                              .then(
                                 gp_3.class_("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   var0x -> class_(
                                                         (gy_3)var0x.getSource(),
                                                         Yc_1.class_(var0x, "name"),
                                                         Yw_1.class_(var0x, "pos"),
                                                         Yw_1.class_(var0x, "delta"),
                                                         FloatArgumentType.getFloat(var0x, "speed"),
                                                         IntegerArgumentType.getInteger(var0x, "count"),
                                                         false,
                                                         ((gy_3)var0x.getSource()).super_().x().super_()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)gp_3.class_("force")
                                                      .executes(
                                                         var0x -> class_(
                                                               (gy_3)var0x.getSource(),
                                                               Yc_1.class_(var0x, "name"),
                                                               Yw_1.class_(var0x, "pos"),
                                                               Yw_1.class_(var0x, "delta"),
                                                               FloatArgumentType.getFloat(var0x, "speed"),
                                                               IntegerArgumentType.getInteger(var0x, "count"),
                                                               true,
                                                               ((gy_3)var0x.getSource()).super_().x().super_()
                                                            )
                                                      ))
                                                   .then(
                                                      gp_3.class_("viewers", RZ.protected_())
                                                         .executes(
                                                            var0x -> class_(
                                                                  (gy_3)var0x.getSource(),
                                                                  Yc_1.class_(var0x, "name"),
                                                                  Yw_1.class_(var0x, "pos"),
                                                                  Yw_1.class_(var0x, "delta"),
                                                                  FloatArgumentType.getFloat(var0x, "speed"),
                                                                  IntegerArgumentType.getInteger(var0x, "count"),
                                                                  true,
                                                                  RZ.case_(var0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)gp_3.class_("normal")
                                                   .executes(
                                                      var0x -> class_(
                                                            (gy_3)var0x.getSource(),
                                                            Yc_1.class_(var0x, "name"),
                                                            Yw_1.class_(var0x, "pos"),
                                                            Yw_1.class_(var0x, "delta"),
                                                            FloatArgumentType.getFloat(var0x, "speed"),
                                                            IntegerArgumentType.getInteger(var0x, "count"),
                                                            false,
                                                            ((gy_3)var0x.getSource()).super_().x().super_()
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.class_("viewers", RZ.protected_())
                                                      .executes(
                                                         var0x -> class_(
                                                               (gy_3)var0x.getSource(),
                                                               Yc_1.class_(var0x, "name"),
                                                               Yw_1.class_(var0x, "pos"),
                                                               Yw_1.class_(var0x, "delta"),
                                                               FloatArgumentType.getFloat(var0x, "speed"),
                                                               IntegerArgumentType.getInteger(var0x, "count"),
                                                               false,
                                                               RZ.case_(var0x, "viewers")
                                                            )
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

   private static int class_(gy_3 var0, rLx_1 var1, rjU_2 var2, rjU_2 var3, float var4, int var5, boolean var6, Collection<rhN_2> var7) throws CommandSyntaxException {
      int var8 = 0;

      for (rhN_2 var10 : var7) {
         if (var0.final_().class_(var10, var1, var6, var2.break_, var2.byte_, var2.protected_, var5, var3.break_, var3.byte_, var3.protected_, (double)var4)) {
            var8++;
         }
      }

      if (var8 == 0) {
         throw class_.create();
      } else {
         var0.class_(new rgn_3("commands.particle.success", rVL.switch_.break_(var1.protected_()).toString()), true);
         return var8;
      }
   }
}
