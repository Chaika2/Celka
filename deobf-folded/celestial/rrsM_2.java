package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import java.util.Comparator;
import java.util.Random;

public abstract class rrsM_2 extends rrsE_2<rrsG_2> {
   private long id_class;
   private ImmutableMap<xc_3, rKt_1> id_break = ImmutableMap.of();
   private ImmutableMap<xc_3, rKt_1> id_byte = ImmutableMap.of();
   private rKt_1 id_protected;

   protected abstract xc_3 id_byte();

   public rrsM_2(Codec<rrsG_2> var1) {
      super(var1);
   }

   protected abstract ImmutableList<xc_3> id_class();

   public void id_class(
      Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, rrsG_2 var14
   ) {
      int var15 = var11 + 1;
      int var16 = var4 & 15;
      int var17 = var5 & 15;
      int var18 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      int var19 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      double var20 = 0.03125;
      boolean var22 = this.id_protected.id_class((double)var4 * 0.03125, 109.0, (double)var5 * 0.03125) * 75.0 + var1.nextDouble() > 0.0;
      xc_3 var23 = (xc_3)this.id_byte
         .entrySet()
         .stream()
         .max(Comparator.comparing(var3x -> ((rKt_1)var3x.getValue()).id_class((double)var4, (double)var11, (double)var5)))
         .get()
         .getKey();
      xc_3 var24 = (xc_3)this.id_break
         .entrySet()
         .stream()
         .max(Comparator.comparing(var3x -> ((rKt_1)var3x.getValue()).id_class((double)var4, (double)var11, (double)var5)))
         .get()
         .getKey();
      rfw_3 var25 = new rfw_3();
      xc_3 var26 = var2.id_byte(var25.id_class(var16, 128, var17));

      for (int var27 = 127; var27 >= 0; var27--) {
         var25.id_class(var16, var27, var17);
         xc_3 var28 = var2.id_byte(var25);
         if (var26.id_class(var9.id_break()) && (var28.id_catch() || var28 == var10)) {
            for (int var29 = 0; var29 < var18; var29++) {
               var25.id_class(rpr_3.UP);
               if (!var2.id_byte(var25).id_class(var9.id_break())) {
                  break;
               }

               var2.id_class(var25, var23, false);
            }

            var25.id_class(var16, var27, var17);
         }

         if ((var26.id_catch() || var26 == var10) && var28.id_class(var9.id_break())) {
            for (int var30 = 0; var30 < var19 && var2.id_byte(var25).id_class(var9.id_break()); var30++) {
               if (var22 && var27 >= var15 - 4 && var27 <= var15 + 1) {
                  var2.id_class(var25, this.id_byte(), false);
               } else {
                  var2.id_class(var25, var24, false);
               }

               var25.id_class(rpr_3.DOWN);
            }
         }

         var26 = var28;
      }
   }

   private static ImmutableMap<xc_3, rKt_1> id_class(ImmutableList<xc_3> var0, long var1) {
      Builder var3 = new Builder();
      UnmodifiableIterator var4 = var0.iterator();

      while (var4.hasNext()) {
         xc_3 var5 = (xc_3)var4.next();
         var3.put(var5, new rKt_1(new rqm_3(var1), ImmutableList.of(-4)));
         var1++;
      }

      return var3.build();
   }

   @Override
   public void id_class(long var1) {
      if (this.id_class != var1 || this.id_protected == null || this.id_break.isEmpty() || this.id_byte.isEmpty()) {
         this.id_break = id_class(this.id_class(), var1);
         this.id_byte = id_class(this.id_break(), var1 + (long)this.id_break.size());
         this.id_protected = new rKt_1(new rqm_3(var1 + (long)this.id_break.size() + (long)this.id_byte.size()), ImmutableList.of(0));
      }

      this.id_class = var1;
   }

   protected abstract ImmutableList<xc_3> id_break();
}
