package celestial;

public class rXk_1 implements rXZ, rXu_1 {
   private final rqs_3<rdn_3> class_;
   private final int break_;
   private final int byte_;
   private final rJr_1 protected_;

   @Override
   public boolean byte_(rhd_3 var1) {
      return true;
   }

   public int byte_() {
      return this.byte_;
   }

   public rXk_1(rJr_1 var1, int var2, int var3) {
      this.class_ = rqs_3.class_(var2 * var3, rdn_3.break_);
      this.protected_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public void class_(rWr_1 var1) {
      for (rdn_3 var3 : this.class_) {
         var1.class_(var3);
      }
   }

   @Override
   public rdn_3 class_(int var1, int var2) {
      rdn_3 var3 = rXC.class_(this.class_, var1, var2);
      if (!var3.class_()) {
         this.protected_.class_(this);
      }

      return var3;
   }

   @Override
   public void break_() {
   }

   @Override
   public void break_(int var1, rdn_3 var2) {
      this.class_.set(var1, var2);
      this.protected_.class_(this);
   }

   @Override
   public rdn_3 extends_(int var1) {
      return var1 >= this.else_() ? rdn_3.break_ : this.class_.get(var1);
   }

   @Override
   public int else_() {
      return this.class_.size();
   }

   @Override
   public boolean return_() {
      for (rdn_3 var2 : this.class_) {
         if (!var2.class_()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void public_() {
      this.class_.clear();
   }

   public int protected_() {
      return this.break_;
   }

   @Override
   public rdn_3 native_(int var1) {
      return rXC.class_(this.class_, var1);
   }
}
