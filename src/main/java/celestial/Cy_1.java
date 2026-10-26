package celestial;

import com.google.common.base.Charsets;
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class Cy_1 implements rAc_1 {
   private static final List<CJ> id_break = ImmutableList.of(CJ.id_class, CJ.id_break, CJ.id_protected, CJ.id_byte, CJ.id_throws);
   protected gm_3 id_class;
   private final Map<CJ, Queue<CH>> id_byte = Maps.newIdentityHashMap();
   private final Queue<nj_3> id_protected = Queues.newArrayDeque();
   private final fY_2 id_throws;
   private final Random id_case = new Random();
   private final Map<rqO_2, CX<?>> id_catch = new HashMap<>();
   private final Queue<CH> id_private = Queues.newArrayDeque();
   private final Map<rqO_2, Cp_1> id_implements = Maps.newHashMap();
   private final fJ_2 id_finally = new fJ_2(fJ_2.id_break);

   public void id_byte() {
      this.id_byte.forEach((var1x, var2) -> this.id_class(var2));
      if (!this.id_protected.isEmpty()) {
         ArrayList var1 = Lists.newArrayList();

         for (nj_3 var3 : this.id_protected) {
            var3.id_case();
            if (!var3.id_native()) {
               var1.add(var3);
            }
         }

         this.id_protected.removeAll(var1);
      }

      CH var4;
      if (!this.id_private.isEmpty()) {
         while ((var4 = this.id_private.poll()) != null) {
            Queue var5 = this.id_byte.computeIfAbsent(var4.id_class(), var0 -> EvictingQueue.create(16384));
            if (!(var4 instanceof AY) || !this.id_class(var4, var5)) {
               var5.add(var4);
            }
         }
      }
   }

   public Cy_1(gm_3 var1, fY_2 var2) {
      var2.id_class(this.id_finally.id_protected(), this.id_finally);
      this.id_class = var1;
      this.id_throws = var2;
      this.id_throws();
   }

   public void id_class(rfH_2 var1, rff_3 var2) {
      xc_3 var3 = this.id_class.id_byte(var1);
      if (var3 != null) {
         boolean var4 = rrxr_3.id_break(var3, rrxr_3.Q, new Object[]{this.id_class, var2, this});
         if (!var4) {
            rpr_3 var5 = var2.id_break();
            this.id_class(var1, var5);
         }
      }
   }

   private boolean id_class(CH var1, Queue<CH> var2) {
      for (CH var4 : var2) {
         if (var4 instanceof AY && var1.id_protected == var4.id_protected && var1.id_throws == var4.id_throws && var1.id_case == var4.id_case) {
            var4.id_super = 0;
            return true;
         }
      }

      return false;
   }

   public void id_class(rfH_2 var1, rpr_3 var2) {
      xc_3 var3 = this.id_class.id_byte(var1);
      if (var3.id_private() != xN_2.INVISIBLE) {
         int var4 = var1.b_();
         int var5 = var1.c_();
         int var6 = var1.d_();
         float var7 = 0.1F;
         rfl_3 var8 = var3.id_finally(this.id_class, var1).id_class();
         double var9 = (double)var4 + this.id_case.nextDouble() * (var8.id_protected - var8.id_class - 0.2F) + 0.1F + var8.id_class;
         double var11 = (double)var5 + this.id_case.nextDouble() * (var8.id_throws - var8.id_break - 0.2F) + 0.1F + var8.id_break;
         double var13 = (double)var6 + this.id_case.nextDouble() * (var8.id_case - var8.id_byte - 0.2F) + 0.1F + var8.id_byte;
         if (var2 == rpr_3.DOWN) {
            var11 = (double)var5 + var8.id_break - 0.1F;
         }

         if (var2 == rpr_3.UP) {
            var11 = (double)var5 + var8.id_throws + 0.1F;
         }

         if (var2 == rpr_3.NORTH) {
            var13 = (double)var6 + var8.id_byte - 0.1F;
         }

         if (var2 == rpr_3.SOUTH) {
            var13 = (double)var6 + var8.id_case + 0.1F;
         }

         if (var2 == rpr_3.WEST) {
            var9 = (double)var4 + var8.id_class - 0.1F;
         }

         if (var2 == rpr_3.EAST) {
            var9 = (double)var4 + var8.id_protected + 0.1F;
         }

         this.id_class(new nz_3(this.id_class, var9, var11, var13, 0.0, 0.0, 0.0, var3).id_class(var1).id_byte(0.2F).id_protected(0.6F));
      }
   }

   public void id_class(rfH_2 var1, xc_3 var2) {
      boolean var3;
      if (rrxr_3.z.id_byte() && rrxr_3.Z.id_byte()) {
         xd_3 var4 = var2.id_break();
         var3 = !rrxr_3.id_break(var2, rrxr_3.Z, new Object[]{this.id_class, var1})
            && !rrxr_3.id_break(var2, rrxr_3.z, new Object[]{this.id_class, var1, this});
      } else {
         var3 = !var2.id_catch();
      }

      if (var3) {
         rjC_2 var7 = var2.id_finally(this.id_class, var1);
         double var5 = 0.25;
         var7.id_break(
            (var3x, var5x, var7x, var9, var11, var13) -> {
               double var15 = Math.min(1.0, var9 - var3x);
               double var17 = Math.min(1.0, var11 - var5x);
               double var19 = Math.min(1.0, var13 - var7x);
               int var21 = Math.max(2, rfU_2.id_throws(var15 / 0.25));
               int var22 = Math.max(2, rfU_2.id_throws(var17 / 0.25));
               int var23 = Math.max(2, rfU_2.id_throws(var19 / 0.25));

               for (int var24 = 0; var24 < var21; var24++) {
                  for (int var25 = 0; var25 < var22; var25++) {
                     for (int var26 = 0; var26 < var23; var26++) {
                        double var27 = ((double)var24 + 0.5) / (double)var21;
                        double var29 = ((double)var25 + 0.5) / (double)var22;
                        double var31 = ((double)var26 + 0.5) / (double)var23;
                        double var33 = var27 * var15 + var3x;
                        double var35 = var29 * var17 + var5x;
                        double var37 = var31 * var19 + var7x;
                        this.id_class(
                           new nz_3(
                                 this.id_class,
                                 (double)var1.b_() + var33,
                                 (double)var1.c_() + var35,
                                 (double)var1.d_() + var37,
                                 var27 - 0.5,
                                 var29 - 0.5,
                                 var31 - 0.5,
                                 var2
                              )
                              .id_class(var1)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void id_class(gm_3 var1) {
      this.id_class = var1;
      this.id_byte.clear();
      this.id_protected.clear();
   }

   private <T extends rLx_1> void id_class(rLz_1<T> var1, CX<T> var2) {
      this.id_catch.put(rVL.id_switch.id_break(var1), var2);
   }

   public void id_class(CH var1) {
      if (var1 != null && (!(var1 instanceof Cr_1) || rrbb_3.b())) {
         this.id_private.add(var1);
      }
   }

   private void id_class(rAL var1, rqO_2 var2, Map<rqO_2, List<rqO_2>> var3) {
      rqO_2 var4 = new rqO_2(var2.id_byte(), "particles/" + var2.id_break() + ".json");

      try {
         rAF var5 = var1.id_class(var4);

         try (InputStreamReader var6 = new InputStreamReader(var5.id_break(), Charsets.UTF_8)) {
            lc_3 var7 = lc_3.id_class(rpY_2.id_class(var6));
            List var8 = var7.id_class();
            boolean var9 = this.id_implements.containsKey(var2);
            if (var8 == null) {
               if (var9) {
                  throw new IllegalStateException("Missing texture list for particle " + var2);
               }
            } else {
               if (!var9) {
                  throw new IllegalStateException("Redundant texture list for particle " + var2);
               }

               var3.put(var2, var8.stream().map(var0 -> new rqO_2(var0.id_byte(), "particle/" + var0.id_break())).collect(Collectors.toList()));
            }
         } catch (Throwable var13) {
            if (var5 != null) {
               try {
                  var5.close();
               } catch (Throwable var10) {
                  var13.addSuppressed(var10);
               }
            }

            throw var13;
         }

         if (var5 != null) {
            var5.close();
         }
      } catch (IOException var14) {
         throw new IllegalStateException("Failed to load description for particle " + var2, var14);
      }
   }

   public CH id_class(rLx_1 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      CH var14 = this.id_break(var1, var2, var4, var6, var8, var10, var12);
      if (var14 != null) {
         this.id_class(var14);
         return var14;
      } else {
         return null;
      }
   }

   public void id_class(an_3 var1, rLx_1 var2, int var3) {
      this.id_protected.add(new nj_3(this.id_class, var1, var2, var3));
   }

   public void id_class(an_3 var1, rLx_1 var2) {
      this.id_protected.add(new nj_3(this.id_class, var1, var2));
   }

   public void id_class(Ml_1 var1, Hd_1 var2, HQ var3, ly_3 var4, float var5, yt_3 var6) {
      var3.id_byte();
      Runnable var7 = () -> {
         RenderSystem.enableAlphaTest();
         RenderSystem.defaultAlphaFunc();
         RenderSystem.enableDepthTest();
         RenderSystem.enableFog();
         if (rrxr_3.rb.id_byte()) {
            RenderSystem.activeTexture(33986);
            RenderSystem.enableTexture();
            RenderSystem.activeTexture(33984);
         }
      };
      rXE var8 = var4.id_finally();
      boolean var9 = var8.id_class(rlG_2.id_break);
      RenderSystem.pushMatrix();
      RenderSystem.multMatrix(var1.id_byte().id_class());
      Object var10 = id_break;
      if (rrxr_3.rb.id_byte()) {
         var10 = this.id_byte.keySet();
      }

      for (CJ var12 : var10) {
         if (var12 != CJ.id_case) {
            var7.run();
            Iterable var13 = this.id_byte.get(var12);
            if (var13 != null) {
               RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
               yb_3 var14 = yb_3.id_class();
               lD_2 var15 = var14.id_byte();
               var12.id_class(var15, this.id_throws);

               for (CH var17 : var13) {
                  if (var6 == null || !var17.id_final() || var6.id_class(var17.id_volatile())) {
                     try {
                        if (var9 || !(var17 instanceof lZ_2) || var17.id_finally != 0.0 || var17.id_extends != 0.0 || var17.id_native != 0.0) {
                           var17.id_class(var15, var4, var5);
                        }
                     } catch (Throwable var21) {
                        KY var19 = KY.id_class(var21, "Rendering Particle");
                        Ko_1 var20 = var19.id_class("Particle being rendered");
                        var20.id_class("Particle", var17::toString);
                        var20.id_class("Particle Type", var12::toString);
                        throw new KU(var19);
                     }
                  }
               }

               var12.id_class(var14);
            }
         }
      }

      RenderSystem.popMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.depthFunc(515);
      RenderSystem.disableBlend();
      RenderSystem.defaultAlphaFunc();
      var3.id_break();
      RenderSystem.disableFog();
      RenderSystem.enableDepthTest();
   }

   public void id_class(Ml_1 var1, Hd_1 var2, HQ var3, ly_3 var4, float var5) {
      this.id_class(var1, var2, var3, var4, var5, null);
   }

   private <T extends rLx_1> void id_class(rLz_1<T> var1, Cq_1<T> var2) {
      Cp_1 var3 = new Cp_1(this);
      this.id_implements.put(rVL.id_switch.id_break(var1), var3);
      this.id_catch.put(rVL.id_switch.id_break(var1), var2.create(var3));
   }

   private void id_class(Collection<CH> var1) {
      if (!var1.isEmpty()) {
         long var2 = System.currentTimeMillis();
         int var4 = var1.size();
         Iterator var5 = var1.iterator();

         while (var5.hasNext()) {
            CH var6 = (CH)var5.next();
            this.id_break(var6);
            if (!var6.id_native()) {
               var5.remove();
            }

            var4--;
            if (System.currentTimeMillis() > var2 + 20L) {
               break;
            }
         }

         if (var4 > 0) {
            int var9 = var4;

            for (Iterator var7 = var1.iterator(); var7.hasNext() && var9 > 0; var9--) {
               CH var8 = (CH)var7.next();
               var8.id_finally();
               var7.remove();
            }
         }
      }
   }

   public CompletableFuture<Void> id_class(rAu_1 var1, rAL var2, Executor var3, Executor var4) {
      ConcurrentMap var5 = Maps.newConcurrentMap();
      CompletableFuture[] var6 = rVL.id_switch
         .id_protected()
         .stream()
         .map(var4x -> CompletableFuture.runAsync(() -> this.id_class(var2, var4x, var5), var3))
         .toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf(var6)
         .thenApplyAsync(var3x -> this.id_finally.id_class(var2, var5.values().stream().flatMap(Collection::stream), 0), var3)
         .<fx_3>thenCompose(var1::id_class)
         .thenAcceptAsync(
            var2x -> {
               this.id_byte.clear();
               this.id_finally.id_class(var2x);
               fj_3 var3x = this.id_finally.id_break(fQ_2.id_class());
               var5.forEach(
                  (var2xx, var3xx) -> {
                     ImmutableList var4x = var3xx.isEmpty()
                        ? ImmutableList.of(var3x)
                        : var3xx.stream().map(this.id_finally::id_break).collect(ImmutableList.toImmutableList());
                     this.id_implements.get(var2xx).id_class(var4x);
                  }
               );
            },
            var4
         );
   }

   public void id_break() {
      this.id_finally.id_byte();
   }

   private void id_break(CH var1) {
      try {
         var1.id_case();
      } catch (Throwable var5) {
         KY var3 = KY.id_class(var5, "Ticking Particle");
         Ko_1 var4 = var3.id_class("Particle being ticked");
         var4.id_class("Particle", var1::toString);
         var4.id_class("Particle Type", var1.id_class()::toString);
         throw new KU(var3);
      }
   }

   private <T extends rLx_1> CH id_break(T var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      CX var14 = this.id_catch.get(rVL.id_switch.id_break(var1.id_protected()));
      return var14 == null ? null : var14.id_class(var1, this.id_class, var2, var4, var6, var8, var10, var12);
   }

   private void id_throws() {
      this.id_class(rLQ.id_class, lr_3::new);
      this.id_class(rLQ.id_break, CG::new);
      this.id_class(rLQ.id_byte, new Ao_1());
      this.id_class(rLQ.id_protected, new nQ_2());
      this.id_class(rLQ.id_throws, nP_2::new);
      this.id_class(rLQ.O, Ai_1::new);
      this.id_class(rLQ.b, nS_2::new);
      this.id_class(rLQ.J, nE_2::new);
      this.id_class(rLQ.x, nG_2::new);
      this.id_class(rLQ.id_case, nM_2::new);
      this.id_class(rLQ.id_abstract, lx_3::new);
      this.id_class(rLQ.id_catch, nJ_2::new);
      this.id_class(rLQ.M, nk_3::new);
      this.id_class(rLQ.id_private, nX_2::new);
      this.id_class(rLQ.id_implements, nc_3::new);
      this.id_class(rLQ.X, ld_3::new);
      this.id_class(rLQ.id_finally, nF_2::new);
      this.id_class(rLQ.id_extends, nl_3::new);
      this.id_class(rLQ.id_native, nI_2::new);
      this.id_class(rLQ.id_volatile, nA_2::new);
      this.id_class(rLQ.id_final, nT_2::new);
      this.id_class(rLQ.id_package, Cg_1::new);
      this.id_class(rLQ.id_int, lP_2::new);
      this.id_class(rLQ.id_new, new Cn_1());
      this.id_class(rLQ.id_continue, nx_3::new);
      this.id_class(rLQ.id_super, ng_3::new);
      this.id_class(rLQ.id_this, no_3::new);
      this.id_class(rLQ.id_else, lS_2::new);
      this.id_class(rLQ.id_synchronized, new CO());
      this.id_class(rLQ.id_return, Cu_1::new);
      this.id_class(rLQ.id_public, nD_2::new);
      this.id_class(rLQ.id_goto, CP::new);
      this.id_class(rLQ.id_while, ln_3::new);
      this.id_class(rLQ.id_try, Cs_1::new);
      this.id_class(rLQ.id_throw, Ca_1::new);
      this.id_class(rLQ.id_instanceof, Cs_1::new);
      this.id_class(rLQ.id_interface, ni_3::new);
      this.id_class(rLQ.id_char, lW_2::new);
      this.id_class(rLQ.id_long, Cb_1::new);
      this.id_class(rLQ.id_float, lB_2::new);
      this.id_class(rLQ.id_void, new AD());
      this.id_class(rLQ.id_static, new AU());
      this.id_class(rLQ.id_import, new Ae_1());
      this.id_class(rLQ.id_short, CZ::new);
      this.id_class(rLQ.id_default, CF::new);
      this.id_class(rLQ.id_const, lk_3::new);
      this.id_class(rLQ.h, nR_2::new);
      this.id_class(rLQ.id_strictfp, Cl_1::new);
      this.id_class(rLQ.id_boolean, Ct_1::new);
      this.id_class(rLQ.id_transient, CI::new);
      this.id_class(rLQ.id_for, Cj_1::new);
      this.id_class(rLQ.id_double, CU::new);
      this.id_class(rLQ.id_switch, nO_2::new);
      this.id_class(rLQ.r, lG_2::new);
      this.id_class(rLQ.B, lQ_2::new);
      this.id_class(rLQ.S, lm_3::new);
      this.id_class(rLQ.P, lX_2::new);
      this.id_class(rLQ.s, lF_2::new);
      this.id_class(rLQ.E, lM_2::new);
      this.id_class(rLQ.G, ls_3::new);
      this.id_class(rLQ.d, nZ_2::new);
      this.id_class(rLQ.k, nn_3::new);
      this.id_class(rLQ.W, nw_3::new);
      this.id_class(rLQ.z, ny_3::new);
      this.id_class(rLQ.Q, AR::new);
      this.id_class(rLQ.N, lv_3::new);
      this.id_class(rLQ.c, lL_2::new);
      this.id_class(rLQ.u, nL_2::new);
      this.id_class(rLQ.m, nq_3::new);
      this.id_class(rLQ.Z, nf_3::new);
      this.id_class(rLQ.v, CY::new);
      this.id_class(rLQ.F, ll_3::new);
   }

   public String id_protected() {
      return String.valueOf(this.id_byte.values().stream().mapToInt(Collection::size).sum());
   }
}
