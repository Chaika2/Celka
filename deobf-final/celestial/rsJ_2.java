package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public abstract class rsJ_2 extends an_3 {
   private static final rut_3<Integer> class_ = rmE_2.class_(rsJ_2.class, ruw_3.break_);
   private static final rut_3<Integer> break_ = rmE_2.class_(rsJ_2.class, ruw_3.break_);
   private static final rut_3<Float> protected_ = rmE_2.class_(rsJ_2.class, ruw_3.byte_);
   private static final rut_3<Integer> catch_ = rmE_2.class_(rsJ_2.class, ruw_3.break_);
   private static final rut_3<Integer> private_ = rmE_2.class_(rsJ_2.class, ruw_3.break_);
   private static final rut_3<Boolean> implements_ = rmE_2.class_(rsJ_2.class, ruw_3.implements_);
   private static final ImmutableMap<iM_2, ImmutableList<Integer>> finally_ = ImmutableMap.of(
      iM_2.STANDING, ImmutableList.of(0, 1, -1), iM_2.CROUCHING, ImmutableList.of(0, 1, -1), iM_2.SWIMMING, ImmutableList.of(0, 1)
   );
   private boolean extends_;
   private static final Map<rCR, Pair<rja_3, rja_3>> native_ = rqR_2.class_(Maps.newEnumMap(rCR.class), var0 -> {
      rja_3 var1 = rpr_3.WEST.int_();
      rja_3 var2 = rpr_3.EAST.int_();
      rja_3 var3 = rpr_3.NORTH.int_();
      rja_3 var4 = rpr_3.SOUTH.int_();
      rja_3 var5 = var1.catch_();
      rja_3 var6 = var2.catch_();
      rja_3 var7 = var3.catch_();
      rja_3 var8 = var4.catch_();
      var0.put(rCR.NORTH_SOUTH, Pair.of(var3, var4));
      var0.put(rCR.EAST_WEST, Pair.of(var1, var2));
      var0.put(rCR.ASCENDING_EAST, Pair.of(var5, var2));
      var0.put(rCR.ASCENDING_WEST, Pair.of(var1, var6));
      var0.put(rCR.ASCENDING_NORTH, Pair.of(var3, var8));
      var0.put(rCR.ASCENDING_SOUTH, Pair.of(var7, var4));
      var0.put(rCR.SOUTH_EAST, Pair.of(var4, var2));
      var0.put(rCR.SOUTH_WEST, Pair.of(var4, var1));
      var0.put(rCR.NORTH_WEST, Pair.of(var3, var1));
      var0.put(rCR.NORTH_EAST, Pair.of(var3, var2));
   });
   private int volatile_;
   private double final_;
   private double package_;
   private double int_;
   private double new_;
   private double continue_;
   private double super_;
   private double this_;
   private double else_;

   @Override
   public void byte_(an_3 var1) {
      if (!((rYB)this.throws_[7]).continue_ && !(Boolean)var1.throws_[38] && !(Boolean)this.throws_[38] && !this.synchronized_(var1)) {
         double var2 = var1.rx() - this.rx();
         double var4 = var1.BO() - this.BO();
         double var6 = var2 * var2 + var4 * var4;
         if (var6 >= 1.0E-4F) {
            var6 = (double)rfU_2.class_(var6);
            var2 /= var6;
            var4 /= var6;
            double var8 = 1.0 / var6;
            if (var8 > 1.0) {
               var8 = 1.0;
            }

            var2 *= var8;
            var4 *= var8;
            var2 *= 0.1F;
            var4 *= 0.1F;
            var2 *= (double)(1.0F - this.throws_[39]);
            var4 *= (double)(1.0F - this.throws_[39]);
            var2 *= 0.5;
            var4 *= 0.5;
            if (var1 instanceof rsJ_2) {
               double var10 = var1.rx() - this.rx();
               double var12 = var1.BO() - this.BO();
               rjU_2 var14 = new rjU_2(var10, 0.0, var12).protected_();
               rjU_2 var15 = new rjU_2(
                     (double)rfU_2.break_((Float)this.throws_[15] * (float) (Math.PI / 180.0)),
                     0.0,
                     (double)rfU_2.class_((Float)this.throws_[15] * (float) (Math.PI / 180.0))
                  )
                  .protected_();
               double var16 = Math.abs(var14.break_(var15));
               if (var16 < 0.8F) {
                  return;
               }

               rjU_2 var18 = this.rv();
               rjU_2 var19 = var1.rv();
               if (((rsJ_2)var1).final_() == rsd_3.FURNACE && this.final_() != rsd_3.FURNACE) {
                  this.byte_(var18.throws_(0.2, 1.0, 0.2));
                  this.implements_(var19.break_ - var2, 0.0, var19.protected_ - var4);
                  var1.byte_(var19.throws_(0.95, 1.0, 0.95));
               } else if (((rsJ_2)var1).final_() != rsd_3.FURNACE && this.final_() == rsd_3.FURNACE) {
                  var1.byte_(var19.throws_(0.2, 1.0, 0.2));
                  var1.implements_(var18.break_ + var2, 0.0, var18.protected_ + var4);
                  this.byte_(var18.throws_(0.95, 1.0, 0.95));
               } else {
                  double var20 = (var19.break_ + var18.break_) / 2.0;
                  double var22 = (var19.protected_ + var18.protected_) / 2.0;
                  this.byte_(var18.throws_(0.2, 1.0, 0.2));
                  this.implements_(var20 - var2, 0.0, var22 - var4);
                  var1.byte_(var19.throws_(0.2, 1.0, 0.2));
                  var1.implements_(var20 + var2, 0.0, var22 + var4);
               }
            } else {
               this.implements_(-var2, 0.0, -var4);
               var1.implements_(var2 / 4.0, 0.0, var4 / 4.0);
            }
         }
      }
   }

   protected void byte_(rfH_2 var1, xc_3 var2) {
      Float var60 = 0.0F;
      this.throws_[31] = var60;
      double var3 = this.rx();
      double var5 = this.re();
      double var7 = this.BO();
      rjU_2 var9 = this.continue_(var3, var5, var7);
      var5 = (double)var1.c_();
      boolean var10 = false;
      boolean var11 = false;
      Jo_1 var12 = (Jo_1)var2.break_();
      if (var12 == xu_3.o) {
         var10 = var2.byte_(Ws_1.int_);
         var11 = !var10;
      }

      double var13 = 0.0078125;
      rjU_2 var15 = this.rv();
      rCR var16 = var2.byte_(var12.implements_());
      switch (var16) {
         case ASCENDING_EAST:
            this.byte_(var15.break_(-0.0078125, 0.0, 0.0));
            var5++;
            break;
         case ASCENDING_WEST:
            this.byte_(var15.break_(0.0078125, 0.0, 0.0));
            var5++;
            break;
         case ASCENDING_NORTH:
            this.byte_(var15.break_(0.0, 0.0, 0.0078125));
            var5++;
            break;
         case ASCENDING_SOUTH:
            this.byte_(var15.break_(0.0, 0.0, -0.0078125));
            var5++;
      }

      var15 = this.rv();
      Pair var17 = class_(var16);
      rja_3 var18 = (rja_3)var17.getFirst();
      rja_3 var19 = (rja_3)var17.getSecond();
      double var20 = (double)(var19.b_() - var18.b_());
      double var22 = (double)(var19.d_() - var18.d_());
      double var24 = Math.sqrt(var20 * var20 + var22 * var22);
      double var26 = var15.break_ * var20 + var15.protected_ * var22;
      if (var26 < 0.0) {
         var20 = -var20;
         var22 = -var22;
      }

      double var28 = Math.min(2.0, Math.sqrt(case_(var15)));
      var15 = new rjU_2(var28 * var20 / var24, var15.byte_, var28 * var22 / var24);
      this.byte_(var15);
      an_3 var30 = this.Bh().isEmpty() ? null : this.Bh().get(0);
      if (var30 instanceof rhd_3) {
         rjU_2 var31 = var30.rv();
         double var32 = case_(var31);
         double var34 = case_(this.rv());
         if (var32 > 1.0E-4 && var34 < 0.01) {
            this.byte_(this.rv().break_(var31.break_ * 0.1, 0.0, var31.protected_ * 0.1));
            var11 = false;
         }
      }

      if (var11) {
         double var69 = Math.sqrt(case_(this.rv()));
         if (var69 < 0.03) {
            this.byte_(rjU_2.class_);
         } else {
            this.byte_(this.rv().throws_(0.5, 0.0, 0.5));
         }
      }

      double var70 = (double)var1.b_() + 0.5 + (double)var18.b_() * 0.5;
      double var33 = (double)var1.d_() + 0.5 + (double)var18.d_() * 0.5;
      double var35 = (double)var1.b_() + 0.5 + (double)var19.b_() * 0.5;
      double var37 = (double)var1.d_() + 0.5 + (double)var19.d_() * 0.5;
      var20 = var35 - var70;
      var22 = var37 - var33;
      double var39;
      if (var20 == 0.0) {
         var39 = var7 - (double)var1.d_();
      } else if (var22 == 0.0) {
         var39 = var3 - (double)var1.b_();
      } else {
         double var41 = var3 - var70;
         double var43 = var7 - var33;
         var39 = (var41 * var20 + var43 * var22) * 2.0;
      }

      var3 = var70 + var20 * var39;
      var7 = var33 + var22 * var39;
      this.new_(var3, var5, var7);
      double var71 = this.BP() ? 0.75 : 1.0;
      double var72 = this.protected_();
      var15 = this.rv();
      this.class_(iG_2.SELF, new rjU_2(rfU_2.class_(var71 * var15.break_, -var72, var72), 0.0, rfU_2.class_(var71 * var15.protected_, -var72, var72)));
      if (var18.c_() != 0 && rfU_2.byte_(this.rx()) - var1.b_() == var18.b_() && rfU_2.byte_(this.BO()) - var1.d_() == var18.d_()) {
         this.new_(this.rx(), this.re() + (double)var18.c_(), this.BO());
      } else if (var19.c_() != 0 && rfU_2.byte_(this.rx()) - var1.b_() == var19.b_() && rfU_2.byte_(this.BO()) - var1.d_() == var19.d_()) {
         this.new_(this.rx(), this.re() + (double)var19.c_(), this.BO());
      }

      this.case_();
      rjU_2 var45 = this.continue_(this.rx(), this.re(), this.BO());
      if (var45 != null && var9 != null) {
         double var46 = (var9.byte_ - var45.byte_) * 0.05;
         rjU_2 var48 = this.rv();
         double var49 = Math.sqrt(case_(var48));
         if (var49 > 0.0) {
            this.byte_(var48.throws_((var49 + var46) / var49, 1.0, (var49 + var46) / var49));
         }

         this.new_(this.rx(), var45.byte_, this.BO());
      }

      int var73 = rfU_2.byte_(this.rx());
      int var47 = rfU_2.byte_(this.BO());
      if (var73 != var1.b_() || var47 != var1.d_()) {
         rjU_2 var74 = this.rv();
         double var76 = Math.sqrt(case_(var74));
         this.catch_(var76 * (double)(var73 - var1.b_()), var74.byte_, var76 * (double)(var47 - var1.d_()));
      }

      if (var10) {
         rjU_2 var75 = this.rv();
         double var77 = Math.sqrt(case_(var75));
         if (var77 > 0.01) {
            double var51 = 0.06;
            this.byte_(var75.break_(var75.break_ / var77 * 0.06, 0.0, var75.protected_ / var77 * 0.06));
         } else {
            rjU_2 var78 = this.rv();
            double var52 = var78.break_;
            double var54 = var78.protected_;
            if (var16 == rCR.EAST_WEST) {
               if (this.class_(var1.byte_())) {
                  var52 = 0.02;
               } else if (this.class_(var1.extends_())) {
                  var52 = -0.02;
               }
            } else {
               if (var16 != rCR.NORTH_SOUTH) {
                  return;
               }

               if (this.class_(var1.private_())) {
                  var54 = 0.02;
               } else if (this.class_(var1.protected_())) {
                  var54 = -0.02;
               }
            }

            this.catch_(var52, var78.byte_, var54);
         }
      }
   }

   public void byte_(int var1) {
      this.BQ().break_(private_, var1);
      this.class_(true);
   }

   public void byte_(float var1) {
      ((rmE_2)this.throws_[49]).break_(protected_, var1);
   }

   public xc_3 int_() {
      return xu_3.class_.continue_();
   }

   protected rsJ_2(aI_2<?> var1, rYB var2, double var3, double var5, double var7) {
      this(var1, var2);
      this.new_(var3, var5, var7);
      this.byte_(rjU_2.class_);
      Double var13 = var3;
      this.throws_[8] = var13;
      Double var14 = var5;
      this.throws_[9] = var14;
      Double var15 = var7;
      this.throws_[10] = var15;
   }

   protected rsJ_2(aI_2<?> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.throws_[2] = var7;
   }

   @Override
   public void this_() {
      if (this.private_() > 0) {
         this.class_(this.private_() - 1);
      }

      if (this.catch_() > 0.0F) {
         this.byte_(this.catch_() - 1.0F);
      }

      if (this.re() < -64.0) {
         this.PQ();
      }

      this.PB();
      if (((rYB)this.throws_[7]).continue_) {
         if (this.volatile_ > 0) {
            double var1 = this.rx() + (this.final_ - this.rx()) / (double)this.volatile_;
            double var3 = this.re() + (this.package_ - this.re()) / (double)this.volatile_;
            double var5 = this.BO() + (this.int_ - this.BO()) / (double)this.volatile_;
            double var7 = rfU_2.case_(this.new_ - (double)((Float)this.throws_[15]).floatValue());
            Float var19 = (float)((double)((Float)this.throws_[15]).floatValue() + var7 / (double)this.volatile_);
            this.throws_[15] = var19;
            Float var20 = (float)(
               (double)((Float)this.throws_[16]).floatValue() + (this.continue_ - (double)((Float)this.throws_[16]).floatValue()) / (double)this.volatile_
            );
            this.throws_[16] = var20;
            this.volatile_--;
            this.new_(var1, var3, var5);
            this.case_((Float)this.throws_[15], (Float)this.throws_[16]);
         } else {
            this.PX();
            this.case_((Float)this.throws_[15], (Float)this.throws_[16]);
         }
      } else {
         if (!this.rw()) {
            this.byte_(this.rv().break_(0.0, -0.04, 0.0));
         }

         int var27 = rfU_2.byte_(this.rx());
         int var2 = rfU_2.byte_(this.re());
         int var28 = rfU_2.byte_(this.BO());
         if (((rYB)this.throws_[7]).byte_(new rfH_2(var27, var2 - 1, var28)).class_(rls_3.float_)) {
            var2--;
         }

         rfH_2 var4 = new rfH_2(var27, var2, var28);
         xc_3 var29 = ((rYB)this.throws_[7]).byte_(var4);
         if (Jo_1.catch_(var29)) {
            this.byte_(var4, var29);
            if (var29.class_(xu_3.sT)) {
               this.class_(var27, var2, var28, var29.byte_(Ws_1.int_));
            }
         } else {
            this.throws_();
         }

         this.Px();
         Float var21 = 0.0F;
         this.throws_[16] = var21;
         double var6 = (Double)this.throws_[8] - this.rx();
         double var8 = (Double)this.throws_[10] - this.BO();
         if (var6 * var6 + var8 * var8 > 0.001) {
            Float var22 = (float)(rfU_2.protected_(var8, var6) * 180.0 / Math.PI);
            this.throws_[15] = var22;
            if (this.extends_) {
               Float var23 = (Float)this.throws_[15] + 180.0F;
               this.throws_[15] = var23;
            }
         }

         double var10 = (double)rfU_2.catch_((Float)this.throws_[15] - (Float)this.throws_[17]);
         if (var10 < -170.0 || var10 >= 170.0) {
            Float var24 = (Float)this.throws_[15] + 180.0F;
            this.throws_[15] = var24;
            this.extends_ = !this.extends_;
         }

         this.case_((Float)this.throws_[15], (Float)this.throws_[16]);
         if (this.final_() == rsd_3.RIDEABLE && case_(this.rv()) > 0.01) {
            List var30 = ((rYB)this.throws_[7]).break_(this, this.rN().byte_(0.2F, 0.0, 0.2F), rpJ_2.class_(this));
            if (!var30.isEmpty()) {
               for (int var31 = 0; var31 < var30.size(); var31++) {
                  an_3 var14 = (an_3)var30.get(var31);
                  if (!(var14 instanceof rhd_3) && !(var14 instanceof rMZ) && !(var14 instanceof rsJ_2) && !this.BP() && !var14.Pm()) {
                     var14.this_(this);
                  } else {
                     var14.byte_(this);
                  }
               }
            }
         } else {
            for (an_3 var13 : ((rYB)this.throws_[7]).class_(this, this.rN().byte_(0.2F, 0.0, 0.2F))) {
               if (!this.synchronized_(var13) && var13.rG() && var13 instanceof rsJ_2) {
                  var13.byte_(this);
               }
            }
         }

         this.PM();
         if (this.ry()) {
            this.rb();
            Float var25 = (Float)this.throws_[31] * 0.5F;
            this.throws_[31] = var25;
         }

         Boolean var26 = false;
         this.throws_[48] = var26;
      }
   }

   @Override
   protected rjU_2 class_(rpB_2 var1, rqT_2 var2) {
      return iB_2.implements_(super.class_(var1, var2));
   }

   public void class_(int var1, int var2, int var3, boolean var4) {
   }

   @Override
   public void class_(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.final_ = var1;
      this.package_ = var3;
      this.int_ = var5;
      this.new_ = (double)var7;
      this.continue_ = (double)var8;
      this.volatile_ = var9 + 2;
      this.catch_(this.super_, this.this_, this.else_);
   }

   public void class_(boolean var1) {
      this.BQ().break_(implements_, var1);
   }

   private boolean class_(rfH_2 var1) {
      return ((rYB)this.throws_[7]).byte_(var1).catch_((rYB)this.throws_[7], var1);
   }

   public void class_(int var1) {
      ((rmE_2)this.throws_[49]).break_(class_, var1);
   }

   public rjU_2 class_(double var1, double var3, double var5, double var7) {
      int var9 = rfU_2.byte_(var1);
      int var10 = rfU_2.byte_(var3);
      int var11 = rfU_2.byte_(var5);
      if (((rYB)this.throws_[7]).byte_(new rfH_2(var9, var10 - 1, var11)).class_(rls_3.float_)) {
         var10--;
      }

      xc_3 var12 = ((rYB)this.throws_[7]).byte_(new rfH_2(var9, var10, var11));
      if (Jo_1.catch_(var12)) {
         rCR var13 = var12.byte_(((Jo_1)var12.break_()).implements_());
         var3 = (double)var10;
         if (var13.break_()) {
            var3 = (double)(var10 + 1);
         }

         Pair var14 = class_(var13);
         rja_3 var15 = (rja_3)var14.getFirst();
         rja_3 var16 = (rja_3)var14.getSecond();
         double var17 = (double)(var16.b_() - var15.b_());
         double var19 = (double)(var16.d_() - var15.d_());
         double var21 = Math.sqrt(var17 * var17 + var19 * var19);
         var17 /= var21;
         var19 /= var21;
         var1 += var17 * var7;
         var5 += var19 * var7;
         if (var15.c_() != 0 && rfU_2.byte_(var1) - var9 == var15.b_() && rfU_2.byte_(var5) - var11 == var15.d_()) {
            var3 += (double)var15.c_();
         } else if (var16.c_() != 0 && rfU_2.byte_(var1) - var9 == var16.b_() && rfU_2.byte_(var5) - var11 == var16.d_()) {
            var3 += (double)var16.c_();
         }

         return this.continue_(var1, var3, var5);
      } else {
         return null;
      }
   }

   public static rsJ_2 class_(rYB var0, double var1, double var3, double var5, rsd_3 var7) {
      if (var7 == rsd_3.CHEST) {
         return new rsk_3(var0, var1, var3, var5);
      } else if (var7 == rsd_3.FURNACE) {
         return new rsN_2(var0, var1, var3, var5);
      } else if (var7 == rsd_3.TNT) {
         return new rsv_3(var0, var1, var3, var5);
      } else if (var7 == rsd_3.SPAWNER) {
         return new rsm_3(var0, var1, var3, var5);
      } else if (var7 == rsd_3.HOPPER) {
         return new rsc_3(var0, var1, var3, var5);
      } else {
         return (rsJ_2)(var7 == rsd_3.COMMAND_BLOCK ? new rsW_2(var0, var1, var3, var5) : new rsu_3(var0, var1, var3, var5));
      }
   }

   private static Pair<rja_3, rja_3> class_(rCR var0) {
      return native_.get(var0);
   }

   @Override
   protected void class_(rcd_3 var1) {
      if (this.super_()) {
         var1.class_("CustomDisplayTile", true);
         var1.class_("DisplayState", rco_3.class_(this.package_()));
         var1.break_("DisplayOffset", this.new_());
      }
   }

   public void break_(int var1) {
      ((rmE_2)this.throws_[49]).break_(break_, var1);
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (((rYB)this.throws_[7]).continue_ || (Boolean)this.throws_[27]) {
         return true;
      } else if (this.class_(var1)) {
         return false;
      } else {
         this.break_(-this.implements_());
         this.class_(10);
         this.rf();
         this.byte_(this.catch_() + var2 * 10.0F);
         boolean var3 = var1.extends_() instanceof rhd_3 && ((rhx_3)((rhd_3)var1.extends_()).implements_[18]).protected_;
         if (var3 || this.catch_() > 40.0F) {
            this.Bn();
            if (var3 && !this.Bk()) {
               this.PD();
            } else {
               this.break_(var1);
            }
         }

         return true;
      }
   }

   public void break_(rye_3 var1) {
      this.PD();
      if (((rYB)this.throws_[7]).B().break_(rRu_1.catch_)) {
         rdn_3 var2 = new rdn_3(rdy_3.ho);
         if (this.Bk()) {
            var2.class_(this.rD());
         }

         this.a_(var2);
      }
   }

   @Override
   protected void break_(rcd_3 var1) {
      if (var1.new_("CustomDisplayTile")) {
         this.break_(rco_3.byte_(var1.int_("DisplayState")));
         this.byte_(var1.private_("DisplayOffset"));
      }
   }

   public void break_(xc_3 var1) {
      this.BQ().break_(catch_, xd_3.finally_(var1));
      this.class_(true);
   }

   protected void throws_() {
      double var1 = this.protected_();
      rjU_2 var3 = this.rv();
      this.catch_(rfU_2.class_(var3.break_, -var1, var1), var3.byte_, rfU_2.class_(var3.protected_, -var1, var1));
      if ((Boolean)this.throws_[20]) {
         this.byte_(this.rv().class_(0.5));
      }

      this.class_(iG_2.SELF, this.rv());
      if (!(Boolean)this.throws_[20]) {
         this.byte_(this.rv().class_(0.95));
      }
   }

   public float catch_() {
      return ((rmE_2)this.throws_[49]).class_(protected_);
   }

   @Override
   public void extends_(double var1, double var3, double var5) {
      this.super_ = var1;
      this.this_ = var3;
      this.else_ = var5;
      this.catch_(this.super_, this.this_, this.else_);
   }

   protected void case_() {
      double var1 = this.BP() ? 0.997 : 0.96;
      this.byte_(this.rv().throws_(var1, 0.0, var1));
   }

   public int continue_() {
      return 6;
   }

   public rjU_2 continue_(double var1, double var3, double var5) {
      int var7 = rfU_2.byte_(var1);
      int var8 = rfU_2.byte_(var3);
      int var9 = rfU_2.byte_(var5);
      if (((rYB)this.throws_[7]).byte_(new rfH_2(var7, var8 - 1, var9)).class_(rls_3.float_)) {
         var8--;
      }

      xc_3 var10 = ((rYB)this.throws_[7]).byte_(new rfH_2(var7, var8, var9));
      if (Jo_1.catch_(var10)) {
         rCR var11 = var10.byte_(((Jo_1)var10.break_()).implements_());
         Pair var12 = class_(var11);
         rja_3 var13 = (rja_3)var12.getFirst();
         rja_3 var14 = (rja_3)var12.getSecond();
         double var15 = (double)var7 + 0.5 + (double)var13.b_() * 0.5;
         double var17 = (double)var8 + 0.0625 + (double)var13.c_() * 0.5;
         double var19 = (double)var9 + 0.5 + (double)var13.d_() * 0.5;
         double var21 = (double)var7 + 0.5 + (double)var14.b_() * 0.5;
         double var23 = (double)var8 + 0.0625 + (double)var14.c_() * 0.5;
         double var25 = (double)var9 + 0.5 + (double)var14.d_() * 0.5;
         double var27 = var21 - var15;
         double var29 = (var23 - var17) * 2.0;
         double var31 = var25 - var19;
         double var33;
         if (var27 == 0.0) {
            var33 = var5 - (double)var9;
         } else if (var31 == 0.0) {
            var33 = var1 - (double)var7;
         } else {
            double var35 = var1 - var15;
            double var37 = var5 - var19;
            var33 = (var35 * var27 + var37 * var31) * 2.0;
         }

         var1 = var15 + var27 * var33;
         var3 = var17 + var29 * var33;
         var5 = var19 + var31 * var33;
         if (var29 < 0.0) {
            var3++;
         } else if (var29 > 0.0) {
            var3 += 0.5;
         }

         return new rjU_2(var1, var3, var5);
      } else {
         return null;
      }
   }

   public int implements_() {
      return ((rmE_2)this.throws_[49]).class_(break_);
   }

   public int new_() {
      return !this.super_() ? this.continue_() : this.BQ().class_(private_);
   }

   public xc_3 package_() {
      return !this.super_() ? this.int_() : xd_3.class_(this.BQ().class_(catch_));
   }

   public boolean super_() {
      return this.BQ().class_(implements_);
   }

   @Override
   public boolean super_(an_3 var1) {
      return rSK.class_(this, var1);
   }

   protected double protected_() {
      return 0.4;
   }

   public int private_() {
      return ((rmE_2)this.throws_[49]).class_(class_);
   }

   public abstract rsd_3 final_();

   @Override
   protected float rq() {
      xc_3 var1 = ((rYB)this.throws_[7]).byte_(this.Bs());
      return var1.class_(rls_3.float_) ? 1.0F : super.rq();
   }

   @Override
   public boolean rG() {
      return true;
   }

   @Override
   public double PS() {
      return 0.0;
   }

   @Override
   public rfl_3 PE() {
      rfl_3 var1 = this.rN();
      return this.super_() ? var1.class_((double)Math.abs(this.new_()) / 16.0) : var1;
   }

   @Override
   public void rF() {
      this.break_(-this.implements_());
      this.class_(10);
      this.byte_(this.catch_() + this.catch_() * 10.0F);
   }

   @Override
   public boolean rY() {
      return !(Boolean)this.throws_[27];
   }

   @Override
   public rpr_3 rS() {
      return this.extends_ ? this.Pg().case_().catch_() : this.Pg().catch_();
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   public rjU_2 a_(iB_2 var1) {
      rpr_3 var2 = this.rS();
      if (var2.final_() == rpB_2.Y) {
         return super.a_(var1);
      } else {
         int[][] var3 = rqI_2.class_(var2);
         rfH_2 var4 = this.Bs();
         rfw_3 var5 = new rfw_3();
         ImmutableList var6 = var1.BV();
         UnmodifiableIterator var7 = var6.iterator();

         while (var7.hasNext()) {
            iM_2 var8 = (iM_2)var7.next();
            ap_3 var9 = var1.a_(var8);
            float var10 = Math.min(var9.class_, 1.0F) / 2.0F;
            UnmodifiableIterator var11 = ((ImmutableList)finally_.get(var8)).iterator();

            while (var11.hasNext()) {
               int var12 = (Integer)var11.next();

               for (int[] var16 : var3) {
                  var5.class_(var4.b_() + var16[0], var4.c_() + var12, var4.d_() + var16[1]);
                  double var17 = ((rYB)this.throws_[7])
                     .class_(rqI_2.class_((rYB)this.throws_[7], var5), () -> rqI_2.class_((rYB)this.throws_[7], var5.break_()));
                  if (rqI_2.class_(var17)) {
                     rfl_3 var19 = new rfl_3((double)(-var10), 0.0, (double)(-var10), (double)var10, (double)var9.break_, (double)var10);
                     rjU_2 var20 = rjU_2.class_(var5, var17);
                     if (rqI_2.class_((rYB)this.throws_[7], var1, var19.protected_(var20))) {
                        var1.class_(var8);
                        return var20;
                     }
                  }
               }
            }
         }

         double var21 = this.rN().throws_;
         var5.break_((double)var4.b_(), var21, (double)var4.d_());
         UnmodifiableIterator var22 = var6.iterator();

         while (var22.hasNext()) {
            iM_2 var23 = (iM_2)var22.next();
            double var24 = (double)var1.a_(var23).break_;
            int var25 = rfU_2.throws_(var21 - (double)var5.c_() + var24);
            double var26 = rqI_2.class_(var5, var25, var1x -> ((rYB)this.throws_[7]).byte_(var1x).extends_((rYB)this.throws_[7], var1x));
            if (var21 + var24 <= var26) {
               var1.class_(var23);
               break;
            }
         }

         return super.a_(var1);
      }
   }

   @Override
   protected void m_() {
      ((rmE_2)this.throws_[49]).class_(class_, 0);
      ((rmE_2)this.throws_[49]).class_(break_, 1);
      ((rmE_2)this.throws_[49]).class_(protected_, 0.0F);
      ((rmE_2)this.throws_[49]).class_(catch_, xd_3.finally_(xu_3.class_.continue_()));
      ((rmE_2)this.throws_[49]).class_(private_, 6);
      ((rmE_2)this.throws_[49]).class_(implements_, false);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
