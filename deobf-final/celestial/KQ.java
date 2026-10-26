package celestial;

import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.HashSet;

public class KQ {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.tag.add.failed"));
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.tag.remove.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("tag").requires(var0x -> var0x.class_(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("targets", RZ.break_())
                        .then(
                           gp_3.class_("add")
                              .then(
                                 gp_3.class_("name", StringArgumentType.word())
                                    .executes(
                                       var0x -> class_((gy_3)var0x.getSource(), RZ.break_(var0x, "targets"), StringArgumentType.getString(var0x, "name"))
                                    )
                              )
                        ))
                     .then(
                        gp_3.class_("remove")
                           .then(
                              gp_3.class_("name", StringArgumentType.word())
                                 .suggests((var0x, var1) -> gR_2.break_(class_(RZ.break_(var0x, "targets")), var1))
                                 .executes(var0x -> break_((gy_3)var0x.getSource(), RZ.break_(var0x, "targets"), StringArgumentType.getString(var0x, "name")))
                           )
                     ))
                  .then(gp_3.class_("list").executes(var0x -> class_((gy_3)var0x.getSource(), RZ.break_(var0x, "targets"))))
            )
      );
   }

   private static int class_(gy_3 var0, Collection<? extends an_3> var1, String var2) throws CommandSyntaxException {
      int var3 = 0;

      for (an_3 var5 : var1) {
         if (var5.implements_(var2)) {
            var3++;
         }
      }

      if (var3 == 0) {
         throw class_.create();
      } else {
         if (var1.size() == 1) {
            var0.class_(new rgn_3("commands.tag.add.success.single", var2, ((an_3)var1.iterator().next()).L_()), true);
         } else {
            var0.class_(new rgn_3("commands.tag.add.success.multiple", var2, var1.size()), true);
         }

         return var3;
      }
   }

   private static int class_(gy_3 var0, Collection<? extends an_3> var1) {
      HashSet var2 = Sets.newHashSet();

      for (an_3 var4 : var1) {
         var2.addAll(var4.y());
      }

      if (var1.size() == 1) {
         an_3 var5 = (an_3)var1.iterator().next();
         if (var2.isEmpty()) {
            var0.class_(new rgn_3("commands.tag.list.single.empty", var5.L_()), false);
         } else {
            var0.class_(new rgn_3("commands.tag.list.single.success", var5.L_(), var2.size(), rgv_3.class_(var2)), false);
         }
      } else if (var2.isEmpty()) {
         var0.class_(new rgn_3("commands.tag.list.multiple.empty", var1.size()), false);
      } else {
         var0.class_(new rgn_3("commands.tag.list.multiple.success", var1.size(), var2.size(), rgv_3.class_(var2)), false);
      }

      return var2.size();
   }

   private static Collection<String> class_(Collection<? extends an_3> var0) {
      HashSet var1 = Sets.newHashSet();

      for (an_3 var3 : var0) {
         var1.addAll(var3.y());
      }

      return var1;
   }

   private static int break_(gy_3 var0, Collection<? extends an_3> var1, String var2) throws CommandSyntaxException {
      int var3 = 0;

      for (an_3 var5 : var1) {
         if (var5.private_(var2)) {
            var3++;
         }
      }

      if (var3 == 0) {
         throw break_.create();
      } else {
         if (var1.size() == 1) {
            var0.class_(new rgn_3("commands.tag.remove.success.single", var2, ((an_3)var1.iterator().next()).L_()), true);
         } else {
            var0.class_(new rgn_3("commands.tag.remove.success.multiple", var2, var1.size()), true);
         }

         return var3;
      }
   }
}
