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
   private static final Dynamic2CommandExceptionType id_class = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("commands.fill.toobig", var0, var1));
   static final Rd_1 id_break = new Rd_1(xu_3.id_class.id_continue(), Collections.emptySet(), (rcd_3)null);
   private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType(new rgn_3("commands.fill.failed"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("fill").requires(var0x -> var0x.id_class(2)))
            .then(
               gp_3.id_class("from", RM.id_class())
                  .then(
                     gp_3.id_class("to", RM.id_class())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class(
                                                "block", Rx_1.id_class()
                                             )
                                             .executes(
                                                var0x -> id_class(
                                                      (gy_3)var0x.getSource(),
                                                      new rfi_3(RM.id_class(var0x, "from"), RM.id_class(var0x, "to")),
                                                      Rx_1.id_class(var0x, "block"),
                                                      oZ_2.REPLACE,
                                                      (Predicate<ryw_3>)null
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)gp_3.id_class("replace")
                                                   .executes(
                                                      var0x -> id_class(
                                                            (gy_3)var0x.getSource(),
                                                            new rfi_3(RM.id_class(var0x, "from"), RM.id_class(var0x, "to")),
                                                            Rx_1.id_class(var0x, "block"),
                                                            oZ_2.REPLACE,
                                                            (Predicate<ryw_3>)null
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.id_class("filter", RO.id_class())
                                                      .executes(
                                                         var0x -> id_class(
                                                               (gy_3)var0x.getSource(),
                                                               new rfi_3(RM.id_class(var0x, "from"), RM.id_class(var0x, "to")),
                                                               Rx_1.id_class(var0x, "block"),
                                                               oZ_2.REPLACE,
                                                               RO.id_class(var0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          gp_3.id_class("keep")
                                             .executes(
                                                var0x -> id_class(
                                                      (gy_3)var0x.getSource(),
                                                      new rfi_3(RM.id_class(var0x, "from"), RM.id_class(var0x, "to")),
                                                      Rx_1.id_class(var0x, "block"),
                                                      oZ_2.REPLACE,
                                                      var0xx -> var0xx.id_byte().id_finally(var0xx.id_protected())
                                                   )
                                             )
                                       ))
                                    .then(
                                       gp_3.id_class("outline")
                                          .executes(
                                             var0x -> id_class(
                                                   (gy_3)var0x.getSource(),
                                                   new rfi_3(RM.id_class(var0x, "from"), RM.id_class(var0x, "to")),
                                                   Rx_1.id_class(var0x, "block"),
                                                   oZ_2.OUTLINE,
                                                   (Predicate<ryw_3>)null
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.id_class("hollow")
                                       .executes(
                                          var0x -> id_class(
                                                (gy_3)var0x.getSource(),
                                                new rfi_3(RM.id_class(var0x, "from"), RM.id_class(var0x, "to")),
                                                Rx_1.id_class(var0x, "block"),
                                                oZ_2.HOLLOW,
                                                (Predicate<ryw_3>)null
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.id_class("destroy")
                                    .executes(
                                       var0x -> id_class(
                                             (gy_3)var0x.getSource(),
                                             new rfi_3(RM.id_class(var0x, "from"), RM.id_class(var0x, "to")),
                                             Rx_1.id_class(var0x, "block"),
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

   private static int id_class(gy_3 var0, rfi_3 var1, Rd_1 var2, oZ_2 var3, Predicate<ryw_3> var4) throws CommandSyntaxException {
      int var5 = var1.id_protected() * var1.id_throws() * var1.id_case();
      if (var5 > 32768) {
         throw id_class.create(32768, var5);
      } else {
         ArrayList var6 = Lists.newArrayList();
         rrEm_1 var7 = var0.id_final();
         int var8 = 0;

         for (rfH_2 var10 : rfH_2.id_break(var1.id_class, var1.id_break, var1.id_byte, var1.id_protected, var1.id_throws, var1.id_case)) {
            if (var4 == null || var4.test(new ryw_3(var7, var10, true))) {
               Rd_1 var11 = var3.filter.filter(var1, var10, var2, var7);
               if (var11 != null) {
                  ryO_2 var12 = var7.id_class(var10);
                  rXc_1.id_class(var12);
                  if (var11.id_class(var7, var10, 2)) {
                     var6.add(var10.id_int());
                     var8++;
                  }
               }
            }
         }

         for (rfH_2 var14 : var6) {
            xd_3 var15 = var7.id_byte(var14).id_break();
            var7.id_class(var14, var15);
         }

         if (var8 == 0) {
            throw id_byte.create();
         } else {
            var0.id_class(new rgn_3("commands.fill.success", var8), true);
            return var8;
         }
      }
   }
}
