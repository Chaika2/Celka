package celestial;

public class rHM extends rHK {
   private rqs_3<rdn_3> class_ = rqs_3.class_(27, rdn_3.break_);
   private int break_;

   private rHM(ryW_2<?> var1) {
      super(var1);
   }

   public rHM() {
      this(ryW_2.while_);
   }

   private void class_(xc_3 var1, rqA_2 var2) {
      rja_3 var3 = var1.byte_(xs_3.volatile_).int_();
      double var4 = (double)this.native_.b_() + 0.5 + (double)var3.b_() / 2.0;
      double var6 = (double)this.native_.c_() + 0.5 + (double)var3.c_() / 2.0;
      double var8 = (double)this.native_.d_() + 0.5 + (double)var3.d_() / 2.0;
      this.extends_.class_((rhd_3)null, var4, var6, var8, var2, rqL_2.BLOCKS, 0.5F, this.extends_.int_.nextFloat() * 0.1F + 0.9F);
   }

   @Override
   protected void class_(rqs_3<rdn_3> var1) {
      this.class_ = var1;
   }

   @Override
   protected rJr_1 class_(int var1, rhz_3 var2) {
      return rXe_1.class_(var1, var2, this);
   }

   private void class_(xc_3 var1, boolean var2) {
      this.extends_.class_(this.char_(), var1.class_(xs_3.final_, Boolean.valueOf(var2)), 3);
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.class_ = rqs_3.class_(this.else_(), rdn_3.break_);
      if (!this.break_(var2)) {
         rXC.break_(var2, this.class_);
      }
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      if (!this.byte_(var1)) {
         rXC.class_(var1, this.class_);
      }

      return var1;
   }

   @Override
   public void break_(rhd_3 var1) {
      if (!var1.native_()) {
         this.break_--;
      }
   }

   public void catch_() {
      int var1 = this.native_.b_();
      int var2 = this.native_.c_();
      int var3 = this.native_.d_();
      this.break_ = rHu_1.class_(this.extends_, this, var1, var2, var3);
      if (this.break_ > 0) {
         this.private_();
      } else {
         xc_3 var4 = this.abstract_();
         if (!var4.class_(xu_3.ha)) {
            this.aa_();
            return;
         }

         boolean var5 = var4.byte_(xs_3.final_);
         if (var5) {
            this.class_(var4, rqn_3.d);
            this.class_(var4, false);
         }
      }
   }

   @Override
   public int else_() {
      return 27;
   }

   private void private_() {
      this.extends_.finally_().class_(this.char_(), this.abstract_().break_(), 5);
   }

   @Override
   protected rqs_3<rdn_3> ad_() {
      return this.class_;
   }

   @Override
   public void b_(rhd_3 var1) {
      if (!var1.native_()) {
         if (this.break_ < 0) {
            this.break_ = 0;
         }

         this.break_++;
         xc_3 var2 = this.abstract_();
         boolean var3 = var2.byte_(xs_3.final_);
         if (!var3) {
            this.class_(var2, rqn_3.k);
            this.class_(var2, true);
         }

         this.private_();
      }
   }

   @Override
   protected rgP_2 X_() {
      return new rgn_3("container.barrel");
   }
}
