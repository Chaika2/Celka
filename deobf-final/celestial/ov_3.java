package celestial;

import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ov_3 {
   private static final Dynamic2CommandExceptionType class_ = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("commands.forceload.toobig", var0, var1)
   );
   private static final Dynamic2CommandExceptionType break_ = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("commands.forceload.query.failure", var0, var1)
   );
   private static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType protected_ = new SimpleCommandExceptionType(new rgn_3("commands.forceload.removed.failure"));

   private static int class_(gy_3 var0, rfg_3 var1) throws CommandSyntaxException {
      rfj_3 var2 = new rfj_3(var1.class_ >> 4, var1.break_ >> 4);
      rrEm_1 var3 = var0.final_();
      rqM_2 var4 = var3.E();
      boolean var5 = var3.x().contains(var2.class_());
      if (var5) {
         var0.class_(new rgn_3("commands.forceload.query.success", var2, var4.class_()), false);
         return 1;
      } else {
         throw break_.create(var2, var4.class_());
      }
   }

   private static int class_(gy_3 var0) {
      rrEm_1 var1 = var0.final_();
      rqM_2 var2 = var1.E();
      LongSet var3 = var1.x();
      int var4 = var3.size();
      if (var4 > 0) {
         String var5 = Joiner.on(", ").join(var3.stream().sorted().map(rfj_3::new).map(rfj_3::toString).iterator());
         if (var4 == 1) {
            var0.class_(new rgn_3("commands.forceload.list.single", var2.class_(), var5), false);
         } else {
            var0.class_(new rgn_3("commands.forceload.list.multiple", var4, var2.class_(), var5), false);
         }
      } else {
         var0.class_(new rgn_3("commands.forceload.added.none", var2.class_()));
      }

      return var4;
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("forceload")
                     .requires(var0x -> var0x.class_(2)))
                  .then(
                     gp_3.class_("add")
                        .then(
                           ((RequiredArgumentBuilder)gp_3.class_("from", Rz_1.class_())
                                 .executes(var0x -> class_((gy_3)var0x.getSource(), Rz_1.class_(var0x, "from"), Rz_1.class_(var0x, "from"), true)))
                              .then(
                                 gp_3.class_("to", Rz_1.class_())
                                    .executes(var0x -> class_((gy_3)var0x.getSource(), Rz_1.class_(var0x, "from"), Rz_1.class_(var0x, "to"), true))
                              )
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)gp_3.class_("remove")
                        .then(
                           ((RequiredArgumentBuilder)gp_3.class_("from", Rz_1.class_())
                                 .executes(var0x -> class_((gy_3)var0x.getSource(), Rz_1.class_(var0x, "from"), Rz_1.class_(var0x, "from"), false)))
                              .then(
                                 gp_3.class_("to", Rz_1.class_())
                                    .executes(var0x -> class_((gy_3)var0x.getSource(), Rz_1.class_(var0x, "from"), Rz_1.class_(var0x, "to"), false))
                              )
                        ))
                     .then(gp_3.class_("all").executes(var0x -> break_((gy_3)var0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)gp_3.class_("query").executes(var0x -> class_((gy_3)var0x.getSource())))
                  .then(gp_3.class_("pos", Rz_1.class_()).executes(var0x -> class_((gy_3)var0x.getSource(), Rz_1.class_(var0x, "pos"))))
            )
      );
   }

   private static int class_(gy_3 var0, rfg_3 var1, rfg_3 var2, boolean var3) throws CommandSyntaxException {
      int var4 = Math.min(var1.class_, var2.class_);
      int var5 = Math.min(var1.break_, var2.break_);
      int var6 = Math.max(var1.class_, var2.class_);
      int var7 = Math.max(var1.break_, var2.break_);
      if (var4 >= -30000000 && var5 >= -30000000 && var6 < 30000000 && var7 < 30000000) {
         int var8 = var4 >> 4;
         int var9 = var5 >> 4;
         int var10 = var6 >> 4;
         int var11 = var7 >> 4;
         long var12 = ((long)(var10 - var8) + 1L) * ((long)(var11 - var9) + 1L);
         if (var12 > 256L) {
            throw class_.create(256, var12);
         } else {
            rrEm_1 var14 = var0.final_();
            rqM_2 var15 = var14.E();
            rfj_3 var16 = null;
            int var17 = 0;

            for (int var18 = var8; var18 <= var10; var18++) {
               for (int var19 = var9; var19 <= var11; var19++) {
                  boolean var20 = var14.class_(var18, var19, var3);
                  if (var20) {
                     var17++;
                     if (var16 == null) {
                        var16 = new rfj_3(var18, var19);
                     }
                  }
               }
            }

            if (var17 == 0) {
               throw (var3 ? byte_ : protected_).create();
            } else {
               if (var17 == 1) {
                  var0.class_(new rgn_3("commands.forceload." + (var3 ? "added" : "removed") + ".single", var16, var15.class_()), true);
               } else {
                  rfj_3 var21 = new rfj_3(var8, var9);
                  rfj_3 var22 = new rfj_3(var10, var11);
                  var0.class_(new rgn_3("commands.forceload." + (var3 ? "added" : "removed") + ".multiple", var17, var15.class_(), var21, var22), true);
               }

               return var17;
            }
         }
      } else {
         throw RM.break_.create();
      }
   }

   private static int break_(gy_3 var0) {
      rrEm_1 var1 = var0.final_();
      rqM_2 var2 = var1.E();
      LongSet var3 = var1.x();
      var3.forEach(var1x -> var1.class_(rfj_3.class_(var1x), rfj_3.break_(var1x), false));
      var0.class_(new rgn_3("commands.forceload.removed.all", var2.class_()), true);
      return 0;
   }
}
