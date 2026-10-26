package celestial;

import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class rHW extends ryO_2 implements rHf_1 {
   private long protected_;
   public int class_;
   public boolean break_;
   public rpr_3 byte_;
   private List<iB_2> throws_;
   private boolean case_;
   private int catch_;

   public rHW() {
      super(ryW_2.interface_);
   }

   private void class_(rYB var1) {
      if (!var1.continue_) {
         this.throws_.stream().filter(this::class_).forEach(this::break_);
      }
   }

   private boolean class_(iB_2 var1) {
      return var1.BM() && !(Boolean)var1.throws_[27] && this.char_().class_(var1.Ps(), 48.0) && var1.BC().class_(rlE_2.byte_);
   }

   public void class_(rpr_3 var1) {
      rfH_2 var2 = this.char_();
      this.byte_ = var1;
      if (this.break_) {
         this.class_ = 0;
      } else {
         this.break_ = true;
      }

      this.extends_.class_(var2, this.abstract_().break_(), 1, var1.byte_());
   }

   private void break_(iB_2 var1) {
      var1.break_(new rLY(rLD.public_, 60));
   }

   private void break_(rYB var1) {
      if (var1.continue_) {
         rfH_2 var2 = this.char_();
         MutableInt var3 = new MutableInt(16700985);
         int var4 = (int)this.throws_.stream().filter(var1x -> var2.class_(var1x.Ps(), 48.0)).count();
         this.throws_
            .stream()
            .filter(this::class_)
            .forEach(
               var4x -> {
                  float var5 = 1.0F;
                  float var6 = rfU_2.class_(
                     (var4x.rx() - (double)var2.b_()) * (var4x.rx() - (double)var2.b_()) + (var4x.BO() - (double)var2.d_()) * (var4x.BO() - (double)var2.d_())
                  );
                  double var7 = (double)((float)var2.b_() + 0.5F) + (double)(1.0F / var6) * (var4x.rx() - (double)var2.b_());
                  double var9 = (double)((float)var2.d_() + 0.5F) + (double)(1.0F / var6) * (var4x.BO() - (double)var2.d_());
                  int var11 = rfU_2.class_((var4 - 21) / -2, 3, 15);

                  for (int var12 = 0; var12 < var11; var12++) {
                     int var13 = var3.addAndGet(5);
                     double var14 = (double)ryj_3.break_(var13) / 255.0;
                     double var16 = (double)ryj_3.byte_(var13) / 255.0;
                     double var18 = (double)ryj_3.protected_(var13) / 255.0;
                     var1.class_(rLQ.else_, var7, (double)((float)var2.c_() + 0.5F), var9, var14, var16, var18);
                  }
               }
            );
      }
   }

   @Override
   public void throws_() {
      if (this.break_) {
         this.class_++;
      }

      if (this.class_ >= 50) {
         this.break_ = false;
         this.class_ = 0;
      }

      if (this.class_ >= 5 && this.catch_ == 0 && this.finally_()) {
         this.case_ = true;
         this.catch_();
      }

      if (this.case_) {
         if (this.catch_ < 40) {
            this.catch_++;
         } else {
            this.class_(this.extends_);
            this.break_(this.extends_);
            this.case_ = false;
         }
      }
   }

   private boolean finally_() {
      rfH_2 var1 = this.char_();

      for (iB_2 var3 : this.throws_) {
         if (var3.BM() && !(Boolean)var3.throws_[27] && var1.class_(var3.Ps(), 32.0) && var3.BC().class_(rlE_2.byte_)) {
            return true;
         }
      }

      return false;
   }

   private void catch_() {
      this.extends_.class_((rhd_3)null, this.char_(), rqn_3.g, rqL_2.BLOCKS, 1.0F, 1.0F);
   }

   private void private_() {
      rfH_2 var1 = this.char_();
      if (this.extends_.r() > this.protected_ + 60L || this.throws_ == null) {
         this.protected_ = this.extends_.r();
         rfl_3 var2 = new rfl_3(var1).class_(48.0);
         this.throws_ = this.extends_.class_(iB_2.class, var2);
      }

      if (!this.extends_.continue_) {
         for (iB_2 var3 : this.throws_) {
            if (var3.BM() && !(Boolean)var3.throws_[27] && var1.class_(var3.Ps(), 32.0)) {
               var3.SF().class_(il_3.throw_, this.extends_.r());
            }
         }
      }
   }

   @Override
   public boolean a_(int var1, int var2) {
      if (var1 == 1) {
         this.private_();
         this.catch_ = 0;
         this.byte_ = rpr_3.class_(var2);
         this.class_ = 0;
         this.break_ = true;
         return true;
      } else {
         return super.a_(var1, var2);
      }
   }
}
