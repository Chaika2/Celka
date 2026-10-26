package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class oE_2 {
   private static final DynamicCommandExceptionType class_ = new DynamicCommandExceptionType(var0 -> new rgn_3("clear.failed.single", var0));
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("clear.failed.multiple", var0));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("clear").requires(var0x -> var0x.class_(2)))
               .executes(var0x -> class_((gy_3)var0x.getSource(), Collections.singleton(((gy_3)var0x.getSource()).new_()), var0xx -> true, -1)))
            .then(
               ((RequiredArgumentBuilder)gp_3.class_("targets", RZ.protected_())
                     .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), var0xx -> true, -1)))
                  .then(
                     ((RequiredArgumentBuilder)gp_3.class_("item", RK.class_())
                           .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), RK.class_(var0x, "item"), -1)))
                        .then(
                           gp_3.class_("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 var0x -> class_(
                                       (gy_3)var0x.getSource(),
                                       RZ.case_(var0x, "targets"),
                                       RK.class_(var0x, "item"),
                                       IntegerArgumentType.getInteger(var0x, "maxCount")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int class_(gy_3 var0, Collection<rhN_2> var1, Predicate<rdn_3> var2, int var3) throws CommandSyntaxException {
      int var4 = 0;

      for (rhN_2 var6 : var1) {
         var4 += ((rhz_3)var6.implements_[1]).class_(var2, var3, ((rJT)var6.implements_[3]).case_());
         ((rJr_1)var6.implements_[4]).native_();
         ((rJT)var6.implements_[3]).class_((rhz_3)var6.implements_[1]);
         var6.private_();
      }

      if (var4 == 0) {
         if (var1.size() == 1) {
            throw class_.create(((rhN_2)var1.iterator().next()).g());
         } else {
            throw break_.create(var1.size());
         }
      } else {
         if (var3 == 0) {
            if (var1.size() == 1) {
               var0.class_(new rgn_3("commands.clear.test.single", var4, ((rhN_2)var1.iterator().next()).L_()), true);
            } else {
               var0.class_(new rgn_3("commands.clear.test.multiple", var4, var1.size()), true);
            }
         } else if (var1.size() == 1) {
            var0.class_(new rgn_3("commands.clear.success.single", var4, ((rhN_2)var1.iterator().next()).L_()), true);
         } else {
            var0.class_(new rgn_3("commands.clear.success.multiple", var4, var1.size()), true);
         }

         return var4;
      }
   }
}
