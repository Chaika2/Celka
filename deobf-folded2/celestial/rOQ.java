package celestial;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public abstract class rOQ extends rbZ_2 {
   protected static final rut_3<Byte> id_return = rmE_2.id_class(rOQ.class, ruw_3.id_class);
   protected static final rut_3<Optional<UUID>> id_public = rmE_2.id_class(rOQ.class, ruw_3.id_package);
   private boolean id_super;

   protected rOQ(aI_2<? extends rOQ> var1, rYB var2) {
      super(var1, var2);
      this.sm();
   }

   public boolean id_class(iB_2 var1, iB_2 var2) {
      return true;
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 7) {
         this.id_synchronized(true);
      } else if (var1 == 6) {
         this.id_synchronized(false);
      } else {
         super.id_class(var1);
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.sv() != null) {
         var1.id_class("Owner", this.sv());
      }

      var1.id_class("Sitting", this.id_super);
   }

   protected void sm() {
   }

   @Override
   public void id_break(rye_3 var1) {
      if (!((rYB)this.id_throws[7]).id_continue && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_native) && this.sF() instanceof rhN_2) {
         this.sF().id_class(this.SW().id_break(), rqR_2.id_break);
      }

      super.id_break(var1);
   }

   public void id_break(UUID var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_public, Optional.ofNullable(var1));
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      UUID var2;
      if (var1.id_break("Owner")) {
         var2 = var1.id_class("Owner");
      } else {
         String var3 = var1.id_native("Owner");
         var2 = rCE.id_class(this.rC(), var3);
      }

      if (var2 != null) {
         try {
            this.id_break(var2);
            this.id_return(true);
         } catch (Throwable var4) {
            this.id_return(false);
         }
      }

      this.id_super = var1.id_new("Sitting");
      this.id_public(this.id_super);
   }

   public UUID sv() {
      return ((rmE_2)this.id_throws[49]).id_class(id_public).orElse((UUID)null);
   }

   @Override
   public boolean Sc() {
      return (((rmE_2)this.id_throws[49]).id_class(id_return) & 1) != 0;
   }

   @Override
   public boolean id_catch(iB_2 var1) {
      return this.id_private(var1) ? false : super.id_catch(var1);
   }

   public void id_goto(boolean var1) {
      this.id_super = var1;
   }

   public void id_case(rhd_3 var1) {
      this.id_return(true);
      this.id_break(var1.ro());
      if (var1 instanceof rhN_2) {
         Oo_1.id_public.id_class((rhN_2)var1, this);
      }
   }

   public void id_return(boolean var1) {
      byte var2 = ((rmE_2)this.id_throws[49]).id_class(id_return);
      if (var1) {
         ((rmE_2)this.id_throws[49]).id_break(id_return, (byte)(var2 | 4));
      } else {
         ((rmE_2)this.id_throws[49]).id_break(id_return, (byte)(var2 & -5));
      }

      this.sm();
   }

   public void id_public(boolean var1) {
      byte var2 = ((rmE_2)this.id_throws[49]).id_class(id_return);
      if (var1) {
         ((rmE_2)this.id_throws[49]).id_break(id_return, (byte)(var2 | 1));
      } else {
         ((rmE_2)this.id_throws[49]).id_break(id_return, (byte)(var2 & -2));
      }
   }

   @Override
   public boolean id_protected(rhd_3 var1) {
      return !this.z();
   }

   public boolean id_private(iB_2 var1) {
      return var1 == this.sF();
   }

   @Override
   public boolean id_final(an_3 var1) {
      if (this.sZ()) {
         iB_2 var2 = this.sF();
         if (var1 == var2) {
            return true;
         }

         if (var2 != null) {
            return var2.id_final(var1);
         }
      }

      return super.id_final(var1);
   }

   protected void id_synchronized(boolean var1) {
      rLO var2 = rLQ.id_long;
      if (!var1) {
         var2 = rLQ.id_double;
      }

      for (int var3 = 0; var3 < 7; var3++) {
         double var4 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
         double var6 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
         double var8 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
         ((rYB)this.id_throws[7]).id_class(var2, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), var4, var6, var8);
      }
   }

   @Override
   public rnM_2 BG() {
      if (this.sZ()) {
         iB_2 var1 = this.sF();
         if (var1 != null) {
            return var1.BG();
         }
      }

      return super.BG();
   }

   public boolean sL() {
      return this.id_super;
   }

   public boolean sZ() {
      return (((rmE_2)this.id_throws[49]).id_class(id_return) & 4) != 0;
   }

   public iB_2 sF() {
      try {
         UUID var1 = this.sv();
         return var1 == null ? null : ((rYB)this.id_throws[7]).id_class(var1);
      } catch (IllegalArgumentException var2) {
         return null;
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_return, (byte)0);
      ((rmE_2)this.id_throws[49]).id_class(id_public, Optional.empty());
   }
}
