package celestial;

public class qa_3 extends pV_2<rsX_2> {
   public qa_3(pg_3 var1) {
      super(var1);
      this.byte_ = 0.5F;
   }

   public rqO_2 class_(rsX_2 var1) {
      return fJ_2.class_;
   }

   public void class_(rsX_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.class_();
      var4.class_(0.0, 0.5, 0.0);
      if ((float)var1.case_() - var3 + 1.0F < 10.0F) {
         float var7 = 1.0F - ((float)var1.case_() - var3 + 1.0F) / 10.0F;
         var7 = rfU_2.class_(var7, 0.0F, 1.0F);
         var7 *= var7;
         var7 *= var7;
         float var8 = 1.0F + var7 * 0.3F;
         var4.class_(var8, var8, var8);
      }

      var4.class_(rje_3.protected_.byte_(-90.0F));
      var4.class_(-0.5, -0.5, 0.5);
      var4.class_(rje_3.protected_.byte_(90.0F));
      qe_3.class_(xu_3.rf.continue_(), var4, var5, var6, var1.case_() / 5 % 2 == 0);
      var4.break_();
      super.class_(var1, var2, var3, var4, var5, var6);
   }
}
