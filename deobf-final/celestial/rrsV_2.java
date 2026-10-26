package celestial;

import java.util.Arrays;
import org.apache.commons.lang3.mutable.MutableInt;

public abstract class rrsV_2<M extends rrsj_3<M>, S extends rrsR_2<M>> extends rrsw_3 implements rrsT_2 {
   private static final rpr_3[] throws_ = rpr_3.values();
   protected final rol_3 class_;
   protected final rRo_1 break_;
   protected final S byte_;
   private boolean case_;
   protected final rfw_3 protected_ = new rfw_3();
   private final long[] catch_ = new long[2];
   private final rRq_1[] private_ = new rRq_1[2];

   @Override
   protected int byte_(long var1) {
      return var1 == Long.MAX_VALUE ? 0 : 15 - this.byte_.implements_(var1);
   }

   public rrsV_2(rol_3 var1, rRo_1 var2, S var3) {
      super(16, 256, 8192);
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = (S)var3;
      this.throws_();
   }

   protected void class_(long var1, roH_2 var3, boolean var4) {
      this.byte_.class_(var1, var3, var4);
   }

   public void class_(rfj_3 var1, boolean var2) {
      long var3 = rjh_3.case_(rjh_3.break_(var1.break_, 0, var1.byte_));
      this.byte_.break_(var3, var2);
   }

   public boolean class_() {
      return this.break_() || this.byte_.break_() || this.byte_.class_();
   }

   @Override
   protected void class_(long var1, int var3) {
      this.byte_.break_(var1, Math.min(15, 15 - var3));
   }

   public void class_(rfH_2 var1, int var2) {
   }

   @Override
   public void class_(rjh_3 var1, boolean var2) {
      this.byte_.protected_(var1.continue_(), var2);
   }

   @Override
   public int class_(rfH_2 var1) {
      return this.byte_.protected_(var1.package_());
   }

   @Override
   public roH_2 class_(rjh_3 var1) {
      return this.byte_.private_(var1.continue_());
   }

   @Override
   protected boolean class_(long var1) {
      return var1 == Long.MAX_VALUE;
   }

   public static int class_(rRq_1 var0, xc_3 var1, rfH_2 var2, xc_3 var3, rfH_2 var4, rpr_3 var5, int var6) {
      boolean var7 = var1.native_() && var1.throws_();
      boolean var8 = var3.native_() && var3.throws_();
      if (!var7 && !var8) {
         return var6;
      } else {
         rjC_2 var9 = var7 ? var1.byte_(var0, var2) : rjw_3.class_();
         rjC_2 var10 = var8 ? var3.byte_(var0, var4) : rjw_3.class_();
         return rjw_3.break_(var9, var10, var5) ? 16 : var6;
      }
   }

   protected rjC_2 class_(xc_3 var1, long var2, rpr_3 var4) {
      return var1.native_() ? var1.class_(this.class_.break_(), this.protected_.case_(var2), var4) : rjw_3.class_();
   }

   protected xc_3 class_(long var1, MutableInt var3) {
      if (var1 == Long.MAX_VALUE) {
         if (var3 != null) {
            var3.setValue(0);
         }

         return xu_3.class_.continue_();
      } else {
         int var4 = rjh_3.class_(rfH_2.class_(var1));
         int var5 = rjh_3.class_(rfH_2.byte_(var1));
         rRq_1 var6 = this.class_(var4, var5);
         if (var6 == null) {
            if (var3 != null) {
               var3.setValue(16);
            }

            return xu_3.while_.continue_();
         } else {
            this.protected_.case_(var1);
            xc_3 var7 = var6.byte_(this.protected_);
            boolean var8 = var7.native_() && var7.throws_();
            if (var3 != null) {
               var3.setValue(var7.break_(this.class_.break_(), this.protected_));
            }

            return var8 ? var7 : xu_3.class_.continue_();
         }
      }
   }

   public int class_(int var1, boolean var2, boolean var3) {
      if (!this.case_) {
         if (this.byte_.break_()) {
            var1 = this.byte_.class_(var1);
            if (var1 == 0) {
               return var1;
            }
         }

         this.byte_.class_(this, var2, var3);
      }

      this.case_ = true;
      if (this.break_()) {
         var1 = this.class_(var1);
         this.throws_();
         if (var1 == 0) {
            return var1;
         }
      }

      this.case_ = false;
      this.byte_.case_();
      return var1;
   }

   protected int class_(roH_2 var1, long var2) {
      return 15 - var1.class_(rjh_3.break_(rfH_2.class_(var2)), rjh_3.break_(rfH_2.break_(var2)), rjh_3.break_(rfH_2.byte_(var2)));
   }

   private rRq_1 class_(int var1, int var2) {
      long var3 = rfj_3.class_(var1, var2);

      for (int var5 = 0; var5 < 2; var5++) {
         if (var3 == this.catch_[var5]) {
            return this.private_[var5];
         }
      }

      rRq_1 var7 = this.class_.throws_(var1, var2);

      for (int var6 = 1; var6 > 0; var6--) {
         this.catch_[var6] = this.catch_[var6 - 1];
         this.private_[var6] = this.private_[var6 - 1];
      }

      this.catch_[0] = var3;
      this.private_[0] = var7;
      return var7;
   }

   @Override
   protected int class_(long var1, long var3, int var5) {
      return 0;
   }

   public void break_(rfj_3 var1, boolean var2) {
      long var3 = rjh_3.case_(rjh_3.break_(var1.break_, 0, var1.byte_));
      this.byte_.byte_(var3, var2);
   }

   @Override
   protected int break_(long var1, long var3, int var5) {
      return 0;
   }

   public String break_(long var1) {
      return this.byte_.byte_(var1) + "";
   }

   public void break_(rfH_2 var1) {
      long var2 = var1.package_();
      this.case_(var2);

      for (rpr_3 var7 : throws_) {
         this.case_(rfH_2.class_(var2, var7));
      }
   }

   private void throws_() {
      Arrays.fill(this.catch_, rfj_3.class_);
      Arrays.fill(this.private_, null);
   }

   @Override
   protected void case_(long var1) {
      this.byte_.throws_();
      if (this.byte_.catch_(rjh_3.throws_(var1))) {
         super.case_(var1);
      }
   }
}
