package celestial;

public class rOB extends rPg_1 {
   private final rMi_1 break_;
   private boolean byte_;

   public boolean byte_() {
      return this.class_;
   }

   public rOB(rMi_1 var1, rMi_1 var2) {
      super(var2);
      this.break_ = var2;
   }

   public void class_(boolean var1) {
      this.byte_ = var1;
   }

   @Override
   public void break_() {
      if (this.class_) {
         this.break_.L();
         this.class_ = false;
      }
   }

   public boolean protected_() {
      return this.byte_;
   }
}
