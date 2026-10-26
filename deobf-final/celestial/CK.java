package celestial;

public class CK extends lO_2 {
   protected final Ch_1 class_;
   private final float break_;
   private float interface_ = 0.91F;
   private float char_;
   private float abstract_;
   private float long_;
   private boolean float_;

   public void byte_(int var1) {
      this.char_ = (float)((var1 & 0xFF0000) >> 16) / 255.0F;
      this.abstract_ = (float)((var1 & 0xFF00) >> 8) / 255.0F;
      this.long_ = (float)((var1 & 0xFF) >> 0) / 255.0F;
      this.float_ = true;
   }

   protected CK(gm_3 var1, double var2, double var4, double var6, Ch_1 var8, float var9) {
      super(var1, var2, var4, var6);
      this.class_ = var8;
      this.break_ = var9;
   }

   @Override
   public CJ class_() {
      return CJ.byte_;
   }

   @Override
   public int break_(float var1) {
      return 15728880;
   }

   public void break_(int var1) {
      float var2 = (float)((var1 & 0xFF0000) >> 16) / 255.0F;
      float var3 = (float)((var1 & 0xFF00) >> 8) / 255.0F;
      float var4 = (float)((var1 & 0xFF) >> 0) / 255.0F;
      float var5 = 1.0F;
      this.class_(var2 * 1.0F, var3 * 1.0F, var4 * 1.0F);
   }

   @Override
   public void case_() {
      this.protected_ = this.catch_;
      this.throws_ = this.private_;
      this.case_ = this.implements_;
      if (this.super_++ >= this.this_) {
         this.finally_();
      } else {
         this.break_(this.class_);
         if (this.super_ > this.this_ / 2) {
            this.throws_(1.0F - ((float)this.super_ - (float)(this.this_ / 2)) / (float)this.this_);
            if (this.float_) {
               this.synchronized_ = this.synchronized_ + (this.char_ - this.synchronized_) * 0.2F;
               this.return_ = this.return_ + (this.abstract_ - this.return_) * 0.2F;
               this.public_ = this.public_ + (this.long_ - this.public_) * 0.2F;
            }
         }

         this.extends_ = this.extends_ + (double)this.break_;
         this.class_(this.finally_, this.extends_, this.native_);
         this.finally_ = this.finally_ * (double)this.interface_;
         this.extends_ = this.extends_ * (double)this.interface_;
         this.native_ = this.native_ * (double)this.interface_;
         if (this.volatile_) {
            this.finally_ *= 0.7F;
            this.native_ *= 0.7F;
         }
      }
   }

   protected void case_(float var1) {
      this.interface_ = var1;
   }
}
