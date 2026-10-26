package celestial;

public class rJp_1 extends rJr_1 {
   private final rsA_2 class_;
   private final rXl_1 break_;
   private int byte_;
   private boolean protected_;
   private boolean catch_;

   public int byte_() {
      return this.byte_;
   }

   public rJp_1(int var1, rhz_3 var2) {
      this(var1, var2, new ib_3(var2.throws_));
   }

   public rJp_1(int var1, rhz_3 var2, rsA_2 var3) {
      super(rJP.super_, var1);
      this.class_ = var3;
      this.break_ = new rXl_1(var3);
      this.break_(new rJY(this.break_, 0, 136, 37));
      this.break_(new rJY(this.break_, 1, 162, 37));
      this.break_(new rJq_1(var2.throws_, var3, this.break_, 2, 220, 37));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            this.break_(new rJY(var2, var5 + var4 * 9 + 9, 108 + var5 * 18, 84 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.break_(new rJY(var2, var6, 108 + var6 * 18, 142));
      }
   }

   public int class_() {
      return this.class_.protected_();
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         var3 = var5.implements_();
         if (var2 == 2) {
            if (!this.class_(var5, 3, 39, true)) {
               return rdn_3.break_;
            }

            var4.class_(var5, var3);
            this.catch_();
         } else if (var2 != 0 && var2 != 1) {
            if (var2 >= 3 && var2 < 30) {
               if (!this.class_(var5, 30, 39, false)) {
                  return rdn_3.break_;
               }
            } else if (var2 >= 30 && var2 < 39 && !this.class_(var5, 3, 30, false)) {
               return rdn_3.break_;
            }
         } else if (!this.class_(var5, 3, 39, false)) {
            return rdn_3.break_;
         }

         if (var5.class_()) {
            var4.break_(rdn_3.break_);
         } else {
            var4.byte_();
         }

         if (var5.char_() == var3.char_()) {
            return rdn_3.break_;
         }

         var4.class_(var1, var5);
      }

      return var3;
   }

   @Override
   public boolean class_(rdn_3 var1, rJY var2) {
      return false;
   }

   public void class_(boolean var1) {
      this.protected_ = var1;
   }

   @Override
   public void class_(rXu_1 var1) {
      this.break_.byte_();
      super.class_(var1);
   }

   public void class_(rdf_3 var1) {
      this.class_.class_(var1);
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return this.class_.class_() == var1;
   }

   private void break_(int var1, rdn_3 var2) {
      if (!var2.class_()) {
         for (int var3 = 3; var3 < 39; var3++) {
            rdn_3 var4 = this.throws_.get(var3).class_();
            if (!var4.class_() && this.break_(var2, var4)) {
               rdn_3 var5 = this.break_.extends_(var1);
               int var6 = var5.class_() ? 0 : var5.char_();
               int var7 = Math.min(var2.byte_() - var6, var4.char_());
               rdn_3 var8 = var4.implements_();
               int var9 = var6 + var7;
               var4.catch_(var7);
               var8.throws_(var9);
               this.break_.break_(var1, var8);
               if (var9 >= var2.byte_()) {
                  break;
               }
            }
         }
      }
   }

   private boolean break_(rdn_3 var1, rdn_3 var2) {
      return var1.break_() == var2.break_() && rdn_3.class_(var1, var2);
   }

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      this.class_.class_((rhd_3)null);
      if (!this.class_.byte_().continue_) {
         if (!var1.BM() || var1 instanceof rhN_2 && ((rhN_2)var1).int_()) {
            rdn_3 var2 = this.break_.native_(0);
            if (!var2.class_()) {
               var1.class_(var2, false);
            }

            var2 = this.break_.native_(1);
            if (!var2.class_()) {
               var1.class_(var2, false);
            }
         } else {
            ((rhz_3)var1.implements_[1]).class_((rYB)var1.throws_[7], this.break_.native_(0));
            ((rhz_3)var1.implements_[1]).class_((rYB)var1.throws_[7], this.break_.native_(1));
         }
      }
   }

   public int break_() {
      return this.break_.throws_();
   }

   public void break_(boolean var1) {
      this.catch_ = var1;
   }

   public rdf_3 throws_() {
      return this.class_.break_();
   }

   public void throws_(int var1) {
      this.class_.class_(var1);
   }

   public void catch_(int var1) {
      if (this.throws_().size() > var1) {
         rdn_3 var2 = this.break_.extends_(0);
         if (!var2.class_()) {
            if (!this.class_(var2, 3, 39, true)) {
               return;
            }

            this.break_.break_(0, var2);
         }

         rdn_3 var3 = this.break_.extends_(1);
         if (!var3.class_()) {
            if (!this.class_(var3, 3, 39, true)) {
               return;
            }

            this.break_.break_(1, var3);
         }

         if (this.break_.extends_(0).class_() && this.break_.extends_(1).class_()) {
            rdn_3 var4 = this.throws_().get(var1).break_();
            this.break_(0, var4);
            rdn_3 var5 = this.throws_().get(var1).byte_();
            this.break_(1, var5);
         }
      }
   }

   private void catch_() {
      if (!this.class_.byte_().continue_) {
         an_3 var1 = (an_3)this.class_;
         this.class_.byte_().class_(var1.rx(), var1.re(), var1.BO(), this.class_.case_(), rqL_2.NEUTRAL, 1.0F, 1.0F, false);
      }
   }

   public void case_(int var1) {
      this.byte_ = var1;
   }

   public boolean case_() {
      return this.protected_;
   }

   public void protected_(int var1) {
      this.break_.class_(var1);
   }

   public boolean protected_() {
      return this.catch_;
   }
}
