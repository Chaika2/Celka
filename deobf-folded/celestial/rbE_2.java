package celestial;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.Random;
import java.util.UUID;
import org.apache.logging.log4j.Logger;

public class rbE_2 extends rbB_2 implements rha_3 {
   private static final rut_3<Boolean> id_class = rmE_2.id_class(rbE_2.class, ruw_3.id_implements);
   private static final rut_3<rsp_3> id_break = rmE_2.id_class(rbE_2.class, ruw_3.id_new);
   private int id_protected;
   private UUID id_super;
   private rcZ_2 id_this;
   private rcd_3 id_else;
   private int id_synchronized;

   private void id_byte(rrEm_1 var1) {
      rsq_3 var2 = this.id_class(aI_2.D, false);

      for (rXQ var6 : rXQ.values()) {
         rdn_3 var7 = this.id_class(var6);
         if (!var7.id_class()) {
            if (eA_2.id_protected(var7)) {
               var2.id_class(var6.id_break() + 300, var7);
            } else {
               double var8 = (double)this.id_throws(var6);
               if (var8 > 1.0) {
                  this.a_(var7);
               }
            }
         }
      }

      var2.id_class(this.su());
      if (this.id_this != null) {
         var2.id_class(this.id_this);
      }

      if (this.id_else != null) {
         var2.id_break(new rdf_3(this.id_else));
      }

      var2.id_else(this.id_synchronized);
      var2.id_class(var1, var1.id_throws(var2.Bs()), iO_2.CONVERSION, (aU_2)null, (rcd_3)null);
      if (this.id_super != null) {
         rhd_3 var10 = var1.id_class(this.id_super);
         if (var10 instanceof rhN_2) {
            Oo_1.id_continue.id_class((rhN_2)var10, this, var2);
            var1.id_class(rsC_2.id_class, var10, var2);
         }
      }

      var2.id_break(new rLY(rLD.id_implements, 200, 0));
      if (!this.BF()) {
         var1.id_class((rhd_3)null, 1027, this.Bs(), 0);
      }
   }

   @Override
   public rqA_2 id_byte(rye_3 var1) {
      return rqn_3.zM;
   }

   public rbE_2(aI_2<? extends rbE_2> var1, rYB var2) {
      super(var1, var2);
      this.id_class(this.su().id_class(rVL.J.id_class((Random)this.id_throws[40])));
   }

   @Override
   public void id_this() {
      if (!((rYB)this.id_throws[7]).id_continue && this.BM() && this.sZ()) {
         int var1 = this.sv();
         this.id_protected -= var1;
         if (this.id_protected <= 0) {
            this.id_byte((rrEm_1)((rYB)this.id_throws[7]));
         }
      }

      super.id_this();
   }

   @Override
   public void id_class(int var1) {
      this.id_synchronized = var1;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      rsp_3.id_class
         .encodeStart(rcf_3.id_class, this.su())
         .resultOrPartial(((Logger)id_case[0])::error)
         .ifPresent(var1x -> var1.id_class("VillagerData", var1x));
      if (this.id_else != null) {
         var1.id_class("Offers", this.id_else);
      }

      if (this.id_this != null) {
         var1.id_class("Gossips", this.id_this);
      }

      var1.id_break("ConversionTime", this.sZ() ? this.id_protected : -1);
      if (this.id_super != null) {
         var1.id_class("ConversionPlayer", this.id_super);
      }

      var1.id_break("Xp", this.id_synchronized);
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 16) {
         if (!this.BF()) {
            ((rYB)this.id_throws[7])
               .id_class(
                  this.rx(),
                  this.rH(),
                  this.BO(),
                  rqn_3.zG,
                  this.Pr(),
                  1.0F + ((Random)this.id_throws[40]).nextFloat(),
                  ((Random)this.id_throws[40]).nextFloat() * 0.7F + 0.3F,
                  false
               );
         }
      } else {
         super.id_class(var1);
      }
   }

   public void id_class(rcZ_2 var1) {
      this.id_this = var1;
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.id_class(this.su().id_class(rhi_3.id_class(var1.id_protected(this.Bs()))));
      return super.id_class(var1, var2, var3, var4, var5);
   }

   public void id_class(rsp_3 var1) {
      rsp_3 var2 = this.su();
      if (var2.id_break() != var1.id_break()) {
         this.id_else = null;
      }

      ((rmE_2)this.id_throws[49]).id_break(id_break, var1);
   }

   private void id_class(UUID var1, int var2) {
      this.id_super = var1;
      this.id_protected = var2;
      this.BQ().id_break(id_class, true);
      this.id_protected(rLD.id_continue);
      this.id_break(new rLY(rLD.id_throws, var2, Math.min(((rYB)this.id_throws[7]).id_abstract().id_class() - 1, 0)));
      ((rYB)this.id_throws[7]).id_class(this, (byte)16);
   }

   @Override
   protected boolean sd() {
      return false;
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (var3.id_break() == rdy_3.hy) {
         if (this.id_break(rLD.id_continue)) {
            if (!((rhx_3)var1.id_implements[18]).id_protected) {
               var3.id_catch(1);
            }

            if (!((rYB)this.id_throws[7]).id_continue) {
               this.id_class(var1.ro(), ((Random)this.id_throws[40]).nextInt(2401) + 3600);
            }

            return ryZ_2.SUCCESS;
         } else {
            return ryZ_2.CONSUME;
         }
      } else {
         return super.id_break(var1, var2);
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("VillagerData", 10)) {
         DataResult var2 = rsp_3.id_class.parse(new Dynamic(rcf_3.id_class, var1.id_byte("VillagerData")));
         var2.resultOrPartial(((Logger)id_case[0])::error).ifPresent(this::id_class);
      }

      if (var1.id_byte("Offers", 10)) {
         this.id_else = var1.id_int("Offers");
      }

      if (var1.id_byte("Gossips", 10)) {
         this.id_this = var1.id_protected("Gossips", 10);
      }

      if (var1.id_byte("ConversionTime", 99) && var1.id_private("ConversionTime") > -1) {
         this.id_class(var1.id_break("ConversionPlayer") ? var1.id_class("ConversionPlayer") : null, var1.id_private("ConversionTime"));
      }

      if (var1.id_byte("Xp", 3)) {
         this.id_synchronized = var1.id_private("Xp");
      }
   }

   @Override
   protected rdn_3 sx() {
      return rdn_3.id_break;
   }

   private int sv() {
      int var1 = 1;
      if (((Random)this.id_throws[40]).nextFloat() < 0.01F) {
         int var2 = 0;
         rfw_3 var3 = new rfw_3();

         for (int var4 = (int)this.rx() - 4; var4 < (int)this.rx() + 4 && var2 < 14; var4++) {
            for (int var5 = (int)this.re() - 4; var5 < (int)this.re() + 4 && var2 < 14; var5++) {
               for (int var6 = (int)this.BO() - 4; var6 < (int)this.BO() + 4 && var2 < 14; var6++) {
                  xd_3 var7 = ((rYB)this.id_throws[7]).id_byte(var3.id_class(var4, var5, var6)).id_break();
                  if (var7 == xu_3.Bf || var7 instanceof xb_3) {
                     if (((Random)this.id_throws[40]).nextFloat() < 0.3F) {
                        var1++;
                     }

                     var2++;
                  }
               }
            }
         }
      }

      return var1;
   }

   public void id_catch(rcd_3 var1) {
      this.id_else = var1;
   }

   @Override
   public rqA_2 id_static() {
      return rqn_3.zs;
   }

   @Override
   public boolean id_private(double var1) {
      return !this.sZ() && this.id_synchronized == 0;
   }

   @Override
   public rqA_2 Bt() {
      return rqn_3.zb;
   }

   @Override
   public rqA_2 sJ() {
      return rqn_3.zO;
   }

   @Override
   protected float SN() {
      return this.n_()
         ? (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 2.0F
         : (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F;
   }

   @Override
   public rsp_3 su() {
      return ((rmE_2)this.id_throws[49]).id_class(id_break);
   }

   public boolean sZ() {
      return this.BQ().id_class(id_class);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, false);
      ((rmE_2)this.id_throws[49]).id_class(id_break, new rsp_3(rhi_3.id_byte, rsT_2.id_class, 1));
   }
}
