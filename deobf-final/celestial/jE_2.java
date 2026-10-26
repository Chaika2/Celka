package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class jE_2<T extends rHp_1> extends jW_2<T> {
   public static final rqO_2 class_ = new rqO_2("textures/environment/end_sky.png");
   public static final rqO_2 break_ = new rqO_2("textures/entity/end_portal.png");
   private static final Random byte_ = new Random(31100L);
   private static final List<HU> protected_ = IntStream.range(0, 16).mapToObj(var0 -> HU.class_(var0 + 1)).collect(ImmutableList.toImmutableList());

   public jE_2(jz_3 var1) {
      super(var1);
   }

   protected float class_() {
      return 0.75F;
   }

   protected int class_(double var1) {
      if (var1 > 36864.0) {
         return 1;
      } else if (var1 > 25600.0) {
         return 3;
      } else if (var1 > 16384.0) {
         return 5;
      } else if (var1 > 9216.0) {
         return 7;
      } else if (var1 > 4096.0) {
         return 9;
      } else if (var1 > 1024.0) {
         return 11;
      } else if (var1 > 576.0) {
         return 13;
      } else {
         return var1 > 256.0 ? 14 : 15;
      }
   }

   public void class_(T var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      if (!rrbb_3.rs() || !rrdL.class_(var1, var2, this.class_(), var3, var4, var5, var6)) {
         byte_.setSeed(31100L);
         double var7 = var1.char_().class_(this.catch_.throws_.break_(), true);
         int var9 = this.class_(var7);
         float var10 = this.class_();
         rjV_2 var11 = var3.byte_().class_();
         this.class_((T)var1, var10, 0.15F, var11, var4.getBuffer(protected_.get(0)));
         if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAe_1.class_()).byte_()) {
            for (int var12 = 1; var12 < var9; var12++) {
               this.class_((T)var1, var10, 2.0F / (float)(18 - var12), var11, var4.getBuffer(protected_.get(var12)));
            }
         }
      }
   }

   private void class_(
      T var1,
      rjV_2 var2,
      Ok_1 var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      rpr_3 var15
   ) {
      if (var1.class_(var15)) {
         var3.class_(var2, var4, var6, var8).class_(var12, var13, var14, 1.0F).class_();
         var3.class_(var2, var5, var6, var9).class_(var12, var13, var14, 1.0F).class_();
         var3.class_(var2, var5, var7, var10).class_(var12, var13, var14, 1.0F).class_();
         var3.class_(var2, var4, var7, var11).class_(var12, var13, var14, 1.0F).class_();
      }
   }

   private void class_(T var1, float var2, float var3, rjV_2 var4, Ok_1 var5) {
      float var6 = (byte_.nextFloat() * 0.5F + 0.1F) * var3;
      float var7 = (byte_.nextFloat() * 0.5F + 0.4F) * var3;
      float var8 = (byte_.nextFloat() * 0.5F + 0.5F) * var3;
      this.class_((T)var1, var4, var5, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, var6, var7, var8, rpr_3.SOUTH);
      this.class_((T)var1, var4, var5, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, var6, var7, var8, rpr_3.NORTH);
      this.class_((T)var1, var4, var5, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, var6, var7, var8, rpr_3.EAST);
      this.class_((T)var1, var4, var5, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, var6, var7, var8, rpr_3.WEST);
      this.class_((T)var1, var4, var5, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6, var7, var8, rpr_3.DOWN);
      this.class_((T)var1, var4, var5, 0.0F, 1.0F, var2, var2, 1.0F, 1.0F, 0.0F, 0.0F, var6, var7, var8, rpr_3.UP);
   }
}
