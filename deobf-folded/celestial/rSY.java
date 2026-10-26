package celestial;

import java.util.List;
import java.util.function.Predicate;

public class rSY extends iB_2 {
   private static final rjO_2 id_final = new rjO_2(0.0F, 0.0F, 0.0F);
   private static final rjO_2 id_package = new rjO_2(0.0F, 0.0F, 0.0F);
   private static final rjO_2 id_int = new rjO_2(-10.0F, 0.0F, -10.0F);
   private static final rjO_2 id_new = new rjO_2(-15.0F, 0.0F, 10.0F);
   private static final rjO_2 id_continue = new rjO_2(-1.0F, 0.0F, -1.0F);
   private static final rjO_2 id_super = new rjO_2(1.0F, 0.0F, 1.0F);
   private static final ap_3 id_this = new ap_3(0.0F, 0.0F, true);
   private static final ap_3 id_else = aI_2.id_break.id_volatile().id_class(0.5F);
   public static final rut_3<Byte> id_class = rmE_2.id_class(rSY.class, ruw_3.id_class);
   public static final rut_3<rjO_2> id_break = rmE_2.id_class(rSY.class, ruw_3.id_extends);
   public static final rut_3<rjO_2> id_protected = rmE_2.id_class(rSY.class, ruw_3.id_extends);
   public static final rut_3<rjO_2> id_implements = rmE_2.id_class(rSY.class, ruw_3.id_extends);
   public static final rut_3<rjO_2> id_finally = rmE_2.id_class(rSY.class, ruw_3.id_extends);
   public static final rut_3<rjO_2> id_extends = rmE_2.id_class(rSY.class, ruw_3.id_extends);
   public static final rut_3<rjO_2> id_native = rmE_2.id_class(rSY.class, ruw_3.id_extends);
   private static final Predicate<an_3> id_synchronized = var0 -> var0 instanceof rsJ_2 && ((rsJ_2)var0).id_final() == rsd_3.RIDEABLE;
   private final rqs_3<rdn_3> id_return = rqs_3.id_class(2, rdn_3.id_break);
   private final rqs_3<rdn_3> id_public = rqs_3.id_class(4, rdn_3.id_break);
   private boolean id_goto;
   public long id_volatile;
   private int id_while;
   private rjO_2 id_try = id_final;
   private rjO_2 id_instanceof = id_package;
   private rjO_2 id_throw = id_int;
   private rjO_2 id_interface = id_new;
   private rjO_2 id_char = id_continue;
   private rjO_2 id_abstract = id_super;

   @Override
   protected rqA_2 id_byte(int var1) {
      return rqn_3.id_switch;
   }

   public void id_byte(rjO_2 var1) {
      this.id_throw = var1;
      ((rmE_2)this.id_throws[49]).id_break(id_implements, var1);
   }

   private void id_byte(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_class, this.id_class(((rmE_2)this.id_throws[49]).id_class(id_class), 4, var1));
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.r;
   }

   public rjO_2 id_int() {
      return this.id_throw;
   }

   public rSY(aI_2<? extends rSY> var1, rYB var2) {
      super(var1, var2);
      Float var7 = 0.0F;
      this.id_throws[37] = var7;
   }

   public rSY(rYB var1, double var2, double var4, double var6) {
      this(aI_2.id_break, var1);
      this.id_new(var2, var4, var6);
   }

   @Override
   public void id_this() {
      super.id_this();
      rjO_2 var1 = ((rmE_2)this.id_throws[49]).id_class(id_break);
      if (!this.id_try.equals(var1)) {
         this.id_class(var1);
      }

      rjO_2 var2 = ((rmE_2)this.id_throws[49]).id_class(id_protected);
      if (!this.id_instanceof.equals(var2)) {
         this.id_break(var2);
      }

      rjO_2 var3 = ((rmE_2)this.id_throws[49]).id_class(id_implements);
      if (!this.id_throw.equals(var3)) {
         this.id_byte(var3);
      }

      rjO_2 var4 = ((rmE_2)this.id_throws[49]).id_class(id_finally);
      if (!this.id_interface.equals(var4)) {
         this.id_protected(var4);
      }

      rjO_2 var5 = ((rmE_2)this.id_throws[49]).id_class(id_extends);
      if (!this.id_char.equals(var5)) {
         this.id_throws(var5);
      }

      rjO_2 var6 = ((rmE_2)this.id_throws[49]).id_class(id_native);
      if (!this.id_abstract.equals(var6)) {
         this.id_case(var6);
      }
   }

   private void id_class(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_class, this.id_class(((rmE_2)this.id_throws[49]).id_class(id_class), 1, var1));
   }

   @Override
   public boolean id_class(double var1) {
      double var3 = this.rN().id_class() * 4.0;
      if (Double.isNaN(var3) || var3 == 0.0) {
         var3 = 4.0;
      }

      var3 *= 64.0;
      return var1 < var3 * var3;
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 32) {
         if (((rYB)this.id_throws[7]).id_continue) {
            ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), rqn_3.r, this.Pr(), 0.3F, 1.0F, false);
            this.id_volatile = ((rYB)this.id_throws[7]).r();
         }
      } else {
         super.id_class(var1);
      }
   }

   private boolean id_class(rhd_3 var1, rXQ var2, rdn_3 var3, rpm_3 var4) {
      rdn_3 var5 = this.id_class(var2);
      if (!var5.id_class() && (this.id_while & 1 << var2.id_byte() + 8) != 0) {
         return false;
      } else if (var5.id_class() && (this.id_while & 1 << var2.id_byte() + 16) != 0) {
         return false;
      } else if (((rhx_3)var1.id_implements[18]).id_protected && var5.id_class() && !var3.id_class()) {
         rdn_3 var7 = var3.id_implements();
         var7.id_throws(1);
         this.id_class(var2, var7);
         return true;
      } else if (var3.id_class() || var3.id_char() <= 1) {
         this.id_class(var2, var3);
         var1.id_class(var4, var5);
         return true;
      } else if (!var5.id_class()) {
         return false;
      } else {
         rdn_3 var6 = var3.id_implements();
         var6.id_throws(1);
         this.id_class(var2, var6);
         var3.id_catch(1);
         return true;
      }
   }

   @Override
   public ryZ_2 id_class(rhd_3 var1, rjU_2 var2, rpm_3 var3) {
      rdn_3 var4 = var1.id_protected(var3);
      if (this.id_implements() || var4.id_break() == rdy_3.dj) {
         return ryZ_2.PASS;
      } else if (var1.id_native()) {
         return ryZ_2.SUCCESS;
      } else if (((rYB)var1.id_throws[7]).id_continue) {
         return ryZ_2.CONSUME;
      } else {
         rXQ var5 = is_3.id_finally(var4);
         if (var4.id_class()) {
            rXQ var6 = this.id_finally(var2);
            rXQ var7 = this.id_protected(var6) ? var5 : var6;
            if (this.id_byte(var7) && this.id_class(var1, var7, var4, var3)) {
               return ryZ_2.SUCCESS;
            }
         } else {
            if (this.id_protected(var5)) {
               return ryZ_2.FAIL;
            }

            if (var5.id_class() == rXN.HAND && !this.id_catch()) {
               return ryZ_2.FAIL;
            }

            if (this.id_class(var1, var5, var4, var3)) {
               return ryZ_2.SUCCESS;
            }
         }

         return ryZ_2.PASS;
      }
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (id_class.equals(var1)) {
         this.q_();
         Boolean var6 = !this.id_implements();
         this.id_throws[2] = var6;
      }

      super.id_class(var1);
   }

   @Override
   public void id_class(rrEm_1 var1, rSg_1 var2) {
   }

   public void id_class(rjO_2 var1) {
      this.id_try = var1;
      ((rmE_2)this.id_throws[49]).id_break(id_break, var1);
   }

   private byte id_class(byte var1, int var2, boolean var3) {
      if (var3) {
         var1 = (byte)(var1 | var2);
      } else {
         var1 = (byte)(var1 & ~var2);
      }

      return var1;
   }

   @Override
   public void id_class(rXQ var1, rdn_3 var2) {
      switch (var1.id_class()) {
         case HAND:
            this.id_break(var2);
            this.id_return.set(var1.id_break(), var2);
            break;
         case ARMOR:
            this.id_break(var2);
            this.id_public.set(var1.id_break(), var2);
      }
   }

   @Override
   public boolean id_class(int var1, rdn_3 var2) {
      rXQ var3;
      if (var1 == 98) {
         var3 = rXQ.MAINHAND;
      } else if (var1 == 99) {
         var3 = rXQ.OFFHAND;
      } else if (var1 == 100 + rXQ.HEAD.id_break()) {
         var3 = rXQ.HEAD;
      } else if (var1 == 100 + rXQ.CHEST.id_break()) {
         var3 = rXQ.CHEST;
      } else if (var1 == 100 + rXQ.LEGS.id_break()) {
         var3 = rXQ.LEGS;
      } else {
         if (var1 != 100 + rXQ.FEET.id_break()) {
            return false;
         }

         var3 = rXQ.FEET;
      }

      if (!var2.id_class() && !is_3.id_byte(var3, var2) && var3 != rXQ.HEAD) {
         return false;
      } else {
         this.id_class(var3, var2);
         return true;
      }
   }

   @Override
   public rdn_3 id_class(rXQ var1) {
      switch (var1.id_class()) {
         case HAND:
            return this.id_return.get(var1.id_break());
         case ARMOR:
            return this.id_public.get(var1.id_break());
         default:
            return rdn_3.id_break;
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      rcy_3 var2 = new rcy_3();

      for (rdn_3 var4 : this.id_public) {
         rcd_3 var5 = new rcd_3();
         if (!var4.id_class()) {
            var4.id_break(var5);
         }

         var2.add(var5);
      }

      var1.id_class("ArmorItems", var2);
      rcy_3 var7 = new rcy_3();

      for (rdn_3 var9 : this.id_return) {
         rcd_3 var6 = new rcd_3();
         if (!var9.id_class()) {
            var9.id_break(var6);
         }

         var7.add(var6);
      }

      var1.id_class("HandItems", var7);
      var1.id_class("Invisible", this.Pp());
      var1.id_class("Small", this.id_throws());
      var1.id_class("ShowArms", this.id_catch());
      var1.id_break("DisabledSlots", this.id_while);
      var1.id_class("NoBasePlate", this.id_private());
      if (this.id_implements()) {
         var1.id_class("Marker", this.id_implements());
      }

      var1.id_class("Pose", this.id_public());
   }

   @Override
   public void j() {
      this.PD();
   }

   protected float id_break(float var1, float var2) {
      Float var7 = (Float)this.id_throws[17];
      this.id_private[24] = var7;
      Float var8 = (Float)this.id_throws[15];
      this.id_private[23] = var8;
      return 0.0F;
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("ArmorItems", 9)) {
         rcy_3 var2 = var1.id_protected("ArmorItems", 10);

         for (int var3 = 0; var3 < this.id_public.size(); var3++) {
            this.id_public.set(var3, rdn_3.id_class(var2.id_class(var3)));
         }
      }

      if (var1.id_byte("HandItems", 9)) {
         rcy_3 var9 = var1.id_protected("HandItems", 10);

         for (int var11 = 0; var11 < this.id_return.size(); var11++) {
            this.id_return.set(var11, rdn_3.id_class(var9.id_class(var11)));
         }
      }

      this.id_package(var1.id_new("Invisible"));
      this.id_class(var1.id_new("Small"));
      this.id_byte(var1.id_new("ShowArms"));
      this.id_while = var1.id_private("DisabledSlots");
      this.id_protected(var1.id_new("NoBasePlate"));
      this.id_throws(var1.id_new("Marker"));
      Boolean var8 = !this.id_else();
      this.id_throws[38] = var8;
      rcd_3 var10 = var1.id_int("Pose");
      this.id_catch(var10);
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return var2.id_break * (this.n_() ? 0.5F : 0.9F);
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (((rYB)this.id_throws[7]).id_continue || (Boolean)this.id_throws[27]) {
         return false;
      } else if (rye_3.id_volatile.equals(var1)) {
         this.PD();
         return false;
      } else if (this.id_class(var1) || this.id_goto || this.id_implements()) {
         return false;
      } else if (var1.id_protected()) {
         this.id_catch(var1);
         this.PD();
         return false;
      } else if (rye_3.id_class.equals(var1)) {
         if (this.Pz()) {
            this.id_case(var1, 0.15F);
         } else {
            this.id_case(5);
         }

         return false;
      } else if (rye_3.id_byte.equals(var1) && this.Ss() > 0.5F) {
         this.id_case(var1, 4.0F);
         return false;
      } else {
         boolean var3 = var1.id_finally() instanceof rhm_3;
         boolean var4 = var3 && ((rhm_3)var1.id_finally()).id_package() > 0;
         boolean var5 = "player".equals(var1.id_new());
         if (!var5 && !var3) {
            return false;
         } else if (var1.id_extends() instanceof rhd_3 && !((rhx_3)((rhd_3)var1.id_extends()).id_implements[18]).id_throws) {
            return false;
         } else if (var1.id_synchronized()) {
            this.id_instanceof();
            this.id_goto();
            this.PD();
            return var4;
         } else {
            long var6 = ((rYB)this.id_throws[7]).r();
            if (var6 - this.id_volatile > 5L && !var3) {
               ((rYB)this.id_throws[7]).id_class(this, (byte)32);
               this.id_volatile = var6;
            } else {
               this.id_case(var1);
               this.id_goto();
               this.PD();
            }

            return true;
         }
      }
   }

   public void id_break(rjO_2 var1) {
      this.id_instanceof = var1;
      ((rmE_2)this.id_throws[49]).id_break(id_protected, var1);
   }

   public boolean id_throws() {
      return (((rmE_2)this.id_throws[49]).id_class(id_class) & 1) != 0;
   }

   public void id_throws(rjO_2 var1) {
      this.id_char = var1;
      ((rmE_2)this.id_throws[49]).id_break(id_extends, var1);
   }

   private void id_throws(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_class, this.id_class(((rmE_2)this.id_throws[49]).id_class(id_class), 16, var1));
   }

   @Override
   public boolean id_throws(rdn_3 var1) {
      rXQ var2 = is_3.id_finally(var1);
      return this.id_class(var2).id_class() && !this.id_protected(var2);
   }

   @Override
   public boolean id_finally(an_3 var1) {
      return var1 instanceof rhd_3 && !((rYB)this.id_throws[7]).id_class((rhd_3)var1, this.Bs());
   }

   private rXQ id_finally(rjU_2 var1) {
      rXQ var2 = rXQ.MAINHAND;
      boolean var3 = this.id_throws();
      double var4 = var3 ? var1.id_byte * 2.0 : var1.id_byte;
      rXQ var6 = rXQ.FEET;
      if (var4 >= 0.1 && var4 < 0.1 + (var3 ? 0.8 : 0.45) && this.id_byte(var6)) {
         var2 = rXQ.FEET;
      } else if (var4 >= 0.9 + (var3 ? 0.3 : 0.0) && var4 < 0.9 + (var3 ? 1.0 : 0.7) && this.id_byte(rXQ.CHEST)) {
         var2 = rXQ.CHEST;
      } else if (var4 >= 0.4 && var4 < 0.4 + (var3 ? 1.0 : 0.8) && this.id_byte(rXQ.LEGS)) {
         var2 = rXQ.LEGS;
      } else if (var4 >= 1.6 && this.id_byte(rXQ.HEAD)) {
         var2 = rXQ.HEAD;
      } else if (!this.id_byte(rXQ.MAINHAND) && this.id_byte(rXQ.OFFHAND)) {
         var2 = rXQ.OFFHAND;
      }

      return var2;
   }

   private void id_catch(rcd_3 var1) {
      rcy_3 var2 = var1.id_protected("Head", 5);
      this.id_class(var2.isEmpty() ? id_final : new rjO_2(var2));
      rcy_3 var3 = var1.id_protected("Body", 5);
      this.id_break(var3.isEmpty() ? id_package : new rjO_2(var3));
      rcy_3 var4 = var1.id_protected("LeftArm", 5);
      this.id_byte(var4.isEmpty() ? id_int : new rjO_2(var4));
      rcy_3 var5 = var1.id_protected("RightArm", 5);
      this.id_protected(var5.isEmpty() ? id_new : new rjO_2(var5));
      rcy_3 var6 = var1.id_protected("LeftLeg", 5);
      this.id_throws(var6.isEmpty() ? id_continue : new rjO_2(var6));
      rcy_3 var7 = var1.id_protected("RightLeg", 5);
      this.id_case(var7.isEmpty() ? id_super : new rjO_2(var7));
   }

   public boolean id_catch() {
      return (((rmE_2)this.id_throws[49]).id_class(id_class) & 4) != 0;
   }

   private void id_catch(rye_3 var1) {
      this.id_instanceof();
      this.id_protected(var1);

      for (int var2 = 0; var2 < this.id_return.size(); var2++) {
         rdn_3 var3 = this.id_return.get(var2);
         if (!var3.id_class()) {
            xd_3.id_class((rYB)this.id_throws[7], this.Bs().id_final(), var3);
            this.id_return.set(var2, rdn_3.id_break);
         }
      }

      for (int var4 = 0; var4 < this.id_public.size(); var4++) {
         rdn_3 var5 = this.id_public.get(var4);
         if (!var5.id_class()) {
            xd_3.id_class((rYB)this.id_throws[7], this.Bs().id_final(), var5);
            this.id_public.set(var4, rdn_3.id_break);
         }
      }
   }

   private void id_goto() {
      if ((rYB)this.id_throws[7] instanceof rrEm_1) {
         ((rrEm_1)((rYB)this.id_throws[7]))
            .id_class(
               new rLX(rLQ.id_protected, xu_3.id_final.id_continue()),
               this.rx(),
               this.id_byte(0.6666666666666666),
               this.BO(),
               10,
               (double)(this.PN() / 4.0F),
               (double)(this.Bm() / 4.0F),
               (double)(this.PN() / 4.0F),
               0.05
            );
      }
   }

   private ap_3 id_case(boolean var1) {
      if (var1) {
         return id_this;
      } else {
         return this.n_() ? id_else : this.BC().id_volatile();
      }
   }

   private void id_case(rye_3 var1) {
      xd_3.id_class((rYB)this.id_throws[7], this.Bs(), new rdn_3(rdy_3.dq));
      this.id_catch(var1);
   }

   public void id_case(rjO_2 var1) {
      this.id_abstract = var1;
      ((rmE_2)this.id_throws[49]).id_break(id_native, var1);
   }

   private void id_case(rye_3 var1, float var2) {
      float var3 = this.Ss();
      var3 -= var2;
      if (var3 <= 0.5F) {
         this.id_catch(var1);
         this.PD();
      } else {
         this.id_public(var3);
      }
   }

   public rjO_2 id_continue() {
      return this.id_char;
   }

   private boolean id_else() {
      return !this.id_implements() && !this.rw();
   }

   public boolean id_implements() {
      return (((rmE_2)this.id_throws[49]).id_class(id_class) & 16) != 0;
   }

   @Override
   public void id_implements(float var1) {
      Float var6 = var1;
      this.id_throws[17] = var6;
      Float var7 = var1;
      this.id_private[24] = var7;
      Float var8 = var1;
      this.id_private[25] = var8;
      Float var9 = var1;
      this.id_private[27] = var9;
   }

   @Override
   protected void id_instanceof(an_3 var1) {
   }

   private void id_instanceof() {
      ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.id_double, this.Pr(), 1.0F, 1.0F);
   }

   public rjO_2 id_new() {
      return this.id_interface;
   }

   public rjO_2 id_package() {
      return this.id_instanceof;
   }

   @Override
   public void id_package(boolean var1) {
      this.id_goto = var1;
      super.id_package(var1);
   }

   public rjO_2 id_super() {
      return this.id_abstract;
   }

   @Override
   public boolean id_try() {
      return super.id_try() && this.id_else();
   }

   @Override
   public Iterable<rdn_3> rs() {
      return this.id_return;
   }

   private rcd_3 id_public() {
      rcd_3 var1 = new rcd_3();
      if (!id_final.equals(this.id_try)) {
         var1.id_class("Head", this.id_try.id_class());
      }

      if (!id_package.equals(this.id_instanceof)) {
         var1.id_class("Body", this.id_instanceof.id_class());
      }

      if (!id_int.equals(this.id_throw)) {
         var1.id_class("LeftArm", this.id_throw.id_class());
      }

      if (!id_new.equals(this.id_interface)) {
         var1.id_class("RightArm", this.id_interface.id_class());
      }

      if (!id_continue.equals(this.id_char)) {
         var1.id_class("LeftLeg", this.id_char.id_class());
      }

      if (!id_super.equals(this.id_abstract)) {
         var1.id_class("RightLeg", this.id_abstract.id_class());
      }

      return var1;
   }

   private boolean id_protected(rXQ var1) {
      return (this.id_while & 1 << var1.id_byte()) != 0 || var1.id_class() == rXN.HAND && !this.id_catch();
   }

   private void id_protected(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_class, this.id_class(((rmE_2)this.id_throws[49]).id_class(id_class), 8, var1));
   }

   public void id_protected(rjO_2 var1) {
      this.id_interface = var1;
      ((rmE_2)this.id_throws[49]).id_break(id_finally, var1);
   }

   public boolean id_private() {
      return (((rmE_2)this.id_throws[49]).id_class(id_class) & 8) != 0;
   }

   @Override
   public void id_private(rjU_2 var1) {
      if (this.id_else()) {
         super.id_private(var1);
      }
   }

   public rjO_2 id_final() {
      return this.id_try;
   }

   @Override
   public rjU_2 id_volatile(float var1) {
      if (this.id_implements()) {
         rfl_3 var2 = this.id_case(false).id_class(this.Ps());
         rfH_2 var3 = this.Bs();
         int var4 = Integer.MIN_VALUE;

         for (rfH_2 var6 : rfH_2.id_class(new rfH_2(var2.id_class, var2.id_break, var2.id_byte), new rfH_2(var2.id_protected, var2.id_throws, var2.id_case))) {
            int var7 = Math.max(((rYB)this.id_throws[7]).id_class(rRo_1.BLOCK, var6), ((rYB)this.id_throws[7]).id_class(rRo_1.SKY, var6));
            if (var7 == 15) {
               return rjU_2.id_class((rja_3)var6);
            }

            if (var7 > var4) {
               var4 = var7;
               var3 = var6.id_int();
            }
         }

         return rjU_2.id_class((rja_3)var3);
      } else {
         return super.id_volatile(var1);
      }
   }

   @Override
   public void id_native(float var1) {
      Float var6 = var1;
      this.id_throws[17] = var6;
      Float var7 = var1;
      this.id_private[24] = var7;
      Float var8 = var1;
      this.id_private[25] = var8;
      Float var9 = var1;
      this.id_private[27] = var9;
   }

   @Override
   public boolean rG() {
      return false;
   }

   @Override
   public double Pv() {
      return this.id_implements() ? 0.0 : 0.1F;
   }

   @Override
   public boolean rY() {
      return super.rY() && !this.id_implements();
   }

   @Override
   public Iterable<rdn_3> PV() {
      return this.id_public;
   }

   @Override
   public boolean Bl() {
      return this.Pp();
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.id_double;
   }

   @Override
   protected void SS() {
      List var1 = ((rYB)this.id_throws[7]).id_break(this, this.rN(), id_synchronized);

      for (int var2 = 0; var2 < var1.size(); var2++) {
         an_3 var3 = (an_3)var1.get(var2);
         if (this.id_int(var3) <= 0.2) {
            var3.id_byte(this);
         }
      }
   }

   @Override
   public boolean SL() {
      return false;
   }

   @Override
   public rpZ_2 Su() {
      return rpZ_2.RIGHT;
   }

   @Override
   public boolean Sq() {
      return false;
   }

   @Override
   protected void SA() {
      this.id_package(this.id_goto);
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      return this.id_case(this.id_implements());
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, (byte)0);
      ((rmE_2)this.id_throws[49]).id_class(id_break, id_final);
      ((rmE_2)this.id_throws[49]).id_class(id_protected, id_package);
      ((rmE_2)this.id_throws[49]).id_class(id_implements, id_int);
      ((rmE_2)this.id_throws[49]).id_class(id_finally, id_new);
      ((rmE_2)this.id_throws[49]).id_class(id_extends, id_continue);
      ((rmE_2)this.id_throws[49]).id_class(id_native, id_super);
   }

   @Override
   public void q_() {
      double var1 = this.rx();
      double var3 = this.re();
      double var5 = this.BO();
      super.q_();
      this.id_new(var1, var3, var5);
   }

   @Override
   public Qs_1 r_() {
      return this.id_implements() ? Qs_1.IGNORE : super.r_();
   }

   @Override
   public boolean n_() {
      return this.id_throws();
   }
}
