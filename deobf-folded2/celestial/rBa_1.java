package celestial;

import java.util.EnumSet;

public class rBa_1<T extends rEi_1 & aa_3> extends rBk_1 {
   private final T id_class;
   private final double id_break;
   private int id_byte;
   private final float id_protected;
   private int id_throws = -1;
   private int id_case;
   private boolean id_catch;
   private boolean id_private;
   private int id_implements = -1;

   @Override
   public void id_byte() {
      super.id_byte();
      this.id_class.id_case(true);
   }

   public rBa_1(T var1, double var2, int var4, float var5) {
      this.id_class = (T)var1;
      this.id_break = var2;
      this.id_byte = var4;
      this.id_protected = var5 * var5;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      return this.id_class.I_() == null ? false : this.id_catch();
   }

   public void id_class(int var1) {
      this.id_byte = var1;
   }

   @Override
   public boolean id_break() {
      return (this.id_class() || !this.id_class.id_public().id_native()) && this.id_catch();
   }

   @Override
   public void id_throws() {
      iB_2 var1 = this.id_class.I_();
      if (var1 != null) {
         double var2 = this.id_class.id_class(var1.rx(), var1.re(), var1.BO());
         boolean var4 = this.id_class.id_goto().id_class(var1);
         boolean var5 = this.id_case > 0;
         if (var4 != var5) {
            this.id_case = 0;
         }

         if (var4) {
            this.id_case++;
         } else {
            this.id_case--;
         }

         if (!(var2 > (double)this.id_protected) && this.id_case >= 20) {
            this.id_class.id_public().id_final();
            this.id_implements++;
         } else {
            this.id_class.id_public().id_class(var1, this.id_break);
            this.id_implements = -1;
         }

         if (this.id_implements >= 20) {
            if ((double)this.id_class.Sa().nextFloat() < 0.3) {
               this.id_catch = !this.id_catch;
            }

            if ((double)this.id_class.Sa().nextFloat() < 0.3) {
               this.id_private = !this.id_private;
            }

            this.id_implements = 0;
         }

         if (this.id_implements > -1) {
            if (var2 > (double)(this.id_protected * 0.75F)) {
               this.id_private = false;
            } else if (var2 < (double)(this.id_protected * 0.25F)) {
               this.id_private = true;
            }

            this.id_class.id_super().id_class(this.id_private ? -0.5F : 0.5F, this.id_catch ? 0.5F : -0.5F);
            this.id_class.id_class(var1, 30.0F, 30.0F);
         } else {
            this.id_class.id_continue().id_class(var1, 30.0F, 30.0F);
         }

         if (this.id_class.id_return()) {
            if (!var4 && this.id_case < -60) {
               this.id_class.id_throw();
            } else if (var4) {
               int var6 = this.id_class.SU();
               if (var6 >= 20) {
                  this.id_class.id_throw();
                  this.id_class.id_break(var1, rxQ_2.id_class(var6));
                  this.id_throws = this.id_byte;
               }
            }
         } else if (--this.id_throws <= 0 && this.id_case >= -60) {
            this.id_class.id_break(rhj_3.id_class(this.id_class, rdy_3.OM));
         }
      }
   }

   protected boolean id_catch() {
      return this.id_class.id_class(rdy_3.OM);
   }

   @Override
   public void id_protected() {
      super.id_protected();
      this.id_class.id_case(false);
      this.id_case = 0;
      this.id_throws = -1;
      this.id_class.id_throw();
   }
}
