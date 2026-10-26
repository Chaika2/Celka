package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class qv_3 extends qc_3<rMl_1, wS_2<rMl_1>> {
   private static final Map<rMq_1, rqO_2> class_ = rqR_2.class_(Maps.newEnumMap(rMq_1.class), var0 -> {
      var0.put(rMq_1.NORMAL, new rqO_2("textures/entity/panda/panda.png"));
      var0.put(rMq_1.LAZY, new rqO_2("textures/entity/panda/lazy_panda.png"));
      var0.put(rMq_1.WORRIED, new rqO_2("textures/entity/panda/worried_panda.png"));
      var0.put(rMq_1.PLAYFUL, new rqO_2("textures/entity/panda/playful_panda.png"));
      var0.put(rMq_1.BROWN, new rqO_2("textures/entity/panda/brown_panda.png"));
      var0.put(rMq_1.WEAK, new rqO_2("textures/entity/panda/weak_panda.png"));
      var0.put(rMq_1.AGGRESSIVE, new rqO_2("textures/entity/panda/aggressive_panda.png"));
   });

   public qv_3(pg_3 var1) {
      super(var1, new wS_2<>(9, 0.0F), 0.9F);
      this.class_(new TR(this));
   }

   public rqO_2 class_(rMl_1 var1) {
      return class_.getOrDefault(var1.sF(), class_.get(rMq_1.NORMAL));
   }

   private float class_(float var1, float var2, int var3, float var4, float var5) {
      return (float)var3 < var5 ? rfU_2.catch_(var4, var1, var2) : var1;
   }

   protected void class_(rMl_1 var1, Ml_1 var2, float var3, float var4, float var5) {
      super.class_(var1, var2, var3, var4, var5);
      if (var1.super_ > 0) {
         int var6 = var1.super_;
         int var7 = var6 + 1;
         float var8 = 7.0F;
         float var9 = var1.n_() ? 0.3F : 0.8F;
         if (var6 < 8) {
            float var10 = (float)(90 * var6) / 7.0F;
            float var11 = (float)(90 * var7) / 7.0F;
            float var12 = this.class_(var10, var11, var7, var5, 8.0F);
            var2.class_(0.0, (double)((var9 + 0.2F) * (var12 / 90.0F)), 0.0);
            var2.class_(rje_3.break_.byte_(-var12));
         } else if (var6 < 16) {
            float var18 = ((float)var6 - 8.0F) / 7.0F;
            float var21 = 90.0F + 90.0F * var18;
            float var24 = 90.0F + 90.0F * ((float)var7 - 8.0F) / 7.0F;
            float var13 = this.class_(var21, var24, var7, var5, 16.0F);
            var2.class_(0.0, (double)(var9 + 0.2F + (var9 - 0.2F) * (var13 - 90.0F) / 90.0F), 0.0);
            var2.class_(rje_3.break_.byte_(-var13));
         } else if ((float)var6 < 24.0F) {
            float var19 = ((float)var6 - 16.0F) / 7.0F;
            float var22 = 180.0F + 90.0F * var19;
            float var25 = 180.0F + 90.0F * ((float)var7 - 16.0F) / 7.0F;
            float var27 = this.class_(var22, var25, var7, var5, 24.0F);
            var2.class_(0.0, (double)(var9 + var9 * (270.0F - var27) / 90.0F), 0.0);
            var2.class_(rje_3.break_.byte_(-var27));
         } else if (var6 < 32) {
            float var20 = ((float)var6 - 24.0F) / 7.0F;
            float var23 = 270.0F + 90.0F * var20;
            float var26 = 270.0F + 90.0F * ((float)var7 - 24.0F) / 7.0F;
            float var28 = this.class_(var23, var26, var7, var5, 32.0F);
            var2.class_(0.0, (double)(var9 * ((360.0F - var28) / 90.0F)), 0.0);
            var2.class_(rje_3.break_.byte_(-var28));
         }
      }

      float var14 = var1.throw_(var5);
      if (var14 > 0.0F) {
         var2.class_(0.0, (double)(0.8F * var14), 0.0);
         var2.class_(rje_3.break_.byte_(rfU_2.catch_(var14, (Float)var1.throws_[16], (Float)var1.throws_[16] + 90.0F)));
         var2.class_(0.0, (double)(-1.0F * var14), 0.0);
         if (var1.sl()) {
            float var15 = (float)(Math.cos((double)((Integer)var1.throws_[41]).intValue() * 1.25) * Math.PI * 0.05F);
            var2.class_(rje_3.protected_.byte_(var15));
            if (var1.n_()) {
               var2.class_(0.0, 0.8F, 0.55F);
            }
         }
      }

      float var16 = var1.interface_(var5);
      if (var16 > 0.0F) {
         float var17 = var1.n_() ? 0.5F : 1.3F;
         var2.class_(0.0, (double)(var17 * var16), 0.0);
         var2.class_(rje_3.break_.byte_(rfU_2.catch_(var16, (Float)var1.throws_[16], (Float)var1.throws_[16] + 180.0F)));
      }
   }
}
