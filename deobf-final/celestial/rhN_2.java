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
   private static final Logger final_ = LogManager.getLogger();
   public rmy_3 class_;
   public final rnW_2 break_;
   public final rni_3 finally_;
   private final List<Integer> package_ = Lists.newLinkedList();
   private final hs_3 int_;
   private final rCa_1 new_;
   private float continue_ = Float.MIN_VALUE;
   private int super_ = Integer.MIN_VALUE;
   private int this_ = Integer.MIN_VALUE;
   private int else_ = Integer.MIN_VALUE;
   private int synchronized_ = Integer.MIN_VALUE;
   private int return_ = Integer.MIN_VALUE;
   private float public_ = -1.0E8F;
   private int goto_ = -99999999;
   private boolean while_ = true;
   private int try_ = -99999999;
   private int instanceof_ = 60;
   private rhJ_2 throw_;
   private boolean interface_ = true;
   private long char_ = rqR_2.break_();
   private an_3 abstract_;
   private boolean long_;
   private boolean float_;
   private final rWs_1 void_ = new rWs_1();
   private rjU_2 static_;
   private int import_;
   private boolean short_;
   private rjU_2 default_;
   private rjh_3 const_ = rjh_3.class_(0, 0, 0);
   private rqM_2<rYB> strictfp_ = rYB.byte_;
   private rfH_2 boolean_;
   private boolean transient_;
   private float for_;
   private final rgV_2 double_;
   private int switch_;
   public boolean extends_;
   public int native_;
   public boolean volatile_;

   public rgP_2 boolean_() {
      return null;
   }

   @Override
   public void char_(an_3 var1) {
      this.package_.remove(Integer.valueOf(var1.V()));
   }

   @Override
   public boolean byte_(rhN_2 var1) {
      if (var1.native_()) {
         return this.static_() == this;
      } else {
         return this.native_() ? false : super.byte_(var1);
      }
   }

   @Override
   public int byte_(Collection<rkw_3<?>> var1) {
      return this.void_.break_(var1, this);
   }

   private void byte_(rrEm_1 var1) {
      rfH_2 var2 = var1.X();
      if (var1.default_().break_() && var1.const_().rB().new_() != rRl_1.ADVENTURE) {
         int var3 = Math.max(0, this.break_.class_(var1));
         int var4 = rfU_2.byte_(var1.instanceof_().class_((double)var2.b_(), (double)var2.d_()));
         if (var4 < var3) {
            var3 = var4;
         }

         if (var4 <= 1) {
            var3 = 1;
         }

         long var5 = (long)(var3 * 2 + 1);
         long var7 = var5 * var5;
         int var9 = var7 > 2147483647L ? Integer.MAX_VALUE : (int)var7;
         int var10 = this.synchronized_(var9);
         int var11 = new Random().nextInt(var9);

         for (int var12 = 0; var12 < var9; var12++) {
            int var13 = (var11 + var10 * var12) % var9;
            int var14 = var13 % (var3 * 2 + 1);
            int var15 = var13 / (var3 * 2 + 1);
            rfH_2 var16 = rhc_3.class_(var1, var2.b_() + var14 - var3, var2.d_() + var15 - var3, false);
            if (var16 != null) {
               this.class_(var16, 0.0F, 0.0F);
               if (var1.throws_(this)) {
                  break;
               }
            }
         }
      } else {
         this.class_(var2, 0.0F, 0.0F);

         while (!var1.throws_(this) && this.re() < 255.0) {
            this.new_(this.rx(), this.re() + 1.0, this.BO());
         }
      }
   }

   @Override
   public boolean int_() {
      return this.short_;
   }

   public rCa_1 long_() {
      return this.new_;
   }

   public rWs_1 float_() {
      return this.void_;
   }

   public void double_() {
      this.long_ = false;
   }

   public rhN_2(rnW_2 var1, rrEm_1 var2, GameProfile var3, rni_3 var4) {
      super(var2, var2.X(), var2.J(), var3);
      var4.break_ = this;
      this.finally_ = var4;
      this.break_ = var1;
      this.new_ = var1.x().class_((rhd_3)this);
      this.int_ = var1.x().case_(this);
      Float var9 = 1.0F;
      this.throws_[37] = var9;
      this.byte_(var2);
      this.double_ = var1.class_(this);
   }

   public rfH_2 S() {
      return this.boolean_;
   }

   @Override
   public void this_() {
      this.finally_.class_();
      this.instanceof_--;
      if ((Integer)this.throws_[47] > 0) {
         Integer var9 = (Integer)this.throws_[47] - 1;
         this.throws_[47] = var9;
      }

      ((rJr_1)this.implements_[4]).native_();
      if (!((rYB)this.throws_[7]).continue_ && !((rJr_1)this.implements_[4]).class_((rhd_3)this)) {
         this.strictfp_();
         rJT var10 = (rJT)this.implements_[3];
         this.implements_[4] = var10;
      }

      while (!this.package_.isEmpty()) {
         int var1 = Math.min(this.package_.size(), Integer.MAX_VALUE);
         int[] var2 = new int[var1];
         Iterator var3 = this.package_.iterator();
         int var4 = 0;

         while (var3.hasNext() && var4 < var1) {
            var2[var4++] = (Integer)var3.next();
            var3.remove();
         }

         this.class_.class_(new rvG_2(var2));
      }

      an_3 var11 = this.static_();
      if (var11 != this) {
         if (var11.BM()) {
            this.break_(var11.rx(), var11.re(), var11.BO(), (Float)var11.throws_[15], (Float)var11.throws_[16]);
            this.continue_().else_().class_(this);
            if (this.sT()) {
               this.abstract_(this);
            }
         } else {
            this.abstract_(this);
         }
      }

      Oo_1.return_.class_(this);
      if (this.static_ != null) {
         Oo_1.else_.class_(this, this.static_, (Integer)this.throws_[41] - this.import_);
      }

      this.int_.break_(this);
   }

   @Override
   public void this_(int var1) {
      super.this_(var1);
      this.try_ = -1;
   }

   public boolean b() {
      return this.transient_;
   }

   public float s() {
      return this.for_;
   }

   private boolean d() {
      return this.break_.b();
   }

   @Override
   protected void a() {
      if (!this.long_) {
         super.a();
      }
   }

   @Override
   public void interface_(an_3 var1) {
      if (var1 instanceof rhd_3) {
         this.class_.class_(new rvG_2(var1.V()));
      } else {
         this.package_.add(var1.V());
      }
   }

   @Override
   protected void class_(rLY var1) {
      super.class_(var1);
      this.class_.class_(new rFr_1(this.V(), var1.class_()));
      if (var1.class_() == rLD.goto_) {
         this.static_ = null;
      }

      Oo_1.try_.class_(this);
   }

   @Override
   public void class_(rRl_1 var1) {
      this.finally_.class_(var1);
      this.class_.class_(new rZY(rZY.protected_, (float)var1.class_()));
      if (var1 == rRl_1.SPECTATOR) {
         this.sI();
         this.BH();
      } else {
         this.abstract_(this);
      }

      this.G();
      this.sE();
   }

   @Override
   public void class_(an_3 var1) {
      this.continue_().else_().class_(this, new rZj_1(var1, 4));
   }

   @Override
   protected void class_(rLY var1, boolean var2) {
      super.class_(var1, var2);
      this.class_.class_(new rvT_2(this.V(), var1));
      Oo_1.try_.class_(this);
   }

   public void class_(rhN_2 var1, boolean var2) {
      if (var2) {
         ((rhz_3)this.implements_[1]).class_((rhz_3)var1.implements_[1]);
         this.public_(var1.Ss());
         rpQ_2 var7 = (rpQ_2)var1.implements_[5];
         this.implements_[5] = var7;
         Integer var8 = (Integer)var1.implements_[19];
         this.implements_[19] = var8;
         Integer var9 = (Integer)var1.implements_[20];
         this.implements_[20] = var9;
         Float var10 = (Float)var1.implements_[21];
         this.implements_[21] = var10;
         this.break_(var1.sp());
         rfH_2 var11 = (rfH_2)var1.throws_[61];
         this.throws_[61] = var11;
      } else if (((rYB)this.throws_[7]).B().break_(rRu_1.byte_) || var1.native_()) {
         ((rhz_3)this.implements_[1]).class_((rhz_3)var1.implements_[1]);
         Integer var12 = (Integer)var1.implements_[19];
         this.implements_[19] = var12;
         Integer var13 = (Integer)var1.implements_[20];
         this.implements_[20] = var13;
         Float var14 = (Float)var1.implements_[21];
         this.implements_[21] = var14;
         this.break_(var1.sp());
      }

      Integer var15 = (Integer)var1.implements_[22];
      this.implements_[22] = var15;
      rXz_1 var16 = (rXz_1)var1.implements_[2];
      this.implements_[2] = var16;
      this.BQ().break_((rut_3<Object>)protected_[4], (Byte)var1.BQ().class_((rut_3)protected_[4]));
      this.try_ = -1;
      this.public_ = -1.0F;
      this.goto_ = -1;
      this.void_.class_(var1.void_);
      this.package_.addAll(var1.package_);
      this.float_ = var1.float_;
      this.default_ = var1.default_;
      this.catch_(var1.sQ());
      this.implements_(var1.sJ());
   }

   public void class_(String var1, String var2) {
      this.class_.class_(new rFs_1(var1, var2));
   }

   public void class_(rmw_3 var1) {
      this.throw_ = var1.break_();
      this.interface_ = var1.byte_();
      this.BQ().break_((rut_3<Byte>)protected_[4], (byte)var1.protected_());
      this.BQ().break_((rut_3<Byte>)protected_[5], (byte)(var1.throws_() == rpZ_2.LEFT ? 0 : 1));
   }

   public void class_(rgP_2 var1, rVU var2, UUID var3) {
      this.class_.class_(new rZK(var1, var2, var3), var4 -> {
         if (!var4.isSuccess() && (var2 == rVU.GAME_INFO || var2 == rVU.SYSTEM)) {
            short var5 = 256;
            String var6 = var1.class_(256);
            rVi_1 var7 = new rgN_2(var6).class_(rgF_2.YELLOW);
            this.class_.class_(new rZK(new rgn_3("multiplayer.message_not_delivered", var7).class_(rgF_2.RED), rVU.SYSTEM, var3));
         }
      });
   }

   @Override
   public void class_(rgP_2 var1, UUID var2) {
      this.class_(var1, rVU.SYSTEM, var2);
   }

   @Override
   public void class_(rqO_2[] var1) {
      ArrayList var2 = Lists.newArrayList();

      for (rqO_2 var6 : var1) {
         this.break_.V().class_(var6).ifPresent(var2::add);
      }

      this.break_(var2);
   }

   @Override
   public void class_(rCi_1<?> var1, int var2) {
      this.new_.break_(this, var1, var2);
      this.st().class_(var1, this.i(), var1x -> var1x.class_(var2));
   }

   public void class_(float var1, float var2, boolean var3, boolean var4) {
      if (this.Pm()) {
         if (var1 >= -1.0F && var1 <= 1.0F) {
            Float var9 = var1;
            this.private_[42] = var9;
         }

         if (var2 >= -1.0F && var2 <= 1.0F) {
            Float var10 = var2;
            this.private_[44] = var10;
         }

         Boolean var11 = var3;
         this.private_[41] = var11;
         this.volatile_(var4);
      }
   }

   @Override
   public void class_(rJr_1 var1, int var2, int var3) {
      this.class_.class_(new rFt_1(var1.case_, var2, var3));
   }

   @Override
   public void class_(rJr_1 var1, rqs_3<rdn_3> var2) {
      this.class_.class_(new rFT(var1.case_, var2));
      this.class_.class_(new rFM(-1, -1, ((rhz_3)this.implements_[1]).finally_()));
   }

   public void class_(Rm_1 var1, an_3 var2, Rm_1 var3) {
      rjU_2 var4 = var3.class_(var2);
      super.class_(var1, var4);
      this.class_.class_(new rvK_2(var1, var2, var3));
   }

   @Override
   public void class_(Rm_1 var1, rjU_2 var2) {
      super.class_(var1, var2);
      this.class_.class_(new rvK_2(var1, var2.break_, var2.byte_, var2.protected_));
   }

   @Override
   public void class_(rgP_2 var1, boolean var2) {
      this.class_.class_(new rZK(var1, var2 ? rVU.GAME_INFO : rVU.CHAT, rqR_2.break_));
   }

   public void class_(rjh_3 var1) {
      this.const_ = var1;
   }

   public void class_(rfj_3 var1) {
      if (this.BM()) {
         this.class_.class_(new rFZ(var1.break_, var1.byte_));
      }
   }

   public void class_(rfj_3 var1, ruS_2<?> var2, ruS_2<?> var3) {
      this.class_.class_(var3);
      this.class_.class_(var2);
   }

   public void class_(rqM_2<rYB> var1, rfH_2 var2, float var3, boolean var4, boolean var5) {
      if (var2 != null) {
         boolean var6 = var2.equals(this.boolean_) && var1.equals(this.strictfp_);
         if (var5 && !var6) {
            this.class_(new rgn_3("block.minecraft.set_spawn"), rqR_2.break_);
         }

         this.boolean_ = var2;
         this.strictfp_ = var1;
         this.for_ = var3;
         this.transient_ = var4;
      } else {
         this.boolean_ = null;
         this.strictfp_ = rYB.byte_;
         this.for_ = 0.0F;
         this.transient_ = false;
      }
   }

   @Override
   public rsE_2 class_(rdn_3 var1, boolean var2, boolean var3) {
      rsE_2 var4 = super.class_(var1, var2, var3);
      if (var4 == null) {
         return null;
      } else {
         ((rYB)this.throws_[7]).a_(var4);
         rdn_3 var5 = var4.protected_();
         if (var3) {
            if (!var5.class_()) {
               this.class_(rlB_2.case_.break_(var5.break_()), var1.char_());
            }

            this.break_(rlB_2.char_);
         }

         return var4;
      }
   }

   @Override
   public void class_(rqA_2 var1, rqL_2 var2, float var3, float var4) {
      this.class_.class_(new rvt_3(var1, var2, this.rx(), this.re(), this.BO(), var3, var4));
   }

   @Override
   public void class_(rpm_3 var1) {
      super.class_(var1);
      this.sg();
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("playerGameType", this.finally_.break_().class_());
      var1.break_("previousPlayerGameType", this.finally_.byte_().class_());
      var1.class_("seenCredits", this.float_);
      if (this.default_ != null) {
         rcd_3 var2 = new rcd_3();
         var2.class_("x", this.default_.break_);
         var2.class_("y", this.default_.byte_);
         var2.class_("z", this.default_.protected_);
         var1.class_("enteredNetherPosition", var2);
      }

      an_3 var6 = this.PO();
      an_3 var3 = this.ra();
      if (var3 != null && var6 != this && var6.Pq()) {
         rcd_3 var4 = new rcd_3();
         rcd_3 var5 = new rcd_3();
         var6.byte_(var5);
         var4.class_("Attach", var3.ro());
         var4.class_("Entity", var5);
         var1.class_("RootVehicle", var4);
      }

      var1.class_("recipeBook", this.void_.class_());
      var1.class_("Dimension", ((rYB)this.throws_[7]).E().class_().toString());
      if (this.boolean_ != null) {
         var1.break_("SpawnX", this.boolean_.b_());
         var1.break_("SpawnY", this.boolean_.c_());
         var1.break_("SpawnZ", this.boolean_.d_());
         var1.class_("SpawnForced", this.transient_);
         var1.class_("SpawnAngle", this.for_);
         rqO_2.class_
            .encodeStart(rcf_3.class_, this.strictfp_.class_())
            .resultOrPartial(final_::error)
            .ifPresent(var1x -> var1.class_("SpawnDimension", var1x));
      }
   }

   public void class_(int var1) {
      float var2 = (float)this.sn();
      float var3 = (var2 - 1.0F) / var2;
      Float var8 = rfU_2.class_((float)var1 / var2, 0.0F, var3);
      this.implements_[21] = var8;
      this.try_ = -1;
   }

   public void class_(rrEm_1 var1, double var2, double var4, double var6, float var8, float var9) {
      this.abstract_(this);
      this.BH();
      if (var1 == (rYB)this.throws_[7]) {
         this.class_.class_(var2, var4, var6, var8, var9);
      } else {
         rrEm_1 var10 = this.continue_();
         rrGs_1 var11 = var1.public_();
         this.class_
            .class_(new rFP(var1.default_(), var1.E(), rYA.class_(var1.break_()), this.finally_.break_(), this.finally_.byte_(), var1.b(), var1.z(), true));
         this.class_.class_(new rFE(var11.extends_(), var11.native_()));
         this.break_.x().protected_(this);
         var10.throws_(this);
         Boolean var16 = false;
         this.throws_[27] = var16;
         this.class_(var2, var4, var6, var8, var9);
         this.class_((rYB)var1);
         var1.class_(this);
         this.protected_(var10);
         this.class_.class_(var2, var4, var6, var8, var9);
         this.finally_.class_(var1);
         this.break_.x().class_(this, var1);
         this.break_.x().throws_(this);
      }
   }

   @Override
   protected void class_(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
   }

   @Override
   public boolean class_(rye_3 var1) {
      return super.class_(var1) || this.for_() || ((rhx_3)this.implements_[18]).class_ && var1 == rye_3.int_;
   }

   private void class_(String var1, String var2, rAi_1[] var3) {
      rnB_2 var4 = this.st().private_(var2);
      if (var4 != null) {
         int var5 = var4.volatile_().class_();
         if (var5 >= 0 && var5 < var3.length) {
            this.st().class_(var3[var5], var1, rAa_1::class_);
         }
      }
   }

   @Override
   public boolean class_(an_3 var1, boolean var2) {
      an_3 var3 = this.ra();
      if (!super.class_(var1, var2)) {
         return false;
      } else {
         an_3 var4 = this.ra();
         if (var4 != var3 && this.class_ != null) {
            this.class_.class_(this.rx(), this.re(), this.BO(), (Float)this.throws_[15], (Float)this.throws_[16]);
         }

         return true;
      }
   }

   @Override
   public OptionalInt class_(rJZ var1) {
      if (var1 == null) {
         return OptionalInt.empty();
      } else {
         if ((rJr_1)this.implements_[4] != (rJT)this.implements_[3]) {
            this.strictfp_();
         }

         this.k();
         rJr_1 var2 = var1.createMenu(this.switch_, (rhz_3)this.implements_[1], this);
         if (var2 == null) {
            if (this.native_()) {
               this.class_(new rgn_3("container.spectatorCantOpen").class_(rgF_2.RED), true);
            }

            return OptionalInt.empty();
         } else {
            this.class_.class_(new rvp_3(var2.case_, var2.finally_(), var1.L_()));
            var2.class_((rJu_1)this);
            this.implements_[4] = var2;
            return OptionalInt.of(this.switch_);
         }
      }
   }

   @Override
   public void class_(ryS_2 var1) {
      var1.class_((rhd_3)this);
      this.class_.class_(new rvy_3(var1.char_()));
   }

   @Override
   public void class_(an_3 var1, int var2, rye_3 var3) {
      if (var1 != this) {
         super.class_(var1, var2, var3);
         this.continue_(var2);
         String var4 = this.i();
         String var5 = var1.i();
         this.st().class_(rAi_1.case_, var4, rAa_1::class_);
         if (var1 instanceof rhd_3) {
            this.break_(rlB_2.boolean_);
            this.st().class_(rAi_1.throws_, var4, rAa_1::class_);
         } else {
            this.break_(rlB_2.const_);
         }

         this.class_(var4, var5, rAi_1.volatile_);
         this.class_(var5, var4, rAi_1.final_);
         Oo_1.break_.class_(this, var1, var3);
      }
   }

   public void class_(double var1, boolean var3) {
      rfH_2 var4 = this.BS();
      if (((rYB)this.throws_[7]).int_(var4)) {
         super.class_(var1, var3, ((rYB)this.throws_[7]).byte_(var4), var4);
      }
   }

   private boolean class_(rfH_2 var1, rpr_3 var2) {
      return this.implements_(var1) || this.implements_(var1.break_(var2.case_()));
   }

   private void class_(ryO_2 var1) {
      if (var1 != null) {
         rFy_1 var2 = var1.Y_();
         if (var2 != null) {
            this.class_.class_(var2);
         }
      }
   }

   @Override
   public void class_(an_3 var1, int var2) {
      super.class_(var1, var2);
      ((rJr_1)this.implements_[4]).native_();
   }

   @Override
   public Either<rhW_2, rqg_3> class_(rfH_2 var1) {
      rpr_3 var2 = ((rYB)this.throws_[7]).byte_(var1).byte_(kE_2.p);
      if (this.Sc() || !this.BM()) {
         return Either.left((rhW_2)rhW_2.staticFields4c1a1e3ca1b33044b12dba3caf94435e[4]);
      } else if (!((rYB)this.throws_[7]).default_().throws_()) {
         return Either.left((rhW_2)rhW_2.staticFields4c1a1e3ca1b33044b12dba3caf94435e[0]);
      } else if (!this.class_(var1, var2)) {
         return Either.left((rhW_2)rhW_2.staticFields4c1a1e3ca1b33044b12dba3caf94435e[2]);
      } else if (this.break_(var1, var2)) {
         return Either.left((rhW_2)rhW_2.staticFields4c1a1e3ca1b33044b12dba3caf94435e[3]);
      } else {
         this.class_(((rYB)this.throws_[7]).E(), var1, (Float)this.throws_[15], false, true);
         if (((rYB)this.throws_[7]).strictfp_()) {
            return Either.left((rhW_2)rhW_2.staticFields4c1a1e3ca1b33044b12dba3caf94435e[1]);
         } else {
            if (!this.implements_()) {
               rjU_2 var3 = rjU_2.protected_(var1);
               List var4 = ((rYB)this.throws_[7])
                  .class_(
                     rEi_1.class,
                     new rfl_3(var3.class_() - 8.0, var3.break_() - 5.0, var3.byte_() - 8.0, var3.class_() + 8.0, var3.break_() + 5.0, var3.byte_() + 8.0),
                     var1x -> var1x.throws_(this)
                  );
               if (!var4.isEmpty()) {
                  return Either.left((rhW_2)rhW_2.staticFields4c1a1e3ca1b33044b12dba3caf94435e[5]);
               }
            }

            Either var5 = super.class_(var1).ifRight(var1x -> {
               this.break_(rlB_2.c);
               Oo_1.new_.class_(this);
            });
            ((rrEm_1)((rYB)this.throws_[7])).private_();
            return var5;
         }
      }
   }

   @Override
   public void class_(boolean var1, boolean var2) {
      if (this.Sc()) {
         this.continue_().else_().class_(this, new rZj_1(this, 2));
      }

      super.class_(var1, var2);
      if (this.class_ != null) {
         this.class_.class_(this.rx(), this.re(), this.BO(), (Float)this.throws_[15], (Float)this.throws_[16]);
      }
   }

   @Override
   public an_3 class_(rrEm_1 var1) {
      this.long_ = true;
      rrEm_1 var2 = this.continue_();
      rqM_2 var3 = var2.E();
      if (var3 == rYB.throws_ && var1.E() == rYB.byte_) {
         this.K();
         this.continue_().throws_(this);
         if (!this.volatile_) {
            this.volatile_ = true;
            this.class_.class_(new rZY(rZY.throws_, this.float_ ? 0.0F : 1.0F));
            this.float_ = true;
         }

         return this;
      } else {
         rrGs_1 var4 = var1.public_();
         this.class_
            .class_(new rFP(var1.default_(), var1.E(), rYA.class_(var1.break_()), this.finally_.break_(), this.finally_.byte_(), var1.b(), var1.z(), true));
         this.class_.class_(new rFE(var4.extends_(), var4.native_()));
         rCr_1 var5 = this.break_.x();
         var5.protected_(this);
         var2.throws_(this);
         Boolean var13 = false;
         this.throws_[27] = var13;
         WP var6 = this.break_(var1);
         if (var6 != null) {
            if (var3 == rYB.byte_ && var1.E() == rYB.protected_) {
               this.default_ = this.Ps();
            } else if (var1.E() == rYB.throws_) {
               this.class_(var1, new rfH_2(var6.class_));
            }

            this.class_((rYB)var1);
            var1.break_(this);
            this.case_(var6.byte_, var6.protected_);
            this.private_(var6.class_.break_, var6.class_.byte_, var6.class_.protected_);
            this.protected_(var2);
            this.finally_.class_(var1);
            this.class_.class_(new rvf_3((rhx_3)this.implements_[18]));
            var5.class_(this, var1);
            var5.throws_(this);

            for (rLY var8 : this.So()) {
               this.class_.class_(new rvT_2(this.V(), var8));
            }

            this.class_.class_(new rvw_3(1032, rfH_2.protected_, 0, false));
            this.try_ = -1;
            this.public_ = -1.0F;
            this.goto_ = -1;
         }

         return this;
      }
   }

   private void class_(rrEm_1 var1, rfH_2 var2) {
      rfw_3 var3 = var2.new_();

      for (int var4 = -2; var4 <= 2; var4++) {
         for (int var5 = -2; var5 <= 2; var5++) {
            for (int var6 = -1; var6 < 3; var6++) {
               xc_3 var7 = var6 == -1 ? xu_3.rg.continue_() : xu_3.class_.continue_();
               var1.break_(var3.class_(var2).byte_(var5, var6, var4), var7);
            }
         }
      }
   }

   @Override
   protected Optional<rqT_2> class_(rrEm_1 var1, rfH_2 var2, boolean var3) {
      Optional var4 = super.class_(var1, var2, var3);
      if (var4.isPresent()) {
         return var4;
      } else {
         rpB_2 var5 = ((rYB)this.throws_[7]).byte_((rfH_2)this.throws_[61]).protected_(kT_2.volatile_).orElse(rpB_2.X);
         Optional var6 = var1.M().class_(var2, var5);
         if (!var6.isPresent()) {
            final_.error("Unable to create a portal, likely target out of worldborder");
         }

         return var6;
      }
   }

   public void class_(rJr_1 var1) {
      this.class_(var1, var1.extends_());
   }

   @Override
   protected void class_(xc_3 var1) {
      Oo_1.protected_.class_(this, var1);
   }

   @Override
   public void class_(rJr_1 var1, int var2, rdn_3 var3) {
      if (!(var1.class_(var2) instanceof rJS)) {
         if (var1 == (rJT)this.implements_[3]) {
            Oo_1.throws_.class_(this, (rhz_3)this.implements_[1], var3);
         }

         if (!this.extends_) {
            this.class_.class_(new rFM(var1.case_, var2, var3));
         }
      }
   }

   @Override
   public void class_(rHZ var1) {
      var1.byte_(true);
      this.class_((ryO_2)var1);
   }

   @Override
   public void class_(rOD var1, rXu_1 var2) {
      if ((rJr_1)this.implements_[4] != (rJT)this.implements_[3]) {
         this.strictfp_();
      }

      this.k();
      this.class_.class_(new rvH_2(this.switch_, var2.else_(), var1.V()));
      rJQ var7 = new rJQ(this.switch_, (rhz_3)this.implements_[1], var2, var1);
      this.implements_[4] = var7;
      ((rJr_1)this.implements_[4]).class_((rJu_1)this);
   }

   @Override
   public void class_(rdn_3 var1, rpm_3 var2) {
      rdb_3 var3 = var1.break_();
      if (var3 == rdy_3.dr) {
         if (rkZ_2.class_(var1, this.PL(), this)) {
            ((rJr_1)this.implements_[4]).native_();
         }

         this.class_.class_(new rvl_3(var2));
      }
   }

   @Override
   public void class_(int var1, rdf_3 var2, int var3, int var4, boolean var5, boolean var6) {
      this.class_.class_(new rvL_2(var1, var2, var3, var4, var5, var6));
   }

   private void class_(rAi_1 var1, int var2) {
      this.st().class_(var1, this.i(), var1x -> var1x.break_(var2));
   }

   private void k() {
      this.switch_ = this.switch_ % 100 + 1;
   }

   public long short_() {
      return this.char_;
   }

   public hs_3 r() {
      return this.int_;
   }

   @Override
   public void sh() {
      super.sh();
      this.class_.class_(new rZa_1(this.SW(), rvr_3.END_COMBAT));
   }

   @Override
   protected WP break_(rrEm_1 var1) {
      WP var2 = super.break_(var1);
      if (var2 != null && ((rYB)this.throws_[7]).E() == rYB.byte_ && var1.E() == rYB.throws_) {
         rjU_2 var3 = var2.class_.break_(0.0, -1.0, 0.0);
         return new WP(var3, rjU_2.class_, 90.0F, 0.0F);
      } else {
         return var2;
      }
   }

   private boolean break_(rfH_2 var1, rpr_3 var2) {
      rfH_2 var3 = var1.final_();
      return !this.private_(var3) || !this.private_(var3.break_(var2.case_()));
   }

   @Override
   public int break_(Collection<rkw_3<?>> var1) {
      return this.void_.class_(var1, this);
   }

   @Override
   public void break_(rye_3 var1) {
      boolean var2 = ((rYB)this.throws_[7]).B().break_(rRu_1.native_);
      if (var2) {
         rgP_2 var3 = this.SW().break_();
         this.class_.class_(new rZa_1(this.SW(), rvr_3.ENTITY_DIED, var3), var2x -> {
            if (!var2x.isSuccess()) {
               short var3x = 256;
               String var4x = var3.class_(256);
               rgn_3 var5x = new rgn_3("death.attack.message_too_long", new rgN_2(var4x).class_(rgF_2.YELLOW));
               rVi_1 var6 = new rgn_3("death.attack.even_more_magic", this.L_()).class_(var1xx -> var1xx.class_(new rgy_3(rgp_3.class_, var5x)));
               this.class_.class_(new rZa_1(this.SW(), rvr_3.ENTITY_DIED, var6));
            }
         });
         rnM_2 var4 = this.BG();
         if (var4 == null || var4.finally_() == rnX_2.ALWAYS) {
            this.break_.x().class_(var3, rVU.SYSTEM, rqR_2.break_);
         } else if (var4.finally_() == rnX_2.HIDE_FOR_OTHER_TEAMS) {
            this.break_.x().class_(this, var3);
         } else if (var4.finally_() == rnX_2.HIDE_FOR_OWN_TEAM) {
            this.break_.x().break_(this, var3);
         }
      } else {
         this.class_.class_(new rZa_1(this.SW(), rvr_3.ENTITY_DIED));
      }

      this.sI();
      if (((rYB)this.throws_[7]).B().break_(rRu_1.abstract_)) {
         this.X();
      }

      if (!this.native_()) {
         this.protected_(var1);
      }

      this.st().class_(rAi_1.protected_, this.i(), rAa_1::class_);
      iB_2 var5 = this.Sh();
      if (var5 != null) {
         this.class_(rlB_2.private_.break_(var5.BC()));
         var5.class_(this, (Integer)this.private_[39], var1);
         this.class_(var5);
      }

      ((rYB)this.throws_[7]).class_(this, (byte)3);
      this.break_(rlB_2.default_);
      this.break_(rlB_2.implements_.break_(rlB_2.native_));
      this.break_(rlB_2.implements_.break_(rlB_2.volatile_));
      this.rE();
      this.break_(0, false);
      this.SW().throws_();
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("playerGameType", 99)) {
         if (this.rC().c()) {
            this.finally_.class_(this.rC().package_(), rRl_1.NOT_SET);
         } else {
            this.finally_
               .class_(
                  rRl_1.class_(var1.private_("playerGameType")),
                  var1.byte_("previousPlayerGameType", 3) ? rRl_1.class_(var1.private_("previousPlayerGameType")) : rRl_1.NOT_SET
               );
         }
      }

      if (var1.byte_("enteredNetherPosition", 10)) {
         rcd_3 var2 = var1.int_("enteredNetherPosition");
         this.default_ = new rjU_2(var2.extends_("x"), var2.extends_("y"), var2.extends_("z"));
      }

      this.float_ = var1.new_("seenCredits");
      if (var1.byte_("recipeBook", 10)) {
         this.void_.class_(var1.int_("recipeBook"), this.break_.V());
      }

      if (this.Sc()) {
         this.SQ();
      }

      if (var1.byte_("SpawnX", 99) && var1.byte_("SpawnY", 99) && var1.byte_("SpawnZ", 99)) {
         this.boolean_ = new rfH_2(var1.private_("SpawnX"), var1.private_("SpawnY"), var1.private_("SpawnZ"));
         this.transient_ = var1.new_("SpawnForced");
         this.for_ = var1.finally_("SpawnAngle");
         if (var1.throws_("SpawnDimension")) {
            this.strictfp_ = rYB.break_.parse(rcf_3.class_, var1.byte_("SpawnDimension")).resultOrPartial(final_::error).orElse(rYB.byte_);
         }
      }
   }

   @Override
   public void break_(an_3 var1) {
      this.continue_().else_().class_(this, new rZj_1(var1, 5));
   }

   @Override
   public void break_(rdn_3 var1, int var2) {
      super.break_(var1, var2);
      this.try_ = -1;
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else {
         boolean var3 = this.break_.switch_() && this.d() && "fall".equals(var1.synchronized_);
         if (!var3 && this.instanceof_ > 0 && var1 != rye_3.volatile_) {
            return false;
         } else {
            if (var1 instanceof rpX_2) {
               an_3 var4 = var1.extends_();
               if (var4 instanceof rhd_3 && !this.throws_((rhd_3)var4)) {
                  return false;
               }

               if (var4 instanceof rhm_3 var5) {
                  an_3 var6 = var5.else_();
                  if (var6 instanceof rhd_3 && !this.throws_((rhd_3)var6)) {
                     return false;
                  }
               }
            }

            return super.break_(var1, var2);
         }
      }
   }

   @Override
   public void break_(rCi_1<?> var1) {
      this.new_.class_(this, var1, 0);
      this.st().class_(var1, this.i(), rAa_1::byte_);
   }

   public void throws_() {
      ((rJr_1)this.implements_[4]).class_((rJu_1)this);
   }

   @Override
   protected void throws_(rfH_2 var1) {
      if (!this.native_()) {
         super.throws_(var1);
      }
   }

   @Override
   public boolean throws_(rhd_3 var1) {
      return !this.d() ? false : super.throws_(var1);
   }

   public rjh_3 M() {
      return this.const_;
   }

   public void catch_() {
      try {
         if (!this.native_() || ((rYB)this.throws_[7]).int_(this.Bs())) {
            super.this_();
         }

         for (int var1 = 0; var1 < ((rhz_3)this.implements_[1]).else_(); var1++) {
            rdn_3 var5 = ((rhz_3)this.implements_[1]).extends_(var1);
            if (var5.break_().class_()) {
               ruS_2 var6 = ((rxP_2)var5.break_()).class_(var5, (rYB)this.throws_[7], this);
               if (var6 != null) {
                  this.class_.class_(var6);
               }
            }
         }

         if (this.Ss() != this.public_ || this.goto_ != ((rpQ_2)this.implements_[5]).class_() || ((rpQ_2)this.implements_[5]).byte_() == 0.0F != this.while_) {
            this.class_.class_(new rFn_1(this.Ss(), ((rpQ_2)this.implements_[5]).class_(), ((rpQ_2)this.implements_[5]).byte_()));
            this.public_ = this.Ss();
            this.goto_ = ((rpQ_2)this.implements_[5]).class_();
            this.while_ = ((rpQ_2)this.implements_[5]).byte_() == 0.0F;
         }

         if (this.Ss() + this.Sd() != this.continue_) {
            this.continue_ = this.Ss() + this.Sd();
            this.class_(rAi_1.catch_, rfU_2.case_(this.continue_));
         }

         if (((rpQ_2)this.implements_[5]).class_() != this.super_) {
            this.super_ = ((rpQ_2)this.implements_[5]).class_();
            this.class_(rAi_1.private_, rfU_2.case_((float)this.super_));
         }

         if (this.PA() != this.this_) {
            this.this_ = this.PA();
            this.class_(rAi_1.implements_, rfU_2.case_((float)this.this_));
         }

         if (this.Bq() != this.else_) {
            this.else_ = this.Bq();
            this.class_(rAi_1.finally_, rfU_2.case_((float)this.else_));
         }

         if ((Integer)this.implements_[20] != this.return_) {
            this.return_ = (Integer)this.implements_[20];
            this.class_(rAi_1.extends_, rfU_2.case_((float)this.return_));
         }

         if ((Integer)this.implements_[19] != this.synchronized_) {
            this.synchronized_ = (Integer)this.implements_[19];
            this.class_(rAi_1.native_, rfU_2.case_((float)this.synchronized_));
         }

         if ((Integer)this.implements_[20] != this.try_) {
            this.try_ = (Integer)this.implements_[20];
            this.class_.class_(new rFG((Float)this.implements_[21], (Integer)this.implements_[20], (Integer)this.implements_[19]));
         }

         if ((Integer)this.throws_[41] % 20 == 0) {
            Oo_1.int_.class_(this);
         }
      } catch (Throwable var4) {
         KY var2 = KY.class_(var4, "Ticking player");
         Ko_1 var3 = var2.class_("Player being ticked");
         this.class_(var3);
         throw new KU(var2);
      }
   }

   @Override
   public void G() {
      if (this.class_ != null) {
         this.class_.class_(new rvf_3((rhx_3)this.implements_[18]));
         this.SA();
      }
   }

   public rgV_2 O() {
      return this.double_;
   }

   @Override
   public void case_(rfH_2 var1) {
      this.break_(rlB_2.implements_.break_(rlB_2.volatile_));
      super.case_(var1);
   }

   @Override
   public void case_(double var1, double var3, double var5) {
      this.class_.class_(var1, var3, var5, (Float)this.throws_[15], (Float)this.throws_[16]);
   }

   public rrEm_1 continue_() {
      return (rrEm_1)((rYB)this.throws_[7]);
   }

   public void else_(int var1) {
      Integer var6 = var1;
      this.implements_[19] = var6;
      this.try_ = -1;
   }

   public rhJ_2 else_() {
      return this.throw_;
   }

   public boolean for_() {
      return this.long_;
   }

   private boolean implements_(rfH_2 var1) {
      rjU_2 var2 = rjU_2.protected_(var1);
      return Math.abs(this.rx() - var2.class_()) <= 3.0 && Math.abs(this.re() - var2.break_()) <= 2.0 && Math.abs(this.BO() - var2.byte_()) <= 3.0;
   }

   @Override
   public boolean implements_() {
      return this.finally_.break_() == rRl_1.CREATIVE;
   }

   @Override
   public void new_() {
      this.public_ = -1.0E8F;
   }

   public void package_() {
      this.short_ = true;
      this.Bn();
      if (this.Sc()) {
         this.class_(true, false);
      }
   }

   public String super_() {
      String var1 = this.class_.class_.byte_().toString();
      var1 = var1.substring(var1.indexOf("/") + 1);
      return var1.substring(0, var1.indexOf(":"));
   }

   @Override
   public void super_(int var1) {
      super.super_(var1);
      this.try_ = -1;
   }

   @Override
   public void throw_(an_3 var1) {
      if (this.finally_.break_() == rRl_1.SPECTATOR) {
         this.abstract_(var1);
      } else {
         super.throw_(var1);
      }
   }

   public an_3 static_() {
      return (an_3)(this.abstract_ == null ? this : this.abstract_);
   }

   @Override
   public void public_() {
      this.char_ = rqR_2.break_();
   }

   @Override
   protected void protected_(rLY var1) {
      super.protected_(var1);
      this.class_.class_(new rvT_2(this.V(), var1));
      if (var1.class_() == rLD.goto_) {
         this.import_ = (Integer)this.throws_[41];
         this.static_ = this.Ps();
      }

      Oo_1.try_.class_(this);
   }

   private void protected_(rrEm_1 var1) {
      rqM_2 var2 = var1.E();
      rqM_2 var3 = ((rYB)this.throws_[7]).E();
      Oo_1.synchronized_.class_(this, var2, var3);
      if (var2 == rYB.protected_ && var3 == rYB.byte_ && this.default_ != null) {
         Oo_1.throw_.class_(this, this.default_);
      }

      if (var3 != rYB.protected_) {
         this.default_ = null;
      }
   }

   @Override
   public void private_() {
      if (!this.extends_) {
         this.class_.class_(new rFM(-1, -1, ((rhz_3)this.implements_[1]).finally_()));
      }
   }

   @Override
   public void private_(double var1, double var3, double var5) {
      this.case_(var1, var3, var5);
      this.class_.byte_();
   }

   public void abstract_(an_3 var1) {
      an_3 var2 = this.static_();
      this.abstract_ = (an_3)(var1 == null ? this : var1);
      if (var2 != this.abstract_) {
         this.class_.class_(new rZg_1(this.abstract_));
         this.case_(this.abstract_.rx(), this.abstract_.re(), this.abstract_.BO());
      }
   }

   @Override
   public void final_() {
      ((rJr_1)this.implements_[4]).break_((rhd_3)this);
      rJT var5 = (rJT)this.implements_[3];
      this.implements_[4] = var5;
   }

   private int synchronized_(int var1) {
      return var1 <= 16 ? var1 - 1 : 17;
   }

   @Override
   protected int synchronized_() {
      return this.break_.class_(this.sv());
   }

   @Override
   public boolean native_() {
      return this.finally_.break_() == rRl_1.SPECTATOR;
   }

   @Override
   public void strictfp_() {
      this.class_.class_(new rZU(((rJr_1)this.implements_[4]).case_));
      this.final_();
   }

   public rqM_2<rYB> E() {
      return this.strictfp_;
   }

   private void X() {
      rfl_3 var1 = new rfl_3(this.Bs()).byte_(32.0, 10.0, 32.0);
      ((rYB)this.throws_[7]).break_(is_3.class, var1).stream().filter(var0 -> var0 instanceof ag_3).forEach(var1x -> ((ag_3)var1x).class_(this));
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
      if (var2 != var1 && this.class_ != null) {
         this.class_.class_(this.rx(), this.re(), this.BO(), (Float)this.throws_[15], (Float)this.throws_[16]);
      }
   }

   @Override
   public void Sj() {
      super.Sj();
      this.class_.class_(new rZa_1(this.SW(), rvr_3.ENTER_COMBAT));
   }

   @Override
   protected void SA() {
      if (this.native_()) {
         this.Bw();
         this.package_(true);
      } else {
         super.SA();
      }
   }

   @Override
   protected void sP() {
      if (!((rdn_3)this.private_[61]).class_() && this.return_()) {
         this.class_.class_(new rvQ_2(this, (byte)9));
         super.sP();
      }
   }

   @Override
   public ruS_2<?> p_() {
      return new rFk_1(this);
   }
}
