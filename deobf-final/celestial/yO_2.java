package celestial;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class yO_2 {
   protected final yX_2 class_;
   protected final rYB break_;
   protected int byte_;
   protected int protected_;
   protected int throws_;
   public yQ_2[] case_;
   private Map<rfj_3, rrxH_2[]> catch_ = new HashMap<>();

   public yO_2(yz_3 var1, rYB var2, int var3, yX_2 var4) {
      this.class_ = var4;
      this.break_ = var2;
      this.class_(var3);
      this.class_(var1);
   }

   public void class_(double var1, double var3) {
      int var5 = rfU_2.byte_(var1);
      int var6 = rfU_2.byte_(var3);

      for (int var7 = 0; var7 < this.protected_; var7++) {
         int var8 = this.protected_ * 16;
         int var9 = var5 - 8 - var8 / 2;
         int var10 = var9 + Math.floorMod(var7 * 16 - var9, var8);

         for (int var11 = 0; var11 < this.throws_; var11++) {
            int var12 = this.throws_ * 16;
            int var13 = var6 - 8 - var12 / 2;
            int var14 = var13 + Math.floorMod(var11 * 16 - var13, var12);

            for (int var15 = 0; var15 < this.byte_; var15++) {
               int var16 = var15 * 16;
               yQ_2 var17 = this.case_[this.class_(var7, var15, var11)];
               var17.class_(var10, var16, var14);
            }
         }
      }
   }

   public void class_(int var1, int var2, int var3, boolean var4) {
      int var5 = Math.floorMod(var1, this.protected_);
      int var6 = Math.floorMod(var2, this.byte_);
      int var7 = Math.floorMod(var3, this.throws_);
      yQ_2 var8 = this.case_[this.class_(var5, var6, var7)];
      var8.class_(var4);
   }

   public yQ_2 class_(rfH_2 var1) {
      int var2 = var1.b_() >> 4;
      int var3 = var1.c_() >> 4;
      int var4 = var1.d_() >> 4;
      if (var3 >= 0 && var3 < this.byte_) {
         var2 = rfU_2.break_(var2, this.protected_);
         var4 = rfU_2.break_(var4, this.throws_);
         return this.case_[this.class_(var2, var3, var4)];
      } else {
         return null;
      }
   }

   private void class_(yQ_2 var1) {
      rfH_2 var2 = var1.throws_();
      int var3 = var2.b_() >> 8 << 8;
      int var4 = var2.d_() >> 8 << 8;
      rfj_3 var5 = new rfj_3(var3, var4);
      HU[] var6 = HU.s;
      rrxH_2[] var7 = this.catch_.get(var5);
      if (var7 == null) {
         var7 = new rrxH_2[var6.length];

         for (int var8 = 0; var8 < var6.length; var8++) {
            var7[var8] = new rrxH_2(var6[var8]);
         }

         this.catch_.put(var5, var7);
      }

      for (int var11 = 0; var11 < var6.length; var11++) {
         HU var9 = var6[var11];
         rrxH_2 var10 = var7[var11];
         if (var10 != null) {
            var1.class_(var9).class_(var10);
         }
      }
   }

   protected void class_(yz_3 var1) {
      int var2 = this.protected_ * this.byte_ * this.throws_;
      this.case_ = new yQ_2[var2];

      for (int var3 = 0; var3 < this.protected_; var3++) {
         for (int var4 = 0; var4 < this.byte_; var4++) {
            for (int var5 = 0; var5 < this.throws_; var5++) {
               int var6 = this.class_(var3, var4, var5);
               yQ_2[] var10000 = this.case_;
               Objects.requireNonNull(var1);
               var10000[var6] = new yQ_2(var1);
               this.case_[var6].class_(var3 * 16, var4 * 16, var5 * 16);
               if (rrbb_3.rp() && rrbb_3.ry()) {
                  this.class_(this.case_[var6]);
               }
            }
         }
      }

      for (int var9 = 0; var9 < this.case_.length; var9++) {
         yQ_2 var10 = this.case_[var9];

         for (int var11 = 0; var11 < rpr_3.VALUES.length; var11++) {
            rpr_3 var12 = rpr_3.VALUES[var11];
            rfH_2 var7 = var10.class_(var12);
            yQ_2 var8 = this.class_(var7);
            var10.class_(var12, var8);
         }
      }
   }

   public void class_() {
      for (yQ_2 var4 : this.case_) {
         var4.protected_();
      }

      this.break_();
   }

   private int class_(int var1, int var2, int var3) {
      return (var3 * this.byte_ + var2) * this.protected_ + var1;
   }

   protected void class_(int var1) {
      int var2 = var1 * 2 + 1;
      this.protected_ = var2;
      this.byte_ = 16;
      this.throws_ = var2;
   }

   public void break_() {
      for (rfj_3 var2 : this.catch_.keySet()) {
         rrxH_2[] var3 = this.catch_.get(var2);

         for (int var4 = 0; var4 < var3.length; var4++) {
            rrxH_2 var5 = var3[var4];
            if (var5 != null) {
               var5.protected_();
            }

            var3[var4] = null;
         }
      }

      this.catch_.clear();
   }
}
