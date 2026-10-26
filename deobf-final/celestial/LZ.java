package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public abstract class LZ extends ch_3 implements cC_2, cp_3 {
   public static final rqO_2 finally_ = new rqO_2("textures/gui/widgets.png");
   protected int extends_;
   protected int native_;
   public int volatile_;
   public int final_;
   private rgP_2 class_;
   protected boolean package_;
   public boolean int_ = true;
   public boolean new_ = true;
   protected float continue_ = 1.0F;
   private boolean throws_;
   private float case_;
   private boolean catch_ = true;

   public void byte_(double var1, double var3) {
   }

   public void int_(int var1) {
      this.extends_ = var1;
   }

   public LZ(int var1, int var2, int var3, int var4, rgP_2 var5) {
      this.volatile_ = var1;
      this.final_ = var2;
      this.extends_ = var3;
      this.native_ = var4;
      this.class_ = var5;
   }

   @Override
   public boolean class_(double var1, double var3, int var5) {
      if (this.break_(var5)) {
         this.protected_(var1, var3);
         return true;
      } else {
         return false;
      }
   }

   protected void class_(double var1, double var3, double var5, double var7) {
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      if (this.new_) {
         this.package_ = var2 >= this.volatile_ && var3 >= this.final_ && var2 < this.volatile_ + this.extends_ && var3 < this.final_ + this.native_;
         this.break_(var1, var2, var3, var4);
      }
   }

   protected void class_(Ml_1 var1, QY var2, int var3, int var4) {
   }

   public void class_(Nf_1 var1) {
      var1.class_(Np_1.class_(rqn_3.dw, 1.0F));
   }

   @Override
   public boolean class_(double var1, double var3, int var5, double var6, double var8) {
      if (this.break_(var5)) {
         this.class_(var1, var3, var6, var8);
         return true;
      } else {
         return false;
      }
   }

   public void class_(float var1) {
      this.continue_ = var1;
   }

   public void class_(Ml_1 var1, int var2, int var3) {
   }

   public void class_(Ml_1 var1, cm_3 var2, int var3) {
      this.class_(var1, var2, 2, var3);
   }

   protected void class_(Ml_1 var1, cm_3 var2, rgP_2 var3, int var4, int var5, int var6, int var7, int var8) {
      this.class_(var1, var2, var3, (var4 + var6) / 2, var4, var5, var6, var7, var8);
   }

   protected void class_(Ml_1 var1, cm_3 var2, int var3, int var4) {
      int var5 = this.volatile_ + var3;
      int var6 = this.volatile_ + this.case_() - var3;
      this.class_(var1, var2, this.C_(), var5, this.final_, var6, this.final_ + this.native_, var4);
   }

   protected void class_(Ml_1 var1, cm_3 var2, rgP_2 var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = var2.class_(var3) + 4;
      float var11 = (float)(var6 + var8 - 9) / 2.0F + 1.0F;
      float var12 = (float)(var7 - var5 + 1);
      if ((float)var10 > var12) {
         boolean var13 = this.package_ && this.public_() != 0.0F;
         float var14 = (float)var10 - var12;
         double var15 = (double)rqR_2.break_() / 500.0;
         double var17 = Math.max((double)var14 * 0.5, 3.0);
         double var19 = var13 ? (double)this.public_() : Math.sin((Math.PI / 2) * Math.cos((Math.PI * 2) * var15 / var17)) / 2.0 + 0.5;
         double var21 = rfU_2.protected_(var19, 0.0, (double)var14);
         this.class_(var5, var6, var7, var8);
         var2.break_(var1, var3, (float)((double)var5 - var21) + 2.0F, var11, var9);
         this.y_();
      } else {
         int var23 = rfU_2.class_(var4, var5 + var10 / 2, var7 - var10 / 2);
         var2.break_(var1, var3, var23, (int)var11, var9);
      }
   }

   @Override
   public boolean break_(boolean var1) {
      if (this.return_() && this.int_ && this.new_) {
         this.throws_ = !this.throws_;
         this.throws_(this.throws_);
         return this.throws_;
      } else {
         return false;
      }
   }

   public LZ break_(float var1) {
      this.case_ = var1;
      return this;
   }

   @Override
   public boolean break_(double var1, double var3) {
      return this.int_
         && this.new_
         && var1 >= (double)this.volatile_
         && var3 >= (double)this.final_
         && var1 < (double)(this.volatile_ + this.extends_)
         && var3 < (double)(this.final_ + this.native_);
   }

   public void break_(rgP_2 var1) {
      this.class_ = var1;
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (this.int_ && this.new_ && this.break_(var5)) {
         boolean var6 = this.throws_(var1, var3);
         if (var6) {
            if (this.synchronized_()) {
               this.class_(QY.instanceof_().c());
            }

            this.byte_(var1, var3);
            return true;
         }
      }

      return false;
   }

   protected boolean break_(int var1) {
      return var1 == 0;
   }

   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      QY var5 = QY.instanceof_();
      cm_3 var6 = (cm_3)var5.class_[15];
      var5.A().class_(finally_);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.continue_);
      int var7 = this.a_(this.B_());
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      this.break_(var1, this.volatile_, this.final_, 0, 46 + var7 * 20, this.extends_ / 2, this.native_);
      this.break_(var1, this.volatile_ + this.extends_ / 2, this.final_, 200 - this.extends_ / 2, 46 + var7 * 20, this.extends_ / 2, this.native_);
      this.class_(var1, var5, var2, var3);
      int var8 = this.int_ ? 16777215 : 10526880;
      this.class_(var1, var6, var8 | rfU_2.case_(this.continue_ * 255.0F) << 24);
   }

   protected boolean throws_(double var1, double var3) {
      return this.int_
         && this.new_
         && var1 >= (double)this.volatile_
         && var3 >= (double)this.final_
         && var1 < (double)(this.volatile_ + this.extends_)
         && var3 < (double)(this.final_ + this.native_);
   }

   protected void throws_(boolean var1) {
   }

   public LZ finally_(boolean var1) {
      this.catch_ = var1;
      return this;
   }

   public int case_() {
      return this.extends_;
   }

   public int else_() {
      return this.native_;
   }

   public void implements_(boolean var1) {
      this.throws_ = var1;
   }

   public boolean return_() {
      return this.catch_;
   }

   public float public_() {
      return this.case_;
   }

   public void protected_(double var1, double var3) {
   }

   public boolean synchronized_() {
      return true;
   }

   public boolean aO_() {
      return this.throws_;
   }

   protected int a_(boolean var1) {
      byte var2 = 1;
      if (!this.int_) {
         var2 = 0;
      } else if (var1) {
         var2 = 2;
      }

      return var2;
   }

   public boolean B_() {
      return this.package_ || this.throws_;
   }

   protected rVi_1 A_() {
      return new rgn_3("gui.narrate.button", this.C_());
   }

   public rgP_2 C_() {
      return this.class_;
   }
}
