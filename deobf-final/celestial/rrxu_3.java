package celestial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rrxu_3 {
   private int class_;
   private HU break_;
   private fj_3[] byte_;
   private boolean protected_;
   private boolean[] throws_ = new boolean[256];
   private List<rrxC_2> case_ = new ArrayList<>();
   private rrWH catch_ = new rrWH(16);
   private rrWH private_ = new rrWH(16);

   private void class_(int var1, int var2) {
      int var3 = var2 - var1;
      if (var3 > 0) {
         int var4 = var1 * 4;
         int var5 = var3 * 4;
         this.catch_.class_(var4);
         this.private_.class_(var5);
      }
   }

   private int class_(fj_3 var1, int var2) {
      this.catch_.break_();
      this.private_.break_();
      int var3 = -1;
      int var4 = -1;
      int var5 = this.class_ / 4;

      for (int var6 = var2; var6 < var5; var6++) {
         fj_3 var7 = this.byte_[var6];
         if (var7 == var1) {
            if (var4 < 0) {
               var4 = var6;
            }
         } else if (var4 >= 0) {
            this.class_(var4, var6);
            if (!this.protected_) {
               this.case_.add(new rrxC_2(var1, this.catch_.throws_(), this.private_.throws_()));
               return var6;
            }

            var4 = -1;
            if (var3 < 0) {
               var3 = var6;
            }
         }
      }

      if (var4 >= 0) {
         this.class_(var4, var5);
      }

      if (var3 < 0) {
         var3 = var5;
      }

      this.case_.add(new rrxC_2(var1, this.catch_.throws_(), this.private_.throws_()));
      return var3;
   }

   public rrxm_3 class_(int var1, HU var2, fj_3[] var3) {
      if (var3 == null) {
         return null;
      } else {
         this.class_ = var1;
         this.break_ = var2;
         this.byte_ = var3;
         this.protected_ = this.break_ != rrxA_2.protected_;
         int var4 = rrbb_3.rF().throws_();
         if (this.throws_.length <= var4) {
            this.throws_ = new boolean[var4 + 1];
         }

         Arrays.fill(this.throws_, false);
         this.case_.clear();
         int var5 = 0;
         int var6 = -1;
         int var7 = this.class_ / 4;

         for (int var8 = 0; var8 < var7; var8++) {
            fj_3 var9 = this.byte_[var8];
            if (var9 != null) {
               int var10 = var9.new_();
               if (!this.throws_[var10]) {
                  if (var9 == rrzJ_2.byte_) {
                     if (var6 < 0) {
                        var6 = var8;
                     }
                  } else {
                     var8 = this.class_(var9, var8) - 1;
                     var5++;
                     if (this.protected_) {
                        this.throws_[var10] = true;
                     }
                  }
               }
            }
         }

         if (var6 >= 0) {
            this.class_(rrzJ_2.byte_, var6);
            var5++;
         }

         rrxC_2[] var12 = this.case_.toArray(new rrxC_2[this.case_.size()]);
         return new rrxm_3(var12);
      }
   }
}
