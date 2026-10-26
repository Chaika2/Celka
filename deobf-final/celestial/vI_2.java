package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

class vI_2 extends LV<vj_3> {
   protected final List<rlr_3<xd_3>> class_;
   protected final List<rlr_3<rdb_3>> throws_;
   private final int[] return_;
   protected int case_;
   protected final List<rdb_3> catch_;
   protected final Comparator<rdb_3> private_;
   protected rlr_3<?> implements_;
   protected int finally_;

   public vI_2(vp_3 var1, QY var2) {
      super(var2, var1.package_, var1.int_, 32, var1.int_ - 64, 20);
      this.extends_ = var1;
      this.return_ = new int[]{3, 4, 1, 2, 5, 6};
      this.case_ = -1;
      this.private_ = new vf_3(this);
      this.class_ = Lists.newArrayList();
      this.class_.add(rlB_2.class_);
      this.throws_ = Lists.newArrayList(new rlr_3[]{rlB_2.protected_, rlB_2.break_, rlB_2.byte_, rlB_2.throws_, rlB_2.case_});
      this.class_(true, 20);
      Set var3 = Sets.newIdentityHashSet();

      for (rdb_3 var5 : rVL.for_) {
         boolean var6 = false;

         for (rlr_3 var8 : this.throws_) {
            if (var8.class_(var5) && var1.finally_.class_(var8.break_(var5)) > 0) {
               var6 = true;
            }
         }

         if (var6) {
            var3.add(var5);
         }
      }

      for (xd_3 var11 : rVL.strictfp_) {
         boolean var12 = false;

         for (rlr_3 var14 : this.class_) {
            if (var14.class_(var11) && var1.finally_.class_(var14.break_(var11)) > 0) {
               var12 = true;
            }
         }

         if (var12) {
            var3.add(var11.case_());
         }
      }

      var3.remove(rdy_3.class_);
      this.catch_ = Lists.newArrayList(var3);

      for (int var10 = 0; var10 < this.catch_.size(); var10++) {
         this.break_(new vj_3(this));
      }
   }

   @Override
   protected void class_(Ml_1 var1, int var2, int var3) {
      if (var3 >= this.int_ && var3 <= this.new_) {
         vj_3 var4 = this.protected_((double)var2, (double)var3);
         int var5 = (this.final_ - this.F_()) / 2;
         if (var4 != null) {
            if (var2 < var5 + 40 || var2 > var5 + 40 + 20) {
               return;
            }

            rdb_3 var6 = this.catch_.get(this.x_().indexOf(var4));
            this.class_(var1, this.class_(var6), var2, var3);
         } else {
            rgP_2 var10 = null;
            int var7 = var2 - var5;

            for (int var8 = 0; var8 < this.return_.length; var8++) {
               int var9 = this.extends_.break_(var8);
               if (var7 >= var9 - 18 && var7 <= var9) {
                  var10 = this.private_(var8).byte_();
                  break;
               }
            }

            this.class_(var1, var10, var2, var3);
         }
      }
   }

   protected void class_(rlr_3<?> var1) {
      if (var1 != this.implements_) {
         this.implements_ = var1;
         this.finally_ = -1;
      } else if (this.finally_ == -1) {
         this.finally_ = 1;
      } else {
         this.implements_ = null;
         this.finally_ = 0;
      }

      this.catch_.sort(this.private_);
   }

   @Override
   protected void class_(int var1, int var2) {
      this.case_ = -1;

      for (int var3 = 0; var3 < this.return_.length; var3++) {
         int var4 = var1 - this.extends_.break_(var3);
         if (var4 >= -36 && var4 <= 0) {
            this.case_ = var3;
            break;
         }
      }

      if (this.case_ >= 0) {
         this.class_(this.private_(this.case_));
         this.native_.c().class_(Np_1.class_(rqn_3.dw, 1.0F));
      }
   }

   protected void class_(Ml_1 var1, rgP_2 var2, int var3, int var4) {
      if (var2 != null) {
         int var5 = var3 + 12;
         int var6 = var4 - 12;
         int var7 = this.extends_.super_.class_(var2);
         this.class_(var1, var5 - 3, var6 - 3, var5 + var7 + 3, var6 + 8 + 3, -1073741824, -1073741824);
         RenderSystem.pushMatrix();
         RenderSystem.translatef(0.0F, 0.0F, 400.0F);
         this.extends_.super_.break_(var1, var2, (float)var5, (float)var6, -1);
         RenderSystem.popMatrix();
      }
   }

   protected rgP_2 class_(rdb_3 var1) {
      return var1.native_();
   }

   @Override
   protected void class_(Ml_1 var1, int var2, int var3, yb_3 var4) {
      if (!((Qi_1)this.native_.class_[22]).class_()) {
         this.case_ = -1;
      }

      for (int var5 = 0; var5 < this.return_.length; var5++) {
         this.extends_.byte_(var1, var2 + this.extends_.break_(var5) - 18, var3 + 1, 0, this.case_ == var5 ? 0 : 18);
      }

      if (this.implements_ != null) {
         int var7 = this.extends_.break_(this.break_(this.implements_)) - 36;
         int var6 = this.finally_ == 1 ? 2 : 1;
         this.extends_.byte_(var1, var2 + var7, var3 + 1, 18 * var6, 0);
      }

      for (int var8 = 0; var8 < this.return_.length; var8++) {
         int var9 = this.case_ == var8 ? 1 : 0;
         this.extends_.byte_(var1, var2 + this.extends_.break_(var8) - 18 + var9, var3 + 1 + var9, 18 * this.return_[var8], 18);
      }
   }

   @Override
   protected void class_(Ml_1 var1) {
      this.extends_.class_(var1);
   }

   private int break_(rlr_3<?> var1) {
      int var2 = this.class_.indexOf(var1);
      if (var2 >= 0) {
         return var2;
      } else {
         int var3 = this.throws_.indexOf(var1);
         return var3 >= 0 ? var3 + this.class_.size() : -1;
      }
   }

   @Override
   protected int protected_() {
      return this.final_ / 2 + 140;
   }

   private rlr_3<?> private_(int var1) {
      return var1 < this.class_.size() ? this.class_.get(var1) : this.throws_.get(var1 - this.class_.size());
   }

   @Override
   public int F_() {
      return 375;
   }
}
