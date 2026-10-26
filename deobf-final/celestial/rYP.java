package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rYP {
   private static final Logger class_ = LogManager.getLogger();
   private final rrEm_1 break_;
   private final an_3 byte_;
   private final int protected_;
   private final boolean throws_;
   private final Consumer<ruS_2<?>> case_;
   private long catch_;
   private long private_;
   private long implements_;
   private int finally_;
   private int extends_;
   private int native_;
   private rjU_2 volatile_ = rjU_2.class_;
   private int final_;
   private int package_;
   private List<an_3> int_ = Collections.emptyList();
   private boolean new_;
   private boolean continue_;

   private void byte_() {
      rmE_2 var1 = this.byte_.BQ();
      if (var1.class_()) {
         this.class_(new rvX_2(this.byte_.V(), var1, false));
      }

      if (this.byte_ instanceof iB_2) {
         Set var2 = ((iB_2)this.byte_).BT().class_();
         if (!var2.isEmpty()) {
            this.class_(new rvW_2(this.byte_.V(), var2));
         }

         var2.clear();
      }
   }

   public rYP(rrEm_1 var1, an_3 var2, int var3, boolean var4, Consumer<ruS_2<?>> var5) {
      this.break_ = var1;
      this.case_ = var5;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.protected_();
      this.finally_ = rfU_2.protected_((Float)var2.throws_[15] * 256.0F / 360.0F);
      this.extends_ = rfU_2.protected_((Float)var2.throws_[16] * 256.0F / 360.0F);
      this.native_ = rfU_2.protected_(var2.t() * 256.0F / 360.0F);
      this.continue_ = var2.BL();
   }

   public void class_() {
      List var1 = this.byte_.Bh();
      if (!var1.equals(this.int_)) {
         this.int_ = var1;
         this.case_.accept(new rFb_1(this.byte_));
      }

      if (this.byte_ instanceof rsG_2 && this.final_ % 10 == 0) {
         rsG_2 var2 = (rsG_2)this.byte_;
         rdn_3 var3 = var2.final_();
         if (var3.break_() instanceof rxI_2) {
            rrGb_1 var4 = rxI_2.break_(var3, this.break_);

            for (rhN_2 var6 : this.break_.continue_()) {
               var4.class_(var6, var3);
               ruS_2 var7 = ((rxI_2)var3.break_()).class_(var3, this.break_, var6);
               if (var7 != null) {
                  var6.class_.class_(var7);
               }
            }
         }

         this.byte_();
      }

      if (this.final_ % this.protected_ == 0 || (Boolean)this.byte_.throws_[57] || this.byte_.BQ().class_()) {
         if (this.byte_.Pm()) {
            int var23 = rfU_2.protected_((Float)this.byte_.throws_[15] * 256.0F / 360.0F);
            int var26 = rfU_2.protected_((Float)this.byte_.throws_[16] * 256.0F / 360.0F);
            boolean var28 = Math.abs(var23 - this.finally_) >= 1 || Math.abs(var26 - this.extends_) >= 1;
            if (var28) {
               this.case_.accept(new rvx_3(this.byte_.V(), (byte)var23, (byte)var26, this.byte_.BL()));
               this.finally_ = var23;
               this.extends_ = var26;
            }

            this.protected_();
            this.byte_();
            this.new_ = true;
         } else {
            this.package_++;
            int var22 = rfU_2.protected_((Float)this.byte_.throws_[15] * 256.0F / 360.0F);
            int var25 = rfU_2.protected_((Float)this.byte_.throws_[16] * 256.0F / 360.0F);
            rjU_2 var27 = this.byte_.Ps().protected_(rvJ_2.class_(this.catch_, this.private_, this.implements_));
            boolean var29 = var27.catch_() >= 7.6293945E-6F;
            Object var30 = null;
            boolean var31 = var29 || this.final_ % 60 == 0;
            boolean var8 = Math.abs(var22 - this.finally_) >= 1 || Math.abs(var25 - this.extends_) >= 1;
            if (this.final_ > 0 || this.byte_ instanceof rhm_3) {
               long var9 = rvJ_2.class_(var27.break_);
               long var11 = rvJ_2.class_(var27.byte_);
               long var13 = rvJ_2.class_(var27.protected_);
               boolean var15 = var9 < -32768L || var9 > 32767L || var11 < -32768L || var11 > 32767L || var13 < -32768L || var13 > 32767L;
               if (var15 || this.package_ > 400 || this.new_ || this.continue_ != this.byte_.BL()) {
                  this.continue_ = this.byte_.BL();
                  this.package_ = 0;
                  var30 = new rvN_2(this.byte_);
               } else if ((!var31 || !var8) && !(this.byte_ instanceof rhm_3)) {
                  if (var31) {
                     var30 = new rvk_3(this.byte_.V(), (short)((int)var9), (short)((int)var11), (short)((int)var13), this.byte_.BL());
                  } else if (var8) {
                     var30 = new rvx_3(this.byte_.V(), (byte)var22, (byte)var25, this.byte_.BL());
                  }
               } else {
                  var30 = new rvd_3(this.byte_.V(), (short)((int)var9), (short)((int)var11), (short)((int)var13), (byte)var22, (byte)var25, this.byte_.BL());
               }
            }

            if ((this.throws_ || (Boolean)this.byte_.throws_[57] || this.byte_ instanceof iB_2 && ((iB_2)this.byte_).Sy()) && this.final_ > 0) {
               rjU_2 var32 = this.byte_.rv();
               double var10 = var32.implements_(this.volatile_);
               if (var10 > 1.0E-7 || var10 > 0.0 && var32.catch_() == 0.0) {
                  this.volatile_ = var32;
                  this.case_.accept(new rvc_3(this.byte_.V(), this.volatile_));
               }
            }

            if (var30 != null) {
               this.case_.accept((ruS_2<?>)var30);
            }

            this.byte_();
            if (var31) {
               this.protected_();
            }

            if (var8) {
               this.finally_ = var22;
               this.extends_ = var25;
            }

            this.new_ = false;
         }

         int var24 = rfU_2.protected_(this.byte_.t() * 256.0F / 360.0F);
         if (Math.abs(var24 - this.native_) >= 1) {
            this.case_.accept(new rvh_3(this.byte_, (byte)var24));
            this.native_ = var24;
         }

         an_3 var10000 = this.byte_;
         Boolean var20 = false;
         var10000.throws_[57] = var20;
      }

      this.final_++;
      if ((Boolean)this.byte_.throws_[25]) {
         this.class_(new rvc_3(this.byte_));
         an_3 var33 = this.byte_;
         Boolean var21 = false;
         var33.throws_[25] = var21;
      }
   }

   public void class_(rhN_2 var1) {
      this.byte_.break_(var1);
      var1.interface_(this.byte_);
   }

   private void class_(ruS_2<?> var1) {
      this.case_.accept(var1);
      if (this.byte_ instanceof rhN_2) {
         ((rhN_2)this.byte_).class_.class_(var1);
      }
   }

   public void class_(Consumer<ruS_2<?>> var1) {
      if ((Boolean)this.byte_.throws_[27]) {
         class_.warn("Fetching packet for removed entity " + this.byte_);
      }

      ruS_2 var2 = this.byte_.p_();
      this.native_ = rfU_2.protected_(this.byte_.t() * 256.0F / 360.0F);
      var1.accept(var2);
      if (!this.byte_.BQ().protected_()) {
         var1.accept(new rvX_2(this.byte_.V(), this.byte_.BQ(), true));
      }

      boolean var3 = this.throws_;
      if (this.byte_ instanceof iB_2) {
         Collection var4 = ((iB_2)this.byte_).BT().break_();
         if (!var4.isEmpty()) {
            var1.accept(new rvW_2(this.byte_.V(), var4));
         }

         if (((iB_2)this.byte_).Sy()) {
            var3 = true;
         }
      }

      this.volatile_ = this.byte_.rv();
      if (var3 && !(var2 instanceof rFh_1)) {
         var1.accept(new rvc_3(this.byte_.V(), this.volatile_));
      }

      if (this.byte_ instanceof iB_2) {
         ArrayList var10 = Lists.newArrayList();

         for (rXQ var8 : rXQ.values()) {
            rdn_3 var9 = ((iB_2)this.byte_).class_(var8);
            if (!var9.class_()) {
               var10.add(Pair.of(var8, var9.implements_()));
            }
         }

         if (!var10.isEmpty()) {
            var1.accept(new rvO_2(this.byte_.V(), var10));
         }
      }

      if (this.byte_ instanceof iB_2 var11) {
         for (rLY var14 : var11.So()) {
            var1.accept(new rvT_2(this.byte_.V(), var14));
         }
      }

      if (!this.byte_.Bh().isEmpty()) {
         var1.accept(new rFb_1(this.byte_));
      }

      if (this.byte_.Pm()) {
         var1.accept(new rFb_1(this.byte_.ra()));
      }

      if (this.byte_ instanceof is_3 var12 && var12.z()) {
         var1.accept(new rvA_2(var12, var12.N()));
      }
   }

   public void break_(rhN_2 var1) {
      this.class_(var1.class_::class_);
      this.byte_.class_(var1);
      var1.char_(this.byte_);
   }

   public rjU_2 break_() {
      return rvJ_2.class_(this.catch_, this.private_, this.implements_);
   }

   private void protected_() {
      this.catch_ = rvJ_2.class_(this.byte_.rx());
      this.private_ = rvJ_2.class_(this.byte_.re());
      this.implements_ = rvJ_2.class_(this.byte_.BO());
   }
}
