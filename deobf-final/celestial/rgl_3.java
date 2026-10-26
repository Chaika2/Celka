package celestial;

public class rgl_3 {
   private final rgH_2 class_;
   private final String break_;
   private Runnable byte_ = () -> {
   };

   public Runnable byte_() {
      return this.byte_;
   }

   public rgl_3(rgH_2 var1, String var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public rgl_3(Runnable var1) {
      this(rgH_2.RUNNABLE, "");
      this.byte_ = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rgl_3 var2 = (rgl_3)var1;
         if (this.class_ != var2.class_) {
            return false;
         } else {
            if (this.break_ != null) {
               if (!this.break_.equals(var2.break_)) {
                  return false;
               }
            } else if (var2.break_ != null) {
               return false;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "ClickEvent{action=" + this.class_ + ", value='" + this.break_ + "'}";
   }

   @Override
   public int hashCode() {
      int var1 = this.class_.hashCode();
      return 31 * var1 + (this.break_ != null ? this.break_.hashCode() : 0);
   }

   public rgH_2 class_() {
      return this.class_;
   }

   public String break_() {
      return this.break_;
   }
}
