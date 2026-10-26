package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;

public class KG {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.setblock.failed"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("setblock").requires(var0x -> var0x.id_class(2)))
            .then(
               gp_3.id_class("pos", RM.id_class())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("block", Rx_1.id_class())
                                 .executes(
                                    var0x -> id_class(
                                          (gy_3)var0x.getSource(), RM.id_class(var0x, "pos"), Rx_1.id_class(var0x, "block"), KM.REPLACE, (Predicate<ryw_3>)null
                                       )
                                 ))
                              .then(
                                 gp_3.id_class("destroy")
                                    .executes(
                                       var0x -> id_class(
                                             (gy_3)var0x.getSource(),
                                             RM.id_class(var0x, "pos"),
                                             Rx_1.id_class(var0x, "block"),
                                             KM.DESTROY,
                                             (Predicate<ryw_3>)null
                                          )
                                    )
                              ))
                           .then(
                              gp_3.id_class("keep")
                                 .executes(
                                    var0x -> id_class(
                                          (gy_3)var0x.getSource(),
                                          RM.id_class(var0x, "pos"),
                                          Rx_1.id_class(var0x, "block"),
                                          KM.REPLACE,
                                          var0xx -> var0xx.id_byte().id_finally(var0xx.id_protected())
                                       )
                                 )
                           ))
                        .then(
                           gp_3.id_class("replace")
                              .executes(
                                 var0x -> id_class(
                                       (gy_3)var0x.getSource(), RM.id_class(var0x, "pos"), Rx_1.id_class(var0x, "block"), KM.REPLACE, (Predicate<ryw_3>)null
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int id_class(gy_3 var0, rfH_2 var1, Rd_1 var2, KM var3, Predicate<ryw_3> var4) throws CommandSyntaxException {
      rrEm_1 var5 = var0.id_final();
      if (var4 != null && !var4.test(new ryw_3(var5, var1, true))) {
         throw id_class.create();
      } else {
         boolean var6;
         if (var3 == KM.DESTROY) {
            var5.id_break(var1, true);
            var6 = !var2.id_class().id_catch() || !var5.id_byte(var1).id_catch();
         } else {
            ryO_2 var7 = var5.id_class(var1);
            rXc_1.id_class(var7);
            var6 = true;
         }

         if (var6 && !var2.id_class(var5, var1, 2)) {
            throw id_class.create();
         } else {
            var5.id_class(var1, var2.id_class().id_break());
            var0.id_class(new rgn_3("commands.setblock.success", var1.b_(), var1.c_(), var1.d_()), true);
            return 1;
         }
      }
   }
}
