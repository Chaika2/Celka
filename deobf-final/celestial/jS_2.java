package celestial;

public class jS_2 extends jW_2<rHH> {
   public static final Ig_1 class_ = new Ig_1(fJ_2.class_, new rqO_2("entity/enchanting_table_book"));
   private final tm_3 break_ = new tm_3();

   public jS_2(jz_3 var1) {
      super(var1);
   }

   public void class_(rHH var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      var3.class_();
      var3.class_(0.5, 0.75, 0.5);
      float var7 = (float)var1.class_ + var2;
      var3.class_(0.0, (double)(0.1F + rfU_2.class_(var7 * 0.1F) * 0.01F), 0.0);
      float var8 = var1.private_ - var1.implements_;

      while (var8 >= (float) Math.PI) {
         var8 -= (float) (Math.PI * 2);
      }

      while (var8 < (float) -Math.PI) {
         var8 += (float) (Math.PI * 2);
      }

      float var9 = var1.implements_ + var8 * var2;
      var3.class_(rje_3.protected_.break_(-var9));
      var3.class_(rje_3.case_.byte_(80.0F));
      float var10 = rfU_2.catch_(var2, var1.byte_, var1.break_);
      float var11 = rfU_2.private_(var10 + 0.25F) * 1.6F - 0.3F;
      float var12 = rfU_2.private_(var10 + 0.75F) * 1.6F - 0.3F;
      float var13 = rfU_2.catch_(var2, var1.catch_, var1.case_);
      this.break_.class_(var7, rfU_2.class_(var11, 0.0F, 1.0F), rfU_2.class_(var12, 0.0F, 1.0F), var13);
      Ok_1 var14 = class_.class_(var4, HU::break_);
      this.break_.break_(var3, var14, var5, var6, 1.0F, 1.0F, 1.0F, 1.0F);
      var3.break_();
   }
}
