package celestial;

import java.util.EnumSet;

public class rBi_1<T extends rEi_1 & aa_3 & aY_2> extends rBk_1 {
   public static final rqb_3 id_class = new rqb_3(20, 40);
   private final T id_break;
   private rSr_1 id_byte = rSr_1.UNCHARGED;
   private final double id_protected;
   private final float id_throws;
   private int id_case;
   private int id_catch;
   private int id_private;

   public rBi_1(T var1, double var2, float var4) {
      this.id_break = (T)var1;
      this.id_protected = var2;
      this.id_throws = var4 * var4;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      return this.id_private() && this.id_catch();
   }

   @Override
   public boolean id_break() {
      return this.id_private() && (this.id_class() || !this.id_break.id_public().id_native()) && this.id_catch();
   }

   @Override
   public void id_throws() {
      iB_2 var1 = this.id_break.I_();
      if (var1 != null) {
         boolean var2 = this.id_break.id_goto().id_class(var1);
         boolean var3 = this.id_case > 0;
         if (var2 != var3) {
            this.id_case = 0;
         }

         if (var2) {
            this.id_case++;
         } else {
            this.id_case--;
         }

         double var4 = this.id_break.id_int(var1);
         boolean var6 = (var4 > (double)this.id_throws || this.id_case < 5) && this.id_catch == 0;
         if (var6) {
            this.id_private--;
            if (this.id_private <= 0) {
               this.id_break.id_public().id_class(var1, this.id_finally() ? this.id_protected : this.id_protected * 0.5);
               this.id_private = id_class.id_class(this.id_break.Sa());
            }
         } else {
            this.id_private = 0;
            this.id_break.id_public().id_final();
         }

         this.id_break.id_continue().id_class(var1, 30.0F, 30.0F);
         if (this.id_byte == rSr_1.UNCHARGED) {
            if (!var6) {
               this.id_break.id_break(rhj_3.id_class(this.id_break, rdy_3.kU));
               this.id_byte = rSr_1.CHARGING;
               this.id_break.id_break(true);
            }
         } else if (this.id_byte == rSr_1.CHARGING) {
            if (!this.id_break.id_return()) {
               this.id_byte = rSr_1.UNCHARGED;
            }

            int var7 = this.id_break.SU();
            rdn_3 var8 = this.id_break.sX();
            if (var7 >= rxm_3.id_private(var8)) {
               this.id_break.SC();
               this.id_byte = rSr_1.CHARGED;
               this.id_catch = 20 + this.id_break.Sa().nextInt(20);
               this.id_break.id_break(false);
            }
         } else if (this.id_byte == rSr_1.CHARGED) {
            this.id_catch--;
            if (this.id_catch == 0) {
               this.id_byte = rSr_1.READY_TO_ATTACK;
            }
         } else if (this.id_byte == rSr_1.READY_TO_ATTACK && var2) {
            this.id_break.id_break(var1, 1.0F);
            rdn_3 var9 = this.id_break.id_protected(rhj_3.id_class(this.id_break, rdy_3.kU));
            rxm_3.id_class(var9, false);
            this.id_byte = rSr_1.UNCHARGED;
         }
      }
   }

   private boolean id_finally() {
      return this.id_byte == rSr_1.UNCHARGED;
   }

   private boolean id_catch() {
      return this.id_break.id_class(rdy_3.kU);
   }

   @Override
   public void id_protected() {
      super.id_protected();
      this.id_break.id_case(false);
      this.id_break.id_byte((iB_2)null);
      this.id_case = 0;
      if (this.id_break.id_return()) {
         this.id_break.id_throw();
         this.id_break.id_break(false);
         rxm_3.id_class(this.id_break.sX(), false);
      }
   }

   private boolean id_private() {
      return this.id_break.I_() != null && this.id_break.I_().BM();
   }
}
