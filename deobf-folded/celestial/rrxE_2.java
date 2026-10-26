package celestial;

public class rrxE_2 {
   private rrxB_2 id_class;
   private Class id_break;
   private int id_byte;
   private rrxs_3[] id_protected;

   public int id_byte() {
      return this.id_byte;
   }

   public rrxE_2(rrxB_2 var1, Class var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      if (var1.id_byte() && var2 != null) {
         this.id_protected = new rrxs_3[var3];

         for (int var4 = 0; var4 < this.id_protected.length; var4++) {
            this.id_protected[var4] = new rrxs_3(var1, var2, var4);
         }
      }
   }

   public rrxs_3 id_class(int var1) {
      return var1 >= 0 && var1 < this.id_protected.length ? this.id_protected[var1] : null;
   }

   public Object id_class(Object var1, int var2) {
      return rrxr_3.id_class(var1, this, var2);
   }

   public void id_class(Object var1, int var2, Object var3) {
      rrxr_3.id_class(var1, this, var2, var3);
   }

   public rrxB_2 id_class() {
      return this.id_class;
   }

   public Class id_break() {
      return this.id_break;
   }

   public boolean id_protected() {
      if (this.id_protected == null) {
         return false;
      } else {
         for (int var1 = 0; var1 < this.id_protected.length; var1++) {
            rrxs_3 var2 = this.id_protected[var1];
            if (!var2.id_protected()) {
               return false;
            }
         }

         return true;
      }
   }
}
