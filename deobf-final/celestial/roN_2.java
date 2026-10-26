package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class roN_2 {
   private static final EnumSet<rKv_1> final_ = EnumSet.of(rKv_1.OCEAN_FLOOR_WG, rKv_1.WORLD_SURFACE_WG);
   private static final EnumSet<rKv_1> package_ = EnumSet.of(rKv_1.OCEAN_FLOOR, rKv_1.WORLD_SURFACE, rKv_1.MOTION_BLOCKING, rKv_1.MOTION_BLOCKING_NO_LEAVES);
   private static final rou_3 int_ = (var0, var1, var2, var3, var4, var5) -> {
      if (var5 instanceof rok_3 && !var5.goto_().break_(var0)) {
         ((rok_3)var5).class_(var0);
      }

      return CompletableFuture.completedFuture(Either.left(var5));
   };
   public static final roN_2 class_ = class_("empty", (roN_2)null, -1, final_, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> {
   });
   public static final roN_2 break_ = class_("structure_starts", class_, 0, final_, roZ_2.PROTOCHUNK, (var0, var1, var2, var3, var4, var5, var6, var7) -> {
      if (!var7.goto_().break_(var0)) {
         if (var1.const_().rB().long_().break_()) {
            var2.class_(var1.new_(), var1.protected_(), var7, var3, var1.break_());
         }

         if (var7 instanceof rok_3) {
            ((rok_3)var7).class_(var0);
         }
      }

      return CompletableFuture.completedFuture(Either.left(var7));
   });
   public static final roN_2 byte_ = class_("structure_references", break_, 8, final_, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> {
      rKf_1 var4 = new rKf_1(var0, var2);
      var1.class_((rRI)var4, var0.protected_().class_(var4), var3);
   });
   public static final roN_2 protected_ = class_(
      "biomes", byte_, 0, final_, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> var1.class_(var0.new_().break_(rVL.n), var3)
   );
   public static final roN_2 throws_ = class_("noise", protected_, 8, final_, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> {
      rKf_1 var4 = new rKf_1(var0, var2);
      var1.class_((rRg_1)var4, var0.protected_().class_(var4), var3);
   });
   public static final roN_2 case_ = class_(
      "surface", throws_, 0, final_, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> var1.class_(new rKf_1(var0, var2), var3)
   );
   public static final roN_2 catch_ = class_(
      "carvers", case_, 0, final_, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> var1.class_(var0.break_(), var0.static_(), var3, rKu_1.AIR)
   );
   public static final roN_2 private_ = class_(
      "liquid_carvers", catch_, 0, package_, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> var1.class_(var0.break_(), var0.static_(), var3, rKu_1.LIQUID)
   );
   public static final roN_2 implements_ = class_("features", private_, 8, package_, roZ_2.PROTOCHUNK, (var0, var1, var2, var3, var4, var5, var6, var7) -> {
      rok_3 var8 = (rok_3)var7;
      var8.class_(var4);
      if (!var7.goto_().break_(var0)) {
         rKZ.class_(var7, EnumSet.of(rKv_1.MOTION_BLOCKING, rKv_1.MOTION_BLOCKING_NO_LEAVES, rKv_1.OCEAN_FLOOR, rKv_1.WORLD_SURFACE));
         rKf_1 var9 = new rKf_1(var1, var6);
         var2.class_(var9, var1.protected_().class_(var9));
         var8.class_(var0);
      }

      return CompletableFuture.completedFuture(Either.left(var7));
   });
   public static final roN_2 finally_ = class_(
      "light",
      implements_,
      1,
      package_,
      roZ_2.PROTOCHUNK,
      (var0, var1, var2, var3, var4, var5, var6, var7) -> class_(var0, var4, var7),
      (var0, var1, var2, var3, var4, var5) -> class_(var0, var3, var5)
   );
   public static final roN_2 extends_ = class_("spawn", finally_, 0, package_, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> var1.class_(new rKf_1(var0, var2)));
   public static final roN_2 native_ = class_("heightmaps", extends_, 0, package_, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> {
   });
   public static final roN_2 volatile_ = class_(
      "full",
      native_,
      0,
      package_,
      roZ_2.LEVELCHUNK,
      (var0, var1, var2, var3, var4, var5, var6, var7) -> var5.apply(var7),
      (var0, var1, var2, var3, var4, var5) -> var4.apply(var5)
   );
   private static final List<roN_2> new_ = ImmutableList.of(volatile_, implements_, private_, break_, break_, break_, break_, break_, break_, break_, break_);
   private static final IntList continue_ = rqR_2.class_(new IntArrayList(class_().size()), var0 -> {
      int var1 = 0;

      for (int var2 = class_().size() - 1; var2 >= 0; var2--) {
         while (var1 + 1 < new_.size() && var2 <= new_.get(var1 + 1).byte_()) {
            var1++;
         }

         var0.add(0, var1);
      }
   });
   private final String super_;
   private final int this_;
   private final roN_2 else_;
   private final roc_3 synchronized_;
   private final rou_3 return_;
   private final int public_;
   private final roZ_2 goto_;
   private final EnumSet<rKv_1> while_;

   public int byte_() {
      return this.this_;
   }

   roN_2(String var1, roN_2 var2, int var3, EnumSet<rKv_1> var4, roZ_2 var5, roc_3 var6, rou_3 var7) {
      this.super_ = var1;
      this.else_ = var2 == null ? this : var2;
      this.synchronized_ = var6;
      this.return_ = var7;
      this.public_ = var3;
      this.goto_ = var5;
      this.while_ = var4;
      this.this_ = var2 == null ? 0 : var2.byte_() + 1;
   }

   @Override
   public String toString() {
      return rVL.S.break_(this).toString();
   }

   public static roN_2 class_(String var0) {
      return rVL.S.class_(rqO_2.break_(var0));
   }

   private static CompletableFuture<Either<roC_2, rrEM>> class_(roN_2 var0, rrEZ var1, roC_2 var2) {
      boolean var3 = class_(var0, var2);
      if (!var2.goto_().break_(var0)) {
         ((rok_3)var2).class_(var0);
      }

      return var1.class_(var2, var3).thenApply(Either::left);
   }

   public CompletableFuture<Either<roC_2, rrEM>> class_(
      rrEm_1 var1, rrPt_1 var2, rrEZ var3, Function<roC_2, CompletableFuture<Either<roC_2, rrEM>>> var4, roC_2 var5
   ) {
      return this.return_.doWork(this, var1, var2, var3, var4, var5);
   }

   private static roN_2 class_(String var0, roN_2 var1, int var2, EnumSet<rKv_1> var3, roZ_2 var4, roc_3 var5, rou_3 var6) {
      return rVL.class_(rVL.S, var0, new roN_2(var0, var1, var2, var3, var4, var5, var6));
   }

   public static int class_(roN_2 var0) {
      return continue_.getInt(var0.byte_());
   }

   public static roN_2 class_(int var0) {
      if (var0 >= new_.size()) {
         return class_;
      } else {
         return var0 < 0 ? volatile_ : new_.get(var0);
      }
   }

   private static boolean class_(roN_2 var0, roC_2 var1) {
      return var1.goto_().break_(var0) && var1.throw_();
   }

   public static List<roN_2> class_() {
      ArrayList var0 = Lists.newArrayList();

      roN_2 var1;
      for (var1 = volatile_; var1.throws_() != var1; var1 = var1.throws_()) {
         var0.add(var1);
      }

      var0.add(var1);
      Collections.reverse(var0);
      return var0;
   }

   public CompletableFuture<Either<roC_2, rrEM>> class_(
      rrEm_1 var1, rKd_1 var2, rrPt_1 var3, rrEZ var4, Function<roC_2, CompletableFuture<Either<roC_2, rrEM>>> var5, List<roC_2> var6
   ) {
      return this.synchronized_.doWork(this, var1, var2, var3, var4, var5, var6, (roC_2)var6.get(var6.size() / 2));
   }

   private static roN_2 class_(String var0, roN_2 var1, int var2, EnumSet<rKv_1> var3, roZ_2 var4, roc_3 var5) {
      return class_(var0, var1, var2, var3, var4, var5, int_);
   }

   private static roN_2 class_(String var0, roN_2 var1, int var2, EnumSet<rKv_1> var3, roZ_2 var4, rom_3 var5) {
      return class_(var0, var1, var2, var3, var4, (roc_3)var5);
   }

   public boolean break_(roN_2 var1) {
      return this.byte_() >= var1.byte_();
   }

   public static int break_() {
      return new_.size();
   }

   public roN_2 throws_() {
      return this.else_;
   }

   public roZ_2 catch_() {
      return this.goto_;
   }

   public int case_() {
      return this.public_;
   }

   public String protected_() {
      return this.super_;
   }

   public EnumSet<rKv_1> private_() {
      return this.while_;
   }
}
