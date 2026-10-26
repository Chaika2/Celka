package celestial;

public interface aY_2 extends aa_3 {
   default void id_class(iB_2 var1, iB_2 var2, rhf_3 var3, float var4, float var5) {
      double var6 = var2.rx() - var1.rx();
      double var8 = var2.BO() - var1.BO();
      double var10 = (double)rfU_2.id_class(var6 * var6 + var8 * var8);
      double var12 = var2.id_byte(0.3333333333333333) - var3.re() + var10 * 0.2F;
      rje_3 var14 = this.id_class(var1, new rjU_2(var6, var12, var8), var4);
      var3.id_byte(
         (double)var14.id_class(), (double)var14.id_break(), (double)var14.id_byte(), var5, (float)(14 - ((rYB)var1.id_throws[7]).id_abstract().id_class() * 4)
      );
      var1.id_class(rqn_3.PH, 1.0F, 1.0F / (var1.Sa().nextFloat() * 0.4F + 0.8F));
   }

   default void id_class(iB_2 var1, float var2) {
      rpm_3 var3 = rhj_3.id_class(var1, rdy_3.kU);
      rdn_3 var4 = var1.id_protected(var3);
      if (var1.id_class(rdy_3.kU)) {
         rxm_3.id_class((rYB)var1.id_throws[7], var1, var3, var4, var2, (float)(14 - ((rYB)var1.id_throws[7]).id_abstract().id_class() * 4));
      }

      this.id_class();
   }

   default rje_3 id_class(iB_2 var1, rjU_2 var2, float var3) {
      rjU_2 var4 = var2.id_protected();
      rjU_2 var5 = var4.id_byte(new rjU_2(0.0, 1.0, 0.0));
      if (var5.id_catch() <= 1.0E-7) {
         var5 = var4.id_byte(var1.id_continue(1.0F));
      }

      rjY_2 var6 = new rjY_2(new rje_3(var5), 90.0F, true);
      rje_3 var7 = new rje_3(var4);
      var7.id_class(var6);
      rjY_2 var8 = new rjY_2(var7, var3, true);
      rje_3 var9 = new rje_3(var4);
      var9.id_class(var8);
      return var9;
   }

   void id_class();

   void id_class(iB_2 var1, rdn_3 var2, rhf_3 var3, float var4);

   void id_break(boolean var1);

   iB_2 I_();
}
