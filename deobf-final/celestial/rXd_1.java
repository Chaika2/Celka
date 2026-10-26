package celestial;

public class rXd_1 implements rXu_1, rXv_1 {
   private final rqs_3<rdn_3> class_ = rqs_3.class_(1, rdn_3.break_);
   private rkw_3<?> break_;

   @Override
   public rkw_3<?> byte_() {
      return this.break_;
   }

   @Override
   public boolean byte_(rhd_3 var1) {
      return true;
   }

   @Override
   public void class_(rkw_3<?> var1) {
      this.break_ = var1;
   }

   @Override
   public rdn_3 class_(int var1, int var2) {
      return rXC.class_(this.class_, 0);
   }

   @Override
   public void break_(int var1, rdn_3 var2) {
      this.class_.set(0, var2);
   }

   @Override
   public void break_() {
   }

   @Override
   public rdn_3 extends_(int var1) {
      return this.class_.get(0);
   }

   @Override
   public int else_() {
      return 1;
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

   @Override
   public rdn_3 native_(int var1) {
      return rXC.class_(this.class_, 0);
   }
}
