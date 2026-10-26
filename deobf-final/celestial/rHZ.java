package celestial;

public class rHZ extends ryO_2 {
   private boolean class_;
   private boolean break_;
   private boolean byte_;
   private boolean protected_;
   private final rHm_1 throws_ = new rHv_1(this);

   public void byte_(boolean var1) {
      this.protected_ = var1;
   }

   @Override
   public void int_() {
      this.float_();
      super.int_();
   }

   public rHZ() {
      super(ryW_2.synchronized_);
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.throws_.break_(var2);
      this.class_ = var2.new_("powered");
      this.byte_ = var2.new_("conditionMet");
      this.break_(var2.new_("auto"));
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      this.throws_.class_(var1);
      var1.class_("powered", this.catch_());
      var1.class_("conditionMet", this.extends_());
      var1.class_("auto", this.private_());
      return var1;
   }

   public void class_(boolean var1) {
      this.class_ = var1;
   }

   public void break_(boolean var1) {
      boolean var2 = this.break_;
      this.break_ = var1;
      if (!var2 && var1 && !this.class_ && this.extends_ != null && this.final_() != rHF.SEQUENCE) {
         this.new_();
      }
   }

   public rHm_1 throws_() {
      return this.throws_;
   }

   public void finally_() {
      rHF var1 = this.final_();
      if (var1 == rHF.AUTO && (this.class_ || this.break_) && this.extends_ != null) {
         this.new_();
      }
   }

   public boolean catch_() {
      return this.class_;
   }

   public boolean extends_() {
      return this.byte_;
   }

   private void new_() {
      xd_3 var1 = this.abstract_().break_();
      if (var1 instanceof xK_2) {
         this.native_();
         this.extends_.finally_().class_(this.native_, var1, 1);
      }
   }

   public boolean package_() {
      xc_3 var1 = this.extends_.byte_(this.char_());
      return var1.break_() instanceof xK_2 ? var1.byte_(xK_2.final_) : false;
   }

   public boolean private_() {
      return this.break_;
   }

   public rHF final_() {
      xc_3 var1 = this.abstract_();
      if (var1.class_(xu_3.SZ)) {
         return rHF.REDSTONE;
      } else if (var1.class_(xu_3.bI)) {
         return rHF.AUTO;
      } else {
         return var1.class_(xu_3.bf) ? rHF.SEQUENCE : rHF.REDSTONE;
      }
   }

   public boolean volatile_() {
      return this.protected_;
   }

   public boolean native_() {
      this.byte_ = true;
      if (this.package_()) {
         rfH_2 var1 = this.native_.break_(this.extends_.byte_(this.native_).byte_(xK_2.volatile_).case_());
         if (this.extends_.byte_(var1).break_() instanceof xK_2) {
            ryO_2 var2 = this.extends_.class_(var1);
            this.byte_ = var2 instanceof rHZ && ((rHZ)var2).throws_().case_() > 0;
         } else {
            this.byte_ = false;
         }
      }

      return this.byte_;
   }

   @Override
   public boolean ac_() {
      return true;
   }

   @Override
   public rFy_1 Y_() {
      if (this.volatile_()) {
         this.byte_(false);
         rcd_3 var1 = this.class_(new rcd_3());
         return new rFy_1(this.native_, 2, var1);
      } else {
         return null;
      }
   }
}
