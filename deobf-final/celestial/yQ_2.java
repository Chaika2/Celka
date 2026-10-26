package celestial;

import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class yQ_2 implements rrGC {
   public final AtomicReference<yZ_2> class_;
   private yc_3 case_;
   private yu_3 catch_;
   private final Set<ryO_2> private_;
   private final rrxJ_2<jm_3> implements_;
   public rfl_3 break_;
   private int finally_;
   private boolean extends_;
   final rfw_3 native_;
   private final rfw_3[] volatile_;
   private boolean final_;
   private final boolean package_;
   private final boolean int_;
   private boolean new_;
   private final boolean continue_;
   public int byte_;
   public int protected_;
   int super_;
   int this_;
   int else_;
   private final yQ_2[] synchronized_;
   private boolean return_;
   roJ_2 public_;
   private final yQ_2[] goto_;
   private final yQ_2[] while_;
   private boolean try_;
   private final yx_3 instanceof_;

   public yZ_2 byte_() {
      return this.class_.get();
   }

   private roJ_2 byte_(rfH_2 var1) {
      roJ_2 var2 = this.public_;
      if (rrWM.break_(var2)) {
         return var2;
      } else {
         var2 = this.throws_.native_.this_(var1);
         this.public_ = var2;
         return var2;
      }
   }

   private void int_() {
      this.implements_();
      this.class_.set(yZ_2.class_);
      this.extends_ = true;
   }

   public yQ_2(yz_3 var1) {
      this.throws_ = var1;
      this.class_ = new AtomicReference<>(yZ_2.class_);
      this.private_ = Sets.newHashSet();
      this.implements_ = new rrxJ_2<>(var0 -> new jm_3(ju_3.private_));
      this.finally_ = -1;
      this.extends_ = true;
      this.native_ = new rfw_3(-1, -1, -1);
      this.volatile_ = rqR_2.class_(new rfw_3[6], var0 -> {
         for (int var1x = 0; var1x < var0.length; var1x++) {
            var0[var1x] = new rfw_3();
         }
      });
      this.package_ = rrbb_3.package_();
      this.int_ = !rrxr_3.class_.byte_();
      this.new_ = false;
      this.continue_ = rrbb_3.ry();
      this.synchronized_ = new yQ_2[6];
      this.return_ = false;
      this.goto_ = new yQ_2[rpr_3.VALUES.length];
      this.while_ = new yQ_2[rpr_3.VALUES.length];
      this.try_ = false;
      this.instanceof_ = new yx_3(this, null, 0);
   }

   @Override
   public String toString() {
      return "pos: " + this.throws_() + ", frameIndex: " + this.finally_;
   }

   public boolean class_(HU var1, yz_3 var2) {
      yZ_2 var3 = this.byte_();
      if (this.catch_ != null) {
         this.catch_.class_();
      }

      if (!var3.byte_.contains(var1)) {
         return false;
      } else {
         if (yz_3.new_) {
            this.catch_ = new yu_3(this, new rfj_3(this.throws_()), this.break_(), var3);
         } else {
            this.catch_ = new yu_3(this, this.break_(), var3);
         }

         var2.class_(this.catch_);
         return true;
      }
   }

   @Override
   public yW_2 class_(rYB var1, rfH_2 var2, rfH_2 var3, int var4) {
      return yW_2.class_(var1, var2, var3, var4, false);
   }

   void class_(Hv_1 var1, yZ_2 var2) {
      this.class_(rrxA_2.byte_, var1, var2);
      this.class_(rrxA_2.break_, var1, var2);
      this.class_(rrxA_2.protected_, var1, var2);
   }

   public rfH_2 class_(rpr_3 var1) {
      return this.volatile_[var1.ordinal()];
   }

   HU[] class_(xc_3 var1, HU[] var2) {
      if (yz_3.continue_) {
         return yz_3.class_;
      } else {
         var2[0] = yS_2.class_(var1);
         return var2;
      }
   }

   public yQ_2 class_(yO_2 var1, rpr_3 var2) {
      if (!this.return_) {
         for (int var3 = 0; var3 < rpr_3.VALUES.length; var3++) {
            rpr_3 var4 = rpr_3.VALUES[var3];
            rfH_2 var5 = this.class_(var4);
            this.synchronized_[var3] = var1.class_(var5);
         }

         this.return_ = true;
      }

      return this.synchronized_[var2.ordinal()];
   }

   private void class_(HU var1, Hv_1 var2, yZ_2 var3) {
      lD_2 var4 = var2.class_(var1);
      if (var4.final_()) {
         var3.protected_(var1);
         if (var4.int_() > 0) {
            var3.throws_(var1);
         }
      }
   }

   void class_(Set<ryO_2> var1) {
      HashSet var2 = Sets.newHashSet(var1);
      HashSet var3 = Sets.newHashSet(this.private_);
      var2.removeAll(this.private_);
      var3.removeAll(var1);
      this.private_.clear();
      this.private_.addAll(var1);
      this.throws_.volatile_.class_(var3, var2);
   }

   public void class_(yz_3 var1) {
      yN_2 var2 = this.finally_();
      var1.class_(var2);
   }

   HU class_(rRq_1 var1, xc_3 var2, rfH_2 var3, HU var4) {
      if (rrbW_2.break_()) {
         HU var5 = rrbW_2.class_(var1, var2, var3);
         if (var5 != null) {
            return var5;
         }
      }

      if (!this.int_) {
         return var4;
      } else {
         if (this.package_) {
            if (var4 == rrxA_2.byte_) {
               xd_3 var6 = var2.break_();
               if (var6 instanceof Wu_1) {
                  return var4;
               }

               if (var6 instanceof xL_2) {
                  return var4;
               }

               return rrxA_2.break_;
            }
         } else if (var4 == rrxA_2.break_) {
            return rrxA_2.byte_;
         }

         return var4;
      }
   }

   HU[] class_(rXE var1, HU[] var2) {
      if (yz_3.super_) {
         return yz_3.class_;
      } else {
         var2[0] = yS_2.class_(var1);
         return var2;
      }
   }

   public void class_(int var1, int var2, int var3) {
      if (var1 != this.native_.b_() || var2 != this.native_.c_() || var3 != this.native_.d_()) {
         this.int_();
         this.native_.class_(var1, var2, var3);
         if (this.continue_) {
            byte var4 = 8;
            this.byte_ = var1 >> var4 << var4;
            this.protected_ = var3 >> var4 << var4;
            this.super_ = var1 - this.byte_;
            this.this_ = var2;
            this.else_ = var3 - this.protected_;
         }

         this.break_ = new rfl_3((double)var1, (double)var2, (double)var3, (double)(var1 + 16), (double)(var2 + 16), (double)(var3 + 16));

         for (rpr_3 var7 : rpr_3.VALUES) {
            this.volatile_[var7.ordinal()].class_(this.native_).byte_(var7, 16);
         }

         this.return_ = false;
         this.try_ = false;

         for (int var9 = 0; var9 < this.goto_.length; var9++) {
            yQ_2 var10 = this.goto_[var9];
            if (var10 != null) {
               var10.try_ = false;
            }
         }

         this.public_ = null;
      }
   }

   public jm_3 class_(HU var1) {
      return this.implements_.class_(var1);
   }

   public boolean class_(int var1) {
      if (this.finally_ == var1) {
         return false;
      } else {
         this.finally_ = var1;
         return true;
      }
   }

   public boolean class_() {
      return !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().K().aJ_() && this.break_() > 576.0
         ? this.class_(this.volatile_[rpr_3.WEST.ordinal()])
            && this.class_(this.volatile_[rpr_3.NORTH.ordinal()])
            && this.class_(this.volatile_[rpr_3.EAST.ordinal()])
            && this.class_(this.volatile_[rpr_3.SOUTH.ordinal()])
         : true;
   }

   private boolean class_(rfH_2 var1) {
      return this.throws_.native_.class_(var1.b_() >> 4, var1.d_() >> 4, roN_2.volatile_, false) != null;
   }

   public void class_(boolean var1) {
      boolean var2 = this.extends_;
      this.extends_ = true;
      this.final_ = var1 | (var2 && this.final_);
      if (this.new_()) {
         this.new_ = true;
      }
   }

   public void class_(rpr_3 var1, yQ_2 var2) {
      this.goto_[var1.ordinal()] = var2;
      this.while_[var1.ordinal()] = var2;
   }

   void class_(lD_2 var1) {
      var1.class_(7, ju_3.private_);
   }

   rrJI break_(rfH_2 var1) {
      rfH_2 var2 = var1.break_(-1, -1, -1);
      rfH_2 var3 = var1.break_(16, 16, 16);
      yW_2 var4 = this.class_(this.throws_.native_, var2, var3, 1);
      return new rrJI(var4, var2, var3, 1);
   }

   public yQ_2 break_(rpr_3 var1) {
      if (!this.try_) {
         this.continue_();
      }

      return this.while_[var1.ordinal()];
   }

   protected double break_() {
      ly_3 var1 = ((Hh_1)QY.instanceof_().class_[16]).finally_();
      double var2 = this.break_.class_ + 8.0 - var1.break_().break_;
      double var4 = this.break_.break_ + 8.0 - var1.break_().byte_;
      double var6 = this.break_.byte_ + 8.0 - var1.break_().protected_;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public rfH_2 throws_() {
      return this.native_;
   }

   public yN_2 finally_() {
      this.implements_();
      Object var1 = null;
      if (yz_3.new_) {
         this.case_ = new yc_3(this, new rfj_3(this.throws_()), this.break_(), (yW_2)var1);
      } else {
         this.case_ = new yc_3(this, this.break_(), (yW_2)var1);
      }

      return this.case_;
   }

   public boolean catch_() {
      return this.extends_;
   }

   public void extends_() {
      yN_2 var1 = this.finally_();
      var1.class_(this.throws_.implements_);
   }

   public void case_() {
      this.extends_ = false;
      this.final_ = false;
      this.new_ = false;
   }

   private void continue_() {
      int var1 = this.throws_().b_();
      int var2 = this.throws_().d_();
      int var3 = rpr_3.NORTH.ordinal();
      int var4 = rpr_3.SOUTH.ordinal();
      int var5 = rpr_3.WEST.ordinal();
      int var6 = rpr_3.EAST.ordinal();
      this.while_[var3] = this.goto_[var3].throws_().d_() == var2 - 16 ? this.goto_[var3] : null;
      this.while_[var4] = this.goto_[var4].throws_().d_() == var2 + 16 ? this.goto_[var4] : null;
      this.while_[var5] = this.goto_[var5].throws_().b_() == var1 - 16 ? this.goto_[var5] : null;
      this.while_[var6] = this.goto_[var6].throws_().b_() == var1 + 16 ? this.goto_[var6] : null;
      this.try_ = true;
   }

   protected void implements_() {
      if (this.case_ != null) {
         this.case_.class_();
         this.case_ = null;
      }

      if (this.catch_ != null) {
         this.catch_.class_();
         this.catch_ = null;
      }
   }

   private boolean new_() {
      return this.throws_.native_ instanceof gm_3 var1 ? var1.volatile_() : false;
   }

   public yx_3 package_() {
      return this.instanceof_;
   }

   public void protected_() {
      this.int_();
      this.implements_.class_().forEach(jm_3::close);
   }

   boolean protected_(rfH_2 var1) {
      int var2 = var1.c_();
      int var3 = var2 + 15;
      return this.byte_(var1).class_(var2, var3);
   }

   public boolean private_() {
      return this.extends_ && this.final_;
   }

   public boolean final_() {
      return this.protected_(this.native_);
   }

   public roJ_2 volatile_() {
      return this.byte_(this.native_);
   }

   public boolean native_() {
      return this.new_;
   }
}
