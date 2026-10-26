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
   private static final rut_3<rsp_3> id_synchronized = rmE_2.id_class(rsq_3.class, ruw_3.id_new);
   public static final Map<rdb_3, Integer> id_this = ImmutableMap.of(rdy_3.hS, 4, rdy_3.dE, 1, rdy_3.ds, 1, rdy_3.kX, 1);
   private static final Set<rdb_3> id_return = ImmutableSet.of(rdy_3.hS, rdy_3.dE, rdy_3.ds, rdy_3.hB, rdy_3.hP, rdy_3.kX, new rdb_3[]{rdy_3.kJ});
   private int id_public;
   private boolean id_goto;
   private rhd_3 id_while;
   private byte id_try;
   private final rgY_2 id_instanceof = new rgY_2();
   private long id_throw;
   private long id_interface;
   private int id_char;
   private long id_abstract;
   private int id_long;
   private long id_float;
   private boolean id_void;
   private static final ImmutableList<il_3<?>> id_static = ImmutableList.of(
      il_3.id_break,
      il_3.id_byte,
      il_3.id_protected,
      il_3.id_throws,
      il_3.id_catch,
      il_3.id_private,
      il_3.id_implements,
      il_3.id_finally,
      il_3.id_extends,
      il_3.id_native,
      il_3.id_static,
      il_3.id_volatile,
      new il_3[]{
         il_3.id_final,
         il_3.id_new,
         il_3.id_continue,
         il_3.id_this,
         il_3.id_synchronized,
         il_3.id_return,
         il_3.id_public,
         il_3.id_goto,
         il_3.id_try,
         il_3.id_case,
         il_3.id_instanceof,
         il_3.id_throw,
         il_3.id_interface,
         il_3.id_abstract,
         il_3.id_long,
         il_3.id_float,
         il_3.id_char
      }
   );
   private static final ImmutableList<rrP_2<? extends rrr_3<? super rsq_3>>> id_import = ImmutableList.of(
      rrP_2.id_byte,
      rrP_2.id_protected,
      rrP_2.id_break,
      rrP_2.id_throws,
      rrP_2.id_case,
      rrP_2.id_catch,
      rrP_2.id_private,
      rrP_2.id_implements,
      rrP_2.id_finally
   );
   public static final Map<il_3<rfK_2>, BiPredicate<rsq_3, rRP>> id_else = ImmutableMap.of(
      il_3.id_break,
      (BiPredicate<rsq_3, rRP>)(var0, var1) -> var1 == rRP.id_continue,
      il_3.id_byte,
      (BiPredicate<rsq_3, rRP>)(var0, var1) -> var0.su().id_break().id_class() == var1,
      il_3.id_protected,
      (BiPredicate<rsq_3, rRP>)(var0, var1) -> rRP.id_class.test(var1),
      il_3.id_throws,
      (BiPredicate<rsq_3, rRP>)(var0, var1) -> var1 == rRP.id_super
   );

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.kP;
   }

   public void id_byte(rrEm_1 var1) {
      iZ_2 var2 = this.SF();
      var2.id_break(var1, this);
      iZ_2 var7 = var2.id_throws();
      this.id_private[72] = var7;
      this.id_class(this.SF());
   }

   @Override
   protected void id_double() {
      this.SF().id_class((rrEm_1)((rYB)this.id_throws[7]), this);
      if (this.id_void) {
         this.id_void = false;
      }

      if (!this.n() && this.id_public > 0) {
         this.id_public--;
         if (this.id_public <= 0) {
            if (this.id_goto) {
               this.sw();
               this.id_goto = false;
            }

            this.id_break(new rLY(rLD.id_finally, 200, 0));
         }
      }

      if (this.id_while != null && (rYB)this.id_throws[7] instanceof rrEm_1) {
         ((rrEm_1)((rYB)this.id_throws[7])).id_class(rsC_2.id_throws, this.id_while, this);
         ((rYB)this.id_throws[7]).id_class(this, (byte)14);
         this.id_while = null;
      }

      if (!this.c() && ((Random)this.id_throws[40]).nextInt(100) == 0) {
         rrEr_1 var1 = ((rrEm_1)((rYB)this.id_throws[7])).id_interface(this.Bs());
         if (var1 != null && var1.id_this() && !var1.id_class()) {
            ((rYB)this.id_throws[7]).id_class(this, (byte)42);
         }
      }

      if (this.su().id_break() == rsT_2.id_class && this.n()) {
         this.sx();
      }

      super.id_double();
   }

   public rsq_3(aI_2<? extends rsq_3> var1, rYB var2) {
      this(var1, var2, rhi_3.id_byte);
   }

   public rsq_3(aI_2<? extends rsq_3> var1, rYB var2, rhi_3 var3) {
      super(var1, var2);
      ((rLA)this.id_public()).id_class(true);
      this.id_public().id_byte(true);
      this.id_byte(true);
      this.id_class(this.su().id_class(var3).id_class(rsT_2.id_class));
   }

   private void sp() {
      this.id_class(il_3.id_break);
      this.id_class(il_3.id_byte);
      this.id_class(il_3.id_protected);
      this.id_class(il_3.id_throws);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.L() > 0) {
         this.id_this(this.L() - 1);
      }

      this.sf();
   }

   private boolean sl() {
      return this.id_long == 0 || this.id_long < 2 && ((rYB)this.id_throws[7]).r() > this.id_abstract + 2400L;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      rsp_3.id_class
         .encodeStart(rcf_3.id_class, this.su())
         .resultOrPartial(((Logger)id_case[0])::error)
         .ifPresent(var1x -> var1.id_class("VillagerData", var1x));
      var1.id_class("FoodLevel", this.id_try);
      var1.id_class("Gossips", (rcZ_2)this.id_instanceof.id_class(rcf_3.id_class).getValue());
      var1.id_break("Xp", this.id_char);
      var1.id_class("LastRestock", this.id_abstract);
      var1.id_class("LastGossipDecay", this.id_interface);
      var1.id_break("RestocksToday", this.id_long);
      if (this.id_void) {
         var1.id_class("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var3 == iO_2.BREEDING) {
         this.id_class(this.su().id_class(rsT_2.id_class));
      }

      if (var3 == iO_2.COMMAND || var3 == iO_2.SPAWN_EGG || var3 == iO_2.SPAWNER || var3 == iO_2.DISPENSER) {
         this.id_class(this.su().id_class(rhi_3.id_class(var1.id_protected(this.Bs()))));
      }

      if (var3 == iO_2.STRUCTURE) {
         this.id_void = true;
      }

      return super.id_class(var1, var2, var3, var4, var5);
   }

   public void id_class(rsp_3 var1) {
      rsp_3 var2 = this.su();
      if (var2.id_break() != var1.id_break()) {
         this.id_super = null;
      }

      ((rmE_2)this.id_throws[49]).id_break(id_synchronized, var1);
   }

   public void id_class(rcZ_2 var1) {
      this.id_instanceof.id_class(new Dynamic(rcf_3.id_class, var1));
   }

   private void id_class(an_3 var1) {
      if ((rYB)this.id_throws[7] instanceof rrEm_1) {
         Optional var2 = ((iZ_2)this.id_private[72]).id_byte(il_3.id_private);
         if (var2.isPresent()) {
            rrEm_1 var3 = (rrEm_1)((rYB)this.id_throws[7]);
            ((List)var2.get()).stream().filter(var0 -> var0 instanceof rsn_3).forEach(var2x -> var3.id_class(rsC_2.id_protected, var1, (rsn_3)var2x));
         }
      }
   }

   public void id_class(il_3<rfK_2> var1) {
      if ((rYB)this.id_throws[7] instanceof rrEm_1) {
         rnW_2 var2 = ((rrEm_1)((rYB)this.id_throws[7])).id_const();
         ((iZ_2)this.id_private[72]).<rfK_2>id_byte(var1).ifPresent(var3 -> {
            rrEm_1 var4 = var2.id_class(var3.id_class());
            if (var4 != null) {
               rga_3 var5 = var4.d();
               Optional var6 = var5.id_byte(var3.id_break());
               BiPredicate var7 = id_else.get(var1);
               if (var6.isPresent() && var7.test(this, (rRP)var6.get())) {
                  var5.id_break(var3.id_break());
                  ruP_2.id_byte(var4, var3.id_break());
               }
            }
         });
      }
   }

   @Override
   protected iZ_2<?> id_class(Dynamic<?> var1) {
      iZ_2 var2 = this.SV().id_class(var1);
      this.id_class(var2);
      return var2;
   }

   @Override
   public void id_class(rsC_2 var1, an_3 var2) {
      if (var1 == rsC_2.id_class) {
         this.id_instanceof.id_class(var2.ro(), rgD_2.MAJOR_POSITIVE, 20);
         this.id_instanceof.id_class(var2.ro(), rgD_2.MINOR_POSITIVE, 25);
      } else if (var1 == rsC_2.id_throws) {
         this.id_instanceof.id_class(var2.ro(), rgD_2.TRADING, 2);
      } else if (var1 == rsC_2.id_byte) {
         this.id_instanceof.id_class(var2.ro(), rgD_2.MINOR_NEGATIVE, 25);
      } else if (var1 == rsC_2.id_protected) {
         this.id_instanceof.id_class(var2.ro(), rgD_2.MAJOR_NEGATIVE, 25);
      }
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 12) {
         this.id_class(rLQ.id_long);
      } else if (var1 == 13) {
         this.id_class(rLQ.id_break);
      } else if (var1 == 14) {
         this.id_class(rLQ.id_char);
      } else if (var1 == 42) {
         this.id_class(rLQ.E);
      } else {
         super.id_class(var1);
      }
   }

   public void id_class(rrEm_1 var1, long var2, int var4) {
      if (this.id_class(var2)) {
         rfl_3 var5 = this.rN().id_byte(10.0, 10.0, 10.0);
         List var6 = var1.id_class(rsq_3.class, var5);
         List var7 = var6.stream().filter(var2x -> var2x.id_class(var2)).limit(5L).collect(Collectors.toList());
         if (var7.size() >= var4) {
            rMZ var8 = this.id_protected(var1);
            if (var8 != null) {
               var6.forEach(ig_3::id_break);
            }
         }
      }
   }

   private rfH_2 id_class(rfH_2 var1, double var2, double var4) {
      byte var6 = 6;
      rfH_2 var7 = var1.id_byte(var2, 6.0, var4);
      xc_3 var8 = ((rYB)this.id_throws[7]).id_byte(var7);

      for (int var9 = 6; var9 >= -6; var9--) {
         rfH_2 var10 = var7;
         xc_3 var11 = var8;
         var7 = var7.id_break();
         var8 = ((rYB)this.id_throws[7]).id_byte(var7);
         if ((var11.id_catch() || var11.id_byte().id_class()) && var8.id_byte().id_case()) {
            return var10;
         }
      }

      return null;
   }

   @Override
   public void id_class(rhd_3 var1) {
      boolean var2 = this.id_class() != null && var1 == null;
      super.id_class(var1);
      if (var2) {
         this.sx();
      }
   }

   public boolean id_class(long var1) {
      return !this.id_break(((rYB)this.id_throws[7]).r()) ? false : !((iZ_2)this.id_private[72]).id_class(il_3.id_char);
   }

   private void id_class(iZ_2<rsq_3> var1) {
      rsT_2 var2 = this.su().id_break();
      if (this.n_()) {
         var1.id_class(it_3.id_byte);
         var1.id_class(iq_3.id_protected, rPL.id_class(0.5F));
      } else {
         var1.id_class(it_3.id_protected);
         var1.id_class(iq_3.id_byte, rPL.id_break(var2, 0.5F), ImmutableSet.of(Pair.of(il_3.id_byte, iC_2.VALUE_PRESENT)));
      }

      var1.id_class(iq_3.id_class, rPL.id_class(var2, 0.5F));
      var1.id_class(iq_3.id_case, rPL.id_protected(var2, 0.5F), ImmutableSet.of(Pair.of(il_3.id_throws, iC_2.VALUE_PRESENT)));
      var1.id_class(iq_3.id_throws, rPL.id_byte(var2, 0.5F));
      var1.id_class(iq_3.id_break, rPL.id_throws(var2, 0.5F));
      var1.id_class(iq_3.id_catch, rPL.id_case(var2, 0.5F));
      var1.id_class(iq_3.id_implements, rPL.id_catch(var2, 0.5F));
      var1.id_class(iq_3.id_private, rPL.id_private(var2, 0.5F));
      var1.id_class(iq_3.id_finally, rPL.id_implements(var2, 0.5F));
      var1.id_class(ImmutableSet.of(iq_3.id_class));
      var1.id_break(iq_3.id_break);
      var1.id_class(iq_3.id_break);
      var1.id_class(((rYB)this.id_throws[7]).P(), ((rYB)this.id_throws[7]).r());
   }

   public void id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      if ((var3 < this.id_throw || var3 >= this.id_throw + 1200L) && (var3 < var2.id_throw || var3 >= var2.id_throw + 1200L)) {
         this.id_instanceof.id_class(var2.id_instanceof, (Random)this.id_throws[40], 10);
         this.id_throw = var3;
         var2.id_throw = var3;
         this.id_class(var1, var3, 5);
      }
   }

   @Override
   public void id_class(rrEm_1 var1, rSg_1 var2) {
      if (var1.id_abstract() != rRO.PEACEFUL) {
         ((Logger)id_case[0]).info("Villager {} was struck by lightning {}.", this, var2);
         rGi_1 var3 = aI_2.a.id_class(var1);
         var3.id_class(this.rx(), this.re(), this.BO(), (Float)this.id_throws[15], (Float)this.id_throws[16]);
         var3.id_class(var1, var1.id_throws(var3.Bs()), iO_2.CONVERSION, (aU_2)null, (rcd_3)null);
         var3.id_protected(this.c());
         if (this.Bk()) {
            var3.id_break(this.rD());
            var3.id_final(this.D());
         }

         var3.b();
         var1.id_class(var3);
         this.sp();
         this.PD();
      } else {
         super.id_class(var1, var2);
      }
   }

   public void sm() {
      this.sT();
      this.id_synchronized(12);
   }

   public void sc() {
      rqA_2 var1 = this.su().id_break().id_protected();
      if (var1 != null) {
         this.id_class(var1, this.Si(), this.SN());
      }
   }

   private void sj() {
      this.sH();
      this.id_long = 0;
   }

   private void sw() {
      this.id_class(this.su().id_class(this.su().id_byte() + 1));
      this.sk();
   }

   private void sf() {
      long var1 = ((rYB)this.id_throws[7]).r();
      if (this.id_interface == 0L) {
         this.id_interface = var1;
      } else if (var1 >= this.id_interface + 24000L) {
         this.id_instanceof.id_class();
         this.id_interface = var1;
      }
   }

   @Override
   protected void id_break(rsE_2 var1) {
      rdn_3 var2 = var1.id_protected();
      if (this.id_implements(var2)) {
         rXA var3 = this.sd();
         boolean var4 = var3.id_break(var2);
         if (!var4) {
            return;
         }

         this.id_class(var1);
         this.id_class(var1, var2.id_char());
         rdn_3 var5 = var3.id_class(var2);
         if (var5.id_class()) {
            var1.PD();
         } else {
            var2.id_throws(var5.id_char());
         }
      }
   }

   public rsq_3 id_break(rrEm_1 var1, au_3 var2) {
      double var3 = ((Random)this.id_throws[40]).nextDouble();
      rhi_3 var5;
      if (var3 < 0.5) {
         var5 = rhi_3.id_class(var1.id_protected(this.Bs()));
      } else if (var3 < 0.75) {
         var5 = this.su().id_class();
      } else {
         var5 = ((rsq_3)var2).su().id_class();
      }

      rsq_3 var6 = new rsq_3(aI_2.D, var1, var5);
      var6.id_class(var1, var1.id_throws(var6.Bs()), iO_2.BREEDING, (aU_2)null, (rcd_3)null);
      return var6;
   }

   public void id_break(rdf_3 var1) {
      this.id_super = var1;
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("VillagerData", 10)) {
         DataResult var2 = rsp_3.id_class.parse(new Dynamic(rcf_3.id_class, var1.id_byte("VillagerData")));
         var2.resultOrPartial(((Logger)id_case[0])::error).ifPresent(this::id_class);
      }

      if (var1.id_byte("Offers", 10)) {
         this.id_super = new rdf_3(var1.id_int("Offers"));
      }

      if (var1.id_byte("FoodLevel", 1)) {
         this.id_try = var1.id_case("FoodLevel");
      }

      rcy_3 var3 = var1.id_protected("Gossips", 10);
      this.id_instanceof.id_class(new Dynamic(rcf_3.id_class, var3));
      if (var1.id_byte("Xp", 3)) {
         this.id_char = var1.id_private("Xp");
      }

      this.id_abstract = var1.id_implements("LastRestock");
      this.id_interface = var1.id_implements("LastGossipDecay");
      this.id_byte(true);
      if ((rYB)this.id_throws[7] instanceof rrEm_1) {
         this.id_byte((rrEm_1)((rYB)this.id_throws[7]));
      }

      this.id_long = var1.id_private("RestocksToday");
      if (var1.id_throws("AssignProfessionWhenSpawned")) {
         this.id_void = var1.id_new("AssignProfessionWhenSpawned");
      }
   }

   @Override
   protected void id_break(rdI_2 var1) {
      int var2 = 3 + ((Random)this.id_throws[40]).nextInt(4);
      this.id_char = this.id_char + var1.id_package();
      this.id_while = this.id_class();
      if (this.st()) {
         this.id_public = 40;
         this.id_goto = true;
         var2 += 5;
      }

      if (var1.id_super()) {
         ((rYB)this.id_throws[7]).a_(new rsP_2((rYB)this.id_throws[7], this.rx(), this.re() + 0.5, this.BO(), var2));
      }
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (var3.id_break() == rdy_3.xI || !this.BM() || this.n() || this.Sc()) {
         return super.id_break(var1, var2);
      } else if (this.n_()) {
         this.sA();
         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else {
         boolean var4 = this.id_break().isEmpty();
         if (var2 == rpm_3.MAIN_HAND) {
            if (var4 && !((rYB)this.id_throws[7]).id_continue) {
               this.sA();
            }

            var1.id_break(rlB_2.id_for);
         }

         if (var4) {
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
         } else {
            if (!((rYB)this.id_throws[7]).id_continue && !this.id_super.isEmpty()) {
               this.id_case(var1);
            }

            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
         }
      }
   }

   private boolean id_break(long var1) {
      Optional var3 = ((iZ_2)this.id_private[72]).id_byte(il_3.id_abstract);
      return var3.isPresent() ? var1 - (Long)var3.get() < 24000L : false;
   }

   @Override
   public void id_break(iB_2 var1) {
      if (var1 != null && (rYB)this.id_throws[7] instanceof rrEm_1) {
         ((rrEm_1)((rYB)this.id_throws[7])).id_class(rsC_2.id_byte, var1, this);
         if (this.BM() && var1 instanceof rhd_3) {
            ((rYB)this.id_throws[7]).id_class(this, (byte)13);
         }
      }

      super.id_break(var1);
   }

   @Override
   public void id_break(rye_3 var1) {
      ((Logger)id_case[0]).info("Villager {} died, message: '{}'", this, var1.id_class((iB_2)this).getString());
      an_3 var2 = var1.id_extends();
      if (var2 != null) {
         this.id_class(var2);
      }

      this.sp();
      super.id_break(var1);
   }

   public int id_throws(rhd_3 var1) {
      return this.id_instanceof.id_class(var1.ro(), var0 -> true);
   }

   @Override
   protected void sx() {
      super.sx();
      this.sn();
   }

   @Override
   protected void sk() {
      rsp_3 var1 = this.su();
      Int2ObjectMap var2 = rst_3.id_class.get(var1.id_break());
      if (var2 != null && !var2.isEmpty()) {
         rsR_2[] var3 = (rsR_2[])var2.get(var1.id_byte());
         if (var3 != null) {
            rdf_3 var4 = this.id_break();
            this.id_class(var4, var3, 2);
         }
      }
   }

   public boolean sv() {
      return this.sI() < 12;
   }

   private void id_catch(rhd_3 var1) {
      int var2 = this.id_throws(var1);
      if (var2 != 0) {
         for (rdI_2 var4 : this.id_break()) {
            var4.id_class(-rfU_2.id_protected((float)var2 * var4.id_final()));
         }
      }

      if (var1.id_break(rLD.id_abstract)) {
         rLY var10 = var1.id_byte(rLD.id_abstract);
         int var11 = var10.id_byte();

         for (rdI_2 var6 : this.id_break()) {
            double var7 = 0.3 + 0.0625 * (double)var11;
            int var9 = (int)Math.floor(var7 * (double)var6.id_class().id_char());
            var6.id_class(-Math.max(var9, 1));
         }
      }
   }

   @Override
   public void id_case(rfH_2 var1) {
      super.id_case(var1);
      ((iZ_2)this.id_private[72]).id_class(il_3.id_abstract, ((rYB)this.id_throws[7]).r());
      ((iZ_2)this.id_private[72]).id_break(il_3.id_volatile);
      ((iZ_2)this.id_private[72]).id_break(il_3.id_interface);
   }

   private void id_case(rhd_3 var1) {
      this.id_catch(var1);
      this.id_class(var1);
      this.id_class(var1, this.L_(), this.su().id_byte());
   }

   public void id_else(int var1) {
      this.id_char = var1;
   }

   @Override
   protected void id_for() {
      super.id_for();
      ruP_2.id_class(this);
   }

   @Override
   public boolean id_implements(rdn_3 var1) {
      rdb_3 var2 = var1.id_break();
      return (id_return.contains(var2) || this.su().id_break().id_break().contains(var2)) && this.sd().id_break(var1);
   }

   @Override
   protected rqA_2 id_static() {
      if (this.Sc()) {
         return null;
      } else {
         return this.n() ? rqn_3.kS : rqn_3.da;
      }
   }

   @Override
   public int id_protected() {
      return this.id_char;
   }

   private rMZ id_protected(rrEm_1 var1) {
      rfH_2 var2 = this.Bs();

      for (int var3 = 0; var3 < 10; var3++) {
         double var4 = (double)(var1.id_int.nextInt(16) - 8);
         double var6 = (double)(var1.id_int.nextInt(16) - 8);
         rfH_2 var8 = this.id_class(var2, var4, var6);
         if (var8 != null) {
            rMZ var9 = aI_2.id_import.id_break(var1, (rcd_3)null, (rgP_2)null, (rhd_3)null, var8, iO_2.MOB_SUMMONED, false, false);
            if (var9 != null) {
               if (var9.id_class(var1, iO_2.MOB_SUMMONED) && var9.id_class(var1)) {
                  var1.id_class(var9);
                  return var9;
               }

               var9.PD();
            }
         }
      }

      return null;
   }

   @Override
   public boolean id_private(double var1) {
      return false;
   }

   private void id_synchronized(int var1) {
      this.id_try = (byte)(this.id_try - var1);
   }

   private boolean st() {
      int var1 = this.su().id_byte();
      return rsp_3.id_protected(var1) && this.id_char >= rsp_3.id_byte(var1);
   }

   public boolean sz() {
      return this.id_void;
   }

   private void sn() {
      for (rdI_2 var2 : this.id_break()) {
         var2.id_native();
      }
   }

   private boolean sq() {
      return this.id_try < 12;
   }

   @Override
   protected void P_() {
      super.P_();
      if ((rYB)this.id_throws[7] instanceof rrEm_1) {
         this.id_byte((rrEm_1)((rYB)this.id_throws[7]));
      }
   }

   @Override
   public boolean N_() {
      return this.id_try + this.sI() >= 12 && this.O_() == 0;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.kr;
   }

   private void sy() {
      for (rdI_2 var2 : this.id_break()) {
         var2.id_throws();
      }
   }

   public boolean sN() {
      long var1 = this.id_abstract + 12000L;
      long var3 = ((rYB)this.id_throws[7]).r();
      boolean var5 = var3 > var1;
      long var6 = ((rYB)this.id_throws[7]).P();
      if (this.id_float > 0L) {
         long var8 = this.id_float / 24000L;
         long var10 = var6 / 24000L;
         var5 |= var10 > var8;
      }

      this.id_float = var6;
      if (var5) {
         this.id_abstract = var3;
         this.sj();
      }

      return this.sl() && this.sC();
   }

   public rgY_2 sL() {
      return this.id_instanceof;
   }

   @Override
   public iZ_2<rsq_3> SF() {
      return (iZ_2<rsq_3>)super.SF();
   }

   private void sH() {
      int var1 = 2 - this.id_long;
      if (var1 > 0) {
         for (rdI_2 var3 : this.id_break()) {
            var3.id_private();
         }
      }

      for (int var4 = 0; var4 < var1; var4++) {
         this.sy();
      }
   }

   private void sT() {
      if (this.sq() && this.sI() != 0) {
         for (int var1 = 0; var1 < this.sd().id_else(); var1++) {
            rdn_3 var2 = this.sd().id_extends(var1);
            if (!var2.id_class()) {
               Integer var3 = id_this.get(var2.id_break());
               if (var3 != null) {
                  int var4 = var2.id_char();

                  for (int var5 = var4; var5 > 0; var5--) {
                     this.id_try = (byte)(this.id_try + var3);
                     this.sd().id_class(var1, 1);
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
      return id_this.entrySet().stream().mapToInt(var1x -> var1.id_class(var1x.getKey()) * var1x.getValue()).sum();
   }

   @Override
   public rsp_3 su() {
      return ((rmE_2)this.id_throws[49]).id_class(id_synchronized);
   }

   public static iz_3 sW() {
      return is_3.id_package().id_class(iQ_2.id_protected, 0.5).id_class(iQ_2.id_break, 48.0);
   }

   @Override
   public void SQ() {
      super.SQ();
      ((iZ_2)this.id_private[72]).id_class(il_3.id_long, ((rYB)this.id_throws[7]).r());
   }

   @Override
   protected iF_2<rsq_3> SV() {
      return iZ_2.id_class(id_static, id_import);
   }

   public void sQ() {
      this.sy();

      for (rdI_2 var2 : this.id_break()) {
         var2.id_private();
      }

      this.id_abstract = ((rYB)this.id_throws[7]).r();
      this.id_long++;
   }

   public boolean sZ() {
      return this.sI() >= 24;
   }

   public boolean sF() {
      return this.sd().id_class(ImmutableSet.of(rdy_3.hP, rdy_3.dE, rdy_3.ds, rdy_3.kJ));
   }

   private void sA() {
      this.id_this(40);
      if (!((rYB)this.id_throws[7]).id_import()) {
         this.id_class(rqn_3.kB, this.Si(), this.SN());
      }
   }

   private boolean sC() {
      for (rdI_2 var2 : this.id_break()) {
         if (var2.id_continue()) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_synchronized, new rsp_3(rhi_3.id_byte, rsT_2.id_class, 1));
   }

   @Override
   protected rgP_2 PT() {
      return new rgn_3(this.BC().id_private() + "." + rVL.J.id_break(this.su().id_break()).id_break());
   }

   @Override
   public boolean Q_() {
      return true;
   }
}
