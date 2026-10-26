package celestial;

import java.util.EnumSet;

public class rBi_1<T extends rEi_1 & aa_3 & aY_2> extends rBk_1 {
   public static final rqb_3 class_ = new rqb_3(20, 40);
   private final T break_;
   private rSr_1 byte_ = rSr_1.UNCHARGED;
   private final double protected_;
   private final float throws_;
   private int case_;
   private int catch_;
   private int private_;

   public rBi_1(T var1, double var2, float var4) {
      this.break_ = (T)var1;
      this.protected_ = var2;
      this.throws_ = var4 * var4;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      return this.private_() && this.catch_();
   }

   @Override
   public boolean break_() {
      return this.private_() && (this.class_() || !this.break_.public_().native_()) && this.catch_();
   }

   @Override
   public void throws_() {
      iB_2 var1 = this.break_.I_();
      if (var1 != null) {
         boolean var2 = this.break_.goto_().class_(var1);
         boolean var3 = this.case_ > 0;
         if (var2 != var3) {
            this.case_ = 0;
         }

         if (var2) {
            this.case_++;
         } else {
            this.case_--;
         }

         double var4 = this.break_.int_(var1);
         boolean var6 = (var4 > (double)this.throws_ || this.case_ < 5) && this.catch_ == 0;
         if (var6) {
            this.private_--;
            if (this.private_ <= 0) {
               this.break_.public_().class_(var1, this.finally_() ? this.protected_ : this.protected_ * 0.5);
               this.private_ = class_.class_(this.break_.Sa());
            }
         } else {
            this.private_ = 0;
            this.break_.public_().final_();
         }

         this.break_.continue_().class_(var1, 30.0F, 30.0F);
         if (this.byte_ == rSr_1.UNCHARGED) {
            if (!var6) {
               this.break_.break_(rhj_3.class_(this.break_, rdy_3.kU));
               this.byte_ = rSr_1.CHARGING;
               this.break_.break_(true);
            }
         } else if (this.byte_ == rSr_1.CHARGING) {
            if (!this.break_.return_()) {
               this.byte_ = rSr_1.UNCHARGED;
            }

            int var7 = this.break_.SU();
            rdn_3 var8 = this.break_.sX();
            if (var7 >= rxm_3.private_(var8)) {
               this.break_.SC();
               this.byte_ = rSr_1.CHARGED;
               this.catch_ = 20 + this.break_.Sa().nextInt(20);
               this.break_.break_(false);
            }
         } else if (this.byte_ == rSr_1.CHARGED) {
            this.catch_--;
            if (this.catch_ == 0) {
               this.byte_ = rSr_1.READY_TO_ATTACK;
            }
         } else if (this.byte_ == rSr_1.READY_TO_ATTACK && var2) {
            this.break_.break_(var1, 1.0F);
            rdn_3 var9 = this.break_.protected_(rhj_3.class_(this.break_, rdy_3.kU));
            rxm_3.class_(var9, false);
            this.byte_ = rSr_1.UNCHARGED;
         }
      }
   }

   private boolean finally_() {
      return this.byte_ == rSr_1.UNCHARGED;
   }

   private boolean catch_() {
      return this.break_.class_(rdy_3.kU);
   }

   @Override
   public void protected_() {
      super.protected_();
      this.break_.case_(false);
      this.break_.byte_((iB_2)null);
      this.case_ = 0;
      if (this.break_.return_()) {
         this.break_.throw_();
         this.break_.break_(false);
         rxm_3.class_(this.break_.sX(), false);
      }
   }

   private boolean private_() {
      return this.break_.I_() != null && this.break_.I_().BM();
   }
}
