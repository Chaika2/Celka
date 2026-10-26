package celestial;

import java.util.Arrays;

public class rrJI implements rRp_1 {
   private final yW_2 class_;
   private final int break_;
   private final int byte_;
   private final int protected_;
   private final int throws_;
   private final int case_;
   private final int catch_;
   private final int private_;
   private int[] implements_;
   private xc_3[] finally_;
   private rYG[] extends_;
   private final int native_;
   private rrxF_2 volatile_;
   private static final rrka_1 final_ = new rrka_1(int.class, 16);
   private static final rrka_1 package_ = new rrka_1(xc_3.class, 16);
   private static final rrka_1 int_ = new rrka_1(rYG.class, 16);

   @Override
   public xc_3 byte_(rfH_2 var1) {
      int var2 = this.protected_(var1);
      if (var2 >= 0 && var2 < this.native_ && this.finally_ != null) {
         xc_3 var3 = this.finally_[var2];
         if (var3 == null) {
            var3 = this.class_.byte_(var1);
            this.finally_[var2] = var3;
         }

         return var3;
      } else {
         return this.class_.byte_(var1);
      }
   }

   public void byte_() {
      final_.class_(this.implements_);
      this.implements_ = null;
      package_.class_(this.finally_);
      this.finally_ = null;
      int_.class_(this.extends_);
      this.extends_ = null;
   }

   public rrJI(yW_2 var1, rfH_2 var2, rfH_2 var3, int var4) {
      this.class_ = var1;
      int var5 = var2.b_() - var4 >> 4;
      int var6 = var2.c_() - var4 >> 4;
      int var7 = var2.d_() - var4 >> 4;
      int var8 = var3.b_() + var4 >> 4;
      int var9 = var3.c_() + var4 >> 4;
      int var10 = var3.d_() + var4 >> 4;
      this.throws_ = var8 - var5 + 1 << 4;
      this.case_ = var9 - var6 + 1 << 4;
      this.catch_ = var10 - var7 + 1 << 4;
      this.private_ = this.throws_ * this.catch_;
      this.native_ = this.throws_ * this.case_ * this.catch_;
      this.break_ = var5 << 4;
      this.byte_ = var6 << 4;
      this.protected_ = var7 << 4;
   }

   public void class_(rrxF_2 var1) {
      this.volatile_ = var1;
   }

   @Override
   public rrse_3 class_() {
      return this.class_.class_();
   }

   @Override
   public int class_(rfH_2 var1, rrsC_2 var2) {
      return this.class_.class_(var1, var2);
   }

   public ryO_2 class_(rfH_2 var1, rox_3 var2) {
      return this.class_.class_(var1, var2);
   }

   @Override
   public ryO_2 class_(rfH_2 var1) {
      return this.class_.class_(var1, rox_3.CHECK);
   }

   @Override
   public float class_(rpr_3 var1, boolean var2) {
      return this.class_.class_(var1, var2);
   }

   @Override
   public int class_(rRo_1 var1, rfH_2 var2) {
      return this.class_.class_(var1, var2);
   }

   @Override
   public rXE break_(rfH_2 var1) {
      return this.byte_(var1).volatile_();
   }

   public void break_() {
      if (this.implements_ == null) {
         this.implements_ = (int[])final_.class_(this.native_);
      }

      if (this.finally_ == null) {
         this.finally_ = (xc_3[])package_.class_(this.native_);
      }

      if (this.extends_ == null) {
         this.extends_ = (rYG[])int_.class_(this.native_);
      }

      Arrays.fill(this.implements_, -1);
      Arrays.fill(this.finally_, null);
      Arrays.fill(this.extends_, null);
      this.case_();
   }

   public rrxF_2 throws_() {
      return this.volatile_;
   }

   public rYG throws_(rfH_2 var1) {
      int var2 = this.protected_(var1);
      if (var2 >= 0 && var2 < this.native_ && this.extends_ != null) {
         rYG var3 = this.extends_[var2];
         if (var3 == null) {
            var3 = this.class_.throws_(var1);
            this.extends_[var2] = var3;
         }

         return var3;
      } else {
         return this.class_.throws_(var1);
      }
   }

   @Override
   public boolean case_(rfH_2 var1) {
      return this.class_.case_(var1);
   }

   private void case_() {
      if (this.throws_ == 48 && this.case_ == 48 && this.catch_ == 48) {
         roJ_2 var1 = this.class_.class_(1, 1);
         rrGi_1 var2 = new rrGi_1();

         for (int var3 = 16; var3 < 32; var3++) {
            int var4 = var3 * this.private_;

            for (int var5 = 16; var5 < 32; var5++) {
               int var6 = var5 * this.throws_;

               for (int var7 = 16; var7 < 32; var7++) {
                  var2.class_(this.break_ + var7, this.byte_ + var3, this.protected_ + var5);
                  int var8 = var4 + var6 + var7;
                  xc_3 var9 = var1.byte_(var2);
                  this.finally_[var8] = var9;
               }
            }
         }
      }
   }

   public int[] protected_() {
      return this.implements_;
   }

   public int protected_(rfH_2 var1) {
      int var2 = var1.b_() - this.break_;
      if (var2 >= 0 && var2 < this.throws_) {
         int var3 = var1.c_() - this.byte_;
         if (var3 >= 0 && var3 < this.case_) {
            int var4 = var1.d_() - this.protected_;
            return var4 >= 0 && var4 < this.catch_ ? var3 * this.private_ + var4 * this.throws_ + var2 : -1;
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }
}
