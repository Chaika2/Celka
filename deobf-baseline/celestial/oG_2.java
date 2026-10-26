package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class oG_2 {
   private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType id_byte = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("commands.clone.toobig", var0, var1));
   private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType(new rgn_3("commands.clone.failed"));
   public static final Predicate<ryw_3> id_class = var0 -> !var0.id_class().id_catch();

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("clone").requires(var0x -> var0x.id_class(2)))
            .then(
               gp_3.id_class("begin", RM.id_class())
                  .then(
                     gp_3.id_class("end", RM.id_class())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("destination", RM.id_class())
                                       .executes(
                                          var0x -> id_class(
                                                (gy_3)var0x.getSource(),
                                                RM.id_class(var0x, "begin"),
                                                RM.id_class(var0x, "end"),
                                                RM.id_class(var0x, "destination"),
                                                var0xx -> true,
                                                oM_2.NORMAL
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("replace")
                                                   .executes(
                                                      var0x -> id_class(
                                                            (gy_3)var0x.getSource(),
                                                            RM.id_class(var0x, "begin"),
                                                            RM.id_class(var0x, "end"),
                                                            RM.id_class(var0x, "destination"),
                                                            var0xx -> true,
                                                            oM_2.NORMAL
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.id_class("force")
                                                      .executes(
                                                         var0x -> id_class(
                                                               (gy_3)var0x.getSource(),
                                                               RM.id_class(var0x, "begin"),
                                                               RM.id_class(var0x, "end"),
                                                               RM.id_class(var0x, "destination"),
                                                               var0xx -> true,
                                                               oM_2.FORCE
                                                            )
                                                      )
                                                ))
                                             .then(
                                                gp_3.id_class("move")
                                                   .executes(
                                                      var0x -> id_class(
                                                            (gy_3)var0x.getSource(),
                                                            RM.id_class(var0x, "begin"),
                                                            RM.id_class(var0x, "end"),
                                                            RM.id_class(var0x, "destination"),
                                                            var0xx -> true,
                                                            oM_2.MOVE
                                                         )
                                                   )
                                             ))
                                          .then(
                                             gp_3.id_class("normal")
                                                .executes(
                                                   var0x -> id_class(
                                                         (gy_3)var0x.getSource(),
                                                         RM.id_class(var0x, "begin"),
                                                         RM.id_class(var0x, "end"),
                                                         RM.id_class(var0x, "destination"),
                                                         var0xx -> true,
                                                         oM_2.NORMAL
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("masked")
                                                .executes(
                                                   var0x -> id_class(
                                                         (gy_3)var0x.getSource(),
                                                         RM.id_class(var0x, "begin"),
                                                         RM.id_class(var0x, "end"),
                                                         RM.id_class(var0x, "destination"),
                                                         id_class,
                                                         oM_2.NORMAL
                                                      )
                                                ))
                                             .then(
                                                gp_3.id_class("force")
                                                   .executes(
                                                      var0x -> id_class(
                                                            (gy_3)var0x.getSource(),
                                                            RM.id_class(var0x, "begin"),
                                                            RM.id_class(var0x, "end"),
                                                            RM.id_class(var0x, "destination"),
                                                            id_class,
                                                            oM_2.FORCE
                                                         )
                                                   )
                                             ))
                                          .then(
                                             gp_3.id_class("move")
                                                .executes(
                                                   var0x -> id_class(
                                                         (gy_3)var0x.getSource(),
                                                         RM.id_class(var0x, "begin"),
                                                         RM.id_class(var0x, "end"),
                                                         RM.id_class(var0x, "destination"),
                                                         id_class,
                                                         oM_2.MOVE
                                                      )
                                                )
                                          ))
                                       .then(
                                          gp_3.id_class("normal")
                                             .executes(
                                                var0x -> id_class(
                                                      (gy_3)var0x.getSource(),
                                                      RM.id_class(var0x, "begin"),
                                                      RM.id_class(var0x, "end"),
                                                      RM.id_class(var0x, "destination"),
                                                      id_class,
                                                      oM_2.NORMAL
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.id_class("filtered")
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("filter", RO.id_class())
                                                   .executes(
                                                      var0x -> id_class(
                                                            (gy_3)var0x.getSource(),
                                                            RM.id_class(var0x, "begin"),
                                                            RM.id_class(var0x, "end"),
                                                            RM.id_class(var0x, "destination"),
                                                            RO.id_class(var0x, "filter"),
                                                            oM_2.NORMAL
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.id_class("force")
                                                      .executes(
                                                         var0x -> id_class(
                                                               (gy_3)var0x.getSource(),
                                                               RM.id_class(var0x, "begin"),
                                                               RM.id_class(var0x, "end"),
                                                               RM.id_class(var0x, "destination"),
                                                               RO.id_class(var0x, "filter"),
                                                               oM_2.FORCE
                                                            )
                                                      )
                                                ))
                                             .then(
                                                gp_3.id_class("move")
                                                   .executes(
                                                      var0x -> id_class(
                                                            (gy_3)var0x.getSource(),
                                                            RM.id_class(var0x, "begin"),
                                                            RM.id_class(var0x, "end"),
                                                            RM.id_class(var0x, "destination"),
                                                            RO.id_class(var0x, "filter"),
                                                            oM_2.MOVE
                                                         )
                                                   )
                                             ))
                                          .then(
                                             gp_3.id_class("normal")
                                                .executes(
                                                   var0x -> id_class(
                                                         (gy_3)var0x.getSource(),
                                                         RM.id_class(var0x, "begin"),
                                                         RM.id_class(var0x, "end"),
                                                         RM.id_class(var0x, "destination"),
                                                         RO.id_class(var0x, "filter"),
                                                         oM_2.NORMAL
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

   private static int id_class(gy_3 var0, rfH_2 var1, rfH_2 var2, rfH_2 var3, Predicate<ryw_3> var4, oM_2 var5) throws CommandSyntaxException {
      rfi_3 var6 = new rfi_3(var1, var2);
      rfH_2 var7 = var3.id_break(var6.id_byte());
      rfi_3 var8 = new rfi_3(var3, var7);
      if (!var5.id_class() && var8.id_class(var6)) {
         throw id_break.create();
      } else {
         int var9 = var6.id_protected() * var6.id_throws() * var6.id_case();
         if (var9 > 32768) {
            throw id_byte.create(32768, var9);
         } else {
            rrEm_1 var10 = var0.id_final();
            if (var10.id_class(var1, var2) && var10.id_class(var3, var7)) {
               ArrayList var11 = Lists.newArrayList();
               ArrayList var12 = Lists.newArrayList();
               ArrayList var13 = Lists.newArrayList();
               LinkedList var14 = Lists.newLinkedList();
               rfH_2 var15 = new rfH_2(var8.id_class - var6.id_class, var8.id_break - var6.id_break, var8.id_byte - var6.id_byte);

               for (int var16 = var6.id_byte; var16 <= var6.id_case; var16++) {
                  for (int var17 = var6.id_break; var17 <= var6.id_throws; var17++) {
                     for (int var18 = var6.id_class; var18 <= var6.id_protected; var18++) {
                        rfH_2 var19 = new rfH_2(var18, var17, var16);
                        rfH_2 var20 = var19.id_break(var15);
                        ryw_3 var21 = new ryw_3(var10, var19, false);
                        xc_3 var22 = var21.id_class();
                        if (var4.test(var21)) {
                           ryO_2 var23 = var10.id_class(var19);
                           if (var23 != null) {
                              rcd_3 var24 = var23.id_class(new rcd_3());
                              var12.add(new ob_3(var20, var22, var24));
                              var14.addLast(var19);
                           } else if (!var22.id_implements(var10, var19) && !var22.id_new(var10, var19)) {
                              var13.add(new ob_3(var20, var22, (rcd_3)null));
                              var14.addFirst(var19);
                           } else {
                              var11.add(new ob_3(var20, var22, (rcd_3)null));
                              var14.addLast(var19);
                           }
                        }
                     }
                  }
               }

               if (var5 == oM_2.MOVE) {
                  for (rfH_2 var28 : var14) {
                     ryO_2 var31 = var10.id_class(var28);
                     rXc_1.id_class(var31);
                     var10.id_class(var28, xu_3.Ec.id_continue(), 2);
                  }

                  for (rfH_2 var29 : var14) {
                     var10.id_class(var29, xu_3.id_class.id_continue(), 3);
                  }
               }

               ArrayList var27 = Lists.newArrayList();
               var27.addAll(var11);
               var27.addAll(var12);
               var27.addAll(var13);
               List var30 = Lists.reverse(var27);

               for (ob_3 var34 : var30) {
                  ryO_2 var38 = var10.id_class(var34.id_class);
                  rXc_1.id_class(var38);
                  var10.id_class(var34.id_class, xu_3.Ec.id_continue(), 2);
               }

               int var33 = 0;

               for (ob_3 var39 : var27) {
                  if (var10.id_class(var39.id_class, var39.id_break, 2)) {
                     var33++;
                  }
               }

               for (ob_3 var40 : var12) {
                  ryO_2 var42 = var10.id_class(var40.id_class);
                  if (var40.id_byte != null && var42 != null) {
                     var40.id_byte.id_break("x", var40.id_class.b_());
                     var40.id_byte.id_break("y", var40.id_class.c_());
                     var40.id_byte.id_break("z", var40.id_class.d_());
                     var42.id_class(var40.id_break, var40.id_byte);
                     var42.id_break();
                  }

                  var10.id_class(var40.id_class, var40.id_break, 2);
               }

               for (ob_3 var41 : var30) {
                  var10.id_class(var41.id_class, var41.id_break.id_break());
               }

               var10.id_synchronized().id_class(var6, var15);
               if (var33 == 0) {
                  throw id_protected.create();
               } else {
                  var0.id_class(new rgn_3("commands.clone.success", var33), true);
                  return var33;
               }
            } else {
               throw RM.id_class.create();
            }
         }
      }
   }
}
