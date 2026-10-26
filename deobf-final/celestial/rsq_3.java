package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import org.apache.logging.log4j.Logger;

public class rsq_3 extends rsy_3 implements rha_3, rsn_3 {
   private static final rut_3<rsp_3> synchronized_ = rmE_2.class_(rsq_3.class, ruw_3.new_);
   public static final Map<rdb_3, Integer> this_ = ImmutableMap.of(rdy_3.hS, 4, rdy_3.dE, 1, rdy_3.ds, 1, rdy_3.kX, 1);
   private static final Set<rdb_3> return_ = ImmutableSet.of(rdy_3.hS, rdy_3.dE, rdy_3.ds, rdy_3.hB, rdy_3.hP, rdy_3.kX, new rdb_3[]{rdy_3.kJ});
   private int public_;
   private boolean goto_;
   private rhd_3 while_;
   private byte try_;
   private final rgY_2 instanceof_ = new rgY_2();
   private long throw_;
   private long interface_;
   private int char_;
   private long abstract_;
   private int long_;
   private long float_;
   private boolean void_;
   private static final ImmutableList<il_3<?>> static_ = ImmutableList.of(
      il_3.break_,
      il_3.byte_,
      il_3.protected_,
      il_3.throws_,
      il_3.catch_,
      il_3.private_,
      il_3.implements_,
      il_3.finally_,
      il_3.extends_,
      il_3.native_,
      il_3.static_,
      il_3.volatile_,
      new il_3[]{
         il_3.final_,
         il_3.new_,
         il_3.continue_,
         il_3.this_,
         il_3.synchronized_,
         il_3.return_,
         il_3.public_,
         il_3.goto_,
         il_3.try_,
         il_3.case_,
         il_3.instanceof_,
         il_3.throw_,
         il_3.interface_,
         il_3.abstract_,
         il_3.long_,
         il_3.float_,
         il_3.char_
      }
   );
   private static final ImmutableList<rrP_2<? extends rrr_3<? super rsq_3>>> import_ = ImmutableList.of(
      rrP_2.byte_, rrP_2.protected_, rrP_2.break_, rrP_2.throws_, rrP_2.case_, rrP_2.catch_, rrP_2.private_, rrP_2.implements_, rrP_2.finally_
   );
   public static final Map<il_3<rfK_2>, BiPredicate<rsq_3, rRP>> else_ = ImmutableMap.of(
      il_3.break_,
      (BiPredicate<rsq_3, rRP>)(var0, var1) -> var1 == rRP.continue_,
      il_3.byte_,
      (BiPredicate<rsq_3, rRP>)(var0, var1) -> var0.su().break_().class_() == var1,
      il_3.protected_,
      (BiPredicate<rsq_3, rRP>)(var0, var1) -> rRP.class_.test(var1),
      il_3.throws_,
      (BiPredicate<rsq_3, rRP>)(var0, var1) -> var1 == rRP.super_
   );

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.kP;
   }

   public void byte_(rrEm_1 var1) {
      iZ_2 var2 = this.SF();
      var2.break_(var1, this);
      iZ_2 var7 = var2.throws_();
      this.private_[72] = var7;
      this.class_(this.SF());
   }

   @Override
   protected void double_() {
      this.SF().class_((rrEm_1)((rYB)this.throws_[7]), this);
      if (this.void_) {
         this.void_ = false;
      }

      if (!this.n() && this.public_ > 0) {
         this.public_--;
         if (this.public_ <= 0) {
            if (this.goto_) {
               this.sw();
               this.goto_ = false;
            }

            this.break_(new rLY(rLD.finally_, 200, 0));
         }
      }

      if (this.while_ != null && (rYB)this.throws_[7] instanceof rrEm_1) {
         ((rrEm_1)((rYB)this.throws_[7])).class_(rsC_2.throws_, this.while_, this);
         ((rYB)this.throws_[7]).class_(this, (byte)14);
         this.while_ = null;
      }

      if (!this.c() && ((Random)this.throws_[40]).nextInt(100) == 0) {
         rrEr_1 var1 = ((rrEm_1)((rYB)this.throws_[7])).interface_(this.Bs());
         if (var1 != null && var1.this_() && !var1.class_()) {
            ((rYB)this.throws_[7]).class_(this, (byte)42);
         }
      }

      if (this.su().break_() == rsT_2.class_ && this.n()) {
         this.sx();
      }

      super.double_();
   }

   public rsq_3(aI_2<? extends rsq_3> var1, rYB var2) {
      this(var1, var2, rhi_3.byte_);
   }

   public rsq_3(aI_2<? extends rsq_3> var1, rYB var2, rhi_3 var3) {
      super(var1, var2);
      ((rLA)this.public_()).class_(true);
      this.public_().byte_(true);
      this.byte_(true);
      this.class_(this.su().class_(var3).class_(rsT_2.class_));
   }

   private void sp() {
      this.class_(il_3.break_);
      this.class_(il_3.byte_);
      this.class_(il_3.protected_);
      this.class_(il_3.throws_);
   }

   @Override
   public void this_() {
      super.this_();
      if (this.L() > 0) {
         this.this_(this.L() - 1);
      }

      this.sf();
   }

   private boolean sl() {
      return this.long_ == 0 || this.long_ < 2 && ((rYB)this.throws_[7]).r() > this.abstract_ + 2400L;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      rsp_3.class_.encodeStart(rcf_3.class_, this.su()).resultOrPartial(((Logger)case_[0])::error).ifPresent(var1x -> var1.class_("VillagerData", var1x));
      var1.class_("FoodLevel", this.try_);
      var1.class_("Gossips", (rcZ_2)this.instanceof_.class_(rcf_3.class_).getValue());
      var1.break_("Xp", this.char_);
      var1.class_("LastRestock", this.abstract_);
      var1.class_("LastGossipDecay", this.interface_);
      var1.break_("RestocksToday", this.long_);
      if (this.void_) {
         var1.class_("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var3 == iO_2.BREEDING) {
         this.class_(this.su().class_(rsT_2.class_));
      }

      if (var3 == iO_2.COMMAND || var3 == iO_2.SPAWN_EGG || var3 == iO_2.SPAWNER || var3 == iO_2.DISPENSER) {
         this.class_(this.su().class_(rhi_3.class_(var1.protected_(this.Bs()))));
      }

      if (var3 == iO_2.STRUCTURE) {
         this.void_ = true;
      }

      return super.class_(var1, var2, var3, var4, var5);
   }

   public void class_(rsp_3 var1) {
      rsp_3 var2 = this.su();
      if (var2.break_() != var1.break_()) {
         this.super_ = null;
      }

      ((rmE_2)this.throws_[49]).break_(synchronized_, var1);
   }

   public void class_(rcZ_2 var1) {
      this.instanceof_.class_(new Dynamic(rcf_3.class_, var1));
   }

   private void class_(an_3 var1) {
      if ((rYB)this.throws_[7] instanceof rrEm_1) {
         Optional var2 = ((iZ_2)this.private_[72]).byte_(il_3.private_);
         if (var2.isPresent()) {
            rrEm_1 var3 = (rrEm_1)((rYB)this.throws_[7]);
            ((List)var2.get()).stream().filter(var0 -> var0 instanceof rsn_3).forEach(var2x -> var3.class_(rsC_2.protected_, var1, (rsn_3)var2x));
         }
      }
   }

   public void class_(il_3<rfK_2> var1) {
      if ((rYB)this.throws_[7] instanceof rrEm_1) {
         rnW_2 var2 = ((rrEm_1)((rYB)this.throws_[7])).const_();
         ((iZ_2)this.private_[72]).<rfK_2>byte_(var1).ifPresent(var3 -> {
            rrEm_1 var4 = var2.class_(var3.class_());
            if (var4 != null) {
               rga_3 var5 = var4.d();
               Optional var6 = var5.byte_(var3.break_());
               BiPredicate var7 = else_.get(var1);
               if (var6.isPresent() && var7.test(this, (rRP)var6.get())) {
                  var5.break_(var3.break_());
                  ruP_2.byte_(var4, var3.break_());
               }
            }
         });
      }
   }

   @Override
   protected iZ_2<?> class_(Dynamic<?> var1) {
      iZ_2 var2 = this.SV().class_(var1);
      this.class_(var2);
      return var2;
   }

   @Override
   public void class_(rsC_2 var1, an_3 var2) {
      if (var1 == rsC_2.class_) {
         this.instanceof_.class_(var2.ro(), rgD_2.MAJOR_POSITIVE, 20);
         this.instanceof_.class_(var2.ro(), rgD_2.MINOR_POSITIVE, 25);
      } else if (var1 == rsC_2.throws_) {
         this.instanceof_.class_(var2.ro(), rgD_2.TRADING, 2);
      } else if (var1 == rsC_2.byte_) {
         this.instanceof_.class_(var2.ro(), rgD_2.MINOR_NEGATIVE, 25);
      } else if (var1 == rsC_2.protected_) {
         this.instanceof_.class_(var2.ro(), rgD_2.MAJOR_NEGATIVE, 25);
      }
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 12) {
         this.class_(rLQ.long_);
      } else if (var1 == 13) {
         this.class_(rLQ.break_);
      } else if (var1 == 14) {
         this.class_(rLQ.char_);
      } else if (var1 == 42) {
         this.class_(rLQ.E);
      } else {
         super.class_(var1);
      }
   }

   public void class_(rrEm_1 var1, long var2, int var4) {
      if (this.class_(var2)) {
         rfl_3 var5 = this.rN().byte_(10.0, 10.0, 10.0);
         List var6 = var1.class_(rsq_3.class, var5);
         List var7 = var6.stream().filter(var2x -> var2x.class_(var2)).limit(5L).collect(Collectors.toList());
         if (var7.size() >= var4) {
            rMZ var8 = this.protected_(var1);
            if (var8 != null) {
               var6.forEach(ig_3::break_);
            }
         }
      }
   }

   private rfH_2 class_(rfH_2 var1, double var2, double var4) {
      byte var6 = 6;
      rfH_2 var7 = var1.byte_(var2, 6.0, var4);
      xc_3 var8 = ((rYB)this.throws_[7]).byte_(var7);

      for (int var9 = 6; var9 >= -6; var9--) {
         rfH_2 var10 = var7;
         xc_3 var11 = var8;
         var7 = var7.break_();
         var8 = ((rYB)this.throws_[7]).byte_(var7);
         if ((var11.catch_() || var11.byte_().class_()) && var8.byte_().case_()) {
            return var10;
         }
      }

      return null;
   }

   @Override
   public void class_(rhd_3 var1) {
      boolean var2 = this.class_() != null && var1 == null;
      super.class_(var1);
      if (var2) {
         this.sx();
      }
   }

   public boolean class_(long var1) {
      return !this.break_(((rYB)this.throws_[7]).r()) ? false : !((iZ_2)this.private_[72]).class_(il_3.char_);
   }

   private void class_(iZ_2<rsq_3> var1) {
      rsT_2 var2 = this.su().break_();
      if (this.n_()) {
         var1.class_(it_3.byte_);
         var1.class_(iq_3.protected_, rPL.class_(0.5F));
      } else {
         var1.class_(it_3.protected_);
         var1.class_(iq_3.byte_, rPL.break_(var2, 0.5F), ImmutableSet.of(Pair.of(il_3.byte_, iC_2.VALUE_PRESENT)));
      }

      var1.class_(iq_3.class_, rPL.class_(var2, 0.5F));
      var1.class_(iq_3.case_, rPL.protected_(var2, 0.5F), ImmutableSet.of(Pair.of(il_3.throws_, iC_2.VALUE_PRESENT)));
      var1.class_(iq_3.throws_, rPL.byte_(var2, 0.5F));
      var1.class_(iq_3.break_, rPL.throws_(var2, 0.5F));
      var1.class_(iq_3.catch_, rPL.case_(var2, 0.5F));
      var1.class_(iq_3.implements_, rPL.catch_(var2, 0.5F));
      var1.class_(iq_3.private_, rPL.private_(var2, 0.5F));
      var1.class_(iq_3.finally_, rPL.implements_(var2, 0.5F));
      var1.class_(ImmutableSet.of(iq_3.class_));
      var1.break_(iq_3.break_);
      var1.class_(iq_3.break_);
      var1.class_(((rYB)this.throws_[7]).P(), ((rYB)this.throws_[7]).r());
   }

   public void class_(rrEm_1 var1, rsq_3 var2, long var3) {
      if ((var3 < this.throw_ || var3 >= this.throw_ + 1200L) && (var3 < var2.throw_ || var3 >= var2.throw_ + 1200L)) {
         this.instanceof_.class_(var2.instanceof_, (Random)this.throws_[40], 10);
         this.throw_ = var3;
         var2.throw_ = var3;
         this.class_(var1, var3, 5);
      }
   }

   @Override
   public void class_(rrEm_1 var1, rSg_1 var2) {
      if (var1.abstract_() != rRO.PEACEFUL) {
         ((Logger)case_[0]).info("Villager {} was struck by lightning {}.", this, var2);
         rGi_1 var3 = aI_2.a.class_(var1);
         var3.class_(this.rx(), this.re(), this.BO(), (Float)this.throws_[15], (Float)this.throws_[16]);
         var3.class_(var1, var1.throws_(var3.Bs()), iO_2.CONVERSION, (aU_2)null, (rcd_3)null);
         var3.protected_(this.c());
         if (this.Bk()) {
            var3.break_(this.rD());
            var3.final_(this.D());
         }

         var3.b();
         var1.class_(var3);
         this.sp();
         this.PD();
      } else {
         super.class_(var1, var2);
      }
   }

   public void sm() {
      this.sT();
      this.synchronized_(12);
   }

   public void sc() {
      rqA_2 var1 = this.su().break_().protected_();
      if (var1 != null) {
         this.class_(var1, this.Si(), this.SN());
      }
   }

   private void sj() {
      this.sH();
      this.long_ = 0;
   }

   private void sw() {
      this.class_(this.su().class_(this.su().byte_() + 1));
      this.sk();
   }

   private void sf() {
      long var1 = ((rYB)this.throws_[7]).r();
      if (this.interface_ == 0L) {
         this.interface_ = var1;
      } else if (var1 >= this.interface_ + 24000L) {
         this.instanceof_.class_();
         this.interface_ = var1;
      }
   }

   @Override
   protected void break_(rsE_2 var1) {
      rdn_3 var2 = var1.protected_();
      if (this.implements_(var2)) {
         rXA var3 = this.sd();
         boolean var4 = var3.break_(var2);
         if (!var4) {
            return;
         }

         this.class_(var1);
         this.class_(var1, var2.char_());
         rdn_3 var5 = var3.class_(var2);
         if (var5.class_()) {
            var1.PD();
         } else {
            var2.throws_(var5.char_());
         }
      }
   }

   public rsq_3 break_(rrEm_1 var1, au_3 var2) {
      double var3 = ((Random)this.throws_[40]).nextDouble();
      rhi_3 var5;
      if (var3 < 0.5) {
         var5 = rhi_3.class_(var1.protected_(this.Bs()));
      } else if (var3 < 0.75) {
         var5 = this.su().class_();
      } else {
         var5 = ((rsq_3)var2).su().class_();
      }

      rsq_3 var6 = new rsq_3(aI_2.D, var1, var5);
      var6.class_(var1, var1.throws_(var6.Bs()), iO_2.BREEDING, (aU_2)null, (rcd_3)null);
      return var6;
   }

   public void break_(rdf_3 var1) {
      this.super_ = var1;
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("VillagerData", 10)) {
         DataResult var2 = rsp_3.class_.parse(new Dynamic(rcf_3.class_, var1.byte_("VillagerData")));
         var2.resultOrPartial(((Logger)case_[0])::error).ifPresent(this::class_);
      }

      if (var1.byte_("Offers", 10)) {
         this.super_ = new rdf_3(var1.int_("Offers"));
      }

      if (var1.byte_("FoodLevel", 1)) {
         this.try_ = var1.case_("FoodLevel");
      }

      rcy_3 var3 = var1.protected_("Gossips", 10);
      this.instanceof_.class_(new Dynamic(rcf_3.class_, var3));
      if (var1.byte_("Xp", 3)) {
         this.char_ = var1.private_("Xp");
      }

      this.abstract_ = var1.implements_("LastRestock");
      this.interface_ = var1.implements_("LastGossipDecay");
      this.byte_(true);
      if ((rYB)this.throws_[7] instanceof rrEm_1) {
         this.byte_((rrEm_1)((rYB)this.throws_[7]));
      }

      this.long_ = var1.private_("RestocksToday");
      if (var1.throws_("AssignProfessionWhenSpawned")) {
         this.void_ = var1.new_("AssignProfessionWhenSpawned");
      }
   }

   @Override
   protected void break_(rdI_2 var1) {
      int var2 = 3 + ((Random)this.throws_[40]).nextInt(4);
      this.char_ = this.char_ + var1.package_();
      this.while_ = this.class_();
      if (this.st()) {
         this.public_ = 40;
         this.goto_ = true;
         var2 += 5;
      }

      if (var1.super_()) {
         ((rYB)this.throws_[7]).a_(new rsP_2((rYB)this.throws_[7], this.rx(), this.re() + 0.5, this.BO(), var2));
      }
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (var3.break_() == rdy_3.xI || !this.BM() || this.n() || this.Sc()) {
         return super.break_(var1, var2);
      } else if (this.n_()) {
         this.sA();
         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else {
         boolean var4 = this.break_().isEmpty();
         if (var2 == rpm_3.MAIN_HAND) {
            if (var4 && !((rYB)this.throws_[7]).continue_) {
               this.sA();
            }

            var1.break_(rlB_2.for_);
         }

         if (var4) {
            return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
         } else {
            if (!((rYB)this.throws_[7]).continue_ && !this.super_.isEmpty()) {
               this.case_(var1);
            }

            return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
         }
      }
   }

   private boolean break_(long var1) {
      Optional var3 = ((iZ_2)this.private_[72]).byte_(il_3.abstract_);
      return var3.isPresent() ? var1 - (Long)var3.get() < 24000L : false;
   }

   @Override
   public void break_(iB_2 var1) {
      if (var1 != null && (rYB)this.throws_[7] instanceof rrEm_1) {
         ((rrEm_1)((rYB)this.throws_[7])).class_(rsC_2.byte_, var1, this);
         if (this.BM() && var1 instanceof rhd_3) {
            ((rYB)this.throws_[7]).class_(this, (byte)13);
         }
      }

      super.break_(var1);
   }

   @Override
   public void break_(rye_3 var1) {
      ((Logger)case_[0]).info("Villager {} died, message: '{}'", this, var1.class_((iB_2)this).getString());
      an_3 var2 = var1.extends_();
      if (var2 != null) {
         this.class_(var2);
      }

      this.sp();
      super.break_(var1);
   }

   public int throws_(rhd_3 var1) {
      return this.instanceof_.class_(var1.ro(), var0 -> true);
   }

   @Override
   protected void sx() {
      super.sx();
      this.sn();
   }

   @Override
   protected void sk() {
      rsp_3 var1 = this.su();
      Int2ObjectMap var2 = rst_3.class_.get(var1.break_());
      if (var2 != null && !var2.isEmpty()) {
         rsR_2[] var3 = (rsR_2[])var2.get(var1.byte_());
         if (var3 != null) {
            rdf_3 var4 = this.break_();
            this.class_(var4, var3, 2);
         }
      }
   }

   public boolean sv() {
      return this.sI() < 12;
   }

   private void catch_(rhd_3 var1) {
      int var2 = this.throws_(var1);
      if (var2 != 0) {
         for (rdI_2 var4 : this.break_()) {
            var4.class_(-rfU_2.protected_((float)var2 * var4.final_()));
         }
      }

      if (var1.break_(rLD.abstract_)) {
         rLY var10 = var1.byte_(rLD.abstract_);
         int var11 = var10.byte_();

         for (rdI_2 var6 : this.break_()) {
            double var7 = 0.3 + 0.0625 * (double)var11;
            int var9 = (int)Math.floor(var7 * (double)var6.class_().char_());
            var6.class_(-Math.max(var9, 1));
         }
      }
   }

   @Override
   public void case_(rfH_2 var1) {
      super.case_(var1);
      ((iZ_2)this.private_[72]).class_(il_3.abstract_, ((rYB)this.throws_[7]).r());
      ((iZ_2)this.private_[72]).break_(il_3.volatile_);
      ((iZ_2)this.private_[72]).break_(il_3.interface_);
   }

   private void case_(rhd_3 var1) {
      this.catch_(var1);
      this.class_(var1);
      this.class_(var1, this.L_(), this.su().byte_());
   }

   public void else_(int var1) {
      this.char_ = var1;
   }

   @Override
   protected void for_() {
      super.for_();
      ruP_2.class_(this);
   }

   @Override
   public boolean implements_(rdn_3 var1) {
      rdb_3 var2 = var1.break_();
      return (return_.contains(var2) || this.su().break_().break_().contains(var2)) && this.sd().break_(var1);
   }

   @Override
   protected rqA_2 static_() {
      if (this.Sc()) {
         return null;
      } else {
         return this.n() ? rqn_3.kS : rqn_3.da;
      }
   }

   @Override
   public int protected_() {
      return this.char_;
   }

   private rMZ protected_(rrEm_1 var1) {
      rfH_2 var2 = this.Bs();

      for (int var3 = 0; var3 < 10; var3++) {
         double var4 = (double)(var1.int_.nextInt(16) - 8);
         double var6 = (double)(var1.int_.nextInt(16) - 8);
         rfH_2 var8 = this.class_(var2, var4, var6);
         if (var8 != null) {
            rMZ var9 = aI_2.import_.break_(var1, (rcd_3)null, (rgP_2)null, (rhd_3)null, var8, iO_2.MOB_SUMMONED, false, false);
            if (var9 != null) {
               if (var9.class_(var1, iO_2.MOB_SUMMONED) && var9.class_(var1)) {
                  var1.class_(var9);
                  return var9;
               }

               var9.PD();
            }
         }
      }

      return null;
   }

   @Override
   public boolean private_(double var1) {
      return false;
   }

   private void synchronized_(int var1) {
      this.try_ = (byte)(this.try_ - var1);
   }

   private boolean st() {
      int var1 = this.su().byte_();
      return rsp_3.protected_(var1) && this.char_ >= rsp_3.byte_(var1);
   }

   public boolean sz() {
      return this.void_;
   }

   private void sn() {
      for (rdI_2 var2 : this.break_()) {
         var2.native_();
      }
   }

   private boolean sq() {
      return this.try_ < 12;
   }

   @Override
   protected void P_() {
      super.P_();
      if ((rYB)this.throws_[7] instanceof rrEm_1) {
         this.byte_((rrEm_1)((rYB)this.throws_[7]));
      }
   }

   @Override
   public boolean N_() {
      return this.try_ + this.sI() >= 12 && this.O_() == 0;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.kr;
   }

   private void sy() {
      for (rdI_2 var2 : this.break_()) {
         var2.throws_();
      }
   }

   public boolean sN() {
      long var1 = this.abstract_ + 12000L;
      long var3 = ((rYB)this.throws_[7]).r();
      boolean var5 = var3 > var1;
      long var6 = ((rYB)this.throws_[7]).P();
      if (this.float_ > 0L) {
         long var8 = this.float_ / 24000L;
         long var10 = var6 / 24000L;
         var5 |= var10 > var8;
      }

      this.float_ = var6;
      if (var5) {
         this.abstract_ = var3;
         this.sj();
      }

      return this.sl() && this.sC();
   }

   public rgY_2 sL() {
      return this.instanceof_;
   }

   @Override
   public iZ_2<rsq_3> SF() {
      return (iZ_2<rsq_3>)super.SF();
   }

   private void sH() {
      int var1 = 2 - this.long_;
      if (var1 > 0) {
         for (rdI_2 var3 : this.break_()) {
            var3.private_();
         }
      }

      for (int var4 = 0; var4 < var1; var4++) {
         this.sy();
      }
   }

   private void sT() {
      if (this.sq() && this.sI() != 0) {
         for (int var1 = 0; var1 < this.sd().else_(); var1++) {
            rdn_3 var2 = this.sd().extends_(var1);
            if (!var2.class_()) {
               Integer var3 = this_.get(var2.break_());
               if (var3 != null) {
                  int var4 = var2.char_();

                  for (int var5 = var4; var5 > 0; var5--) {
                     this.try_ = (byte)(this.try_ + var3);
                     this.sd().class_(var1, 1);
                     if (!this.sq()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   private int sI() {
      rXA var1 = this.sd();
      return this_.entrySet().stream().mapToInt(var1x -> var1.class_(var1x.getKey()) * var1x.getValue()).sum();
   }

   @Override
   public rsp_3 su() {
      return ((rmE_2)this.throws_[49]).class_(synchronized_);
   }

   public static iz_3 sW() {
      return is_3.package_().class_(iQ_2.protected_, 0.5).class_(iQ_2.break_, 48.0);
   }

   @Override
   public void SQ() {
      super.SQ();
      ((iZ_2)this.private_[72]).class_(il_3.long_, ((rYB)this.throws_[7]).r());
   }

   @Override
   protected iF_2<rsq_3> SV() {
      return iZ_2.class_(static_, import_);
   }

   public void sQ() {
      this.sy();

      for (rdI_2 var2 : this.break_()) {
         var2.private_();
      }

      this.abstract_ = ((rYB)this.throws_[7]).r();
      this.long_++;
   }

   public boolean sZ() {
      return this.sI() >= 24;
   }

   public boolean sF() {
      return this.sd().class_(ImmutableSet.of(rdy_3.hP, rdy_3.dE, rdy_3.ds, rdy_3.kJ));
   }

   private void sA() {
      this.this_(40);
      if (!((rYB)this.throws_[7]).import_()) {
         this.class_(rqn_3.kB, this.Si(), this.SN());
      }
   }

   private boolean sC() {
      for (rdI_2 var2 : this.break_()) {
         if (var2.continue_()) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(synchronized_, new rsp_3(rhi_3.byte_, rsT_2.class_, 1));
   }

   @Override
   protected rgP_2 PT() {
      return new rgn_3(this.BC().private_() + "." + rVL.J.break_(this.su().break_()).break_());
   }

   @Override
   public boolean Q_() {
      return true;
   }
}
