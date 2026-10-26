package celestial;

import com.google.common.base.MoreObjects;
import java.util.Objects;

public class HB {
   private static final HU class_ = HU.int_(new rqO_2("textures/map/map_background.png"));
   private static final HU break_ = HU.int_(new rqO_2("textures/map/map_background_checkerboard.png"));
   private final QY byte_;
   private rdn_3 protected_ = rdn_3.break_;
   private rdn_3 throws_ = rdn_3.break_;
   private float case_;
   private float catch_;
   private float private_;
   private float implements_;
   private final pg_3 finally_;
   private final Hz_1 extends_;

   public HB(QY var1) {
      this.byte_ = var1;
      this.finally_ = var1.case_();
      this.extends_ = var1.float_();
   }

   private void class_(cG_2 var1, float var2, float var3, rpm_3 var4, float var5, rdn_3 var6, float var7, Ml_1 var8, Hx_1 var9, int var10) {
      if (!rrbb_3.rs() || !rrdZ.class_(var4)) {
         boolean var11 = var4 == rpm_3.MAIN_HAND;
         rpZ_2 var12 = var11 ? var1.Su() : var1.Su().class_();
         var8.class_();
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .finally_()
            .class_(rrAi_1.class_((Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0], var8, var4, var12, var6, var5));
         float var13 = -0.2F * rfU_2.class_(var5 * (float) Math.PI);
         if (var6.class_()) {
            if (var11) {
               this.class_(var8, var9, var10, var7, var5, var12);
            }
         } else if (var6.break_() instanceof rxI_2) {
            if (var11 && this.throws_.class_()) {
               this.class_(var8, var9, var10, var3, var7, var5);
            } else {
               this.class_(var8, var9, var10, var7, var12, var5, var6);
            }
         } else if (var6.break_() instanceof rxm_3) {
            boolean var23 = rxm_3.protected_(var6);
            boolean var26 = var12 == rpZ_2.RIGHT;
            int var28 = var26 ? 1 : -1;
            if (var1.return_() && var1.SH() > 0 && var1.P() == var4) {
               this.break_(var8, var12, var7);
               var8.class_((double)((float)var28 * -0.4785682F), -0.094387F, 0.05731531F);
               var8.class_(rje_3.break_.byte_(-11.935F));
               var8.class_(rje_3.protected_.byte_((float)var28 * 65.3F));
               var8.class_(rje_3.case_.byte_((float)var28 * -9.785F));
               float var32 = (float)var6.extends_() - ((float)((cb_3)this.byte_.class_[57]).SH() - var2 + 1.0F);
               float var36 = var32 / (float)rxm_3.private_(var6);
               if (var36 > 1.0F) {
                  var36 = 1.0F;
               }

               if (var36 > 0.1F) {
                  float var39 = rfU_2.class_((var32 - 0.1F) * 1.3F);
                  float var41 = var36 - 0.1F;
                  float var42 = var39 * var41;
                  var8.class_((double)(var42 * 0.0F), (double)(var42 * 0.004F), (double)(var42 * 0.0F));
               }

               var8.class_((double)(var36 * 0.0F), (double)(var36 * 0.0F), (double)(var36 * 0.04F));
               var8.class_(1.0F, 1.0F, 1.0F + var36 * 0.2F);
               var8.class_(rje_3.byte_.byte_((float)var28 * 45.0F));
            } else {
               float var31 = -0.4F * rfU_2.class_(rfU_2.byte_(var5) * (float) Math.PI);
               float var35 = 0.2F * rfU_2.class_(rfU_2.byte_(var5) * (float) (Math.PI * 2));
               float var38 = -0.2F * rfU_2.class_(var5 * (float) Math.PI);
               var8.class_((double)((float)var28 * var31), (double)var35, (double)var38);
               this.break_(var8, var12, var7);
               this.class_(var8, var12, var5);
               if (var23 && var5 < 0.001F) {
                  var8.class_((double)((float)var28 * -0.641864F), 0.0, 0.0);
                  var8.class_(rje_3.protected_.byte_((float)var28 * 10.0F));
               }
            }

            this.class_(var1, var6, var26 ? IQ.FIRST_PERSON_RIGHT_HAND : IQ.FIRST_PERSON_LEFT_HAND, !var26, var8, var9, var10);
         } else {
            boolean var14 = var12 == rpZ_2.RIGHT;
            if (var1.return_() && var1.SH() > 0 && var1.P() == var4) {
               int var25 = var14 ? 1 : -1;
               switch (var6.native_()) {
                  case NONE:
                     this.break_(var8, var12, var7);
                     break;
                  case EAT:
                  case DRINK:
                     this.class_(var8, var2, var12, var6);
                     this.break_(var8, var12, var7);
                     break;
                  case BLOCK:
                     this.break_(var8, var12, var7);
                     break;
                  case BOW:
                     this.break_(var8, var12, var7);
                     var8.class_((double)((float)var25 * -0.2785682F), 0.18344387F, 0.15731531F);
                     var8.class_(rje_3.break_.byte_(-13.935F));
                     var8.class_(rje_3.protected_.byte_((float)var25 * 35.3F));
                     var8.class_(rje_3.case_.byte_((float)var25 * -9.785F));
                     float var27 = (float)var6.extends_() - ((float)((cb_3)this.byte_.class_[57]).SH() - var2 + 1.0F);
                     float var29 = var27 / 20.0F;
                     var29 = (var29 * var29 + var29 * 2.0F) / 3.0F;
                     if (var29 > 1.0F) {
                        var29 = 1.0F;
                     }

                     if (var29 > 0.1F) {
                        float var34 = rfU_2.class_((var27 - 0.1F) * 1.3F);
                        float var37 = var29 - 0.1F;
                        float var40 = var34 * var37;
                        var8.class_((double)(var40 * 0.0F), (double)(var40 * 0.004F), (double)(var40 * 0.0F));
                     }

                     var8.class_((double)(var29 * 0.0F), (double)(var29 * 0.0F), (double)(var29 * 0.04F));
                     var8.class_(1.0F, 1.0F, 1.0F + var29 * 0.2F);
                     var8.class_(rje_3.byte_.byte_((float)var25 * 45.0F));
                     break;
                  case SPEAR:
                     this.break_(var8, var12, var7);
                     var8.class_((double)((float)var25 * -0.5F), 0.7F, 0.1F);
                     var8.class_(rje_3.break_.byte_(-55.0F));
                     var8.class_(rje_3.protected_.byte_((float)var25 * 35.3F));
                     var8.class_(rje_3.case_.byte_((float)var25 * -9.785F));
                     float var33 = (float)var6.extends_() - ((float)((cb_3)this.byte_.class_[57]).SH() - var2 + 1.0F);
                     float var19 = var33 / 10.0F;
                     if (var19 > 1.0F) {
                        var19 = 1.0F;
                     }

                     if (var19 > 0.1F) {
                        float var20 = rfU_2.class_((var33 - 0.1F) * 1.3F);
                        float var21 = var19 - 0.1F;
                        float var22 = var20 * var21;
                        var8.class_((double)(var22 * 0.0F), (double)(var22 * 0.004F), (double)(var22 * 0.0F));
                     }

                     var8.class_(0.0, 0.0, (double)(var19 * 0.2F));
                     var8.class_(1.0F, 1.0F, 1.0F + var19 * 0.2F);
                     var8.class_(rje_3.byte_.byte_((float)var25 * 45.0F));
               }
            } else if (var1.Sz()) {
               this.break_(var8, var12, var7);
               int var15 = var14 ? 1 : -1;
               var8.class_((double)((float)var15 * -0.4F), 0.8F, 0.3F);
               var8.class_(rje_3.protected_.byte_((float)var15 * 65.0F));
               var8.class_(rje_3.case_.byte_((float)var15 * -85.0F));
            } else {
               rrAi_1 var24 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
                  .finally_()
                  .class_(rrAi_1.class_((Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1], var8, var4, var12, var6, var5));
               if (!var24.byte_()) {
                  float var16 = -0.4F * rfU_2.class_(rfU_2.byte_(var5) * (float) Math.PI);
                  float var17 = 0.2F * rfU_2.class_(rfU_2.byte_(var5) * (float) (Math.PI * 2));
                  float var18 = var14 ? 1.0F : -1.0F;
                  var8.class_((double)(var18 * var16), (double)var17, (double)var13);
                  this.break_(var8, var12, var7);
                  this.class_(var8, var12, var5);
               }
            }

            this.class_(var1, var6, var14 ? IQ.FIRST_PERSON_RIGHT_HAND : IQ.FIRST_PERSON_LEFT_HAND, !var14, var8, var9, var10);
         }

         var8.break_();
      }
   }

   public void class_(float var1, Ml_1 var2, Hd_1 var3, cb_3 var4, int var5) {
      float var6 = var4.goto_(var1);
      rpm_3 var7 = (rpm_3)MoreObjects.firstNonNull((rpm_3)var4.private_[6], rpm_3.MAIN_HAND);
      float var8 = (Float)var4.throws_[16];
      boolean var9 = true;
      boolean var10 = true;
      if (var4.return_()) {
         rdn_3 var11 = var4.sX();
         if (var11.break_() instanceof rkB_2) {
            var9 = var4.P() == rpm_3.MAIN_HAND;
            var10 = !var9;
         }

         rpm_3 var12 = var4.P();
         if (var12 == rpm_3.MAIN_HAND) {
            rdn_3 var13 = var4.Sn();
            if (var13.break_() instanceof rxm_3 && rxm_3.protected_(var13)) {
               var10 = false;
            }
         }
      } else {
         rdn_3 var14 = var4.ss();
         rdn_3 var17 = var4.Sn();
         if (var14.break_() instanceof rxm_3 && rxm_3.protected_(var14)) {
            var10 = !var9;
         }

         if (var17.break_() instanceof rxm_3 && rxm_3.protected_(var17)) {
            var9 = !var14.class_();
            var10 = !var9;
         }
      }

      if (var9) {
         float var15 = var7 == rpm_3.MAIN_HAND ? var6 : 0.0F;
         float var18 = 1.0F - rfU_2.catch_(var1, this.catch_, this.case_);
         if (!rrxr_3.rf.byte_() || !rrxr_3.break_(rrxr_3.rf, rpm_3.MAIN_HAND, var2, var3, var5, var1, var8, var15, var18, this.protected_)) {
            this.class_(var4, var1, var8, rpm_3.MAIN_HAND, var15, this.protected_, var18, var2, var3, var5);
         }
      }

      if (var10) {
         float var16 = var7 == rpm_3.OFF_HAND ? var6 : 0.0F;
         float var19 = 1.0F - rfU_2.catch_(var1, this.implements_, this.private_);
         if (!rrxr_3.rf.byte_() || !rrxr_3.break_(rrxr_3.rf, rpm_3.OFF_HAND, var2, var3, var5, var1, var8, var16, var19, this.throws_)) {
            this.class_(var4, var1, var8, rpm_3.OFF_HAND, var16, this.throws_, var19, var2, var3, var5);
         }
      }

      var3.break_();
   }

   private void class_(Ml_1 var1, rpZ_2 var2, float var3) {
      int var4 = var2 == rpZ_2.RIGHT ? 1 : -1;
      float var5 = rfU_2.class_(var3 * var3 * (float) Math.PI);
      var1.class_(rje_3.protected_.byte_((float)var4 * (45.0F + var5 * -20.0F)));
      float var6 = rfU_2.class_(rfU_2.byte_(var3) * (float) Math.PI);
      var1.class_(rje_3.case_.byte_((float)var4 * var6 * -20.0F));
      var1.class_(rje_3.break_.byte_(var6 * -80.0F));
      var1.class_(rje_3.protected_.byte_((float)var4 * -45.0F));
   }

   public void class_(iB_2 var1, rdn_3 var2, IQ var3, boolean var4, Ml_1 var5, Hx_1 var6, int var7) {
      rrby_3.class_(var4);
      if (!var2.class_()) {
         this.extends_.class_(var1, var2, var3, var4, var5, var6, (rYB)var1.throws_[7], var7, fZ_2.class_);
      }

      rrby_3.class_(false);
   }

   public void class_() {
      this.catch_ = this.case_;
      this.implements_ = this.private_;
      cb_3 var1 = (cb_3)this.byte_.class_[57];
      rdn_3 var2 = var1.ss();
      rdn_3 var3 = var1.Sn();
      if (rdn_3.break_(this.protected_, var2)) {
         this.protected_ = var2;
      }

      if (rdn_3.break_(this.throws_, var3)) {
         this.throws_ = var3;
      }

      if (var1.long_()) {
         this.case_ = rfU_2.class_(this.case_ - 0.4F, 0.0F, 1.0F);
         this.private_ = rfU_2.class_(this.private_ - 0.4F, 0.0F, 1.0F);
      } else {
         float var4 = var1.class_(1.0F, false);
         if (rrxr_3.rV.byte_()) {
            boolean var5 = rrxr_3.break_(rrxr_3.rV, this.protected_, var2, ((rhz_3)var1.implements_[1]).protected_);
            boolean var6 = rrxr_3.break_(rrxr_3.rV, this.throws_, var3, -1);
            if (!var5 && !Objects.equals(this.protected_, var2)) {
               this.protected_ = var2;
            }

            if (!var6 && !Objects.equals(this.throws_, var3)) {
               this.throws_ = var3;
            }
         }

         this.case_ = this.case_ + rfU_2.class_((this.protected_ == var2 ? var4 * var4 * var4 : 0.0F) - this.case_, -0.4F, 0.4F);
         this.private_ = this.private_ + rfU_2.class_((float)(this.throws_ == var3 ? 1 : 0) - this.private_, -0.4F, 0.4F);
      }

      if (this.case_ < 0.1F) {
         this.protected_ = var2;
         if (rrbb_3.rs()) {
            rrdZ.class_(this.protected_);
         }
      }

      if (this.private_ < 0.1F) {
         this.throws_ = var3;
         if (rrbb_3.rs()) {
            rrdZ.break_(this.throws_);
         }
      }
   }

   public void class_(rpm_3 var1) {
      if (var1 == rpm_3.MAIN_HAND) {
         this.case_ = 0.0F;
      } else {
         this.private_ = 0.0F;
      }
   }

   private void class_(Ml_1 var1, float var2, rpZ_2 var3, rdn_3 var4) {
      float var5 = (float)((cb_3)this.byte_.class_[57]).SH() - var2 + 1.0F;
      float var6 = var5 / (float)var4.extends_();
      if (var6 < 0.8F) {
         float var7 = rfU_2.throws_(rfU_2.break_(var5 / 4.0F * (float) Math.PI) * 0.1F);
         var1.class_(0.0, (double)var7, 0.0);
      }

      float var9 = 1.0F - (float)Math.pow((double)var6, 27.0);
      int var8 = var3 == rpZ_2.RIGHT ? 1 : -1;
      var1.class_((double)(var9 * 0.6F * (float)var8), (double)(var9 * -0.5F), (double)(var9 * 0.0F));
      var1.class_(rje_3.protected_.byte_((float)var8 * var9 * 90.0F));
      var1.class_(rje_3.break_.byte_(var9 * 10.0F));
      var1.class_(rje_3.case_.byte_((float)var8 * var9 * 30.0F));
   }

   private void class_(Ml_1 var1, Hx_1 var2, int var3, float var4, float var5, float var6) {
      float var7 = rfU_2.byte_(var6);
      float var8 = -0.2F * rfU_2.class_(var6 * (float) Math.PI);
      float var9 = -0.4F * rfU_2.class_(var7 * (float) Math.PI);
      var1.class_(0.0, (double)(-var8 / 2.0F), (double)var9);
      float var10 = this.class_(var4);
      var1.class_(0.0, (double)(0.04F + var5 * -1.2F + var10 * -0.5F), -0.72F);
      var1.class_(rje_3.break_.byte_(var10 * -85.0F));
      if (!((cb_3)this.byte_.class_[57]).Pp()) {
         var1.class_();
         var1.class_(rje_3.protected_.byte_(90.0F));
         this.class_(var1, var2, var3, rpZ_2.RIGHT);
         this.class_(var1, var2, var3, rpZ_2.LEFT);
         var1.break_();
      }

      float var11 = rfU_2.class_(var7 * (float) Math.PI);
      var1.class_(rje_3.break_.byte_(var11 * 20.0F));
      var1.class_(2.0F, 2.0F, 2.0F);
      this.class_(var1, var2, var3, this.protected_);
   }

   private void class_(Ml_1 var1, Hx_1 var2, int var3, float var4, rpZ_2 var5, float var6, rdn_3 var7) {
      float var8 = var5 == rpZ_2.RIGHT ? 1.0F : -1.0F;
      var1.class_((double)(var8 * 0.125F), -0.125, 0.0);
      var1.class_();
      var1.class_(rje_3.case_.byte_(var8 * 10.0F));
      this.class_(var1, var2, var3, var4, var6, var5);
      var1.break_();
      var1.class_();
      var1.class_((double)(var8 * 0.51F), (double)(-0.08F + var4 * -1.2F), -0.75);
      float var9 = rfU_2.byte_(var6);
      float var10 = rfU_2.class_(var9 * (float) Math.PI);
      float var11 = -0.5F * var10;
      float var12 = 0.4F * rfU_2.class_(var9 * (float) (Math.PI * 2));
      float var13 = -0.3F * rfU_2.class_(var6 * (float) Math.PI);
      var1.class_((double)(var8 * var11), (double)(var12 - 0.3F * var10), (double)var13);
      var1.class_(rje_3.break_.byte_(var10 * -45.0F));
      var1.class_(rje_3.protected_.byte_(var8 * var10 * -30.0F));
      this.class_(var1, var2, var3, var7);
      var1.break_();
   }

   private void class_(Ml_1 var1, Hx_1 var2, int var3, rpZ_2 var4) {
      this.byte_.A().class_(((cb_3)this.byte_.class_[57]).final_());
      ql_3 var5 = (ql_3)this.finally_.<cG_2>class_((cb_3)this.byte_.class_[57]);
      var1.class_();
      float var6 = var4 == rpZ_2.RIGHT ? 1.0F : -1.0F;
      var1.class_(rje_3.protected_.byte_(92.0F));
      var1.class_(rje_3.break_.byte_(45.0F));
      var1.class_(rje_3.case_.byte_(var6 * -41.0F));
      var1.class_((double)(var6 * 0.3F), -1.1F, 0.45F);
      if (var4 == rpZ_2.RIGHT) {
         var5.class_(var1, var2, var3, (cb_3)this.byte_.class_[57]);
      } else {
         var5.break_(var1, var2, var3, (cb_3)this.byte_.class_[57]);
      }

      var1.break_();
   }

   private float class_(float var1) {
      float var2 = 1.0F - var1 / 45.0F + 0.1F;
      var2 = rfU_2.class_(var2, 0.0F, 1.0F);
      return -rfU_2.break_(var2 * (float) Math.PI) * 0.5F + 0.5F;
   }

   private void class_(Ml_1 var1, Hx_1 var2, int var3, rdn_3 var4) {
      var1.class_(rje_3.protected_.byte_(180.0F));
      var1.class_(rje_3.case_.byte_(180.0F));
      var1.class_(0.38F, 0.38F, 0.38F);
      var1.class_(-0.5, -0.5, 0.0);
      var1.class_(0.0078125F, 0.0078125F, 0.0078125F);
      rrGb_1 var5 = rxI_2.break_(var4, (gm_3)this.byte_.class_[56]);
      Ok_1 var6 = var2.getBuffer(var5 == null ? class_ : break_);
      rjV_2 var7 = var1.byte_().class_();
      var6.class_(var7, -7.0F, 135.0F, 0.0F).break_(255, 255, 255, 255).class_(0.0F, 1.0F).break_(var3).class_();
      var6.class_(var7, 135.0F, 135.0F, 0.0F).break_(255, 255, 255, 255).class_(1.0F, 1.0F).break_(var3).class_();
      var6.class_(var7, 135.0F, -7.0F, 0.0F).break_(255, 255, 255, 255).class_(1.0F, 0.0F).break_(var3).class_();
      var6.class_(var7, -7.0F, -7.0F, 0.0F).break_(255, 255, 255, 255).class_(0.0F, 0.0F).break_(var3).class_();
      if (var5 != null) {
         ((Hh_1)this.byte_.class_[16]).catch_().class_(var1, var2, var5, false, var3);
      }
   }

   private void class_(Ml_1 var1, Hx_1 var2, int var3, float var4, float var5, rpZ_2 var6) {
      boolean var7 = var6 != rpZ_2.LEFT;
      float var8 = var7 ? 1.0F : -1.0F;
      float var9 = rfU_2.byte_(var5);
      float var10 = -0.3F * rfU_2.class_(var9 * (float) Math.PI);
      float var11 = 0.4F * rfU_2.class_(var9 * (float) (Math.PI * 2));
      float var12 = -0.4F * rfU_2.class_(var5 * (float) Math.PI);
      var1.class_((double)(var8 * (var10 + 0.64000005F)), (double)(var11 + -0.6F + var4 * -0.6F), (double)(var12 + -0.71999997F));
      var1.class_(rje_3.protected_.byte_(var8 * 45.0F));
      float var13 = rfU_2.class_(var5 * var5 * (float) Math.PI);
      float var14 = rfU_2.class_(var9 * (float) Math.PI);
      var1.class_(rje_3.protected_.byte_(var8 * var14 * 70.0F));
      var1.class_(rje_3.case_.byte_(var8 * var13 * -20.0F));
      cb_3 var15 = (cb_3)this.byte_.class_[57];
      this.byte_.A().class_(var15.final_());
      var1.class_((double)(var8 * -1.0F), 3.6F, 3.5);
      var1.class_(rje_3.case_.byte_(var8 * 120.0F));
      var1.class_(rje_3.break_.byte_(200.0F));
      var1.class_(rje_3.protected_.byte_(var8 * -135.0F));
      var1.class_((double)(var8 * 5.6F), 0.0, 0.0);
      ql_3 var16 = (ql_3)this.finally_.<cG_2>class_(var15);
      if (var7) {
         var16.class_(var1, var2, var3, var15);
      } else {
         var16.break_(var1, var2, var3, var15);
      }
   }

   private void break_(Ml_1 var1, rpZ_2 var2, float var3) {
      int var4 = var2 == rpZ_2.RIGHT ? 1 : -1;
      var1.class_((double)((float)var4 * 0.56F), (double)(-0.52F + var3 * -0.6F), -0.72F);
   }
}
