package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class om_3 {
   private static final Dynamic2CommandExceptionType class_ = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("commands.fill.toobig", var0, var1));
   static final Rd_1 break_ = new Rd_1(xu_3.class_.continue_(), Collections.emptySet(), (rcd_3)null);
   private static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("commands.fill.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("fill").requires(var0x -> var0x.class_(2)))
            .then(
               gp_3.class_("from", RM.class_())
                  .then(
                     gp_3.class_("to", RM.class_())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_(
                                                "block", Rx_1.class_()
                                             )
                                             .executes(
                                                var0x -> class_(
                                                      (gy_3)var0x.getSource(),
                                                      new rfi_3(RM.class_(var0x, "from"), RM.class_(var0x, "to")),
                                                      Rx_1.class_(var0x, "block"),
                                                      oZ_2.REPLACE,
                                                      (Predicate<ryw_3>)null
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)gp_3.class_("replace")
                                                   .executes(
                                                      var0x -> class_(
                                                            (gy_3)var0x.getSource(),
                                                            new rfi_3(RM.class_(var0x, "from"), RM.class_(var0x, "to")),
                                                            Rx_1.class_(var0x, "block"),
                                                            oZ_2.REPLACE,
                                                            (Predicate<ryw_3>)null
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.class_("filter", RO.class_())
                                                      .executes(
                                                         var0x -> class_(
                                                               (gy_3)var0x.getSource(),
                                                               new rfi_3(RM.class_(var0x, "from"), RM.class_(var0x, "to")),
                                                               Rx_1.class_(var0x, "block"),
                                                               oZ_2.REPLACE,
                                                               RO.class_(var0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          gp_3.class_("keep")
                                             .executes(
                                                var0x -> class_(
                                                      (gy_3)var0x.getSource(),
                                                      new rfi_3(RM.class_(var0x, "from"), RM.class_(var0x, "to")),
                                                      Rx_1.class_(var0x, "block"),
                                                      oZ_2.REPLACE,
                                                      var0xx -> var0xx.byte_().finally_(var0xx.protected_())
                                                   )
                                             )
                                       ))
                                    .then(
                                       gp_3.class_("outline")
                                          .executes(
                                             var0x -> class_(
                                                   (gy_3)var0x.getSource(),
                                                   new rfi_3(RM.class_(var0x, "from"), RM.class_(var0x, "to")),
                                                   Rx_1.class_(var0x, "block"),
                                                   oZ_2.OUTLINE,
                                                   (Predicate<ryw_3>)null
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.class_("hollow")
                                       .executes(
                                          var0x -> class_(
                                                (gy_3)var0x.getSource(),
                                                new rfi_3(RM.class_(var0x, "from"), RM.class_(var0x, "to")),
                                                Rx_1.class_(var0x, "block"),
                                                oZ_2.HOLLOW,
                                                (Predicate<ryw_3>)null
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.class_("destroy")
                                    .executes(
                                       var0x -> class_(
                                             (gy_3)var0x.getSource(),
                                             new rfi_3(RM.class_(var0x, "from"), RM.class_(var0x, "to")),
                                             Rx_1.class_(var0x, "block"),
                                             oZ_2.DESTROY,
                                             (Predicate<ryw_3>)null
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int class_(gy_3 var0, rfi_3 var1, Rd_1 var2, oZ_2 var3, Predicate<ryw_3> var4) throws CommandSyntaxException {
      int var5 = var1.protected_() * var1.throws_() * var1.case_();
      if (var5 > 32768) {
         throw class_.create(32768, var5);
      } else {
         ArrayList var6 = Lists.newArrayList();
         rrEm_1 var7 = var0.final_();
         int var8 = 0;

         for (rfH_2 var10 : rfH_2.break_(var1.class_, var1.break_, var1.byte_, var1.protected_, var1.throws_, var1.case_)) {
            if (var4 == null || var4.test(new ryw_3(var7, var10, true))) {
               Rd_1 var11 = var3.filter.filter(var1, var10, var2, var7);
               if (var11 != null) {
                  ryO_2 var12 = var7.class_(var10);
                  rXc_1.class_(var12);
                  if (var11.class_(var7, var10, 2)) {
                     var6.add(var10.int_());
                     var8++;
                  }
               }
            }
         }

         for (rfH_2 var14 : var6) {
            xd_3 var15 = var7.byte_(var14).break_();
            var7.class_(var14, var15);
         }

         if (var8 == 0) {
            throw byte_.create();
         } else {
            var0.class_(new rgn_3("commands.fill.success", var8), true);
            return var8;
         }
      }
   }
}
