package celestial;

public class qa_3 extends pV_2<rsX_2> {
   public qa_3(pg_3 var1) {
      super(var1);
      this.id_byte = 0.5F;
   }

   public rqO_2 id_class(rsX_2 var1) {
      return fJ_2.id_class;
   }

   public void id_class(rsX_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.id_class();
      var4.id_class(0.0, 0.5, 0.0);
      if ((float)var1.id_case() - var3 + 1.0F < 10.0F) {
         float var7 = 1.0F - ((float)var1.id_case() - var3 + 1.0F) / 10.0F;
         var7 = rfU_2.id_class(var7, 0.0F, 1.0F);
         var7 *= var7;
         var7 *= var7;
         float var8 = 1.0F + var7 * 0.3F;
         var4.id_class(var8, var8, var8);
      }

      var4.id_class(rje_3.id_protected.id_byte(-90.0F));
      var4.id_class(-0.5, -0.5, 0.5);
      var4.id_class(rje_3.id_protected.id_byte(90.0F));
      qe_3.id_class(xu_3.rf.id_continue(), var4, var5, var6, var1.id_case() / 5 % 2 == 0);
      var4.id_break();
      super.id_class(var1, var2, var3, var4, var5, var6);
   }
}
