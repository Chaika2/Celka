package celestial;

public class du_3 extends xF_2 {
   public static final rCu_1<rCf_1> id_volatile = rCT.G;

   @Override
   public Jp_1 id_byte() {
      return Jp_1.XZ;
   }

   public du_3(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rCf_1.LOWER));
   }

   @Override
   public void id_class(rYB var1, rhd_3 var2, rfH_2 var3, xc_3 var4, ryO_2 var5, rdn_3 var6) {
      super.id_class(var1, var2, var3, xu_3.id_class.id_continue(), var5, var6);
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (!var1.id_continue) {
         if (var4.id_implements()) {
            id_break(var1, var2, var3, var4);
         } else {
            id_class(var3, var1, var2, (ryO_2)null, var4, var4.ss());
         }
      }

      super.id_class(var1, var2, var3, var4);
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      rCf_1 var7 = var1.id_byte(id_volatile);
      if (var2.id_final() != rpB_2.Y || var7 == rCf_1.LOWER != (var2 == rpr_3.UP) || var3.id_class(this) && var3.id_byte(id_volatile) != var7) {
         return var7 == rCf_1.LOWER && var2 == rpr_3.DOWN && !var1.id_class(var4, var5)
            ? xu_3.id_class.id_continue()
            : super.id_class(var1, var2, var3, var4, var5, var6);
      } else {
         return xu_3.id_class.id_continue();
      }
   }

   @Override
   public long id_class(xc_3 var1, rfH_2 var2) {
      return rfU_2.id_byte(var2.b_(), var2.id_catch(var1.id_byte(id_volatile) == rCf_1.LOWER ? 0 : 1).c_(), var2.d_());
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      var1.id_class(var2.id_final(), this.id_continue().id_class(id_volatile, rCf_1.UPPER), 3);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      if (var1.id_byte(id_volatile) != rCf_1.UPPER) {
         return super.id_class(var1, var2, var3);
      } else {
         xc_3 var4 = var2.id_byte(var3.id_break());
         return var4.id_class(this) && var4.id_byte(id_volatile) == rCf_1.LOWER;
      }
   }

   public void id_class(rRg_1 var1, rfH_2 var2, int var3) {
      var1.id_class(var2, this.id_continue().id_class(id_volatile, rCf_1.LOWER), var3);
      var1.id_class(var2.id_final(), this.id_continue().id_class(id_volatile, rCf_1.UPPER), var3);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rfH_2 var2 = var1.id_class();
      return var2.c_() < 255 && var1.id_int().id_byte(var2.id_final()).id_class(var1) ? super.id_class(var1) : null;
   }

   protected static void id_break(rYB var0, rfH_2 var1, xc_3 var2, rhd_3 var3) {
      rCf_1 var4 = var2.id_byte(id_volatile);
      if (var4 == rCf_1.UPPER) {
         rfH_2 var5 = var1.id_break();
         xc_3 var6 = var0.id_byte(var5);
         if (var6.id_break() == var2.id_break() && var6.id_byte(id_volatile) == rCf_1.LOWER) {
            var0.id_class(var5, xu_3.id_class.id_continue(), 35);
            var0.id_class(var3, 2001, var5, xd_3.id_finally(var6));
         }
      }
   }
}
