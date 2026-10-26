package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class raY_2 extends raR_2 {
   private final List<rfi_3> break_ = Lists.newLinkedList();

   public raY_2(int var1, Random var2, int var3, int var4, raU_2 var5) {
      super(raF_2.byte_, var1, var5);
      this.class_ = var5;
      this.final_ = new rfi_3(var3, 50, var4, var3 + 7 + var2.nextInt(6), 54 + var2.nextInt(6), var4 + 7 + var2.nextInt(6));
   }

   public raY_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.byte_, var2);
      rcy_3 var3 = var2.protected_("Entrances", 11);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         this.break_.add(new rfi_3(var3.case_(var4)));
      }
   }

   @Override
   public void class_(int var1, int var2, int var3) {
      super.class_(var1, var2, var3);

      for (rfi_3 var5 : this.break_) {
         var5.class_(var1, var2, var3);
      }
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      rcy_3 var2 = new rcy_3();

      for (rfi_3 var4 : this.break_) {
         var2.add(var4.private_());
      }

      var1.class_("Entrances", var2);
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (this.class_(var1, var5)) {
         return false;
      } else {
         this.class_(
            var1,
            var5,
            this.final_.class_,
            this.final_.break_,
            this.final_.byte_,
            this.final_.protected_,
            this.final_.break_,
            this.final_.case_,
            xu_3.finally_.continue_(),
            volatile_,
            true
         );
         this.class_(
            var1,
            var5,
            this.final_.class_,
            this.final_.break_ + 1,
            this.final_.byte_,
            this.final_.protected_,
            Math.min(this.final_.break_ + 3, this.final_.throws_),
            this.final_.case_,
            volatile_,
            volatile_,
            false
         );

         for (rfi_3 var9 : this.break_) {
            this.class_(var1, var5, var9.class_, var9.throws_ - 2, var9.byte_, var9.protected_, var9.throws_, var9.case_, volatile_, volatile_, false);
         }

         this.class_(
            var1,
            var5,
            this.final_.class_,
            this.final_.break_ + 4,
            this.final_.byte_,
            this.final_.protected_,
            this.final_.throws_,
            this.final_.case_,
            volatile_,
            false
         );
         return true;
      }
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      int var4 = this.private_();
      int var5 = this.final_.throws_() - 3 - 1;
      if (var5 <= 0) {
         var5 = 1;
      }

      int var6 = 0;

      while (var6 < this.final_.protected_()) {
         var6 += var3.nextInt(this.final_.protected_());
         if (var6 + 3 > this.final_.protected_()) {
            break;
         }

         raR_2 var7 = raf_3.class_(
            var1, var2, var3, this.final_.class_ + var6, this.final_.break_ + var3.nextInt(var5) + 1, this.final_.byte_ - 1, rpr_3.NORTH, var4
         );
         if (var7 != null) {
            rfi_3 var8 = var7.catch_();
            this.break_.add(new rfi_3(var8.class_, var8.break_, this.final_.byte_, var8.protected_, var8.throws_, this.final_.byte_ + 1));
         }

         var6 += 4;
      }

      var6 = 0;

      while (var6 < this.final_.protected_()) {
         var6 += var3.nextInt(this.final_.protected_());
         if (var6 + 3 > this.final_.protected_()) {
            break;
         }

         raR_2 var16 = raf_3.class_(
            var1, var2, var3, this.final_.class_ + var6, this.final_.break_ + var3.nextInt(var5) + 1, this.final_.case_ + 1, rpr_3.SOUTH, var4
         );
         if (var16 != null) {
            rfi_3 var19 = var16.catch_();
            this.break_.add(new rfi_3(var19.class_, var19.break_, this.final_.case_ - 1, var19.protected_, var19.throws_, this.final_.case_));
         }

         var6 += 4;
      }

      var6 = 0;

      while (var6 < this.final_.case_()) {
         var6 += var3.nextInt(this.final_.case_());
         if (var6 + 3 > this.final_.case_()) {
            break;
         }

         raR_2 var17 = raf_3.class_(
            var1, var2, var3, this.final_.class_ - 1, this.final_.break_ + var3.nextInt(var5) + 1, this.final_.byte_ + var6, rpr_3.WEST, var4
         );
         if (var17 != null) {
            rfi_3 var20 = var17.catch_();
            this.break_.add(new rfi_3(this.final_.class_, var20.break_, var20.byte_, this.final_.class_ + 1, var20.throws_, var20.case_));
         }

         var6 += 4;
      }

      var6 = 0;

      while (var6 < this.final_.case_()) {
         var6 += var3.nextInt(this.final_.case_());
         if (var6 + 3 > this.final_.case_()) {
            break;
         }

         raR_2 var18 = raf_3.class_(
            var1, var2, var3, this.final_.protected_ + 1, this.final_.break_ + var3.nextInt(var5) + 1, this.final_.byte_ + var6, rpr_3.EAST, var4
         );
         if (var18 != null) {
            rfi_3 var21 = var18.catch_();
            this.break_.add(new rfi_3(this.final_.protected_ - 1, var21.break_, var21.byte_, this.final_.protected_, var21.throws_, var21.case_));
         }

         var6 += 4;
      }
   }
}
