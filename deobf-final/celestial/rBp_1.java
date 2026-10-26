package celestial;

import java.util.EnumSet;

public abstract class rBp_1 extends rBk_1 {
   protected final aA_2 class_;
   public final double break_;
   protected int byte_;
   protected int protected_;
   private int catch_;
   protected rfH_2 throws_ = rfH_2.protected_;
   private boolean private_;
   private final int implements_;
   private final int finally_;
   protected int case_;

   @Override
   public void byte_() {
      this.catch_();
      this.protected_ = 0;
      this.catch_ = this.class_.Sa().nextInt(this.class_.Sa().nextInt(1200) + 1200) + 1200;
   }

   public rBp_1(aA_2 var1, double var2, int var4) {
      this(var1, var2, var4, 1);
   }

   public rBp_1(aA_2 var1, double var2, int var4, int var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.implements_ = var4;
      this.case_ = 0;
      this.finally_ = var5;
      this.class_(EnumSet.of(rBW.MOVE, rBW.JUMP));
   }

   protected abstract boolean class_(rRR var1, rfH_2 var2);

   @Override
   public boolean class_() {
      if (this.byte_ > 0) {
         this.byte_--;
         return false;
      } else {
         this.byte_ = this.class_(this.class_);
         return this.volatile_();
      }
   }

   protected int class_(aA_2 var1) {
      return 200 + var1.Sa().nextInt(200);
   }

   @Override
   public boolean break_() {
      return this.protected_ >= -this.catch_ && this.protected_ <= 1200 && this.class_((rYB)this.class_.throws_[7], this.throws_);
   }

   @Override
   public void throws_() {
      rfH_2 var1 = this.finally_();
      if (!var1.class_(this.class_.Ps(), this.private_())) {
         this.private_ = false;
         this.protected_++;
         if (this.extends_()) {
            this.class_.public_().class_((double)((float)var1.b_()) + 0.5, (double)var1.c_(), (double)((float)var1.d_()) + 0.5, this.break_);
         }
      } else {
         this.private_ = true;
         this.protected_--;
      }
   }

   protected rfH_2 finally_() {
      return this.throws_.final_();
   }

   protected void catch_() {
      this.class_
         .public_()
         .class_((double)((float)this.throws_.b_()) + 0.5, (double)(this.throws_.c_() + 1), (double)((float)this.throws_.d_()) + 0.5, this.break_);
   }

   public boolean extends_() {
      return this.protected_ % 40 == 0;
   }

   public double private_() {
      return 1.0;
   }

   protected boolean volatile_() {
      int var1 = this.implements_;
      int var2 = this.finally_;
      rfH_2 var3 = this.class_.Bs();
      rfw_3 var4 = new rfw_3();

      for (int var5 = this.case_; var5 <= var2; var5 = var5 > 0 ? -var5 : 1 - var5) {
         for (int var6 = 0; var6 < var1; var6++) {
            for (int var7 = 0; var7 <= var6; var7 = var7 > 0 ? -var7 : 1 - var7) {
               for (int var8 = var7 < var6 && var7 > -var6 ? var6 : 0; var8 <= var6; var8 = var8 > 0 ? -var8 : 1 - var8) {
                  var4.class_(var3, var7, var5 - 1, var8);
                  if (this.class_.private_(var4) && this.class_((rYB)this.class_.throws_[7], var4)) {
                     this.throws_ = var4;
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   protected boolean native_() {
      return this.private_;
   }
}
