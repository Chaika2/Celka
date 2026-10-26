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
   private static final List<CJ> break_ = ImmutableList.of(CJ.class_, CJ.break_, CJ.protected_, CJ.byte_, CJ.throws_);
   protected gm_3 class_;
   private final Map<CJ, Queue<CH>> byte_ = Maps.newIdentityHashMap();
   private final Queue<nj_3> protected_ = Queues.newArrayDeque();
   private final fY_2 throws_;
   private final Random case_ = new Random();
   private final Map<rqO_2, CX<?>> catch_ = new HashMap<>();
   private final Queue<CH> private_ = Queues.newArrayDeque();
   private final Map<rqO_2, Cp_1> implements_ = Maps.newHashMap();
   private final fJ_2 finally_ = new fJ_2(fJ_2.break_);

   public void byte_() {
      this.byte_.forEach((var1x, var2) -> this.class_(var2));
      if (!this.protected_.isEmpty()) {
         ArrayList var1 = Lists.newArrayList();

         for (nj_3 var3 : this.protected_) {
            var3.case_();
            if (!var3.native_()) {
               var1.add(var3);
            }
         }

         this.protected_.removeAll(var1);
      }

      CH var4;
      if (!this.private_.isEmpty()) {
         while ((var4 = this.private_.poll()) != null) {
            Queue var5 = this.byte_.computeIfAbsent(var4.class_(), var0 -> EvictingQueue.create(16384));
            if (!(var4 instanceof AY) || !this.class_(var4, var5)) {
               var5.add(var4);
            }
         }
      }
   }

   public Cy_1(gm_3 var1, fY_2 var2) {
      var2.class_(this.finally_.protected_(), this.finally_);
      this.class_ = var1;
      this.throws_ = var2;
      this.throws_();
   }

   public void class_(rfH_2 var1, rff_3 var2) {
      xc_3 var3 = this.class_.byte_(var1);
      if (var3 != null) {
         boolean var4 = rrxr_3.break_(var3, rrxr_3.Q, this.class_, var2, this);
         if (!var4) {
            rpr_3 var5 = var2.break_();
            this.class_(var1, var5);
         }
      }
   }

   private boolean class_(CH var1, Queue<CH> var2) {
      for (CH var4 : var2) {
         if (var4 instanceof AY && var1.protected_ == var4.protected_ && var1.throws_ == var4.throws_ && var1.case_ == var4.case_) {
            var4.super_ = 0;
            return true;
         }
      }

      return false;
   }

   public void class_(rfH_2 var1, rpr_3 var2) {
      xc_3 var3 = this.class_.byte_(var1);
      if (var3.private_() != xN_2.INVISIBLE) {
         int var4 = var1.b_();
         int var5 = var1.c_();
         int var6 = var1.d_();
         float var7 = 0.1F;
         rfl_3 var8 = var3.finally_(this.class_, var1).class_();
         double var9 = (double)var4 + this.case_.nextDouble() * (var8.protected_ - var8.class_ - 0.2F) + 0.1F + var8.class_;
         double var11 = (double)var5 + this.case_.nextDouble() * (var8.throws_ - var8.break_ - 0.2F) + 0.1F + var8.break_;
         double var13 = (double)var6 + this.case_.nextDouble() * (var8.case_ - var8.byte_ - 0.2F) + 0.1F + var8.byte_;
         if (var2 == rpr_3.DOWN) {
            var11 = (double)var5 + var8.break_ - 0.1F;
         }

         if (var2 == rpr_3.UP) {
            var11 = (double)var5 + var8.throws_ + 0.1F;
         }

         if (var2 == rpr_3.NORTH) {
            var13 = (double)var6 + var8.byte_ - 0.1F;
         }

         if (var2 == rpr_3.SOUTH) {
            var13 = (double)var6 + var8.case_ + 0.1F;
         }

         if (var2 == rpr_3.WEST) {
            var9 = (double)var4 + var8.class_ - 0.1F;
         }

         if (var2 == rpr_3.EAST) {
            var9 = (double)var4 + var8.protected_ + 0.1F;
         }

         this.class_(new nz_3(this.class_, var9, var11, var13, 0.0, 0.0, 0.0, var3).class_(var1).byte_(0.2F).protected_(0.6F));
      }
   }

   public void class_(rfH_2 var1, xc_3 var2) {
      boolean var3;
      if (rrxr_3.z.byte_() && rrxr_3.Z.byte_()) {
         xd_3 var4 = var2.break_();
         var3 = !rrxr_3.break_(var2, rrxr_3.Z, this.class_, var1) && !rrxr_3.break_(var2, rrxr_3.z, this.class_, var1, this);
      } else {
         var3 = !var2.catch_();
      }

      if (var3) {
         rjC_2 var7 = var2.finally_(this.class_, var1);
         double var5 = 0.25;
         var7.break_(
            (var3x, var5x, var7x, var9, var11, var13) -> {
               double var15 = Math.min(1.0, var9 - var3x);
               double var17 = Math.min(1.0, var11 - var5x);
               double var19 = Math.min(1.0, var13 - var7x);
               int var21 = Math.max(2, rfU_2.throws_(var15 / 0.25));
               int var22 = Math.max(2, rfU_2.throws_(var17 / 0.25));
               int var23 = Math.max(2, rfU_2.throws_(var19 / 0.25));

               for (int var24 = 0; var24 < var21; var24++) {
                  for (int var25 = 0; var25 < var22; var25++) {
                     for (int var26 = 0; var26 < var23; var26++) {
                        double var27 = ((double)var24 + 0.5) / (double)var21;
                        double var29 = ((double)var25 + 0.5) / (double)var22;
                        double var31 = ((double)var26 + 0.5) / (double)var23;
                        double var33 = var27 * var15 + var3x;
                        double var35 = var29 * var17 + var5x;
                        double var37 = var31 * var19 + var7x;
                        this.class_(
                           new nz_3(
                                 this.class_,
                                 (double)var1.b_() + var33,
                                 (double)var1.c_() + var35,
                                 (double)var1.d_() + var37,
                                 var27 - 0.5,
                                 var29 - 0.5,
                                 var31 - 0.5,
                                 var2
                              )
                              .class_(var1)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void class_(gm_3 var1) {
      this.class_ = var1;
      this.byte_.clear();
      this.protected_.clear();
   }

   private <T extends rLx_1> void class_(rLz_1<T> var1, CX<T> var2) {
      this.catch_.put(rVL.switch_.break_(var1), var2);
   }

   public void class_(CH var1) {
      if (var1 != null && (!(var1 instanceof Cr_1) || rrbb_3.b())) {
         this.private_.add(var1);
      }
   }

   private void class_(rAL var1, rqO_2 var2, Map<rqO_2, List<rqO_2>> var3) {
      rqO_2 var4 = new rqO_2(var2.byte_(), "particles/" + var2.break_() + ".json");

      try {
         try (
            rAF var5 = var1.class_(var4);
            InputStreamReader var6 = new InputStreamReader(var5.break_(), Charsets.UTF_8);
         ) {
            lc_3 var7 = lc_3.class_(rpY_2.class_(var6));
            List var8 = var7.class_();
            boolean var9 = this.implements_.containsKey(var2);
            if (var8 == null) {
               if (var9) {
                  throw new IllegalStateException("Missing texture list for particle " + var2);
               }
            } else {
               if (!var9) {
                  throw new IllegalStateException("Redundant texture list for particle " + var2);
               }

               var3.put(var2, var8.stream().map(var0 -> new rqO_2(var0.byte_(), "particle/" + var0.break_())).collect(Collectors.toList()));
            }
         }
      } catch (IOException var14) {
         throw new IllegalStateException("Failed to load description for particle " + var2, var14);
      }
   }

   public CH class_(rLx_1 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      CH var14 = this.break_(var1, var2, var4, var6, var8, var10, var12);
      if (var14 != null) {
         this.class_(var14);
         return var14;
      } else {
         return null;
      }
   }

   public void class_(an_3 var1, rLx_1 var2, int var3) {
      this.protected_.add(new nj_3(this.class_, var1, var2, var3));
   }

   public void class_(an_3 var1, rLx_1 var2) {
      this.protected_.add(new nj_3(this.class_, var1, var2));
   }

   public void class_(Ml_1 var1, Hd_1 var2, HQ var3, ly_3 var4, float var5, yt_3 var6) {
      var3.byte_();
      Runnable var7 = () -> {
         RenderSystem.enableAlphaTest();
         RenderSystem.defaultAlphaFunc();
         RenderSystem.enableDepthTest();
         RenderSystem.enableFog();
         if (rrxr_3.rb.byte_()) {
            RenderSystem.activeTexture(33986);
            RenderSystem.enableTexture();
            RenderSystem.activeTexture(33984);
         }
      };
      rXE var8 = var4.finally_();
      boolean var9 = var8.class_(rlG_2.break_);
      RenderSystem.pushMatrix();
      RenderSystem.multMatrix(var1.byte_().class_());
      Object var10 = break_;
      if (rrxr_3.rb.byte_()) {
         var10 = this.byte_.keySet();
      }

      for (CJ var12 : var10) {
         if (var12 != CJ.case_) {
            var7.run();
            Iterable var13 = this.byte_.get(var12);
            if (var13 != null) {
               RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
               yb_3 var14 = yb_3.class_();
               lD_2 var15 = var14.byte_();
               var12.class_(var15, this.throws_);

               for (CH var17 : var13) {
                  if (var6 == null || !var17.final_() || var6.class_(var17.volatile_())) {
                     try {
                        if (var9 || !(var17 instanceof lZ_2) || var17.finally_ != 0.0 || var17.extends_ != 0.0 || var17.native_ != 0.0) {
                           var17.class_(var15, var4, var5);
                        }
                     } catch (Throwable var21) {
                        KY var19 = KY.class_(var21, "Rendering Particle");
                        Ko_1 var20 = var19.class_("Particle being rendered");
                        var20.class_("Particle", var17::toString);
                        var20.class_("Particle Type", var12::toString);
                        throw new KU(var19);
                     }
                  }
               }

               var12.class_(var14);
            }
         }
      }

      RenderSystem.popMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.depthFunc(515);
      RenderSystem.disableBlend();
      RenderSystem.defaultAlphaFunc();
      var3.break_();
      RenderSystem.disableFog();
      RenderSystem.enableDepthTest();
   }

   public void class_(Ml_1 var1, Hd_1 var2, HQ var3, ly_3 var4, float var5) {
      this.class_(var1, var2, var3, var4, var5, null);
   }

   private <T extends rLx_1> void class_(rLz_1<T> var1, Cq_1<T> var2) {
      Cp_1 var3 = new Cp_1(this);
      this.implements_.put(rVL.switch_.break_(var1), var3);
      this.catch_.put(rVL.switch_.break_(var1), var2.create(var3));
   }

   private void class_(Collection<CH> var1) {
      if (!var1.isEmpty()) {
         long var2 = System.currentTimeMillis();
         int var4 = var1.size();
         Iterator var5 = var1.iterator();

         while (var5.hasNext()) {
            CH var6 = (CH)var5.next();
            this.break_(var6);
            if (!var6.native_()) {
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
               var8.finally_();
               var7.remove();
            }
         }
      }
   }

   @Override
   public CompletableFuture<Void> class_(rAu_1 var1, rAL var2, Executor var3, Executor var4) {
      ConcurrentMap var5 = Maps.newConcurrentMap();
      CompletableFuture[] var6 = rVL.switch_
         .protected_()
         .stream()
         .map(var4x -> CompletableFuture.runAsync(() -> this.class_(var2, var4x, var5), var3))
         .toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf(var6)
         .thenApplyAsync(var3x -> this.finally_.class_(var2, var5.values().stream().flatMap(Collection::stream), 0), var3)
         .thenCompose(var1::class_)
         .thenAcceptAsync(
            var2x -> {
               this.byte_.clear();
               this.finally_.class_(var2x);
               fj_3 var3x = this.finally_.break_(fQ_2.class_());
               var5.forEach(
                  (var2xx, var3xx) -> {
                     ImmutableList var4x = var3xx.isEmpty()
                        ? ImmutableList.of(var3x)
                        : var3xx.stream().map(this.finally_::break_).collect(ImmutableList.toImmutableList());
                     this.implements_.get(var2xx).class_(var4x);
                  }
               );
            },
            var4
         );
   }

   public void break_() {
      this.finally_.byte_();
   }

   private void break_(CH var1) {
      try {
         var1.case_();
      } catch (Throwable var5) {
         KY var3 = KY.class_(var5, "Ticking Particle");
         Ko_1 var4 = var3.class_("Particle being ticked");
         var4.class_("Particle", var1::toString);
         var4.class_("Particle Type", var1.class_()::toString);
         throw new KU(var3);
      }
   }

   private <T extends rLx_1> CH break_(T var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      CX var14 = this.catch_.get(rVL.switch_.break_(var1.protected_()));
      return var14 == null ? null : var14.class_(var1, this.class_, var2, var4, var6, var8, var10, var12);
   }

   private void throws_() {
      this.class_(rLQ.class_, lr_3::new);
      this.class_(rLQ.break_, CG::new);
      this.class_(rLQ.byte_, new Ao_1());
      this.class_(rLQ.protected_, new nQ_2());
      this.class_(rLQ.throws_, nP_2::new);
      this.class_(rLQ.O, Ai_1::new);
      this.class_(rLQ.b, nS_2::new);
      this.class_(rLQ.J, nE_2::new);
      this.class_(rLQ.x, nG_2::new);
      this.class_(rLQ.case_, nM_2::new);
      this.class_(rLQ.abstract_, lx_3::new);
      this.class_(rLQ.catch_, nJ_2::new);
      this.class_(rLQ.M, nk_3::new);
      this.class_(rLQ.private_, nX_2::new);
      this.class_(rLQ.implements_, nc_3::new);
      this.class_(rLQ.X, ld_3::new);
      this.class_(rLQ.finally_, nF_2::new);
      this.class_(rLQ.extends_, nl_3::new);
      this.class_(rLQ.native_, nI_2::new);
      this.class_(rLQ.volatile_, nA_2::new);
      this.class_(rLQ.final_, nT_2::new);
      this.class_(rLQ.package_, Cg_1::new);
      this.class_(rLQ.int_, lP_2::new);
      this.class_(rLQ.new_, new Cn_1());
      this.class_(rLQ.continue_, nx_3::new);
      this.class_(rLQ.super_, ng_3::new);
      this.class_(rLQ.this_, no_3::new);
      this.class_(rLQ.else_, lS_2::new);
      this.class_(rLQ.synchronized_, new CO());
      this.class_(rLQ.return_, Cu_1::new);
      this.class_(rLQ.public_, nD_2::new);
      this.class_(rLQ.goto_, CP::new);
      this.class_(rLQ.while_, ln_3::new);
      this.class_(rLQ.try_, Cs_1::new);
      this.class_(rLQ.throw_, Ca_1::new);
      this.class_(rLQ.instanceof_, Cs_1::new);
      this.class_(rLQ.interface_, ni_3::new);
      this.class_(rLQ.char_, lW_2::new);
      this.class_(rLQ.long_, Cb_1::new);
      this.class_(rLQ.float_, lB_2::new);
      this.class_(rLQ.void_, new AD());
      this.class_(rLQ.static_, new AU());
      this.class_(rLQ.import_, new Ae_1());
      this.class_(rLQ.short_, CZ::new);
      this.class_(rLQ.default_, CF::new);
      this.class_(rLQ.const_, lk_3::new);
      this.class_(rLQ.h, nR_2::new);
      this.class_(rLQ.strictfp_, Cl_1::new);
      this.class_(rLQ.boolean_, Ct_1::new);
      this.class_(rLQ.transient_, CI::new);
      this.class_(rLQ.for_, Cj_1::new);
      this.class_(rLQ.double_, CU::new);
      this.class_(rLQ.switch_, nO_2::new);
      this.class_(rLQ.r, lG_2::new);
      this.class_(rLQ.B, lQ_2::new);
      this.class_(rLQ.S, lm_3::new);
      this.class_(rLQ.P, lX_2::new);
      this.class_(rLQ.s, lF_2::new);
      this.class_(rLQ.E, lM_2::new);
      this.class_(rLQ.G, ls_3::new);
      this.class_(rLQ.d, nZ_2::new);
      this.class_(rLQ.k, nn_3::new);
      this.class_(rLQ.W, nw_3::new);
      this.class_(rLQ.z, ny_3::new);
      this.class_(rLQ.Q, AR::new);
      this.class_(rLQ.N, lv_3::new);
      this.class_(rLQ.c, lL_2::new);
      this.class_(rLQ.u, nL_2::new);
      this.class_(rLQ.m, nq_3::new);
      this.class_(rLQ.Z, nf_3::new);
      this.class_(rLQ.v, CY::new);
      this.class_(rLQ.F, ll_3::new);
   }

   public String protected_() {
      return String.valueOf(this.byte_.values().stream().mapToInt(Collection::size).sum());
   }
}
