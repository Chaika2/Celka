package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public abstract class LT<E extends Lt_1<E>> extends cu_3 implements cp_3 {
   protected final QY native_;
   protected final int volatile_;
   private List<E> class_ = new LI(this);
   protected int final_;
   protected int package_;
   protected int int_;
   protected int new_;
   protected int continue_;
   protected int super_;
   protected boolean this_ = true;
   private double throws_;
   private boolean case_ = true;
   private boolean catch_;
   protected int else_;
   protected int synchronized_;
   private boolean private_;
   private E implements_;
   private boolean finally_ = true;
   private boolean extends_ = true;

   protected void byte_(double var1, double var3, int var5) {
      this.private_ = var5 == 0 && var1 >= (double)this.protected_() && var1 < (double)(this.protected_() + 6);
   }

   protected void byte_(E var1) {
      this.class_((double)(this.x_().indexOf(var1) * this.volatile_ + this.volatile_ / 2 - (this.new_ - this.int_) / 2));
   }

   public void byte_(boolean var1) {
      this.case_ = var1;
   }

   protected E byte_(int var1) {
      List var2 = this.x_();
      return (E)(var1 >= 0 && var1 < var2.size() ? var2.get(var1) : null);
   }

   public int int_() {
      return Math.max(0, this.final_() - (this.new_ - this.int_ - 4 - this.synchronized_));
   }

   public LT(QY var1, int var2, int var3, int var4, int var5, int var6) {
      this.native_ = var1;
      this.final_ = var2;
      this.package_ = var3;
      this.int_ = var4;
      this.new_ = var5;
      this.volatile_ = var6;
      this.super_ = 0;
      this.continue_ = var2;
   }

   public List<E> this_() {
      return this.class_;
   }

   protected void class_(Ml_1 var1, int var2, int var3) {
   }

   protected void class_(Ml_1 var1) {
   }

   protected void class_(Ml_1 var1, int var2, int var3, yb_3 var4) {
   }

   protected void class_(int var1, int var2) {
   }

   protected void class_(Lw_1 var1) {
      this.class_(var1, var0 -> true);
   }

   @Override
   public boolean class_(double var1, double var3, int var5) {
      if (this.extends_() != null) {
         this.extends_().class_(var1, var3, var5);
      }

      return false;
   }

   public void class_(double var1) {
      this.throws_ = rfU_2.class_(var1, 0.0, (double)this.int_());
   }

   @Override
   public boolean class_(double var1, double var3, int var5, double var6, double var8) {
      if (super.class_(var1, var3, var5, var6, var8)) {
         return true;
      } else if (var5 == 0 && this.private_) {
         if (var3 < (double)this.int_) {
            this.class_(0.0);
         } else if (var3 > (double)this.new_) {
            this.class_((double)this.int_());
         } else {
            double var10 = (double)Math.max(1, this.int_());
            int var12 = this.new_ - this.int_;
            int var13 = rfU_2.class_((int)((float)(var12 * var12) / (float)this.final_()), 32, var12 - 8);
            double var14 = Math.max(1.0, var10 / (double)(var12 - var13));
            this.class_(this.package_() + var8 * var14);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean class_(double var1, double var3, double var5) {
      this.class_(this.package_() - var5 * (double)this.volatile_ / 2.0);
      return true;
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (super.class_(var1, var2, var3)) {
         return true;
      } else if (var1 == 264) {
         this.class_(Lw_1.DOWN);
         return true;
      } else if (var1 == 265) {
         this.class_(Lw_1.UP);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      int var5 = this.protected_();
      int var6 = var5 + 6;
      yb_3 var7 = yb_3.class_();
      lD_2 var8 = var7.byte_();
      if (this.finally_) {
         this.native_.A().class_(ch_3.break_);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         var8.class_(7, ju_3.public_);
         var8.class_((double)this.super_, (double)this.new_, 0.0)
            .class_((float)this.super_ / 32.0F, (float)(this.new_ + (int)this.package_()) / 32.0F)
            .break_(32, 32, 32, 255)
            .class_();
         var8.class_((double)this.continue_, (double)this.new_, 0.0)
            .class_((float)this.continue_ / 32.0F, (float)(this.new_ + (int)this.package_()) / 32.0F)
            .break_(32, 32, 32, 255)
            .class_();
         var8.class_((double)this.continue_, (double)this.int_, 0.0)
            .class_((float)this.continue_ / 32.0F, (float)(this.int_ + (int)this.package_()) / 32.0F)
            .break_(32, 32, 32, 255)
            .class_();
         var8.class_((double)this.super_, (double)this.int_, 0.0)
            .class_((float)this.super_ / 32.0F, (float)(this.int_ + (int)this.package_()) / 32.0F)
            .break_(32, 32, 32, 255)
            .class_();
         var7.break_();
      }

      int var9 = this.continue_();
      int var10 = this.int_ + 4 - (int)this.package_();
      if (this.catch_) {
         this.class_(var1, var9, var10, var7);
      }

      this.class_(var1, var9, var10, var2, var3, var4);
      if (this.extends_) {
         this.native_.A().class_(ch_3.break_);
         RenderSystem.enableDepthTest();
         RenderSystem.depthFunc(519);
         var8.class_(7, ju_3.public_);
         var8.class_((double)this.super_, (double)this.int_, -100.0).class_(0.0F, (float)this.int_ / 32.0F).break_(64, 64, 64, 255).class_();
         var8.class_((double)(this.super_ + this.final_), (double)this.int_, -100.0)
            .class_((float)this.final_ / 32.0F, (float)this.int_ / 32.0F)
            .break_(64, 64, 64, 255)
            .class_();
         var8.class_((double)(this.super_ + this.final_), 0.0, -100.0).class_((float)this.final_ / 32.0F, 0.0F).break_(64, 64, 64, 255).class_();
         var8.class_((double)this.super_, 0.0, -100.0).class_(0.0F, 0.0F).break_(64, 64, 64, 255).class_();
         var8.class_((double)this.super_, (double)this.package_, -100.0).class_(0.0F, (float)this.package_ / 32.0F).break_(64, 64, 64, 255).class_();
         var8.class_((double)(this.super_ + this.final_), (double)this.package_, -100.0)
            .class_((float)this.final_ / 32.0F, (float)this.package_ / 32.0F)
            .break_(64, 64, 64, 255)
            .class_();
         var8.class_((double)(this.super_ + this.final_), (double)this.new_, -100.0)
            .class_((float)this.final_ / 32.0F, (float)this.new_ / 32.0F)
            .break_(64, 64, 64, 255)
            .class_();
         var8.class_((double)this.super_, (double)this.new_, -100.0).class_(0.0F, (float)this.new_ / 32.0F).break_(64, 64, 64, 255).class_();
         var7.break_();
         RenderSystem.depthFunc(515);
         RenderSystem.disableDepthTest();
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ZERO, MK.ONE);
         RenderSystem.disableAlphaTest();
         RenderSystem.shadeModel(7425);
         RenderSystem.disableTexture();
         var8.class_(7, ju_3.public_);
         var8.class_((double)this.super_, (double)(this.int_ + 4), 0.0).class_(0.0F, 1.0F).break_(0, 0, 0, 0).class_();
         var8.class_((double)this.continue_, (double)(this.int_ + 4), 0.0).class_(1.0F, 1.0F).break_(0, 0, 0, 0).class_();
         var8.class_((double)this.continue_, (double)this.int_, 0.0).class_(1.0F, 0.0F).break_(0, 0, 0, 255).class_();
         var8.class_((double)this.super_, (double)this.int_, 0.0).class_(0.0F, 0.0F).break_(0, 0, 0, 255).class_();
         var8.class_((double)this.super_, (double)this.new_, 0.0).class_(0.0F, 1.0F).break_(0, 0, 0, 255).class_();
         var8.class_((double)this.continue_, (double)this.new_, 0.0).class_(1.0F, 1.0F).break_(0, 0, 0, 255).class_();
         var8.class_((double)this.continue_, (double)(this.new_ - 4), 0.0).class_(1.0F, 0.0F).break_(0, 0, 0, 0).class_();
         var8.class_((double)this.super_, (double)(this.new_ - 4), 0.0).class_(0.0F, 0.0F).break_(0, 0, 0, 0).class_();
         var7.break_();
      }

      int var11 = this.int_();
      if (var11 > 0) {
         RenderSystem.disableTexture();
         int var12 = (int)((float)((this.new_ - this.int_) * (this.new_ - this.int_)) / (float)this.final_());
         var12 = rfU_2.class_(var12, 32, this.new_ - this.int_ - 8);
         int var13 = (int)this.package_() * (this.new_ - this.int_ - var12) / var11 + this.int_;
         if (var13 < this.int_) {
            var13 = this.int_;
         }

         var8.class_(7, ju_3.public_);
         var8.class_((double)var5, (double)this.new_, 0.0).class_(0.0F, 1.0F).break_(0, 0, 0, 255).class_();
         var8.class_((double)var6, (double)this.new_, 0.0).class_(1.0F, 1.0F).break_(0, 0, 0, 255).class_();
         var8.class_((double)var6, (double)this.int_, 0.0).class_(1.0F, 0.0F).break_(0, 0, 0, 255).class_();
         var8.class_((double)var5, (double)this.int_, 0.0).class_(0.0F, 0.0F).break_(0, 0, 0, 255).class_();
         var8.class_((double)var5, (double)(var13 + var12), 0.0).class_(0.0F, 1.0F).break_(128, 128, 128, 255).class_();
         var8.class_((double)var6, (double)(var13 + var12), 0.0).class_(1.0F, 1.0F).break_(128, 128, 128, 255).class_();
         var8.class_((double)var6, (double)var13, 0.0).class_(1.0F, 0.0F).break_(128, 128, 128, 255).class_();
         var8.class_((double)var5, (double)var13, 0.0).class_(0.0F, 0.0F).break_(128, 128, 128, 255).class_();
         var8.class_((double)var5, (double)(var13 + var12 - 1), 0.0).class_(0.0F, 1.0F).break_(192, 192, 192, 255).class_();
         var8.class_((double)(var6 - 1), (double)(var13 + var12 - 1), 0.0).class_(1.0F, 1.0F).break_(192, 192, 192, 255).class_();
         var8.class_((double)(var6 - 1), (double)var13, 0.0).class_(1.0F, 0.0F).break_(192, 192, 192, 255).class_();
         var8.class_((double)var5, (double)var13, 0.0).class_(0.0F, 0.0F).break_(192, 192, 192, 255).class_();
         var7.break_();
      }

      this.class_(var1, var2, var3);
      RenderSystem.enableTexture();
      RenderSystem.shadeModel(7424);
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public void class_(E var1) {
      this.implements_ = (E)var1;
   }

   protected void class_(Ml_1 var1, int var2, int var3, int var4, int var5, float var6) {
      int var7 = this.volatile_();
      yb_3 var8 = yb_3.class_();
      lD_2 var9 = var8.byte_();

      for (int var10 = 0; var10 < var7; var10++) {
         int var11 = this.case_(var10);
         int var12 = this.implements_(var10);
         if (var12 >= this.int_ && var11 <= this.new_) {
            int var13 = var3 + var10 * this.volatile_ + this.else_;
            int var14 = this.volatile_ - 4;
            Lt_1 var15 = this.byte_(var10);
            if (var15 != null) {
               int var16 = this.F_();
               int var17 = this.super_ + this.final_ / 2 - var16 / 2;
               int var18 = this.super_ + this.final_ / 2 + var16 / 2;
               if (this.case_ && this.protected_(var10)) {
                  RenderSystem.disableTexture();
                  float var19 = this.class_() ? 1.0F : 0.5F;
                  RenderSystem.color4f(var19, var19, var19, 1.0F);
                  var9.class_(7, ju_3.super_);
                  var9.class_((double)var17, (double)(var13 + var14 + 2), 0.0).class_();
                  var9.class_((double)var18, (double)(var13 + var14 + 2), 0.0).class_();
                  var9.class_((double)var18, (double)(var13 - 2), 0.0).class_();
                  var9.class_((double)var17, (double)(var13 - 2), 0.0).class_();
                  var8.break_();
                  RenderSystem.color4f(0.0F, 0.0F, 0.0F, 1.0F);
                  var9.class_(7, ju_3.super_);
                  var9.class_((double)(var17 + 1), (double)(var13 + var14 + 1), 0.0).class_();
                  var9.class_((double)(var18 - 1), (double)(var13 + var14 + 1), 0.0).class_();
                  var9.class_((double)(var18 - 1), (double)(var13 - 1), 0.0).class_();
                  var9.class_((double)(var17 + 1), (double)(var13 - 1), 0.0).class_();
                  var8.break_();
                  RenderSystem.enableTexture();
               }

               int var20 = this.continue_();
               var15.class_(
                  var1,
                  var10,
                  var11,
                  var20,
                  var16,
                  var14,
                  var4,
                  var5,
                  this.break_((double)var4, (double)var5) && Objects.equals(this.protected_((double)var4, (double)var5), var15),
                  var6
               );
            }
         }
      }
   }

   protected void class_(Collection<E> var1) {
      this.class_.clear();
      this.class_.addAll(var1);
   }

   protected boolean class_() {
      return false;
   }

   public void class_(boolean var1, int var2) {
      this.catch_ = var1;
      this.else_ = var2;
      if (!var1) {
         this.else_ = 0;
      }
   }

   protected void class_(Lw_1 var1, Predicate<E> var2) {
      int var3 = var1 == Lw_1.UP ? -1 : 1;
      if (!this.x_().isEmpty()) {
         int var4 = this.x_().indexOf(this.finally_());

         while (true) {
            int var5 = rfU_2.class_(var4 + var3, 0, this.volatile_() - 1);
            if (var4 == var5) {
               break;
            }

            Lt_1 var6 = this.x_().get(var5);
            if (var2.test(var6)) {
               this.class_((E)var6);
               this.protected_((E)var6);
               break;
            }

            var4 = var5;
         }
      }
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      this.byte_(var1, var3, var5);
      if (!this.break_(var1, var3)) {
         return false;
      } else {
         Lt_1 var6 = this.protected_(var1, var3);
         if (var6 != null) {
            if (var6.break_(var1, var3, var5)) {
               this.class_(var6);
               this.class_(true);
               return true;
            }
         } else if (var5 == 0) {
            this.class_((int)(var1 - (double)(this.super_ + this.final_ / 2 - this.F_() / 2)), (int)(var3 - (double)this.int_) + (int)this.package_() - 4);
            return true;
         }

         return this.private_;
      }
   }

   public void break_(int var1) {
      this.synchronized_ = var1;
   }

   public void break_(int var1, int var2, int var3, int var4) {
      this.final_ = var1;
      this.package_ = var2;
      this.int_ = var3;
      this.new_ = var4;
      this.super_ = 0;
      this.continue_ = var1;
   }

   @Override
   public boolean break_(double var1, double var3) {
      return var3 >= (double)this.int_ && var3 <= (double)this.new_ && var1 >= (double)this.super_ && var1 <= (double)this.continue_;
   }

   protected int break_(E var1) {
      this.class_.add((E)var1);
      return this.class_.size() - 1;
   }

   public void throws_(int var1) {
      this.super_ = var1;
      this.continue_ = var1 + this.final_;
   }

   public void throws_(boolean var1) {
      this.extends_ = var1;
   }

   public boolean throws_(E var1) {
      boolean var2 = this.class_.remove(var1);
      if (var2 && var1 == this.finally_()) {
         this.class_(null);
      }

      return var2;
   }

   public E finally_() {
      return this.implements_;
   }

   protected E catch_(int var1) {
      Lt_1 var2 = this.class_.get(var1);
      return (E)(this.throws_(this.class_.get(var1)) ? var2 : null);
   }

   public E extends_() {
      return (E)super.catch_();
   }

   void case_(Lt_1<E> var1) {
      var1.class_ = this;
   }

   protected int case_(int var1) {
      return this.int_ + 4 - (int)this.package_() + var1 * this.volatile_ + this.else_;
   }

   public int continue_() {
      return this.super_ + this.final_ / 2 - this.F_() / 2 + 2;
   }

   private int implements_(int var1) {
      return this.case_(var1) + this.volatile_;
   }

   protected void new_() {
      Lt_1 var1 = this.finally_();
      if (var1 != null) {
         this.class_((E)var1);
         this.protected_((E)var1);
      }
   }

   public double package_() {
      return this.throws_;
   }

   public int super_() {
      return this.continue_() + this.F_();
   }

   public void protected_(boolean var1) {
      this.finally_ = var1;
   }

   protected void protected_(E var1) {
      int var2 = this.case_(this.x_().indexOf(var1));
      int var3 = var2 - this.int_ - 4 - this.volatile_;
      if (var3 < 0) {
         this.private_(var3);
      }

      int var4 = this.new_ - var2 - this.volatile_ - this.volatile_;
      if (var4 < 0) {
         this.private_(-var4);
      }
   }

   protected final E protected_(double var1, double var3) {
      int var5 = this.F_() / 2;
      int var6 = this.super_ + this.final_ / 2;
      int var7 = var6 - var5;
      int var8 = var6 + var5;
      int var9 = rfU_2.byte_(var3 - (double)this.int_) - this.else_ + (int)this.package_() - 4;
      int var10 = var9 / this.volatile_;
      return var1 < (double)this.protected_() && var1 >= (double)var7 && var1 <= (double)var8 && var10 >= 0 && var9 >= 0 && var10 < this.volatile_()
         ? this.x_().get(var10)
         : null;
   }

   protected boolean protected_(int var1) {
      return Objects.equals(this.finally_(), this.x_().get(var1));
   }

   protected int protected_() {
      return this.final_ / 2 + 124;
   }

   private void private_(int var1) {
      this.class_(this.package_() + (double)var1);
   }

   protected int final_() {
      return this.volatile_() * this.volatile_ + this.else_;
   }

   protected int volatile_() {
      return this.x_().size();
   }

   protected final void native_() {
      this.class_.clear();
   }

   @Override
   public final List<E> x_() {
      return this.class_;
   }

   public int F_() {
      return 220;
   }
}
