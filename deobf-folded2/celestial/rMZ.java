package celestial;

import java.util.Random;
import java.util.UUID;

public class rMZ extends rMu_1 implements ag_3 {
   protected static final rut_3<Byte> id_class = rmE_2.id_class(rMZ.class, ruw_3.id_class);
   private int id_break;
   private int id_protected;
   private static final rqb_3 id_super = rqt_3.id_class(20, 39);
   private int id_this;
   private UUID id_else;

   @Override
   public UUID id_byte() {
      return this.id_else;
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.Ey;
   }

   public rMZ(aI_2<? extends rMZ> var1, rYB var2) {
      super(var1, var2);
      Float var7 = 1.0F;
      this.id_throws[37] = var7;
   }

   public void id_this(boolean var1) {
      if (var1) {
         this.id_protected = 400;
         ((rYB)this.id_throws[7]).id_class(this, (byte)11);
      } else {
         this.id_protected = 0;
         ((rYB)this.id_throws[7]).id_class(this, (byte)34);
      }
   }

   public rMv_1 n() {
      return rMv_1.id_class(this.Ss() / this.SK());
   }

   @Override
   public void id_class(int var1) {
      this.id_this = var1;
   }

   @Override
   public int id_class() {
      return this.id_this;
   }

   @Override
   public void id_class(UUID var1) {
      this.id_else = var1;
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 4) {
         this.id_break = 10;
         this.id_class(rqn_3.EC, 1.0F, 1.0F);
      } else if (var1 == 11) {
         this.id_protected = 400;
      } else if (var1 == 34) {
         this.id_protected = 0;
      } else {
         super.id_class(var1);
      }
   }

   @Override
   public boolean id_class(aI_2<?> var1) {
      if (this.sd() && var1 == aI_2.rM) {
         return false;
      } else {
         return var1 == aI_2.id_volatile ? false : super.id_class(var1);
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("PlayerCreated", this.sd());
      this.a_(var1);
   }

   @Override
   public boolean id_class(rRR var1) {
      rfH_2 var2 = this.Bs();
      rfH_2 var3 = var2.id_break();
      xc_3 var4 = var1.id_byte(var3);
      if (!var4.id_class(var1, var3, this)) {
         return false;
      } else {
         for (int var5 = 1; var5 < 3; var5++) {
            rfH_2 var6 = var2.id_break(var5);
            xc_3 var7 = var1.id_byte(var6);
            if (!rrEj_1.id_class(var1, var6, var7, var7.id_volatile(), aI_2.id_import)) {
               return false;
            }
         }

         return rrEj_1.id_class(var1, var2, var1.id_byte(var2), rXG.id_class.id_private(), aI_2.id_import) && var1.id_protected(this);
      }
   }

   @Override
   public void id_default() {
      super.id_default();
      if (this.id_break > 0) {
         this.id_break--;
      }

      if (this.id_protected > 0) {
         this.id_protected--;
      }

      if (id_case(this.rv()) > 2.5000003E-7F && ((Random)this.id_throws[40]).nextInt(5) == 0) {
         int var1 = rfU_2.id_byte(this.rx());
         int var2 = rfU_2.id_byte(this.re() - 0.2F);
         int var3 = rfU_2.id_byte(this.BO());
         xc_3 var4 = ((rYB)this.id_throws[7]).id_byte(new rfH_2(var1, var2, var3));
         if (!var4.id_catch()) {
            ((rYB)this.id_throws[7])
               .id_class(
                  new rLX(rLQ.id_protected, var4),
                  this.rx() + ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * (double)this.PN(),
                  this.re() + 0.1,
                  this.BO() + ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * (double)this.PN(),
                  4.0 * ((double)((Random)this.id_throws[40]).nextFloat() - 0.5),
                  0.5,
                  ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 4.0
               );
         }
      }

      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_class((rrEm_1)((rYB)this.id_throws[7]), true);
      }
   }

   public boolean sd() {
      return (((rmE_2)this.id_throws[49]).id_class(id_class) & 1) != 0;
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.Eq, 1.0F, 1.0F);
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      rMv_1 var3 = this.n();
      boolean var4 = super.id_break(var1, var2);
      if (var4 && this.n() != var3) {
         this.id_class(rqn_3.El, 1.0F, 1.0F);
      }

      return var4;
   }

   @Override
   public void id_break(rye_3 var1) {
      super.id_break(var1);
   }

   @Override
   protected ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      rdb_3 var4 = var3.id_break();
      if (var4 != rdy_3.Ox) {
         return ryZ_2.PASS;
      } else {
         float var5 = this.Ss();
         this.id_protected(25.0F);
         if (this.Ss() == var5) {
            return ryZ_2.PASS;
         } else {
            float var6 = 1.0F + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F;
            this.id_class(rqn_3.Ep, 1.0F, var6);
            if (!((rhx_3)var1.id_implements[18]).id_protected) {
               var3.id_catch(1);
            }

            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
         }
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_else(var1.id_new("PlayerCreated"));
      this.id_class((rrEm_1)((rYB)this.id_throws[7]), var1);
   }

   public static iz_3 L() {
      return is_3.id_package().id_class(iQ_2.id_class, 100.0).id_class(iQ_2.id_protected, 0.25).id_class(iQ_2.id_byte, 1.0).id_class(iQ_2.id_case, 15.0);
   }

   public int sx() {
      return this.id_protected;
   }

   private float sk() {
      return (float)this.id_class(iQ_2.id_case);
   }

   public void id_else(boolean var1) {
      byte var2 = ((rmE_2)this.id_throws[49]).id_class(id_class);
      if (var1) {
         ((rmE_2)this.id_throws[49]).id_break(id_class, (byte)(var2 | 1));
      } else {
         ((rmE_2)this.id_throws[49]).id_break(id_class, (byte)(var2 & -2));
      }
   }

   @Override
   protected void id_instanceof(an_3 var1) {
      if (var1 instanceof rEK && !(var1 instanceof rEJ) && this.Sa().nextInt(20) == 0) {
         this.id_byte((iB_2)var1);
      }

      super.id_instanceof(var1);
   }

   @Override
   public boolean id_public(an_3 var1) {
      this.id_break = 10;
      ((rYB)this.id_throws[7]).id_class(this, (byte)4);
      float var2 = this.sk();
      float var3 = (int)var2 > 0 ? var2 / 2.0F + (float)((Random)this.id_throws[40]).nextInt((int)var2) : var2;
      boolean var4 = var1.id_break(rye_3.id_byte(this), var3);
      if (var4) {
         var1.id_byte(var1.rv().id_break(0.0, 0.4F, 0.0));
         this.id_class(this, var1);
      }

      this.id_class(rqn_3.EC, 1.0F, 1.0F);
      return var4;
   }

   @Override
   public void id_protected() {
      this.id_class(id_super.id_class((Random)this.id_throws[40]));
   }

   @Override
   protected int id_final(int var1) {
      return var1;
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(1, new rBl_1(this, 1.0, true));
      this.id_package.id_class(2, new rBt_1(this, 0.9, 32.0F));
      this.id_package.id_class(2, new rSS(this, 0.6, false));
      this.id_package.id_class(4, new rBo_1(this, 0.6));
      this.id_package.id_class(5, new rSE(this));
      this.id_package.id_class(7, new rBA(this, rhd_3.class, 6.0F));
      this.id_package.id_class(8, new rBC(this));
      this.id_int.id_class(1, new rBE(this));
      this.id_int.id_class(2, new rBc_1(this));
      this.id_int.id_class(3, new rBI<>(this, rhd_3.class, 10, true, false, this::b_));
      this.id_int.id_class(3, new rBI<>(this, is_3.class, 5, false, false, var0 -> var0 instanceof rEK && !(var0 instanceof rEJ)));
      this.id_int.id_class(4, new rSP<>(this, false));
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.875F * this.Bx()), (double)(this.PN() * 0.4F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.EH;
   }

   public int sJ() {
      return this.id_break;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, (byte)0);
   }
}
