package celestial;

import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class ryr_3 extends rHK implements rHf_1, rXF {
   private static final int[] class_ = IntStream.range(0, 27).toArray();
   private rqs_3<rdn_3> break_ = rqs_3.class_(27, rdn_3.break_);
   private int byte_;
   private ryB_2 case_ = ryB_2.CLOSED;
   private float catch_;
   private float private_;
   @Nullable
   private rxL_2 implements_;
   private boolean finally_;

   public ryr_3(@Nullable rxL_2 var1) {
      super(ryW_2.return_);
      this.implements_ = var1;
   }

   public ryr_3() {
      this((rxL_2)null);
      this.finally_ = true;
   }

   @Override
   protected void class_(rqs_3<rdn_3> var1) {
      this.break_ = var1;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.protected_(var2);
   }

   public float class_(float var1) {
      return rfU_2.catch_(var1, this.private_, this.catch_);
   }

   @Override
   public boolean class_(int var1, rdn_3 var2, @Nullable rpr_3 var3) {
      return !(xd_3.class_(var2.break_()) instanceof Wp_1);
   }

   @Override
   public int[] class_(rpr_3 var1) {
      return class_;
   }

   @Override
   protected rJr_1 class_(int var1, rhz_3 var2) {
      return new rJV(var1, var2, this);
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      return this.throws_(var1);
   }

   public rfl_3 class_(xc_3 var1, float var2) {
      return this.class_(var1.byte_(Wp_1.volatile_), var2);
   }

   public rfl_3 class_(rpr_3 var1, float var2) {
      float var3 = this.class_(var2);
      return rjw_3.break_()
         .class_()
         .break_(
            (double)(0.5F * var3 * (float)var1.implements_()), (double)(0.5F * var3 * (float)var1.finally_()), (double)(0.5F * var3 * (float)var1.extends_())
         );
   }

   @Override
   public void break_(rhd_3 var1) {
      if (!var1.native_()) {
         this.byte_--;
         this.extends_.class_(this.native_, this.abstract_().break_(), 1, this.byte_);
         if (this.byte_ <= 0) {
            this.extends_.class_((rhd_3)null, this.native_, rqn_3.JO, rqL_2.BLOCKS, 0.5F, this.extends_.int_.nextFloat() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public boolean break_(int var1, rdn_3 var2, rpr_3 var3) {
      return true;
   }

   private rfl_3 break_(rpr_3 var1, float var2) {
      rpr_3 var3 = var1.case_();
      return this.class_(var1, var2).class_((double)var3.implements_(), (double)var3.finally_(), (double)var3.extends_());
   }

   public rcd_3 throws_(rcd_3 var1) {
      if (!this.byte_(var1)) {
         rXC.class_(var1, this.break_, false);
      }

      return var1;
   }

   @Override
   public void throws_() {
      this.catch_();
      if (this.case_ == ryB_2.OPENING || this.case_ == ryB_2.CLOSING) {
         this.native_();
      }
   }

   @Nullable
   public rxL_2 finally_() {
      if (this.finally_) {
         this.implements_ = Wp_1.class_(this.abstract_().break_());
         this.finally_ = false;
      }

      return this.implements_;
   }

   protected void catch_() {
      this.private_ = this.catch_;
      switch (this.case_) {
         case CLOSED:
            this.catch_ = 0.0F;
            break;
         case OPENING:
            this.catch_ += 0.1F;
            if (this.catch_ >= 1.0F) {
               this.native_();
               this.case_ = ryB_2.OPENED;
               this.catch_ = 1.0F;
               this.volatile_();
            }
            break;
         case CLOSING:
            this.catch_ -= 0.1F;
            if (this.catch_ <= 0.0F) {
               this.case_ = ryB_2.CLOSED;
               this.catch_ = 0.0F;
               this.volatile_();
            }
            break;
         case OPENED:
            this.catch_ = 1.0F;
      }
   }

   public boolean extends_() {
      return this.case_ == ryB_2.CLOSED;
   }

   @Override
   public int else_() {
      return this.break_.size();
   }

   public void protected_(rcd_3 var1) {
      this.break_ = rqs_3.class_(this.else_(), rdn_3.break_);
      if (!this.break_(var1) && var1.byte_("Items", 9)) {
         rXC.break_(var1, this.break_);
      }
   }

   public ryB_2 private_() {
      return this.case_;
   }

   private void volatile_() {
      this.abstract_().class_(this.while_(), this.char_(), 3);
   }

   private void native_() {
      xc_3 var1 = this.extends_.byte_(this.char_());
      if (var1.break_() instanceof Wp_1) {
         rpr_3 var2 = var1.byte_(Wp_1.volatile_);
         rfl_3 var3 = this.break_(var2, 1.0F).class_(this.native_);
         List var4 = this.extends_.class_((an_3)null, var3);
         if (!var4.isEmpty()) {
            for (int var5 = 0; var5 < var4.size(); var5++) {
               an_3 var6 = (an_3)var4.get(var5);
               if (var6.r_() != Qs_1.IGNORE) {
                  double var7 = 0.0;
                  double var9 = 0.0;
                  double var11 = 0.0;
                  rfl_3 var13 = var6.rN();
                  switch (var2.final_()) {
                     case X:
                        if (var2.throws_() == rpG_2.POSITIVE) {
                           var7 = var3.protected_ - var13.class_;
                        } else {
                           var7 = var13.protected_ - var3.class_;
                        }

                        var7 += 0.01;
                        break;
                     case Y:
                        if (var2.throws_() == rpG_2.POSITIVE) {
                           var9 = var3.throws_ - var13.break_;
                        } else {
                           var9 = var13.throws_ - var3.break_;
                        }

                        var9 += 0.01;
                        break;
                     case Z:
                        if (var2.throws_() == rpG_2.POSITIVE) {
                           var11 = var3.case_ - var13.byte_;
                        } else {
                           var11 = var13.case_ - var3.byte_;
                        }

                        var11 += 0.01;
                  }

                  var6.class_(iG_2.SHULKER_BOX, new rjU_2(var7 * (double)var2.implements_(), var9 * (double)var2.finally_(), var11 * (double)var2.extends_()));
               }
            }
         }
      }
   }

   @Override
   public boolean a_(int var1, int var2) {
      if (var1 == 1) {
         this.byte_ = var2;
         if (var2 == 0) {
            this.case_ = ryB_2.CLOSING;
            this.volatile_();
         }

         if (var2 == 1) {
            this.case_ = ryB_2.OPENING;
            this.volatile_();
         }

         return true;
      } else {
         return super.a_(var1, var2);
      }
   }

   @Override
   protected rqs_3<rdn_3> ad_() {
      return this.break_;
   }

   @Override
   public void b_(rhd_3 var1) {
      if (!var1.native_()) {
         if (this.byte_ < 0) {
            this.byte_ = 0;
         }

         this.byte_++;
         this.extends_.class_(this.native_, this.abstract_().break_(), 1, this.byte_);
         if (this.byte_ == 1) {
            this.extends_.class_((rhd_3)null, this.native_, rqn_3.Jh, rqL_2.BLOCKS, 0.5F, this.extends_.int_.nextFloat() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected rgP_2 X_() {
      return new rgn_3("container.shulkerBox");
   }
}
