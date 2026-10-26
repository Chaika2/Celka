package celestial;

public class rrxE_2 {
   private rrxB_2 class_;
   private Class break_;
   private int byte_;
   private rrxs_3[] protected_;

   public int byte_() {
      return this.byte_;
   }

   public rrxE_2(rrxB_2 var1, Class var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      if (var1.byte_() && var2 != null) {
         this.protected_ = new rrxs_3[var3];

         for (int var4 = 0; var4 < this.protected_.length; var4++) {
            this.protected_[var4] = new rrxs_3(var1, var2, var4);
         }
      }
   }

   public rrxs_3 class_(int var1) {
      return var1 >= 0 && var1 < this.protected_.length ? this.protected_[var1] : null;
   }

   public Object class_(Object var1, int var2) {
      return rrxr_3.class_(var1, this, var2);
   }

   public void class_(Object var1, int var2, Object var3) {
      rrxr_3.class_(var1, this, var2, var3);
   }

   public rrxB_2 class_() {
      return this.class_;
   }

   public Class break_() {
      return this.break_;
   }

   public boolean protected_() {
      if (this.protected_ == null) {
         return false;
      } else {
         for (int var1 = 0; var1 < this.protected_.length; var1++) {
            rrxs_3 var2 = this.protected_[var1];
            if (!var2.protected_()) {
               return false;
            }
         }

         return true;
      }
   }
}
