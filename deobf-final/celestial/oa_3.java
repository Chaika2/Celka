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
   public static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.replaceitem.block.failed"));
   public static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.replaceitem.slot.inapplicable", var0));
   public static final Dynamic2CommandExceptionType byte_ = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("commands.replaceitem.entity.failed", var0, var1)
   );

   private static int class_(gy_3 var0, rfH_2 var1, int var2, rdn_3 var3) throws CommandSyntaxException {
      if (!(var0.final_().class_(var1) instanceof rXu_1 var5)) {
         throw class_.create();
      } else if (var2 >= 0 && var2 < var5.else_()) {
         var5.break_(var2, var3);
         var0.class_(new rgn_3("commands.replaceitem.block.success", var1.b_(), var1.c_(), var1.d_(), var3.throw_()), true);
         return 1;
      } else {
         throw break_.create(var2);
      }
   }

   private static int class_(gy_3 var0, Collection<? extends an_3> var1, int var2, rdn_3 var3) throws CommandSyntaxException {
      ArrayList var4 = Lists.newArrayListWithCapacity(var1.size());

      for (an_3 var6 : var1) {
         if (var6 instanceof rhN_2) {
            ((rJT)((rhN_2)var6).implements_[3]).native_();
         }

         if (var6.class_(var2, var3.implements_())) {
            var4.add(var6);
            if (var6 instanceof rhN_2) {
               ((rJT)((rhN_2)var6).implements_[3]).native_();
            }
         }
      }

      if (var4.isEmpty()) {
         throw byte_.create(var3.throw_(), var2);
      } else {
         if (var4.size() == 1) {
            var0.class_(new rgn_3("commands.replaceitem.entity.success.single", ((an_3)var4.iterator().next()).L_(), var3.throw_()), true);
         } else {
            var0.class_(new rgn_3("commands.replaceitem.entity.success.multiple", var4.size(), var3.throw_()), true);
         }

         return var4.size();
      }
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("replaceitem").requires(var0x -> var0x.class_(2)))
               .then(
                  gp_3.class_("block")
                     .then(
                        gp_3.class_("pos", RM.class_())
                           .then(
                              gp_3.class_("slot", YC.class_())
                                 .then(
                                    ((RequiredArgumentBuilder)gp_3.class_("item", RR.class_())
                                          .executes(
                                             var0x -> class_(
                                                   (gy_3)var0x.getSource(),
                                                   RM.class_(var0x, "pos"),
                                                   YC.class_(var0x, "slot"),
                                                   RR.class_(var0x, "item").class_(1, false)
                                                )
                                          ))
                                       .then(
                                          gp_3.class_("count", IntegerArgumentType.integer(1, 64))
                                             .executes(
                                                var0x -> class_(
                                                      (gy_3)var0x.getSource(),
                                                      RM.class_(var0x, "pos"),
                                                      YC.class_(var0x, "slot"),
                                                      RR.class_(var0x, "item").class_(IntegerArgumentType.getInteger(var0x, "count"), true)
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               gp_3.class_("entity")
                  .then(
                     gp_3.class_("targets", RZ.break_())
                        .then(
                           gp_3.class_("slot", YC.class_())
                              .then(
                                 ((RequiredArgumentBuilder)gp_3.class_("item", RR.class_())
                                       .executes(
                                          var0x -> class_(
                                                (gy_3)var0x.getSource(),
                                                RZ.break_(var0x, "targets"),
                                                YC.class_(var0x, "slot"),
                                                RR.class_(var0x, "item").class_(1, false)
                                             )
                                       ))
                                    .then(
                                       gp_3.class_("count", IntegerArgumentType.integer(1, 64))
                                          .executes(
                                             var0x -> class_(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.break_(var0x, "targets"),
                                                   YC.class_(var0x, "slot"),
                                                   RR.class_(var0x, "item").class_(IntegerArgumentType.getInteger(var0x, "count"), true)
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
