package celestial;

public class rJS extends rJY {
   private final rXk_1 class_;
   private final rhd_3 break_;
   private int catch_;

   public rJS(rhd_3 var1, rXk_1 var2, rXu_1 var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.break_ = var1;
      this.class_ = var2;
   }

   @Override
   public rdn_3 class_(rhd_3 var1, rdn_3 var2) {
      this.b_(var2);
      rqs_3 var3 = ((rYB)var1.throws_[7]).implements_().byte_(rkj_3.class_, this.class_, (rYB)var1.throws_[7]);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         rdn_3 var5 = this.class_.extends_(var4);
         rdn_3 var6 = (rdn_3)var3.get(var4);
         if (!var5.class_()) {
            this.class_.class_(var4, 1);
            var5 = this.class_.extends_(var4);
         }

         if (!var6.class_()) {
            if (var5.class_()) {
               this.class_.break_(var4, var6);
            } else if (rdn_3.byte_(var5, var6) && rdn_3.class_(var5, var6)) {
               var6.case_(var5.char_());
               this.class_.break_(var4, var6);
            } else if (!((rhz_3)this.break_.implements_[1]).throws_(var6)) {
               this.break_.class_(var6, false);
            }
         }
      }

      return var2;
   }

   @Override
   protected void class_(rdn_3 var1, int var2) {
      this.catch_ += var2;
      this.b_(var1);
   }

   @Override
   public boolean class_(rdn_3 var1) {
      return false;
   }

   @Override
   public rdn_3 class_(int var1) {
      if (this.break_()) {
         this.catch_ = this.catch_ + Math.min(var1, this.class_().char_());
      }

      return super.class_(var1);
   }

   @Override
   protected void break_(int var1) {
      this.catch_ += var1;
   }

   @Override
   protected void b_(rdn_3 var1) {
      if (this.catch_ > 0) {
         var1.class_((rYB)this.break_.throws_[7], this.break_, this.catch_);
      }

      if (this.byte_ instanceof rXv_1) {
         ((rXv_1)this.byte_).class_(this.break_);
      }

      this.catch_ = 0;
   }
}
