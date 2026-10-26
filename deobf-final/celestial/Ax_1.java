package celestial;

import com.mojang.datafixers.util.Pair;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;

public class Ax_1 {
   private final QY catch_;
   private final Aq_1 private_;
   private rfH_2 implements_ = new rfH_2(-1, -1, -1);
   private rdn_3 finally_ = rdn_3.break_;
   public float class_;
   private float extends_;
   private int native_;
   private boolean volatile_;
   private rRl_1 final_ = rRl_1.SURVIVAL;
   private rRl_1 package_ = rRl_1.NOT_SET;
   private final Object2ObjectLinkedOpenHashMap<Pair<rfH_2, rZM>, rjU_2> int_ = new Object2ObjectLinkedOpenHashMap();
   public int break_;
   public long byte_;
   public long protected_;
   public long throws_;
   public long case_;

   private void byte_(rhd_3 var1, an_3 var2, boolean var3) {
      this.new_();
      if (rrjA_2.protected_().throws_().protected_(ProtocolVersion.v1_8)) {
         if (var3) {
            var1.class_(rpm_3.MAIN_HAND);
         }

         this.private_.class_(new rZq_1(var2, var1.h()));
      } else {
         this.private_.class_(new rZq_1(var2, var1.h()));
         if (var3) {
            var1.class_(rpm_3.MAIN_HAND);
         }
      }

      if (this.final_ != rRl_1.SPECTATOR) {
         var1.throw_(var2);
         var1.sg();
      }
   }

   public float byte_() {
      return this.final_.throws_() ? 5.0F : 4.5F;
   }

   public void byte_(rhd_3 var1) {
      this.new_();
      this.private_.class_(new rZb_1(rZM.RELEASE_USE_ITEM, rfH_2.protected_, rpr_3.DOWN));
      var1.SC();
   }

   public void byte_(int var1) {
      this.native_ = var1;
   }

   public void int_() {
      if (!((cb_3)this.catch_.class_[57]).native_()) {
         this.new_();
         ((Aq_1)((cb_3)this.catch_.class_[57]).break_[0]).class_(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.protected_, rpr_3.DOWN));
      }
   }

   public Ax_1(QY var1, Aq_1 var2) {
      this.catch_ = var1;
      this.private_ = var2;
      rme_3.class_ = 0;
   }

   public void class_(int var1, rkw_3<?> var2, boolean var3) {
      this.private_.class_(new rZE(var1, var2, var3));
   }

   public void class_(int var1, int var2) {
      this.private_.class_(new rmK_2(var1, var2));
   }

   public void class_(rdn_3 var1, int var2) {
      if (this.final_.throws_()) {
         this.private_.class_(new rmR_2(var2, var1));
      }
   }

   public void class_(rdn_3 var1) {
      if (this.final_.throws_() && !var1.class_()) {
         this.private_.class_(new rmR_2(-1, var1));
      }
   }

   public ryZ_2 class_(rhd_3 var1, an_3 var2, rpm_3 var3) {
      this.new_();
      if (var2 instanceof iB_2 var4 && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLe_1.class_(var4, var3)).byte_()) {
         return ryZ_2.PASS;
      }

      this.private_.class_(new rZq_1(var2, var3, var1.h()));
      return this.final_ == rRl_1.SPECTATOR ? ryZ_2.PASS : var1.class_(var2, var3);
   }

   public ryZ_2 class_(rhd_3 var1, an_3 var2, rfo_3 var3, rpm_3 var4) {
      this.new_();
      if (var2 instanceof iB_2 var5 && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLe_1.class_(var5, var4)).byte_()) {
         return ryZ_2.PASS;
      }

      rjU_2 var6 = var3.case_().class_(var2.rx(), var2.re(), var2.BO());
      this.private_.class_(new rZq_1(var2, var4, var6, var1.h()));
      return this.final_ == rRl_1.SPECTATOR ? ryZ_2.PASS : var2.class_(var1, var6, var4);
   }

   public void class_(int var1, int var2, int var3, rXa_1 var4, boolean var5) {
      if (!rrAK.break_(var1, var2, var3, var4).byte_()) {
         short var6 = ((rJr_1)((cb_3)this.catch_.class_[57]).implements_[4]).class_((rhz_3)((cb_3)this.catch_.class_[57]).implements_[1]);
         rdn_3 var7 = ((rJr_1)((cb_3)this.catch_.class_[57]).implements_[4]).class_(var2, var3, var4, (cb_3)this.catch_.class_[57]);
         rdn_3 var8 = var5 && var4.class_() ? new rdn_3(rdy_3.class_) : var7;
         this.private_.class_(new rmt_3(var1, var2, var3, var4, var8, var6));
         rrAg_1.break_(var1, var2, var3, var6, var4, var7);
      }
   }

   public void class_(int var1, int var2, int var3, rXa_1 var4) {
      this.class_(var1, var2, var3, var4, new rdn_3(rdy_3.class_));
   }

   public void class_(gm_3 var1, rfH_2 var2, xc_3 var3, rZM var4, boolean var5) {
      rjU_2 var6 = (rjU_2)this.int_.remove(Pair.of(var2, var4));
      xc_3 var7 = var1.byte_(var2);
      if ((var6 == null || !var5 || var4 != rZM.START_DESTROY_BLOCK && var7 != var3) && var7 != var3) {
         var1.class_(var2, var3);
         cb_3 var8 = (cb_3)this.catch_.class_[57];
         if (var6 != null && var1 == (rYB)var8.throws_[7] && var8.class_(var2, var3)) {
            var8.package_(var6.break_, var6.byte_, var6.protected_);
         }
      }

      while (this.int_.size() >= 50) {
         this.int_.removeFirst();
      }
   }

   public void class_(boolean var1) {
      this.volatile_ = var1;
   }

   public void class_(rhd_3 var1) {
      this.final_.class_((rhx_3)var1.implements_[18]);
   }

   public void class_(int var1, int var2, int var3, rXa_1 var4, rdn_3 var5) {
      short var6 = ((rJr_1)((cb_3)this.catch_.class_[57]).implements_[4]).class_((rhz_3)((cb_3)this.catch_.class_[57]).implements_[1]);
      this.private_.class_(new rmt_3(var1, var2, var3, var4, var5, var6));
   }

   private void class_(rZM var1, rfH_2 var2, rpr_3 var3) {
      cb_3 var4 = (cb_3)this.catch_.class_[57];
      this.int_.put(Pair.of(var2, var1), var4.Ps());
      this.private_.class_(new rZb_1(var1, var2, var3));
   }

   public void class_(int var1) {
      this.private_.class_(new rZs_1(var1));
      this.protected_ = System.currentTimeMillis();
   }

   public void class_(rRl_1 var1) {
      this.package_ = var1;
   }

   public cb_3 class_(gm_3 var1, rlP_2 var2, VR var3) {
      return this.class_(var1, var2, var3, false, false);
   }

   public ryZ_2 class_(rpm_3 var1) {
      if (this.final_ == rRl_1.SPECTATOR) {
         return ryZ_2.PASS;
      } else {
         cb_3 var2 = (cb_3)this.catch_.class_[57];
         this.new_();
         rdn_3 var3 = var2.protected_(var1);
         boolean var4 = var2.sK().class_(var3.break_());
         boolean var5 = (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2] && var3.break_() == rdy_3.kU;
         if (var4 && var5 && rxm_3.protected_(var3)) {
            return ryZ_2.PASS;
         } else {
            if (rrjA_2.protected_().throws_().byte_(ProtocolVersion.v1_17_1)) {
               this.private_.class_(new rZX(var2.rx(), var2.re(), var2.BO(), (Float)var2.throws_[15], (Float)var2.throws_[16], var2.BL()));
            }

            this.private_.class_(new rZd_1(var1));
            if (var4 && !var5) {
               return ryZ_2.PASS;
            } else {
               rym_3 var6 = var3.class_((gm_3)this.catch_.class_[56], var2, var1);
               rdn_3 var7 = (rdn_3)var6.break_();
               if (var7 != var3) {
                  var2.class_(var1, var7);
               }

               return var6.class_();
            }
         }
      }
   }

   public ryZ_2 class_(cb_3 var1, gm_3 var2, rpm_3 var3, rff_3 var4) {
      rfH_2 var5 = var4.class_();
      this.new_();
      if (!((gm_3)this.catch_.class_[56]).instanceof_().class_(var5)) {
         return ryZ_2.FAIL;
      } else {
         rdn_3 var6 = var1.protected_(var3);
         xd_3 var7 = rrjc_3.protected_(var5);
         if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAR.class_(var6, var4, var7, var3)).byte_()) {
            return ryZ_2.PASS;
         } else if (this.final_ == rRl_1.SPECTATOR) {
            this.private_.class_(new rZx_1(var3, var4));
            return ryZ_2.SUCCESS;
         } else {
            boolean var8 = !var1.ss().class_() || !var1.Sn().class_();
            boolean var9 = var1.sN() && var8;
            if (!var9) {
               ryZ_2 var10 = var2.byte_(var5).class_(var2, var1, var3, var4);
               if (var1.sK().class_(var6.break_())) {
                  return ryZ_2.PASS;
               }

               if (var10.class_()) {
                  this.private_.class_(new rZx_1(var3, var4));
                  return var10;
               }
            }

            this.private_.class_(new rZx_1(var3, var4));
            if (!var6.class_() && !var1.sK().class_(var6.break_())) {
               rdH_2 var13 = new rdH_2(var1, var3, var4);
               ryZ_2 var11;
               if (this.final_.throws_()) {
                  int var12 = var6.char_();
                  var11 = var6.class_(var13);
                  var6.throws_(var12);
               } else {
                  var11 = var6.class_(var13);
               }

               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAI.class_(var6, var5, var7, var11));
               return var11;
            } else {
               return ryZ_2.PASS;
            }
         }
      }
   }

   public boolean class_(rfH_2 var1, rpr_3 var2, boolean var3) {
      rrLp_1 var4 = rrLp_1.class_(
         (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[0],
         var1,
         var2,
         ((rhz_3)((cb_3)this.catch_.class_[57]).implements_[1]).class_.get(((rhz_3)((cb_3)this.catch_.class_[57]).implements_[1]).protected_),
         5
      );
      if (var4.byte_()) {
         return false;
      } else if (((cb_3)this.catch_.class_[57]).class_((gm_3)this.catch_.class_[56], var1, this.final_)) {
         return false;
      } else if (!((gm_3)this.catch_.class_[56]).instanceof_().class_(var1)) {
         return false;
      } else {
         if (this.final_.throws_()) {
            this.class_(rZM.START_DESTROY_BLOCK, var1, var2);
            this.class_(var1, var3);
            this.native_ = var4.break_();
         } else if (!this.volatile_ || !this.class_(var1)) {
            if (this.volatile_) {
               this.class_(rZM.ABORT_DESTROY_BLOCK, this.implements_, var2);
            }

            xc_3 var5 = ((gm_3)this.catch_.class_[56]).byte_(var1);
            this.class_(rZM.START_DESTROY_BLOCK, var1, var2);
            boolean var6 = !var5.catch_();
            if (var6 && this.class_ == 0.0F) {
               var5.class_((gm_3)this.catch_.class_[56], var1, (cb_3)this.catch_.class_[57]);
            }

            if (var6 && var5.class_((cb_3)this.catch_.class_[57], (rYB)((cb_3)this.catch_.class_[57]).throws_[7], var1) >= 1.0F) {
               this.class_(var1, var3);
               rrLp_1.class_(
                  (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2],
                  var1,
                  var2,
                  ((rhz_3)((cb_3)this.catch_.class_[57]).implements_[1]).class_.get(((rhz_3)((cb_3)this.catch_.class_[57]).implements_[1]).protected_),
                  5
               );
            } else {
               this.volatile_ = true;
               this.implements_ = var1;
               this.finally_ = ((cb_3)this.catch_.class_[57]).ss();
               this.class_ = 0.0F;
               this.extends_ = 0.0F;
               ((gm_3)this.catch_.class_[56]).class_(((cb_3)this.catch_.class_[57]).V(), this.implements_, (int)(this.class_ * 10.0F) - 1);
            }
         }

         return true;
      }
   }

   private boolean class_(rfH_2 var1) {
      rdn_3 var2 = ((cb_3)this.catch_.class_[57]).ss();
      boolean var3 = this.finally_.class_() && var2.class_();
      if (!this.finally_.class_() && !var2.class_()) {
         var3 = var2.break_() == this.finally_.break_() && rdn_3.class_(var2, this.finally_) && (var2.throws_() || var2.catch_() == this.finally_.catch_());
      }

      return var1.equals(this.implements_) && var3;
   }

   public boolean class_(rfH_2 var1, boolean var2) {
      if (((cb_3)this.catch_.class_[57]).class_((gm_3)this.catch_.class_[56], var1, this.final_)) {
         return false;
      } else {
         gm_3 var3 = (gm_3)this.catch_.class_[56];
         xc_3 var4 = var3.byte_(var1);
         if (!((cb_3)this.catch_.class_[57]).ss().break_().class_(var4, var3, var1, (cb_3)this.catch_.class_[57])) {
            return false;
         } else {
            xd_3 var5 = var4.break_();
            if ((var5 instanceof xK_2 || var5 instanceof zx_3 || var5 instanceof kW_2) && !((cb_3)this.catch_.class_[57]).sU()) {
               return false;
            } else if (var4.catch_()) {
               return false;
            } else {
               var5.class_(var3, var1, var4, (cb_3)this.catch_.class_[57]);
               rXE var6 = var3.break_(var1);
               boolean var7 = var2 && var3.class_(var1, var6.catch_(), 11);
               if (var7) {
                  var5.class_((rRg_1)var3, var1, var4);
               }

               return false;
            }
         }
      }
   }

   public void class_(rhd_3 var1, an_3 var2, boolean var3) {
      rrFj_1 var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrFj_1.class_(var2));
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var4);
      if (!var4.byte_()) {
         this.byte_(var1, var2, var3);
         rrFf_1 var5 = rrFf_1.class_(var2);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var5);
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var5);
      }
   }

   public boolean class_() {
      return this.final_.case_();
   }

   public cb_3 class_(gm_3 var1, rlP_2 var2, VR var3, boolean var4, boolean var5) {
      return new cb_3(this.catch_, var1, this.private_, var2, var3, var4, var5);
   }

   public boolean break_(rfH_2 var1, rpr_3 var2, boolean var3) {
      rrLp_1 var4 = rrLp_1.class_(
         (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[1],
         var1,
         var2,
         ((rhz_3)((cb_3)this.catch_.class_[57]).implements_[1]).class_.get(((rhz_3)((cb_3)this.catch_.class_[57]).implements_[1]).protected_),
         5
      );
      if (var4.byte_()) {
         return false;
      } else {
         this.new_();
         if (this.native_ > 0) {
            this.native_--;
            return true;
         } else if (this.final_.throws_() && ((gm_3)this.catch_.class_[56]).instanceof_().class_(var1)) {
            this.native_ = var4.break_();
            this.class_(rZM.START_DESTROY_BLOCK, var1, var2);
            this.class_(var1, var3);
            rrLp_1.class_(
               (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2],
               var1,
               var2,
               ((rhz_3)((cb_3)this.catch_.class_[57]).implements_[1]).class_.get(((rhz_3)((cb_3)this.catch_.class_[57]).implements_[1]).protected_),
               5
            );
            return true;
         } else if (this.class_(var1)) {
            xc_3 var5 = ((gm_3)this.catch_.class_[56]).byte_(var1);
            if (var5.catch_()) {
               this.volatile_ = false;
               return false;
            } else {
               this.class_ = this.class_ + var5.class_((cb_3)this.catch_.class_[57], (rYB)((cb_3)this.catch_.class_[57]).throws_[7], var1);
               if (this.extends_ % 4.0F == 0.0F) {
                  zr_3 var6 = var5.package_();
                  this.catch_.c().class_(new Np_1(var6.case_(), rqL_2.BLOCKS, (var6.class_() + 1.0F) / 8.0F, var6.break_() * 0.5F, var1));
               }

               this.extends_++;
               rrLT var7 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLT.class_(1.0F));
               if (this.class_ >= var7.class_()) {
                  rrLp_1.class_(
                     (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2],
                     var1,
                     var2,
                     ((rhz_3)((cb_3)this.catch_.class_[57]).implements_[1]).class_.get(((rhz_3)((cb_3)this.catch_.class_[57]).implements_[1]).protected_),
                     var4.break_()
                  );
                  this.volatile_ = false;
                  this.class_(rZM.STOP_DESTROY_BLOCK, var1, var2);
                  this.class_(var1, var3);
                  this.class_ = 0.0F;
                  this.extends_ = 0.0F;
                  this.native_ = var4.break_();
               }

               ((gm_3)this.catch_.class_[56]).class_(((cb_3)this.catch_.class_[57]).V(), this.implements_, (int)(this.class_ * 10.0F) - 1);
               return true;
            }
         } else {
            return this.class_(var1, var2, var3);
         }
      }
   }

   public void break_(int var1) {
      this.private_.break_(new rZs_1(var1));
   }

   public void break_(rhd_3 var1, an_3 var2, boolean var3) {
      this.byte_(var1, var2, var3);
   }

   public ryZ_2 break_(cb_3 var1, gm_3 var2, rpm_3 var3, rff_3 var4) {
      rfH_2 var5 = var4.class_();
      this.new_();
      if (!((gm_3)this.catch_.class_[56]).instanceof_().class_(var5)) {
         return ryZ_2.FAIL;
      } else {
         rdn_3 var6 = var1.protected_(var3);
         if (this.final_ == rRl_1.SPECTATOR) {
            this.private_.class_(new rZx_1(var3, var4));
            return ryZ_2.SUCCESS;
         } else {
            boolean var7 = !var1.ss().class_() || !var1.Sn().class_();
            boolean var8 = var1.sN() && var7;
            if (!var8) {
               ryZ_2 var9 = var2.byte_(var5).class_(var2, var1, var3, var4);
               if (var1.sK().class_(var6.break_())) {
                  return ryZ_2.PASS;
               }

               if (var9.class_()) {
                  this.private_.class_(new rZx_1(var3, var4));
                  return var9;
               }
            }

            this.private_.class_(new rZx_1(var3, var4));
            if (!var6.class_() && !var1.sK().class_(var6.break_())) {
               rdH_2 var12 = new rdH_2(var1, var3, var4);
               ryZ_2 var10;
               if (this.final_.throws_()) {
                  int var11 = var6.char_();
                  var10 = var6.class_(var12);
                  var6.throws_(var11);
               } else {
                  var10 = var6.class_(var12);
               }

               return var10;
            } else {
               return ryZ_2.PASS;
            }
         }
      }
   }

   public void break_(rRl_1 var1) {
      if (var1 != this.final_) {
         this.package_ = this.final_;
      }

      this.final_ = var1;
      this.final_.class_((rhx_3)((cb_3)this.catch_.class_[57]).implements_[18]);
   }

   public void break_(rhd_3 var1) {
      this.new_();
      rpm_3 var2 = ((cb_3)this.catch_.class_[57]).P();
      rdn_3 var3 = ((cb_3)this.catch_.class_[57]).sX();
      if (var1 != (cb_3)this.catch_.class_[57]
         || !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .finally_()
            .class_(rrAC.class_((Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0], var3, var2))
            .byte_()) {
         this.private_.class_(new rZb_1(rZM.RELEASE_USE_ITEM, rfH_2.protected_, rpr_3.DOWN));
         var1.SC();
         if (var1 == (cb_3)this.catch_.class_[57]) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
               .finally_()
               .class_(rrAC.class_((Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1], var3, var2));
         }
      }
   }

   public void break_() {
      if (this.volatile_) {
         this.class_(rZM.ABORT_DESTROY_BLOCK, this.implements_, rpr_3.DOWN);
         this.class_ = 0.0F;
         ((gm_3)this.catch_.class_[56]).class_(((cb_3)this.catch_.class_[57]).V(), this.implements_, -1);
         ((cb_3)this.catch_.class_[57]).sg();
         this.volatile_ = false;
      }
   }

   public void break_(int var1, int var2, int var3, rXa_1 var4, boolean var5) {
      short var6 = ((rJr_1)((cb_3)this.catch_.class_[57]).implements_[4]).class_((rhz_3)((cb_3)this.catch_.class_[57]).implements_[1]);
      rdn_3 var7 = ((rJr_1)((cb_3)this.catch_.class_[57]).implements_[4]).class_(var2, var3, var4, (cb_3)this.catch_.class_[57]);
      rdn_3 var8 = var5 && var4.class_() ? new rdn_3(rdy_3.class_) : var7;
      this.private_.class_(new rmt_3(var1, var2, var3, var4, var8, var6));
   }

   public boolean throws_() {
      return this.final_.case_();
   }

   public boolean finally_() {
      return this.final_ == rRl_1.SPECTATOR;
   }

   public boolean catch_() {
      return this.final_.throws_();
   }

   public rRl_1 extends_() {
      return this.package_;
   }

   public boolean case_() {
      return !this.final_.throws_();
   }

   public boolean implements_() {
      return ((cb_3)this.catch_.class_[57]).Pm() && ((cb_3)this.catch_.class_[57]).ra() instanceof rOD;
   }

   private void new_() {
      int var1 = ((rhz_3)((cb_3)this.catch_.class_[57]).implements_[1]).protected_;
      if (var1 != this.break_ && rme_3.class_ != var1) {
         this.break_ = var1;
         this.private_.class_(new rme_3(this.break_));
         this.protected_ = System.currentTimeMillis();
      }
   }

   public void package_() {
      this.new_();
   }

   public void protected_() {
      this.new_();
      if (this.private_.class_().case_()) {
         this.private_.class_().class_();
      } else {
         this.private_.class_().native_();
      }
   }

   public boolean private_() {
      return this.final_.throws_();
   }

   public rfH_2 final_() {
      return this.implements_;
   }

   public boolean volatile_() {
      return this.volatile_;
   }

   public rRl_1 native_() {
      return this.final_;
   }
}
