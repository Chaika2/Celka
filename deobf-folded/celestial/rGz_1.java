package celestial;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public class rGz_1 extends rMu_1 implements rEK {
   private static final UUID id_this = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final ix_3 id_else = new ix_3(id_this, "Covered armor bonus", 20.0, id_3.ADDITION);
   protected static final rut_3<rpr_3> id_class = rmE_2.id_class(rGz_1.class, ruw_3.id_final);
   protected static final rut_3<Optional<rfH_2>> id_break = rmE_2.id_class(rGz_1.class, ruw_3.id_volatile);
   protected static final rut_3<Byte> id_protected = rmE_2.id_class(rGz_1.class, ruw_3.id_class);
   protected static final rut_3<Byte> id_super = rmE_2.id_class(rGz_1.class, ruw_3.id_class);
   private float id_synchronized;
   private float id_return;
   private rfH_2 id_public = null;
   private int id_goto;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return this.sQ() ? rqn_3.JW : rqn_3.Jk;
   }

   @Override
   public void id_byte(an_3 var1) {
   }

   @Override
   public void id_long() {
      if (!this.sQ()) {
         super.id_long();
      }
   }

   public rGz_1(aI_2<? extends rGz_1> var1, rYB var2) {
      super(var1, var2);
      this.id_finally = 5;
   }

   @Override
   public int S() {
      return 180;
   }

   @Override
   public void id_this() {
      super.id_this();
      rfH_2 var1 = ((rmE_2)this.id_throws[49]).id_class(id_break).orElse((rfH_2)null);
      if (var1 == null && !((rYB)this.id_throws[7]).id_continue) {
         var1 = this.Bs();
         ((rmE_2)this.id_throws[49]).id_break(id_break, Optional.of(var1));
      }

      if (this.Pm()) {
         var1 = null;
         float var2 = (Float)this.ra().id_throws[15];
         Float var17 = var2;
         this.id_throws[15] = var17;
         Float var18 = var2;
         this.id_private[23] = var18;
         Float var19 = var2;
         this.id_private[24] = var19;
         this.id_goto = 0;
      } else if (!((rYB)this.id_throws[7]).id_continue) {
         xc_3 var20 = ((rYB)this.id_throws[7]).id_byte(var1);
         if (!var20.id_catch()) {
            if (var20.id_class(xu_3.rc)) {
               rpr_3 var3 = var20.id_byte(kD_2.id_volatile);
               if (((rYB)this.id_throws[7]).id_finally(var1.id_break(var3))) {
                  var1 = var1.id_break(var3);
                  ((rmE_2)this.id_throws[49]).id_break(id_break, Optional.of(var1));
               } else {
                  this.L();
               }
            } else if (var20.id_class(xu_3.rS)) {
               rpr_3 var22 = var20.id_byte(ka_3.id_volatile);
               if (((rYB)this.id_throws[7]).id_finally(var1.id_break(var22))) {
                  var1 = var1.id_break(var22);
                  ((rmE_2)this.id_throws[49]).id_break(id_break, Optional.of(var1));
               } else {
                  this.L();
               }
            } else {
               this.L();
            }
         }

         rpr_3 var23 = this.n();
         if (!this.id_class(var1, var23)) {
            rpr_3 var4 = this.id_implements(var1);
            if (var4 != null) {
               ((rmE_2)this.id_throws[49]).id_break(id_class, var4);
            } else {
               this.L();
            }
         }
      }

      float var21 = (float)this.sx() * 0.01F;
      this.id_synchronized = this.id_return;
      if (this.id_return > var21) {
         this.id_return = rfU_2.id_class(this.id_return - 0.05F, var21, 1.0F);
      } else if (this.id_return < var21) {
         this.id_return = rfU_2.id_class(this.id_return + 0.05F, 0.0F, var21);
      }

      if (var1 != null) {
         if (((rYB)this.id_throws[7]).id_continue) {
            if (this.id_goto > 0 && this.id_public != null) {
               this.id_goto--;
            } else {
               this.id_public = var1;
            }
         }

         this.id_native((double)var1.b_() + 0.5, (double)var1.c_(), (double)var1.d_() + 0.5);
         double var24 = 0.5 - (double)rfU_2.id_class((0.5F + this.id_return) * (float) Math.PI) * 0.5;
         double var5 = 0.5 - (double)rfU_2.id_class((0.5F + this.id_synchronized) * (float) Math.PI) * 0.5;
         rpr_3 var7 = this.n().id_case();
         this.id_class(
            new rfl_3(this.rx() - 0.5, this.re(), this.BO() - 0.5, this.rx() + 0.5, this.re() + 1.0, this.BO() + 0.5)
               .id_break((double)var7.id_implements() * var24, (double)var7.id_finally() * var24, (double)var7.id_extends() * var24)
         );
         double var8 = var24 - var5;
         if (var8 > 0.0) {
            List var10 = ((rYB)this.id_throws[7]).id_class(this, this.rN());
            if (!var10.isEmpty()) {
               for (an_3 var12 : var10) {
                  if (!(var12 instanceof rGz_1) && !(Boolean)var12.id_throws[38]) {
                     var12.id_class(
                        iG_2.SHULKER, new rjU_2(var8 * (double)var7.id_implements(), var8 * (double)var7.id_finally(), var8 * (double)var7.id_extends())
                     );
                  }
               }
            }
         }
      }
   }

   public rpr_3 n() {
      return ((rmE_2)this.id_throws[49]).id_class(id_class);
   }

   @Override
   public float f() {
      return 0.0F;
   }

   @Override
   public void id_class(iG_2 var1, rjU_2 var2) {
      if (var1 == iG_2.SHULKER_BOX) {
         this.L();
      } else {
         super.id_class(var1, var2);
      }
   }

   private boolean id_class(rfH_2 var1, rpr_3 var2) {
      return ((rYB)this.id_throws[7]).id_class(var1.id_break(var2), this, var2.id_case())
         && ((rYB)this.id_throws[7]).a_(this, rqZ_2.id_class(var1, var2.id_case()));
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (id_break.equals(var1) && ((rYB)this.id_throws[7]).id_continue && !this.Pm()) {
         rfH_2 var2 = this.sJ();
         if (var2 != null) {
            if (this.id_public == null) {
               this.id_public = var2;
            } else {
               this.id_goto = 6;
            }

            this.id_native((double)var2.b_() + 0.5, (double)var2.c_(), (double)var2.d_() + 0.5);
         }
      }

      super.id_class(var1);
   }

   @Override
   public void id_class(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      Integer var15 = 0;
      this.id_private[45] = var15;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("AttachFace", (byte)((rmE_2)this.id_throws[49]).id_class(id_class).id_byte());
      var1.id_class("Peek", ((rmE_2)this.id_throws[49]).id_class(id_protected));
      var1.id_class("Color", ((rmE_2)this.id_throws[49]).id_class(id_super));
      rfH_2 var2 = this.sJ();
      if (var2 != null) {
         var1.id_break("APX", var2.b_());
         var1.id_break("APY", var2.c_());
         var1.id_break("APZ", var2.d_());
      }
   }

   public void id_class(int var1) {
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_byte(iQ_2.id_implements).id_protected(id_else);
         if (var1 == 0) {
            this.id_byte(iQ_2.id_implements).id_byte(id_else);
            this.id_class(rqn_3.Jx, 1.0F, 1.0F);
         } else {
            this.id_class(rqn_3.Jz, 1.0F, 1.0F);
         }
      }

      ((rmE_2)this.id_throws[49]).id_break(id_protected, (byte)var1);
   }

   @Override
   public void id_default() {
      super.id_default();
      this.id_byte(rjU_2.id_class);
      if (!this.c()) {
         Float var5 = 0.0F;
         this.id_private[24] = var5;
         Float var6 = 0.0F;
         this.id_private[23] = var6;
      }
   }

   public int sd() {
      return this.id_goto;
   }

   @Override
   public int r() {
      return 180;
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return 0.5F;
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.sQ()) {
         an_3 var3 = var1.id_finally();
         if (var3 instanceof rhm_3) {
            return false;
         }
      }

      if (super.id_break(var1, var2)) {
         if ((double)this.Ss() < (double)this.SK() * 0.5 && ((Random)this.id_throws[40]).nextInt(4) == 0) {
            this.L();
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      ((rmE_2)this.id_throws[49]).id_break(id_class, rpr_3.id_class(var1.id_case("AttachFace")));
      ((rmE_2)this.id_throws[49]).id_break(id_protected, var1.id_case("Peek"));
      ((rmE_2)this.id_throws[49]).id_break(id_super, var1.id_case("Color"));
      if (var1.id_throws("APX")) {
         int var2 = var1.id_private("APX");
         int var3 = var1.id_private("APY");
         int var4 = var1.id_private("APZ");
         ((rmE_2)this.id_throws[49]).id_break(id_break, Optional.of(new rfH_2(var2, var3, var4)));
      } else {
         ((rmE_2)this.id_throws[49]).id_break(id_break, Optional.empty());
      }
   }

   public static iz_3 id_throws() {
      return is_3.id_package().id_class(iQ_2.id_class, 30.0);
   }

   protected boolean L() {
      if (!this.c() && this.BM()) {
         rfH_2 var1 = this.Bs();

         for (int var2 = 0; var2 < 5; var2++) {
            rfH_2 var3 = var1.id_break(
               8 - ((Random)this.id_throws[40]).nextInt(17), 8 - ((Random)this.id_throws[40]).nextInt(17), 8 - ((Random)this.id_throws[40]).nextInt(17)
            );
            if (var3.c_() > 0
               && ((rYB)this.id_throws[7]).id_finally(var3)
               && ((rYB)this.id_throws[7]).id_instanceof().id_class(var3)
               && ((rYB)this.id_throws[7]).a_(this, new rfl_3(var3))) {
               rpr_3 var4 = this.id_implements(var3);
               if (var4 != null) {
                  ((rmE_2)this.id_throws[49]).id_break(id_class, var4);
                  this.id_class(rqn_3.JN, 1.0F, 1.0F);
                  ((rmE_2)this.id_throws[49]).id_break(id_break, Optional.of(var3));
                  ((rmE_2)this.id_throws[49]).id_break(id_protected, (byte)0);
                  this.id_byte((iB_2)null);
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public int sx() {
      return ((rmE_2)this.id_throws[49]).id_class(id_protected);
   }

   public rfH_2 sk() {
      return this.id_public;
   }

   public void id_finally(rfH_2 var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_break, Optional.ofNullable(var1));
   }

   protected rpr_3 id_implements(rfH_2 var1) {
      for (rpr_3 var5 : rpr_3.values()) {
         if (this.id_class(var1, var5)) {
            return var5;
         }
      }

      return null;
   }

   @Override
   protected rPf_1 id_new() {
      return new rGc_1(this, this);
   }

   @Override
   public void id_new(double var1, double var3, double var5) {
      super.id_new(var1, var3, var5);
      if ((rmE_2)this.id_throws[49] != null && (Integer)this.id_throws[41] != 0) {
         Optional var7 = ((rmE_2)this.id_throws[49]).id_class(id_break);
         Optional var8 = Optional.of(new rfH_2(var1, var3, var5));
         if (!var8.equals(var7)) {
            ((rmE_2)this.id_throws[49]).id_break(id_break, var8);
            ((rmE_2)this.id_throws[49]).id_break(id_protected, (byte)0);
            Boolean var13 = true;
            this.id_throws[57] = var13;
         }
      }
   }

   public float id_throw(float var1) {
      return rfU_2.id_catch(var1, this.id_synchronized, this.id_return);
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.JM;
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(1, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(4, new rGQ(this));
      this.id_package.id_class(7, new rGm_1(this));
      this.id_package.id_class(8, new rBC(this));
      this.id_int.id_class(1, new rBc_1(this).id_class());
      this.id_int.id_class(2, new rGN(this, this));
      this.id_int.id_class(3, new rGu_1(this));
   }

   public rxL_2 sz() {
      Byte var1 = ((rmE_2)this.id_throws[49]).id_class(id_super);
      return var1 != 16 && var1 <= 15 ? rxL_2.id_class(var1) : null;
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.HOSTILE;
   }

   @Override
   public boolean PU() {
      return this.BM();
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Jd;
   }

   public rfH_2 sJ() {
      return ((rmE_2)this.id_throws[49]).id_class(id_break).orElse((rfH_2)null);
   }

   public boolean sW() {
      return this.id_public != null && this.sJ() != null;
   }

   private boolean sQ() {
      return this.sx() == 0;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, rpr_3.DOWN);
      ((rmE_2)this.id_throws[49]).id_class(id_break, Optional.empty());
      ((rmE_2)this.id_throws[49]).id_class(id_protected, (byte)0);
      ((rmE_2)this.id_throws[49]).id_class(id_super, (byte)16);
   }
}
