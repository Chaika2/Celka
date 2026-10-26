package celestial;

public class rgl_3 {
   private final rgH_2 id_class;
   private final String id_break;
   private Runnable id_byte = () -> {
   };

   public Runnable id_byte() {
      return this.id_byte;
   }

   public rgl_3(rgH_2 var1, String var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public rgl_3(Runnable var1) {
      this(rgH_2.RUNNABLE, "");
      this.id_byte = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rgl_3 var2 = (rgl_3)var1;
         if (this.id_class != var2.id_class) {
            return false;
         } else {
            if (this.id_break != null) {
               if (!this.id_break.equals(var2.id_break)) {
                  return false;
               }
            } else if (var2.id_break != null) {
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
      return "ClickEvent{action=" + this.id_class + ", value='" + this.id_break + "'}";
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class.hashCode();
      return 31 * var1 + (this.id_break != null ? this.id_break.hashCode() : 0);
   }

   public rgH_2 id_class() {
      return this.id_class;
   }

   public String id_break() {
      return this.id_break;
   }
}
