package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.Locale;

public class KF {
   private static int id_class(gy_3 var0, Collection<rhN_2> var1, int var2, int var3, int var4) {
      rFu_1 var5 = new rFu_1(var2, var3, var4);

      for (rhN_2 var7 : var1) {
         var7.id_class.id_class(var5);
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.title.times.single", ((rhN_2)var1.iterator().next()).L_()), true);
      } else {
         var0.id_class(new rgn_3("commands.title.times.multiple", var1.size()), true);
      }

      return var1.size();
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("title").requires(var0x -> var0x.id_class(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class(
                                    "targets", RZ.id_protected()
                                 )
                                 .then(gp_3.id_class("clear").executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets")))))
                              .then(gp_3.id_class("reset").executes(var0x -> id_break((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets")))))
                           .then(
                              gp_3.id_class("title")
                                 .then(
                                    gp_3.id_class("title", RQ.id_class())
                                       .executes(
                                          var0x -> id_class((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), RQ.id_class(var0x, "title"), rFm_1.TITLE)
                                       )
                                 )
                           ))
                        .then(
                           gp_3.id_class("subtitle")
                              .then(
                                 gp_3.id_class("title", RQ.id_class())
                                    .executes(
                                       var0x -> id_class((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), RQ.id_class(var0x, "title"), rFm_1.SUBTITLE)
                                    )
                              )
                        ))
                     .then(
                        gp_3.id_class("actionbar")
                           .then(
                              gp_3.id_class("title", RQ.id_class())
                                 .executes(
                                    var0x -> id_class((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), RQ.id_class(var0x, "title"), rFm_1.ACTIONBAR)
                                 )
                           )
                     ))
                  .then(
                     gp_3.id_class("times")
                        .then(
                           gp_3.id_class("fadeIn", IntegerArgumentType.integer(0))
                              .then(
                                 gp_3.id_class("stay", IntegerArgumentType.integer(0))
                                    .then(
                                       gp_3.id_class("fadeOut", IntegerArgumentType.integer(0))
                                          .executes(
                                             var0x -> id_class(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.id_case(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "fadeIn"),
                                                   IntegerArgumentType.getInteger(var0x, "stay"),
                                                   IntegerArgumentType.getInteger(var0x, "fadeOut")
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int id_class(gy_3 var0, Collection<rhN_2> var1) {
      rFu_1 var2 = new rFu_1(rFm_1.CLEAR, (rgP_2)null);

      for (rhN_2 var4 : var1) {
         var4.id_class.id_class(var2);
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.title.cleared.single", ((rhN_2)var1.iterator().next()).L_()), true);
      } else {
         var0.id_class(new rgn_3("commands.title.cleared.multiple", var1.size()), true);
      }

      return var1.size();
   }

   private static int id_class(gy_3 var0, Collection<rhN_2> var1, rgP_2 var2, rFm_1 var3) throws CommandSyntaxException {
      for (rhN_2 var5 : var1) {
         var5.id_class.id_class(new rFu_1(var3, rgv_3.id_class(var0, var2, var5, 0)));
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.title.show." + var3.name().toLowerCase(Locale.ROOT) + ".single", ((rhN_2)var1.iterator().next()).L_()), true);
      } else {
         var0.id_class(new rgn_3("commands.title.show." + var3.name().toLowerCase(Locale.ROOT) + ".multiple", var1.size()), true);
      }

      return var1.size();
   }

   private static int id_break(gy_3 var0, Collection<rhN_2> var1) {
      rFu_1 var2 = new rFu_1(rFm_1.RESET, (rgP_2)null);

      for (rhN_2 var4 : var1) {
         var4.id_class.id_class(var2);
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.title.reset.single", ((rhN_2)var1.iterator().next()).L_()), true);
      } else {
         var0.id_class(new rgn_3("commands.title.reset.multiple", var1.size()), true);
      }

      return var1.size();
   }
}
