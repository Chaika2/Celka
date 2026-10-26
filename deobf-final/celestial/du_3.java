package celestial;

public class du_3 extends xF_2 {
   public static final rCu_1<rCf_1> volatile_ = rCT.G;

   @Override
   public Jp_1 byte_() {
      return Jp_1.XZ;
   }

   public du_3(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, rCf_1.LOWER));
   }

   @Override
   public void class_(rYB var1, rhd_3 var2, rfH_2 var3, xc_3 var4, ryO_2 var5, rdn_3 var6) {
      super.class_(var1, var2, var3, xu_3.class_.continue_(), var5, var6);
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (!var1.continue_) {
         if (var4.implements_()) {
            break_(var1, var2, var3, var4);
         } else {
            class_(var3, var1, var2, (ryO_2)null, var4, var4.ss());
         }
      }

      super.class_(var1, var2, var3, var4);
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      rCf_1 var7 = var1.byte_(volatile_);
      if (var2.final_() != rpB_2.Y || var7 == rCf_1.LOWER != (var2 == rpr_3.UP) || var3.class_(this) && var3.byte_(volatile_) != var7) {
         return var7 == rCf_1.LOWER && var2 == rpr_3.DOWN && !var1.class_(var4, var5)
            ? xu_3.class_.continue_()
            : super.class_(var1, var2, var3, var4, var5, var6);
      } else {
         return xu_3.class_.continue_();
      }
   }

   @Override
   public long class_(xc_3 var1, rfH_2 var2) {
      return rfU_2.byte_(var2.b_(), var2.catch_(var1.byte_(volatile_) == rCf_1.LOWER ? 0 : 1).c_(), var2.d_());
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      var1.class_(var2.final_(), this.continue_().class_(volatile_, rCf_1.UPPER), 3);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      if (var1.byte_(volatile_) != rCf_1.UPPER) {
         return super.class_(var1, var2, var3);
      } else {
         xc_3 var4 = var2.byte_(var3.break_());
         return var4.class_(this) && var4.byte_(volatile_) == rCf_1.LOWER;
      }
   }

   public void class_(rRg_1 var1, rfH_2 var2, int var3) {
      var1.class_(var2, this.continue_().class_(volatile_, rCf_1.LOWER), var3);
      var1.class_(var2.final_(), this.continue_().class_(volatile_, rCf_1.UPPER), var3);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rfH_2 var2 = var1.class_();
      return var2.c_() < 255 && var1.int_().byte_(var2.final_()).class_(var1) ? super.class_(var1) : null;
   }

   protected static void break_(rYB var0, rfH_2 var1, xc_3 var2, rhd_3 var3) {
      rCf_1 var4 = var2.byte_(volatile_);
      if (var4 == rCf_1.UPPER) {
         rfH_2 var5 = var1.break_();
         xc_3 var6 = var0.byte_(var5);
         if (var6.break_() == var2.break_() && var6.byte_(volatile_) == rCf_1.LOWER) {
            var0.class_(var5, xu_3.class_.continue_(), 35);
            var0.class_(var3, 2001, var5, xd_3.finally_(var6));
         }
      }
   }
}
