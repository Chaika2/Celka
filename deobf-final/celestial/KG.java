package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;

public class KG {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.setblock.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("setblock").requires(var0x -> var0x.class_(2)))
            .then(
               gp_3.class_("pos", RM.class_())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("block", Rx_1.class_())
                                 .executes(
                                    var0x -> class_(
                                          (gy_3)var0x.getSource(), RM.class_(var0x, "pos"), Rx_1.class_(var0x, "block"), KM.REPLACE, (Predicate<ryw_3>)null
                                       )
                                 ))
                              .then(
                                 gp_3.class_("destroy")
                                    .executes(
                                       var0x -> class_(
                                             (gy_3)var0x.getSource(), RM.class_(var0x, "pos"), Rx_1.class_(var0x, "block"), KM.DESTROY, (Predicate<ryw_3>)null
                                          )
                                    )
                              ))
                           .then(
                              gp_3.class_("keep")
                                 .executes(
                                    var0x -> class_(
                                          (gy_3)var0x.getSource(),
                                          RM.class_(var0x, "pos"),
                                          Rx_1.class_(var0x, "block"),
                                          KM.REPLACE,
                                          var0xx -> var0xx.byte_().finally_(var0xx.protected_())
                                       )
                                 )
                           ))
                        .then(
                           gp_3.class_("replace")
                              .executes(
                                 var0x -> class_(
                                       (gy_3)var0x.getSource(), RM.class_(var0x, "pos"), Rx_1.class_(var0x, "block"), KM.REPLACE, (Predicate<ryw_3>)null
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int class_(gy_3 var0, rfH_2 var1, Rd_1 var2, KM var3, Predicate<ryw_3> var4) throws CommandSyntaxException {
      rrEm_1 var5 = var0.final_();
      if (var4 != null && !var4.test(new ryw_3(var5, var1, true))) {
         throw class_.create();
      } else {
         boolean var6;
         if (var3 == KM.DESTROY) {
            var5.break_(var1, true);
            var6 = !var2.class_().catch_() || !var5.byte_(var1).catch_();
         } else {
            ryO_2 var7 = var5.class_(var1);
            rXc_1.class_(var7);
            var6 = true;
         }

         if (var6 && !var2.class_(var5, var1, 2)) {
            throw class_.create();
         } else {
            var5.class_(var1, var2.class_().break_());
            var0.class_(new rgn_3("commands.setblock.success", var1.b_(), var1.c_(), var1.d_()), true);
            return 1;
         }
      }
   }
}
