package celestial;

import java.util.function.Predicate;

public class ay_3 {
   public static final ay_3 id_class = new ay_3();
   private double id_break = -1.0;
   private boolean id_byte;
   private boolean id_protected;
   private boolean id_throws;
   private boolean id_case;
   private boolean id_catch = true;
   private Predicate<iB_2> id_private;

   public ay_3 id_byte() {
      this.id_throws = true;
      return this;
   }

   public boolean id_class(iB_2 var1, iB_2 var2) {
      if (var1 == var2) {
         return false;
      } else if (var2.id_native()) {
         return false;
      } else if (!var2.BM()) {
         return false;
      } else if (!this.id_byte && var2.rg()) {
         return false;
      } else if (this.id_private != null && !this.id_private.test(var2)) {
         return false;
      } else {
         if (var1 != null) {
            if (!this.id_case) {
               if (!var1.id_catch(var2)) {
                  return false;
               }

               if (!var1.id_class(var2.BC())) {
                  return false;
               }
            }

            if (!this.id_protected && var1.id_final(var2)) {
               return false;
            }

            if (this.id_break > 0.0) {
               double var3 = this.id_catch ? var2.id_goto(var1) : 1.0;
               double var5 = Math.max(this.id_break * var3, 2.0);
               double var7 = var1.id_class(var2.rx(), var2.re(), var2.BO());
               if (var7 > var5 * var5) {
                  return false;
               }
            }

            if (!this.id_throws && var1 instanceof is_3 && !((is_3)var1).id_goto().id_class(var2)) {
               return false;
            }
         }

         return true;
      }
   }

   public ay_3 id_class(Predicate<iB_2> var1) {
      this.id_private = var1;
      return this;
   }

   public ay_3 id_class() {
      this.id_byte = true;
      return this;
   }

   public ay_3 id_class(double var1) {
      this.id_break = var1;
      return this;
   }

   public ay_3 id_break() {
      this.id_protected = true;
      return this;
   }

   public ay_3 id_throws() {
      this.id_catch = false;
      return this;
   }

   public ay_3 id_protected() {
      this.id_case = true;
      return this;
   }
}
