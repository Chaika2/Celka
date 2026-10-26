package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rba_3 extends rbZ_2 {
   private static final rut_3<Integer> id_super = rmE_2.id_class(rba_3.class, ruw_3.id_break);
   private static final rut_3<Byte> id_this = rmE_2.id_class(rba_3.class, ruw_3.id_class);
   private static final rut_3<Optional<UUID>> id_else = rmE_2.id_class(rba_3.class, ruw_3.id_package);
   private static final rut_3<Optional<UUID>> id_synchronized = rmE_2.id_class(rba_3.class, ruw_3.id_package);
   static final Predicate<rsE_2> id_return = var0 -> !var0.id_package() && var0.BM();
   private static final Predicate<an_3> id_public = var0 -> !(var0 instanceof iB_2 var1)
         ? false
         : var1.SZ() != null && var1.SE() < (Integer)var1.id_throws[41] + 600;
   static final Predicate<an_3> id_goto = var0 -> var0 instanceof rbR_2 || var0 instanceof rMi_1;
   private static final Predicate<an_3> id_while = var0 -> !var0.Pw() && rpJ_2.id_throws.test(var0);
   private rBk_1 id_try;
   private rBk_1 id_instanceof;
   private rBk_1 id_throw;
   private float id_interface;
   private float id_char;
   float id_abstract;
   float id_long;
   private int id_float;

   @Override
   public void id_byte(iB_2 var1) {
      if (this.sv() && var1 == null) {
         this.id_goto(false);
      }

      super.id_byte(var1);
   }

   boolean id_byte(UUID var1) {
      return this.sZ().contains(var1);
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.SL;
   }

   @Override
   public void id_long() {
      rqA_2 var1 = this.id_static();
      if (var1 == rqn_3.SA) {
         this.id_class(var1, 2.0F, this.SN());
      } else {
         super.id_long();
      }
   }

   public rba_3(aI_2<? extends rba_3> var1, rYB var2) {
      super(var1, var2);
      this.id_extends = new rMO(this);
      this.id_native = new rMX(this);
      this.id_class(rLp_1.DANGER_OTHER, 0.0F);
      this.id_class(rLp_1.DAMAGE_OTHER, 0.0F);
      this.id_byte(true);
   }

   public void id_this(boolean var1) {
      this.id_protected(1, var1);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.id_try()) {
         boolean var1 = this.rT();
         if (var1 || this.I_() != null || ((rYB)this.id_throws[7]).S()) {
            this.sF();
         }

         if (var1 || this.Sc()) {
            this.id_this(false);
         }

         if (this.sx() && ((rYB)this.id_throws[7]).id_int.nextFloat() < 0.2F) {
            rfH_2 var2 = this.Bs();
            xc_3 var3 = ((rYB)this.id_throws[7]).id_byte(var2);
            ((rYB)this.id_throws[7]).id_byte(2001, var2, xd_3.id_finally(var3));
         }
      }

      this.id_char = this.id_interface;
      if (this.su()) {
         this.id_interface = this.id_interface + (1.0F - this.id_interface) * 0.4F;
      } else {
         this.id_interface = this.id_interface + (0.0F - this.id_interface) * 0.4F;
      }

      this.id_long = this.id_abstract;
      if (this.x()) {
         this.id_abstract += 0.2F;
         if (this.id_abstract > 3.0F) {
            this.id_abstract = 3.0F;
         }
      } else {
         this.id_abstract = 0.0F;
      }
   }

   @Override
   public boolean x() {
      return this.id_else(4);
   }

   public rMN n() {
      return rMN.id_class(((rmE_2)this.id_throws[49]).id_class(id_super));
   }

   public float id_interface(float var1) {
      return rfU_2.id_catch(var1, this.id_long, this.id_abstract);
   }

   @Override
   protected void id_class(rRh_1 var1) {
      if (((Random)this.id_throws[40]).nextFloat() < 0.2F) {
         float var2 = ((Random)this.id_throws[40]).nextFloat();
         rdn_3 var3;
         if (var2 < 0.05F) {
            var3 = new rdn_3(rdy_3.dP);
         } else if (var2 < 0.2F) {
            var3 = new rdn_3(rdy_3.XJ);
         } else if (var2 < 0.4F) {
            var3 = ((Random)this.id_throws[40]).nextBoolean() ? new rdn_3(rdy_3.dy) : new rdn_3(rdy_3.dp);
         } else if (var2 < 0.6F) {
            var3 = new rdn_3(rdy_3.hB);
         } else if (var2 < 0.8F) {
            var3 = new rdn_3(rdy_3.ha);
         } else {
            var3 = new rdn_3(rdy_3.Oi);
         }

         this.id_class(rXQ.MAINHAND, var3);
      }
   }

   @Override
   protected void id_class(rhd_3 var1, is_3 var2) {
      ((rba_3)var2).id_break(var1.ro());
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 45) {
         rdn_3 var2 = this.id_class(rXQ.MAINHAND);
         if (!var2.id_class()) {
            for (int var3 = 0; var3 < 8; var3++) {
               rjU_2 var4 = new rjU_2(((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .id_class(-(Float)this.id_throws[16] * (float) (Math.PI / 180.0))
                  .id_break(-(Float)this.id_throws[15] * (float) (Math.PI / 180.0));
               ((rYB)this.id_throws[7])
                  .id_class(
                     new rLk_1(rLQ.id_void, var2),
                     this.rx() + this.m().id_break / 2.0,
                     this.re(),
                     this.BO() + this.m().id_protected / 2.0,
                     var4.id_break,
                     var4.id_byte + 0.05,
                     var4.id_protected
                  );
            }
         }
      } else {
         super.id_class(var1);
      }
   }

   public static boolean id_class(rba_3 var0, iB_2 var1) {
      double var2 = var1.BO() - var0.BO();
      double var4 = var1.rx() - var0.rx();
      double var6 = var2 / var4;
      byte var8 = 6;

      for (int var9 = 0; var9 < 6; var9++) {
         double var10 = var6 == 0.0 ? 0.0 : var2 * (double)((float)var9 / 6.0F);
         double var12 = var6 == 0.0 ? var4 * (double)((float)var9 / 6.0F) : var10 / var6;

         for (int var14 = 1; var14 < 4; var14++) {
            if (!((rYB)var0.id_throws[7]).id_byte(new rfH_2(var0.rx() + var12, var0.re() + (double)var14, var0.BO() + var10)).id_byte().id_throws()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      Optional var6 = var1.id_protected(this.Bs());
      rMN var7 = rMN.id_class(var6);
      boolean var8 = false;
      if (var4 instanceof rMb_1) {
         var7 = ((rMb_1)var4).id_class;
         if (((rMb_1)var4).id_class() >= 2) {
            var8 = true;
         }
      } else {
         var4 = new rMb_1(var7);
      }

      this.id_class(var7);
      if (var8) {
         this.e_(-24000);
      }

      if (var1 instanceof rrEm_1) {
         this.sm();
      }

      this.id_class(var2);
      return super.id_class(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      List var2 = this.sZ();
      rcy_3 var3 = new rcy_3();

      for (UUID var5 : var2) {
         if (var5 != null) {
            var3.add(rco_3.id_class(var5));
         }
      }

      var1.id_class("Trusted", var3);
      var1.id_class("Sleeping", this.Sc());
      var1.id_class("Type", this.n().id_class());
      var1.id_class("Sitting", this.sJ());
      var1.id_class("Crouching", this.x());
   }

   private void id_class(rMN var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_super, var1.id_break());
   }

   @Override
   protected void id_class(rhd_3 var1, rdn_3 var2) {
      if (this.id_extends(var2)) {
         this.id_class(this.id_protected(var2), 1.0F, 1.0F);
      }

      super.id_class(var1, var2);
   }

   private void sm() {
      if (this.n() == rMN.RED) {
         this.id_int.id_class(4, this.id_try);
         this.id_int.id_class(4, this.id_instanceof);
         this.id_int.id_class(6, this.id_throw);
      } else {
         this.id_int.id_class(4, this.id_throw);
         this.id_int.id_class(6, this.id_try);
         this.id_int.id_class(6, this.id_instanceof);
      }
   }

   public boolean sc() {
      return this.id_abstract == 3.0F;
   }

   @Override
   public void id_default() {
      if (!((rYB)this.id_throws[7]).id_continue && this.BM() && this.id_try()) {
         this.id_float++;
         rdn_3 var1 = this.id_class(rXQ.MAINHAND);
         if (this.id_native(var1)) {
            if (this.id_float > 600) {
               rdn_3 var2 = var1.id_class((rYB)this.id_throws[7], this);
               if (!var2.id_class()) {
                  this.id_class(rXQ.MAINHAND, var2);
               }

               this.id_float = 0;
            } else if (this.id_float > 560 && ((Random)this.id_throws[40]).nextFloat() < 0.1F) {
               this.id_class(this.id_protected(var1), 1.0F, 1.0F);
               ((rYB)this.id_throws[7]).id_class(this, (byte)45);
            }
         }

         iB_2 var10 = this.I_();
         if (var10 == null || !var10.BM()) {
            this.id_synchronized(false);
            this.id_return(false);
         }
      }

      if (this.Sc() || this.BK()) {
         Boolean var7 = false;
         this.id_private[41] = var7;
         Float var8 = 0.0F;
         this.id_private[42] = var8;
         Float var9 = 0.0F;
         this.id_private[44] = var9;
      }

      super.id_default();
      if (this.sv() && ((Random)this.id_throws[40]).nextFloat() < 0.05F) {
         this.id_class(rqn_3.Su, 1.0F, 1.0F);
      }
   }

   public boolean sd() {
      return this.id_else(16);
   }

   void id_break(UUID var1) {
      if (((rmE_2)this.id_throws[49]).id_class(id_else).isPresent()) {
         ((rmE_2)this.id_throws[49]).id_break(id_synchronized, Optional.ofNullable(var1));
      } else {
         ((rmE_2)this.id_throws[49]).id_break(id_else, Optional.ofNullable(var1));
      }
   }

   @Override
   protected void id_break(rsE_2 var1) {
      rdn_3 var2 = var1.id_protected();
      if (this.id_private(var2)) {
         int var3 = var2.id_char();
         if (var3 > 1) {
            this.id_final(var2.id_class(var3 - 1));
         }

         this.id_volatile(this.id_class(rXQ.MAINHAND));
         this.id_class(var1);
         this.id_class(rXQ.MAINHAND, var2.id_class(1));
         this.id_new[rXQ.MAINHAND.id_break()] = 2.0F;
         this.id_class(var1, var2.id_char());
         var1.PD();
         this.id_float = 0;
      }
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return this.n_() ? var2.id_break * 0.85F : 0.4F;
   }

   public rba_3 id_break(rrEm_1 var1, au_3 var2) {
      rba_3 var3 = aI_2.id_throw.id_class(var1);
      var3.id_class(((Random)this.id_throws[40]).nextBoolean() ? this.n() : ((rba_3)var2).n());
      return var3;
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      rcy_3 var2 = var1.id_protected("Trusted", 11);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         this.id_break(rco_3.id_class(var2.id_finally(var3)));
      }

      this.id_while(var1.id_new("Sleeping"));
      this.id_class(rMN.id_class(var1.id_native("Type")));
      this.id_this(var1.id_new("Sitting"));
      this.id_synchronized(var1.id_new("Crouching"));
      if ((rYB)this.id_throws[7] instanceof rrEm_1) {
         this.sm();
      }
   }

   @Override
   public boolean id_throws(rdn_3 var1) {
      rXQ var2 = is_3.id_finally(var1);
      return !this.id_class(var2).id_class() ? false : var2 == rXQ.MAINHAND && super.id_throws(var1);
   }

   public static iz_3 L() {
      return is_3.id_package().id_class(iQ_2.id_protected, 0.3F).id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_break, 32.0).id_class(iQ_2.id_case, 2.0);
   }

   public boolean sx() {
      return this.id_else(64);
   }

   boolean sv() {
      return this.id_else(128);
   }

   @Override
   public boolean Sc() {
      return this.id_else(32);
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return var1.id_break() == rdy_3.WQ;
   }

   void id_goto(boolean var1) {
      this.id_protected(128, var1);
   }

   public void id_else(boolean var1) {
      this.id_protected(16, var1);
   }

   private boolean id_else(int var1) {
      return (((rmE_2)this.id_throws[49]).id_class(id_this) & var1) != 0;
   }

   @Override
   protected int id_implements(float var1, float var2) {
      return rfU_2.id_case((var1 - 5.0F) * var2);
   }

   public void id_return(boolean var1) {
      this.id_protected(8, var1);
   }

   public float id_throw(float var1) {
      return rfU_2.id_catch(var1, this.id_char, this.id_interface) * 0.11F * (float) Math.PI;
   }

   void id_while(boolean var1) {
      this.id_protected(32, var1);
   }

   @Override
   protected rqA_2 id_static() {
      if (this.Sc()) {
         return rqn_3.Sn;
      } else {
         if (!((rYB)this.id_throws[7]).id_strictfp() && ((Random)this.id_throws[40]).nextFloat() < 0.1F) {
            List var1 = ((rYB)this.id_throws[7]).id_class(rhd_3.class, this.rN().id_byte(16.0, 16.0, 16.0), rpJ_2.id_catch);
            if (var1.isEmpty()) {
               return rqn_3.SA;
            }
         }

         return rqn_3.Sm;
      }
   }

   void id_public(boolean var1) {
      this.id_protected(64, var1);
   }

   @Override
   protected void id_protected(rye_3 var1) {
      rdn_3 var2 = this.id_class(rXQ.MAINHAND);
      if (!var2.id_class()) {
         this.a_(var2);
         this.id_class(rXQ.MAINHAND, rdn_3.id_break);
      }

      super.id_protected(var1);
   }

   private void id_protected(int var1, boolean var2) {
      if (var2) {
         ((rmE_2)this.id_throws[49]).id_break(id_this, (byte)(((rmE_2)this.id_throws[49]).id_class(id_this) | var1));
      } else {
         ((rmE_2)this.id_throws[49]).id_break(id_this, (byte)(((rmE_2)this.id_throws[49]).id_class(id_this) & ~var1));
      }
   }

   @Override
   public rqA_2 id_protected(rdn_3 var1) {
      return rqn_3.SF;
   }

   @Override
   public boolean id_private(rdn_3 var1) {
      rdb_3 var2 = var1.id_break();
      rdn_3 var3 = this.id_class(rXQ.MAINHAND);
      return var3.id_class() || this.id_float > 0 && var2.id_super() && !var3.id_break().id_super();
   }

   @Override
   protected void id_final() {
      this.id_try = new rBI<>(this, rbZ_2.class, 10, false, false, var0 -> var0 instanceof rbR_2 || var0 instanceof rMi_1);
      this.id_instanceof = new rBI<>(this, rON.class, 10, false, false, rON.id_super);
      this.id_throw = new rBI<>(this, rOp_1.class, 20, false, false, var0 -> var0 instanceof rOt_1);
      this.id_package.id_class(0, new rMQ(this));
      this.id_package.id_class(1, new rMM(this));
      this.id_package.id_class(2, new rMJ(this, 2.2));
      this.id_package.id_class(3, new rMh_1(this, 1.0));
      this.id_package.id_class(4, new rPD<>(this, rhd_3.class, 16.0F, 1.6, 1.4, var1 -> id_while.test(var1) && !this.id_byte(var1.ro()) && !this.sv()));
      this.id_package.id_class(4, new rPD<>(this, rOH.class, 8.0F, 1.6, 1.4, var1 -> !((rOH)var1).sZ() && !this.sv()));
      this.id_package.id_class(4, new rPD<>(this, rMK.class, 8.0F, 1.6, 1.4, var1 -> !this.sv()));
      this.id_package.id_class(5, new rMG(this));
      this.id_package.id_class(6, new rMx_1(this));
      this.id_package.id_class(6, new rMs_1(this, 1.25));
      this.id_package.id_class(7, new rMP(this, 1.2F, true));
      this.id_package.id_class(7, new rMW(this));
      this.id_package.id_class(8, new rME(this, this, 1.25));
      this.id_package.id_class(9, new rMz_1(this, 32, 200));
      this.id_package.id_class(10, new rMB(this, 1.2F, 12, 2));
      this.id_package.id_class(10, new rBv_1(this, 0.4F));
      this.id_package.id_class(11, new rSk_1(this, 1.0));
      this.id_package.id_class(11, new rMS(this));
      this.id_package.id_class(12, new rMc_1(this, this, (float)rhd_3.class, 24.0F));
      this.id_package.id_class(13, new rMk_1(this));
      this.id_int.id_class(3, new rMd_1(this, (boolean)iB_2.class, false, false, var1 -> id_public.test(var1) && !this.id_byte(var1.ro())));
   }

   private void id_final(rdn_3 var1) {
      rsE_2 var2 = new rsE_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO(), var1);
      ((rYB)this.id_throws[7]).a_(var2);
   }

   private void id_volatile(rdn_3 var1) {
      if (!var1.id_class() && !((rYB)this.id_throws[7]).id_continue) {
         rsE_2 var2 = new rsE_2((rYB)this.id_throws[7], this.rx() + this.m().id_break, this.re() + 1.0, this.BO() + this.m().id_protected, var1);
         var2.id_class(40);
         var2.id_byte(this.ro());
         this.id_class(rqn_3.Sl, 1.0F, 1.0F);
         ((rYB)this.id_throws[7]).a_(var2);
      }
   }

   public void id_synchronized(boolean var1) {
      this.id_protected(4, var1);
   }

   private boolean id_native(rdn_3 var1) {
      return var1.id_break().id_super() && this.I_() == null && (Boolean)this.id_throws[20] && !this.Sc();
   }

   @Override
   protected boolean BK() {
      return this.Sl();
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.55F * this.Bx()), (double)(this.PN() * 0.4F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Sv;
   }

   public boolean sJ() {
      return this.id_else(1);
   }

   void sL() {
      this.id_return(false);
      this.id_synchronized(false);
      this.id_this(false);
      this.id_while(false);
      this.id_goto(false);
      this.id_public(false);
   }

   public boolean su() {
      return this.id_else(8);
   }

   List<UUID> sZ() {
      ArrayList var1 = Lists.newArrayList();
      var1.add(((rmE_2)this.id_throws[49]).id_class(id_else).orElse((UUID)null));
      var1.add(((rmE_2)this.id_throws[49]).id_class(id_synchronized).orElse((UUID)null));
      return var1;
   }

   void sF() {
      this.id_while(false);
   }

   boolean sA() {
      return !this.Sc() && !this.sJ() && !this.sx();
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_else, Optional.empty());
      ((rmE_2)this.id_throws[49]).id_class(id_synchronized, Optional.empty());
      ((rmE_2)this.id_throws[49]).id_class(id_super, 0);
      ((rmE_2)this.id_throws[49]).id_class(id_this, (byte)0);
   }
}
