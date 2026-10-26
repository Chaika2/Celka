package celestial;

public class qL_2 extends qc_3<rGB, wb_3<rGB>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/phantom.png");

   public qL_2(pg_3 var1) {
      super(var1, new wb_3<>(), 0.75F);
      this.class_(new To_1<>(this));
   }

   public rqO_2 class_(rGB var1) {
      return class_;
   }

   protected void class_(rGB var1, Ml_1 var2, float var3, float var4, float var5) {
      super.class_(var1, var2, var3, var4, var5);
      var2.class_(rje_3.break_.byte_((Float)var1.throws_[16]));
   }

   protected void class_(rGB var1, Ml_1 var2, float var3) {
      int var4 = var1.throws_();
      float var5 = 1.0F + 0.15F * (float)var4;
      var2.class_(var5, var5, var5);
      var2.class_(0.0, 1.3125, 0.1875);
   }
}
