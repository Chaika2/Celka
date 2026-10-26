package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYK extends rYY {
   public static final Codec<rYK> throws_ = RecordCodecBuilder.create(
      var0 -> var0.group(rVn_1.class_(rVL.n).forGetter(var0x -> var0x.catch_), Codec.LONG.fieldOf("seed").stable().forGetter(var0x -> var0x.private_))
            .apply(var0, var0.stable(rYK::new))
   );
   private final rKI case_;
   private final rVL<rYG> catch_;
   private final long private_;
   private final rYG implements_;
   private final rYG finally_;
   private final rYG extends_;
   private final rYG native_;
   private final rYG volatile_;

   public rYK(rVL<rYG> var1, long var2) {
      this(
         var1, var2, var1.byte_(rYl_1.finally_), var1.byte_(rYl_1.transient_), var1.byte_(rYl_1.boolean_), var1.byte_(rYl_1.strictfp_), var1.byte_(rYl_1.for_)
      );
   }

   private rYK(rVL<rYG> var1, long var2, rYG var4, rYG var5, rYG var6, rYG var7, rYG var8) {
      super(ImmutableList.of(var4, var5, var6, var7, var8));
      this.catch_ = var1;
      this.private_ = var2;
      this.implements_ = var4;
      this.finally_ = var5;
      this.extends_ = var6;
      this.native_ = var7;
      this.volatile_ = var8;
      rqm_3 var9 = new rqm_3(var2);
      var9.class_(17292);
      this.case_ = new rKI(var9);
   }

   public static float class_(rKI var0, int var1, int var2) {
      int var3 = var1 / 2;
      int var4 = var2 / 2;
      int var5 = var1 % 2;
      int var6 = var2 % 2;
      float var7 = 100.0F - rfU_2.byte_((float)(var1 * var1 + var2 * var2)) * 8.0F;
      var7 = rfU_2.class_(var7, -100.0F, 80.0F);

      for (int var8 = -12; var8 <= 12; var8++) {
         for (int var9 = -12; var9 <= 12; var9++) {
            long var10 = (long)(var3 + var8);
            long var12 = (long)(var4 + var9);
            if (var10 * var10 + var12 * var12 > 4096L && var0.class_((double)var10, (double)var12) < -0.9F) {
               float var14 = (rfU_2.throws_((float)var10) * 3439.0F + rfU_2.throws_((float)var12) * 147.0F) % 13.0F + 9.0F;
               float var15 = (float)(var5 - var8 * 2);
               float var16 = (float)(var6 - var9 * 2);
               float var17 = 100.0F - rfU_2.byte_(var15 * var15 + var16 * var16) * var14;
               var17 = rfU_2.class_(var17, -100.0F, 80.0F);
               var7 = Math.max(var7, var17);
            }
         }
      }

      return var7;
   }

   @Override
   public rYY class_(long var1) {
      return new rYK(this.catch_, var1, this.implements_, this.finally_, this.extends_, this.native_, this.volatile_);
   }

   @Override
   protected Codec<? extends rYY> class_() {
      return throws_;
   }

   public boolean break_(long var1) {
      return this.private_ == var1;
   }

   @Override
   public rYG protected_(int var1, int var2, int var3) {
      int var4 = var1 >> 2;
      int var5 = var3 >> 2;
      if ((long)var4 * (long)var4 + (long)var5 * (long)var5 <= 4096L) {
         return this.implements_;
      } else {
         float var6 = class_(this.case_, var4 * 2 + 1, var5 * 2 + 1);
         if (var6 > 40.0F) {
            return this.finally_;
         } else if (var6 >= 0.0F) {
            return this.extends_;
         } else {
            return var6 < -20.0F ? this.native_ : this.volatile_;
         }
      }
   }
}
