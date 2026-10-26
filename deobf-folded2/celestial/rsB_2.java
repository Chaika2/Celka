package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;

public class rsB_2 extends an_3 {
   private xc_3 id_private = xu_3.id_throw.id_continue();
   public int id_class;
   public boolean id_break = true;
   private boolean id_implements;
   private boolean id_finally;
   private int id_extends = 40;
   private float id_native = 2.0F;
   public rcd_3 id_protected;
   protected static final rut_3<rfH_2> id_catch = rmE_2.id_class(rsB_2.class, ruw_3.id_native);

   public rsB_2(aI_2<? extends rsB_2> var1, rYB var2) {
      super(var1, var2);
   }

   public rsB_2(rYB var1, double var2, double var4, double var6, xc_3 var8) {
      this(aI_2.id_try, var1);
      this.id_private = var8;
      Boolean var13 = true;
      this.id_throws[2] = var13;
      this.id_new(var2, var4 + (double)((1.0F - this.Bm()) / 2.0F), var6);
      this.id_byte(rjU_2.id_class);
      Double var14 = var2;
      this.id_throws[8] = var14;
      Double var15 = var4;
      this.id_throws[9] = var15;
      Double var16 = var6;
      this.id_throws[10] = var16;
      this.id_class(this.Bs());
   }

   @Override
   public void id_this() {
      if (this.id_private.id_catch()) {
         this.PD();
      } else {
         xd_3 var1 = this.id_private.id_break();
         if (this.id_class++ == 0) {
            rfH_2 var2 = this.Bs();
            if (((rYB)this.id_throws[7]).id_byte(var2).id_class(var1)) {
               ((rYB)this.id_throws[7]).id_class(var2, false);
            } else if (!((rYB)this.id_throws[7]).id_continue) {
               this.PD();
               return;
            }
         }

         if (!this.rw()) {
            this.id_byte(this.rv().id_break(0.0, -0.04, 0.0));
         }

         this.id_class(iG_2.SELF, this.rv());
         if (!((rYB)this.id_throws[7]).id_continue) {
            rfH_2 var16 = this.Bs();
            boolean var3 = this.id_private.id_break() instanceof dr_3;
            boolean var4 = var3 && ((rYB)this.id_throws[7]).id_break(var16).id_class(rlG_2.id_break);
            double var5 = this.rv().id_catch();
            if (var3 && var5 > 1.0) {
               rff_3 var7 = ((rYB)this.id_throws[7])
                  .id_class(
                     new rjB_2(
                        new rjU_2((Double)this.id_throws[8], (Double)this.id_throws[9], (Double)this.id_throws[10]),
                        this.Ps(),
                        rjS_2.COLLIDER,
                        rjs_3.SOURCE_ONLY,
                        this
                     )
                  );
               if (var7.id_byte() != rjM_2.MISS && ((rYB)this.id_throws[7]).id_break(var7.id_class()).id_class(rlG_2.id_break)) {
                  var16 = var7.id_class();
                  var4 = true;
               }
            }

            if (!(Boolean)this.id_throws[20] && !var4) {
               if (!((rYB)this.id_throws[7]).id_continue && (this.id_class > 100 && (var16.c_() < 1 || var16.c_() > 256) || this.id_class > 600)) {
                  if (this.id_break && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
                     this.id_class(var1);
                  }

                  this.PD();
               }
            } else {
               xc_3 var17 = ((rYB)this.id_throws[7]).id_byte(var16);
               this.id_byte(this.rv().id_throws(0.7, -0.5, 0.7));
               if (!var17.id_class(xu_3.rc)) {
                  this.PD();
                  if (this.id_implements) {
                     if (var1 instanceof dH_2) {
                        ((dH_2)var1).id_class((rYB)this.id_throws[7], var16, this);
                     }
                  } else {
                     boolean var8 = var17.id_class(new rxv_3((rYB)this.id_throws[7], var16, rpr_3.DOWN, rdn_3.id_break, rpr_3.UP));
                     boolean var9 = dH_2.id_implements(((rYB)this.id_throws[7]).id_byte(var16.id_break())) && (!var3 || !var4);
                     boolean var10 = this.id_private.id_class((rRR)((rYB)this.id_throws[7]), var16) && !var9;
                     if (var8 && var10) {
                        if (this.id_private.id_break(rCT.id_throw) && ((rYB)this.id_throws[7]).id_break(var16).id_class() == rXG.id_byte) {
                           this.id_private = this.id_private.id_class(rCT.id_throw, Boolean.valueOf(true));
                        }

                        if (!((rYB)this.id_throws[7]).id_class(var16, this.id_private, 3)) {
                           if (this.id_break && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
                              this.id_class(var1);
                           }
                        } else {
                           if (var1 instanceof dH_2) {
                              ((dH_2)var1).id_class((rYB)this.id_throws[7], var16, this.id_private, var17, this);
                           }

                           if (this.id_protected != null && var1 instanceof kx_3) {
                              ryO_2 var11 = ((rYB)this.id_throws[7]).id_class(var16);
                              if (var11 != null) {
                                 rcd_3 var12 = var11.id_class(new rcd_3());

                                 for (String var14 : this.id_protected.id_protected()) {
                                    rcZ_2 var15 = this.id_protected.id_byte(var14);
                                    if (!"x".equals(var14) && !"y".equals(var14) && !"z".equals(var14)) {
                                       var12.id_class(var14, var15.id_byte());
                                    }
                                 }

                                 var11.id_class(this.id_private, var12);
                                 var11.id_break();
                              }
                           }
                        }
                     } else if (this.id_break && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
                        this.id_class(var1);
                     }
                  }
               }
            }
         }

         this.id_byte(this.rv().id_class(0.98));
      }
   }

   @Override
   public void id_class(Ko_1 var1) {
      super.id_class(var1);
      var1.id_class("Immitating BlockState", this.id_private.toString());
   }

   @Override
   public boolean id_class(float var1, float var2) {
      if (this.id_finally) {
         int var3 = rfU_2.id_case(var1 - 1.0F);
         if (var3 > 0) {
            ArrayList var4 = Lists.newArrayList(((rYB)this.id_throws[7]).id_class(this, this.rN()));
            boolean var5 = this.id_private.id_class(rls_3.id_long);
            rye_3 var6 = var5 ? rye_3.id_new : rye_3.id_continue;

            for (an_3 var8 : var4) {
               var8.id_break(var6, (float)Math.min(rfU_2.id_protected((float)var3 * this.id_native), this.id_extends));
            }

            if (var5 && (double)((Random)this.id_throws[40]).nextFloat() < 0.05F + (double)var3 * 0.05) {
               xc_3 var9 = Ji_1.id_private(this.id_private);
               if (var9 == null) {
                  this.id_implements = true;
               } else {
                  this.id_private = var9;
               }
            }
         }
      }

      return false;
   }

   @Override
   protected void id_class(rcd_3 var1) {
      var1.id_class("BlockState", rco_3.id_class(this.id_private));
      var1.id_break("Time", this.id_class);
      var1.id_class("DropItem", this.id_break);
      var1.id_class("HurtEntities", this.id_finally);
      var1.id_class("FallHurtAmount", this.id_native);
      var1.id_break("FallHurtMax", this.id_extends);
      if (this.id_protected != null) {
         var1.id_class("TileEntityData", this.id_protected);
      }
   }

   public void id_class(boolean var1) {
      this.id_finally = var1;
   }

   public void id_class(rfH_2 var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_catch, var1);
   }

   @Override
   public boolean o() {
      return true;
   }

   @Override
   protected void id_break(rcd_3 var1) {
      this.id_private = rco_3.id_byte(var1.id_int("BlockState"));
      this.id_class = var1.id_private("Time");
      if (var1.id_byte("HurtEntities", 99)) {
         this.id_finally = var1.id_new("HurtEntities");
         this.id_native = var1.id_finally("FallHurtAmount");
         this.id_extends = var1.id_private("FallHurtMax");
      } else if (this.id_private.id_class(rls_3.id_long)) {
         this.id_finally = true;
      }

      if (var1.id_byte("DropItem", 99)) {
         this.id_break = var1.id_new("DropItem");
      }

      if (var1.id_byte("TileEntityData", 10)) {
         this.id_protected = var1.id_int("TileEntityData");
      }

      if (this.id_private.id_catch()) {
         this.id_private = xu_3.id_throw.id_continue();
      }
   }

   public rYB id_throws() {
      return (rYB)this.id_throws[7];
   }

   @Override
   public boolean rt() {
      return false;
   }

   public xc_3 id_case() {
      return this.id_private;
   }

   public rfH_2 id_protected() {
      return ((rmE_2)this.id_throws[49]).id_class(id_catch);
   }

   @Override
   public boolean T() {
      return false;
   }

   @Override
   public boolean rY() {
      return !(Boolean)this.id_throws[27];
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected void m_() {
      ((rmE_2)this.id_throws[49]).id_class(id_catch, rfH_2.id_protected);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this, xd_3.id_finally(this.id_case()));
   }
}
