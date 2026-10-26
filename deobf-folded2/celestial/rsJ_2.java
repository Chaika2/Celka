package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public abstract class rsJ_2 extends an_3 {
   private static final rut_3<Integer> id_class = rmE_2.id_class(rsJ_2.class, ruw_3.id_break);
   private static final rut_3<Integer> id_break = rmE_2.id_class(rsJ_2.class, ruw_3.id_break);
   private static final rut_3<Float> id_protected = rmE_2.id_class(rsJ_2.class, ruw_3.id_byte);
   private static final rut_3<Integer> id_catch = rmE_2.id_class(rsJ_2.class, ruw_3.id_break);
   private static final rut_3<Integer> id_private = rmE_2.id_class(rsJ_2.class, ruw_3.id_break);
   private static final rut_3<Boolean> id_implements = rmE_2.id_class(rsJ_2.class, ruw_3.id_implements);
   private static final ImmutableMap<iM_2, ImmutableList<Integer>> id_finally = ImmutableMap.of(
      iM_2.STANDING, ImmutableList.of(0, 1, -1), iM_2.CROUCHING, ImmutableList.of(0, 1, -1), iM_2.SWIMMING, ImmutableList.of(0, 1)
   );
   private boolean id_extends;
   private static final Map<rCR, Pair<rja_3, rja_3>> id_native = rqR_2.id_class(Maps.newEnumMap(rCR.class), var0 -> {
      rja_3 var1 = rpr_3.WEST.id_int();
      rja_3 var2 = rpr_3.EAST.id_int();
      rja_3 var3 = rpr_3.NORTH.id_int();
      rja_3 var4 = rpr_3.SOUTH.id_int();
      rja_3 var5 = var1.id_catch();
      rja_3 var6 = var2.id_catch();
      rja_3 var7 = var3.id_catch();
      rja_3 var8 = var4.id_catch();
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
   private int id_volatile;
   private double id_final;
   private double id_package;
   private double id_int;
   private double id_new;
   private double id_continue;
   private double id_super;
   private double id_this;
   private double id_else;

   @Override
   public void id_byte(an_3 var1) {
      if (!((rYB)this.id_throws[7]).id_continue && !(Boolean)var1.id_throws[38] && !(Boolean)this.id_throws[38] && !this.id_synchronized(var1)) {
         double var2 = var1.rx() - this.rx();
         double var4 = var1.BO() - this.BO();
         double var6 = var2 * var2 + var4 * var4;
         if (var6 >= 1.0E-4F) {
            var6 = (double)rfU_2.id_class(var6);
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
            var2 *= (double)(1.0F - this.id_throws[39]);
            var4 *= (double)(1.0F - this.id_throws[39]);
            var2 *= 0.5;
            var4 *= 0.5;
            if (var1 instanceof rsJ_2) {
               double var10 = var1.rx() - this.rx();
               double var12 = var1.BO() - this.BO();
               rjU_2 var14 = new rjU_2(var10, 0.0, var12).id_protected();
               rjU_2 var15 = new rjU_2(
                     (double)rfU_2.id_break((Float)this.id_throws[15] * (float) (Math.PI / 180.0)),
                     0.0,
                     (double)rfU_2.id_class((Float)this.id_throws[15] * (float) (Math.PI / 180.0))
                  )
                  .id_protected();
               double var16 = Math.abs(var14.id_break(var15));
               if (var16 < 0.8F) {
                  return;
               }

               rjU_2 var18 = this.rv();
               rjU_2 var19 = var1.rv();
               if (((rsJ_2)var1).id_final() == rsd_3.FURNACE && this.id_final() != rsd_3.FURNACE) {
                  this.id_byte(var18.id_throws(0.2, 1.0, 0.2));
                  this.id_implements(var19.id_break - var2, 0.0, var19.id_protected - var4);
                  var1.id_byte(var19.id_throws(0.95, 1.0, 0.95));
               } else if (((rsJ_2)var1).id_final() != rsd_3.FURNACE && this.id_final() == rsd_3.FURNACE) {
                  var1.id_byte(var19.id_throws(0.2, 1.0, 0.2));
                  var1.id_implements(var18.id_break + var2, 0.0, var18.id_protected + var4);
                  this.id_byte(var18.id_throws(0.95, 1.0, 0.95));
               } else {
                  double var20 = (var19.id_break + var18.id_break) / 2.0;
                  double var22 = (var19.id_protected + var18.id_protected) / 2.0;
                  this.id_byte(var18.id_throws(0.2, 1.0, 0.2));
                  this.id_implements(var20 - var2, 0.0, var22 - var4);
                  var1.id_byte(var19.id_throws(0.2, 1.0, 0.2));
                  var1.id_implements(var20 + var2, 0.0, var22 + var4);
               }
            } else {
               this.id_implements(-var2, 0.0, -var4);
               var1.id_implements(var2 / 4.0, 0.0, var4 / 4.0);
            }
         }
      }
   }

   protected void id_byte(rfH_2 var1, xc_3 var2) {
      Float var60 = 0.0F;
      this.id_throws[31] = var60;
      double var3 = this.rx();
      double var5 = this.re();
      double var7 = this.BO();
      rjU_2 var9 = this.id_continue(var3, var5, var7);
      var5 = (double)var1.c_();
      boolean var10 = false;
      boolean var11 = false;
      Jo_1 var12 = (Jo_1)var2.id_break();
      if (var12 == xu_3.o) {
         var10 = var2.id_byte(Ws_1.id_int);
         var11 = !var10;
      }

      double var13 = 0.0078125;
      rjU_2 var15 = this.rv();
      rCR var16 = var2.id_byte(var12.id_implements());
      switch (var16) {
         case ASCENDING_EAST:
            this.id_byte(var15.id_break(-0.0078125, 0.0, 0.0));
            var5++;
            break;
         case ASCENDING_WEST:
            this.id_byte(var15.id_break(0.0078125, 0.0, 0.0));
            var5++;
            break;
         case ASCENDING_NORTH:
            this.id_byte(var15.id_break(0.0, 0.0, 0.0078125));
            var5++;
            break;
         case ASCENDING_SOUTH:
            this.id_byte(var15.id_break(0.0, 0.0, -0.0078125));
            var5++;
      }

      var15 = this.rv();
      Pair var17 = id_class(var16);
      rja_3 var18 = (rja_3)var17.getFirst();
      rja_3 var19 = (rja_3)var17.getSecond();
      double var20 = (double)(var19.b_() - var18.b_());
      double var22 = (double)(var19.d_() - var18.d_());
      double var24 = Math.sqrt(var20 * var20 + var22 * var22);
      double var26 = var15.id_break * var20 + var15.id_protected * var22;
      if (var26 < 0.0) {
         var20 = -var20;
         var22 = -var22;
      }

      double var28 = Math.min(2.0, Math.sqrt(id_case(var15)));
      var15 = new rjU_2(var28 * var20 / var24, var15.id_byte, var28 * var22 / var24);
      this.id_byte(var15);
      an_3 var30 = this.Bh().isEmpty() ? null : this.Bh().get(0);
      if (var30 instanceof rhd_3) {
         rjU_2 var31 = var30.rv();
         double var32 = id_case(var31);
         double var34 = id_case(this.rv());
         if (var32 > 1.0E-4 && var34 < 0.01) {
            this.id_byte(this.rv().id_break(var31.id_break * 0.1, 0.0, var31.id_protected * 0.1));
            var11 = false;
         }
      }

      if (var11) {
         double var69 = Math.sqrt(id_case(this.rv()));
         if (var69 < 0.03) {
            this.id_byte(rjU_2.id_class);
         } else {
            this.id_byte(this.rv().id_throws(0.5, 0.0, 0.5));
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
      this.id_new(var3, var5, var7);
      double var71 = this.BP() ? 0.75 : 1.0;
      double var72 = this.id_protected();
      var15 = this.rv();
      this.id_class(iG_2.SELF, new rjU_2(rfU_2.id_class(var71 * var15.id_break, -var72, var72), 0.0, rfU_2.id_class(var71 * var15.id_protected, -var72, var72)));
      if (var18.c_() != 0 && rfU_2.id_byte(this.rx()) - var1.b_() == var18.b_() && rfU_2.id_byte(this.BO()) - var1.d_() == var18.d_()) {
         this.id_new(this.rx(), this.re() + (double)var18.c_(), this.BO());
      } else if (var19.c_() != 0 && rfU_2.id_byte(this.rx()) - var1.b_() == var19.b_() && rfU_2.id_byte(this.BO()) - var1.d_() == var19.d_()) {
         this.id_new(this.rx(), this.re() + (double)var19.c_(), this.BO());
      }

      this.id_case();
      rjU_2 var45 = this.id_continue(this.rx(), this.re(), this.BO());
      if (var45 != null && var9 != null) {
         double var46 = (var9.id_byte - var45.id_byte) * 0.05;
         rjU_2 var48 = this.rv();
         double var49 = Math.sqrt(id_case(var48));
         if (var49 > 0.0) {
            this.id_byte(var48.id_throws((var49 + var46) / var49, 1.0, (var49 + var46) / var49));
         }

         this.id_new(this.rx(), var45.id_byte, this.BO());
      }

      int var73 = rfU_2.id_byte(this.rx());
      int var47 = rfU_2.id_byte(this.BO());
      if (var73 != var1.b_() || var47 != var1.d_()) {
         rjU_2 var74 = this.rv();
         double var76 = Math.sqrt(id_case(var74));
         this.id_catch(var76 * (double)(var73 - var1.b_()), var74.id_byte, var76 * (double)(var47 - var1.d_()));
      }

      if (var10) {
         rjU_2 var75 = this.rv();
         double var77 = Math.sqrt(id_case(var75));
         if (var77 > 0.01) {
            double var51 = 0.06;
            this.id_byte(var75.id_break(var75.id_break / var77 * 0.06, 0.0, var75.id_protected / var77 * 0.06));
         } else {
            rjU_2 var78 = this.rv();
            double var52 = var78.id_break;
            double var54 = var78.id_protected;
            if (var16 == rCR.EAST_WEST) {
               if (this.id_class(var1.id_byte())) {
                  var52 = 0.02;
               } else if (this.id_class(var1.id_extends())) {
                  var52 = -0.02;
               }
            } else {
               if (var16 != rCR.NORTH_SOUTH) {
                  return;
               }

               if (this.id_class(var1.id_private())) {
                  var54 = 0.02;
               } else if (this.id_class(var1.id_protected())) {
                  var54 = -0.02;
               }
            }

            this.id_catch(var52, var78.id_byte, var54);
         }
      }
   }

   public void id_byte(int var1) {
      this.BQ().id_break(id_private, var1);
      this.id_class(true);
   }

   public void id_byte(float var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_protected, var1);
   }

   public xc_3 id_int() {
      return xu_3.id_class.id_continue();
   }

   protected rsJ_2(aI_2<?> var1, rYB var2, double var3, double var5, double var7) {
      this(var1, var2);
      this.id_new(var3, var5, var7);
      this.id_byte(rjU_2.id_class);
      Double var13 = var3;
      this.id_throws[8] = var13;
      Double var14 = var5;
      this.id_throws[9] = var14;
      Double var15 = var7;
      this.id_throws[10] = var15;
   }

   protected rsJ_2(aI_2<?> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.id_throws[2] = var7;
   }

   @Override
   public void id_this() {
      if (this.id_private() > 0) {
         this.id_class(this.id_private() - 1);
      }

      if (this.id_catch() > 0.0F) {
         this.id_byte(this.id_catch() - 1.0F);
      }

      if (this.re() < -64.0) {
         this.PQ();
      }

      this.PB();
      if (((rYB)this.id_throws[7]).id_continue) {
         if (this.id_volatile > 0) {
            double var1 = this.rx() + (this.id_final - this.rx()) / (double)this.id_volatile;
            double var3 = this.re() + (this.id_package - this.re()) / (double)this.id_volatile;
            double var5 = this.BO() + (this.id_int - this.BO()) / (double)this.id_volatile;
            double var7 = rfU_2.id_case(this.id_new - (double)((Float)this.id_throws[15]).floatValue());
            Float var19 = (float)((double)((Float)this.id_throws[15]).floatValue() + var7 / (double)this.id_volatile);
            this.id_throws[15] = var19;
            Float var20 = (float)(
               (double)((Float)this.id_throws[16]).floatValue()
                  + (this.id_continue - (double)((Float)this.id_throws[16]).floatValue()) / (double)this.id_volatile
            );
            this.id_throws[16] = var20;
            this.id_volatile--;
            this.id_new(var1, var3, var5);
            this.id_case((Float)this.id_throws[15], (Float)this.id_throws[16]);
         } else {
            this.PX();
            this.id_case((Float)this.id_throws[15], (Float)this.id_throws[16]);
         }
      } else {
         if (!this.rw()) {
            this.id_byte(this.rv().id_break(0.0, -0.04, 0.0));
         }

         int var27 = rfU_2.id_byte(this.rx());
         int var2 = rfU_2.id_byte(this.re());
         int var28 = rfU_2.id_byte(this.BO());
         if (((rYB)this.id_throws[7]).id_byte(new rfH_2(var27, var2 - 1, var28)).id_class(rls_3.id_float)) {
            var2--;
         }

         rfH_2 var4 = new rfH_2(var27, var2, var28);
         xc_3 var29 = ((rYB)this.id_throws[7]).id_byte(var4);
         if (Jo_1.id_catch(var29)) {
            this.id_byte(var4, var29);
            if (var29.id_class(xu_3.sT)) {
               this.id_class(var27, var2, var28, var29.id_byte(Ws_1.id_int));
            }
         } else {
            this.id_throws();
         }

         this.Px();
         Float var21 = 0.0F;
         this.id_throws[16] = var21;
         double var6 = (Double)this.id_throws[8] - this.rx();
         double var8 = (Double)this.id_throws[10] - this.BO();
         if (var6 * var6 + var8 * var8 > 0.001) {
            Float var22 = (float)(rfU_2.id_protected(var8, var6) * 180.0 / Math.PI);
            this.id_throws[15] = var22;
            if (this.id_extends) {
               Float var23 = (Float)this.id_throws[15] + 180.0F;
               this.id_throws[15] = var23;
            }
         }

         double var10 = (double)rfU_2.id_catch((Float)this.id_throws[15] - (Float)this.id_throws[17]);
         if (var10 < -170.0 || var10 >= 170.0) {
            Float var24 = (Float)this.id_throws[15] + 180.0F;
            this.id_throws[15] = var24;
            this.id_extends = !this.id_extends;
         }

         this.id_case((Float)this.id_throws[15], (Float)this.id_throws[16]);
         if (this.id_final() == rsd_3.RIDEABLE && id_case(this.rv()) > 0.01) {
            List var30 = ((rYB)this.id_throws[7]).id_break(this, this.rN().id_byte(0.2F, 0.0, 0.2F), rpJ_2.id_class(this));
            if (!var30.isEmpty()) {
               for (int var31 = 0; var31 < var30.size(); var31++) {
                  an_3 var14 = (an_3)var30.get(var31);
                  if (!(var14 instanceof rhd_3) && !(var14 instanceof rMZ) && !(var14 instanceof rsJ_2) && !this.BP() && !var14.Pm()) {
                     var14.id_this(this);
                  } else {
                     var14.id_byte(this);
                  }
               }
            }
         } else {
            for (an_3 var13 : ((rYB)this.id_throws[7]).id_class(this, this.rN().id_byte(0.2F, 0.0, 0.2F))) {
               if (!this.id_synchronized(var13) && var13.rG() && var13 instanceof rsJ_2) {
                  var13.id_byte(this);
               }
            }
         }

         this.PM();
         if (this.ry()) {
            this.rb();
            Float var25 = (Float)this.id_throws[31] * 0.5F;
            this.id_throws[31] = var25;
         }

         Boolean var26 = false;
         this.id_throws[48] = var26;
      }
   }

   @Override
   protected rjU_2 id_class(rpB_2 var1, rqT_2 var2) {
      return iB_2.id_implements(super.id_class(var1, var2));
   }

   public void id_class(int var1, int var2, int var3, boolean var4) {
   }

   @Override
   public void id_class(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.id_final = var1;
      this.id_package = var3;
      this.id_int = var5;
      this.id_new = (double)var7;
      this.id_continue = (double)var8;
      this.id_volatile = var9 + 2;
      this.id_catch(this.id_super, this.id_this, this.id_else);
   }

   public void id_class(boolean var1) {
      this.BQ().id_break(id_implements, var1);
   }

   private boolean id_class(rfH_2 var1) {
      return ((rYB)this.id_throws[7]).id_byte(var1).id_catch((rYB)this.id_throws[7], var1);
   }

   public void id_class(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_class, var1);
   }

   public rjU_2 id_class(double var1, double var3, double var5, double var7) {
      int var9 = rfU_2.id_byte(var1);
      int var10 = rfU_2.id_byte(var3);
      int var11 = rfU_2.id_byte(var5);
      if (((rYB)this.id_throws[7]).id_byte(new rfH_2(var9, var10 - 1, var11)).id_class(rls_3.id_float)) {
         var10--;
      }

      xc_3 var12 = ((rYB)this.id_throws[7]).id_byte(new rfH_2(var9, var10, var11));
      if (Jo_1.id_catch(var12)) {
         rCR var13 = var12.id_byte(((Jo_1)var12.id_break()).id_implements());
         var3 = (double)var10;
         if (var13.id_break()) {
            var3 = (double)(var10 + 1);
         }

         Pair var14 = id_class(var13);
         rja_3 var15 = (rja_3)var14.getFirst();
         rja_3 var16 = (rja_3)var14.getSecond();
         double var17 = (double)(var16.b_() - var15.b_());
         double var19 = (double)(var16.d_() - var15.d_());
         double var21 = Math.sqrt(var17 * var17 + var19 * var19);
         var17 /= var21;
         var19 /= var21;
         var1 += var17 * var7;
         var5 += var19 * var7;
         if (var15.c_() != 0 && rfU_2.id_byte(var1) - var9 == var15.b_() && rfU_2.id_byte(var5) - var11 == var15.d_()) {
            var3 += (double)var15.c_();
         } else if (var16.c_() != 0 && rfU_2.id_byte(var1) - var9 == var16.b_() && rfU_2.id_byte(var5) - var11 == var16.d_()) {
            var3 += (double)var16.c_();
         }

         return this.id_continue(var1, var3, var5);
      } else {
         return null;
      }
   }

   public static rsJ_2 id_class(rYB var0, double var1, double var3, double var5, rsd_3 var7) {
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

   private static Pair<rja_3, rja_3> id_class(rCR var0) {
      return id_native.get(var0);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      if (this.id_super()) {
         var1.id_class("CustomDisplayTile", true);
         var1.id_class("DisplayState", rco_3.id_class(this.id_package()));
         var1.id_break("DisplayOffset", this.id_new());
      }
   }

   public void id_break(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_break, var1);
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (((rYB)this.id_throws[7]).id_continue || (Boolean)this.id_throws[27]) {
         return true;
      } else if (this.id_class(var1)) {
         return false;
      } else {
         this.id_break(-this.id_implements());
         this.id_class(10);
         this.rf();
         this.id_byte(this.id_catch() + var2 * 10.0F);
         boolean var3 = var1.id_extends() instanceof rhd_3 && ((rhx_3)((rhd_3)var1.id_extends()).id_implements[18]).id_protected;
         if (var3 || this.id_catch() > 40.0F) {
            this.Bn();
            if (var3 && !this.Bk()) {
               this.PD();
            } else {
               this.id_break(var1);
            }
         }

         return true;
      }
   }

   public void id_break(rye_3 var1) {
      this.PD();
      if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
         rdn_3 var2 = new rdn_3(rdy_3.ho);
         if (this.Bk()) {
            var2.id_class(this.rD());
         }

         this.a_(var2);
      }
   }

   @Override
   protected void id_break(rcd_3 var1) {
      if (var1.id_new("CustomDisplayTile")) {
         this.id_break(rco_3.id_byte(var1.id_int("DisplayState")));
         this.id_byte(var1.id_private("DisplayOffset"));
      }
   }

   public void id_break(xc_3 var1) {
      this.BQ().id_break(id_catch, xd_3.id_finally(var1));
      this.id_class(true);
   }

   protected void id_throws() {
      double var1 = this.id_protected();
      rjU_2 var3 = this.rv();
      this.id_catch(rfU_2.id_class(var3.id_break, -var1, var1), var3.id_byte, rfU_2.id_class(var3.id_protected, -var1, var1));
      if ((Boolean)this.id_throws[20]) {
         this.id_byte(this.rv().id_class(0.5));
      }

      this.id_class(iG_2.SELF, this.rv());
      if (!(Boolean)this.id_throws[20]) {
         this.id_byte(this.rv().id_class(0.95));
      }
   }

   public float id_catch() {
      return ((rmE_2)this.id_throws[49]).id_class(id_protected);
   }

   @Override
   public void id_extends(double var1, double var3, double var5) {
      this.id_super = var1;
      this.id_this = var3;
      this.id_else = var5;
      this.id_catch(this.id_super, this.id_this, this.id_else);
   }

   protected void id_case() {
      double var1 = this.BP() ? 0.997 : 0.96;
      this.id_byte(this.rv().id_throws(var1, 0.0, var1));
   }

   public int id_continue() {
      return 6;
   }

   public rjU_2 id_continue(double var1, double var3, double var5) {
      int var7 = rfU_2.id_byte(var1);
      int var8 = rfU_2.id_byte(var3);
      int var9 = rfU_2.id_byte(var5);
      if (((rYB)this.id_throws[7]).id_byte(new rfH_2(var7, var8 - 1, var9)).id_class(rls_3.id_float)) {
         var8--;
      }

      xc_3 var10 = ((rYB)this.id_throws[7]).id_byte(new rfH_2(var7, var8, var9));
      if (Jo_1.id_catch(var10)) {
         rCR var11 = var10.id_byte(((Jo_1)var10.id_break()).id_implements());
         Pair var12 = id_class(var11);
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

   public int id_implements() {
      return ((rmE_2)this.id_throws[49]).id_class(id_break);
   }

   public int id_new() {
      return !this.id_super() ? this.id_continue() : this.BQ().id_class(id_private);
   }

   public xc_3 id_package() {
      return !this.id_super() ? this.id_int() : xd_3.id_class(this.BQ().id_class(id_catch));
   }

   public boolean id_super() {
      return this.BQ().id_class(id_implements);
   }

   @Override
   public boolean id_super(an_3 var1) {
      return rSK.id_class(this, var1);
   }

   protected double id_protected() {
      return 0.4;
   }

   public int id_private() {
      return ((rmE_2)this.id_throws[49]).id_class(id_class);
   }

   public abstract rsd_3 id_final();

   @Override
   protected float rq() {
      xc_3 var1 = ((rYB)this.id_throws[7]).id_byte(this.Bs());
      return var1.id_class(rls_3.id_float) ? 1.0F : super.rq();
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
      return this.id_super() ? var1.id_class((double)Math.abs(this.id_new()) / 16.0) : var1;
   }

   @Override
   public void rF() {
      this.id_break(-this.id_implements());
      this.id_class(10);
      this.id_byte(this.id_catch() + this.id_catch() * 10.0F);
   }

   @Override
   public boolean rY() {
      return !(Boolean)this.id_throws[27];
   }

   @Override
   public rpr_3 rS() {
      return this.id_extends ? this.Pg().id_case().id_catch() : this.Pg().id_catch();
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   public rjU_2 a_(iB_2 var1) {
      rpr_3 var2 = this.rS();
      if (var2.id_final() == rpB_2.Y) {
         return super.a_(var1);
      } else {
         int[][] var3 = rqI_2.id_class(var2);
         rfH_2 var4 = this.Bs();
         rfw_3 var5 = new rfw_3();
         ImmutableList var6 = var1.BV();
         UnmodifiableIterator var7 = var6.iterator();

         while (var7.hasNext()) {
            iM_2 var8 = (iM_2)var7.next();
            ap_3 var9 = var1.a_(var8);
            float var10 = Math.min(var9.id_class, 1.0F) / 2.0F;
            UnmodifiableIterator var11 = ((ImmutableList)id_finally.get(var8)).iterator();

            while (var11.hasNext()) {
               int var12 = (Integer)var11.next();

               for (int[] var16 : var3) {
                  var5.id_class(var4.b_() + var16[0], var4.c_() + var12, var4.d_() + var16[1]);
                  double var17 = ((rYB)this.id_throws[7])
                     .id_class(rqI_2.id_class((rYB)this.id_throws[7], var5), () -> rqI_2.id_class((rYB)this.id_throws[7], var5.id_break()));
                  if (rqI_2.id_class(var17)) {
                     rfl_3 var19 = new rfl_3((double)(-var10), 0.0, (double)(-var10), (double)var10, (double)var9.id_break, (double)var10);
                     rjU_2 var20 = rjU_2.id_class(var5, var17);
                     if (rqI_2.id_class((rYB)this.id_throws[7], var1, var19.id_protected(var20))) {
                        var1.id_class(var8);
                        return var20;
                     }
                  }
               }
            }
         }

         double var21 = this.rN().id_throws;
         var5.id_break((double)var4.b_(), var21, (double)var4.d_());
         UnmodifiableIterator var22 = var6.iterator();

         while (var22.hasNext()) {
            iM_2 var23 = (iM_2)var22.next();
            double var24 = (double)var1.a_(var23).id_break;
            int var25 = rfU_2.id_throws(var21 - (double)var5.c_() + var24);
            double var26 = rqI_2.id_class(var5, var25, var1x -> ((rYB)this.id_throws[7]).id_byte(var1x).id_extends((rYB)this.id_throws[7], var1x));
            if (var21 + var24 <= var26) {
               var1.id_class(var23);
               break;
            }
         }

         return super.a_(var1);
      }
   }

   @Override
   protected void m_() {
      ((rmE_2)this.id_throws[49]).id_class(id_class, 0);
      ((rmE_2)this.id_throws[49]).id_class(id_break, 1);
      ((rmE_2)this.id_throws[49]).id_class(id_protected, 0.0F);
      ((rmE_2)this.id_throws[49]).id_class(id_catch, xd_3.id_finally(xu_3.id_class.id_continue()));
      ((rmE_2)this.id_throws[49]).id_class(id_private, 6);
      ((rmE_2)this.id_throws[49]).id_class(id_implements, false);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
