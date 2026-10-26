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
   private final rLq_1[] id_class = new rLq_1[32];
   private final int id_break;
   private final rLn_1 id_byte;
   private final rLH id_protected = new rLH();

   public rLl_1(rLn_1 var1, int var2) {
      this.id_byte = var1;
      this.id_break = var2;
   }

   private rLC id_class(rLq_1 var1, rfH_2 var2, boolean var3) {
      ArrayList var4 = Lists.newArrayList();
      rLq_1 var5 = var1;
      var4.add(0, var1);

      while (var5.id_private != null) {
         var5 = var5.id_private;
         var4.add(0, var5);
      }

      return new rLC(var4, var2, var3);
   }

   public rLC id_class(rRU var1, is_3 var2, Set<rfH_2> var3, float var4, int var5, float var6) {
      this.id_protected.id_class();
      this.id_byte.id_class(var1, var2);
      rLq_1 var7 = this.id_byte.id_break();
      Map var8 = var3.stream()
         .collect(Collectors.toMap(var1x -> this.id_byte.id_class((double)var1x.b_(), (double)var1x.c_(), (double)var1x.d_()), Function.identity()));
      rLC var9 = this.id_class(var7, var8, var4, var5, var6);
      this.id_byte.id_class();
      return var9;
   }

   private rLC id_class(rLq_1 var1, Map<rLv_1, rfH_2> var2, float var3, int var4, float var5) {
      Set var6 = var2.keySet();
      var1.id_throws = 0.0F;
      var1.id_case = this.id_class(var1, var6);
      var1.id_catch = var1.id_case;
      this.id_protected.id_class();
      this.id_protected.id_class(var1);
      ImmutableSet var7 = ImmutableSet.of();
      int var8 = 0;
      HashSet var9 = Sets.newHashSetWithExpectedSize(var6.size());
      int var10 = (int)((float)this.id_break * var5);

      while (!this.id_protected.id_byte()) {
         if (++var8 >= var10) {
            break;
         }

         rLq_1 var11 = this.id_protected.id_break();
         var11.id_implements = true;

         for (rLv_1 var13 : var6) {
            if (var11.id_byte(var13) <= (float)var4) {
               var13.id_break();
               var9.add(var13);
            }
         }

         if (!var9.isEmpty()) {
            break;
         }

         if (!(var11.id_class(var1) >= var3)) {
            int var18 = this.id_byte.id_class(this.id_class, var11);

            for (int var19 = 0; var19 < var18; var19++) {
               rLq_1 var14 = this.id_class[var19];
               float var15 = var11.id_class(var14);
               var14.id_finally = var11.id_finally + var15;
               float var16 = var11.id_throws + var15 + var14.id_extends;
               if (var14.id_finally < var3 && (!var14.id_protected() || var16 < var14.id_throws)) {
                  var14.id_private = var11;
                  var14.id_throws = var16;
                  var14.id_case = this.id_class(var14, var6) * 1.5F;
                  if (var14.id_protected()) {
                     this.id_protected.id_class(var14, var14.id_throws + var14.id_case);
                  } else {
                     var14.id_catch = var14.id_throws + var14.id_case;
                     this.id_protected.id_class(var14);
                  }
               }
            }
         }
      }

      Optional var17 = !var9.isEmpty()
         ? var9.stream().map(var2x -> this.id_class(var2x.id_class(), (rfH_2)var2.get(var2x), true)).min(Comparator.comparingInt(rLC::id_throws))
         : var6.stream()
            .map(var2x -> this.id_class(var2x.id_class(), (rfH_2)var2.get(var2x), false))
            .min(Comparator.comparingDouble(rLC::id_final).thenComparingInt(rLC::id_throws));
      return !var17.isPresent() ? null : (rLC)var17.get();
   }

   private float id_class(rLq_1 var1, Set<rLv_1> var2) {
      float var3 = Float.MAX_VALUE;

      for (rLv_1 var5 : var2) {
         float var6 = var1.id_class(var5);
         var5.id_class(var6, var1);
         var3 = Math.min(var6, var3);
      }

      return var3;
   }
}
