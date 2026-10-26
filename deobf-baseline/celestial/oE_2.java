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
   private static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(var0 -> new rgn_3("clear.failed.single", var0));
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("clear.failed.multiple", var0));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("clear").requires(var0x -> var0x.id_class(2)))
               .executes(var0x -> id_class((gy_3)var0x.getSource(), Collections.singleton(((gy_3)var0x.getSource()).id_new()), var0xx -> true, -1)))
            .then(
               ((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected())
                     .executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), var0xx -> true, -1)))
                  .then(
                     ((RequiredArgumentBuilder)gp_3.id_class("item", RK.id_class())
                           .executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), RK.id_class(var0x, "item"), -1)))
                        .then(
                           gp_3.id_class("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 var0x -> id_class(
                                       (gy_3)var0x.getSource(),
                                       RZ.id_case(var0x, "targets"),
                                       RK.id_class(var0x, "item"),
                                       IntegerArgumentType.getInteger(var0x, "maxCount")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int id_class(gy_3 var0, Collection<rhN_2> var1, Predicate<rdn_3> var2, int var3) throws CommandSyntaxException {
      int var4 = 0;

      for (rhN_2 var6 : var1) {
         var4 += ((rhz_3)var6.id_implements[1]).id_class(var2, var3, ((rJT)var6.id_implements[3]).id_case());
         ((rJr_1)var6.id_implements[4]).id_native();
         ((rJT)var6.id_implements[3]).id_class((rhz_3)var6.id_implements[1]);
         var6.id_private();
      }

      if (var4 == 0) {
         if (var1.size() == 1) {
            throw id_class.create(((rhN_2)var1.iterator().next()).g());
         } else {
            throw id_break.create(var1.size());
         }
      } else {
         if (var3 == 0) {
            if (var1.size() == 1) {
               var0.id_class(new rgn_3("commands.clear.test.single", var4, ((rhN_2)var1.iterator().next()).L_()), true);
            } else {
               var0.id_class(new rgn_3("commands.clear.test.multiple", var4, var1.size()), true);
            }
         } else if (var1.size() == 1) {
            var0.id_class(new rgn_3("commands.clear.success.single", var4, ((rhN_2)var1.iterator().next()).L_()), true);
         } else {
            var0.id_class(new rgn_3("commands.clear.success.multiple", var4, var1.size()), true);
         }

         return var4;
      }
   }
}
