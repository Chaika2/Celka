package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;

public class oa_3 {
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.replaceitem.block.failed"));
   public static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.replaceitem.slot.inapplicable", var0));
   public static final Dynamic2CommandExceptionType id_byte = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("commands.replaceitem.entity.failed", var0, var1)
   );

   private static int id_class(gy_3 var0, rfH_2 var1, int var2, rdn_3 var3) throws CommandSyntaxException {
      if (!(var0.id_final().id_class(var1) instanceof rXu_1 var5)) {
         throw id_class.create();
      } else if (var2 >= 0 && var2 < var5.id_else()) {
         var5.id_break(var2, var3);
         var0.id_class(new rgn_3("commands.replaceitem.block.success", var1.b_(), var1.c_(), var1.d_(), var3.id_throw()), true);
         return 1;
      } else {
         throw id_break.create(var2);
      }
   }

   private static int id_class(gy_3 var0, Collection<? extends an_3> var1, int var2, rdn_3 var3) throws CommandSyntaxException {
      ArrayList var4 = Lists.newArrayListWithCapacity(var1.size());

      for (an_3 var6 : var1) {
         if (var6 instanceof rhN_2) {
            ((rJT)((rhN_2)var6).id_implements[3]).id_native();
         }

         if (var6.id_class(var2, var3.id_implements())) {
            var4.add(var6);
            if (var6 instanceof rhN_2) {
               ((rJT)((rhN_2)var6).id_implements[3]).id_native();
            }
         }
      }

      if (var4.isEmpty()) {
         throw id_byte.create(var3.id_throw(), var2);
      } else {
         if (var4.size() == 1) {
            var0.id_class(new rgn_3("commands.replaceitem.entity.success.single", ((an_3)var4.iterator().next()).L_(), var3.id_throw()), true);
         } else {
            var0.id_class(new rgn_3("commands.replaceitem.entity.success.multiple", var4.size(), var3.id_throw()), true);
         }

         return var4.size();
      }
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("replaceitem").requires(var0x -> var0x.id_class(2)))
               .then(
                  gp_3.id_class("block")
                     .then(
                        gp_3.id_class("pos", RM.id_class())
                           .then(
                              gp_3.id_class("slot", YC.id_class())
                                 .then(
                                    ((RequiredArgumentBuilder)gp_3.id_class("item", RR.id_class())
                                          .executes(
                                             var0x -> id_class(
                                                   (gy_3)var0x.getSource(),
                                                   RM.id_class(var0x, "pos"),
                                                   YC.id_class(var0x, "slot"),
                                                   RR.id_class(var0x, "item").id_class(1, false)
                                                )
                                          ))
                                       .then(
                                          gp_3.id_class("count", IntegerArgumentType.integer(1, 64))
                                             .executes(
                                                var0x -> id_class(
                                                      (gy_3)var0x.getSource(),
                                                      RM.id_class(var0x, "pos"),
                                                      YC.id_class(var0x, "slot"),
                                                      RR.id_class(var0x, "item").id_class(IntegerArgumentType.getInteger(var0x, "count"), true)
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               gp_3.id_class("entity")
                  .then(
                     gp_3.id_class("targets", RZ.id_break())
                        .then(
                           gp_3.id_class("slot", YC.id_class())
                              .then(
                                 ((RequiredArgumentBuilder)gp_3.id_class("item", RR.id_class())
                                       .executes(
                                          var0x -> id_class(
                                                (gy_3)var0x.getSource(),
                                                RZ.id_break(var0x, "targets"),
                                                YC.id_class(var0x, "slot"),
                                                RR.id_class(var0x, "item").id_class(1, false)
                                             )
                                       ))
                                    .then(
                                       gp_3.id_class("count", IntegerArgumentType.integer(1, 64))
                                          .executes(
                                             var0x -> id_class(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.id_break(var0x, "targets"),
                                                   YC.id_class(var0x, "slot"),
                                                   RR.id_class(var0x, "item").id_class(IntegerArgumentType.getInteger(var0x, "count"), true)
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }
}
