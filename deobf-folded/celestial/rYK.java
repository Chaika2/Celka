package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYK extends rYY {
   public static final Codec<rYK> id_throws = RecordCodecBuilder.create(
      var0 -> var0.group(rVn_1.id_class(rVL.n).forGetter(var0x -> var0x.id_catch), Codec.LONG.fieldOf("seed").stable().forGetter(var0x -> var0x.id_private))
            .apply(var0, var0.stable(rYK::new))
   );
   private final rKI id_case;
   private final rVL<rYG> id_catch;
   private final long id_private;
   private final rYG id_implements;
   private final rYG id_finally;
   private final rYG id_extends;
   private final rYG id_native;
   private final rYG id_volatile;

   public rYK(rVL<rYG> var1, long var2) {
      this(
         var1,
         var2,
         var1.id_byte(rYl_1.id_finally),
         var1.id_byte(rYl_1.id_transient),
         var1.id_byte(rYl_1.id_boolean),
         var1.id_byte(rYl_1.id_strictfp),
         var1.id_byte(rYl_1.id_for)
      );
   }

   private rYK(rVL<rYG> var1, long var2, rYG var4, rYG var5, rYG var6, rYG var7, rYG var8) {
      super(ImmutableList.of(var4, var5, var6, var7, var8));
      this.id_catch = var1;
      this.id_private = var2;
      this.id_implements = var4;
      this.id_finally = var5;
      this.id_extends = var6;
      this.id_native = var7;
      this.id_volatile = var8;
      rqm_3 var9 = new rqm_3(var2);
      var9.id_class(17292);
      this.id_case = new rKI(var9);
   }

   public static float id_class(rKI var0, int var1, int var2) {
      int var3 = var1 / 2;
      int var4 = var2 / 2;
      int var5 = var1 % 2;
      int var6 = var2 % 2;
      float var7 = 100.0F - rfU_2.id_byte((float)(var1 * var1 + var2 * var2)) * 8.0F;
      var7 = rfU_2.id_class(var7, -100.0F, 80.0F);

      for (int var8 = -12; var8 <= 12; var8++) {
         for (int var9 = -12; var9 <= 12; var9++) {
            long var10 = (long)(var3 + var8);
            long var12 = (long)(var4 + var9);
            if (var10 * var10 + var12 * var12 > 4096L && var0.id_class((double)var10, (double)var12) < -0.9F) {
               float var14 = (rfU_2.id_throws((float)var10) * 3439.0F + rfU_2.id_throws((float)var12) * 147.0F) % 13.0F + 9.0F;
               float var15 = (float)(var5 - var8 * 2);
               float var16 = (float)(var6 - var9 * 2);
               float var17 = 100.0F - rfU_2.id_byte(var15 * var15 + var16 * var16) * var14;
               var17 = rfU_2.id_class(var17, -100.0F, 80.0F);
               var7 = Math.max(var7, var17);
            }
         }
      }

      return var7;
   }

   @Override
   public rYY id_class(long var1) {
      return new rYK(this.id_catch, var1, this.id_implements, this.id_finally, this.id_extends, this.id_native, this.id_volatile);
   }

   @Override
   protected Codec<? extends rYY> id_class() {
      return id_throws;
   }

   public boolean id_break(long var1) {
      return this.id_private == var1;
   }

   @Override
   public rYG id_protected(int var1, int var2, int var3) {
      int var4 = var1 >> 2;
      int var5 = var3 >> 2;
      if ((long)var4 * (long)var4 + (long)var5 * (long)var5 <= 4096L) {
         return this.id_implements;
      } else {
         float var6 = id_class(this.id_case, var4 * 2 + 1, var5 * 2 + 1);
         if (var6 > 40.0F) {
            return this.id_finally;
         } else if (var6 >= 0.0F) {
            return this.id_extends;
         } else {
            return var6 < -20.0F ? this.id_native : this.id_volatile;
         }
      }
   }
}
