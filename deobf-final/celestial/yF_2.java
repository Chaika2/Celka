package celestial;

import java.util.Set;

public class yF_2 {
   private static final int class_ = rpr_3.values().length;
   private long break_;

   private void byte_(int var1) {
      this.break_ &= (long)(~(1 << var1));
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
               boolean var10 = this.class_(var14, var9);
               var1.append(' ').append((char)(var10 ? 'Y' : 'n'));
            }
         }

         var1.append('\n');
      }

      return var1.toString();
   }

   private void class_(int var1, boolean var2) {
      if (var2) {
         this.break_(var1);
      } else {
         this.byte_(var1);
      }
   }

   public void class_(Set<rpr_3> var1) {
      for (rpr_3 var3 : var1) {
         for (rpr_3 var5 : var1) {
            this.class_(var3, var5, true);
         }
      }
   }

   public void class_(boolean var1) {
      if (var1) {
         this.break_ = -1L;
      } else {
         this.break_ = 0L;
      }
   }

   public boolean class_(rpr_3 var1, rpr_3 var2) {
      return this.class_(var1.ordinal() + var2.ordinal() * class_);
   }

   public void class_(rpr_3 var1, rpr_3 var2, boolean var3) {
      this.class_(var1.ordinal() + var2.ordinal() * class_, var3);
      this.class_(var2.ordinal() + var1.ordinal() * class_, var3);
   }

   private boolean class_(int var1) {
      return (this.break_ & (long)(1 << var1)) != 0L;
   }

   private void break_(int var1) {
      this.break_ |= (long)(1 << var1);
   }
}
