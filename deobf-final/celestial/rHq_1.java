package celestial;

public class rHq_1 extends ryO_2 implements rHf_1, rHw_1 {
   public float class_;
   public float break_;
   public int byte_;
   private int protected_;

   public rHq_1() {
      super(ryW_2.protected_);
   }

   public boolean class_(rhd_3 var1) {
      return this.extends_.class_(this.native_) != this
         ? false
         : !(var1.class_((double)this.native_.b_() + 0.5, (double)this.native_.c_() + 0.5, (double)this.native_.d_() + 0.5) > 64.0);
   }

   @Override
   public float class_(float var1) {
      return rfU_2.catch_(var1, this.break_, this.class_);
   }

   @Override
   public void throws_() {
      if (++this.protected_ % 20 * 4 == 0) {
         this.extends_.class_(this.native_, xu_3.SW, 1, this.byte_);
      }

      this.break_ = this.class_;
      int var1 = this.native_.b_();
      int var2 = this.native_.c_();
      int var3 = this.native_.d_();
      float var4 = 0.1F;
      if (this.byte_ > 0 && this.class_ == 0.0F) {
         double var5 = (double)var1 + 0.5;
         double var7 = (double)var3 + 0.5;
         this.extends_.class_((rhd_3)null, var5, (double)var2 + 0.5, var7, rqn_3.Bc, rqL_2.BLOCKS, 0.5F, this.extends_.int_.nextFloat() * 0.1F + 0.9F);
      }

      if (this.byte_ == 0 && this.class_ > 0.0F || this.byte_ > 0 && this.class_ < 1.0F) {
         float var11 = this.class_;
         if (this.byte_ > 0) {
            this.class_ += 0.1F;
         } else {
            this.class_ -= 0.1F;
         }

         if (this.class_ > 1.0F) {
            this.class_ = 1.0F;
         }

         float var6 = 0.5F;
         if (this.class_ < 0.5F && var11 >= 0.5F) {
            double var12 = (double)var1 + 0.5;
            double var9 = (double)var3 + 0.5;
            this.extends_.class_((rhd_3)null, var12, (double)var2 + 0.5, var9, rqn_3.BN, rqL_2.BLOCKS, 0.5F, this.extends_.int_.nextFloat() * 0.1F + 0.9F);
         }

         if (this.class_ < 0.0F) {
            this.class_ = 0.0F;
         }
      }
   }

   public void catch_() {
      this.byte_++;
      this.extends_.class_(this.native_, xu_3.SW, 1, this.byte_);
   }

   public void private_() {
      this.byte_--;
      this.extends_.class_(this.native_, xu_3.SW, 1, this.byte_);
   }

   @Override
   public void aa_() {
      this.float_();
      super.aa_();
   }

   @Override
   public boolean a_(int var1, int var2) {
      if (var1 == 1) {
         this.byte_ = var2;
         return true;
      } else {
         return super.a_(var1, var2);
      }
   }
}
