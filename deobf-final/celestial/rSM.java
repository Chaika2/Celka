package celestial;

public abstract class rSM extends rBk_1 {
   protected final is_3 throws_;
   protected final boolean case_;
   private final boolean class_;
   private int break_;
   private int byte_;
   private int protected_;
   protected iB_2 catch_;
   protected int private_ = 60;

   @Override
   public void byte_() {
      this.break_ = 0;
      this.byte_ = 0;
      this.protected_ = 0;
   }

   public rSM(is_3 var1, boolean var2) {
      this(var1, var2, false);
   }

   public rSM(is_3 var1, boolean var2, boolean var3) {
      this.throws_ = var1;
      this.case_ = var2;
      this.class_ = var3;
   }

   protected boolean class_(iB_2 var1, ay_3 var2) {
      if (var1 == null) {
         return false;
      } else if (!var2.class_(this.throws_, var1)) {
         return false;
      } else if (!this.throws_.private_(var1.Bs())) {
         return false;
      } else {
         if (this.class_) {
            if (--this.byte_ <= 0) {
               this.break_ = 0;
            }

            if (this.break_ == 0) {
               this.break_ = this.class_(var1) ? 1 : 2;
            }

            if (this.break_ == 2) {
               return false;
            }
         }

         return true;
      }
   }

   public rSM class_(int var1) {
      this.private_ = var1;
      return this;
   }

   private boolean class_(iB_2 var1) {
      this.byte_ = 10 + this.throws_.Sa().nextInt(5);
      rLC var2 = this.throws_.public_().class_(var1, 0);
      if (var2 == null) {
         return false;
      } else {
         rLq_1 var3 = var2.protected_();
         if (var3 == null) {
            return false;
         } else {
            int var4 = var3.class_ - rfU_2.byte_(var1.rx());
            int var5 = var3.byte_ - rfU_2.byte_(var1.BO());
            return (double)(var4 * var4 + var5 * var5) <= 2.25;
         }
      }
   }

   @Override
   public boolean break_() {
      iB_2 var1 = this.throws_.I_();
      if (var1 == null) {
         var1 = this.catch_;
      }

      if (var1 == null) {
         return false;
      } else if (!var1.BM()) {
         return false;
      } else {
         rnM_2 var2 = this.throws_.BG();
         rnM_2 var3 = var1.BG();
         if (var2 != null && var3 == var2) {
            return false;
         } else {
            double var4 = this.extends_();
            if (this.throws_.int_(var1) > var4 * var4) {
               return false;
            } else {
               if (this.case_) {
                  if (this.throws_.goto_().class_(var1)) {
                     this.protected_ = 0;
                  } else if (++this.protected_ > this.private_) {
                     return false;
                  }
               }

               if (var1 instanceof rhd_3 && ((rhx_3)((rhd_3)var1).implements_[18]).class_) {
                  return false;
               } else {
                  this.throws_.byte_(var1);
                  return true;
               }
            }
         }
      }
   }

   protected double extends_() {
      return this.throws_.class_(iQ_2.break_);
   }

   @Override
   public void protected_() {
      this.throws_.byte_((iB_2)null);
      this.catch_ = null;
   }
}
