package celestial;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rhN_2 extends rhd_3 implements rJu_1 {
   private static final Logger id_final = LogManager.getLogger();
   public rmy_3 id_class;
   public final rnW_2 id_break;
   public final rni_3 id_finally;
   private final List<Integer> id_package = Lists.newLinkedList();
   private final hs_3 id_int;
   private final rCa_1 id_new;
   private float id_continue = Float.MIN_VALUE;
   private int id_super = Integer.MIN_VALUE;
   private int id_this = Integer.MIN_VALUE;
   private int id_else = Integer.MIN_VALUE;
   private int id_synchronized = Integer.MIN_VALUE;
   private int id_return = Integer.MIN_VALUE;
   private float id_public = -1.0E8F;
   private int id_goto = -99999999;
   private boolean id_while = true;
   private int id_try = -99999999;
   private int id_instanceof = 60;
   private rhJ_2 id_throw;
   private boolean id_interface = true;
   private long id_char = rqR_2.id_break();
   private an_3 id_abstract;
   private boolean id_long;
   private boolean id_float;
   private final rWs_1 id_void = new rWs_1();
   private rjU_2 id_static;
   private int id_import;
   private boolean id_short;
   private rjU_2 id_default;
   private rjh_3 id_const = rjh_3.id_class(0, 0, 0);
   private rqM_2<rYB> id_strictfp = rYB.id_byte;
   private rfH_2 id_boolean;
   private boolean id_transient;
   private float id_for;
   private final rgV_2 id_double;
   private int id_switch;
   public boolean id_extends;
   public int id_native;
   public boolean id_volatile;

   public rgP_2 id_boolean() {
      return null;
   }

   @Override
   public void id_char(an_3 var1) {
      this.id_package.remove(Integer.valueOf(var1.V()));
   }

   @Override
   public boolean id_byte(rhN_2 var1) {
      if (var1.id_native()) {
         return this.id_static() == this;
      } else {
         return this.id_native() ? false : super.id_byte(var1);
      }
   }

   @Override
   public int id_byte(Collection<rkw_3<?>> var1) {
      return this.id_void.id_break(var1, this);
   }

   private void id_byte(rrEm_1 var1) {
      rfH_2 var2 = var1.X();
      if (var1.id_default().id_break() && var1.id_const().rB().id_new() != rRl_1.ADVENTURE) {
         int var3 = Math.max(0, this.id_break.id_class(var1));
         int var4 = rfU_2.id_byte(var1.id_instanceof().id_class((double)var2.b_(), (double)var2.d_()));
         if (var4 < var3) {
            var3 = var4;
         }

         if (var4 <= 1) {
            var3 = 1;
         }

         long var5 = (long)(var3 * 2 + 1);
         long var7 = var5 * var5;
         int var9 = var7 > 2147483647L ? Integer.MAX_VALUE : (int)var7;
         int var10 = this.id_synchronized(var9);
         int var11 = new Random().nextInt(var9);

         for (int var12 = 0; var12 < var9; var12++) {
            int var13 = (var11 + var10 * var12) % var9;
            int var14 = var13 % (var3 * 2 + 1);
            int var15 = var13 / (var3 * 2 + 1);
            rfH_2 var16 = rhc_3.id_class(var1, var2.b_() + var14 - var3, var2.d_() + var15 - var3, false);
            if (var16 != null) {
               this.id_class(var16, 0.0F, 0.0F);
               if (var1.id_throws(this)) {
                  break;
               }
            }
         }
      } else {
         this.id_class(var2, 0.0F, 0.0F);

         while (!var1.id_throws(this) && this.re() < 255.0) {
            this.id_new(this.rx(), this.re() + 1.0, this.BO());
         }
      }
   }

   @Override
   public boolean id_int() {
      return this.id_short;
   }

   public rCa_1 id_long() {
      return this.id_new;
   }

   public rWs_1 id_float() {
      return this.id_void;
   }

   public void id_double() {
      this.id_long = false;
   }

   public rhN_2(rnW_2 var1, rrEm_1 var2, GameProfile var3, rni_3 var4) {
      super(var2, var2.X(), var2.J(), var3);
      var4.id_break = this;
      this.id_finally = var4;
      this.id_break = var1;
      this.id_new = var1.x().id_class((rhd_3)this);
      this.id_int = var1.x().id_case(this);
      Float var9 = 1.0F;
      this.id_throws[37] = var9;
      this.id_byte(var2);
      this.id_double = var1.id_class(this);
   }

   public rfH_2 S() {
      return this.id_boolean;
   }

   @Override
   public void id_this() {
      this.id_finally.id_class();
      this.id_instanceof--;
      if ((Integer)this.id_throws[47] > 0) {
         Integer var9 = (Integer)this.id_throws[47] - 1;
         this.id_throws[47] = var9;
      }

      ((rJr_1)this.id_implements[4]).id_native();
      if (!((rYB)this.id_throws[7]).id_continue && !((rJr_1)this.id_implements[4]).id_class((rhd_3)this)) {
         this.id_strictfp();
         rJT var10 = (rJT)this.id_implements[3];
         this.id_implements[4] = var10;
      }

      while (!this.id_package.isEmpty()) {
         int var1 = Math.min(this.id_package.size(), Integer.MAX_VALUE);
         int[] var2 = new int[var1];
         Iterator var3 = this.id_package.iterator();
         int var4 = 0;

         while (var3.hasNext() && var4 < var1) {
            var2[var4++] = (Integer)var3.next();
            var3.remove();
         }

         this.id_class.id_class(new rvG_2(var2));
      }

      an_3 var11 = this.id_static();
      if (var11 != this) {
         if (var11.BM()) {
            this.id_break(var11.rx(), var11.re(), var11.BO(), (Float)var11.id_throws[15], (Float)var11.id_throws[16]);
            this.id_continue().id_else().id_class(this);
            if (this.sT()) {
               this.id_abstract(this);
            }
         } else {
            this.id_abstract(this);
         }
      }

      Oo_1.id_return.id_class(this);
      if (this.id_static != null) {
         Oo_1.id_else.id_class(this, this.id_static, (Integer)this.id_throws[41] - this.id_import);
      }

      this.id_int.id_break(this);
   }

   @Override
   public void id_this(int var1) {
      super.id_this(var1);
      this.id_try = -1;
   }

   public boolean b() {
      return this.id_transient;
   }

   public float s() {
      return this.id_for;
   }

   private boolean d() {
      return this.id_break.b();
   }

   @Override
   protected void a() {
      if (!this.id_long) {
         super.a();
      }
   }

   @Override
   public void id_interface(an_3 var1) {
      if (var1 instanceof rhd_3) {
         this.id_class.id_class(new rvG_2(var1.V()));
      } else {
         this.id_package.add(var1.V());
      }
   }

   @Override
   protected void id_class(rLY var1) {
      super.id_class(var1);
      this.id_class.id_class(new rFr_1(this.V(), var1.id_class()));
      if (var1.id_class() == rLD.id_goto) {
         this.id_static = null;
      }

      Oo_1.id_try.id_class(this);
   }

   @Override
   public void id_class(rRl_1 var1) {
      this.id_finally.id_class(var1);
      this.id_class.id_class(new rZY(rZY.id_protected, (float)var1.id_class()));
      if (var1 == rRl_1.SPECTATOR) {
         this.sI();
         this.BH();
      } else {
         this.id_abstract(this);
      }

      this.G();
      this.sE();
   }

   @Override
   public void id_class(an_3 var1) {
      this.id_continue().id_else().id_class(this, new rZj_1(var1, 4));
   }

   @Override
   protected void id_class(rLY var1, boolean var2) {
      super.id_class(var1, var2);
      this.id_class.id_class(new rvT_2(this.V(), var1));
      Oo_1.id_try.id_class(this);
   }

   public void id_class(rhN_2 var1, boolean var2) {
      if (var2) {
         ((rhz_3)this.id_implements[1]).id_class((rhz_3)var1.id_implements[1]);
         this.id_public(var1.Ss());
         rpQ_2 var7 = (rpQ_2)var1.id_implements[5];
         this.id_implements[5] = var7;
         Integer var8 = (Integer)var1.id_implements[19];
         this.id_implements[19] = var8;
         Integer var9 = (Integer)var1.id_implements[20];
         this.id_implements[20] = var9;
         Float var10 = (Float)var1.id_implements[21];
         this.id_implements[21] = var10;
         this.id_break(var1.sp());
         rfH_2 var11 = (rfH_2)var1.id_throws[61];
         this.id_throws[61] = var11;
      } else if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_byte) || var1.id_native()) {
         ((rhz_3)this.id_implements[1]).id_class((rhz_3)var1.id_implements[1]);
         Integer var12 = (Integer)var1.id_implements[19];
         this.id_implements[19] = var12;
         Integer var13 = (Integer)var1.id_implements[20];
         this.id_implements[20] = var13;
         Float var14 = (Float)var1.id_implements[21];
         this.id_implements[21] = var14;
         this.id_break(var1.sp());
      }

      Integer var15 = (Integer)var1.id_implements[22];
      this.id_implements[22] = var15;
      rXz_1 var16 = (rXz_1)var1.id_implements[2];
      this.id_implements[2] = var16;
      this.BQ().id_break((rut_3<Object>)id_protected[4], (Byte)var1.BQ().id_class((rut_3)id_protected[4]));
      this.id_try = -1;
      this.id_public = -1.0F;
      this.id_goto = -1;
      this.id_void.id_class(var1.id_void);
      this.id_package.addAll(var1.id_package);
      this.id_float = var1.id_float;
      this.id_default = var1.id_default;
      this.id_catch(var1.sQ());
      this.id_implements(var1.sJ());
   }

   public void id_class(String var1, String var2) {
      this.id_class.id_class(new rFs_1(var1, var2));
   }

   public void id_class(rmw_3 var1) {
      this.id_throw = var1.id_break();
      this.id_interface = var1.id_byte();
      this.BQ().id_break((rut_3<Byte>)id_protected[4], (byte)var1.id_protected());
      this.BQ().id_break((rut_3<Byte>)id_protected[5], (byte)(var1.id_throws() == rpZ_2.LEFT ? 0 : 1));
   }

   public void id_class(rgP_2 var1, rVU var2, UUID var3) {
      this.id_class.id_class(new rZK(var1, var2, var3), var4 -> {
         if (!var4.isSuccess() && (var2 == rVU.GAME_INFO || var2 == rVU.SYSTEM)) {
            short var5 = 256;
            String var6 = var1.id_class(256);
            rVi_1 var7 = new rgN_2(var6).id_class(rgF_2.YELLOW);
            this.id_class.id_class(new rZK(new rgn_3("multiplayer.message_not_delivered", var7).id_class(rgF_2.RED), rVU.SYSTEM, var3));
         }
      });
   }

   @Override
   public void id_class(rgP_2 var1, UUID var2) {
      this.id_class(var1, rVU.SYSTEM, var2);
   }

   @Override
   public void id_class(rqO_2[] var1) {
      ArrayList var2 = Lists.newArrayList();

      for (rqO_2 var6 : var1) {
         this.id_break.V().id_class(var6).ifPresent(var2::add);
      }

      this.id_break(var2);
   }

   @Override
   public void id_class(rCi_1<?> var1, int var2) {
      this.id_new.id_break(this, var1, var2);
      this.st().id_class(var1, this.i(), var1x -> var1x.id_class(var2));
   }

   public void id_class(float var1, float var2, boolean var3, boolean var4) {
      if (this.Pm()) {
         if (var1 >= -1.0F && var1 <= 1.0F) {
            Float var9 = var1;
            this.id_private[42] = var9;
         }

         if (var2 >= -1.0F && var2 <= 1.0F) {
            Float var10 = var2;
            this.id_private[44] = var10;
         }

         Boolean var11 = var3;
         this.id_private[41] = var11;
         this.id_volatile(var4);
      }
   }

   @Override
   public void id_class(rJr_1 var1, int var2, int var3) {
      this.id_class.id_class(new rFt_1(var1.id_case, var2, var3));
   }

   @Override
   public void id_class(rJr_1 var1, rqs_3<rdn_3> var2) {
      this.id_class.id_class(new rFT(var1.id_case, var2));
      this.id_class.id_class(new rFM(-1, -1, ((rhz_3)this.id_implements[1]).id_finally()));
   }

   public void id_class(Rm_1 var1, an_3 var2, Rm_1 var3) {
      rjU_2 var4 = var3.id_class(var2);
      super.id_class(var1, var4);
      this.id_class.id_class(new rvK_2(var1, var2, var3));
   }

   @Override
   public void id_class(Rm_1 var1, rjU_2 var2) {
      super.id_class(var1, var2);
      this.id_class.id_class(new rvK_2(var1, var2.id_break, var2.id_byte, var2.id_protected));
   }

   @Override
   public void id_class(rgP_2 var1, boolean var2) {
      this.id_class.id_class(new rZK(var1, var2 ? rVU.GAME_INFO : rVU.CHAT, rqR_2.id_break));
   }

   public void id_class(rjh_3 var1) {
      this.id_const = var1;
   }

   public void id_class(rfj_3 var1) {
      if (this.BM()) {
         this.id_class.id_class(new rFZ(var1.id_break, var1.id_byte));
      }
   }

   public void id_class(rfj_3 var1, ruS_2<?> var2, ruS_2<?> var3) {
      this.id_class.id_class(var3);
      this.id_class.id_class(var2);
   }

   public void id_class(rqM_2<rYB> var1, rfH_2 var2, float var3, boolean var4, boolean var5) {
      if (var2 != null) {
         boolean var6 = var2.equals(this.id_boolean) && var1.equals(this.id_strictfp);
         if (var5 && !var6) {
            this.id_class(new rgn_3("block.minecraft.set_spawn"), rqR_2.id_break);
         }

         this.id_boolean = var2;
         this.id_strictfp = var1;
         this.id_for = var3;
         this.id_transient = var4;
      } else {
         this.id_boolean = null;
         this.id_strictfp = rYB.id_byte;
         this.id_for = 0.0F;
         this.id_transient = false;
      }
   }

   @Override
   public rsE_2 id_class(rdn_3 var1, boolean var2, boolean var3) {
      rsE_2 var4 = super.id_class(var1, var2, var3);
      if (var4 == null) {
         return null;
      } else {
         ((rYB)this.id_throws[7]).a_(var4);
         rdn_3 var5 = var4.id_protected();
         if (var3) {
            if (!var5.id_class()) {
               this.id_class(rlB_2.id_case.id_break(var5.id_break()), var1.id_char());
            }

            this.id_break(rlB_2.id_char);
         }

         return var4;
      }
   }

   @Override
   public void id_class(rqA_2 var1, rqL_2 var2, float var3, float var4) {
      this.id_class.id_class(new rvt_3(var1, var2, this.rx(), this.re(), this.BO(), var3, var4));
   }

   @Override
   public void id_class(rpm_3 var1) {
      super.id_class(var1);
      this.sg();
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("playerGameType", this.id_finally.id_break().id_class());
      var1.id_break("previousPlayerGameType", this.id_finally.id_byte().id_class());
      var1.id_class("seenCredits", this.id_float);
      if (this.id_default != null) {
         rcd_3 var2 = new rcd_3();
         var2.id_class("x", this.id_default.id_break);
         var2.id_class("y", this.id_default.id_byte);
         var2.id_class("z", this.id_default.id_protected);
         var1.id_class("enteredNetherPosition", var2);
      }

      an_3 var6 = this.PO();
      an_3 var3 = this.ra();
      if (var3 != null && var6 != this && var6.Pq()) {
         rcd_3 var4 = new rcd_3();
         rcd_3 var5 = new rcd_3();
         var6.id_byte(var5);
         var4.id_class("Attach", var3.ro());
         var4.id_class("Entity", var5);
         var1.id_class("RootVehicle", var4);
      }

      var1.id_class("recipeBook", this.id_void.id_class());
      var1.id_class("Dimension", ((rYB)this.id_throws[7]).E().id_class().toString());
      if (this.id_boolean != null) {
         var1.id_break("SpawnX", this.id_boolean.b_());
         var1.id_break("SpawnY", this.id_boolean.c_());
         var1.id_break("SpawnZ", this.id_boolean.d_());
         var1.id_class("SpawnForced", this.id_transient);
         var1.id_class("SpawnAngle", this.id_for);
         rqO_2.id_class
            .encodeStart(rcf_3.id_class, this.id_strictfp.id_class())
            .resultOrPartial(id_final::error)
            .ifPresent(var1x -> var1.id_class("SpawnDimension", var1x));
      }
   }

   public void id_class(int var1) {
      float var2 = (float)this.sn();
      float var3 = (var2 - 1.0F) / var2;
      Float var8 = rfU_2.id_class((float)var1 / var2, 0.0F, var3);
      this.id_implements[21] = var8;
      this.id_try = -1;
   }

   public void id_class(rrEm_1 var1, double var2, double var4, double var6, float var8, float var9) {
      this.id_abstract(this);
      this.BH();
      if (var1 == (rYB)this.id_throws[7]) {
         this.id_class.id_class(var2, var4, var6, var8, var9);
      } else {
         rrEm_1 var10 = this.id_continue();
         rrGs_1 var11 = var1.id_public();
         this.id_class
            .id_class(
               new rFP(
                  var1.id_default(), var1.E(), rYA.id_class(var1.id_break()), this.id_finally.id_break(), this.id_finally.id_byte(), var1.b(), var1.z(), true
               )
            );
         this.id_class.id_class(new rFE(var11.id_extends(), var11.id_native()));
         this.id_break.x().id_protected(this);
         var10.id_throws(this);
         Boolean var16 = false;
         this.id_throws[27] = var16;
         this.id_class(var2, var4, var6, var8, var9);
         this.id_class((rYB)var1);
         var1.id_class(this);
         this.id_protected(var10);
         this.id_class.id_class(var2, var4, var6, var8, var9);
         this.id_finally.id_class(var1);
         this.id_break.x().id_class(this, var1);
         this.id_break.x().id_throws(this);
      }
   }

   @Override
   protected void id_class(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
   }

   @Override
   public boolean id_class(rye_3 var1) {
      return super.id_class(var1) || this.id_for() || ((rhx_3)this.id_implements[18]).id_class && var1 == rye_3.id_int;
   }

   private void id_class(String var1, String var2, rAi_1[] var3) {
      rnB_2 var4 = this.st().id_private(var2);
      if (var4 != null) {
         int var5 = var4.id_volatile().id_class();
         if (var5 >= 0 && var5 < var3.length) {
            this.st().id_class(var3[var5], var1, rAa_1::id_class);
         }
      }
   }

   @Override
   public boolean id_class(an_3 var1, boolean var2) {
      an_3 var3 = this.ra();
      if (!super.id_class(var1, var2)) {
         return false;
      } else {
         an_3 var4 = this.ra();
         if (var4 != var3 && this.id_class != null) {
            this.id_class.id_class(this.rx(), this.re(), this.BO(), (Float)this.id_throws[15], (Float)this.id_throws[16]);
         }

         return true;
      }
   }

   @Override
   public OptionalInt id_class(rJZ var1) {
      if (var1 == null) {
         return OptionalInt.empty();
      } else {
         if ((rJr_1)this.id_implements[4] != (rJT)this.id_implements[3]) {
            this.id_strictfp();
         }

         this.k();
         rJr_1 var2 = var1.createMenu(this.id_switch, (rhz_3)this.id_implements[1], this);
         if (var2 == null) {
            if (this.id_native()) {
               this.id_class(new rgn_3("container.spectatorCantOpen").id_class(rgF_2.RED), true);
            }

            return OptionalInt.empty();
         } else {
            this.id_class.id_class(new rvp_3(var2.id_case, var2.id_finally(), var1.L_()));
            var2.id_class((rJu_1)this);
            this.id_implements[4] = var2;
            return OptionalInt.of(this.id_switch);
         }
      }
   }

   @Override
   public void id_class(ryS_2 var1) {
      var1.id_class((rhd_3)this);
      this.id_class.id_class(new rvy_3(var1.id_char()));
   }

   @Override
   public void id_class(an_3 var1, int var2, rye_3 var3) {
      if (var1 != this) {
         super.id_class(var1, var2, var3);
         this.id_continue(var2);
         String var4 = this.i();
         String var5 = var1.i();
         this.st().id_class(rAi_1.id_case, var4, rAa_1::id_class);
         if (var1 instanceof rhd_3) {
            this.id_break(rlB_2.id_boolean);
            this.st().id_class(rAi_1.id_throws, var4, rAa_1::id_class);
         } else {
            this.id_break(rlB_2.id_const);
         }

         this.id_class(var4, var5, rAi_1.id_volatile);
         this.id_class(var5, var4, rAi_1.id_final);
         Oo_1.id_break.id_class(this, var1, var3);
      }
   }

   public void id_class(double var1, boolean var3) {
      rfH_2 var4 = this.BS();
      if (((rYB)this.id_throws[7]).id_int(var4)) {
         super.id_class(var1, var3, ((rYB)this.id_throws[7]).id_byte(var4), var4);
      }
   }

   private boolean id_class(rfH_2 var1, rpr_3 var2) {
      return this.id_implements(var1) || this.id_implements(var1.id_break(var2.id_case()));
   }

   private void id_class(ryO_2 var1) {
      if (var1 != null) {
         rFy_1 var2 = var1.Y_();
         if (var2 != null) {
            this.id_class.id_class(var2);
         }
      }
   }

   @Override
   public void id_class(an_3 var1, int var2) {
      super.id_class(var1, var2);
      ((rJr_1)this.id_implements[4]).id_native();
   }

   @Override
   public Either<rhW_2, rqg_3> id_class(rfH_2 var1) {
      rpr_3 var2 = ((rYB)this.id_throws[7]).id_byte(var1).id_byte(kE_2.p);
      if (this.Sc() || !this.BM()) {
         return Either.left((rhW_2)rhW_2.staticFields4c1a1e3ca1b33044b12dba3caf94435e[4]);
      } else if (!((rYB)this.id_throws[7]).id_default().id_throws()) {
         return Either.left((rhW_2)rhW_2.staticFields4c1a1e3ca1b33044b12dba3caf94435e[0]);
      } else if (!this.id_class(var1, var2)) {
         return Either.left((rhW_2)rhW_2.staticFields4c1a1e3ca1b33044b12dba3caf94435e[2]);
      } else if (this.id_break(var1, var2)) {
         return Either.left((rhW_2)rhW_2.staticFields4c1a1e3ca1b33044b12dba3caf94435e[3]);
      } else {
         this.id_class(((rYB)this.id_throws[7]).E(), var1, (Float)this.id_throws[15], false, true);
         if (((rYB)this.id_throws[7]).id_strictfp()) {
            return Either.left((rhW_2)rhW_2.staticFields4c1a1e3ca1b33044b12dba3caf94435e[1]);
         } else {
            if (!this.id_implements()) {
               rjU_2 var3 = rjU_2.id_protected(var1);
               List var4 = ((rYB)this.id_throws[7])
                  .id_class(
                     rEi_1.class,
                     new rfl_3(
                        var3.id_class() - 8.0, var3.id_break() - 5.0, var3.id_byte() - 8.0, var3.id_class() + 8.0, var3.id_break() + 5.0, var3.id_byte() + 8.0
                     ),
                     var1x -> var1x.id_throws(this)
                  );
               if (!var4.isEmpty()) {
                  return Either.left((rhW_2)rhW_2.staticFields4c1a1e3ca1b33044b12dba3caf94435e[5]);
               }
            }

            Either var5 = super.id_class(var1).ifRight(var1x -> {
               this.id_break(rlB_2.c);
               Oo_1.id_new.id_class(this);
            });
            ((rrEm_1)((rYB)this.id_throws[7])).id_private();
            return var5;
         }
      }
   }

   @Override
   public void id_class(boolean var1, boolean var2) {
      if (this.Sc()) {
         this.id_continue().id_else().id_class(this, new rZj_1(this, 2));
      }

      super.id_class(var1, var2);
      if (this.id_class != null) {
         this.id_class.id_class(this.rx(), this.re(), this.BO(), (Float)this.id_throws[15], (Float)this.id_throws[16]);
      }
   }

   @Override
   public an_3 id_class(rrEm_1 var1) {
      this.id_long = true;
      rrEm_1 var2 = this.id_continue();
      rqM_2 var3 = var2.E();
      if (var3 == rYB.id_throws && var1.E() == rYB.id_byte) {
         this.K();
         this.id_continue().id_throws(this);
         if (!this.id_volatile) {
            this.id_volatile = true;
            this.id_class.id_class(new rZY(rZY.id_throws, this.id_float ? 0.0F : 1.0F));
            this.id_float = true;
         }

         return this;
      } else {
         rrGs_1 var4 = var1.id_public();
         this.id_class
            .id_class(
               new rFP(
                  var1.id_default(), var1.E(), rYA.id_class(var1.id_break()), this.id_finally.id_break(), this.id_finally.id_byte(), var1.b(), var1.z(), true
               )
            );
         this.id_class.id_class(new rFE(var4.id_extends(), var4.id_native()));
         rCr_1 var5 = this.id_break.x();
         var5.id_protected(this);
         var2.id_throws(this);
         Boolean var13 = false;
         this.id_throws[27] = var13;
         WP var6 = this.id_break(var1);
         if (var6 != null) {
            if (var3 == rYB.id_byte && var1.E() == rYB.id_protected) {
               this.id_default = this.Ps();
            } else if (var1.E() == rYB.id_throws) {
               this.id_class(var1, new rfH_2(var6.id_class));
            }

            this.id_class((rYB)var1);
            var1.id_break(this);
            this.id_case(var6.id_byte, var6.id_protected);
            this.id_private(var6.id_class.id_break, var6.id_class.id_byte, var6.id_class.id_protected);
            this.id_protected(var2);
            this.id_finally.id_class(var1);
            this.id_class.id_class(new rvf_3((rhx_3)this.id_implements[18]));
            var5.id_class(this, var1);
            var5.id_throws(this);

            for (rLY var8 : this.So()) {
               this.id_class.id_class(new rvT_2(this.V(), var8));
            }

            this.id_class.id_class(new rvw_3(1032, rfH_2.id_protected, 0, false));
            this.id_try = -1;
            this.id_public = -1.0F;
            this.id_goto = -1;
         }

         return this;
      }
   }

   private void id_class(rrEm_1 var1, rfH_2 var2) {
      rfw_3 var3 = var2.id_new();

      for (int var4 = -2; var4 <= 2; var4++) {
         for (int var5 = -2; var5 <= 2; var5++) {
            for (int var6 = -1; var6 < 3; var6++) {
               xc_3 var7 = var6 == -1 ? xu_3.rg.id_continue() : xu_3.id_class.id_continue();
               var1.id_break(var3.id_class(var2).id_byte(var5, var6, var4), var7);
            }
         }
      }
   }

   @Override
   protected Optional<rqT_2> id_class(rrEm_1 var1, rfH_2 var2, boolean var3) {
      Optional var4 = super.id_class(var1, var2, var3);
      if (var4.isPresent()) {
         return var4;
      } else {
         rpB_2 var5 = ((rYB)this.id_throws[7]).id_byte((rfH_2)this.id_throws[61]).id_protected(kT_2.id_volatile).orElse(rpB_2.X);
         Optional var6 = var1.M().id_class(var2, var5);
         if (!var6.isPresent()) {
            id_final.error("Unable to create a portal, likely target out of worldborder");
         }

         return var6;
      }
   }

   public void id_class(rJr_1 var1) {
      this.id_class(var1, var1.id_extends());
   }

   @Override
   protected void id_class(xc_3 var1) {
      Oo_1.id_protected.id_class(this, var1);
   }

   @Override
   public void id_class(rJr_1 var1, int var2, rdn_3 var3) {
      if (!(var1.id_class(var2) instanceof rJS)) {
         if (var1 == (rJT)this.id_implements[3]) {
            Oo_1.id_throws.id_class(this, (rhz_3)this.id_implements[1], var3);
         }

         if (!this.id_extends) {
            this.id_class.id_class(new rFM(var1.id_case, var2, var3));
         }
      }
   }

   @Override
   public void id_class(rHZ var1) {
      var1.id_byte(true);
      this.id_class((ryO_2)var1);
   }

   @Override
   public void id_class(rOD var1, rXu_1 var2) {
      if ((rJr_1)this.id_implements[4] != (rJT)this.id_implements[3]) {
         this.id_strictfp();
      }

      this.k();
      this.id_class.id_class(new rvH_2(this.id_switch, var2.id_else(), var1.V()));
      rJQ var7 = new rJQ(this.id_switch, (rhz_3)this.id_implements[1], var2, var1);
      this.id_implements[4] = var7;
      ((rJr_1)this.id_implements[4]).id_class((rJu_1)this);
   }

   @Override
   public void id_class(rdn_3 var1, rpm_3 var2) {
      rdb_3 var3 = var1.id_break();
      if (var3 == rdy_3.dr) {
         if (rkZ_2.id_class(var1, this.PL(), this)) {
            ((rJr_1)this.id_implements[4]).id_native();
         }

         this.id_class.id_class(new rvl_3(var2));
      }
   }

   @Override
   public void id_class(int var1, rdf_3 var2, int var3, int var4, boolean var5, boolean var6) {
      this.id_class.id_class(new rvL_2(var1, var2, var3, var4, var5, var6));
   }

   private void id_class(rAi_1 var1, int var2) {
      this.st().id_class(var1, this.i(), var1x -> var1x.id_break(var2));
   }

   private void k() {
      this.id_switch = this.id_switch % 100 + 1;
   }

   public long id_short() {
      return this.id_char;
   }

   public hs_3 r() {
      return this.id_int;
   }

   @Override
   public void sh() {
      super.sh();
      this.id_class.id_class(new rZa_1(this.SW(), rvr_3.END_COMBAT));
   }

   @Override
   protected WP id_break(rrEm_1 var1) {
      WP var2 = super.id_break(var1);
      if (var2 != null && ((rYB)this.id_throws[7]).E() == rYB.id_byte && var1.E() == rYB.id_throws) {
         rjU_2 var3 = var2.id_class.id_break(0.0, -1.0, 0.0);
         return new WP(var3, rjU_2.id_class, 90.0F, 0.0F);
      } else {
         return var2;
      }
   }

   private boolean id_break(rfH_2 var1, rpr_3 var2) {
      rfH_2 var3 = var1.id_final();
      return !this.id_private(var3) || !this.id_private(var3.id_break(var2.id_case()));
   }

   @Override
   public int id_break(Collection<rkw_3<?>> var1) {
      return this.id_void.id_class(var1, this);
   }

   @Override
   public void id_break(rye_3 var1) {
      boolean var2 = ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_native);
      if (var2) {
         rgP_2 var3 = this.SW().id_break();
         this.id_class.id_class(new rZa_1(this.SW(), rvr_3.ENTITY_DIED, var3), var2x -> {
            if (!var2x.isSuccess()) {
               short var3x = 256;
               String var4x = var3.id_class(256);
               rgn_3 var5x = new rgn_3("death.attack.message_too_long", new rgN_2(var4x).id_class(rgF_2.YELLOW));
               rVi_1 var6 = new rgn_3("death.attack.even_more_magic", this.L_()).id_class(var1xx -> var1xx.id_class(new rgy_3(rgp_3.id_class, var5x)));
               this.id_class.id_class(new rZa_1(this.SW(), rvr_3.ENTITY_DIED, var6));
            }
         });
         rnM_2 var4 = this.BG();
         if (var4 == null || var4.id_finally() == rnX_2.ALWAYS) {
            this.id_break.x().id_class(var3, rVU.SYSTEM, rqR_2.id_break);
         } else if (var4.id_finally() == rnX_2.HIDE_FOR_OTHER_TEAMS) {
            this.id_break.x().id_class(this, var3);
         } else if (var4.id_finally() == rnX_2.HIDE_FOR_OWN_TEAM) {
            this.id_break.x().id_break(this, var3);
         }
      } else {
         this.id_class.id_class(new rZa_1(this.SW(), rvr_3.ENTITY_DIED));
      }

      this.sI();
      if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_abstract)) {
         this.X();
      }

      if (!this.id_native()) {
         this.id_protected(var1);
      }

      this.st().id_class(rAi_1.id_protected, this.i(), rAa_1::id_class);
      iB_2 var5 = this.Sh();
      if (var5 != null) {
         this.id_class(rlB_2.id_private.id_break(var5.BC()));
         var5.id_class(this, (Integer)this.id_private[39], var1);
         this.id_class(var5);
      }

      ((rYB)this.id_throws[7]).id_class(this, (byte)3);
      this.id_break(rlB_2.id_default);
      this.id_break(rlB_2.id_implements.id_break(rlB_2.id_native));
      this.id_break(rlB_2.id_implements.id_break(rlB_2.id_volatile));
      this.rE();
      this.id_break(0, false);
      this.SW().id_throws();
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("playerGameType", 99)) {
         if (this.rC().c()) {
            this.id_finally.id_class(this.rC().id_package(), rRl_1.NOT_SET);
         } else {
            this.id_finally
               .id_class(
                  rRl_1.id_class(var1.id_private("playerGameType")),
                  var1.id_byte("previousPlayerGameType", 3) ? rRl_1.id_class(var1.id_private("previousPlayerGameType")) : rRl_1.NOT_SET
               );
         }
      }

      if (var1.id_byte("enteredNetherPosition", 10)) {
         rcd_3 var2 = var1.id_int("enteredNetherPosition");
         this.id_default = new rjU_2(var2.id_extends("x"), var2.id_extends("y"), var2.id_extends("z"));
      }

      this.id_float = var1.id_new("seenCredits");
      if (var1.id_byte("recipeBook", 10)) {
         this.id_void.id_class(var1.id_int("recipeBook"), this.id_break.V());
      }

      if (this.Sc()) {
         this.SQ();
      }

      if (var1.id_byte("SpawnX", 99) && var1.id_byte("SpawnY", 99) && var1.id_byte("SpawnZ", 99)) {
         this.id_boolean = new rfH_2(var1.id_private("SpawnX"), var1.id_private("SpawnY"), var1.id_private("SpawnZ"));
         this.id_transient = var1.id_new("SpawnForced");
         this.id_for = var1.id_finally("SpawnAngle");
         if (var1.id_throws("SpawnDimension")) {
            this.id_strictfp = rYB.id_break.parse(rcf_3.id_class, var1.id_byte("SpawnDimension")).resultOrPartial(id_final::error).orElse(rYB.id_byte);
         }
      }
   }

   @Override
   public void id_break(an_3 var1) {
      this.id_continue().id_else().id_class(this, new rZj_1(var1, 5));
   }

   @Override
   public void id_break(rdn_3 var1, int var2) {
      super.id_break(var1, var2);
      this.id_try = -1;
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else {
         boolean var3 = this.id_break.id_switch() && this.d() && "fall".equals(var1.id_synchronized);
         if (!var3 && this.id_instanceof > 0 && var1 != rye_3.id_volatile) {
            return false;
         } else {
            if (var1 instanceof rpX_2) {
               an_3 var4 = var1.id_extends();
               if (var4 instanceof rhd_3 && !this.id_throws((rhd_3)var4)) {
                  return false;
               }

               if (var4 instanceof rhm_3 var5) {
                  an_3 var6 = var5.id_else();
                  if (var6 instanceof rhd_3 && !this.id_throws((rhd_3)var6)) {
                     return false;
                  }
               }
            }

            return super.id_break(var1, var2);
         }
      }
   }

   @Override
   public void id_break(rCi_1<?> var1) {
      this.id_new.id_class(this, var1, 0);
      this.st().id_class(var1, this.i(), rAa_1::id_byte);
   }

   public void id_throws() {
      ((rJr_1)this.id_implements[4]).id_class((rJu_1)this);
   }

   @Override
   protected void id_throws(rfH_2 var1) {
      if (!this.id_native()) {
         super.id_throws(var1);
      }
   }

   @Override
   public boolean id_throws(rhd_3 var1) {
      return !this.d() ? false : super.id_throws(var1);
   }

   public rjh_3 M() {
      return this.id_const;
   }

   public void id_catch() {
      try {
         if (!this.id_native() || ((rYB)this.id_throws[7]).id_int(this.Bs())) {
            super.id_this();
         }

         for (int var1 = 0; var1 < ((rhz_3)this.id_implements[1]).id_else(); var1++) {
            rdn_3 var5 = ((rhz_3)this.id_implements[1]).id_extends(var1);
            if (var5.id_break().id_class()) {
               ruS_2 var6 = ((rxP_2)var5.id_break()).id_class(var5, (rYB)this.id_throws[7], this);
               if (var6 != null) {
                  this.id_class.id_class(var6);
               }
            }
         }

         if (this.Ss() != this.id_public
            || this.id_goto != ((rpQ_2)this.id_implements[5]).id_class()
            || ((rpQ_2)this.id_implements[5]).id_byte() == 0.0F != this.id_while) {
            this.id_class.id_class(new rFn_1(this.Ss(), ((rpQ_2)this.id_implements[5]).id_class(), ((rpQ_2)this.id_implements[5]).id_byte()));
            this.id_public = this.Ss();
            this.id_goto = ((rpQ_2)this.id_implements[5]).id_class();
            this.id_while = ((rpQ_2)this.id_implements[5]).id_byte() == 0.0F;
         }

         if (this.Ss() + this.Sd() != this.id_continue) {
            this.id_continue = this.Ss() + this.Sd();
            this.id_class(rAi_1.id_catch, rfU_2.id_case(this.id_continue));
         }

         if (((rpQ_2)this.id_implements[5]).id_class() != this.id_super) {
            this.id_super = ((rpQ_2)this.id_implements[5]).id_class();
            this.id_class(rAi_1.id_private, rfU_2.id_case((float)this.id_super));
         }

         if (this.PA() != this.id_this) {
            this.id_this = this.PA();
            this.id_class(rAi_1.id_implements, rfU_2.id_case((float)this.id_this));
         }

         if (this.Bq() != this.id_else) {
            this.id_else = this.Bq();
            this.id_class(rAi_1.id_finally, rfU_2.id_case((float)this.id_else));
         }

         if ((Integer)this.id_implements[20] != this.id_return) {
            this.id_return = (Integer)this.id_implements[20];
            this.id_class(rAi_1.id_extends, rfU_2.id_case((float)this.id_return));
         }

         if ((Integer)this.id_implements[19] != this.id_synchronized) {
            this.id_synchronized = (Integer)this.id_implements[19];
            this.id_class(rAi_1.id_native, rfU_2.id_case((float)this.id_synchronized));
         }

         if ((Integer)this.id_implements[20] != this.id_try) {
            this.id_try = (Integer)this.id_implements[20];
            this.id_class.id_class(new rFG((Float)this.id_implements[21], (Integer)this.id_implements[20], (Integer)this.id_implements[19]));
         }

         if ((Integer)this.id_throws[41] % 20 == 0) {
            Oo_1.id_int.id_class(this);
         }
      } catch (Throwable var4) {
         KY var2 = KY.id_class(var4, "Ticking player");
         Ko_1 var3 = var2.id_class("Player being ticked");
         this.id_class(var3);
         throw new KU(var2);
      }
   }

   @Override
   public void G() {
      if (this.id_class != null) {
         this.id_class.id_class(new rvf_3((rhx_3)this.id_implements[18]));
         this.SA();
      }
   }

   public rgV_2 O() {
      return this.id_double;
   }

   @Override
   public void id_case(rfH_2 var1) {
      this.id_break(rlB_2.id_implements.id_break(rlB_2.id_volatile));
      super.id_case(var1);
   }

   @Override
   public void id_case(double var1, double var3, double var5) {
      this.id_class.id_class(var1, var3, var5, (Float)this.id_throws[15], (Float)this.id_throws[16]);
   }

   public rrEm_1 id_continue() {
      return (rrEm_1)((rYB)this.id_throws[7]);
   }

   public void id_else(int var1) {
      Integer var6 = var1;
      this.id_implements[19] = var6;
      this.id_try = -1;
   }

   public rhJ_2 id_else() {
      return this.id_throw;
   }

   public boolean id_for() {
      return this.id_long;
   }

   private boolean id_implements(rfH_2 var1) {
      rjU_2 var2 = rjU_2.id_protected(var1);
      return Math.abs(this.rx() - var2.id_class()) <= 3.0 && Math.abs(this.re() - var2.id_break()) <= 2.0 && Math.abs(this.BO() - var2.id_byte()) <= 3.0;
   }

   @Override
   public boolean id_implements() {
      return this.id_finally.id_break() == rRl_1.CREATIVE;
   }

   @Override
   public void id_new() {
      this.id_public = -1.0E8F;
   }

   public void id_package() {
      this.id_short = true;
      this.Bn();
      if (this.Sc()) {
         this.id_class(true, false);
      }
   }

   public String id_super() {
      String var1 = this.id_class.id_class.id_byte().toString();
      var1 = var1.substring(var1.indexOf("/") + 1);
      return var1.substring(0, var1.indexOf(":"));
   }

   @Override
   public void id_super(int var1) {
      super.id_super(var1);
      this.id_try = -1;
   }

   @Override
   public void id_throw(an_3 var1) {
      if (this.id_finally.id_break() == rRl_1.SPECTATOR) {
         this.id_abstract(var1);
      } else {
         super.id_throw(var1);
      }
   }

   public an_3 id_static() {
      return (an_3)(this.id_abstract == null ? this : this.id_abstract);
   }

   @Override
   public void id_public() {
      this.id_char = rqR_2.id_break();
   }

   @Override
   protected void id_protected(rLY var1) {
      super.id_protected(var1);
      this.id_class.id_class(new rvT_2(this.V(), var1));
      if (var1.id_class() == rLD.id_goto) {
         this.id_import = (Integer)this.id_throws[41];
         this.id_static = this.Ps();
      }

      Oo_1.id_try.id_class(this);
   }

   private void id_protected(rrEm_1 var1) {
      rqM_2 var2 = var1.E();
      rqM_2 var3 = ((rYB)this.id_throws[7]).E();
      Oo_1.id_synchronized.id_class(this, var2, var3);
      if (var2 == rYB.id_protected && var3 == rYB.id_byte && this.id_default != null) {
         Oo_1.id_throw.id_class(this, this.id_default);
      }

      if (var3 != rYB.id_protected) {
         this.id_default = null;
      }
   }

   @Override
   public void id_private() {
      if (!this.id_extends) {
         this.id_class.id_class(new rFM(-1, -1, ((rhz_3)this.id_implements[1]).id_finally()));
      }
   }

   @Override
   public void id_private(double var1, double var3, double var5) {
      this.id_case(var1, var3, var5);
      this.id_class.id_byte();
   }

   public void id_abstract(an_3 var1) {
      an_3 var2 = this.id_static();
      this.id_abstract = (an_3)(var1 == null ? this : var1);
      if (var2 != this.id_abstract) {
         this.id_class.id_class(new rZg_1(this.id_abstract));
         this.id_case(this.id_abstract.rx(), this.id_abstract.re(), this.id_abstract.BO());
      }
   }

   @Override
   public void id_final() {
      ((rJr_1)this.id_implements[4]).id_break((rhd_3)this);
      rJT var5 = (rJT)this.id_implements[3];
      this.id_implements[4] = var5;
   }

   private int id_synchronized(int var1) {
      return var1 <= 16 ? var1 - 1 : 17;
   }

   @Override
   protected int id_synchronized() {
      return this.id_break.id_class(this.sv());
   }

   @Override
   public boolean id_native() {
      return this.id_finally.id_break() == rRl_1.SPECTATOR;
   }

   @Override
   public void id_strictfp() {
      this.id_class.id_class(new rZU(((rJr_1)this.id_implements[4]).id_case));
      this.id_final();
   }

   public rqM_2<rYB> E() {
      return this.id_strictfp;
   }

   private void X() {
      rfl_3 var1 = new rfl_3(this.Bs()).id_byte(32.0, 10.0, 32.0);
      ((rYB)this.id_throws[7]).id_break(is_3.class, var1).stream().filter(var0 -> var0 instanceof ag_3).forEach(var1x -> ((ag_3)var1x).id_class(this));
   }

   @Override
   protected rpD_2 sq() {
      return new rqQ_2(this);
   }

   @Override
   public void BH() {
      an_3 var1 = this.ra();
      super.BH();
      an_3 var2 = this.ra();
      if (var2 != var1 && this.id_class != null) {
         this.id_class.id_class(this.rx(), this.re(), this.BO(), (Float)this.id_throws[15], (Float)this.id_throws[16]);
      }
   }

   @Override
   public void Sj() {
      super.Sj();
      this.id_class.id_class(new rZa_1(this.SW(), rvr_3.ENTER_COMBAT));
   }

   @Override
   protected void SA() {
      if (this.id_native()) {
         this.Bw();
         this.id_package(true);
      } else {
         super.SA();
      }
   }

   @Override
   protected void sP() {
      if (!((rdn_3)this.id_private[61]).id_class() && this.id_return()) {
         this.id_class.id_class(new rvQ_2(this, (byte)9));
         super.sP();
      }
   }

   @Override
   public ruS_2<?> p_() {
      return new rFk_1(this);
   }
}
