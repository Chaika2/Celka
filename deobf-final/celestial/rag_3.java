package celestial;

import java.util.List;
import java.util.Random;

public class rag_3 extends raR_2 {
   private final rpr_3 break_;
   private final boolean byte_;

   public rag_3(int var1, rfi_3 var2, rpr_3 var3, raU_2 var4) {
      super(raF_2.break_, var1, var4);
      this.break_ = var3;
      this.final_ = var2;
      this.byte_ = var2.throws_() > 3;
   }

   public rag_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.break_, var2);
      this.byte_ = var2.new_("tf");
      this.break_ = rpr_3.break_(var2.private_("D"));
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      int var4 = this.private_();
      switch (this.break_) {
         case NORTH:
         default:
            raf_3.class_(var1, var2, var3, this.final_.class_ + 1, this.final_.break_, this.final_.byte_ - 1, rpr_3.NORTH, var4);
            raf_3.class_(var1, var2, var3, this.final_.class_ - 1, this.final_.break_, this.final_.byte_ + 1, rpr_3.WEST, var4);
            raf_3.class_(var1, var2, var3, this.final_.protected_ + 1, this.final_.break_, this.final_.byte_ + 1, rpr_3.EAST, var4);
            break;
         case SOUTH:
            raf_3.class_(var1, var2, var3, this.final_.class_ + 1, this.final_.break_, this.final_.case_ + 1, rpr_3.SOUTH, var4);
            raf_3.class_(var1, var2, var3, this.final_.class_ - 1, this.final_.break_, this.final_.byte_ + 1, rpr_3.WEST, var4);
            raf_3.class_(var1, var2, var3, this.final_.protected_ + 1, this.final_.break_, this.final_.byte_ + 1, rpr_3.EAST, var4);
            break;
         case WEST:
            raf_3.class_(var1, var2, var3, this.final_.class_ + 1, this.final_.break_, this.final_.byte_ - 1, rpr_3.NORTH, var4);
            raf_3.class_(var1, var2, var3, this.final_.class_ + 1, this.final_.break_, this.final_.case_ + 1, rpr_3.SOUTH, var4);
            raf_3.class_(var1, var2, var3, this.final_.class_ - 1, this.final_.break_, this.final_.byte_ + 1, rpr_3.WEST, var4);
            break;
         case EAST:
            raf_3.class_(var1, var2, var3, this.final_.class_ + 1, this.final_.break_, this.final_.byte_ - 1, rpr_3.NORTH, var4);
            raf_3.class_(var1, var2, var3, this.final_.class_ + 1, this.final_.break_, this.final_.case_ + 1, rpr_3.SOUTH, var4);
            raf_3.class_(var1, var2, var3, this.final_.protected_ + 1, this.final_.break_, this.final_.byte_ + 1, rpr_3.EAST, var4);
      }

      if (this.byte_) {
         if (var3.nextBoolean()) {
            raf_3.class_(var1, var2, var3, this.final_.class_ + 1, this.final_.break_ + 3 + 1, this.final_.byte_ - 1, rpr_3.NORTH, var4);
         }

         if (var3.nextBoolean()) {
            raf_3.class_(var1, var2, var3, this.final_.class_ - 1, this.final_.break_ + 3 + 1, this.final_.byte_ + 1, rpr_3.WEST, var4);
         }

         if (var3.nextBoolean()) {
            raf_3.class_(var1, var2, var3, this.final_.protected_ + 1, this.final_.break_ + 3 + 1, this.final_.byte_ + 1, rpr_3.EAST, var4);
         }

         if (var3.nextBoolean()) {
            raf_3.class_(var1, var2, var3, this.final_.class_ + 1, this.final_.break_ + 3 + 1, this.final_.case_ + 1, rpr_3.SOUTH, var4);
         }
      }
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (this.class_(var1, var5)) {
         return false;
      } else {
         xc_3 var8 = this.break_();
         if (this.byte_) {
            this.class_(
               var1,
               var5,
               this.final_.class_ + 1,
               this.final_.break_,
               this.final_.byte_,
               this.final_.protected_ - 1,
               this.final_.break_ + 3 - 1,
               this.final_.case_,
               volatile_,
               volatile_,
               false
            );
            this.class_(
               var1,
               var5,
               this.final_.class_,
               this.final_.break_,
               this.final_.byte_ + 1,
               this.final_.protected_,
               this.final_.break_ + 3 - 1,
               this.final_.case_ - 1,
               volatile_,
               volatile_,
               false
            );
            this.class_(
               var1,
               var5,
               this.final_.class_ + 1,
               this.final_.throws_ - 2,
               this.final_.byte_,
               this.final_.protected_ - 1,
               this.final_.throws_,
               this.final_.case_,
               volatile_,
               volatile_,
               false
            );
            this.class_(
               var1,
               var5,
               this.final_.class_,
               this.final_.throws_ - 2,
               this.final_.byte_ + 1,
               this.final_.protected_,
               this.final_.throws_,
               this.final_.case_ - 1,
               volatile_,
               volatile_,
               false
            );
            this.class_(
               var1,
               var5,
               this.final_.class_ + 1,
               this.final_.break_ + 3,
               this.final_.byte_ + 1,
               this.final_.protected_ - 1,
               this.final_.break_ + 3,
               this.final_.case_ - 1,
               volatile_,
               volatile_,
               false
            );
         } else {
            this.class_(
               var1,
               var5,
               this.final_.class_ + 1,
               this.final_.break_,
               this.final_.byte_,
               this.final_.protected_ - 1,
               this.final_.throws_,
               this.final_.case_,
               volatile_,
               volatile_,
               false
            );
            this.class_(
               var1,
               var5,
               this.final_.class_,
               this.final_.break_,
               this.final_.byte_ + 1,
               this.final_.protected_,
               this.final_.throws_,
               this.final_.case_ - 1,
               volatile_,
               volatile_,
               false
            );
         }

         this.class_(var1, var5, this.final_.class_ + 1, this.final_.break_, this.final_.byte_ + 1, this.final_.throws_);
         this.class_(var1, var5, this.final_.class_ + 1, this.final_.break_, this.final_.case_ - 1, this.final_.throws_);
         this.class_(var1, var5, this.final_.protected_ - 1, this.final_.break_, this.final_.byte_ + 1, this.final_.throws_);
         this.class_(var1, var5, this.final_.protected_ - 1, this.final_.break_, this.final_.case_ - 1, this.final_.throws_);

         for (int var9 = this.final_.class_; var9 <= this.final_.protected_; var9++) {
            for (int var10 = this.final_.byte_; var10 <= this.final_.case_; var10++) {
               if (this.class_(var1, var9, this.final_.break_ - 1, var10, var5).catch_() && this.class_(var1, var9, this.final_.break_ - 1, var10, var5)) {
                  this.class_(var1, var8, var9, this.final_.break_ - 1, var10, var5);
               }
            }
         }

         return true;
      }
   }

   private void class_(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6) {
      if (!this.class_(var1, var3, var6 + 1, var5, var2).catch_()) {
         this.class_(var1, var2, var3, var4, var5, var3, var6, var5, this.break_(), volatile_, false);
      }
   }

   public static rfi_3 class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5) {
      rfi_3 var6 = new rfi_3(var2, var3, var4, var2, var3 + 3 - 1, var4);
      if (var1.nextInt(4) == 0) {
         var6.throws_ += 4;
      }

      switch (var5) {
         case NORTH:
         default:
            var6.class_ = var2 - 1;
            var6.protected_ = var2 + 3;
            var6.byte_ = var4 - 4;
            break;
         case SOUTH:
            var6.class_ = var2 - 1;
            var6.protected_ = var2 + 3;
            var6.case_ = var4 + 3 + 1;
            break;
         case WEST:
            var6.class_ = var2 - 4;
            var6.byte_ = var4 - 1;
            var6.case_ = var4 + 3;
            break;
         case EAST:
            var6.protected_ = var2 + 3 + 1;
            var6.byte_ = var4 - 1;
            var6.case_ = var4 + 3;
      }

      return rrrn_1.class_(var0, var6) != null ? null : var6;
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("tf", this.byte_);
      var1.break_("D", this.break_.protected_());
   }
}
