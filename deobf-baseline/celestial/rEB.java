package celestial;

import java.util.Random;
import java.util.function.Predicate;

public abstract class rEB extends rGr_1 {
   protected static final rut_3<Boolean> id_class = rmE_2.id_class(rEB.class, ruw_3.id_implements);
   static final Predicate<rsE_2> id_protected = var0 -> !var0.id_package() && var0.BM() && rdn_3.id_break(var0.id_protected(), rrEr_1.id_new());
   protected rrEr_1 id_break;
   private int id_super;
   private boolean id_this;
   private int id_else;

   protected rEB(aI_2<? extends rEB> var1, rYB var2) {
      super(var1, var2);
   }

   public void id_this(boolean var1) {
      this.id_this = var1;
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.id_this(this.BC() != aI_2.a || var3 != iO_2.NATURAL);
      return super.id_class(var1, var2, var3, var4, var5);
   }

   public void id_class(rrEr_1 var1) {
      this.id_break = var1;
   }

   public abstract void id_class(int var1, boolean var2);

   public void id_class(int var1) {
      this.id_super = var1;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Wave", this.id_super);
      var1.id_class("CanJoinRaid", this.id_this);
      if (this.id_break != null) {
         var1.id_break("RaidId", this.id_break.id_super());
      }
   }

   @Override
   public void id_default() {
      if ((rYB)this.id_throws[7] instanceof rrEm_1 && this.BM()) {
         rrEr_1 var1 = this.sx();
         if (this.L()) {
            if (var1 == null) {
               if (((rYB)this.id_throws[7]).r() % 20L == 0L) {
                  rrEr_1 var2 = ((rrEm_1)((rYB)this.id_throws[7])).id_interface(this.Bs());
                  if (var2 != null && rrEs_1.id_class(this, var2)) {
                     var2.id_class(var2.id_implements(), this, (rfH_2)null, true);
                  }
               }
            } else {
               iB_2 var8 = this.I_();
               if (var8 != null && (var8.BC() == aI_2.rM || var8.BC() == aI_2.id_import)) {
                  Integer var7 = 0;
                  this.id_private[33] = var7;
               }
            }
         }
      }

      super.id_default();
   }

   public boolean sd() {
      return this.sx() != null && this.sx().id_this();
   }

   @Override
   protected void id_break(rsE_2 var1) {
      rdn_3 var2 = var1.id_protected();
      boolean var3 = this.sd() && this.sx().id_class(this.sk()) != null;
      if (this.sd() && !var3 && rdn_3.id_break(var2, rrEr_1.id_new())) {
         rXQ var4 = rXQ.HEAD;
         rdn_3 var5 = this.id_class(var4);
         double var6 = (double)this.id_throws(var4);
         if (!var5.id_class() && (double)Math.max(((Random)this.id_throws[40]).nextFloat() - 0.1F, 0.0F) < var6) {
            this.a_(var5);
         }

         this.id_class(var1);
         this.id_class(var4, var2);
         this.id_class(var1, var2.id_char());
         var1.PD();
         this.sx().id_class(this.sk(), this);
         this.id_synchronized(true);
      } else {
         super.id_break(var1);
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_super = var1.id_private("Wave");
      this.id_this = var1.id_new("CanJoinRaid");
      if (var1.id_byte("RaidId", 3)) {
         if ((rYB)this.id_throws[7] instanceof rrEm_1) {
            this.id_break = ((rrEm_1)((rYB)this.id_throws[7])).k().id_class(var1.id_private("RaidId"));
         }

         if (this.id_break != null) {
            this.id_break.id_class(this.id_super, this, false);
            if (this.sF()) {
               this.id_break.id_class(this.id_super, this);
            }
         }
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.sd()) {
         this.sx().id_final();
      }

      return super.id_break(var1, var2);
   }

   public void id_break(int var1) {
      this.id_else = var1;
   }

   @Override
   public void id_break(rye_3 var1) {
      if ((rYB)this.id_throws[7] instanceof rrEm_1) {
         an_3 var2 = var1.id_extends();
         rrEr_1 var3 = this.sx();
         if (var3 != null) {
            if (this.sF()) {
               var3.id_break(this.sk());
            }

            if (var2 != null && var2.BC() == aI_2.rM) {
               var3.id_class(var2);
            }

            var3.id_class(this, false);
         }

         if (this.sF() && var3 == null && ((rrEm_1)((rYB)this.id_throws[7])).id_interface(this.Bs()) == null) {
            rdn_3 var4 = this.id_class(rXQ.HEAD);
            rhd_3 var5 = null;
            if (var2 instanceof rhd_3) {
               var5 = (rhd_3)var2;
            } else if (var2 instanceof rOH var6) {
               iB_2 var7 = var6.sF();
               if (var6.sZ() && var7 instanceof rhd_3) {
                  var5 = (rhd_3)var7;
               }
            }

            if (!var4.id_class() && rdn_3.id_break(var4, rrEr_1.id_new()) && var5 != null) {
               rLY var9 = var5.id_byte(rLD.id_char);
               int var10 = 1;
               if (var9 != null) {
                  var10 += var9.id_byte();
                  var5.id_class(rLD.id_char);
               } else {
                  var10--;
               }

               var10 = rfU_2.id_class(var10, 0, 4);
               rLY var8 = new rLY(rLD.id_char, 120000, var10, false, false, true);
               if (!((rYB)this.id_throws[7]).B().id_break(rRu_1.id_public)) {
                  var5.id_break(var8);
               }
            }
         }
      }

      super.id_break(var1);
   }

   public boolean L() {
      return this.id_this;
   }

   public rrEr_1 sx() {
      return this.id_break;
   }

   public int sk() {
      return this.id_super;
   }

   public void id_else(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_class, var1);
   }

   @Override
   public boolean id_private(double var1) {
      return this.sx() == null ? super.id_private(var1) : false;
   }

   @Override
   protected void id_final() {
      super.id_final();
      this.id_package.id_class(1, new rEG<>(this, this));
      this.id_package.id_class(3, new rBq_1<>(this));
      this.id_package.id_class(4, new rEE(this, 1.05F, 1));
      this.id_package.id_class(5, new rES(this, this));
   }

   @Override
   public boolean id_strictfp() {
      return super.id_strictfp() || this.sx() != null;
   }

   public int sz() {
      return this.id_else;
   }

   @Override
   protected void K_() {
      Integer var5 = (Integer)this.id_private[33] + 2;
      this.id_private[33] = var5;
   }

   @Override
   public boolean sJ() {
      return !this.sd();
   }

   public boolean sW() {
      return ((rmE_2)this.id_throws[49]).id_class(id_class);
   }

   public abstract rqA_2 sQ();

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, false);
   }
}
