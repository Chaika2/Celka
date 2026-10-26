package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class rhg_3 extends rhf_3 {
   private an_3 id_class;
   private rpr_3 id_break;
   private int id_protected;
   private double id_catch;
   private double id_private;
   private double id_implements;
   private UUID id_finally;

   public rhg_3(rYB var1, iB_2 var2, an_3 var3, rpB_2 var4) {
      this(aI_2.F, var1);
      this.id_break(var2);
      rfH_2 var5 = var2.Bs();
      double var6 = (double)var5.b_() + 0.5;
      double var8 = (double)var5.c_() + 0.5;
      double var10 = (double)var5.d_() + 0.5;
      this.id_class(var6, var8, var10, (Float)this.id_throws[15], (Float)this.id_throws[16]);
      this.id_class = var3;
      this.id_break = rpr_3.UP;
      this.id_class(var4);
   }

   public rhg_3(rYB var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(aI_2.F, var1);
      this.id_class(var2, var4, var6, (Float)this.id_throws[15], (Float)this.id_throws[16]);
      this.id_catch(var8, var10, var12);
   }

   public rhg_3(aI_2<? extends rhg_3> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.id_throws[38] = var7;
   }

   @Override
   public void id_this() {
      super.id_this();
      if (!((rYB)this.id_throws[7]).id_continue) {
         if (this.id_class == null && this.id_finally != null) {
            this.id_class = ((rrEm_1)((rYB)this.id_throws[7])).id_break(this.id_finally);
            if (this.id_class == null) {
               this.id_finally = null;
            }
         }

         if (this.id_class == null || !this.id_class.BM() || this.id_class instanceof rhd_3 && ((rhd_3)this.id_class).id_native()) {
            if (!this.rw()) {
               this.id_byte(this.rv().id_break(0.0, -0.04, 0.0));
            }
         } else {
            this.id_catch = rfU_2.id_class(this.id_catch * 1.025, -1.0, 1.0);
            this.id_private = rfU_2.id_class(this.id_private * 1.025, -1.0, 1.0);
            this.id_implements = rfU_2.id_class(this.id_implements * 1.025, -1.0, 1.0);
            rjU_2 var1 = this.rv();
            this.id_byte(
               var1.id_break((this.id_catch - var1.id_break) * 0.2, (this.id_private - var1.id_byte) * 0.2, (this.id_implements - var1.id_protected) * 0.2)
            );
         }

         rjG_2 var5 = rhj_3.id_class(this, this::id_class);
         if (var5.id_byte() != rjM_2.MISS) {
            this.id_class(var5);
         }
      }

      this.Px();
      rjU_2 var6 = this.rv();
      this.id_new(this.rx() + var6.id_break, this.re() + var6.id_byte, this.BO() + var6.id_protected);
      rhj_3.id_class(this, 0.5F);
      if (((rYB)this.id_throws[7]).id_continue) {
         ((rYB)this.id_throws[7])
            .id_class(rLQ.id_this, this.rx() - var6.id_break, this.re() - var6.id_byte + 0.15, this.BO() - var6.id_protected, 0.0, 0.0, 0.0);
      } else if (this.id_class != null && !(Boolean)this.id_class.id_throws[27]) {
         if (this.id_protected > 0) {
            this.id_protected--;
            if (this.id_protected == 0) {
               this.id_class(this.id_break == null ? null : this.id_break.id_final());
            }
         }

         if (this.id_break != null) {
            rfH_2 var2 = this.Bs();
            rpB_2 var3 = this.id_break.id_final();
            if (((rYB)this.id_throws[7]).id_class(var2.id_break(this.id_break), this)) {
               this.id_class(var3);
            } else {
               rfH_2 var4 = this.id_class.Bs();
               if (var3 == rpB_2.X && var2.b_() == var4.b_() || var3 == rpB_2.Z && var2.d_() == var4.d_() || var3 == rpB_2.Y && var2.c_() == var4.c_()) {
                  this.id_class(var3);
               }
            }
         }
      }
   }

   @Override
   protected void id_class(rjG_2 var1) {
      super.id_class(var1);
      this.PD();
   }

   @Override
   protected void id_class(rff_3 var1) {
      super.id_class(var1);
      ((rrEm_1)((rYB)this.id_throws[7])).id_class(rLQ.id_return, this.rx(), this.re(), this.BO(), 2, 0.2, 0.2, 0.2, 0.0);
      this.id_class(rqn_3.JX, 1.0F, 1.0F);
   }

   @Override
   protected boolean id_class(an_3 var1) {
      return super.id_class(var1) && !(Boolean)var1.id_throws[38];
   }

   @Override
   protected void id_class(rfo_3 var1) {
      super.id_class(var1);
      an_3 var2 = var1.id_class();
      an_3 var3 = this.id_else();
      iB_2 var4 = var3 instanceof iB_2 ? (iB_2)var3 : null;
      boolean var5 = var2.id_break(rye_3.id_class(this, var4).id_byte(), 4.0F);
      if (var5) {
         this.id_class(var4, var2);
         if (var2 instanceof iB_2) {
            ((iB_2)var2).id_break(new rLY(rLD.id_goto, 200));
         }
      }
   }

   @Override
   public boolean id_class(double var1) {
      return var1 < 16384.0;
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.id_class != null) {
         var1.id_class("Target", this.id_class.ro());
      }

      if (this.id_break != null) {
         var1.id_break("Dir", this.id_break.id_byte());
      }

      var1.id_break("Steps", this.id_protected);
      var1.id_class("TXD", this.id_catch);
      var1.id_class("TYD", this.id_private);
      var1.id_class("TZD", this.id_implements);
   }

   private void id_class(rpr_3 var1) {
      this.id_break = var1;
   }

   private void id_class(rpB_2 var1) {
      double var2 = 0.5;
      rfH_2 var4;
      if (this.id_class == null) {
         var4 = this.Bs().id_break();
      } else {
         var2 = (double)this.id_class.Bm() * 0.5;
         var4 = new rfH_2(this.id_class.rx(), this.id_class.re() + var2, this.id_class.BO());
      }

      double var5 = (double)var4.b_() + 0.5;
      double var7 = (double)var4.c_() + var2;
      double var9 = (double)var4.d_() + 0.5;
      rpr_3 var11 = null;
      if (!var4.id_class(this.Ps(), 2.0)) {
         rfH_2 var12 = this.Bs();
         ArrayList var13 = Lists.newArrayList();
         if (var1 != rpB_2.X) {
            if (var12.b_() < var4.b_() && ((rYB)this.id_throws[7]).id_finally(var12.id_extends())) {
               var13.add(rpr_3.EAST);
            } else if (var12.b_() > var4.b_() && ((rYB)this.id_throws[7]).id_finally(var12.id_byte())) {
               var13.add(rpr_3.WEST);
            }
         }

         if (var1 != rpB_2.Y) {
            if (var12.c_() < var4.c_() && ((rYB)this.id_throws[7]).id_finally(var12.id_final())) {
               var13.add(rpr_3.UP);
            } else if (var12.c_() > var4.c_() && ((rYB)this.id_throws[7]).id_finally(var12.id_break())) {
               var13.add(rpr_3.DOWN);
            }
         }

         if (var1 != rpB_2.Z) {
            if (var12.d_() < var4.d_() && ((rYB)this.id_throws[7]).id_finally(var12.id_protected())) {
               var13.add(rpr_3.SOUTH);
            } else if (var12.d_() > var4.d_() && ((rYB)this.id_throws[7]).id_finally(var12.id_private())) {
               var13.add(rpr_3.NORTH);
            }
         }

         var11 = rpr_3.id_class((Random)this.id_throws[40]);
         if (var13.isEmpty()) {
            for (int var14 = 5; !((rYB)this.id_throws[7]).id_finally(var12.id_break(var11)) && var14 > 0; var14--) {
               var11 = rpr_3.id_class((Random)this.id_throws[40]);
            }
         } else {
            var11 = (rpr_3)var13.get(((Random)this.id_throws[40]).nextInt(var13.size()));
         }

         var5 = this.rx() + (double)var11.id_implements();
         var7 = this.re() + (double)var11.id_finally();
         var9 = this.BO() + (double)var11.id_extends();
      }

      this.id_class(var11);
      double var25 = var5 - this.rx();
      double var26 = var7 - this.re();
      double var16 = var9 - this.BO();
      double var18 = (double)rfU_2.id_class(var25 * var25 + var26 * var26 + var16 * var16);
      if (var18 == 0.0) {
         this.id_catch = 0.0;
         this.id_private = 0.0;
         this.id_implements = 0.0;
      } else {
         this.id_catch = var25 / var18 * 0.15;
         this.id_private = var26 / var18 * 0.15;
         this.id_implements = var16 / var18 * 0.15;
      }

      Boolean var24 = true;
      this.id_throws[57] = var24;
      this.id_protected = 10 + ((Random)this.id_throws[40]).nextInt(5) * 10;
   }

   @Override
   protected void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_protected = var1.id_private("Steps");
      this.id_catch = var1.id_extends("TXD");
      this.id_private = var1.id_extends("TYD");
      this.id_implements = var1.id_extends("TZD");
      if (var1.id_byte("Dir", 99)) {
         this.id_break = rpr_3.id_class(var1.id_private("Dir"));
      }

      if (var1.id_break("Target")) {
         this.id_finally = var1.id_class("Target");
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_class(rqn_3.JJ, 1.0F, 1.0F);
         ((rrEm_1)((rYB)this.id_throws[7])).id_class(rLQ.id_catch, this.rx(), this.re(), this.BO(), 15, 0.2, 0.2, 0.2, 0.0);
         this.PD();
      }

      return true;
   }

   @Override
   public boolean Pz() {
      return false;
   }

   @Override
   public void rA() {
      if (((rYB)this.id_throws[7]).id_abstract() == rRO.PEACEFUL) {
         this.PD();
      }
   }

   @Override
   public float rX() {
      return 1.0F;
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.HOSTILE;
   }

   @Override
   public boolean rY() {
      return true;
   }

   @Override
   protected void m_() {
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
