package celestial;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class rrrH<C extends rUv_1> {
   public static final rrrH<?> class_ = new rrry_1(rrrZ.byte_, 0, 0, rfi_3.class_(), 0, 0L);
   private final rrrZ<C> throws_;
   protected final List<rrrn_1> break_ = Lists.newArrayList();
   protected rfi_3 byte_;
   private final int case_;
   private final int catch_;
   private int private_;
   protected final rqm_3 protected_;

   public rfi_3 byte_() {
      return this.byte_;
   }

   public rrrH(rrrZ<C> var1, int var2, int var3, rfi_3 var4, int var5, long var6) {
      this.throws_ = var1;
      this.case_ = var2;
      this.catch_ = var3;
      this.private_ = var5;
      this.protected_ = new rqm_3();
      this.protected_.byte_(var6, var2, var3);
      this.byte_ = var4;
   }

   public rcd_3 class_(int var1, int var2) {
      rcd_3 var3 = new rcd_3();
      if (this.throws_()) {
         var3.class_("id", rVL.t.break_(this.native_()).toString());
         var3.break_("ChunkX", var1);
         var3.break_("ChunkZ", var2);
         var3.break_("references", this.private_);
         var3.class_("BB", this.byte_.private_());
         rcy_3 var4 = new rcy_3();
         synchronized (this.break_) {
            for (rrrn_1 var7 : this.break_) {
               var4.add(var7.case_());
            }
         }

         var3.class_("Children", var4);
         return var3;
      } else {
         var3.class_("id", "INVALID");
         return var3;
      }
   }

   public rfH_2 class_() {
      return new rfH_2(this.case_ << 4, 0, this.catch_ << 4);
   }

   protected void class_(Random var1, int var2, int var3) {
      int var4 = var3 - var2 + 1 - this.byte_.throws_();
      int var5;
      if (var4 > 1) {
         var5 = var2 + var1.nextInt(var4);
      } else {
         var5 = var2;
      }

      int var6 = var5 - this.byte_.break_;
      this.byte_.class_(0, var6, 0);

      for (rrrn_1 var8 : this.break_) {
         var8.class_(0, var6, 0);
      }
   }

   public abstract void class_(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, C var7);

   protected void class_(int var1, Random var2, int var3) {
      int var4 = var1 - var3;
      int var5 = this.byte_.throws_() + 1;
      if (var5 < var4) {
         var5 += var2.nextInt(var4 - var5);
      }

      int var6 = var5 - this.byte_.throws_;
      this.byte_.class_(0, var6, 0);

      for (rrrn_1 var8 : this.break_) {
         var8.class_(0, var6, 0);
      }
   }

   public void class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6) {
      synchronized (this.break_) {
         if (!this.break_.isEmpty()) {
            rfi_3 var8 = this.break_.get(0).final_;
            rja_3 var9 = var8.catch_();
            rfH_2 var10 = new rfH_2(var9.b_(), var8.break_, var9.d_());
            Iterator var11 = this.break_.iterator();

            while (var11.hasNext()) {
               rrrn_1 var12 = (rrrn_1)var11.next();
               if (var12.catch_().class_(var5) && !var12.class_(var1, var2, var3, var4, var5, var6, var10)) {
                  var11.remove();
               }
            }

            this.break_();
         }
      }
   }

   protected void break_() {
      this.byte_ = rfi_3.class_();

      for (rrrn_1 var2 : this.break_) {
         this.byte_.break_(var2.catch_());
      }
   }

   public boolean throws_() {
      return !this.break_.isEmpty();
   }

   public int finally_() {
      return this.private_;
   }

   public int catch_() {
      return this.catch_;
   }

   protected int extends_() {
      return 1;
   }

   public int case_() {
      return this.case_;
   }

   public void implements_() {
      this.private_++;
   }

   public List<rrrn_1> protected_() {
      return this.break_;
   }

   public boolean private_() {
      return this.private_ < this.extends_();
   }

   public rrrZ<?> native_() {
      return this.throws_;
   }
}
