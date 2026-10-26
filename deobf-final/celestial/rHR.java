package celestial;

public class rHR extends ryO_2 implements rJZ, rXc_1 {
   private final rXu_1 class_ = new rHY(this);
   private final rpF_2 break_ = new rHo_1(this);
   rdn_3 byte_ = rdn_3.break_;
   int protected_;
   private int throws_;

   public rHR() {
      super(ryW_2.throw_);
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      if (var2.byte_("Book", 10)) {
         this.byte_ = this.break_(rdn_3.class_(var2.int_("Book")), (rhd_3)null);
      } else {
         this.byte_ = rdn_3.break_;
      }

      this.throws_ = rkZ_2.catch_(this.byte_);
      this.protected_ = rfU_2.class_(var2.private_("Page"), 0, this.throws_ - 1);
   }

   public void class_(rdn_3 var1, rhd_3 var2) {
      this.byte_ = this.break_(var1, var2);
      this.protected_ = 0;
      this.throws_ = rkZ_2.catch_(this.byte_);
      this.break_();
   }

   void class_(int var1) {
      int var2 = rfU_2.class_(var1, 0, this.throws_ - 1);
      if (var2 != this.protected_) {
         this.protected_ = var2;
         this.break_();
         kv_3.class_(this.while_(), this.char_(), this.abstract_());
      }
   }

   private gy_3 class_(rhd_3 var1) {
      String var2;
      Object var3;
      if (var1 == null) {
         var2 = "Lectern";
         var3 = new rgN_2("Lectern");
      } else {
         var2 = var1.g().getString();
         var3 = var1.L_();
      }

      rjU_2 var4 = rjU_2.class_((rja_3)this.native_);
      return new gy_3(gV_2.byte_, var4, rjK_2.class_, (rrEm_1)this.extends_, 2, var2, (rgP_2)var3, this.extends_.const_(), var1);
   }

   public void class_(rdn_3 var1) {
      this.class_(var1, (rhd_3)null);
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      if (!this.throws_().class_()) {
         var1.class_("Book", this.throws_().break_(new rcd_3()));
         var1.break_("Page", this.protected_);
      }

      return var1;
   }

   private rdn_3 break_(rdn_3 var1, rhd_3 var2) {
      if (this.extends_ instanceof rrEm_1 && var1.break_() == rdy_3.dr) {
         rkZ_2.class_(var1, this.class_(var2), var2);
      }

      return var1;
   }

   public rdn_3 throws_() {
      return this.byte_;
   }

   public int finally_() {
      float var1 = this.throws_ > 1 ? (float)this.private_() / ((float)this.throws_ - 1.0F) : 1.0F;
      return rfU_2.protected_(var1 * 14.0F) + (this.catch_() ? 1 : 0);
   }

   public boolean catch_() {
      rdb_3 var1 = this.byte_.break_();
      return var1 == rdy_3.xi || var1 == rdy_3.dr;
   }

   void extends_() {
      this.protected_ = 0;
      this.throws_ = 0;
      kv_3.class_(this.while_(), this.char_(), this.abstract_(), false);
   }

   @Override
   public void public_() {
      this.class_(rdn_3.break_);
   }

   public int private_() {
      return this.protected_;
   }

   @Override
   public boolean ac_() {
      return true;
   }

   @Override
   public rgP_2 L_() {
      return new rgn_3("container.lectern");
   }

   @Override
   public rJr_1 createMenu(int var1, rhz_3 var2, rhd_3 var3) {
      return new rJv_1(var1, this.class_, this.break_);
   }
}
