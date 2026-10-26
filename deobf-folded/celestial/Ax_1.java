package celestial;

import com.mojang.datafixers.util.Pair;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;

public class Ax_1 {
   private final QY id_catch;
   private final Aq_1 id_private;
   private rfH_2 id_implements = new rfH_2(-1, -1, -1);
   private rdn_3 id_finally = rdn_3.id_break;
   public float id_class;
   private float id_extends;
   private int id_native;
   private boolean id_volatile;
   private rRl_1 id_final = rRl_1.SURVIVAL;
   private rRl_1 id_package = rRl_1.NOT_SET;
   private final Object2ObjectLinkedOpenHashMap<Pair<rfH_2, rZM>, rjU_2> id_int = new Object2ObjectLinkedOpenHashMap();
   public int id_break;
   public long id_byte;
   public long id_protected;
   public long id_throws;
   public long id_case;

   private void id_byte(rhd_3 var1, an_3 var2, boolean var3) {
      this.id_new();
      if (rrjA_2.id_protected().id_throws().id_protected(ProtocolVersion.v1_8)) {
         if (var3) {
            var1.id_class(rpm_3.MAIN_HAND);
         }

         this.id_private.id_class(new rZq_1(var2, var1.h()));
      } else {
         this.id_private.id_class(new rZq_1(var2, var1.h()));
         if (var3) {
            var1.id_class(rpm_3.MAIN_HAND);
         }
      }

      if (this.id_final != rRl_1.SPECTATOR) {
         var1.id_throw(var2);
         var1.sg();
      }
   }

   public float id_byte() {
      return this.id_final.id_throws() ? 5.0F : 4.5F;
   }

   public void id_byte(rhd_3 var1) {
      this.id_new();
      this.id_private.id_class(new rZb_1(rZM.RELEASE_USE_ITEM, rfH_2.id_protected, rpr_3.DOWN));
      var1.SC();
   }

   public void id_byte(int var1) {
      this.id_native = var1;
   }

   public void id_int() {
      if (!((cb_3)this.id_catch.id_class[57]).id_native()) {
         this.id_new();
         ((Aq_1)((cb_3)this.id_catch.id_class[57]).id_break[0]).id_class(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.id_protected, rpr_3.DOWN));
      }
   }

   public Ax_1(QY var1, Aq_1 var2) {
      this.id_catch = var1;
      this.id_private = var2;
      rme_3.id_class = 0;
   }

   public void id_class(int var1, rkw_3<?> var2, boolean var3) {
      this.id_private.id_class(new rZE(var1, var2, var3));
   }

   public void id_class(int var1, int var2) {
      this.id_private.id_class(new rmK_2(var1, var2));
   }

   public void id_class(rdn_3 var1, int var2) {
      if (this.id_final.id_throws()) {
         this.id_private.id_class(new rmR_2(var2, var1));
      }
   }

   public void id_class(rdn_3 var1) {
      if (this.id_final.id_throws() && !var1.id_class()) {
         this.id_private.id_class(new rmR_2(-1, var1));
      }
   }

   public ryZ_2 id_class(rhd_3 var1, an_3 var2, rpm_3 var3) {
      this.id_new();
      if (var2 instanceof iB_2 var4
         && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLe_1.id_class(var4, var3)).id_byte()) {
         return ryZ_2.PASS;
      }

      this.id_private.id_class(new rZq_1(var2, var3, var1.h()));
      return this.id_final == rRl_1.SPECTATOR ? ryZ_2.PASS : var1.id_class(var2, var3);
   }

   public ryZ_2 id_class(rhd_3 var1, an_3 var2, rfo_3 var3, rpm_3 var4) {
      this.id_new();
      if (var2 instanceof iB_2 var5
         && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLe_1.id_class(var5, var4)).id_byte()) {
         return ryZ_2.PASS;
      }

      rjU_2 var6 = var3.id_case().id_class(var2.rx(), var2.re(), var2.BO());
      this.id_private.id_class(new rZq_1(var2, var4, var6, var1.h()));
      return this.id_final == rRl_1.SPECTATOR ? ryZ_2.PASS : var2.id_class(var1, var6, var4);
   }

   public void id_class(int var1, int var2, int var3, rXa_1 var4, boolean var5) {
      if (!rrAK.id_break(var1, var2, var3, var4).id_byte()) {
         short var6 = ((rJr_1)((cb_3)this.id_catch.id_class[57]).id_implements[4]).id_class((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]);
         rdn_3 var7 = ((rJr_1)((cb_3)this.id_catch.id_class[57]).id_implements[4]).id_class(var2, var3, var4, (cb_3)this.id_catch.id_class[57]);
         rdn_3 var8 = var5 && var4.id_class() ? new rdn_3(rdy_3.id_class) : var7;
         this.id_private.id_class(new rmt_3(var1, var2, var3, var4, var8, var6));
         rrAg_1.id_break(var1, var2, var3, var6, var4, var7);
      }
   }

   public void id_class(int var1, int var2, int var3, rXa_1 var4) {
      this.id_class(var1, var2, var3, var4, new rdn_3(rdy_3.id_class));
   }

   public void id_class(gm_3 var1, rfH_2 var2, xc_3 var3, rZM var4, boolean var5) {
      rjU_2 var6 = (rjU_2)this.id_int.remove(Pair.of(var2, var4));
      xc_3 var7 = var1.id_byte(var2);
      if ((var6 == null || !var5 || var4 != rZM.START_DESTROY_BLOCK && var7 != var3) && var7 != var3) {
         var1.id_class(var2, var3);
         cb_3 var8 = (cb_3)this.id_catch.id_class[57];
         if (var6 != null && var1 == (rYB)var8.id_throws[7] && var8.id_class(var2, var3)) {
            var8.id_package(var6.id_break, var6.id_byte, var6.id_protected);
         }
      }

      while (this.id_int.size() >= 50) {
         this.id_int.removeFirst();
      }
   }

   public void id_class(boolean var1) {
      this.id_volatile = var1;
   }

   public void id_class(rhd_3 var1) {
      this.id_final.id_class((rhx_3)var1.id_implements[18]);
   }

   public void id_class(int var1, int var2, int var3, rXa_1 var4, rdn_3 var5) {
      short var6 = ((rJr_1)((cb_3)this.id_catch.id_class[57]).id_implements[4]).id_class((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]);
      this.id_private.id_class(new rmt_3(var1, var2, var3, var4, var5, var6));
   }

   private void id_class(rZM var1, rfH_2 var2, rpr_3 var3) {
      cb_3 var4 = (cb_3)this.id_catch.id_class[57];
      this.id_int.put(Pair.of(var2, var1), var4.Ps());
      this.id_private.id_class(new rZb_1(var1, var2, var3));
   }

   public void id_class(int var1) {
      this.id_private.id_class(new rZs_1(var1));
      this.id_protected = System.currentTimeMillis();
   }

   public void id_class(rRl_1 var1) {
      this.id_package = var1;
   }

   public cb_3 id_class(gm_3 var1, rlP_2 var2, VR var3) {
      return this.id_class(var1, var2, var3, false, false);
   }

   public ryZ_2 id_class(rpm_3 var1) {
      if (this.id_final == rRl_1.SPECTATOR) {
         return ryZ_2.PASS;
      } else {
         cb_3 var2 = (cb_3)this.id_catch.id_class[57];
         this.id_new();
         rdn_3 var3 = var2.id_protected(var1);
         boolean var4 = var2.sK().id_class(var3.id_break());
         boolean var5 = (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2] && var3.id_break() == rdy_3.kU;
         if (var4 && var5 && rxm_3.id_protected(var3)) {
            return ryZ_2.PASS;
         } else {
            if (rrjA_2.id_protected().id_throws().id_byte(ProtocolVersion.v1_17_1)) {
               this.id_private.id_class(new rZX(var2.rx(), var2.re(), var2.BO(), (Float)var2.id_throws[15], (Float)var2.id_throws[16], var2.BL()));
            }

            this.id_private.id_class(new rZd_1(var1));
            if (var4 && !var5) {
               return ryZ_2.PASS;
            } else {
               rym_3 var6 = var3.id_class((gm_3)this.id_catch.id_class[56], var2, var1);
               rdn_3 var7 = (rdn_3)var6.id_break();
               if (var7 != var3) {
                  var2.id_class(var1, var7);
               }

               return var6.id_class();
            }
         }
      }
   }

   public ryZ_2 id_class(cb_3 var1, gm_3 var2, rpm_3 var3, rff_3 var4) {
      rfH_2 var5 = var4.id_class();
      this.id_new();
      if (!((gm_3)this.id_catch.id_class[56]).id_instanceof().id_class(var5)) {
         return ryZ_2.FAIL;
      } else {
         rdn_3 var6 = var1.id_protected(var3);
         xd_3 var7 = rrjc_3.id_protected(var5);
         if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAR.id_class(var6, var4, var7, var3)).id_byte()) {
            return ryZ_2.PASS;
         } else if (this.id_final == rRl_1.SPECTATOR) {
            this.id_private.id_class(new rZx_1(var3, var4));
            return ryZ_2.SUCCESS;
         } else {
            boolean var8 = !var1.ss().id_class() || !var1.Sn().id_class();
            boolean var9 = var1.sN() && var8;
            if (!var9) {
               ryZ_2 var10 = var2.id_byte(var5).id_class(var2, var1, var3, var4);
               if (var1.sK().id_class(var6.id_break())) {
                  return ryZ_2.PASS;
               }

               if (var10.id_class()) {
                  this.id_private.id_class(new rZx_1(var3, var4));
                  return var10;
               }
            }

            this.id_private.id_class(new rZx_1(var3, var4));
            if (!var6.id_class() && !var1.sK().id_class(var6.id_break())) {
               rdH_2 var13 = new rdH_2(var1, var3, var4);
               ryZ_2 var11;
               if (this.id_final.id_throws()) {
                  int var12 = var6.id_char();
                  var11 = var6.id_class(var13);
                  var6.id_throws(var12);
               } else {
                  var11 = var6.id_class(var13);
               }

               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAI.id_class(var6, var5, var7, var11));
               return var11;
            } else {
               return ryZ_2.PASS;
            }
         }
      }
   }

   public boolean id_class(rfH_2 var1, rpr_3 var2, boolean var3) {
      rrLp_1 var4 = rrLp_1.id_class(
         (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[0],
         var1,
         var2,
         ((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_class.get(((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_protected),
         5
      );
      if (var4.id_byte()) {
         return false;
      } else if (((cb_3)this.id_catch.id_class[57]).id_class((gm_3)this.id_catch.id_class[56], var1, this.id_final)) {
         return false;
      } else if (!((gm_3)this.id_catch.id_class[56]).id_instanceof().id_class(var1)) {
         return false;
      } else {
         if (this.id_final.id_throws()) {
            this.id_class(rZM.START_DESTROY_BLOCK, var1, var2);
            this.id_class(var1, var3);
            this.id_native = var4.id_break();
         } else if (!this.id_volatile || !this.id_class(var1)) {
            if (this.id_volatile) {
               this.id_class(rZM.ABORT_DESTROY_BLOCK, this.id_implements, var2);
            }

            xc_3 var5 = ((gm_3)this.id_catch.id_class[56]).id_byte(var1);
            this.id_class(rZM.START_DESTROY_BLOCK, var1, var2);
            boolean var6 = !var5.id_catch();
            if (var6 && this.id_class == 0.0F) {
               var5.id_class((gm_3)this.id_catch.id_class[56], var1, (cb_3)this.id_catch.id_class[57]);
            }

            if (var6 && var5.id_class((cb_3)this.id_catch.id_class[57], (rYB)((cb_3)this.id_catch.id_class[57]).id_throws[7], var1) >= 1.0F) {
               this.id_class(var1, var3);
               rrLp_1.id_class(
                  (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2],
                  var1,
                  var2,
                  ((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1])
                     .id_class
                     .get(((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_protected),
                  5
               );
            } else {
               this.id_volatile = true;
               this.id_implements = var1;
               this.id_finally = ((cb_3)this.id_catch.id_class[57]).ss();
               this.id_class = 0.0F;
               this.id_extends = 0.0F;
               ((gm_3)this.id_catch.id_class[56]).id_class(((cb_3)this.id_catch.id_class[57]).V(), this.id_implements, (int)(this.id_class * 10.0F) - 1);
            }
         }

         return true;
      }
   }

   private boolean id_class(rfH_2 var1) {
      rdn_3 var2 = ((cb_3)this.id_catch.id_class[57]).ss();
      boolean var3 = this.id_finally.id_class() && var2.id_class();
      if (!this.id_finally.id_class() && !var2.id_class()) {
         var3 = var2.id_break() == this.id_finally.id_break()
            && rdn_3.id_class(var2, this.id_finally)
            && (var2.id_throws() || var2.id_catch() == this.id_finally.id_catch());
      }

      return var1.equals(this.id_implements) && var3;
   }

   public boolean id_class(rfH_2 var1, boolean var2) {
      if (((cb_3)this.id_catch.id_class[57]).id_class((gm_3)this.id_catch.id_class[56], var1, this.id_final)) {
         return false;
      } else {
         gm_3 var3 = (gm_3)this.id_catch.id_class[56];
         xc_3 var4 = var3.id_byte(var1);
         if (!((cb_3)this.id_catch.id_class[57]).ss().id_break().id_class(var4, var3, var1, (cb_3)this.id_catch.id_class[57])) {
            return false;
         } else {
            xd_3 var5 = var4.id_break();
            if ((var5 instanceof xK_2 || var5 instanceof zx_3 || var5 instanceof kW_2) && !((cb_3)this.id_catch.id_class[57]).sU()) {
               return false;
            } else if (var4.id_catch()) {
               return false;
            } else {
               var5.id_class(var3, var1, var4, (cb_3)this.id_catch.id_class[57]);
               rXE var6 = var3.id_break(var1);
               boolean var7 = var2 && var3.id_class(var1, var6.id_catch(), 11);
               if (var7) {
                  var5.id_class((rRg_1)var3, var1, var4);
               }

               return false;
            }
         }
      }
   }

   public void id_class(rhd_3 var1, an_3 var2, boolean var3) {
      rrFj_1 var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrFj_1.id_class(var2));
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var4);
      if (!var4.id_byte()) {
         this.id_byte(var1, var2, var3);
         rrFf_1 var5 = rrFf_1.id_class(var2);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var5);
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var5);
      }
   }

   public boolean id_class() {
      return this.id_final.id_case();
   }

   public cb_3 id_class(gm_3 var1, rlP_2 var2, VR var3, boolean var4, boolean var5) {
      return new cb_3(this.id_catch, var1, this.id_private, var2, var3, var4, var5);
   }

   public boolean id_break(rfH_2 var1, rpr_3 var2, boolean var3) {
      rrLp_1 var4 = rrLp_1.id_class(
         (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[1],
         var1,
         var2,
         ((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_class.get(((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_protected),
         5
      );
      if (var4.id_byte()) {
         return false;
      } else {
         this.id_new();
         if (this.id_native > 0) {
            this.id_native--;
            return true;
         } else if (this.id_final.id_throws() && ((gm_3)this.id_catch.id_class[56]).id_instanceof().id_class(var1)) {
            this.id_native = var4.id_break();
            this.id_class(rZM.START_DESTROY_BLOCK, var1, var2);
            this.id_class(var1, var3);
            rrLp_1.id_class(
               (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2],
               var1,
               var2,
               ((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1])
                  .id_class
                  .get(((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_protected),
               5
            );
            return true;
         } else if (this.id_class(var1)) {
            xc_3 var5 = ((gm_3)this.id_catch.id_class[56]).id_byte(var1);
            if (var5.id_catch()) {
               this.id_volatile = false;
               return false;
            } else {
               this.id_class = this.id_class + var5.id_class((cb_3)this.id_catch.id_class[57], (rYB)((cb_3)this.id_catch.id_class[57]).id_throws[7], var1);
               if (this.id_extends % 4.0F == 0.0F) {
                  zr_3 var6 = var5.id_package();
                  this.id_catch.c().id_class(new Np_1(var6.id_case(), rqL_2.BLOCKS, (var6.id_class() + 1.0F) / 8.0F, var6.id_break() * 0.5F, var1));
               }

               this.id_extends++;
               rrLT var7 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLT.id_class(1.0F));
               if (this.id_class >= var7.id_class()) {
                  rrLp_1.id_class(
                     (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2],
                     var1,
                     var2,
                     ((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1])
                        .id_class
                        .get(((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_protected),
                     var4.id_break()
                  );
                  this.id_volatile = false;
                  this.id_class(rZM.STOP_DESTROY_BLOCK, var1, var2);
                  this.id_class(var1, var3);
                  this.id_class = 0.0F;
                  this.id_extends = 0.0F;
                  this.id_native = var4.id_break();
               }

               ((gm_3)this.id_catch.id_class[56]).id_class(((cb_3)this.id_catch.id_class[57]).V(), this.id_implements, (int)(this.id_class * 10.0F) - 1);
               return true;
            }
         } else {
            return this.id_class(var1, var2, var3);
         }
      }
   }

   public void id_break(int var1) {
      this.id_private.id_break(new rZs_1(var1));
   }

   public void id_break(rhd_3 var1, an_3 var2, boolean var3) {
      this.id_byte(var1, var2, var3);
   }

   public ryZ_2 id_break(cb_3 var1, gm_3 var2, rpm_3 var3, rff_3 var4) {
      rfH_2 var5 = var4.id_class();
      this.id_new();
      if (!((gm_3)this.id_catch.id_class[56]).id_instanceof().id_class(var5)) {
         return ryZ_2.FAIL;
      } else {
         rdn_3 var6 = var1.id_protected(var3);
         if (this.id_final == rRl_1.SPECTATOR) {
            this.id_private.id_class(new rZx_1(var3, var4));
            return ryZ_2.SUCCESS;
         } else {
            boolean var7 = !var1.ss().id_class() || !var1.Sn().id_class();
            boolean var8 = var1.sN() && var7;
            if (!var8) {
               ryZ_2 var9 = var2.id_byte(var5).id_class(var2, var1, var3, var4);
               if (var1.sK().id_class(var6.id_break())) {
                  return ryZ_2.PASS;
               }

               if (var9.id_class()) {
                  this.id_private.id_class(new rZx_1(var3, var4));
                  return var9;
               }
            }

            this.id_private.id_class(new rZx_1(var3, var4));
            if (!var6.id_class() && !var1.sK().id_class(var6.id_break())) {
               rdH_2 var12 = new rdH_2(var1, var3, var4);
               ryZ_2 var10;
               if (this.id_final.id_throws()) {
                  int var11 = var6.id_char();
                  var10 = var6.id_class(var12);
                  var6.id_throws(var11);
               } else {
                  var10 = var6.id_class(var12);
               }

               return var10;
            } else {
               return ryZ_2.PASS;
            }
         }
      }
   }

   public void id_break(rRl_1 var1) {
      if (var1 != this.id_final) {
         this.id_package = this.id_final;
      }

      this.id_final = var1;
      this.id_final.id_class((rhx_3)((cb_3)this.id_catch.id_class[57]).id_implements[18]);
   }

   public void id_break(rhd_3 var1) {
      this.id_new();
      rpm_3 var2 = ((cb_3)this.id_catch.id_class[57]).P();
      rdn_3 var3 = ((cb_3)this.id_catch.id_class[57]).sX();
      if (var1 != (cb_3)this.id_catch.id_class[57]
         || !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .id_finally()
            .id_class(rrAC.id_class((Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0], var3, var2))
            .id_byte()) {
         this.id_private.id_class(new rZb_1(rZM.RELEASE_USE_ITEM, rfH_2.id_protected, rpr_3.DOWN));
         var1.SC();
         if (var1 == (cb_3)this.id_catch.id_class[57]) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
               .id_finally()
               .id_class(rrAC.id_class((Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1], var3, var2));
         }
      }
   }

   public void id_break() {
      if (this.id_volatile) {
         this.id_class(rZM.ABORT_DESTROY_BLOCK, this.id_implements, rpr_3.DOWN);
         this.id_class = 0.0F;
         ((gm_3)this.id_catch.id_class[56]).id_class(((cb_3)this.id_catch.id_class[57]).V(), this.id_implements, -1);
         ((cb_3)this.id_catch.id_class[57]).sg();
         this.id_volatile = false;
      }
   }

   public void id_break(int var1, int var2, int var3, rXa_1 var4, boolean var5) {
      short var6 = ((rJr_1)((cb_3)this.id_catch.id_class[57]).id_implements[4]).id_class((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]);
      rdn_3 var7 = ((rJr_1)((cb_3)this.id_catch.id_class[57]).id_implements[4]).id_class(var2, var3, var4, (cb_3)this.id_catch.id_class[57]);
      rdn_3 var8 = var5 && var4.id_class() ? new rdn_3(rdy_3.id_class) : var7;
      this.id_private.id_class(new rmt_3(var1, var2, var3, var4, var8, var6));
   }

   public boolean id_throws() {
      return this.id_final.id_case();
   }

   public boolean id_finally() {
      return this.id_final == rRl_1.SPECTATOR;
   }

   public boolean id_catch() {
      return this.id_final.id_throws();
   }

   public rRl_1 id_extends() {
      return this.id_package;
   }

   public boolean id_case() {
      return !this.id_final.id_throws();
   }

   public boolean id_implements() {
      return ((cb_3)this.id_catch.id_class[57]).Pm() && ((cb_3)this.id_catch.id_class[57]).ra() instanceof rOD;
   }

   private void id_new() {
      int var1 = ((rhz_3)((cb_3)this.id_catch.id_class[57]).id_implements[1]).id_protected;
      if (var1 != this.id_break && rme_3.id_class != var1) {
         this.id_break = var1;
         this.id_private.id_class(new rme_3(this.id_break));
         this.id_protected = System.currentTimeMillis();
      }
   }

   public void id_package() {
      this.id_new();
   }

   public void id_protected() {
      this.id_new();
      if (this.id_private.id_class().id_case()) {
         this.id_private.id_class().id_class();
      } else {
         this.id_private.id_class().id_native();
      }
   }

   public boolean id_private() {
      return this.id_final.id_throws();
   }

   public rfH_2 id_final() {
      return this.id_implements;
   }

   public boolean id_volatile() {
      return this.id_volatile;
   }

   public rRl_1 id_native() {
      return this.id_final;
   }
}
