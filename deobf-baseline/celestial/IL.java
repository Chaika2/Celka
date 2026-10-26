package celestial;

public class IL {
   public static final IL id_class = new IL(new rje_3(), new rje_3(), new rje_3(1.0F, 1.0F, 1.0F));
   public final rje_3 id_break;
   public final rje_3 id_byte;
   public final rje_3 id_protected;

   public IL(rje_3 var1, rje_3 var2, rje_3 var3) {
      this.id_break = var1.id_throws();
      this.id_byte = var2.id_throws();
      this.id_protected = var3.id_throws();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         IL var2 = (IL)var1;
         return this.id_break.equals(var2.id_break) && this.id_protected.equals(var2.id_protected) && this.id_byte.equals(var2.id_byte);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.id_break.hashCode();
      var1 = 31 * var1 + this.id_byte.hashCode();
      return 31 * var1 + this.id_protected.hashCode();
   }

   public void id_class(boolean var1, Ml_1 var2) {
      if (this != id_class) {
         float var3 = this.id_break.id_class();
         float var4 = this.id_break.id_break();
         float var5 = this.id_break.id_byte();
         if (var1) {
            var4 = -var4;
            var5 = -var5;
         }

         int var6 = var1 ? -1 : 1;
         var2.id_class((double)((float)var6 * this.id_byte.id_class()), (double)this.id_byte.id_break(), (double)this.id_byte.id_byte());
         var2.id_class(new rjY_2(var3, var4, var5, true));
         var2.id_class(this.id_protected.id_class(), this.id_protected.id_break(), this.id_protected.id_byte());
      }
   }
}
