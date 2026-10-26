package celestial;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class rEx_1 extends rbB_2 implements aa_3 {
   boolean id_protected;
   protected final rLw_1 id_class;
   protected final rLA id_break;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return this.rT() ? rqn_3.Bs : rqn_3.BS;
   }

   public rEx_1(aI_2<? extends rEx_1> var1, rYB var2) {
      super(var1, var2);
      Float var7 = 1.0F;
      this.id_throws[37] = var7;
      this.id_native = new rEz_1(this);
      this.id_class(rLp_1.WATER, 0.0F);
      this.id_class = new rLw_1(this, var2);
      this.id_break = new rLA(this, var2);
   }

   public void id_this(boolean var1) {
      this.id_protected = var1;
   }

   @Override
   protected boolean id_class(rdn_3 var1, rdn_3 var2) {
      if (var2.id_break() == rdy_3.kK) {
         return false;
      } else if (var2.id_break() == rdy_3.kY) {
         return var1.id_break() == rdy_3.kY ? var1.id_catch() < var2.id_catch() : false;
      } else {
         return var1.id_break() == rdy_3.kY ? true : super.id_class(var1, var2);
      }
   }

   @Override
   protected void id_class(rRh_1 var1) {
      if ((double)((Random)this.id_throws[40]).nextFloat() > 0.9) {
         int var2 = ((Random)this.id_throws[40]).nextInt(16);
         if (var2 < 10) {
            this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.kY));
         } else {
            this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.Xd));
         }
      }
   }

   @Override
   public boolean id_class(rRR var1) {
      return var1.id_protected(this);
   }

   public static boolean id_class(aI_2<rEx_1> var0, rRf_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      Optional var5 = var1.id_protected(var3);
      boolean var6 = var1.id_abstract() != rRO.PEACEFUL && id_class(var1, var3, var4) && (var2 == iO_2.SPAWNER || var1.id_break(var3).id_class(rlG_2.id_break));
      return !Objects.equals(var5, Optional.of(rYl_1.id_private)) && !Objects.equals(var5, Optional.of(rYl_1.id_native))
         ? var4.nextInt(40) == 0 && id_class(var1, var3) && var6
         : var4.nextInt(15) == 0 && var6;
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      var4 = super.id_class(var1, var2, var3, var4, var5);
      if (this.id_class(rXQ.OFFHAND).id_class() && ((Random)this.id_throws[40]).nextFloat() < 0.03F) {
         this.id_class(rXQ.OFFHAND, new rdn_3(rdy_3.kK));
         this.id_new[rXQ.OFFHAND.id_break()] = 2.0F;
      }

      return var4;
   }

   private static boolean id_class(rRg_1 var0, rfH_2 var1) {
      return var1.c_() < var0.id_short() - 5;
   }

   @Override
   public void p() {
      if (!((rYB)this.id_throws[7]).id_continue) {
         if (this.id_try() && this.rT() && this.su()) {
            this.id_final = this.id_class;
            this.id_native(true);
         } else {
            this.id_final = this.id_break;
            this.id_native(false);
         }
      }
   }

   @Override
   protected boolean sd() {
      return false;
   }

   @Override
   public boolean u() {
      return !this.Py();
   }

   @Override
   public void id_break(iB_2 var1, float var2) {
      rhD_2 var3 = new rhD_2((rYB)this.id_throws[7], this, new rdn_3(rdy_3.kY));
      double var4 = var1.rx() - this.rx();
      double var6 = var1.id_byte(0.3333333333333333) - var3.re();
      double var8 = var1.BO() - this.BO();
      double var10 = (double)rfU_2.id_class(var4 * var4 + var8 * var8);
      var3.id_byte(var4, var6 + var10 * 0.2F, var8, 1.6F, (float)(14 - ((rYB)this.id_throws[7]).id_abstract().id_class() * 4));
      this.id_class(rqn_3.BE, 1.0F, 1.0F / (this.Sa().nextFloat() * 0.4F + 0.8F));
      ((rYB)this.id_throws[7]).a_(var3);
   }

   @Override
   protected void id_throws() {
      this.id_package.id_class(1, new rEW(this, 1.0));
      this.id_package.id_class(2, new rEN(this, 1.0, 40, 10.0F));
      this.id_package.id_class(2, new rEd_1(this, 1.0, false));
      this.id_package.id_class(5, new rEk_1(this, 1.0));
      this.id_package.id_class(6, new rEQ(this, 1.0, ((rYB)this.id_throws[7]).id_short()));
      this.id_package.id_class(7, new rBU(this, 1.0));
      this.id_int.id_class(1, new rBc_1(this, rEx_1.class).id_class(rbG_2.class));
      this.id_int.id_class(2, new rBI<>(this, rhd_3.class, 10, true, false, this::id_private));
      this.id_int.id_class(3, new rBI<>(this, rsy_3.class, false));
      this.id_int.id_class(3, new rBI<>(this, rMZ.class, true));
      this.id_int.id_class(5, new rBI<>(this, rON.class, 10, true, false, rON.id_super));
   }

   @Override
   protected boolean L() {
      return false;
   }

   @Override
   protected rdn_3 sx() {
      return rdn_3.id_break;
   }

   protected boolean sk() {
      rLC var1 = this.id_public().id_finally();
      if (var1 != null) {
         rfH_2 var2 = var1.id_volatile();
         if (var2 != null) {
            double var3 = this.id_class((double)var2.b_(), (double)var2.c_(), (double)var2.d_());
            if (var3 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected rqA_2 id_static() {
      return this.rT() ? rqn_3.Br : rqn_3.Pi;
   }

   public boolean id_private(iB_2 var1) {
      return var1 == null ? false : !((rYB)this.id_throws[7]).id_strictfp() || var1.rT();
   }

   @Override
   public void id_private(rjU_2 var1) {
      if (this.id_try() && this.rT() && this.su()) {
         this.id_class(0.01F, var1);
         this.id_class(iG_2.SELF, this.rv());
         this.id_byte(this.rv().id_class(0.9));
      } else {
         super.id_private(var1);
      }
   }

   @Override
   protected rqA_2 BB() {
      return rqn_3.Bb;
   }

   @Override
   protected rqA_2 Bt() {
      return this.rT() ? rqn_3.BB : rqn_3.BP;
   }

   @Override
   protected rqA_2 sJ() {
      return rqn_3.BG;
   }

   boolean su() {
      if (this.id_protected) {
         return true;
      } else {
         iB_2 var1 = this.I_();
         return var1 != null && var1.rT();
      }
   }
}
