package celestial;

import com.google.common.base.MoreObjects;
import java.util.Objects;

public class HB {
   private static final HU id_class = HU.id_int(new rqO_2("textures/map/map_background.png"));
   private static final HU id_break = HU.id_int(new rqO_2("textures/map/map_background_checkerboard.png"));
   private final QY id_byte;
   private rdn_3 id_protected = rdn_3.id_break;
   private rdn_3 id_throws = rdn_3.id_break;
   private float id_case;
   private float id_catch;
   private float id_private;
   private float id_implements;
   private final pg_3 id_finally;
   private final Hz_1 id_extends;

   public HB(QY var1) {
      this.id_byte = var1;
      this.id_finally = var1.id_case();
      this.id_extends = var1.id_float();
   }

   private void id_class(cG_2 var1, float var2, float var3, rpm_3 var4, float var5, rdn_3 var6, float var7, Ml_1 var8, Hx_1 var9, int var10) {
      if (!rrbb_3.rs() || !rrdZ.id_class(var4)) {
         boolean var11 = var4 == rpm_3.MAIN_HAND;
         rpZ_2 var12 = var11 ? var1.Su() : var1.Su().id_class();
         var8.id_class();
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .id_finally()
            .id_class(rrAi_1.id_class((Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0], var8, var4, var12, var6, var5));
         float var13 = -0.2F * rfU_2.id_class(var5 * (float) Math.PI);
         if (var6.id_class()) {
            if (var11) {
               this.id_class(var8, var9, var10, var7, var5, var12);
            }
         } else if (var6.id_break() instanceof rxI_2) {
            if (var11 && this.id_throws.id_class()) {
               this.id_class(var8, var9, var10, var3, var7, var5);
            } else {
               this.id_class(var8, var9, var10, var7, var12, var5, var6);
            }
         } else if (var6.id_break() instanceof rxm_3) {
            boolean var23 = rxm_3.id_protected(var6);
            boolean var26 = var12 == rpZ_2.RIGHT;
            int var28 = var26 ? 1 : -1;
            if (var1.id_return() && var1.SH() > 0 && var1.P() == var4) {
               this.id_break(var8, var12, var7);
               var8.id_class((double)((float)var28 * -0.4785682F), -0.094387F, 0.05731531F);
               var8.id_class(rje_3.id_break.id_byte(-11.935F));
               var8.id_class(rje_3.id_protected.id_byte((float)var28 * 65.3F));
               var8.id_class(rje_3.id_case.id_byte((float)var28 * -9.785F));
               float var32 = (float)var6.id_extends() - ((float)((cb_3)this.id_byte.id_class[57]).SH() - var2 + 1.0F);
               float var36 = var32 / (float)rxm_3.id_private(var6);
               if (var36 > 1.0F) {
                  var36 = 1.0F;
               }

               if (var36 > 0.1F) {
                  float var39 = rfU_2.id_class((var32 - 0.1F) * 1.3F);
                  float var41 = var36 - 0.1F;
                  float var42 = var39 * var41;
                  var8.id_class((double)(var42 * 0.0F), (double)(var42 * 0.004F), (double)(var42 * 0.0F));
               }

               var8.id_class((double)(var36 * 0.0F), (double)(var36 * 0.0F), (double)(var36 * 0.04F));
               var8.id_class(1.0F, 1.0F, 1.0F + var36 * 0.2F);
               var8.id_class(rje_3.id_byte.id_byte((float)var28 * 45.0F));
            } else {
               float var31 = -0.4F * rfU_2.id_class(rfU_2.id_byte(var5) * (float) Math.PI);
               float var35 = 0.2F * rfU_2.id_class(rfU_2.id_byte(var5) * (float) (Math.PI * 2));
               float var38 = -0.2F * rfU_2.id_class(var5 * (float) Math.PI);
               var8.id_class((double)((float)var28 * var31), (double)var35, (double)var38);
               this.id_break(var8, var12, var7);
               this.id_class(var8, var12, var5);
               if (var23 && var5 < 0.001F) {
                  var8.id_class((double)((float)var28 * -0.641864F), 0.0, 0.0);
                  var8.id_class(rje_3.id_protected.id_byte((float)var28 * 10.0F));
               }
            }

            this.id_class(var1, var6, var26 ? IQ.FIRST_PERSON_RIGHT_HAND : IQ.FIRST_PERSON_LEFT_HAND, !var26, var8, var9, var10);
         } else {
            boolean var14 = var12 == rpZ_2.RIGHT;
            if (var1.id_return() && var1.SH() > 0 && var1.P() == var4) {
               int var25 = var14 ? 1 : -1;
               switch (var6.id_native()) {
                  case NONE:
                     this.id_break(var8, var12, var7);
                     break;
                  case EAT:
                  case DRINK:
                     this.id_class(var8, var2, var12, var6);
                     this.id_break(var8, var12, var7);
                     break;
                  case BLOCK:
                     this.id_break(var8, var12, var7);
                     break;
                  case BOW:
                     this.id_break(var8, var12, var7);
                     var8.id_class((double)((float)var25 * -0.2785682F), 0.18344387F, 0.15731531F);
                     var8.id_class(rje_3.id_break.id_byte(-13.935F));
                     var8.id_class(rje_3.id_protected.id_byte((float)var25 * 35.3F));
                     var8.id_class(rje_3.id_case.id_byte((float)var25 * -9.785F));
                     float var27 = (float)var6.id_extends() - ((float)((cb_3)this.id_byte.id_class[57]).SH() - var2 + 1.0F);
                     float var29 = var27 / 20.0F;
                     var29 = (var29 * var29 + var29 * 2.0F) / 3.0F;
                     if (var29 > 1.0F) {
                        var29 = 1.0F;
                     }

                     if (var29 > 0.1F) {
                        float var34 = rfU_2.id_class((var27 - 0.1F) * 1.3F);
                        float var37 = var29 - 0.1F;
                        float var40 = var34 * var37;
                        var8.id_class((double)(var40 * 0.0F), (double)(var40 * 0.004F), (double)(var40 * 0.0F));
                     }

                     var8.id_class((double)(var29 * 0.0F), (double)(var29 * 0.0F), (double)(var29 * 0.04F));
                     var8.id_class(1.0F, 1.0F, 1.0F + var29 * 0.2F);
                     var8.id_class(rje_3.id_byte.id_byte((float)var25 * 45.0F));
                     break;
                  case SPEAR:
                     this.id_break(var8, var12, var7);
                     var8.id_class((double)((float)var25 * -0.5F), 0.7F, 0.1F);
                     var8.id_class(rje_3.id_break.id_byte(-55.0F));
                     var8.id_class(rje_3.id_protected.id_byte((float)var25 * 35.3F));
                     var8.id_class(rje_3.id_case.id_byte((float)var25 * -9.785F));
                     float var33 = (float)var6.id_extends() - ((float)((cb_3)this.id_byte.id_class[57]).SH() - var2 + 1.0F);
                     float var19 = var33 / 10.0F;
                     if (var19 > 1.0F) {
                        var19 = 1.0F;
                     }

                     if (var19 > 0.1F) {
                        float var20 = rfU_2.id_class((var33 - 0.1F) * 1.3F);
                        float var21 = var19 - 0.1F;
                        float var22 = var20 * var21;
                        var8.id_class((double)(var22 * 0.0F), (double)(var22 * 0.004F), (double)(var22 * 0.0F));
                     }

                     var8.id_class(0.0, 0.0, (double)(var19 * 0.2F));
                     var8.id_class(1.0F, 1.0F, 1.0F + var19 * 0.2F);
                     var8.id_class(rje_3.id_byte.id_byte((float)var25 * 45.0F));
               }
            } else if (var1.Sz()) {
               this.id_break(var8, var12, var7);
               int var15 = var14 ? 1 : -1;
               var8.id_class((double)((float)var15 * -0.4F), 0.8F, 0.3F);
               var8.id_class(rje_3.id_protected.id_byte((float)var15 * 65.0F));
               var8.id_class(rje_3.id_case.id_byte((float)var15 * -85.0F));
            } else {
               rrAi_1 var24 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
                  .id_finally()
                  .id_class(rrAi_1.id_class((Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1], var8, var4, var12, var6, var5));
               if (!var24.id_byte()) {
                  float var16 = -0.4F * rfU_2.id_class(rfU_2.id_byte(var5) * (float) Math.PI);
                  float var17 = 0.2F * rfU_2.id_class(rfU_2.id_byte(var5) * (float) (Math.PI * 2));
                  float var18 = var14 ? 1.0F : -1.0F;
                  var8.id_class((double)(var18 * var16), (double)var17, (double)var13);
                  this.id_break(var8, var12, var7);
                  this.id_class(var8, var12, var5);
               }
            }

            this.id_class(var1, var6, var14 ? IQ.FIRST_PERSON_RIGHT_HAND : IQ.FIRST_PERSON_LEFT_HAND, !var14, var8, var9, var10);
         }

         var8.id_break();
      }
   }

   public void id_class(float var1, Ml_1 var2, Hd_1 var3, cb_3 var4, int var5) {
      float var6 = var4.id_goto(var1);
      rpm_3 var7 = (rpm_3)MoreObjects.firstNonNull((rpm_3)var4.id_private[6], rpm_3.MAIN_HAND);
      float var8 = (Float)var4.id_throws[16];
      boolean var9 = true;
      boolean var10 = true;
      if (var4.id_return()) {
         rdn_3 var11 = var4.sX();
         if (var11.id_break() instanceof rkB_2) {
            var9 = var4.P() == rpm_3.MAIN_HAND;
            var10 = !var9;
         }

         rpm_3 var12 = var4.P();
         if (var12 == rpm_3.MAIN_HAND) {
            rdn_3 var13 = var4.Sn();
            if (var13.id_break() instanceof rxm_3 && rxm_3.id_protected(var13)) {
               var10 = false;
            }
         }
      } else {
         rdn_3 var14 = var4.ss();
         rdn_3 var17 = var4.Sn();
         if (var14.id_break() instanceof rxm_3 && rxm_3.id_protected(var14)) {
            var10 = !var9;
         }

         if (var17.id_break() instanceof rxm_3 && rxm_3.id_protected(var17)) {
            var9 = !var14.id_class();
            var10 = !var9;
         }
      }

      if (var9) {
         float var15 = var7 == rpm_3.MAIN_HAND ? var6 : 0.0F;
         float var18 = 1.0F - rfU_2.id_catch(var1, this.id_catch, this.id_case);
         if (!rrxr_3.rf.id_byte() || !rrxr_3.id_break(rrxr_3.rf, rpm_3.MAIN_HAND, var2, var3, var5, var1, var8, var15, var18, this.id_protected)) {
            this.id_class(var4, var1, var8, rpm_3.MAIN_HAND, var15, this.id_protected, var18, var2, var3, var5);
         }
      }

      if (var10) {
         float var16 = var7 == rpm_3.OFF_HAND ? var6 : 0.0F;
         float var19 = 1.0F - rfU_2.id_catch(var1, this.id_implements, this.id_private);
         if (!rrxr_3.rf.id_byte() || !rrxr_3.id_break(rrxr_3.rf, rpm_3.OFF_HAND, var2, var3, var5, var1, var8, var16, var19, this.id_throws)) {
            this.id_class(var4, var1, var8, rpm_3.OFF_HAND, var16, this.id_throws, var19, var2, var3, var5);
         }
      }

      var3.id_break();
   }

   private void id_class(Ml_1 var1, rpZ_2 var2, float var3) {
      int var4 = var2 == rpZ_2.RIGHT ? 1 : -1;
      float var5 = rfU_2.id_class(var3 * var3 * (float) Math.PI);
      var1.id_class(rje_3.id_protected.id_byte((float)var4 * (45.0F + var5 * -20.0F)));
      float var6 = rfU_2.id_class(rfU_2.id_byte(var3) * (float) Math.PI);
      var1.id_class(rje_3.id_case.id_byte((float)var4 * var6 * -20.0F));
      var1.id_class(rje_3.id_break.id_byte(var6 * -80.0F));
      var1.id_class(rje_3.id_protected.id_byte((float)var4 * -45.0F));
   }

   public void id_class(iB_2 var1, rdn_3 var2, IQ var3, boolean var4, Ml_1 var5, Hx_1 var6, int var7) {
      rrby_3.id_class(var4);
      if (!var2.id_class()) {
         this.id_extends.id_class(var1, var2, var3, var4, var5, var6, (rYB)var1.id_throws[7], var7, fZ_2.id_class);
      }

      rrby_3.id_class(false);
   }

   public void id_class() {
      this.id_catch = this.id_case;
      this.id_implements = this.id_private;
      cb_3 var1 = (cb_3)this.id_byte.id_class[57];
      rdn_3 var2 = var1.ss();
      rdn_3 var3 = var1.Sn();
      if (rdn_3.id_break(this.id_protected, var2)) {
         this.id_protected = var2;
      }

      if (rdn_3.id_break(this.id_throws, var3)) {
         this.id_throws = var3;
      }

      if (var1.id_long()) {
         this.id_case = rfU_2.id_class(this.id_case - 0.4F, 0.0F, 1.0F);
         this.id_private = rfU_2.id_class(this.id_private - 0.4F, 0.0F, 1.0F);
      } else {
         float var4 = var1.id_class(1.0F, false);
         if (rrxr_3.rV.id_byte()) {
            boolean var5 = rrxr_3.id_break(rrxr_3.rV, this.id_protected, var2, ((rhz_3)var1.id_implements[1]).id_protected);
            boolean var6 = rrxr_3.id_break(rrxr_3.rV, this.id_throws, var3, -1);
            if (!var5 && !Objects.equals(this.id_protected, var2)) {
               this.id_protected = var2;
            }

            if (!var6 && !Objects.equals(this.id_throws, var3)) {
               this.id_throws = var3;
            }
         }

         this.id_case = this.id_case + rfU_2.id_class((this.id_protected == var2 ? var4 * var4 * var4 : 0.0F) - this.id_case, -0.4F, 0.4F);
         this.id_private = this.id_private + rfU_2.id_class((float)(this.id_throws == var3 ? 1 : 0) - this.id_private, -0.4F, 0.4F);
      }

      if (this.id_case < 0.1F) {
         this.id_protected = var2;
         if (rrbb_3.rs()) {
            rrdZ.id_class(this.id_protected);
         }
      }

      if (this.id_private < 0.1F) {
         this.id_throws = var3;
         if (rrbb_3.rs()) {
            rrdZ.id_break(this.id_throws);
         }
      }
   }

   public void id_class(rpm_3 var1) {
      if (var1 == rpm_3.MAIN_HAND) {
         this.id_case = 0.0F;
      } else {
         this.id_private = 0.0F;
      }
   }

   private void id_class(Ml_1 var1, float var2, rpZ_2 var3, rdn_3 var4) {
      float var5 = (float)((cb_3)this.id_byte.id_class[57]).SH() - var2 + 1.0F;
      float var6 = var5 / (float)var4.id_extends();
      if (var6 < 0.8F) {
         float var7 = rfU_2.id_throws(rfU_2.id_break(var5 / 4.0F * (float) Math.PI) * 0.1F);
         var1.id_class(0.0, (double)var7, 0.0);
      }

      float var9 = 1.0F - (float)Math.pow((double)var6, 27.0);
      int var8 = var3 == rpZ_2.RIGHT ? 1 : -1;
      var1.id_class((double)(var9 * 0.6F * (float)var8), (double)(var9 * -0.5F), (double)(var9 * 0.0F));
      var1.id_class(rje_3.id_protected.id_byte((float)var8 * var9 * 90.0F));
      var1.id_class(rje_3.id_break.id_byte(var9 * 10.0F));
      var1.id_class(rje_3.id_case.id_byte((float)var8 * var9 * 30.0F));
   }

   private void id_class(Ml_1 var1, Hx_1 var2, int var3, float var4, float var5, float var6) {
      float var7 = rfU_2.id_byte(var6);
      float var8 = -0.2F * rfU_2.id_class(var6 * (float) Math.PI);
      float var9 = -0.4F * rfU_2.id_class(var7 * (float) Math.PI);
      var1.id_class(0.0, (double)(-var8 / 2.0F), (double)var9);
      float var10 = this.id_class(var4);
      var1.id_class(0.0, (double)(0.04F + var5 * -1.2F + var10 * -0.5F), -0.72F);
      var1.id_class(rje_3.id_break.id_byte(var10 * -85.0F));
      if (!((cb_3)this.id_byte.id_class[57]).Pp()) {
         var1.id_class();
         var1.id_class(rje_3.id_protected.id_byte(90.0F));
         this.id_class(var1, var2, var3, rpZ_2.RIGHT);
         this.id_class(var1, var2, var3, rpZ_2.LEFT);
         var1.id_break();
      }

      float var11 = rfU_2.id_class(var7 * (float) Math.PI);
      var1.id_class(rje_3.id_break.id_byte(var11 * 20.0F));
      var1.id_class(2.0F, 2.0F, 2.0F);
      this.id_class(var1, var2, var3, this.id_protected);
   }

   private void id_class(Ml_1 var1, Hx_1 var2, int var3, float var4, rpZ_2 var5, float var6, rdn_3 var7) {
      float var8 = var5 == rpZ_2.RIGHT ? 1.0F : -1.0F;
      var1.id_class((double)(var8 * 0.125F), -0.125, 0.0);
      var1.id_class();
      var1.id_class(rje_3.id_case.id_byte(var8 * 10.0F));
      this.id_class(var1, var2, var3, var4, var6, var5);
      var1.id_break();
      var1.id_class();
      var1.id_class((double)(var8 * 0.51F), (double)(-0.08F + var4 * -1.2F), -0.75);
      float var9 = rfU_2.id_byte(var6);
      float var10 = rfU_2.id_class(var9 * (float) Math.PI);
      float var11 = -0.5F * var10;
      float var12 = 0.4F * rfU_2.id_class(var9 * (float) (Math.PI * 2));
      float var13 = -0.3F * rfU_2.id_class(var6 * (float) Math.PI);
      var1.id_class((double)(var8 * var11), (double)(var12 - 0.3F * var10), (double)var13);
      var1.id_class(rje_3.id_break.id_byte(var10 * -45.0F));
      var1.id_class(rje_3.id_protected.id_byte(var8 * var10 * -30.0F));
      this.id_class(var1, var2, var3, var7);
      var1.id_break();
   }

   private void id_class(Ml_1 var1, Hx_1 var2, int var3, rpZ_2 var4) {
      this.id_byte.A().id_class(((cb_3)this.id_byte.id_class[57]).id_final());
      ql_3 var5 = (ql_3)this.id_finally.<cG_2>id_class((cb_3)this.id_byte.id_class[57]);
      var1.id_class();
      float var6 = var4 == rpZ_2.RIGHT ? 1.0F : -1.0F;
      var1.id_class(rje_3.id_protected.id_byte(92.0F));
      var1.id_class(rje_3.id_break.id_byte(45.0F));
      var1.id_class(rje_3.id_case.id_byte(var6 * -41.0F));
      var1.id_class((double)(var6 * 0.3F), -1.1F, 0.45F);
      if (var4 == rpZ_2.RIGHT) {
         var5.id_class(var1, var2, var3, (cb_3)this.id_byte.id_class[57]);
      } else {
         var5.id_break(var1, var2, var3, (cb_3)this.id_byte.id_class[57]);
      }

      var1.id_break();
   }

   private float id_class(float var1) {
      float var2 = 1.0F - var1 / 45.0F + 0.1F;
      var2 = rfU_2.id_class(var2, 0.0F, 1.0F);
      return -rfU_2.id_break(var2 * (float) Math.PI) * 0.5F + 0.5F;
   }

   private void id_class(Ml_1 var1, Hx_1 var2, int var3, rdn_3 var4) {
      var1.id_class(rje_3.id_protected.id_byte(180.0F));
      var1.id_class(rje_3.id_case.id_byte(180.0F));
      var1.id_class(0.38F, 0.38F, 0.38F);
      var1.id_class(-0.5, -0.5, 0.0);
      var1.id_class(0.0078125F, 0.0078125F, 0.0078125F);
      rrGb_1 var5 = rxI_2.id_break(var4, (gm_3)this.id_byte.id_class[56]);
      Ok_1 var6 = var2.getBuffer(var5 == null ? id_class : id_break);
      rjV_2 var7 = var1.id_byte().id_class();
      var6.id_class(var7, -7.0F, 135.0F, 0.0F).id_break(255, 255, 255, 255).id_class(0.0F, 1.0F).id_break(var3).id_class();
      var6.id_class(var7, 135.0F, 135.0F, 0.0F).id_break(255, 255, 255, 255).id_class(1.0F, 1.0F).id_break(var3).id_class();
      var6.id_class(var7, 135.0F, -7.0F, 0.0F).id_break(255, 255, 255, 255).id_class(1.0F, 0.0F).id_break(var3).id_class();
      var6.id_class(var7, -7.0F, -7.0F, 0.0F).id_break(255, 255, 255, 255).id_class(0.0F, 0.0F).id_break(var3).id_class();
      if (var5 != null) {
         ((Hh_1)this.id_byte.id_class[16]).id_catch().id_class(var1, var2, var5, false, var3);
      }
   }

   private void id_class(Ml_1 var1, Hx_1 var2, int var3, float var4, float var5, rpZ_2 var6) {
      boolean var7 = var6 != rpZ_2.LEFT;
      float var8 = var7 ? 1.0F : -1.0F;
      float var9 = rfU_2.id_byte(var5);
      float var10 = -0.3F * rfU_2.id_class(var9 * (float) Math.PI);
      float var11 = 0.4F * rfU_2.id_class(var9 * (float) (Math.PI * 2));
      float var12 = -0.4F * rfU_2.id_class(var5 * (float) Math.PI);
      var1.id_class((double)(var8 * (var10 + 0.64000005F)), (double)(var11 + -0.6F + var4 * -0.6F), (double)(var12 + -0.71999997F));
      var1.id_class(rje_3.id_protected.id_byte(var8 * 45.0F));
      float var13 = rfU_2.id_class(var5 * var5 * (float) Math.PI);
      float var14 = rfU_2.id_class(var9 * (float) Math.PI);
      var1.id_class(rje_3.id_protected.id_byte(var8 * var14 * 70.0F));
      var1.id_class(rje_3.id_case.id_byte(var8 * var13 * -20.0F));
      cb_3 var15 = (cb_3)this.id_byte.id_class[57];
      this.id_byte.A().id_class(var15.id_final());
      var1.id_class((double)(var8 * -1.0F), 3.6F, 3.5);
      var1.id_class(rje_3.id_case.id_byte(var8 * 120.0F));
      var1.id_class(rje_3.id_break.id_byte(200.0F));
      var1.id_class(rje_3.id_protected.id_byte(var8 * -135.0F));
      var1.id_class((double)(var8 * 5.6F), 0.0, 0.0);
      ql_3 var16 = (ql_3)this.id_finally.<cG_2>id_class(var15);
      if (var7) {
         var16.id_class(var1, var2, var3, var15);
      } else {
         var16.id_break(var1, var2, var3, var15);
      }
   }

   private void id_break(Ml_1 var1, rpZ_2 var2, float var3) {
      int var4 = var2 == rpZ_2.RIGHT ? 1 : -1;
      var1.id_class((double)((float)var4 * 0.56F), (double)(-0.52F + var3 * -0.6F), -0.72F);
   }
}
