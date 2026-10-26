package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;

class yc_3 extends yN_2 {
   protected yW_2 protected_;

   public yc_3(yQ_2 var1, double var2, yW_2 var4) {
      this(var1, null, var2, var4);
   }

   public yc_3(yQ_2 var1, rfj_3 var2, double var3, yW_2 var5) {
      super(var1, var2, var3);
      this.throws_ = var1;
      this.protected_ = var5;
   }

   @Override
   public void class_() {
      this.protected_ = null;
      if (this.break_.compareAndSet(false, true)) {
         this.throws_.class_(false);
      }
   }

   private <E extends ryO_2> void class_(yZ_2 var1, Set<ryO_2> var2, E var3) {
      jW_2 var4 = jz_3.break_.class_(var3);
      if (var4 != null) {
         if (var4.class_(var3)) {
            var2.add(var3);
         } else {
            var1.throws_.add(var3);
         }
      }
   }

   private Set<ryO_2> class_(float var1, float var2, float var3, yZ_2 var4, Hv_1 var5) {
      rfH_2 var6 = this.throws_.native_.int_();
      rfH_2 var7 = var6.break_(15, 15, 15);
      yL_2 var8 = new yL_2();
      HashSet var9 = Sets.newHashSet();
      this.protected_ = null;
      Ml_1 var10 = new Ml_1();
      if (!this.throws_.protected_(var6)) {
         yz_3.break_++;
         rrJI var11 = this.throws_.break_(var6);
         var11.break_();
         HU[] var12 = new HU[1];
         boolean var13 = rrbb_3.rs();
         boolean var14 = var13 && rrdZ.q;
         lT_2.class_();
         Random var15 = new Random();
         lo_3 var16 = QY.instanceof_().synchronized_();

         for (rrGi_1 var18 : rrGi_1.byte_(var6, var7)) {
            xc_3 var19 = var11.byte_(var18);
            if (!var19.catch_()) {
               if (var19.implements_(var11, var18)) {
                  var8.class_(var18);
               }

               if (var19.break_().protected_()) {
                  ryO_2 var20 = var11.class_(var18, rox_3.CHECK);
                  if (var20 != null) {
                     this.class_(var4, var9, var20);
                  }
               }

               rXE var37 = var19.volatile_();
               rrGq_1 var21 = yz_3.new_ ? this.class_(var18) : null;
               if (!var37.byte_()) {
                  HU[] var22 = this.throws_.class_(var37, var12);

                  for (int var23 = 0; var23 < var22.length; var23++) {
                     HU var24 = var22[var23];
                     if (!yz_3.super_ || rrxr_3.break_(rrxr_3.Pw, var37, var24)) {
                        if (yz_3.this_) {
                           rrxr_3.class_(rrxr_3.rj, var24);
                        }

                        lD_2 var25 = var5.class_(var24);
                        var25.break_(var24);
                        rrxF_2 var26 = var25.class_(var19, var18);
                        var26.class_(var5);
                        var11.class_(var26);
                        if (var4.byte_.add(var24)) {
                           this.throws_.class_(var25);
                        }

                        if (var16.class_(var18, var11, var25, var37)) {
                           var4.protected_ = false;
                           var4.break_.class_(var24);
                        }
                     }
                  }
               }

               if (var19.private_() != xN_2.INVISIBLE) {
                  HU[] var39 = this.throws_.class_(var19, var12);

                  for (HU var45 : var39) {
                     if (!yz_3.continue_ || rrxr_3.break_(rrxr_3.Pt, var19, var45)) {
                        if (yz_3.this_) {
                           rrxr_3.class_(rrxr_3.rj, var45);
                        }

                        HU var27 = this.throws_.class_(var11, var19, var18, var45);
                        lD_2 var28 = var5.class_(var27);
                        var28.break_(var27);
                        rrxF_2 var29 = var28.class_(var19, var18);
                        var29.class_(var5);
                        var11.class_(var29);
                        if (var4.byte_.add(var27)) {
                           this.throws_.class_(var28);
                        }

                        var10.class_();
                        var10.class_(
                           (double)this.throws_.super_ + (double)(var18.b_() & 15),
                           (double)this.throws_.this_ + (double)(var18.c_() & 15),
                           (double)this.throws_.else_ + (double)(var18.d_() & 15)
                        );
                        if (var14) {
                           var28.byte_(
                              0.5F + (float)this.throws_.super_ + (float)(var18.b_() & 15),
                              0.5F + (float)this.throws_.this_ + (float)(var18.c_() & 15),
                              0.5F + (float)this.throws_.else_ + (float)(var18.d_() & 15)
                           );
                        }

                        if (var16.class_(var19, var18, var11, var10, var28, true, var15, var21)) {
                           var4.protected_ = false;
                           var4.break_.class_(var27);
                           if (var29.int_()) {
                              this.throws_.class_(var5, var4);
                              var29.class_(false);
                           }
                        }

                        var10.break_();
                     }
                  }
               }

               roJ_2 var40 = this.throws_.public_;
               if (var40 != null) {
                  rrnW_2 var42 = new rrnW_2(var18, var19, var19.break_(), var40.private_());
                  ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var42);
               }
            }
         }

         if (var4.break_.break_(HU.implements_())) {
            lD_2 var30 = var5.class_(HU.implements_());
            var30.protected_(
               (float)this.throws_.super_ + var1 - (float)var6.b_(),
               (float)this.throws_.this_ + var2 - (float)var6.c_(),
               (float)this.throws_.else_ + var3 - (float)var6.d_()
            );
            var4.catch_ = var30.implements_();
         }

         var4.byte_.stream().map(var5::class_).forEach(lD_2::finally_);

         for (HU var38 : yz_3.class_) {
            var4.class_(var38, null);
         }

         for (HU var34 : var4.byte_) {
            if (rrbb_3.rs()) {
               rrdk_1.case_(var5.class_(var34));
            }

            lD_2 var36 = var5.class_(var34);
            if (var36.finally_ != null && !var36.finally_.isEmpty()) {
               var4.class_(var34, (BitSet)var36.finally_.clone());
            }
         }

         var11.byte_();
         lT_2.break_();
      }

      var4.case_ = var8.class_();
      return var9;
   }

   @Override
   public CompletableFuture<ym_3> class_(Hv_1 var1) {
      if (this.break_.get()) {
         return CompletableFuture.completedFuture(ym_3.CANCELLED);
      } else if (!this.throws_.class_()) {
         this.protected_ = null;
         this.throws_.class_(false);
         this.break_.set(true);
         return CompletableFuture.completedFuture(ym_3.CANCELLED);
      } else if (this.break_.get()) {
         return CompletableFuture.completedFuture(ym_3.CANCELLED);
      } else {
         rjU_2 var2 = this.throws_.throws_.break_();
         float var3 = (float)var2.break_;
         float var4 = (float)var2.byte_;
         float var5 = (float)var2.protected_;
         yZ_2 var6 = new yZ_2();
         Set var7 = this.class_(var3, var4, var5, var6, var1);
         this.throws_.class_(var7);
         if (this.break_.get()) {
            return CompletableFuture.completedFuture(ym_3.CANCELLED);
         } else {
            ArrayList var8 = Lists.newArrayList();
            var6.byte_.forEach(var3x -> var8.add(this.throws_.throws_.class_(var1.class_(var3x), this.throws_.class_(var3x))));
            return rqR_2.break_(var8).handle((var2x, var3x) -> {
               if (var3x != null && !(var3x instanceof CancellationException) && !(var3x instanceof InterruptedException)) {
                  QY.instanceof_().break_(KY.class_(var3x, "Rendering chunk"));
               }

               if (this.break_.get()) {
                  return ym_3.CANCELLED;
               } else {
                  this.throws_.class_.set(var6);
                  return ym_3.SUCCESSFUL;
               }
            });
         }
      }
   }
}
