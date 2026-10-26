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
   protected yW_2 id_protected;

   public yc_3(yQ_2 var1, double var2, yW_2 var4) {
      this(var1, null, var2, var4);
   }

   public yc_3(yQ_2 var1, rfj_3 var2, double var3, yW_2 var5) {
      super(var1, var2, var3);
      this.id_throws = var1;
      this.id_protected = var5;
   }

   @Override
   public void id_class() {
      this.id_protected = null;
      if (this.id_break.compareAndSet(false, true)) {
         this.id_throws.id_class(false);
      }
   }

   private <E extends ryO_2> void id_class(yZ_2 var1, Set<ryO_2> var2, E var3) {
      jW_2 var4 = jz_3.id_break.id_class(var3);
      if (var4 != null) {
         if (var4.id_class(var3)) {
            var2.add(var3);
         } else {
            var1.id_throws.add(var3);
         }
      }
   }

   private Set<ryO_2> id_class(float var1, float var2, float var3, yZ_2 var4, Hv_1 var5) {
      rfH_2 var6 = this.id_throws.id_native.id_int();
      rfH_2 var7 = var6.id_break(15, 15, 15);
      yL_2 var8 = new yL_2();
      HashSet var9 = Sets.newHashSet();
      this.id_protected = null;
      Ml_1 var10 = new Ml_1();
      if (!this.id_throws.id_protected(var6)) {
         yz_3.id_break++;
         rrJI var11 = this.id_throws.id_break(var6);
         var11.id_break();
         HU[] var12 = new HU[1];
         boolean var13 = rrbb_3.rs();
         boolean var14 = var13 && rrdZ.q;
         lT_2.id_class();
         Random var15 = new Random();
         lo_3 var16 = QY.id_instanceof().id_synchronized();

         for (rrGi_1 var18 : rrGi_1.id_byte(var6, var7)) {
            xc_3 var19 = var11.id_byte(var18);
            if (!var19.id_catch()) {
               if (var19.id_implements(var11, var18)) {
                  var8.id_class(var18);
               }

               if (var19.id_break().id_protected()) {
                  ryO_2 var20 = var11.id_class(var18, rox_3.CHECK);
                  if (var20 != null) {
                     this.id_class(var4, var9, var20);
                  }
               }

               rXE var37 = var19.id_volatile();
               rrGq_1 var21 = yz_3.id_new ? this.id_class(var18) : null;
               if (!var37.id_byte()) {
                  HU[] var22 = this.id_throws.id_class(var37, var12);

                  for (int var23 = 0; var23 < var22.length; var23++) {
                     HU var24 = var22[var23];
                     if (!yz_3.id_super || rrxr_3.id_break(rrxr_3.Pw, var37, var24)) {
                        if (yz_3.id_this) {
                           rrxr_3.id_class(rrxr_3.rj, var24);
                        }

                        lD_2 var25 = var5.id_class(var24);
                        var25.id_break(var24);
                        rrxF_2 var26 = var25.id_class(var19, var18);
                        var26.id_class(var5);
                        var11.id_class(var26);
                        if (var4.id_byte.add(var24)) {
                           this.id_throws.id_class(var25);
                        }

                        if (var16.id_class(var18, var11, var25, var37)) {
                           var4.id_protected = false;
                           var4.id_break.id_class(var24);
                        }
                     }
                  }
               }

               if (var19.id_private() != xN_2.INVISIBLE) {
                  HU[] var39 = this.id_throws.id_class(var19, var12);

                  for (HU var45 : var39) {
                     if (!yz_3.id_continue || rrxr_3.id_break(rrxr_3.Pt, var19, var45)) {
                        if (yz_3.id_this) {
                           rrxr_3.id_class(rrxr_3.rj, var45);
                        }

                        HU var27 = this.id_throws.id_class(var11, var19, var18, var45);
                        lD_2 var28 = var5.id_class(var27);
                        var28.id_break(var27);
                        rrxF_2 var29 = var28.id_class(var19, var18);
                        var29.id_class(var5);
                        var11.id_class(var29);
                        if (var4.id_byte.add(var27)) {
                           this.id_throws.id_class(var28);
                        }

                        var10.id_class();
                        var10.id_class(
                           (double)this.id_throws.id_super + (double)(var18.b_() & 15),
                           (double)this.id_throws.id_this + (double)(var18.c_() & 15),
                           (double)this.id_throws.id_else + (double)(var18.d_() & 15)
                        );
                        if (var14) {
                           var28.id_byte(
                              0.5F + (float)this.id_throws.id_super + (float)(var18.b_() & 15),
                              0.5F + (float)this.id_throws.id_this + (float)(var18.c_() & 15),
                              0.5F + (float)this.id_throws.id_else + (float)(var18.d_() & 15)
                           );
                        }

                        if (var16.id_class(var19, var18, var11, var10, var28, true, var15, var21)) {
                           var4.id_protected = false;
                           var4.id_break.id_class(var27);
                           if (var29.id_int()) {
                              this.id_throws.id_class(var5, var4);
                              var29.id_class(false);
                           }
                        }

                        var10.id_break();
                     }
                  }
               }

               roJ_2 var40 = this.id_throws.id_public;
               if (var40 != null) {
                  rrnW_2 var42 = new rrnW_2(var18, var19, var19.id_break(), var40.id_private());
                  ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var42);
               }
            }
         }

         if (var4.id_break.id_break(HU.id_implements())) {
            lD_2 var30 = var5.id_class(HU.id_implements());
            var30.id_protected(
               (float)this.id_throws.id_super + var1 - (float)var6.b_(),
               (float)this.id_throws.id_this + var2 - (float)var6.c_(),
               (float)this.id_throws.id_else + var3 - (float)var6.d_()
            );
            var4.id_catch = var30.id_implements();
         }

         var4.id_byte.stream().map(var5::id_class).forEach(lD_2::id_finally);

         for (HU var38 : yz_3.id_class) {
            var4.id_class(var38, null);
         }

         for (HU var34 : var4.id_byte) {
            if (rrbb_3.rs()) {
               rrdk_1.id_case(var5.id_class(var34));
            }

            lD_2 var36 = var5.id_class(var34);
            if (var36.id_finally != null && !var36.id_finally.isEmpty()) {
               var4.id_class(var34, (BitSet)var36.id_finally.clone());
            }
         }

         var11.id_byte();
         lT_2.id_break();
      }

      var4.id_case = var8.id_class();
      return var9;
   }

   @Override
   public CompletableFuture<ym_3> id_class(Hv_1 var1) {
      if (this.id_break.get()) {
         return CompletableFuture.completedFuture(ym_3.CANCELLED);
      } else if (!this.id_throws.id_class()) {
         this.id_protected = null;
         this.id_throws.id_class(false);
         this.id_break.set(true);
         return CompletableFuture.completedFuture(ym_3.CANCELLED);
      } else if (this.id_break.get()) {
         return CompletableFuture.completedFuture(ym_3.CANCELLED);
      } else {
         rjU_2 var2 = this.id_throws.id_throws.id_break();
         float var3 = (float)var2.id_break;
         float var4 = (float)var2.id_byte;
         float var5 = (float)var2.id_protected;
         yZ_2 var6 = new yZ_2();
         Set var7 = this.id_class(var3, var4, var5, var6, var1);
         this.id_throws.id_class(var7);
         if (this.id_break.get()) {
            return CompletableFuture.completedFuture(ym_3.CANCELLED);
         } else {
            ArrayList var8 = Lists.newArrayList();
            var6.id_byte.forEach(var3x -> var8.add(this.id_throws.id_throws.id_class(var1.id_class(var3x), this.id_throws.id_class(var3x))));
            return rqR_2.id_break(var8).handle((var2x, var3x) -> {
               if (var3x != null && !(var3x instanceof CancellationException) && !(var3x instanceof InterruptedException)) {
                  QY.id_instanceof().id_break(KY.id_class(var3x, "Rendering chunk"));
               }

               if (this.id_break.get()) {
                  return ym_3.CANCELLED;
               } else {
                  this.id_throws.id_class.set(var6);
                  return ym_3.SUCCESSFUL;
               }
            });
         }
      }
   }
}
