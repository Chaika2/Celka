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
   public static final rfH_2 id_this = new rfH_2(100, 50, 0);
   private static final Logger id_public = LogManager.getLogger();
   private final Int2ObjectMap<an_3> id_goto = new Int2ObjectLinkedOpenHashMap();
   private final Map<UUID, an_3> id_while = Maps.newHashMap();
   private final Queue<an_3> id_try = Queues.newArrayDeque();
   private final List<rhN_2> id_instanceof = Lists.newArrayList();
   private final rrEN id_throw;
   boolean id_else;
   private final rnW_2 id_interface;
   private final rrGB id_char;
   public boolean id_synchronized;
   private boolean id_abstract;
   private int id_long;
   private final rRi_1 id_float;
   private final rrEu_1<xd_3> id_void = new rrEu_1(this, var0 -> var0 == null || var0.id_continue().id_catch(), rVL.id_strictfp::id_break, this::id_break);
   private final rrEu_1<rXs_1> id_static = new rrEu_1(this, var0 -> var0 == null || var0 == rXG.id_class, rVL.id_default::id_break, this::id_class);
   private final Set<rLy_1> id_import = Sets.newHashSet();
   protected final rrEs_1 id_return;
   private final ObjectLinkedOpenHashSet<xQ_2> id_short = new ObjectLinkedOpenHashSet();
   private boolean id_default;
   private final List<rrEq_1> id_const;
   private final rKG id_strictfp;
   private final rrrA id_boolean;
   private final boolean id_transient;

   public boolean id_char(rfH_2 var1) {
      return this.id_interface(var1) != null;
   }

   public boolean id_byte(rfH_2 var1, int var2) {
      return var2 > 6 ? false : this.id_break(rjh_3.id_class(var1)) <= var2;
   }

   public void id_byte(an_3 var1) {
      if (var1.BE()) {
         int var2 = rfU_2.id_byte(var1.rx() / 16.0);
         int var3 = rfU_2.id_byte(var1.re() / 16.0);
         int var4 = rfU_2.id_byte(var1.BO() / 16.0);
         if (!(Boolean)var1.id_throws[50] || (Integer)var1.id_throws[51] != var2 || (Integer)var1.id_throws[52] != var3 || (Integer)var1.id_throws[53] != var4) {
            if ((Boolean)var1.id_throws[50] && this.id_break((Integer)var1.id_throws[51], (Integer)var1.id_throws[53])) {
               this.id_throws((Integer)var1.id_throws[51], (Integer)var1.id_throws[53]).id_class(var1, (Integer)var1.id_throws[52]);
            }

            if (!var1.rn() && !this.id_break(var2, var4)) {
               if ((Boolean)var1.id_throws[50]) {
                  id_public.warn("Entity {} left loaded chunk area", var1);
               }

               Boolean var9 = false;
               var1.id_throws[50] = var9;
            } else {
               this.id_throws(var2, var4).id_class(var1);
            }
         }
      }
   }

   public rrEm_1 id_byte() {
      return this;
   }

   private an_3 id_byte(UUID var1) {
      an_3 var2 = this.id_while.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         if (this.id_else) {
            for (an_3 var4 : this.id_try) {
               if (var4.ro().equals(var1)) {
                  return var4;
               }
            }
         }

         return null;
      }
   }

   public void id_byte(rhN_2 var1) {
      this.id_case(var1);
   }

   public rYG id_byte(int var1, int var2, int var3) {
      return this.id_else().id_implements().id_protected().id_protected(var1, var2, var3);
   }

   public rlQ_2 id_int() {
      return this.id_interface.g();
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
      this.id_transient = var13;
      this.id_interface = var1;
      this.id_const = var12;
      this.id_char = var4;
      this.id_throw = new rrEN(this, var3, var1.T(), var1.rP(), var2, var8, var1.x().id_new(), var1.rr(), var7, () -> var1.id_abstract().h());
      this.id_float = new rRi_1(this);
      this.id_double();
      this.id_switch();
      this.id_instanceof().id_class(var1.n());
      this.id_return = (rrEs_1)this.h().id_class(() -> new rrEs_1(this), rrEs_1.id_class(this.id_default()));
      if (!var1.id_const()) {
         var4.id_class(var1.id_package());
      }

      this.id_boolean = new rrrA(this, var1.rB().id_long());
      if (this.id_default().id_native()) {
         this.id_strictfp = new rKG(this, var1.rB().id_long().id_class(), var1.rB().id_abstract());
      } else {
         this.id_strictfp = null;
      }
   }

   public String toString() {
      return "ServerLevel[" + this.id_char.id_volatile() + "]";
   }

   public float J() {
      return this.id_new.id_protected();
   }

   private void Z() {
      while (!this.id_short.isEmpty()) {
         xQ_2 var1 = (xQ_2)this.id_short.removeFirst();
         if (this.id_class(var1)) {
            this.id_interface
               .x()
               .id_class(
                  (rhd_3)null,
                  (double)var1.id_class().b_(),
                  (double)var1.id_class().c_(),
                  (double)var1.id_class().d_(),
                  64.0,
                  this.E(),
                  new rZV(var1.id_class(), var1.id_break(), var1.id_byte(), var1.id_protected())
               );
         }
      }
   }

   public rhN_2 id_this() {
      List var1 = this.id_class(iB_2::BM);
      return var1.isEmpty() ? null : (rhN_2)var1.get(this.id_int.nextInt(var1.size()));
   }

   public LongSet x() {
      rRc_1 var1 = (rRc_1)this.h().id_break(rRc_1::new, "chunks");
      return (LongSet)(var1 != null ? LongSets.unmodifiable(var1.id_class()) : LongSets.EMPTY_SET);
   }

   private void c() {
      this.id_instanceof.stream().filter(iB_2::Sc).collect(Collectors.toList()).forEach(var0 -> var0.id_class(false, false));
   }

   public rrEi_1 h() {
      return this.id_else().id_extends();
   }

   public rga_3 d() {
      return this.id_else().id_native();
   }

   public rrEr_1 id_interface(rfH_2 var1) {
      return this.id_return.id_class(var1, 9216);
   }

   private boolean id_class(rhN_2 var1, boolean var2, double var3, double var5, double var7, ruS_2<?> var9) {
      if (var1.id_continue() != this) {
         return false;
      } else {
         rfH_2 var10 = var1.Bs();
         if (var10.id_class(new rjU_2(var3, var5, var7), var2 ? 512.0 : 32.0)) {
            var1.id_class.id_class(var9);
            return true;
         } else {
            return false;
         }
      }
   }

   public <T extends rLx_1> int id_class(T var1, double var2, double var4, double var6, int var8, double var9, double var11, double var13, double var15) {
      rFd_1 var17 = new rFd_1(var1, false, var2, var4, var6, (float)var9, (float)var11, (float)var13, (float)var15, var8);
      int var18 = 0;

      for (int var19 = 0; var19 < this.id_instanceof.size(); var19++) {
         rhN_2 var20 = this.id_instanceof.get(var19);
         if (this.id_class(var20, false, var2, var4, var6, var17)) {
            var18++;
         }
      }

      return var18;
   }

   public <T extends rLx_1> boolean id_class(
      rhN_2 var1, T var2, boolean var3, double var4, double var6, double var8, int var10, double var11, double var13, double var15, double var17
   ) {
      rFd_1 var19 = new rFd_1(var2, var3, var4, var6, var8, (float)var11, (float)var13, (float)var15, (float)var17, var10);
      return this.id_class(var1, var3, var4, var6, var8, var19);
   }

   public rfH_2 id_class(rrrZ<?> var1, rfH_2 var2, int var3, boolean var4) {
      return !this.id_interface.rB().id_long().id_break() ? null : this.id_else().id_implements().id_class(this, var1, var2, var3, var4);
   }

   public void id_class(roJ_2 var1, int var2) {
      rfj_3 var3 = var1.id_private();
      boolean var4 = this.s();
      int var5 = var3.id_break();
      int var6 = var3.id_byte();
      if (var4 && this.S() && this.id_int.nextInt(100000) == 0) {
         rfH_2 var7 = this.id_instanceof(this.id_class(var5, 0, var6, 15));
         if (this.id_while(var7)) {
            rRh_1 var8 = this.id_throws(var7);
            boolean var9 = this.B().id_break(rRu_1.id_protected) && this.id_int.nextDouble() < (double)var8.id_break() * 0.01;
            if (var9) {
               rhG_2 var10 = (rhG_2)aI_2.n.id_class(this);
               var10.id_this(true);
               var10.e_(0);
               var10.id_new((double)var7.b_(), (double)var7.c_(), (double)var7.d_());
               this.a_(var10);
            }

            rSg_1 var22 = (rSg_1)aI_2.id_boolean.id_class(this);
            var22.a_(rjU_2.id_protected(var7));
            var22.id_class(var9);
            this.a_(var22);
         }
      }

      if (this.id_int.nextInt(16) == 0) {
         rfH_2 var16 = this.id_class(rKv_1.MOTION_BLOCKING, this.id_class(var5, 0, var6, 15));
         rfH_2 var18 = var16.id_break();
         rYG var20 = this.id_implements(var16);
         if (var20.id_class(this, var18)) {
            this.id_break(var18, xu_3.PT.id_continue());
         }

         if (var4 && var20.id_break(this, var16)) {
            this.id_break(var16, xu_3.Pq.id_continue());
         }

         if (var4 && this.id_implements(var18).id_byte() == rYJ.RAIN) {
            this.id_byte(var18).id_break().id_byte(this, var18);
         }
      }

      if (var2 > 0) {
         for (roQ_2 var23 : var1.id_byte()) {
            if (var23 != roJ_2.id_class && var23.id_protected()) {
               int var11 = var23.id_catch();

               for (int var12 = 0; var12 < var2; var12++) {
                  rfH_2 var13 = this.id_class(var5, var11, var6, 15);
                  xc_3 var14 = var23.id_class(var13.b_() - var5, var13.c_() - var11, var13.d_() - var6);
                  if (var14.id_final()) {
                     var14.id_break(this, var13, this.id_int);
                  }

                  rXE var15 = var14.id_volatile();
                  if (var15.id_case()) {
                     var15.id_break(this, var13, this.id_int);
                  }
               }
            }
         }
      }
   }

   public void id_class(rfH_2 var1, xd_3 var2) {
      if (!this.b()) {
         this.id_break(var1, var2);
      }
   }

   public rRW id_class(an_3 var1, rye_3 var2, rRQ var3, double var4, double var6, double var8, float var10, boolean var11, rRz_1 var12) {
      rRW var13 = new rRW(this, var1, var2, var3, var4, var6, var8, var10, var11, var12);
      var13.id_class();
      var13.id_class(false);
      if (var12 == rRz_1.NONE) {
         var13.id_throws();
      }

      for (rhN_2 var15 : this.id_instanceof) {
         if (var15.id_class(var4, var6, var8) < 4096.0) {
            var15.id_class.id_class(new rvu_3(var4, var6, var8, var10, var13.id_case(), (rjU_2)var13.id_byte().get(var15)));
         }
      }

      return var13;
   }

   public void id_class(an_3 var1, byte var2) {
      this.id_else().id_class(var1, new rvQ_2(var1, var2));
   }

   public void id_class(rfH_2 var1, xc_3 var2, xc_3 var3, int var4) {
      this.id_else().id_break(var1);
      rjC_2 var5 = var2.id_extends(this, var1);
      rjC_2 var6 = var3.id_extends(this, var1);
      if (rjw_3.id_byte(var5, var6, rjN_2.id_catch)) {
         for (rLy_1 var8 : this.id_import) {
            if (!var8.id_private()) {
               var8.id_break(var1);
            }
         }
      }
   }

   public void id_class(rhd_3 var1, int var2, rfH_2 var3, int var4) {
      this.id_interface.x().id_class(var1, (double)var3.b_(), (double)var3.c_(), (double)var3.d_(), 64.0, this.E(), new rvw_3(var2, var3, var4, false));
   }

   public void id_class(BooleanSupplier var1) {
      this.id_default = true;
      this.id_instanceof().id_super();
      boolean var2 = this.s();
      if (this.id_default().id_break()) {
         if (this.B().id_break(rRu_1.id_this)) {
            int var3 = this.id_char.id_final();
            int var4 = this.id_char.id_package();
            int var5 = this.id_char.id_int();
            boolean var6 = this.id_new.id_catch();
            boolean var7 = this.id_new.id_private();
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
                  var4 = this.id_int.nextInt(12000) + 3600;
               } else {
                  var4 = this.id_int.nextInt(168000) + 12000;
               }

               if (var5 > 0) {
                  if (--var5 == 0) {
                     var7 = !var7;
                  }
               } else if (var7) {
                  var5 = this.id_int.nextInt(12000) + 12000;
               } else {
                  var5 = this.id_int.nextInt(168000) + 12000;
               }
            }

            this.id_char.id_throws(var4);
            this.id_char.id_case(var5);
            this.id_char.id_protected(var3);
            this.id_char.id_break(var6);
            this.id_char.id_class(var7);
         }

         this.id_final = this.id_package;
         if (this.id_new.id_catch()) {
            this.id_package = (float)((double)this.id_package + 0.01);
         } else {
            this.id_package = (float)((double)this.id_package - 0.01);
         }

         this.id_package = rfU_2.id_class(this.id_package, 0.0F, 1.0F);
         this.id_native = this.id_volatile;
         if (this.id_new.id_private()) {
            this.id_volatile = (float)((double)this.id_volatile + 0.01);
         } else {
            this.id_volatile = (float)((double)this.id_volatile - 0.01);
         }

         this.id_volatile = rfU_2.id_class(this.id_volatile, 0.0F, 1.0F);
      }

      if (this.id_native != this.id_volatile) {
         this.id_interface.x().id_class(new rZY(rZY.id_private, this.id_volatile), this.E());
      }

      if (this.id_final != this.id_package) {
         this.id_interface.x().id_class(new rZY(rZY.id_implements, this.id_package), this.E());
      }

      if (var2 != this.s()) {
         if (var2) {
            this.id_interface.x().id_class(new rZY(rZY.id_byte, 0.0F));
         } else {
            this.id_interface.x().id_class(new rZY(rZY.id_break, 0.0F));
         }

         this.id_interface.x().id_class(new rZY(rZY.id_private, this.id_volatile));
         this.id_interface.x().id_class(new rZY(rZY.id_implements, this.id_package));
      }

      if (this.id_abstract && this.id_instanceof.stream().noneMatch(var0 -> !var0.id_native() && !var0.sm())) {
         this.id_abstract = false;
         if (this.B().id_break(rRu_1.id_finally)) {
            long var8 = this.id_new.id_case() + 24000L;
            this.id_class(var8 - var8 % 24000L);
         }

         this.c();
         if (this.B().id_break(rRu_1.id_this)) {
            this.u();
         }
      }

      this.id_double();
      this.id_throws();
      this.id_else().id_class(var1);
      if (!this.b()) {
         this.id_void.id_class();
         this.id_static.id_class();
      }

      this.id_return.id_class();
      this.Z();
      this.id_default = false;
      boolean var9 = !this.id_instanceof.isEmpty() || !this.x().isEmpty();
      if (var9) {
         this.id_volatile();
      }

      if (var9 || this.id_long++ < 300) {
         if (this.id_strictfp != null) {
            this.id_strictfp.id_break();
         }

         this.id_else = true;
         ObjectIterator var11 = this.id_goto.int2ObjectEntrySet().iterator();

         while (var11.hasNext()) {
            Entry var14 = (Entry)var11.next();
            an_3 var13 = (an_3)var14.getValue();
            an_3 var16 = var13.ra();
            if (!this.id_interface.s() && (var13 instanceof rbZ_2 || var13 instanceof rOl_1)) {
               var13.PD();
            }

            if (!this.id_interface.E() && var13 instanceof ae_3) {
               var13.PD();
            }

            if (!(Boolean)var13.id_throws[27]) {
               var13.rA();
            }

            if (var16 != null) {
               if (!(Boolean)var16.id_throws[27] && var16.id_synchronized(var13)) {
                  continue;
               }

               var13.BH();
            }

            if (!(Boolean)var13.id_throws[27] && !(var13 instanceof rSm_1)) {
               this.id_class(this::id_break, var13);
            }

            if ((Boolean)var13.id_throws[27]) {
               this.id_package(var13);
               var11.remove();
               this.id_finally(var13);
            }
         }

         this.id_else = false;

         an_3 var15;
         while ((var15 = this.id_try.poll()) != null) {
            this.id_final(var15);
         }

         this.id_transient();
      }
   }

   private boolean id_class(xQ_2 var1) {
      xc_3 var2 = this.id_byte(var1.id_class());
      return var2.id_class(var1.id_break()) ? var2.id_class(this, var1.id_class(), var1.id_byte(), var1.id_protected()) : false;
   }

   public void id_class(rsC_2 var1, an_3 var2, rsn_3 var3) {
      var3.id_class(var1, var2);
   }

   public void id_class(long var1) {
      this.id_char.id_break(var1);
   }

   public boolean id_class(rjh_3 var1) {
      return this.id_throw(var1.id_int());
   }

   public void id_class(rfi_3 var1) {
      this.id_short.removeIf(var1x -> var1.id_break(var1x.id_class()));
   }

   private void id_class(Writer var1) throws IOException {
      ryT_2 var2 = ryT_2.id_class().id_class("x").id_class("y").id_class("z").id_class("type").id_class(var1);

      for (ryO_2 var4 : this.id_case) {
         rfH_2 var5 = var4.id_char();
         var2.id_class(new Object[]{var5.b_(), var5.c_(), var5.d_(), rVL.r.id_break(var4.id_void())});
      }
   }

   private static void id_class(Writer var0, Iterable<an_3> var1) throws IOException {
      ryT_2 var2 = ryT_2.id_class()
         .id_class("x")
         .id_class("y")
         .id_class("z")
         .id_class("uuid")
         .id_class("type")
         .id_class("alive")
         .id_class("display_name")
         .id_class("custom_name")
         .id_class(var0);

      for (an_3 var4 : var1) {
         rgP_2 var5 = var4.rD();
         rgP_2 var6 = var4.L_();
         var2.id_class(
            new Object[]{
               var4.rx(),
               var4.re(),
               var4.BO(),
               var4.ro(),
               rVL.id_transient.id_break(var4.BC()),
               var4.BM(),
               var6.getString(),
               var5 != null ? var5.getString() : null
            }
         );
      }
   }

   public void id_class(Path var1) throws IOException {
      rrEx_1 var2 = this.id_else().id_class;

      try (BufferedWriter var3 = Files.newBufferedWriter(var1.resolve("stats.txt"))) {
         var3.write(String.format("spawning_chunks: %d\n", var2.id_case().id_break()));
         rrEg_1 var4 = this.id_else().id_volatile();
         if (var4 != null) {
            ObjectIterator var5 = var4.id_break().object2IntEntrySet().iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var6 = (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry)var5.next();
               var3.write(String.format("spawn_count.%s: %d\n", ((aH_2)var6.getKey()).id_break(), var6.getIntValue()));
            }
         }

         var3.write(String.format("entities: %d\n", this.id_goto.size()));
         var3.write(String.format("block_entities: %d\n", this.id_case.size()));
         var3.write(String.format("block_ticks: %d\n", this.id_synchronized().id_break()));
         var3.write(String.format("fluid_ticks: %d\n", this.id_return().id_break()));
         var3.write("distance_manager: " + var2.id_case().id_byte() + "\n");
         var3.write(String.format("pending_tasks: %d\n", this.id_else().id_private()));
      }

      KY var20 = new KY("Level dump", new Exception("dummy"));
      this.id_class(var20);

      try (BufferedWriter var21 = Files.newBufferedWriter(var1.resolve("example_crash.txt"))) {
         var21.write(var20.id_protected());
      }

      Path var22 = var1.resolve("chunks.csv");

      try (BufferedWriter var23 = Files.newBufferedWriter(var22)) {
         var2.id_class(var23);
      }

      Path var24 = var1.resolve("entities.csv");

      try (BufferedWriter var25 = Files.newBufferedWriter(var24)) {
         id_class(var25, this.id_goto.values());
      }

      Path var26 = var1.resolve("block_entities.csv");

      try (BufferedWriter var7 = Files.newBufferedWriter(var26)) {
         this.id_class(var7);
      }
   }

   public void id_class(rrGb_1 var1) {
      this.id_const().id_abstract().h().id_class(var1);
   }

   public rrGb_1 id_class(String var1) {
      return (rrGb_1)this.id_const().id_abstract().h().id_break(() -> new rrGb_1(var1), var1);
   }

   public rfH_2 id_class(rYG var1, rfH_2 var2, int var3, int var4) {
      return this.id_else().id_implements().id_protected().id_class(var2.b_(), var2.c_(), var2.d_(), var3, var4, var1x -> var1x == var1, this.id_int, true);
   }

   public void id_class(rfH_2 var1, float var2) {
      rfj_3 var3 = new rfj_3(new rfH_2(this.id_new.id_class(), 0, this.id_new.id_byte()));
      this.id_new.id_class(var1, var2);
      this.id_else().id_break(rrEl_1.id_class, var3, 11, rqg_3.INSTANCE);
      this.id_else().id_class(rrEl_1.id_class, new rfj_3(var1), 11, rqg_3.INSTANCE);
      this.id_const().x().id_class(new rFj_1(var1, var2));
   }

   public boolean id_class(int var1, int var2, boolean var3) {
      rRc_1 var4 = (rRc_1)this.h().id_class(rRc_1::new, "chunks");
      rfj_3 var5 = new rfj_3(var1, var2);
      long var6 = var5.id_class();
      boolean var8;
      if (var3) {
         var8 = var4.id_class().add(var6);
         if (var8) {
            this.id_throws(var1, var2);
         }
      } else {
         var8 = var4.id_class().remove(var6);
      }

      var4.id_class(var8);
      if (var8) {
         this.id_else().id_class(var5, var3);
      }

      return var8;
   }

   public float id_class(rpr_3 var1, boolean var2) {
      return 1.0F;
   }

   public List<an_3> id_class(aI_2<?> var1, Predicate<? super an_3> var2) {
      ArrayList var3 = Lists.newArrayList();
      rrEN var4 = this.id_else();
      ObjectIterator var5 = this.id_goto.values().iterator();

      while (var5.hasNext()) {
         an_3 var6 = (an_3)var5.next();
         if ((var1 == null || var6.BC() == var1) && var4.id_case(rfU_2.id_byte(var6.rx()) >> 4, rfU_2.id_byte(var6.BO()) >> 4) && var2.test(var6)) {
            var3.add(var6);
         }
      }

      return var3;
   }

   private static <T> String id_class(Collection<T> var0, Function<T, rqO_2> var1) {
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

   public void id_class(int var1, int var2, boolean var3, boolean var4) {
      this.id_char.id_protected(var1);
      this.id_char.id_case(var2);
      this.id_char.id_throws(var2);
      this.id_char.id_class(var3);
      this.id_char.id_break(var4);
   }

   public void id_class(an_3 var1, an_3 var2) {
      if ((Boolean)var2.id_throws[27] || var2.ra() != var1) {
         var2.BH();
      } else if (var2 instanceof rhd_3 || this.id_else().id_class(var2)) {
         var2.id_native(var2.rx(), var2.re(), var2.BO());
         Float var9 = (Float)var2.id_throws[15];
         var2.id_throws[17] = var9;
         Float var10 = (Float)var2.id_throws[16];
         var2.id_throws[18] = var10;
         if ((Boolean)var2.id_throws[50]) {
            Integer var11 = (Integer)var2.id_throws[41] + 1;
            var2.id_throws[41] = var11;
            var2.A();
         }

         this.id_byte(var2);
         if ((Boolean)var2.id_throws[50]) {
            for (an_3 var4 : var2.Bh()) {
               this.id_class(var2, var4);
            }
         }
      }
   }

   public Stream<? extends rrrH<?>> id_class(rjh_3 var1, rrrZ<?> var2) {
      return this.id_protected().id_class(var1, var2);
   }

   public List<rhN_2> id_class(Predicate<? super rhN_2> var1) {
      ArrayList var2 = Lists.newArrayList();

      for (rhN_2 var4 : this.id_instanceof) {
         if (var1.test(var4)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public static void id_class(rrEm_1 var0) {
      rfH_2 var1 = id_this;
      int var2 = var1.b_();
      int var3 = var1.c_() - 2;
      int var4 = var1.d_();
      rfH_2.id_break(var2 - 2, var3 + 1, var4 - 2, var2 + 2, var3 + 3, var4 + 2).forEach(var1x -> var0.id_break(var1x, xu_3.id_class.id_continue()));
      rfH_2.id_break(var2 - 2, var3, var4 - 2, var2 + 2, var3, var4 + 2).forEach(var1x -> var0.id_break(var1x, xu_3.rg.id_continue()));
   }

   public void id_class(rhN_2 var1) {
      this.id_case(var1);
      this.id_byte((an_3)var1);
   }

   public void id_class(rpC_2 var1, boolean var2, boolean var3) {
      rrEN var4 = this.id_else();
      if (!var3) {
         if (var1 != null) {
            var1.id_break(new rgn_3("menu.savingLevel"));
         }

         this.m();
         if (var1 != null) {
            var1.id_protected(new rgn_3("menu.savingChunks"));
         }

         var4.id_class(var2);
      }
   }

   public boolean id_class(rhd_3 var1, rfH_2 var2) {
      return !this.id_interface.id_class(this, var2, var1) && this.id_instanceof().id_class(var2);
   }

   public void id_class(rhd_3 var1, an_3 var2, rqA_2 var3, rqL_2 var4, float var5, float var6) {
      this.id_interface
         .x()
         .id_class(var1, var2.rx(), var2.re(), var2.BO(), var5 > 1.0F ? (double)(16.0F * var5) : 16.0, this.E(), new rFX(var3, var4, var2, var5, var6));
   }

   public void id_class(rfH_2 var1, xd_3 var2, int var3, int var4) {
      this.id_short.add(new xQ_2(var1, var2, var3, var4));
   }

   public void id_class(int var1, rfH_2 var2, int var3) {
      for (rhN_2 var5 : this.id_interface.x().id_super()) {
         if (var5 != null && (rYB)var5.id_throws[7] == this && var5.V() != var1) {
            double var6 = (double)var2.b_() - var5.rx();
            double var8 = (double)var2.c_() - var5.re();
            double var10 = (double)var2.d_() - var5.BO();
            if (var6 * var6 + var8 * var8 + var10 * var10 < 1024.0) {
               var5.id_class.id_class(new rZf_1(var1, var2, var3));
            }
         }
      }
   }

   public void id_class(rhd_3 var1, double var2, double var4, double var6, rqA_2 var8, rqL_2 var9, float var10, float var11) {
      this.id_interface
         .x()
         .id_class(var1, var2, var4, var6, var10 > 1.0F ? (double)(16.0F * var10) : 16.0, this.E(), new rvt_3(var8, var9, var2, var4, var6, var10, var11));
   }

   public void id_class(roJ_2 var1) {
      this.id_implements.addAll(var1.id_volatile().values());
      ryI_2[] var2 = var1.id_final();
      int var3 = var2.length;

      for (int var4 = 0; var4 < var3; var4++) {
         for (an_3 var6 : var2[var4]) {
            if (!(var6 instanceof rhN_2)) {
               if (this.id_else) {
                  throw (IllegalStateException)rqR_2.id_byte(new IllegalStateException("Removing entity while ticking!"));
               }

               this.id_goto.remove(var6.V());
               this.id_finally(var6);
            }
         }
      }
   }

   private void id_class(rRD<rXs_1> var1) {
      rXE var2 = this.id_break(var1.id_class);
      if (var2.id_class() == var1.id_break()) {
         var2.id_class(this, var1.id_class);
      }
   }

   private void m() {
      if (this.id_strictfp != null) {
         this.id_interface.rB().id_break(this.id_strictfp.id_class());
      }

      this.id_else().id_extends().id_class();
   }

   public rrEs_1 k() {
      return this.id_return;
   }

   public boolean z() {
      return this.id_interface.rB().id_long().id_private();
   }

   private void u() {
      this.id_char.id_case(0);
      this.id_char.id_class(false);
      this.id_char.id_throws(0);
      this.id_char.id_break(false);
   }

   public String N() {
      return String.format(
         "players: %s, entities: %d [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.id_instanceof.size(),
         this.id_goto.size(),
         id_class(this.id_goto.values(), var0 -> rVL.id_transient.id_break(var0.BC())),
         this.id_catch.size(),
         id_class(this.id_catch, var0 -> rVL.r.id_break(var0.id_void())),
         this.id_synchronized().id_break(),
         this.id_return().id_break(),
         this.id_for()
      );
   }

   public an_3 id_break(int var1) {
      return (an_3)this.id_goto.get(var1);
   }

   private void id_break(rRD<xd_3> var1) {
      xc_3 var2 = this.id_byte(var1.id_class);
      if (var2.id_class((xd_3)var1.id_break())) {
         var2.id_class(this, var1.id_class, this.id_int);
      }
   }

   public int id_break(rjh_3 var1) {
      return this.d().id_class(var1);
   }

   public void id_break(boolean var1, boolean var2) {
      for (rrEq_1 var4 : this.id_const) {
         var4.id_class(this, var1, var2);
      }
   }

   public void id_break(an_3 var1) {
      if (!(var1 instanceof rhd_3) && !this.id_else().id_class(var1)) {
         this.id_byte(var1);
      } else {
         var1.id_native(var1.rx(), var1.re(), var1.BO());
         Float var8 = (Float)var1.id_throws[15];
         var1.id_throws[17] = var8;
         Float var9 = (Float)var1.id_throws[16];
         var1.id_throws[18] = var9;
         if ((Boolean)var1.id_throws[50]) {
            Integer var10 = (Integer)var1.id_throws[41] + 1;
            var1.id_throws[41] = var10;
            var1.id_this();
         }

         this.id_byte(var1);
         if ((Boolean)var1.id_throws[50]) {
            for (an_3 var3 : var1.Bh()) {
               this.id_class(var1, var3);
            }
         }
      }
   }

   public void id_break(rfH_2 var1, xc_3 var2, xc_3 var3) {
      Optional var4 = rRP.id_class(var2);
      Optional var5 = rRP.id_class(var3);
      if (!Objects.equals(var4, var5)) {
         rfH_2 var6 = var1.id_int();
         var4.ifPresent(var2x -> this.id_const().execute(() -> {
               this.d().id_class(var6);
               ruP_2.id_break(this, var6);
            }));
         var5.ifPresent(var2x -> this.id_const().execute(() -> {
               this.d().id_class(var6, var2x);
               ruP_2.id_class(this, var6);
            }));
      }
   }

   public an_3 id_break(UUID var1) {
      return this.id_while.get(var1);
   }

   public void id_break(int var1, rfH_2 var2, int var3) {
      this.id_interface.x().id_class(new rvw_3(var1, var2, var3, true));
   }

   public long id_break() {
      return this.id_interface.rB().id_long().id_class();
   }

   public void id_break(rhN_2 var1) {
      this.id_case(var1);
      this.id_byte((an_3)var1);
   }

   public void id_throws(rhN_2 var1) {
      var1.PD();
      this.id_extends(var1);
      this.id_private();
   }

   protected void id_throws() {
      if (this.id_transient) {
         long var1 = this.id_new.id_throws() + 1L;
         this.id_char.id_class(var1);
         this.id_char.id_else().id_class(this.id_interface, var1);
         if (this.id_new.id_finally().id_break(rRu_1.id_finally)) {
            this.id_class(this.id_new.id_case() + 1L);
         }
      }
   }

   public rRi_1 M() {
      return this.id_float;
   }

   public Iterable<an_3> W() {
      return Iterables.unmodifiableIterable(this.id_goto.values());
   }

   public void id_finally(an_3 var1) {
      if (var1 instanceof rSu_1) {
         for (rSm_1 var5 : ((rSu_1)var1).id_implements()) {
            var5.PD();
         }
      }

      this.id_while.remove(var1.ro());
      this.id_else().id_break(var1);
      if (var1 instanceof rhN_2 var6) {
         this.id_instanceof.remove(var6);
      }

      this.id_native().id_class(var1);
      if (var1 instanceof is_3) {
         this.id_import.remove(((is_3)var1).id_public());
      }
   }

   public void id_catch(an_3 var1) {
      boolean var2 = (Boolean)var1.id_throws[6];
      Boolean var7 = true;
      var1.id_throws[6] = var7;
      this.id_case(var1);
      Boolean var8 = var2;
      var1.id_throws[6] = var8;
      this.id_byte(var1);
   }

   public boolean G() {
      return this.id_synchronized;
   }

   public rrPt_1 O() {
      return this.id_interface.rP();
   }

   public void id_extends(an_3 var1) {
      if (this.id_else) {
         throw (IllegalStateException)rqR_2.id_byte(new IllegalStateException("Removing entity while ticking!"));
      } else {
         this.id_package(var1);
         this.id_goto.remove(var1.V());
         this.id_finally(var1);
      }
   }

   public boolean id_case() {
      return this.id_default;
   }

   private void id_case(rhN_2 var1) {
      an_3 var2 = this.id_while.get(var1.ro());
      if (var2 != null) {
         id_public.warn("Force-added player with duplicate UUID {}", var1.ro().toString());
         var2.K();
         this.id_throws((rhN_2)var2);
      }

      this.id_instanceof.add(var1);
      this.id_private();
      roC_2 var3 = this.id_class(rfU_2.id_byte(var1.rx() / 16.0), rfU_2.id_byte(var1.BO() / 16.0), roN_2.id_volatile, true);
      if (var3 instanceof roJ_2) {
         var3.id_class(var1);
      }

      this.id_final(var1);
   }

   public boolean id_case(an_3 var1) {
      return this.id_native(var1);
   }

   @Nonnull
   public rnW_2 id_const() {
      return this.id_interface;
   }

   public List<rhN_2> id_continue() {
      return this.id_instanceof;
   }

   public rrEN id_else() {
      return this.id_throw;
   }

   public rWB id_implements() {
      return this.id_interface.V();
   }

   public boolean id_implements(an_3 var1) {
      if (var1.Bu().anyMatch(this::id_volatile)) {
         return false;
      } else {
         this.id_class(var1);
         return true;
      }
   }

   protected rfH_2 id_instanceof(rfH_2 var1) {
      rfH_2 var2 = this.id_class(rKv_1.MOTION_BLOCKING, var1);
      rfl_3 var3 = new rfl_3(var2, new rfH_2(var2.b_(), this.id_try(), var2.d_())).id_class(3.0);
      List var4 = this.id_class(iB_2.class, var3, var1x -> var1x != null && var1x.BM() && this.id_case(var1x.Bs()));
      if (!var4.isEmpty()) {
         return ((iB_2)var4.get(this.id_int.nextInt(var4.size()))).Bs();
      } else {
         if (var2.c_() == -1) {
            var2 = var2.id_break(2);
         }

         return var2;
      }
   }

   public rVm_1 id_new() {
      return this.id_interface.rS();
   }

   private void id_package(an_3 var1) {
      roC_2 var2 = this.id_class((Integer)var1.id_throws[51], (Integer)var1.id_throws[53], roN_2.id_volatile, false);
      if (var2 instanceof roJ_2) {
         ((roJ_2)var2).id_break(var1);
      }
   }

   public rrEu_1<rXs_1> id_return() {
      return this.id_static;
   }

   public List<rSu_1> id_super() {
      ArrayList var1 = Lists.newArrayList();
      ObjectIterator var2 = this.id_goto.values().iterator();

      while (var2.hasNext()) {
         an_3 var3 = (an_3)var2.next();
         if (var3 instanceof rSu_1 && var3.BM()) {
            var1.add((rSu_1)var3);
         }
      }

      return var1;
   }

   public boolean id_throw(rfH_2 var1) {
      return this.id_byte(var1, 1);
   }

   public void id_protected(rhN_2 var1) {
      this.id_case(var1);
   }

   public rrrA id_protected() {
      return this.id_boolean;
   }

   public boolean id_private(an_3 var1) {
      if (this.id_volatile(var1)) {
         return false;
      } else {
         this.id_final(var1);
         return true;
      }
   }

   public void id_private() {
      this.id_abstract = false;
      if (!this.id_instanceof.isEmpty()) {
         int var1 = 0;
         int var2 = 0;

         for (rhN_2 var4 : this.id_instanceof) {
            if (var4.id_native()) {
               var1++;
            } else if (var4.Sc()) {
               var2++;
            }
         }

         this.id_abstract = var2 > 0 && var2 >= this.id_instanceof.size() - var1;
      }
   }

   public int id_final() {
      return ((rrGJ)this.id_const().id_abstract().h().id_class(rrGJ::new, "idcounts")).id_class();
   }

   private void id_final(an_3 var1) {
      if (this.id_else) {
         this.id_try.add(var1);
      } else {
         this.id_goto.put(var1.V(), var1);
         if (var1 instanceof rSu_1) {
            for (rSm_1 var5 : ((rSu_1)var1).id_implements()) {
               this.id_goto.put(var5.V(), var5);
            }
         }

         this.id_while.put(var1.ro(), var1);
         this.id_else().id_byte(var1);
         if (var1 instanceof is_3) {
            this.id_import.add(((is_3)var1).id_public());
         }
      }
   }

   private boolean id_volatile(an_3 var1) {
      UUID var2 = var1.ro();
      an_3 var3 = this.id_byte(var2);
      if (var3 == null) {
         return false;
      } else {
         id_public.warn(
            "Trying to add entity with duplicated UUID {}. Existing {}#{}, new: {}#{}",
            var2,
            aI_2.id_class(var3.BC()),
            var3.V(),
            aI_2.id_class(var1.BC()),
            var1.V()
         );
         return true;
      }
   }

   public void id_volatile() {
      this.id_long = 0;
   }

   public rrEu_1<xd_3> id_synchronized() {
      return this.id_void;
   }

   public rnG_2 id_native() {
      return this.id_interface.R();
   }

   private boolean id_native(an_3 var1) {
      if ((Boolean)var1.id_throws[27]) {
         id_public.warn("Tried to add entity {} but it was marked as removed already", aI_2.id_class(var1.BC()));
         return false;
      } else if (this.id_volatile(var1)) {
         return false;
      } else {
         roC_2 var2 = this.id_class(rfU_2.id_byte(var1.rx() / 16.0), rfU_2.id_byte(var1.BO() / 16.0), roN_2.id_volatile, (Boolean)var1.id_throws[6]);
         if (!(var2 instanceof roJ_2)) {
            return false;
         } else {
            var2.id_class(var1);
            this.id_final(var1);
            return true;
         }
      }
   }

   public rfH_2 X() {
      rfH_2 var1 = new rfH_2(this.id_new.id_class(), this.id_new.id_break(), this.id_new.id_byte());
      if (!this.id_instanceof().id_class(var1)) {
         var1 = this.id_class(rKv_1.MOTION_BLOCKING, new rfH_2(this.id_instanceof().id_class(), 0.0, this.id_instanceof().id_break()));
      }

      return var1;
   }

   public rKG Q() {
      return this.id_strictfp;
   }

   public boolean a_(an_3 var1) {
      return this.id_native(var1);
   }
}
