package celestial;

import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class rsE_2 extends an_3 {
   private static final rut_3<rdn_3> id_break = rmE_2.id_class(rsE_2.class, ruw_3.id_catch);
   private int id_protected;
   private int id_catch;
   private int id_private = 5;
   private UUID id_implements;
   private UUID id_finally;
   public final float id_class;

   public float id_byte(float var1) {
      return ((float)this.id_catch() + var1) / 20.0F + this.id_class;
   }

   public void id_byte(UUID var1) {
      this.id_implements = var1;
   }

   public void id_int() {
      this.id_protected = -6000;
   }

   public rsE_2(aI_2<? extends rsE_2> var1, rYB var2) {
      super(var1, var2);
      this.id_class = (float)(Math.random() * Math.PI * 2.0);
   }

   public rsE_2(rYB var1, double var2, double var4, double var6) {
      this(aI_2.id_short, var1);
      this.id_new(var2, var4, var6);
      Float var12 = ((Random)this.id_throws[40]).nextFloat() * 360.0F;
      this.id_throws[15] = var12;
      this.id_catch(((Random)this.id_throws[40]).nextDouble() * 0.2 - 0.1, 0.2, ((Random)this.id_throws[40]).nextDouble() * 0.2 - 0.1);
   }

   public rsE_2(rYB var1, double var2, double var4, double var6, rdn_3 var8) {
      this(var1, var2, var4, var6);
      this.id_break(var8);
   }

   private rsE_2(rsE_2 var1) {
      super(var1.BC(), (rYB)var1.id_throws[7]);
      this.id_break(var1.id_protected().id_implements());
      this.id_native(var1);
      this.id_protected = var1.id_protected;
      this.id_class = var1.id_class;
   }

   public void id_this() {
      if (this.id_protected().id_class()) {
         this.PD();
      } else {
         super.id_this();
         if (this.id_catch > 0 && this.id_catch != 32767) {
            this.id_catch--;
         }

         Double var11 = this.rx();
         this.id_throws[8] = var11;
         Double var12 = this.re();
         this.id_throws[9] = var12;
         Double var13 = this.BO();
         this.id_throws[10] = var13;
         rjU_2 var1 = this.rv();
         float var2 = this.Bx() - 0.11111111F;
         if (this.rT() && this.id_break(rlG_2.id_break) > (double)var2) {
            this.id_super();
         } else if (this.ry() && this.id_break(rlG_2.id_byte) > (double)var2) {
            this.id_else();
         } else if (!this.rw()) {
            this.id_byte(this.rv().id_break(0.0, -0.04, 0.0));
         }

         if (((rYB)this.id_throws[7]).id_continue) {
            Boolean var14 = false;
            this.id_throws[38] = var14;
         } else {
            Boolean var15 = !((rYB)this.id_throws[7]).id_throws(this);
            this.id_throws[38] = var15;
            if ((Boolean)this.id_throws[38]) {
               this.id_protected(this.rx(), (this.rN().id_break + this.rN().id_throws) / 2.0, this.BO());
            }
         }

         if (!(Boolean)this.id_throws[20] || id_case(this.rv()) > 1.0E-5F || ((Integer)this.id_throws[41] + this.V()) % 4 == 0) {
            this.id_class(iG_2.SELF, this.rv());
            float var3 = 0.98F;
            if ((Boolean)this.id_throws[20]) {
               var3 = ((rYB)this.id_throws[7]).id_byte(new rfH_2(this.rx(), this.re() - 1.0, this.BO())).id_break().id_final() * 0.98F;
            }

            this.id_byte(this.rv().id_throws((double)var3, 0.98, (double)var3));
            if ((Boolean)this.id_throws[20]) {
               rjU_2 var4 = this.rv();
               if (var4.id_byte < 0.0) {
                  this.id_byte(var4.id_throws(1.0, -0.5, 1.0));
               }
            }
         }

         boolean var18 = rfU_2.id_byte((Double)this.id_throws[8]) != rfU_2.id_byte(this.rx())
            || rfU_2.id_byte((Double)this.id_throws[9]) != rfU_2.id_byte(this.re())
            || rfU_2.id_byte((Double)this.id_throws[10]) != rfU_2.id_byte(this.BO());
         int var19 = var18 ? 2 : 40;
         if ((Integer)this.id_throws[41] % var19 == 0) {
            if (((rYB)this.id_throws[7]).id_break(this.Bs()).id_class(rlG_2.id_byte) && !this.q()) {
               this.id_class(rqn_3.Sf, 0.4F, 2.0F + ((Random)this.id_throws[40]).nextFloat() * 0.4F);
            }

            if (!((rYB)this.id_throws[7]).id_continue && this.id_public()) {
               this.id_return();
            }
         }

         if (this.id_protected != -32768) {
            this.id_protected++;
         }

         Boolean var16 = (Boolean)this.id_throws[57] | this.PM();
         this.id_throws[57] = var16;
         if (!((rYB)this.id_throws[7]).id_continue) {
            double var5 = this.rv().id_protected(var1).id_catch();
            if (var5 > 0.01) {
               Boolean var17 = true;
               this.id_throws[57] = var17;
            }
         }

         if (!((rYB)this.id_throws[7]).id_continue && this.id_protected >= 6000) {
            this.PD();
         }
      }
   }

   private static void id_class(rsE_2 var0, rdn_3 var1, rsE_2 var2, rdn_3 var3) {
      id_class(var0, var1, var3);
      var0.id_catch = Math.max(var0.id_catch, var2.id_catch);
      var0.id_protected = Math.min(var0.id_protected, var2.id_protected);
      if (var3.id_class()) {
         var2.PD();
      }
   }

   private static void id_class(rsE_2 var0, rdn_3 var1, rdn_3 var2) {
      rdn_3 var3 = id_class(var1, var2, 64);
      var0.id_break(var3);
   }

   public static rdn_3 id_class(rdn_3 var0, rdn_3 var1, int var2) {
      int var3 = Math.min(Math.min(var0.id_byte(), var2) - var0.id_char(), var1.id_char());
      rdn_3 var4 = var0.id_implements();
      var4.id_case(var3);
      var1.id_catch(var3);
      return var4;
   }

   public an_3 id_class(rrEm_1 var1) {
      an_3 var2 = super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue && var2 instanceof rsE_2) {
         ((rsE_2)var2).id_return();
      }

      return var2;
   }

   public void id_class(rcd_3 var1) {
      var1.id_class("Health", (short)this.id_private);
      var1.id_class("Age", (short)this.id_protected);
      var1.id_class("PickupDelay", (short)this.id_catch);
      if (this.id_case() != null) {
         var1.id_class("Thrower", this.id_case());
      }

      if (this.id_throws() != null) {
         var1.id_class("Owner", this.id_throws());
      }

      if (!this.id_protected().id_class()) {
         var1.id_class("Item", this.id_protected().id_break(new rcd_3()));
      }
   }

   public void id_class(int var1) {
      this.id_catch = var1;
   }

   public void id_class(rut_3<?> var1) {
      super.id_class(var1);
      if (id_break.equals(var1)) {
         this.id_protected().id_class(this);
      }
   }

   private void id_class(rsE_2 var1) {
      rdn_3 var2 = this.id_protected();
      rdn_3 var3 = var1.id_protected();
      if (Objects.equals(this.id_throws(), var1.id_throws()) && id_class(var2, var3)) {
         if (var3.id_char() < var2.id_char()) {
            id_class(this, var2, var1, var3);
         } else {
            id_class(var1, var3, this, var2);
         }
      }
   }

   public static boolean id_class(rdn_3 var0, rdn_3 var1) {
      if (var1.id_break() != var0.id_break()) {
         return false;
      } else if (var1.id_char() + var0.id_char() > var1.id_byte()) {
         return false;
      } else {
         return var1.id_final() ^ var0.id_final() ? false : !var1.id_final() || var1.id_package().equals(var0.id_package());
      }
   }

   public rgP_2 g() {
      rgP_2 var1 = this.rD();
      return (rgP_2)(var1 != null ? var1 : new rgn_3(this.id_protected().id_finally()));
   }

   public boolean q() {
      return this.id_protected().id_break().id_else() || super.q();
   }

   public void id_break(UUID var1) {
      this.id_finally = var1;
   }

   public void id_break(rdn_3 var1) {
      this.BQ().id_break(id_break, var1);
   }

   public void id_break(rcd_3 var1) {
      this.id_private = var1.id_catch("Health");
      this.id_protected = var1.id_catch("Age");
      if (var1.id_throws("PickupDelay")) {
         this.id_catch = var1.id_catch("PickupDelay");
      }

      if (var1.id_break("Owner")) {
         this.id_finally = var1.id_class("Owner");
      }

      if (var1.id_break("Thrower")) {
         this.id_implements = var1.id_class("Thrower");
      }

      rcd_3 var2 = var1.id_int("Item");
      this.id_break(rdn_3.id_class(var2));
      if (this.id_protected().id_class()) {
         this.PD();
      }
   }

   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else if (!this.id_protected().id_class() && this.id_protected().id_break() == rdy_3.dQ && var1.id_protected()) {
         return false;
      } else if (!this.id_protected().id_break().id_class(var1)) {
         return false;
      } else {
         this.rf();
         this.id_private = (int)((float)this.id_private - var2);
         if (this.id_private <= 0) {
            this.PD();
         }

         return false;
      }
   }

   public UUID id_throws() {
      return this.id_finally;
   }

   public boolean rt() {
      return false;
   }

   public int id_catch() {
      return this.id_protected;
   }

   public float id_extends(float var1) {
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().Z().aJ_()) {
         return (float)(rrjZ_2.id_private(this, var1) - 0.1F);
      } else {
         float var2 = rfU_2.id_class(((float)this.id_catch() + var1) / 10.0F + this.id_class) * 0.1F + 0.1F;
         return (float)(rrjZ_2.id_private(this, var1) + (double)var2) + 0.1F;
      }
   }

   public UUID id_case() {
      return this.id_implements;
   }

   public rsE_2 id_continue() {
      return new rsE_2(this);
   }

   private void id_else() {
      rjU_2 var1 = this.rv();
      this.id_catch(var1.id_break * 0.95F, var1.id_byte + (double)(var1.id_byte < 0.06F ? 5.0E-4F : 0.0F), var1.id_protected * 0.95F);
   }

   public void id_implements() {
      this.id_catch = 0;
   }

   public void id_new() {
      this.id_final();
      this.id_protected = 5999;
   }

   public boolean id_package() {
      return this.id_catch > 0;
   }

   private void id_return() {
      if (this.id_public()) {
         for (rsE_2 var2 : ((rYB)this.id_throws[7]).id_class(rsE_2.class, this.rN().id_byte(0.5, 0.0, 0.5), var1 -> var1 != this && var1.id_public())) {
            if (var2.id_public()) {
               this.id_class(var2);
               if ((Boolean)this.id_throws[27]) {
                  break;
               }
            }
         }
      }
   }

   private void id_super() {
      rjU_2 var1 = this.rv();
      this.id_catch(var1.id_break * 0.99F, var1.id_byte + (double)(var1.id_byte < 0.06F ? 5.0E-4F : 0.0F), var1.id_protected * 0.99F);
   }

   private boolean id_public() {
      rdn_3 var1 = this.id_protected();
      return this.BM() && this.id_catch != 32767 && this.id_protected != -32768 && this.id_protected < 6000 && var1.id_char() < var1.id_byte();
   }

   public rdn_3 id_protected() {
      return (rdn_3)this.BQ().id_class(id_break);
   }

   public void id_private() {
      this.id_catch = 10;
   }

   public void id_final() {
      this.id_catch = 32767;
   }

   protected boolean PK() {
      return false;
   }

   protected void m_() {
      this.BQ().id_class(id_break, rdn_3.id_break);
   }

   public ruS_2<?> p_() {
      return new rFJ(this);
   }

   public void c_(rhd_3 var1) {
      if (!((rYB)this.id_throws[7]).id_continue) {
         rdn_3 var2 = this.id_protected();
         rdb_3 var3 = var2.id_break();
         int var4 = var2.id_char();
         if (this.id_catch == 0 && (this.id_finally == null || this.id_finally.equals(var1.ro())) && ((rhz_3)var1.id_implements[1]).id_throws(var2)) {
            var1.id_class(this, var4);
            if (var2.id_class()) {
               this.PD();
               var2.id_throws(var4);
            }

            var1.id_class(rlB_2.id_throws.id_break(var3), var4);
            var1.id_class(this);
         }
      }
   }
}
