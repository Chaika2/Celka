package celestial;

public abstract class rSM extends rBk_1 {
   protected final is_3 id_throws;
   protected final boolean id_case;
   private final boolean id_class;
   private int id_break;
   private int id_byte;
   private int id_protected;
   protected iB_2 id_catch;
   protected int id_private = 60;

   @Override
   public void id_byte() {
      this.id_break = 0;
      this.id_byte = 0;
      this.id_protected = 0;
   }

   public rSM(is_3 var1, boolean var2) {
      this(var1, var2, false);
   }

   public rSM(is_3 var1, boolean var2, boolean var3) {
      this.id_throws = var1;
      this.id_case = var2;
      this.id_class = var3;
   }

   protected boolean id_class(iB_2 var1, ay_3 var2) {
      if (var1 == null) {
         return false;
      } else if (!var2.id_class(this.id_throws, var1)) {
         return false;
      } else if (!this.id_throws.id_private(var1.Bs())) {
         return false;
      } else {
         if (this.id_class) {
            if (--this.id_byte <= 0) {
               this.id_break = 0;
            }

            if (this.id_break == 0) {
               this.id_break = this.id_class(var1) ? 1 : 2;
            }

            if (this.id_break == 2) {
               return false;
            }
         }

         return true;
      }
   }

   public rSM id_class(int var1) {
      this.id_private = var1;
      return this;
   }

   private boolean id_class(iB_2 var1) {
      this.id_byte = 10 + this.id_throws.Sa().nextInt(5);
      rLC var2 = this.id_throws.id_public().id_class(var1, 0);
      if (var2 == null) {
         return false;
      } else {
         rLq_1 var3 = var2.id_protected();
         if (var3 == null) {
            return false;
         } else {
            int var4 = var3.id_class - rfU_2.id_byte(var1.rx());
            int var5 = var3.id_byte - rfU_2.id_byte(var1.BO());
            return (double)(var4 * var4 + var5 * var5) <= 2.25;
         }
      }
   }

   @Override
   public boolean id_break() {
      iB_2 var1 = this.id_throws.I_();
      if (var1 == null) {
         var1 = this.id_catch;
      }

      if (var1 == null) {
         return false;
      } else if (!var1.BM()) {
         return false;
      } else {
         rnM_2 var2 = this.id_throws.BG();
         rnM_2 var3 = var1.BG();
         if (var2 != null && var3 == var2) {
            return false;
         } else {
            double var4 = this.id_extends();
            if (this.id_throws.id_int(var1) > var4 * var4) {
               return false;
            } else {
               if (this.id_case) {
                  if (this.id_throws.id_goto().id_class(var1)) {
                     this.id_protected = 0;
                  } else if (++this.id_protected > this.id_private) {
                     return false;
                  }
               }

               if (var1 instanceof rhd_3 && ((rhx_3)((rhd_3)var1).id_implements[18]).id_class) {
                  return false;
               } else {
                  this.id_throws.id_byte(var1);
                  return true;
               }
            }
         }
      }
   }

   protected double id_extends() {
      return this.id_throws.id_class(iQ_2.id_break);
   }

   @Override
   public void id_protected() {
      this.id_throws.id_byte((iB_2)null);
      this.id_catch = null;
   }
}
