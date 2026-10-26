package celestial;

public class rXW implements rXu_1 {
   private final rXu_1 class_;
   private final rXu_1 break_;

   @Override
   public boolean byte_(rhd_3 var1) {
      return this.class_.byte_(var1) && this.break_.byte_(var1);
   }

   public rXW(rXu_1 var1, rXu_1 var2) {
      if (var1 == null) {
         var1 = var2;
      }

      if (var2 == null) {
         var2 = var1;
      }

      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public rdn_3 class_(int var1, int var2) {
      return var1 >= this.class_.else_() ? this.break_.class_(var1 - this.class_.else_(), var2) : this.class_.class_(var1, var2);
   }

   public boolean class_(rXu_1 var1) {
      return this.class_ == var1 || this.break_ == var1;
   }

   @Override
   public void break_() {
      this.class_.break_();
      this.break_.break_();
   }

   @Override
   public void break_(rhd_3 var1) {
      this.class_.break_(var1);
      this.break_.break_(var1);
   }

   @Override
   public void break_(int var1, rdn_3 var2) {
      if (var1 >= this.class_.else_()) {
         this.break_.break_(var1 - this.class_.else_(), var2);
      } else {
         this.class_.break_(var1, var2);
      }
   }

   @Override
   public rdn_3 extends_(int var1) {
      return var1 >= this.class_.else_() ? this.break_.extends_(var1 - this.class_.else_()) : this.class_.extends_(var1);
   }

   @Override
   public int ab_() {
      return this.class_.ab_();
   }

   @Override
   public int else_() {
      return this.class_.else_() + this.break_.else_();
   }

   @Override
   public boolean return_() {
      return this.class_.return_() && this.break_.return_();
   }

   @Override
   public void public_() {
      this.class_.public_();
      this.break_.public_();
   }

   @Override
   public rdn_3 native_(int var1) {
      return var1 >= this.class_.else_() ? this.break_.native_(var1 - this.class_.else_()) : this.class_.native_(var1);
   }

   @Override
   public boolean a_(int var1, rdn_3 var2) {
      return var1 >= this.class_.else_() ? this.break_.a_(var1 - this.class_.else_(), var2) : this.class_.a_(var1, var2);
   }

   @Override
   public void b_(rhd_3 var1) {
      this.class_.b_(var1);
      this.break_.b_(var1);
   }
}
