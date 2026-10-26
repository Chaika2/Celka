package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;

public class rsB_2 extends an_3 {
   private xc_3 private_ = xu_3.throw_.continue_();
   public int class_;
   public boolean break_ = true;
   private boolean implements_;
   private boolean finally_;
   private int extends_ = 40;
   private float native_ = 2.0F;
   public rcd_3 protected_;
   protected static final rut_3<rfH_2> catch_ = rmE_2.class_(rsB_2.class, ruw_3.native_);

   public rsB_2(aI_2<? extends rsB_2> var1, rYB var2) {
      super(var1, var2);
   }

   public rsB_2(rYB var1, double var2, double var4, double var6, xc_3 var8) {
      this(aI_2.try_, var1);
      this.private_ = var8;
      Boolean var13 = true;
      this.throws_[2] = var13;
      this.new_(var2, var4 + (double)((1.0F - this.Bm()) / 2.0F), var6);
      this.byte_(rjU_2.class_);
      Double var14 = var2;
      this.throws_[8] = var14;
      Double var15 = var4;
      this.throws_[9] = var15;
      Double var16 = var6;
      this.throws_[10] = var16;
      this.class_(this.Bs());
   }

   @Override
   public void this_() {
      if (this.private_.catch_()) {
         this.PD();
      } else {
         xd_3 var1 = this.private_.break_();
         if (this.class_++ == 0) {
            rfH_2 var2 = this.Bs();
            if (((rYB)this.throws_[7]).byte_(var2).class_(var1)) {
               ((rYB)this.throws_[7]).class_(var2, false);
            } else if (!((rYB)this.throws_[7]).continue_) {
               this.PD();
               return;
            }
         }

         if (!this.rw()) {
            this.byte_(this.rv().break_(0.0, -0.04, 0.0));
         }

         this.class_(iG_2.SELF, this.rv());
         if (!((rYB)this.throws_[7]).continue_) {
            rfH_2 var16 = this.Bs();
            boolean var3 = this.private_.break_() instanceof dr_3;
            boolean var4 = var3 && ((rYB)this.throws_[7]).break_(var16).class_(rlG_2.break_);
            double var5 = this.rv().catch_();
            if (var3 && var5 > 1.0) {
               rff_3 var7 = ((rYB)this.throws_[7])
                  .class_(
                     new rjB_2(
                        new rjU_2((Double)this.throws_[8], (Double)this.throws_[9], (Double)this.throws_[10]),
                        this.Ps(),
                        rjS_2.COLLIDER,
                        rjs_3.SOURCE_ONLY,
                        this
                     )
                  );
               if (var7.byte_() != rjM_2.MISS && ((rYB)this.throws_[7]).break_(var7.class_()).class_(rlG_2.break_)) {
                  var16 = var7.class_();
                  var4 = true;
               }
            }

            if (!(Boolean)this.throws_[20] && !var4) {
               if (!((rYB)this.throws_[7]).continue_ && (this.class_ > 100 && (var16.c_() < 1 || var16.c_() > 256) || this.class_ > 600)) {
                  if (this.break_ && ((rYB)this.throws_[7]).B().break_(rRu_1.catch_)) {
                     this.class_(var1);
                  }

                  this.PD();
               }
            } else {
               xc_3 var17 = ((rYB)this.throws_[7]).byte_(var16);
               this.byte_(this.rv().throws_(0.7, -0.5, 0.7));
               if (!var17.class_(xu_3.rc)) {
                  this.PD();
                  if (this.implements_) {
                     if (var1 instanceof dH_2) {
                        ((dH_2)var1).class_((rYB)this.throws_[7], var16, this);
                     }
                  } else {
                     boolean var8 = var17.class_(new rxv_3((rYB)this.throws_[7], var16, rpr_3.DOWN, rdn_3.break_, rpr_3.UP));
                     boolean var9 = dH_2.implements_(((rYB)this.throws_[7]).byte_(var16.break_())) && (!var3 || !var4);
                     boolean var10 = this.private_.class_((rRR)((rYB)this.throws_[7]), var16) && !var9;
                     if (var8 && var10) {
                        if (this.private_.break_(rCT.throw_) && ((rYB)this.throws_[7]).break_(var16).class_() == rXG.byte_) {
                           this.private_ = this.private_.class_(rCT.throw_, Boolean.valueOf(true));
                        }

                        if (!((rYB)this.throws_[7]).class_(var16, this.private_, 3)) {
                           if (this.break_ && ((rYB)this.throws_[7]).B().break_(rRu_1.catch_)) {
                              this.class_(var1);
                           }
                        } else {
                           if (var1 instanceof dH_2) {
                              ((dH_2)var1).class_((rYB)this.throws_[7], var16, this.private_, var17, this);
                           }

                           if (this.protected_ != null && var1 instanceof kx_3) {
                              ryO_2 var11 = ((rYB)this.throws_[7]).class_(var16);
                              if (var11 != null) {
                                 rcd_3 var12 = var11.class_(new rcd_3());

                                 for (String var14 : this.protected_.protected_()) {
                                    rcZ_2 var15 = this.protected_.byte_(var14);
                                    if (!"x".equals(var14) && !"y".equals(var14) && !"z".equals(var14)) {
                                       var12.class_(var14, var15.byte_());
                                    }
                                 }

                                 var11.class_(this.private_, var12);
                                 var11.break_();
                              }
                           }
                        }
                     } else if (this.break_ && ((rYB)this.throws_[7]).B().break_(rRu_1.catch_)) {
                        this.class_(var1);
                     }
                  }
               }
            }
         }

         this.byte_(this.rv().class_(0.98));
      }
   }

   @Override
   public void class_(Ko_1 var1) {
      super.class_(var1);
      var1.class_("Immitating BlockState", this.private_.toString());
   }

   @Override
   public boolean class_(float var1, float var2) {
      if (this.finally_) {
         int var3 = rfU_2.case_(var1 - 1.0F);
         if (var3 > 0) {
            ArrayList var4 = Lists.newArrayList(((rYB)this.throws_[7]).class_(this, this.rN()));
            boolean var5 = this.private_.class_(rls_3.long_);
            rye_3 var6 = var5 ? rye_3.new_ : rye_3.continue_;

            for (an_3 var8 : var4) {
               var8.break_(var6, (float)Math.min(rfU_2.protected_((float)var3 * this.native_), this.extends_));
            }

            if (var5 && (double)((Random)this.throws_[40]).nextFloat() < 0.05F + (double)var3 * 0.05) {
               xc_3 var9 = Ji_1.private_(this.private_);
               if (var9 == null) {
                  this.implements_ = true;
               } else {
                  this.private_ = var9;
               }
            }
         }
      }

      return false;
   }

   @Override
   protected void class_(rcd_3 var1) {
      var1.class_("BlockState", rco_3.class_(this.private_));
      var1.break_("Time", this.class_);
      var1.class_("DropItem", this.break_);
      var1.class_("HurtEntities", this.finally_);
      var1.class_("FallHurtAmount", this.native_);
      var1.break_("FallHurtMax", this.extends_);
      if (this.protected_ != null) {
         var1.class_("TileEntityData", this.protected_);
      }
   }

   public void class_(boolean var1) {
      this.finally_ = var1;
   }

   public void class_(rfH_2 var1) {
      ((rmE_2)this.throws_[49]).break_(catch_, var1);
   }

   @Override
   public boolean o() {
      return true;
   }

   @Override
   protected void break_(rcd_3 var1) {
      this.private_ = rco_3.byte_(var1.int_("BlockState"));
      this.class_ = var1.private_("Time");
      if (var1.byte_("HurtEntities", 99)) {
         this.finally_ = var1.new_("HurtEntities");
         this.native_ = var1.finally_("FallHurtAmount");
         this.extends_ = var1.private_("FallHurtMax");
      } else if (this.private_.class_(rls_3.long_)) {
         this.finally_ = true;
      }

      if (var1.byte_("DropItem", 99)) {
         this.break_ = var1.new_("DropItem");
      }

      if (var1.byte_("TileEntityData", 10)) {
         this.protected_ = var1.int_("TileEntityData");
      }

      if (this.private_.catch_()) {
         this.private_ = xu_3.throw_.continue_();
      }
   }

   public rYB throws_() {
      return (rYB)this.throws_[7];
   }

   @Override
   public boolean rt() {
      return false;
   }

   public xc_3 case_() {
      return this.private_;
   }

   public rfH_2 protected_() {
      return ((rmE_2)this.throws_[49]).class_(catch_);
   }

   @Override
   public boolean T() {
      return false;
   }

   @Override
   public boolean rY() {
      return !(Boolean)this.throws_[27];
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected void m_() {
      ((rmE_2)this.throws_[49]).class_(catch_, rfH_2.protected_);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this, xd_3.finally_(this.case_()));
   }
}
