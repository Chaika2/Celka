package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class rLl_1 {
   private final rLq_1[] class_ = new rLq_1[32];
   private final int break_;
   private final rLn_1 byte_;
   private final rLH protected_ = new rLH();

   public rLl_1(rLn_1 var1, int var2) {
      this.byte_ = var1;
      this.break_ = var2;
   }

   private rLC class_(rLq_1 var1, rfH_2 var2, boolean var3) {
      ArrayList var4 = Lists.newArrayList();
      rLq_1 var5 = var1;
      var4.add(0, var1);

      while (var5.private_ != null) {
         var5 = var5.private_;
         var4.add(0, var5);
      }

      return new rLC(var4, var2, var3);
   }

   public rLC class_(rRU var1, is_3 var2, Set<rfH_2> var3, float var4, int var5, float var6) {
      this.protected_.class_();
      this.byte_.class_(var1, var2);
      rLq_1 var7 = this.byte_.break_();
      Map var8 = var3.stream()
         .collect(Collectors.toMap(var1x -> this.byte_.class_((double)var1x.b_(), (double)var1x.c_(), (double)var1x.d_()), Function.identity()));
      rLC var9 = this.class_(var7, var8, var4, var5, var6);
      this.byte_.class_();
      return var9;
   }

   private rLC class_(rLq_1 var1, Map<rLv_1, rfH_2> var2, float var3, int var4, float var5) {
      Set var6 = var2.keySet();
      var1.throws_ = 0.0F;
      var1.case_ = this.class_(var1, var6);
      var1.catch_ = var1.case_;
      this.protected_.class_();
      this.protected_.class_(var1);
      ImmutableSet var7 = ImmutableSet.of();
      int var8 = 0;
      HashSet var9 = Sets.newHashSetWithExpectedSize(var6.size());
      int var10 = (int)((float)this.break_ * var5);

      while (!this.protected_.byte_()) {
         if (++var8 >= var10) {
            break;
         }

         rLq_1 var11 = this.protected_.break_();
         var11.implements_ = true;

         for (rLv_1 var13 : var6) {
            if (var11.byte_(var13) <= (float)var4) {
               var13.break_();
               var9.add(var13);
            }
         }

         if (!var9.isEmpty()) {
            break;
         }

         if (!(var11.class_(var1) >= var3)) {
            int var18 = this.byte_.class_(this.class_, var11);

            for (int var19 = 0; var19 < var18; var19++) {
               rLq_1 var14 = this.class_[var19];
               float var15 = var11.class_(var14);
               var14.finally_ = var11.finally_ + var15;
               float var16 = var11.throws_ + var15 + var14.extends_;
               if (var14.finally_ < var3 && (!var14.protected_() || var16 < var14.throws_)) {
                  var14.private_ = var11;
                  var14.throws_ = var16;
                  var14.case_ = this.class_(var14, var6) * 1.5F;
                  if (var14.protected_()) {
                     this.protected_.class_(var14, var14.throws_ + var14.case_);
                  } else {
                     var14.catch_ = var14.throws_ + var14.case_;
                     this.protected_.class_(var14);
                  }
               }
            }
         }
      }

      Optional var17 = !var9.isEmpty()
         ? var9.stream().map(var2x -> this.class_(var2x.class_(), (rfH_2)var2.get(var2x), true)).min(Comparator.comparingInt(rLC::throws_))
         : var6.stream()
            .map(var2x -> this.class_(var2x.class_(), (rfH_2)var2.get(var2x), false))
            .min(Comparator.comparingDouble(rLC::final_).thenComparingInt(rLC::throws_));
      return !var17.isPresent() ? null : (rLC)var17.get();
   }

   private float class_(rLq_1 var1, Set<rLv_1> var2) {
      float var3 = Float.MAX_VALUE;

      for (rLv_1 var5 : var2) {
         float var6 = var1.class_(var5);
         var5.class_(var6, var1);
         var3 = Math.min(var6, var3);
      }

      return var3;
   }
}
