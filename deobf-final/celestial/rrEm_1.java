package celestial;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrEm_1 extends rYB implements rRI {
   public static final rfH_2 this_ = new rfH_2(100, 50, 0);
   private static final Logger public_ = LogManager.getLogger();
   private final Int2ObjectMap<an_3> goto_ = new Int2ObjectLinkedOpenHashMap();
   private final Map<UUID, an_3> while_ = Maps.newHashMap();
   private final Queue<an_3> try_ = Queues.newArrayDeque();
   private final List<rhN_2> instanceof_ = Lists.newArrayList();
   private final rrEN throw_;
   boolean else_;
   private final rnW_2 interface_;
   private final rrGB char_;
   public boolean synchronized_;
   private boolean abstract_;
   private int long_;
   private final rRi_1 float_;
   private final rrEu_1<xd_3> void_ = new rrEu_1<>(this, var0 -> var0 == null || var0.continue_().catch_(), rVL.strictfp_::break_, this::break_);
   private final rrEu_1<rXs_1> static_ = new rrEu_1<>(this, var0 -> var0 == null || var0 == rXG.class_, rVL.default_::break_, this::class_);
   private final Set<rLy_1> import_ = Sets.newHashSet();
   protected final rrEs_1 return_;
   private final ObjectLinkedOpenHashSet<xQ_2> short_ = new ObjectLinkedOpenHashSet();
   private boolean default_;
   private final List<rrEq_1> const_;
   private final rKG strictfp_;
   private final rrrA boolean_;
   private final boolean transient_;

   public boolean char_(rfH_2 var1) {
      return this.interface_(var1) != null;
   }

   public boolean byte_(rfH_2 var1, int var2) {
      return var2 > 6 ? false : this.break_(rjh_3.class_(var1)) <= var2;
   }

   public void byte_(an_3 var1) {
      if (var1.BE()) {
         int var2 = rfU_2.byte_(var1.rx() / 16.0);
         int var3 = rfU_2.byte_(var1.re() / 16.0);
         int var4 = rfU_2.byte_(var1.BO() / 16.0);
         if (!(Boolean)var1.throws_[50] || (Integer)var1.throws_[51] != var2 || (Integer)var1.throws_[52] != var3 || (Integer)var1.throws_[53] != var4) {
            if ((Boolean)var1.throws_[50] && this.break_((Integer)var1.throws_[51], (Integer)var1.throws_[53])) {
               this.throws_((Integer)var1.throws_[51], (Integer)var1.throws_[53]).class_(var1, (Integer)var1.throws_[52]);
            }

            if (!var1.rn() && !this.break_(var2, var4)) {
               if ((Boolean)var1.throws_[50]) {
                  public_.warn("Entity {} left loaded chunk area", var1);
               }

               Boolean var9 = false;
               var1.throws_[50] = var9;
            } else {
               this.throws_(var2, var4).class_(var1);
            }
         }
      }
   }

   @Override
   public rrEm_1 byte_() {
      return this;
   }

   private an_3 byte_(UUID var1) {
      an_3 var2 = this.while_.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         if (this.else_) {
            for (an_3 var4 : this.try_) {
               if (var4.ro().equals(var1)) {
                  return var4;
               }
            }
         }

         return null;
      }
   }

   public void byte_(rhN_2 var1) {
      this.case_(var1);
   }

   @Override
   public rYG byte_(int var1, int var2, int var3) {
      return this.else_().implements_().protected_().protected_(var1, var2, var3);
   }

   @Override
   public rlQ_2 int_() {
      return this.interface_.g();
   }

   public rrEm_1(
      rnW_2 var1,
      Executor var2,
      rrGk_1 var3,
      rrGB var4,
      rqM_2<rYB> var5,
      rRJ var6,
      roq_3 var7,
      rKd_1 var8,
      boolean var9,
      long var10,
      List<rrEq_1> var12,
      boolean var13
   ) {
      super(var4, var5, var6, false, var9, var10);
      this.transient_ = var13;
      this.interface_ = var1;
      this.const_ = var12;
      this.char_ = var4;
      this.throw_ = new rrEN(this, var3, var1.T(), var1.rP(), var2, var8, var1.x().new_(), var1.rr(), var7, () -> var1.abstract_().h());
      this.float_ = new rRi_1(this);
      this.double_();
      this.switch_();
      this.instanceof_().class_(var1.n());
      this.return_ = this.h().class_(() -> new rrEs_1(this), rrEs_1.class_(this.default_()));
      if (!var1.const_()) {
         var4.class_(var1.package_());
      }

      this.boolean_ = new rrrA(this, var1.rB().long_());
      if (this.default_().native_()) {
         this.strictfp_ = new rKG(this, var1.rB().long_().class_(), var1.rB().abstract_());
      } else {
         this.strictfp_ = null;
      }
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.char_.volatile_() + "]";
   }

   public float J() {
      return this.new_.protected_();
   }

   private void Z() {
      while (!this.short_.isEmpty()) {
         xQ_2 var1 = (xQ_2)this.short_.removeFirst();
         if (this.class_(var1)) {
            this.interface_
               .x()
               .class_(
                  (rhd_3)null,
                  (double)var1.class_().b_(),
                  (double)var1.class_().c_(),
                  (double)var1.class_().d_(),
                  64.0,
                  this.E(),
                  new rZV(var1.class_(), var1.break_(), var1.byte_(), var1.protected_())
               );
         }
      }
   }

   public rhN_2 this_() {
      List var1 = this.class_(iB_2::BM);
      return var1.isEmpty() ? null : (rhN_2)var1.get(this.int_.nextInt(var1.size()));
   }

   public LongSet x() {
      rRc_1 var1 = this.h().break_(rRc_1::new, "chunks");
      return (LongSet)(var1 != null ? LongSets.unmodifiable(var1.class_()) : LongSets.EMPTY_SET);
   }

   private void c() {
      this.instanceof_.stream().filter(iB_2::Sc).collect(Collectors.toList()).forEach(var0 -> var0.class_(false, false));
   }

   public rrEi_1 h() {
      return this.else_().extends_();
   }

   public rga_3 d() {
      return this.else_().native_();
   }

   public rrEr_1 interface_(rfH_2 var1) {
      return this.return_.class_(var1, 9216);
   }

   private boolean class_(rhN_2 var1, boolean var2, double var3, double var5, double var7, ruS_2<?> var9) {
      if (var1.continue_() != this) {
         return false;
      } else {
         rfH_2 var10 = var1.Bs();
         if (var10.class_(new rjU_2(var3, var5, var7), var2 ? 512.0 : 32.0)) {
            var1.class_.class_(var9);
            return true;
         } else {
            return false;
         }
      }
   }

   public <T extends rLx_1> int class_(T var1, double var2, double var4, double var6, int var8, double var9, double var11, double var13, double var15) {
      rFd_1 var17 = new rFd_1(var1, false, var2, var4, var6, (float)var9, (float)var11, (float)var13, (float)var15, var8);
      int var18 = 0;

      for (int var19 = 0; var19 < this.instanceof_.size(); var19++) {
         rhN_2 var20 = this.instanceof_.get(var19);
         if (this.class_(var20, false, var2, var4, var6, var17)) {
            var18++;
         }
      }

      return var18;
   }

   public <T extends rLx_1> boolean class_(
      rhN_2 var1, T var2, boolean var3, double var4, double var6, double var8, int var10, double var11, double var13, double var15, double var17
   ) {
      rFd_1 var19 = new rFd_1(var2, var3, var4, var6, var8, (float)var11, (float)var13, (float)var15, (float)var17, var10);
      return this.class_(var1, var3, var4, var6, var8, var19);
   }

   public rfH_2 class_(rrrZ<?> var1, rfH_2 var2, int var3, boolean var4) {
      return !this.interface_.rB().long_().break_() ? null : this.else_().implements_().class_(this, var1, var2, var3, var4);
   }

   public void class_(roJ_2 var1, int var2) {
      rfj_3 var3 = var1.private_();
      boolean var4 = this.s();
      int var5 = var3.break_();
      int var6 = var3.byte_();
      if (var4 && this.S() && this.int_.nextInt(100000) == 0) {
         rfH_2 var7 = this.instanceof_(this.class_(var5, 0, var6, 15));
         if (this.while_(var7)) {
            rRh_1 var8 = this.throws_(var7);
            boolean var9 = this.B().break_(rRu_1.protected_) && this.int_.nextDouble() < (double)var8.break_() * 0.01;
            if (var9) {
               rhG_2 var10 = aI_2.n.class_(this);
               var10.this_(true);
               var10.e_(0);
               var10.new_((double)var7.b_(), (double)var7.c_(), (double)var7.d_());
               this.a_(var10);
            }

            rSg_1 var22 = aI_2.boolean_.class_(this);
            var22.a_(rjU_2.protected_(var7));
            var22.class_(var9);
            this.a_(var22);
         }
      }

      if (this.int_.nextInt(16) == 0) {
         rfH_2 var16 = this.class_(rKv_1.MOTION_BLOCKING, this.class_(var5, 0, var6, 15));
         rfH_2 var18 = var16.break_();
         rYG var20 = this.implements_(var16);
         if (var20.class_(this, var18)) {
            this.break_(var18, xu_3.PT.continue_());
         }

         if (var4 && var20.break_(this, var16)) {
            this.break_(var16, xu_3.Pq.continue_());
         }

         if (var4 && this.implements_(var18).byte_() == rYJ.RAIN) {
            this.byte_(var18).break_().byte_((rYB)this, var18);
         }
      }

      if (var2 > 0) {
         for (roQ_2 var23 : var1.byte_()) {
            if (var23 != roJ_2.class_ && var23.protected_()) {
               int var11 = var23.catch_();

               for (int var12 = 0; var12 < var2; var12++) {
                  rfH_2 var13 = this.class_(var5, var11, var6, 15);
                  xc_3 var14 = var23.class_(var13.b_() - var5, var13.c_() - var11, var13.d_() - var6);
                  if (var14.final_()) {
                     var14.break_(this, var13, this.int_);
                  }

                  rXE var15 = var14.volatile_();
                  if (var15.case_()) {
                     var15.break_(this, var13, this.int_);
                  }
               }
            }
         }
      }
   }

   @Override
   public void class_(rfH_2 var1, xd_3 var2) {
      if (!this.b()) {
         this.break_(var1, var2);
      }
   }

   @Override
   public rRW class_(an_3 var1, rye_3 var2, rRQ var3, double var4, double var6, double var8, float var10, boolean var11, rRz_1 var12) {
      rRW var13 = new rRW(this, var1, var2, var3, var4, var6, var8, var10, var11, var12);
      var13.class_();
      var13.class_(false);
      if (var12 == rRz_1.NONE) {
         var13.throws_();
      }

      for (rhN_2 var15 : this.instanceof_) {
         if (var15.class_(var4, var6, var8) < 4096.0) {
            var15.class_.class_(new rvu_3(var4, var6, var8, var10, var13.case_(), var13.byte_().get(var15)));
         }
      }

      return var13;
   }

   @Override
   public void class_(an_3 var1, byte var2) {
      this.else_().class_(var1, new rvQ_2(var1, var2));
   }

   @Override
   public void class_(rfH_2 var1, xc_3 var2, xc_3 var3, int var4) {
      this.else_().break_(var1);
      rjC_2 var5 = var2.extends_(this, var1);
      rjC_2 var6 = var3.extends_(this, var1);
      if (rjw_3.byte_(var5, var6, rjN_2.catch_)) {
         for (rLy_1 var8 : this.import_) {
            if (!var8.private_()) {
               var8.break_(var1);
            }
         }
      }
   }

   @Override
   public void class_(rhd_3 var1, int var2, rfH_2 var3, int var4) {
      this.interface_.x().class_(var1, (double)var3.b_(), (double)var3.c_(), (double)var3.d_(), 64.0, this.E(), new rvw_3(var2, var3, var4, false));
   }

   public void class_(BooleanSupplier var1) {
      this.default_ = true;
      this.instanceof_().super_();
      boolean var2 = this.s();
      if (this.default_().break_()) {
         if (this.B().break_(rRu_1.this_)) {
            int var3 = this.char_.final_();
            int var4 = this.char_.package_();
            int var5 = this.char_.int_();
            boolean var6 = this.new_.catch_();
            boolean var7 = this.new_.private_();
            if (var3 > 0) {
               var3--;
               var4 = var6 ? 0 : 1;
               var5 = var7 ? 0 : 1;
               var6 = false;
               var7 = false;
            } else {
               if (var4 > 0) {
                  if (--var4 == 0) {
                     var6 = !var6;
                  }
               } else if (var6) {
                  var4 = this.int_.nextInt(12000) + 3600;
               } else {
                  var4 = this.int_.nextInt(168000) + 12000;
               }

               if (var5 > 0) {
                  if (--var5 == 0) {
                     var7 = !var7;
                  }
               } else if (var7) {
                  var5 = this.int_.nextInt(12000) + 12000;
               } else {
                  var5 = this.int_.nextInt(168000) + 12000;
               }
            }

            this.char_.throws_(var4);
            this.char_.case_(var5);
            this.char_.protected_(var3);
            this.char_.break_(var6);
            this.char_.class_(var7);
         }

         this.final_ = this.package_;
         if (this.new_.catch_()) {
            this.package_ = (float)((double)this.package_ + 0.01);
         } else {
            this.package_ = (float)((double)this.package_ - 0.01);
         }

         this.package_ = rfU_2.class_(this.package_, 0.0F, 1.0F);
         this.native_ = this.volatile_;
         if (this.new_.private_()) {
            this.volatile_ = (float)((double)this.volatile_ + 0.01);
         } else {
            this.volatile_ = (float)((double)this.volatile_ - 0.01);
         }

         this.volatile_ = rfU_2.class_(this.volatile_, 0.0F, 1.0F);
      }

      if (this.native_ != this.volatile_) {
         this.interface_.x().class_(new rZY(rZY.private_, this.volatile_), this.E());
      }

      if (this.final_ != this.package_) {
         this.interface_.x().class_(new rZY(rZY.implements_, this.package_), this.E());
      }

      if (var2 != this.s()) {
         if (var2) {
            this.interface_.x().class_(new rZY(rZY.byte_, 0.0F));
         } else {
            this.interface_.x().class_(new rZY(rZY.break_, 0.0F));
         }

         this.interface_.x().class_(new rZY(rZY.private_, this.volatile_));
         this.interface_.x().class_(new rZY(rZY.implements_, this.package_));
      }

      if (this.abstract_ && this.instanceof_.stream().noneMatch(var0 -> !var0.native_() && !var0.sm())) {
         this.abstract_ = false;
         if (this.B().break_(rRu_1.finally_)) {
            long var8 = this.new_.case_() + 24000L;
            this.class_(var8 - var8 % 24000L);
         }

         this.c();
         if (this.B().break_(rRu_1.this_)) {
            this.u();
         }
      }

      this.double_();
      this.throws_();
      this.else_().class_(var1);
      if (!this.b()) {
         this.void_.class_();
         this.static_.class_();
      }

      this.return_.class_();
      this.Z();
      this.default_ = false;
      boolean var9 = !this.instanceof_.isEmpty() || !this.x().isEmpty();
      if (var9) {
         this.volatile_();
      }

      if (var9 || this.long_++ < 300) {
         if (this.strictfp_ != null) {
            this.strictfp_.break_();
         }

         this.else_ = true;
         ObjectIterator var11 = this.goto_.int2ObjectEntrySet().iterator();

         while (var11.hasNext()) {
            Entry var14 = (Entry)var11.next();
            an_3 var13 = (an_3)var14.getValue();
            an_3 var16 = var13.ra();
            if (!this.interface_.s() && (var13 instanceof rbZ_2 || var13 instanceof rOl_1)) {
               var13.PD();
            }

            if (!this.interface_.E() && var13 instanceof ae_3) {
               var13.PD();
            }

            if (!(Boolean)var13.throws_[27]) {
               var13.rA();
            }

            if (var16 != null) {
               if (!(Boolean)var16.throws_[27] && var16.synchronized_(var13)) {
                  continue;
               }

               var13.BH();
            }

            if (!(Boolean)var13.throws_[27] && !(var13 instanceof rSm_1)) {
               this.class_(this::break_, var13);
            }

            if ((Boolean)var13.throws_[27]) {
               this.package_(var13);
               var11.remove();
               this.finally_(var13);
            }
         }

         this.else_ = false;

         an_3 var15;
         while ((var15 = this.try_.poll()) != null) {
            this.final_(var15);
         }

         this.transient_();
      }
   }

   private boolean class_(xQ_2 var1) {
      xc_3 var2 = this.byte_(var1.class_());
      return var2.class_(var1.break_()) ? var2.class_(this, var1.class_(), var1.byte_(), var1.protected_()) : false;
   }

   public void class_(rsC_2 var1, an_3 var2, rsn_3 var3) {
      var3.class_(var1, var2);
   }

   public void class_(long var1) {
      this.char_.break_(var1);
   }

   public boolean class_(rjh_3 var1) {
      return this.throw_(var1.int_());
   }

   public void class_(rfi_3 var1) {
      this.short_.removeIf(var1x -> var1.break_(var1x.class_()));
   }

   private void class_(Writer var1) throws IOException {
      ryT_2 var2 = ryT_2.class_().class_("x").class_("y").class_("z").class_("type").class_(var1);

      for (ryO_2 var4 : this.case_) {
         rfH_2 var5 = var4.char_();
         var2.class_(var5.b_(), var5.c_(), var5.d_(), rVL.r.break_(var4.void_()));
      }
   }

   private static void class_(Writer var0, Iterable<an_3> var1) throws IOException {
      ryT_2 var2 = ryT_2.class_()
         .class_("x")
         .class_("y")
         .class_("z")
         .class_("uuid")
         .class_("type")
         .class_("alive")
         .class_("display_name")
         .class_("custom_name")
         .class_(var0);

      for (an_3 var4 : var1) {
         rgP_2 var5 = var4.rD();
         rgP_2 var6 = var4.L_();
         var2.class_(
            var4.rx(), var4.re(), var4.BO(), var4.ro(), rVL.transient_.break_(var4.BC()), var4.BM(), var6.getString(), var5 != null ? var5.getString() : null
         );
      }
   }

   public void class_(Path var1) throws IOException {
      rrEx_1 var2 = this.else_().class_;

      try (BufferedWriter var3 = Files.newBufferedWriter(var1.resolve("stats.txt"))) {
         var3.write(String.format("spawning_chunks: %d\n", var2.case_().break_()));
         rrEg_1 var4 = this.else_().volatile_();
         if (var4 != null) {
            ObjectIterator var5 = var4.break_().object2IntEntrySet().iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var6 = (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry)var5.next();
               var3.write(String.format("spawn_count.%s: %d\n", ((aH_2)var6.getKey()).break_(), var6.getIntValue()));
            }
         }

         var3.write(String.format("entities: %d\n", this.goto_.size()));
         var3.write(String.format("block_entities: %d\n", this.case_.size()));
         var3.write(String.format("block_ticks: %d\n", this.synchronized_().break_()));
         var3.write(String.format("fluid_ticks: %d\n", this.return_().break_()));
         var3.write("distance_manager: " + var2.case_().byte_() + "\n");
         var3.write(String.format("pending_tasks: %d\n", this.else_().private_()));
      }

      KY var20 = new KY("Level dump", new Exception("dummy"));
      this.class_(var20);

      try (BufferedWriter var21 = Files.newBufferedWriter(var1.resolve("example_crash.txt"))) {
         var21.write(var20.protected_());
      }

      Path var22 = var1.resolve("chunks.csv");

      try (BufferedWriter var23 = Files.newBufferedWriter(var22)) {
         var2.class_(var23);
      }

      Path var24 = var1.resolve("entities.csv");

      try (BufferedWriter var25 = Files.newBufferedWriter(var24)) {
         class_(var25, this.goto_.values());
      }

      Path var26 = var1.resolve("block_entities.csv");

      try (BufferedWriter var7 = Files.newBufferedWriter(var26)) {
         this.class_(var7);
      }
   }

   @Override
   public void class_(rrGb_1 var1) {
      this.const_().abstract_().h().class_(var1);
   }

   @Override
   public rrGb_1 class_(String var1) {
      return this.const_().abstract_().h().break_(() -> new rrGb_1(var1), var1);
   }

   public rfH_2 class_(rYG var1, rfH_2 var2, int var3, int var4) {
      return this.else_().implements_().protected_().class_(var2.b_(), var2.c_(), var2.d_(), var3, var4, var1x -> var1x == var1, this.int_, true);
   }

   public void class_(rfH_2 var1, float var2) {
      rfj_3 var3 = new rfj_3(new rfH_2(this.new_.class_(), 0, this.new_.byte_()));
      this.new_.class_(var1, var2);
      this.else_().break_(rrEl_1.class_, var3, 11, rqg_3.INSTANCE);
      this.else_().class_(rrEl_1.class_, new rfj_3(var1), 11, rqg_3.INSTANCE);
      this.const_().x().class_(new rFj_1(var1, var2));
   }

   public boolean class_(int var1, int var2, boolean var3) {
      rRc_1 var4 = this.h().class_(rRc_1::new, "chunks");
      rfj_3 var5 = new rfj_3(var1, var2);
      long var6 = var5.class_();
      boolean var8;
      if (var3) {
         var8 = var4.class_().add(var6);
         if (var8) {
            this.throws_(var1, var2);
         }
      } else {
         var8 = var4.class_().remove(var6);
      }

      var4.class_(var8);
      if (var8) {
         this.else_().class_(var5, var3);
      }

      return var8;
   }

   @Override
   public float class_(rpr_3 var1, boolean var2) {
      return 1.0F;
   }

   public List<an_3> class_(aI_2<?> var1, Predicate<? super an_3> var2) {
      ArrayList var3 = Lists.newArrayList();
      rrEN var4 = this.else_();
      ObjectIterator var5 = this.goto_.values().iterator();

      while (var5.hasNext()) {
         an_3 var6 = (an_3)var5.next();
         if ((var1 == null || var6.BC() == var1) && var4.case_(rfU_2.byte_(var6.rx()) >> 4, rfU_2.byte_(var6.BO()) >> 4) && var2.test(var6)) {
            var3.add(var6);
         }
      }

      return var3;
   }

   private static <T> String class_(Collection<T> var0, Function<T, rqO_2> var1) {
      try {
         Object2IntOpenHashMap var2 = new Object2IntOpenHashMap();

         for (Object var4 : var0) {
            rqO_2 var5 = (rqO_2)var1.apply(var4);
            var2.addTo(var5, 1);
         }

         return var2.object2IntEntrySet()
            .stream()
            .sorted(Comparator.comparing(it.unimi.dsi.fastutil.objects.Object2IntMap.Entry::getIntValue).reversed())
            .limit(5L)
            .map(var0x -> var0x.getKey() + ":" + var0x.getIntValue())
            .collect(Collectors.joining(","));
      } catch (Exception var6) {
         return "";
      }
   }

   public void class_(int var1, int var2, boolean var3, boolean var4) {
      this.char_.protected_(var1);
      this.char_.case_(var2);
      this.char_.throws_(var2);
      this.char_.class_(var3);
      this.char_.break_(var4);
   }

   public void class_(an_3 var1, an_3 var2) {
      if ((Boolean)var2.throws_[27] || var2.ra() != var1) {
         var2.BH();
      } else if (var2 instanceof rhd_3 || this.else_().class_(var2)) {
         var2.native_(var2.rx(), var2.re(), var2.BO());
         Float var9 = (Float)var2.throws_[15];
         var2.throws_[17] = var9;
         Float var10 = (Float)var2.throws_[16];
         var2.throws_[18] = var10;
         if ((Boolean)var2.throws_[50]) {
            Integer var11 = (Integer)var2.throws_[41] + 1;
            var2.throws_[41] = var11;
            var2.A();
         }

         this.byte_(var2);
         if ((Boolean)var2.throws_[50]) {
            for (an_3 var4 : var2.Bh()) {
               this.class_(var2, var4);
            }
         }
      }
   }

   @Override
   public Stream<? extends rrrH<?>> class_(rjh_3 var1, rrrZ<?> var2) {
      return this.protected_().class_(var1, var2);
   }

   public List<rhN_2> class_(Predicate<? super rhN_2> var1) {
      ArrayList var2 = Lists.newArrayList();

      for (rhN_2 var4 : this.instanceof_) {
         if (var1.test(var4)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public static void class_(rrEm_1 var0) {
      rfH_2 var1 = this_;
      int var2 = var1.b_();
      int var3 = var1.c_() - 2;
      int var4 = var1.d_();
      rfH_2.break_(var2 - 2, var3 + 1, var4 - 2, var2 + 2, var3 + 3, var4 + 2).forEach(var1x -> var0.break_(var1x, xu_3.class_.continue_()));
      rfH_2.break_(var2 - 2, var3, var4 - 2, var2 + 2, var3, var4 + 2).forEach(var1x -> var0.break_(var1x, xu_3.rg.continue_()));
   }

   public void class_(rhN_2 var1) {
      this.case_(var1);
      this.byte_((an_3)var1);
   }

   public void class_(rpC_2 var1, boolean var2, boolean var3) {
      rrEN var4 = this.else_();
      if (!var3) {
         if (var1 != null) {
            var1.break_(new rgn_3("menu.savingLevel"));
         }

         this.m();
         if (var1 != null) {
            var1.protected_(new rgn_3("menu.savingChunks"));
         }

         var4.class_(var2);
      }
   }

   @Override
   public boolean class_(rhd_3 var1, rfH_2 var2) {
      return !this.interface_.class_(this, var2, var1) && this.instanceof_().class_(var2);
   }

   @Override
   public void class_(rhd_3 var1, an_3 var2, rqA_2 var3, rqL_2 var4, float var5, float var6) {
      this.interface_
         .x()
         .class_(var1, var2.rx(), var2.re(), var2.BO(), var5 > 1.0F ? (double)(16.0F * var5) : 16.0, this.E(), new rFX(var3, var4, var2, var5, var6));
   }

   @Override
   public void class_(rfH_2 var1, xd_3 var2, int var3, int var4) {
      this.short_.add(new xQ_2(var1, var2, var3, var4));
   }

   @Override
   public void class_(int var1, rfH_2 var2, int var3) {
      for (rhN_2 var5 : this.interface_.x().super_()) {
         if (var5 != null && (rYB)var5.throws_[7] == this && var5.V() != var1) {
            double var6 = (double)var2.b_() - var5.rx();
            double var8 = (double)var2.c_() - var5.re();
            double var10 = (double)var2.d_() - var5.BO();
            if (var6 * var6 + var8 * var8 + var10 * var10 < 1024.0) {
               var5.class_.class_(new rZf_1(var1, var2, var3));
            }
         }
      }
   }

   @Override
   public void class_(rhd_3 var1, double var2, double var4, double var6, rqA_2 var8, rqL_2 var9, float var10, float var11) {
      this.interface_
         .x()
         .class_(var1, var2, var4, var6, var10 > 1.0F ? (double)(16.0F * var10) : 16.0, this.E(), new rvt_3(var8, var9, var2, var4, var6, var10, var11));
   }

   public void class_(roJ_2 var1) {
      this.implements_.addAll(var1.volatile_().values());
      ryI_2[] var2 = var1.final_();
      int var3 = var2.length;

      for (int var4 = 0; var4 < var3; var4++) {
         for (an_3 var6 : var2[var4]) {
            if (!(var6 instanceof rhN_2)) {
               if (this.else_) {
                  throw (IllegalStateException)rqR_2.byte_(new IllegalStateException("Removing entity while ticking!"));
               }

               this.goto_.remove(var6.V());
               this.finally_(var6);
            }
         }
      }
   }

   private void class_(rRD<rXs_1> var1) {
      rXE var2 = this.break_(var1.class_);
      if (var2.class_() == var1.break_()) {
         var2.class_((rYB)this, var1.class_);
      }
   }

   private void m() {
      if (this.strictfp_ != null) {
         this.interface_.rB().break_(this.strictfp_.class_());
      }

      this.else_().extends_().class_();
   }

   public rrEs_1 k() {
      return this.return_;
   }

   public boolean z() {
      return this.interface_.rB().long_().private_();
   }

   private void u() {
      this.char_.case_(0);
      this.char_.class_(false);
      this.char_.throws_(0);
      this.char_.break_(false);
   }

   public String N() {
      return String.format(
         "players: %s, entities: %d [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.instanceof_.size(),
         this.goto_.size(),
         class_(this.goto_.values(), var0 -> rVL.transient_.break_(var0.BC())),
         this.catch_.size(),
         class_(this.catch_, var0 -> rVL.r.break_(var0.void_())),
         this.synchronized_().break_(),
         this.return_().break_(),
         this.for_()
      );
   }

   @Override
   public an_3 break_(int var1) {
      return (an_3)this.goto_.get(var1);
   }

   private void break_(rRD<xd_3> var1) {
      xc_3 var2 = this.byte_(var1.class_);
      if (var2.class_(var1.break_())) {
         var2.class_(this, var1.class_, this.int_);
      }
   }

   public int break_(rjh_3 var1) {
      return this.d().class_(var1);
   }

   public void break_(boolean var1, boolean var2) {
      for (rrEq_1 var4 : this.const_) {
         var4.class_(this, var1, var2);
      }
   }

   public void break_(an_3 var1) {
      if (!(var1 instanceof rhd_3) && !this.else_().class_(var1)) {
         this.byte_(var1);
      } else {
         var1.native_(var1.rx(), var1.re(), var1.BO());
         Float var8 = (Float)var1.throws_[15];
         var1.throws_[17] = var8;
         Float var9 = (Float)var1.throws_[16];
         var1.throws_[18] = var9;
         if ((Boolean)var1.throws_[50]) {
            Integer var10 = (Integer)var1.throws_[41] + 1;
            var1.throws_[41] = var10;
            var1.this_();
         }

         this.byte_(var1);
         if ((Boolean)var1.throws_[50]) {
            for (an_3 var3 : var1.Bh()) {
               this.class_(var1, var3);
            }
         }
      }
   }

   @Override
   public void break_(rfH_2 var1, xc_3 var2, xc_3 var3) {
      Optional var4 = rRP.class_(var2);
      Optional var5 = rRP.class_(var3);
      if (!Objects.equals(var4, var5)) {
         rfH_2 var6 = var1.int_();
         var4.ifPresent(var2x -> this.const_().execute(() -> {
               this.d().class_(var6);
               ruP_2.break_(this, var6);
            }));
         var5.ifPresent(var2x -> this.const_().execute(() -> {
               this.d().class_(var6, var2x);
               ruP_2.class_(this, var6);
            }));
      }
   }

   public an_3 break_(UUID var1) {
      return this.while_.get(var1);
   }

   @Override
   public void break_(int var1, rfH_2 var2, int var3) {
      this.interface_.x().class_(new rvw_3(var1, var2, var3, true));
   }

   @Override
   public long break_() {
      return this.interface_.rB().long_().class_();
   }

   public void break_(rhN_2 var1) {
      this.case_(var1);
      this.byte_((an_3)var1);
   }

   public void throws_(rhN_2 var1) {
      var1.PD();
      this.extends_(var1);
      this.private_();
   }

   protected void throws_() {
      if (this.transient_) {
         long var1 = this.new_.throws_() + 1L;
         this.char_.class_(var1);
         this.char_.else_().class_(this.interface_, var1);
         if (this.new_.finally_().break_(rRu_1.finally_)) {
            this.class_(this.new_.case_() + 1L);
         }
      }
   }

   public rRi_1 M() {
      return this.float_;
   }

   public Iterable<an_3> W() {
      return Iterables.unmodifiableIterable(this.goto_.values());
   }

   public void finally_(an_3 var1) {
      if (var1 instanceof rSu_1) {
         for (rSm_1 var5 : ((rSu_1)var1).implements_()) {
            var5.PD();
         }
      }

      this.while_.remove(var1.ro());
      this.else_().break_(var1);
      if (var1 instanceof rhN_2 var6) {
         this.instanceof_.remove(var6);
      }

      this.native_().class_(var1);
      if (var1 instanceof is_3) {
         this.import_.remove(((is_3)var1).public_());
      }
   }

   public void catch_(an_3 var1) {
      boolean var2 = (Boolean)var1.throws_[6];
      Boolean var7 = true;
      var1.throws_[6] = var7;
      this.case_(var1);
      Boolean var8 = var2;
      var1.throws_[6] = var8;
      this.byte_(var1);
   }

   @Override
   public boolean G() {
      return this.synchronized_;
   }

   public rrPt_1 O() {
      return this.interface_.rP();
   }

   public void extends_(an_3 var1) {
      if (this.else_) {
         throw (IllegalStateException)rqR_2.byte_(new IllegalStateException("Removing entity while ticking!"));
      } else {
         this.package_(var1);
         this.goto_.remove(var1.V());
         this.finally_(var1);
      }
   }

   public boolean case_() {
      return this.default_;
   }

   private void case_(rhN_2 var1) {
      an_3 var2 = this.while_.get(var1.ro());
      if (var2 != null) {
         public_.warn("Force-added player with duplicate UUID {}", var1.ro().toString());
         var2.K();
         this.throws_((rhN_2)var2);
      }

      this.instanceof_.add(var1);
      this.private_();
      roC_2 var3 = this.class_(rfU_2.byte_(var1.rx() / 16.0), rfU_2.byte_(var1.BO() / 16.0), roN_2.volatile_, true);
      if (var3 instanceof roJ_2) {
         var3.class_(var1);
      }

      this.final_(var1);
   }

   public boolean case_(an_3 var1) {
      return this.native_(var1);
   }

   @Nonnull
   @Override
   public rnW_2 const_() {
      return this.interface_;
   }

   @Override
   public List<rhN_2> continue_() {
      return this.instanceof_;
   }

   public rrEN else_() {
      return this.throw_;
   }

   @Override
   public rWB implements_() {
      return this.interface_.V();
   }

   public boolean implements_(an_3 var1) {
      if (var1.Bu().anyMatch(this::volatile_)) {
         return false;
      } else {
         this.class_(var1);
         return true;
      }
   }

   protected rfH_2 instanceof_(rfH_2 var1) {
      rfH_2 var2 = this.class_(rKv_1.MOTION_BLOCKING, var1);
      rfl_3 var3 = new rfl_3(var2, new rfH_2(var2.b_(), this.try_(), var2.d_())).class_(3.0);
      List var4 = this.class_(iB_2.class, var3, var1x -> var1x != null && var1x.BM() && this.case_(var1x.Bs()));
      if (!var4.isEmpty()) {
         return ((iB_2)var4.get(this.int_.nextInt(var4.size()))).Bs();
      } else {
         if (var2.c_() == -1) {
            var2 = var2.break_(2);
         }

         return var2;
      }
   }

   @Override
   public rVm_1 new_() {
      return this.interface_.rS();
   }

   private void package_(an_3 var1) {
      roC_2 var2 = this.class_((Integer)var1.throws_[51], (Integer)var1.throws_[53], roN_2.volatile_, false);
      if (var2 instanceof roJ_2) {
         ((roJ_2)var2).break_(var1);
      }
   }

   public rrEu_1<rXs_1> return_() {
      return this.static_;
   }

   public List<rSu_1> super_() {
      ArrayList var1 = Lists.newArrayList();
      ObjectIterator var2 = this.goto_.values().iterator();

      while (var2.hasNext()) {
         an_3 var3 = (an_3)var2.next();
         if (var3 instanceof rSu_1 && var3.BM()) {
            var1.add((rSu_1)var3);
         }
      }

      return var1;
   }

   public boolean throw_(rfH_2 var1) {
      return this.byte_(var1, 1);
   }

   public void protected_(rhN_2 var1) {
      this.case_(var1);
   }

   public rrrA protected_() {
      return this.boolean_;
   }

   public boolean private_(an_3 var1) {
      if (this.volatile_(var1)) {
         return false;
      } else {
         this.final_(var1);
         return true;
      }
   }

   public void private_() {
      this.abstract_ = false;
      if (!this.instanceof_.isEmpty()) {
         int var1 = 0;
         int var2 = 0;

         for (rhN_2 var4 : this.instanceof_) {
            if (var4.native_()) {
               var1++;
            } else if (var4.Sc()) {
               var2++;
            }
         }

         this.abstract_ = var2 > 0 && var2 >= this.instanceof_.size() - var1;
      }
   }

   @Override
   public int final_() {
      return this.const_().abstract_().h().class_(rrGJ::new, "idcounts").class_();
   }

   private void final_(an_3 var1) {
      if (this.else_) {
         this.try_.add(var1);
      } else {
         this.goto_.put(var1.V(), var1);
         if (var1 instanceof rSu_1) {
            for (rSm_1 var5 : ((rSu_1)var1).implements_()) {
               this.goto_.put(var5.V(), var5);
            }
         }

         this.while_.put(var1.ro(), var1);
         this.else_().byte_(var1);
         if (var1 instanceof is_3) {
            this.import_.add(((is_3)var1).public_());
         }
      }
   }

   private boolean volatile_(an_3 var1) {
      UUID var2 = var1.ro();
      an_3 var3 = this.byte_(var2);
      if (var3 == null) {
         return false;
      } else {
         public_.warn(
            "Trying to add entity with duplicated UUID {}. Existing {}#{}, new: {}#{}",
            var2,
            aI_2.class_(var3.BC()),
            var3.V(),
            aI_2.class_(var1.BC()),
            var1.V()
         );
         return true;
      }
   }

   public void volatile_() {
      this.long_ = 0;
   }

   public rrEu_1<xd_3> synchronized_() {
      return this.void_;
   }

   public rnG_2 native_() {
      return this.interface_.R();
   }

   private boolean native_(an_3 var1) {
      if ((Boolean)var1.throws_[27]) {
         public_.warn("Tried to add entity {} but it was marked as removed already", aI_2.class_(var1.BC()));
         return false;
      } else if (this.volatile_(var1)) {
         return false;
      } else {
         roC_2 var2 = this.class_(rfU_2.byte_(var1.rx() / 16.0), rfU_2.byte_(var1.BO() / 16.0), roN_2.volatile_, (Boolean)var1.throws_[6]);
         if (!(var2 instanceof roJ_2)) {
            return false;
         } else {
            var2.class_(var1);
            this.final_(var1);
            return true;
         }
      }
   }

   public rfH_2 X() {
      rfH_2 var1 = new rfH_2(this.new_.class_(), this.new_.break_(), this.new_.byte_());
      if (!this.instanceof_().class_(var1)) {
         var1 = this.class_(rKv_1.MOTION_BLOCKING, new rfH_2(this.instanceof_().class_(), 0.0, this.instanceof_().break_()));
      }

      return var1;
   }

   public rKG Q() {
      return this.strictfp_;
   }

   @Override
   public boolean a_(an_3 var1) {
      return this.native_(var1);
   }
}
