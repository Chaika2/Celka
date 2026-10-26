package celestial;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import org.apache.commons.lang3.tuple.Pair;

public class rMF extends rbY_2 implements iP_2 {
   private static final rut_3<String> id_super = rmE_2.id_class(rMF.class, ruw_3.id_protected);
   private rLR id_this;
   private int id_else;
   private UUID id_synchronized;

   public rMF id_byte(rrEm_1 var1, au_3 var2) {
      rMF var3 = aI_2.b.id_class(var1);
      var3.id_class(this.id_class((rMF)var2));
      return var3;
   }

   public rMF(aI_2<? extends rMF> var1, rYB var2) {
      super(var1, var2);
   }

   public rML n() {
      return rML.id_class(((rmE_2)this.id_throws[49]).id_class(id_super));
   }

   private void id_class(rML var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_super, var1.name);
   }

   @Override
   public float id_class(rfH_2 var1, rRR var2) {
      return var2.id_byte(var1.id_break()).id_class(xu_3.Bi) ? 10.0F : var2.id_native(var1) - 0.5F;
   }

   private rML id_class(rMF var1) {
      rML var2 = this.n();
      rML var3 = var1.n();
      rML var4;
      if (var2 == var3 && ((Random)this.id_throws[40]).nextInt(1024) == 0) {
         var4 = var2 == rML.BROWN ? rML.RED : rML.BROWN;
      } else {
         var4 = ((Random)this.id_throws[40]).nextBoolean() ? var2 : var3;
      }

      return var4;
   }

   @Override
   public void id_class(rqL_2 var1) {
      ((rYB)this.id_throws[7]).id_class((rhd_3)null, this, rqn_3.GK, var1, 1.0F, 1.0F);
      if (!((rYB)this.id_throws[7]).id_import()) {
         ((rrEm_1)((rYB)this.id_throws[7])).id_class(rLQ.id_return, this.rx(), this.id_byte(0.5), this.BO(), 1, 0.0, 0.0, 0.0, 0.0);
         this.PD();
         rbY_2 var2 = aI_2.id_native.id_class((rYB)this.id_throws[7]);
         var2.id_class(this.rx(), this.re(), this.BO(), (Float)this.id_throws[15], (Float)this.id_throws[16]);
         var2.id_public(this.Ss());
         Float var8 = (Float)this.id_private[23];
         var2.id_private[23] = var8;
         if (this.Bk()) {
            var2.id_break(this.rD());
            var2.id_final(this.D());
         }

         if (this.O()) {
            var2.b();
         }

         var2.id_catch(this.rg());
         ((rYB)this.id_throws[7]).a_(var2);

         for (int var3 = 0; var3 < 5; var3++) {
            ((rYB)this.id_throws[7]).a_(new rsE_2((rYB)this.id_throws[7], this.rx(), this.id_byte(1.0), this.BO(), new rdn_3(this.n().renderState.id_break())));
         }
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Type", this.n().name);
      if (this.id_this != null) {
         var1.id_class("EffectId", (byte)rLR.id_class(this.id_this));
         var1.id_break("EffectDuration", this.id_else);
      }
   }

   @Override
   public void id_class(rrEm_1 var1, rSg_1 var2) {
      UUID var3 = var2.ro();
      if (!var3.equals(this.id_synchronized)) {
         this.id_class(this.n() == rML.RED ? rML.BROWN : rML.RED);
         this.id_synchronized = var3;
         this.id_class(rqn_3.Gg, 2.0F, 1.0F);
      }
   }

   @Override
   public boolean id_class() {
      return this.BM() && !this.n_();
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_class(rML.id_class(var1.id_native("Type")));
      if (var1.id_byte("EffectId", 1)) {
         this.id_this = rLR.id_class(var1.id_case("EffectId"));
      }

      if (var1.id_byte("EffectDuration", 3)) {
         this.id_else = var1.id_private("EffectDuration");
      }
   }

   public static boolean id_break(aI_2<rMF> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.id_byte(var3.id_break()).id_class(xu_3.Bi) && var1.id_class(var3, 0) > 8;
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (var3.id_break() == rdy_3.OU && !this.n_()) {
         boolean var9 = false;
         rdn_3 var10;
         if (this.id_this != null) {
            var9 = true;
            var10 = new rdn_3(rdy_3.ke);
            rkJ_2.id_class(var10, this.id_this, this.id_else);
            this.id_this = null;
            this.id_else = 0;
         } else {
            var10 = new rdn_3(rdy_3.Oe);
         }

         rdn_3 var11 = rpO_2.id_class(var3, var1, var10, false);
         var1.id_class(var2, var11);
         rqA_2 var7;
         if (var9) {
            var7 = rqn_3.Go;
         } else {
            var7 = rqn_3.GY;
         }

         this.id_class(var7, 1.0F, 1.0F);
         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else if (var3.id_break() == rdy_3.JJ && this.id_class()) {
         this.id_class(rqL_2.PLAYERS);
         if (!((rYB)this.id_throws[7]).id_continue) {
            var3.id_class(1, var1, var1x -> var1x.id_byte(var2));
         }

         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else if (this.n() == rML.BROWN && var3.id_break().id_class(rlc_3.id_void)) {
         if (this.id_this != null) {
            for (int var4 = 0; var4 < 2; var4++) {
               ((rYB)this.id_throws[7])
                  .id_class(
                     rLQ.id_double,
                     this.rx() + ((Random)this.id_throws[40]).nextDouble() / 2.0,
                     this.id_byte(0.5),
                     this.BO() + ((Random)this.id_throws[40]).nextDouble() / 2.0,
                     0.0,
                     ((Random)this.id_throws[40]).nextDouble() / 5.0,
                     0.0
                  );
            }
         } else {
            Optional var8 = this.id_native(var3);
            if (!var8.isPresent()) {
               return ryZ_2.PASS;
            }

            Pair var5 = (Pair)var8.get();
            if (!((rhx_3)var1.id_implements[18]).id_protected) {
               var3.id_catch(1);
            }

            for (int var6 = 0; var6 < 4; var6++) {
               ((rYB)this.id_throws[7])
                  .id_class(
                     rLQ.id_int,
                     this.rx() + ((Random)this.id_throws[40]).nextDouble() / 2.0,
                     this.id_byte(0.5),
                     this.BO() + ((Random)this.id_throws[40]).nextDouble() / 2.0,
                     0.0,
                     ((Random)this.id_throws[40]).nextDouble() / 5.0,
                     0.0
                  );
            }

            this.id_this = (rLR)var5.getLeft();
            this.id_else = (Integer)var5.getRight();
            this.id_class(rqn_3.GR, 2.0F, 1.0F);
         }

         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else {
         return super.id_break(var1, var2);
      }
   }

   private Optional<Pair<rLR, Integer>> id_native(rdn_3 var1) {
      rdb_3 var2 = var1.id_break();
      return var2 instanceof rxJ_2 && ((rxJ_2)var2).id_catch() instanceof dI_2 var4
         ? Optional.of(Pair.of(var4.id_break(), var4.id_implements()))
         : Optional.empty();
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_super, rML.RED.name);
   }
}
