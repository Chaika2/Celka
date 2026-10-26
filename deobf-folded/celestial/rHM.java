package celestial;

public class rHM extends rHK {
   private rqs_3<rdn_3> id_class = rqs_3.id_class(27, rdn_3.id_break);
   private int id_break;

   private rHM(ryW_2<?> var1) {
      super(var1);
   }

   public rHM() {
      this(ryW_2.id_while);
   }

   private void id_class(xc_3 var1, rqA_2 var2) {
      rja_3 var3 = var1.id_byte(xs_3.id_volatile).id_int();
      double var4 = (double)this.id_native.b_() + 0.5 + (double)var3.b_() / 2.0;
      double var6 = (double)this.id_native.c_() + 0.5 + (double)var3.c_() / 2.0;
      double var8 = (double)this.id_native.d_() + 0.5 + (double)var3.d_() / 2.0;
      this.id_extends.id_class((rhd_3)null, var4, var6, var8, var2, rqL_2.BLOCKS, 0.5F, this.id_extends.id_int.nextFloat() * 0.1F + 0.9F);
   }

   @Override
   protected void id_class(rqs_3<rdn_3> var1) {
      this.id_class = var1;
   }

   @Override
   protected rJr_1 id_class(int var1, rhz_3 var2) {
      return rXe_1.id_class(var1, var2, this);
   }

   private void id_class(xc_3 var1, boolean var2) {
      this.id_extends.id_class(this.id_char(), var1.id_class(xs_3.id_final, Boolean.valueOf(var2)), 3);
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_class = rqs_3.id_class(this.id_else(), rdn_3.id_break);
      if (!this.id_break(var2)) {
         rXC.id_break(var2, this.id_class);
      }
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      if (!this.id_byte(var1)) {
         rXC.id_class(var1, this.id_class);
      }

      return var1;
   }

   @Override
   public void id_break(rhd_3 var1) {
      if (!var1.id_native()) {
         this.id_break--;
      }
   }

   public void id_catch() {
      int var1 = this.id_native.b_();
      int var2 = this.id_native.c_();
      int var3 = this.id_native.d_();
      this.id_break = rHu_1.id_class(this.id_extends, this, var1, var2, var3);
      if (this.id_break > 0) {
         this.id_private();
      } else {
         xc_3 var4 = this.id_abstract();
         if (!var4.id_class(xu_3.ha)) {
            this.aa_();
            return;
         }

         boolean var5 = var4.id_byte(xs_3.id_final);
         if (var5) {
            this.id_class(var4, rqn_3.d);
            this.id_class(var4, false);
         }
      }
   }

   @Override
   public int id_else() {
      return 27;
   }

   private void id_private() {
      this.id_extends.id_finally().id_class(this.id_char(), this.id_abstract().id_break(), 5);
   }

   @Override
   protected rqs_3<rdn_3> ad_() {
      return this.id_class;
   }

   @Override
   public void b_(rhd_3 var1) {
      if (!var1.id_native()) {
         if (this.id_break < 0) {
            this.id_break = 0;
         }

         this.id_break++;
         xc_3 var2 = this.id_abstract();
         boolean var3 = var2.id_byte(xs_3.id_final);
         if (!var3) {
            this.id_class(var2, rqn_3.k);
            this.id_class(var2, true);
         }

         this.id_private();
      }
   }

   @Override
   protected rgP_2 X_() {
      return new rgn_3("container.barrel");
   }
}
