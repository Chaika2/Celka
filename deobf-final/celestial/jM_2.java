package celestial;

public class jM_2 extends jW_2<rHU> {
   public jM_2(jz_3 var1) {
      super(var1);
   }

   public void class_(rHU var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      var3.class_();
      var3.class_(0.5, 0.0, 0.5);
      rrEy_1 var7 = var1.catch_();
      an_3 var8 = var7.protected_();
      if (var8 != null) {
         float var9 = 0.53125F;
         float var10 = Math.max(var8.PN(), var8.Bm());
         if ((double)var10 > 1.0) {
            var9 /= var10;
         }

         var3.class_(0.0, 0.4F, 0.0);
         var3.class_(rje_3.protected_.byte_((float)rfU_2.protected_((double)var2, var7.case_(), var7.throws_()) * 10.0F));
         var3.class_(0.0, -0.2F, 0.0);
         var3.class_(rje_3.break_.byte_(-30.0F));
         var3.class_(var9, var9, var9);
         QY.instanceof_().case_().class_(var8, 0.0, 0.0, 0.0, 0.0F, var2, var3, var4, var5);
      }

      var3.break_();
   }
}
