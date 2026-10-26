package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lu_1 extends LZ implements cC_2, cp_3, rrvs_1 {
   private final cm_3 class_;
   private String throws_ = "";
   private rgP_2 case_;
   private int catch_ = 32;
   private int private_;
   private boolean implements_ = true;
   private boolean super_ = true;
   private boolean this_ = true;
   private boolean else_;
   private int synchronized_;
   private int return_;
   private int public_;
   private int goto_ = 14737632;
   private int while_ = 7368816;
   private String try_;
   private Consumer<String> instanceof_;
   private Predicate<String> throw_ = Objects::nonNull;
   private BiFunction<String, Integer, rpl_3> interface_ = this.continue_();

   public Lu_1 byte_(String var1) {
      this.try_ = var1;
      return this;
   }

   public void byte_(boolean var1) {
      super.implements_(var1);
   }

   public void byte_(int var1) {
      if (!this.throws_.isEmpty()) {
         if (this.public_ != this.return_) {
            this.break_("");
         } else {
            this.protected_(this.throws_(var1) - this.return_);
         }
      }
   }

   public boolean int_() {
      return this.new_;
   }

   public Lu_1(cm_3 var1, int var2, int var3, int var4, int var5, rgP_2 var6) {
      this(var1, var2, var3, var4, var5, (Lu_1)null, var6, true);
   }

   public Lu_1(cm_3 var1, int var2, int var3, int var4, int var5, Lu_1 var6, rgP_2 var7, boolean var8) {
      super(var2, var3, var4, var5, var7);
      this.class_ = var1;
      if (var6 != null) {
         this.class_(var6.private_());
      }

      if (var8) {
         vs_3.INSTANCE.class_(this);
      }
   }

   public float this_() {
      return (float)this.final_;
   }

   private int class_(int var1, int var2) {
      return this.class_(var1, var2, true);
   }

   private int class_(int var1, int var2, boolean var3) {
      int var4 = var2;
      boolean var5 = var1 < 0;
      int var6 = Math.abs(var1);

      for (int var7 = 0; var7 < var6; var7++) {
         if (!var5) {
            int var8 = this.throws_.length();
            var4 = this.throws_.indexOf(32, var4);
            if (var4 == -1) {
               var4 = var8;
            } else {
               while (var3 && var4 < var8 && this.throws_.charAt(var4) == ' ') {
                  var4++;
               }
            }
         } else {
            while (var3 && var4 > 0 && this.throws_.charAt(var4 - 1) == ' ') {
               var4--;
            }

            while (var4 > 0 && this.throws_.charAt(var4 - 1) != ' ') {
               var4--;
            }
         }
      }

      return var4;
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (!this.volatile_()) {
         return false;
      } else {
         this.else_ = vm_3.synchronized_();
         if (vm_3.private_(var1)) {
            this.native_();
            this.native_(0);
            return true;
         } else if (vm_3.catch_(var1)) {
            ((Qj_1)QY.instanceof_().class_[23]).class_(this.implements_());
            return true;
         } else if (vm_3.case_(var1)) {
            if (this.this_) {
               this.break_(((Qj_1)QY.instanceof_().class_[23]).class_());
            }

            return true;
         } else if (vm_3.throws_(var1)) {
            ((Qj_1)QY.instanceof_().class_[23]).class_(this.implements_());
            if (this.this_) {
               this.break_("");
            }

            return true;
         } else {
            switch (var1) {
               case 259:
                  if (this.this_) {
                     this.else_ = false;
                     this.new_(-1);
                     this.else_ = vm_3.synchronized_();
                  }

                  return true;
               case 260:
               case 264:
               case 265:
               case 266:
               case 267:
               default:
                  return false;
               case 261:
                  if (this.this_) {
                     this.else_ = false;
                     this.new_(1);
                     this.else_ = vm_3.synchronized_();
                  }

                  return true;
               case 262:
                  if (vm_3.else_()) {
                     this.catch_(this.throws_(1));
                  } else {
                     this.case_(1);
                  }

                  return true;
               case 263:
                  if (vm_3.else_()) {
                     this.catch_(this.throws_(-1));
                  } else {
                     this.case_(-1);
                  }

                  return true;
               case 268:
                  this.extends_();
                  return true;
               case 269:
                  this.native_();
                  return true;
            }
         }
      }
   }

   @Override
   public boolean class_(char var1, int var2) {
      if (!this.volatile_()) {
         return false;
      } else if (rqu_3.class_(var1)) {
         if (this.this_) {
            this.break_(Character.toString(var1));
         }

         return true;
      } else {
         return false;
      }
   }

   public Lu_1 class_(rgP_2 var1) {
      this.case_ = var1;
      return this;
   }

   public void class_(Predicate<String> var1) {
      this.throw_ = var1;
   }

   public void class_(String var1) {
      if (this.throw_.test(var1)) {
         if (var1.length() > this.catch_) {
            this.throws_ = var1.substring(0, this.catch_);
         } else {
            this.throws_ = var1;
         }

         this.native_();
         this.native_(this.return_);
         this.protected_(var1);
      }
   }

   public void class_(BiFunction<String, Integer, rpl_3> var1) {
      this.interface_ = var1;
   }

   public void class_(Consumer<String> var1) {
      this.instanceof_ = var1;
   }

   @Override
   public boolean break_(boolean var1) {
      return this.new_ && this.this_ ? super.break_(var1) : false;
   }

   @Override
   public boolean break_(double var1, double var3) {
      return this.new_
         && var1 >= (double)this.volatile_
         && var1 < (double)(this.volatile_ + this.extends_)
         && var3 >= (double)this.final_
         && var3 < (double)(this.final_ + this.native_);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (!this.int_()) {
         return false;
      } else {
         boolean var6 = var1 >= (double)this.volatile_
            && var1 < (double)(this.volatile_ + this.extends_)
            && var3 >= (double)this.final_
            && var3 < (double)(this.final_ + this.native_);
         if (this.super_) {
            this.byte_(var6);
         }

         if (this.aO_() && var6 && var5 == 0) {
            int var7 = rfU_2.byte_(var1) - this.volatile_;
            if (this.implements_) {
               var7 -= 4;
            }

            String var8 = this.class_.class_(this.throws_.substring(this.synchronized_), this.package_());
            this.catch_(this.class_.class_(var8, var7).length() + this.synchronized_);
            return true;
         } else {
            return false;
         }
      }
   }

   private void break_(int var1, int var2, int var3, int var4) {
      if (var1 < var3) {
         int var5 = var1;
         var1 = var3;
         var3 = var5;
      }

      if (var2 < var4) {
         int var7 = var2;
         var2 = var4;
         var4 = var7;
      }

      if (var3 > this.volatile_ + this.extends_) {
         var3 = this.volatile_ + this.extends_;
      }

      if (var1 > this.volatile_ + this.extends_) {
         var1 = this.volatile_ + this.extends_;
      }

      yb_3 var8 = yb_3.class_();
      lD_2 var6 = var8.byte_();
      RenderSystem.color4f(0.0F, 0.0F, 255.0F, 255.0F);
      RenderSystem.disableTexture();
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(Ma_1.OR_REVERSE);
      var6.class_(7, ju_3.super_);
      var6.class_((double)var1, (double)var4, 0.0).class_();
      var6.class_((double)var3, (double)var4, 0.0).class_();
      var6.class_((double)var3, (double)var2, 0.0).class_();
      var6.class_((double)var1, (double)var2, 0.0).class_();
      var8.break_();
      RenderSystem.disableColorLogicOp();
      RenderSystem.enableTexture();
   }

   public void break_(String var1) {
      int var2 = this.return_ < this.public_ ? this.return_ : this.public_;
      int var3 = this.return_ < this.public_ ? this.public_ : this.return_;
      int var4 = this.catch_ - this.throws_.length() - (var2 - var3);
      String var5 = rqu_3.class_(var1);
      int var6 = var5.length();
      if (var4 < var6) {
         var5 = var5.substring(0, var4);
         var6 = var4;
      }

      String var7 = new StringBuilder(this.throws_).replace(var2, var3, var5).toString();
      if (this.throw_.test(var7)) {
         this.throws_ = var7;
         this.private_(var2 + var6);
         this.native_(this.return_);
         this.protected_(this.throws_);
      }
   }

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      if (this.int_()) {
         boolean var5 = this.aO_();
         if (this.while_()) {
            int var6 = var5 ? -1 : -6250336;
            class_(var1, this.volatile_ - 1, this.final_ - 1, this.volatile_ + this.extends_ + 1, this.final_ + this.native_ + 1, var6);
            class_(var1, this.volatile_, this.final_, this.volatile_ + this.extends_, this.final_ + this.native_, -16777216);
         }

         int var18 = this.this_ ? this.goto_ : this.while_;
         int var7 = this.return_ - this.synchronized_;
         int var8 = this.public_ - this.synchronized_;
         String var9 = this.class_.class_(this.throws_.substring(this.synchronized_), this.package_());
         boolean var10 = var7 >= 0 && var7 <= var9.length();
         boolean var11 = var5 && this.private_ / 6 % 2 == 0 && var10;
         int var12 = this.implements_ ? this.volatile_ + 4 : this.volatile_;
         int var13 = this.implements_ ? this.final_ + (this.native_ - 8) / 2 : this.final_;
         int var14 = var12;
         if (var8 > var9.length()) {
            var8 = var9.length();
         }

         if (!var9.isEmpty()) {
            String var15 = var10 ? var9.substring(0, var7) : var9;
            var14 = this.class_.class_(var1, this.interface_.apply(var15, this.synchronized_), (float)var12, (float)var13, var18);
         }

         boolean var19 = this.return_ < this.throws_.length() || this.throws_.length() >= this.goto_();
         int var16 = var14;
         if (!var10) {
            var16 = var7 > 0 ? var12 + this.extends_ : var12;
         } else if (var19) {
            var16 = var14 - 1;
            var14--;
         }

         if (!var9.isEmpty() && var10 && var7 < var9.length()) {
            this.class_.class_(var1, this.interface_.apply(var9.substring(var7), this.return_), (float)var14, (float)var13, var18);
         }

         if (!var19 && this.try_ != null) {
            this.class_.class_(var1, this.try_, (float)(var16 - 1), (float)var13, -8355712);
         }

         if (!var5 && this.case_ != null && this.throws_.isEmpty()) {
            this.class_.break_(var1, this.case_, (float)(var16 - 1), (float)var13, var18);
         }

         if (var11) {
            if (var19) {
               ch_3.class_(var1, var16, var13 - 1, var16 + 1, var13 + 1 + 9, -3092272);
            } else {
               this.class_.class_(var1, "_", (float)var16, (float)var13, var18);
            }
         }

         if (var8 != var7) {
            int var17 = var12 + this.class_.break_(var9.substring(0, var8));
            this.break_(var16, var13 - 1, var17 - 1, var13 + 1 + 9);
         }
      }
   }

   @Override
   protected void throws_(boolean var1) {
      if (var1) {
         this.private_ = 0;
      }
   }

   public int throws_(int var1) {
      return this.class_(var1, this.final_());
   }

   public void finally_(int var1) {
      this.goto_ = var1;
   }

   public void catch_(boolean var1) {
      this.super_ = var1;
   }

   public void catch_(int var1) {
      this.private_(var1);
      if (!this.else_) {
         this.native_(this.return_);
      }

      this.protected_(this.throws_);
   }

   public void catch_() {
      this.private_++;
   }

   public void extends_(int var1) {
      this.while_ = var1;
   }

   public void extends_() {
      this.catch_(0);
   }

   private int goto_() {
      return this.catch_;
   }

   public void case_(int var1) {
      this.catch_(this.continue_(var1));
   }

   public void case_(boolean var1) {
      this.this_ = var1;
   }

   private int continue_(int var1) {
      return rqR_2.class_(this.throws_, this.return_, var1);
   }

   public BiFunction<String, Integer, rpl_3> continue_() {
      return (var0, var1) -> rpl_3.class_(var0, rgc_3.class_);
   }

   public Lu_1 implements_(int var1) {
      this.catch_ = var1;
      if (this.throws_.length() > var1) {
         this.throws_ = this.throws_.substring(0, var1);
         this.protected_(this.throws_);
      }

      return this;
   }

   public String implements_() {
      int var1 = this.return_ < this.public_ ? this.return_ : this.public_;
      int var2 = this.return_ < this.public_ ? this.public_ : this.return_;
      return this.throws_.substring(var1, var2);
   }

   public boolean new_() {
      return this.throws_ == null || this.throws_.isEmpty();
   }

   private void new_(int var1) {
      if (vm_3.else_()) {
         this.byte_(var1);
      } else {
         this.protected_(var1);
      }
   }

   public int package_() {
      return this.while_() ? this.extends_ - 8 : this.extends_;
   }

   public void package_(int var1) {
      this.final_ = var1;
   }

   public float super_() {
      return (float)this.volatile_;
   }

   private boolean try_() {
      return this.this_;
   }

   private boolean while_() {
      return this.implements_;
   }

   public void protected_(boolean var1) {
      this.implements_ = var1;
   }

   private void protected_(String var1) {
      if (this.instanceof_ != null) {
         this.instanceof_.accept(var1);
      }

      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrFg_1.class_(this, var1));
   }

   public void protected_(int var1) {
      if (!this.throws_.isEmpty()) {
         if (this.public_ != this.return_) {
            this.break_("");
         } else {
            int var2 = this.continue_(var1);
            int var3 = Math.min(var2, this.return_);
            int var4 = Math.max(var2, this.return_);
            if (var3 != var4) {
               String var5 = new StringBuilder(this.throws_).delete(var3, var4).toString();
               if (this.throw_.test(var5)) {
                  this.throws_ = var5;
                  this.catch_(var3);
               }
            }
         }
      }
   }

   public String private_() {
      return this.throws_;
   }

   public void private_(int var1) {
      this.return_ = rfU_2.class_(var1, 0, this.throws_.length());
   }

   public void private_(boolean var1) {
      this.new_ = var1;
   }

   public int final_() {
      return this.return_;
   }

   public void final_(int var1) {
      this.volatile_ = var1;
   }

   public int volatile_(int var1) {
      return var1 > this.throws_.length() ? this.volatile_ : this.volatile_ + this.class_.break_(this.throws_.substring(0, var1));
   }

   public boolean volatile_() {
      return this.int_() && this.aO_() && this.try_();
   }

   public void native_() {
      this.catch_(this.throws_.length());
   }

   public void native_(int var1) {
      int var2 = this.throws_.length();
      this.public_ = rfU_2.class_(var1, 0, var2);
      if (this.class_ != null) {
         if (this.synchronized_ > var2) {
            this.synchronized_ = var2;
         }

         int var3 = this.package_();
         String var4 = this.class_.class_(this.throws_.substring(this.synchronized_), var3);
         int var5 = var4.length() + this.synchronized_;
         if (this.public_ == this.synchronized_) {
            this.synchronized_ = this.synchronized_ - this.class_.class_(this.throws_, var3, true).length();
         }

         if (this.public_ > var5) {
            this.synchronized_ = this.synchronized_ + (this.public_ - var5);
         } else if (this.public_ <= this.synchronized_) {
            this.synchronized_ = this.synchronized_ - (this.synchronized_ - this.public_);
         }

         this.synchronized_ = rfU_2.class_(this.synchronized_, 0, var2);
      }
   }

   @Override
   protected rVi_1 A_() {
      rgP_2 var1 = this.C_();
      return new rgn_3("gui.narrate.editBox", var1, this.throws_);
   }
}
