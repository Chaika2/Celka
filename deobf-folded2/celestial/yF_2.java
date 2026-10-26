package celestial;

import java.util.Set;

public class yF_2 {
   private static final int id_class = rpr_3.values().length;
   private long id_break;

   private void id_byte(int var1) {
      this.id_break &= (long)(~(1 << var1));
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(' ');

      for (rpr_3 var5 : rpr_3.values()) {
         var1.append(' ').append(var5.toString().toUpperCase().charAt(0));
      }

      var1.append('\n');

      for (rpr_3 var14 : rpr_3.values()) {
         var1.append(var14.toString().toUpperCase().charAt(0));

         for (rpr_3 var9 : rpr_3.values()) {
            if (var14 == var9) {
               var1.append("  ");
            } else {
               boolean var10 = this.id_class(var14, var9);
               var1.append(' ').append((char)(var10 ? 'Y' : 'n'));
            }
         }

         var1.append('\n');
      }

      return var1.toString();
   }

   private void id_class(int var1, boolean var2) {
      if (var2) {
         this.id_break(var1);
      } else {
         this.id_byte(var1);
      }
   }

   public void id_class(Set<rpr_3> var1) {
      for (rpr_3 var3 : var1) {
         for (rpr_3 var5 : var1) {
            this.id_class(var3, var5, true);
         }
      }
   }

   public void id_class(boolean var1) {
      if (var1) {
         this.id_break = -1L;
      } else {
         this.id_break = 0L;
      }
   }

   public boolean id_class(rpr_3 var1, rpr_3 var2) {
      return this.id_class(var1.ordinal() + var2.ordinal() * id_class);
   }

   public void id_class(rpr_3 var1, rpr_3 var2, boolean var3) {
      this.id_class(var1.ordinal() + var2.ordinal() * id_class, var3);
      this.id_class(var2.ordinal() + var1.ordinal() * id_class, var3);
   }

   private boolean id_class(int var1) {
      return (this.id_break & (long)(1 << var1)) != 0L;
   }

   private void id_break(int var1) {
      this.id_break |= (long)(1 << var1);
   }
}
