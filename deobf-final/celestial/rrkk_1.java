package celestial;

public class rrkk_1 extends rrkX {
   private float case_;
   public boolean throws_;
   private rrdD catch_ = null;

   public rrkk_1(int var1, int var2, int var3, int var4, int var5, rrdD var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.case_ = 1.0F;
      this.catch_ = var6;
      this.case_ = var6.new_();
      this.class_(rrkJ.class_(var6, this.extends_));
   }

   @Override
   protected void class_(Ml_1 var1, QY var2, int var3, int var4) {
      if (this.new_) {
         if (this.throws_ && !vm_3.synchronized_()) {
            this.case_ = (float)(var3 - (this.volatile_ + 4)) / (float)(this.extends_ - 8);
            this.case_ = rfU_2.class_(this.case_, 0.0F, 1.0F);
            this.catch_.class_(this.case_);
            this.case_ = this.catch_.new_();
            this.class_(rrkJ.class_(this.catch_, this.extends_));
         }

         var2.A().class_(finally_);
         MT.protected_(1.0F, 1.0F, 1.0F, 1.0F);
         int var5 = (this.B_() ? 2 : 1) * 20;
         this.break_(var1, this.volatile_ + (int)(this.case_ * (float)(this.extends_ - 8)), this.final_, 0, 46 + var5, 4, 20);
         this.break_(var1, this.volatile_ + (int)(this.case_ * (float)(this.extends_ - 8)) + 4, this.final_, 196, 46 + var5, 4, 20);
      }
   }

   @Override
   public boolean class_(double var1, double var3, int var5) {
      this.throws_ = false;
      return true;
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (super.break_(var1, var3, var5)) {
         this.case_ = (float)(var1 - (double)(this.volatile_ + 4)) / (float)(this.extends_ - 8);
         this.case_ = rfU_2.class_(this.case_, 0.0F, 1.0F);
         this.catch_.class_(this.case_);
         this.class_(rrkJ.class_(this.catch_, this.extends_));
         this.throws_ = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean extends_() {
      return false;
   }

   @Override
   public void implements_() {
      this.case_ = this.catch_.new_();
   }

   @Override
   protected int a_(boolean var1) {
      return 0;
   }
}
