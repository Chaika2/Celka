package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public abstract class rYB implements AutoCloseable, rRg_1 {
   protected static final Logger class_ = LogManager.getLogger();
   public static final Codec<rqM_2<rYB>> break_ = rqO_2.class_.xmap(rqM_2.break_(rVL.static_), rqM_2::class_);
   public static final rqM_2<rYB> byte_ = rqM_2.class_(rVL.static_, new rqO_2("overworld"));
   public static final rqM_2<rYB> protected_ = rqM_2.class_(rVL.static_, new rqO_2("the_nether"));
   public static final rqM_2<rYB> throws_ = rqM_2.class_(rVL.static_, new rqO_2("the_end"));
   private static final rpr_3[] this_ = rpr_3.values();
   public final List<ryO_2> case_ = Lists.newArrayList();
   public final List<ryO_2> catch_ = Lists.newArrayList();
   protected final List<ryO_2> private_ = Lists.newArrayList();
   protected final List<ryO_2> implements_ = Lists.newArrayList();
   private final Thread else_;
   private final boolean synchronized_;
   private int return_;
   protected int finally_ = new Random().nextInt();
   protected final int extends_ = 1013904223;
   protected float native_;
   protected float volatile_;
   protected float final_;
   protected float package_;
   public final Random int_ = new Random();
   private final rRJ public_;
   protected final rrGS new_;
   public final boolean continue_;
   protected boolean super_;
   private final roE_2 goto_;
   private final rYA while_;
   private final rqM_2<rYB> try_;

   public boolean boolean_() {
      return !this.default_().final_() && !this.strictfp_();
   }

   public void byte_(int var1) {
   }

   public void byte_(rfH_2 var1, xd_3 var2) {
      for (rpr_3 var4 : rpb_3.HORIZONTAL) {
         rfH_2 var5 = var1.break_(var4);
         if (this.int_(var5)) {
            xc_3 var6 = this.byte_(var5);
            if (var6.class_(xu_3.sL)) {
               var6.class_(this, var5, var2, var1, false);
            } else if (var6.catch_(this, var5)) {
               var5 = var5.break_(var4);
               var6 = this.byte_(var5);
               if (var6.class_(xu_3.sL)) {
                  var6.class_(this, var5, var2, var1, false);
               }
            }
         }
      }
   }

   @Override
   public xc_3 byte_(rfH_2 var1) {
      if (super_(var1)) {
         return xu_3.hG.continue_();
      } else {
         roJ_2 var2 = this.throws_(var1.b_() >> 4, var1.d_() >> 4);
         return var2.byte_(var1);
      }
   }

   @Override
   public rRq_1 byte_(int var1, int var2) {
      return this.class_(var1, var2, roN_2.volatile_, false);
   }

   public int byte_(rfH_2 var1, rpr_3 var2) {
      xc_3 var3 = this.byte_(var1);
      int var4 = var3.break_(this, var1, var2);
      return var3.catch_(this, var1) ? Math.max(var4, this.return_(var1)) : var4;
   }

   public abstract rlQ_2 int_();

   @Override
   public Random long_() {
      return this.int_;
   }

   public void double_() {
      double var1 = 1.0 - (double)(this.private_(1.0F) * 5.0F) / 16.0;
      double var3 = 1.0 - (double)(this.case_(1.0F) * 5.0F) / 16.0;
      double var5 = 0.5 + 2.0 * rfU_2.class_((double)rfU_2.break_(this.protected_(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.return_ = (int)((1.0 - var5 * var1 * var3) * 11.0);
   }

   protected rYB(rrGS var1, rqM_2<rYB> var2, rRJ var3, boolean var4, boolean var5, long var6) {
      this.new_ = var1;
      this.public_ = var3;
      this.try_ = var2;
      this.continue_ = var4;
      if (var3.case_() != 1.0) {
         this.goto_ = new rYS(this, var3);
      } else {
         this.goto_ = new roE_2();
      }

      this.else_ = Thread.currentThread();
      this.while_ = new rYA(this, var6, var3.volatile_());
      this.synchronized_ = var5;
   }

   public rRu_1 B() {
      return this.new_.finally_();
   }

   public boolean S() {
      return this.default_().break_() && !this.default_().byte_() ? (double)this.case_(1.0F) > 0.9 : false;
   }

   public roJ_2 this_(rfH_2 var1) {
      return this.throws_(var1.b_() >> 4, var1.d_() >> 4);
   }

   public final boolean b() {
      return this.synchronized_;
   }

   public boolean s() {
      return (double)this.private_(1.0F) > 0.2;
   }

   public void class_(rfH_2 var1, ryO_2 var2) {
      if (!super_(var1) && var2 != null && !var2.long_()) {
         if (this.super_) {
            var2.break_(this, var1);
            Iterator var3 = this.private_.iterator();

            while (var3.hasNext()) {
               ryO_2 var4 = (ryO_2)var3.next();
               if (var4.char_().equals(var1)) {
                  var4.aa_();
                  var3.remove();
               }
            }

            this.private_.add(var2);
         } else {
            this.this_(var1).class_(var1, var2);
            this.class_(var2);
         }
      }
   }

   public abstract void class_(int var1, rfH_2 var2, int var3);

   @Override
   public ryO_2 class_(rfH_2 var1) {
      if (super_(var1)) {
         return null;
      } else if (!this.continue_ && Thread.currentThread() != this.else_) {
         return null;
      } else {
         ryO_2 var2 = null;
         if (this.super_) {
            var2 = this.throw_(var1);
         }

         if (var2 == null) {
            var2 = this.this_(var1).class_(var1, rox_3.IMMEDIATE);
         }

         if (var2 == null) {
            var2 = this.throw_(var1);
         }

         return var2;
      }
   }

   public Ko_1 class_(KY var1) {
      Ko_1 var2 = var1.class_("Affected level", 1);
      var2.class_("All players", () -> this.continue_().size() + " total; " + this.continue_());
      var2.class_("Chunk stats", this.goto_()::byte_);
      var2.class_("Level dimension", () -> this.E().class_().toString());

      try {
         this.new_.class_(var2);
      } catch (Throwable var4) {
         var2.class_("Level Data Unobtainable", var4);
      }

      return var2;
   }

   public boolean class_(rfH_2 var1, an_3 var2, rpr_3 var3) {
      if (super_(var1)) {
         return false;
      } else {
         roC_2 var4 = this.class_(var1.b_() >> 4, var1.d_() >> 4, roN_2.volatile_, false);
         return var4 == null ? false : var4.byte_(var1).class_(this, var1, var2, var3);
      }
   }

   public void class_(double var1, double var3, double var5, double var7, double var9, double var11, rcd_3 var13) {
   }

   public rRW class_(an_3 var1, double var2, double var4, double var6, float var8, rRz_1 var9) {
      return this.class_(var1, (rye_3)null, (rRQ)null, var2, var4, var6, var8, false, var9);
   }

   public void class_(Consumer<an_3> var1, an_3 var2) {
      try {
         var1.accept(var2);
      } catch (Throwable var6) {
         KY var4 = KY.class_(var6, "Ticking entity");
         Ko_1 var5 = var4.class_("Entity being ticked");
         var2.class_(var5);
         throw new KU(var4);
      }
   }

   public rRW class_(an_3 var1, double var2, double var4, double var6, float var8, boolean var9, rRz_1 var10) {
      return this.class_(var1, (rye_3)null, (rRQ)null, var2, var4, var6, var8, var9, var10);
   }

   public rRW class_(an_3 var1, rye_3 var2, rRQ var3, double var4, double var6, double var8, float var10, boolean var11, rRz_1 var12) {
      rRW var13 = new rRW(this, var1, var2, var3, var4, var6, var8, var10, var11, var12);
      var13.class_();
      var13.class_(true);
      return var13;
   }

   public void class_(Collection<ryO_2> var1) {
      if (this.super_) {
         this.private_.addAll(var1);
      } else {
         for (ryO_2 var3 : var1) {
            this.class_(var3);
         }
      }
   }

   public List<an_3> class_(an_3 var1, rfl_3 var2, Predicate<? super an_3> var3, Function<an_3, rjU_2> var4) {
      ArrayList var5 = Lists.newArrayList();
      int var6 = rfU_2.byte_((var2.class_ - 2.0) / 16.0);
      int var7 = rfU_2.byte_((var2.protected_ + 2.0) / 16.0);
      int var8 = rfU_2.byte_((var2.byte_ - 2.0) / 16.0);
      int var9 = rfU_2.byte_((var2.case_ + 2.0) / 16.0);
      roX_2 var10 = this.goto_();

      for (int var11 = var6; var11 <= var7; var11++) {
         for (int var12 = var8; var12 <= var9; var12++) {
            roJ_2 var13 = var10.class_(var11, var12, false);
            if (var13 != null) {
               var13.class_(var1, var2, var5, var3, var4);
            }
         }
      }

      return var5;
   }

   public <T extends an_3> List<T> class_(aI_2<T> var1, rfl_3 var2, Predicate<? super T> var3) {
      int var4 = rfU_2.byte_((var2.class_ - 2.0) / 16.0);
      int var5 = rfU_2.throws_((var2.protected_ + 2.0) / 16.0);
      int var6 = rfU_2.byte_((var2.byte_ - 2.0) / 16.0);
      int var7 = rfU_2.throws_((var2.case_ + 2.0) / 16.0);
      ArrayList var8 = Lists.newArrayList();

      for (int var9 = var4; var9 < var5; var9++) {
         for (int var10 = var6; var10 < var7; var10++) {
            roJ_2 var11 = this.goto_().class_(var9, var10, false);
            if (var11 != null) {
               var11.class_(var1, var2, var8, var3);
            }
         }
      }

      return var8;
   }

   @Override
   public <T extends an_3> List<T> class_(Class<? extends T> var1, rfl_3 var2, Predicate<? super T> var3) {
      int var4 = rfU_2.byte_((var2.class_ - 2.0) / 16.0);
      int var5 = rfU_2.throws_((var2.protected_ + 2.0) / 16.0);
      int var6 = rfU_2.byte_((var2.byte_ - 2.0) / 16.0);
      int var7 = rfU_2.throws_((var2.case_ + 2.0) / 16.0);
      ArrayList var8 = Lists.newArrayList();
      roX_2 var9 = this.goto_();

      for (int var10 = var4; var10 < var5; var10++) {
         for (int var11 = var6; var11 < var7; var11++) {
            roJ_2 var12 = var9.class_(var10, var11, false);
            if (var12 != null) {
               var12.class_(var1, var2, var8, var3);
            }
         }
      }

      return var8;
   }

   public void class_(rfH_2 var1, xd_3 var2, int var3, int var4) {
      this.byte_(var1).class_(this, var1, var3, var4);
   }

   public void class_(an_3 var1, byte var2) {
   }

   public boolean class_(rhd_3 var1, rfH_2 var2) {
      return true;
   }

   public boolean class_(rfH_2 var1, an_3 var2) {
      return this.class_(var1, var2, rpr_3.UP);
   }

   private static boolean class_(int var0) {
      return var0 < -20000000 || var0 >= 20000000;
   }

   public void class_(boolean var1, boolean var2) {
      this.goto_().class_(var1, var2);
   }

   public abstract void class_(rrGb_1 var1);

   public abstract rrGb_1 class_(String var1);

   @Override
   public int class_(rKv_1 var1, int var2, int var3) {
      int var4;
      if (var2 >= -30000000 && var3 >= -30000000 && var2 < 30000000 && var3 < 30000000) {
         if (this.break_(var2 >> 4, var3 >> 4)) {
            var4 = this.throws_(var2 >> 4, var3 >> 4).class_(var1, var2 & 15, var3 & 15) + 1;
         } else {
            var4 = 0;
         }
      } else {
         var4 = this.short_() + 1;
      }

      return var4;
   }

   public void class_(rfH_2 var1, xd_3 var2, rfH_2 var3) {
      if (!this.continue_) {
         xc_3 var4 = this.byte_(var1);

         try {
            var4.class_(this, var1, var2, var3, false);
         } catch (Throwable var8) {
            KY var6 = KY.class_(var8, "Exception while updating neighbours");
            Ko_1 var7 = var6.class_("Block being updated");
            var7.class_("Source block type", () -> {
               try {
                  return String.format("ID #%s (%s // %s)", rVL.strictfp_.break_(var2), var2.volatile_(), var2.getClass().getCanonicalName());
               } catch (Throwable var2x) {
                  return "ID #" + rVL.strictfp_.break_(var2);
               }
            });
            Ko_1.class_(var7, var1, var4);
            throw new KU(var6);
         }
      }
   }

   public void class_(rfH_2 var1, xd_3 var2, rpr_3 var3) {
      if (var3 != rpr_3.WEST) {
         this.class_(var1.byte_(), var2, var1);
      }

      if (var3 != rpr_3.EAST) {
         this.class_(var1.extends_(), var2, var1);
      }

      if (var3 != rpr_3.DOWN) {
         this.class_(var1.break_(), var2, var1);
      }

      if (var3 != rpr_3.UP) {
         this.class_(var1.final_(), var2, var1);
      }

      if (var3 != rpr_3.NORTH) {
         this.class_(var1.private_(), var2, var1);
      }

      if (var3 != rpr_3.SOUTH) {
         this.class_(var1.protected_(), var2, var1);
      }
   }

   public void class_(rfH_2 var1, xc_3 var2, xc_3 var3) {
   }

   @Override
   public rrse_3 class_() {
      return this.goto_().class_();
   }

   @Override
   public roC_2 class_(int var1, int var2, roN_2 var3, boolean var4) {
      roC_2 var5 = this.goto_().break_(var1, var2, var3, var4);
      if (var5 == null && var4) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return var5;
      }
   }

   public rfH_2 class_(int var1, int var2, int var3, int var4) {
      this.finally_ = this.finally_ * 3 + 1013904223;
      int var5 = this.finally_ >> 2;
      return new rfH_2(var1 + (var5 & 15), var2 + (var5 >> 16 & var4), var3 + (var5 >> 8 & 15));
   }

   @Override
   public boolean class_(rfH_2 var1, xc_3 var2, int var3) {
      return this.class_(var1, var2, var3, 512);
   }

   @Override
   public boolean class_(rfH_2 var1, xc_3 var2, int var3, int var4) {
      if (super_(var1)) {
         return false;
      } else if (!this.continue_ && this.b()) {
         return false;
      } else {
         roJ_2 var5 = this.this_(var1);
         xd_3 var6 = var2.break_();
         xc_3 var7 = var5.class_(var1, var2, (var3 & 64) != 0);
         if (var7 == null) {
            return false;
         } else {
            xc_3 var8 = this.byte_(var1);
            if ((var3 & 128) == 0
               && var8 != var7
               && (var8.break_((rRq_1)this, var1) != var7.break_((rRq_1)this, var1) || var8.case_() != var7.case_() || var8.throws_() || var7.throws_())) {
               this.goto_().class_().class_(var1);
            }

            if (var8 == var2) {
               if (var7 != var8) {
                  this.class_(var1, var7, var8);
               }

               if ((var3 & 2) != 0
                  && (!this.continue_ || (var3 & 4) == 0)
                  && (this.continue_ || var5.instanceof_() != null && var5.instanceof_().class_(rrEJ.TICKING))) {
                  this.class_(var1, var7, var2, var3);
               }

               if ((var3 & 1) != 0) {
                  this.class_(var1, var7.break_());
                  if (!this.continue_ && var2.finally_()) {
                     this.byte_(var1, var6);
                  }
               }

               if ((var3 & 16) == 0 && var4 > 0) {
                  int var9 = var3 & -34;
                  var7.break_(this, var1, var9, var4 - 1);
                  var2.class_((rRg_1)this, var1, var9, var4 - 1);
                  var2.break_(this, var1, var9, var4 - 1);
               }

               this.break_(var1, var7, var8);
            }

            return true;
         }
      }
   }

   @Override
   public boolean class_(rfH_2 var1, boolean var2) {
      rXE var3 = this.break_(var1);
      return this.class_(var1, var3.catch_(), 3 | (var2 ? 64 : 0));
   }

   @Override
   public boolean class_(rfH_2 var1, boolean var2, an_3 var3, int var4) {
      xc_3 var5 = this.byte_(var1);
      if (var5.catch_()) {
         return false;
      } else {
         rXE var6 = this.break_(var1);
         if (!(var5.break_() instanceof Jj_1)) {
            this.byte_(2001, var1, xd_3.finally_(var5));
         }

         if (var2) {
            ryO_2 var7 = var5.break_().protected_() ? this.class_(var1) : null;
            xd_3.class_(var5, this, var1, var7, var3, rdn_3.break_);
         }

         return this.class_(var1, var6.catch_(), 3, var4);
      }
   }

   public abstract void class_(rfH_2 var1, xc_3 var2, xc_3 var3, int var4);

   public abstract void class_(rhd_3 var1, an_3 var2, rqA_2 var3, rqL_2 var4, float var5, float var6);

   public void class_(double var1, double var3, double var5, rqA_2 var7, rqL_2 var8, float var9, float var10, boolean var11) {
   }

   @Override
   public void class_(rLx_1 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   @Override
   public boolean class_(rfH_2 var1, Predicate<xc_3> var2) {
      return var2.test(this.byte_(var1));
   }

   public void class_(ruS_2<?> var1) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public void class_(rhd_3 var1, rfH_2 var2, rqA_2 var3, rqL_2 var4, float var5, float var6) {
      this.class_(var1, (double)var2.b_() + 0.5, (double)var2.c_() + 0.5, (double)var2.d_() + 0.5, var3, var4, var5, var6);
   }

   public boolean class_(ryO_2 var1) {
      if (this.super_) {
         class_.error("Adding block entity while ticking: {} @ {}", new Supplier[]{() -> rVL.r.break_(var1.void_()), var1::char_});
      }

      boolean var2 = this.case_.add(var1);
      if (var2 && var1 instanceof rHf_1) {
         this.catch_.add(var1);
      }

      if (this.continue_) {
         rfH_2 var3 = var1.char_();
         xc_3 var4 = this.byte_(var3);
         this.class_(var3, var4, var4, 2);
      }

      return var2;
   }

   public abstract void class_(rhd_3 var1, double var2, double var4, double var6, rqA_2 var8, rqL_2 var9, float var10, float var11);

   public void class_(rLx_1 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
   }

   @Override
   public rRJ default_() {
      return this.public_;
   }

   @Override
   public int short_() {
      return 63;
   }

   @Override
   public void close() throws IOException {
      this.goto_().close();
   }

   @Override
   public int void_() {
      return this.return_;
   }

   public long r() {
      return this.new_.throws_();
   }

   public void break_(int var1, rfH_2 var2, int var3) {
   }

   @Override
   public List<an_3> break_(an_3 var1, rfl_3 var2, Predicate<? super an_3> var3) {
      return this.class_(var1, var2, var3, null);
   }

   public void break_(rfH_2 var1, ryO_2 var2) {
      if (this.int_(var1)) {
         this.this_(var1).case_();
      }
   }

   @Override
   public rXE break_(rfH_2 var1) {
      if (super_(var1)) {
         return rXG.class_.private_();
      } else {
         roJ_2 var2 = this.this_(var1);
         return var2.break_(var1);
      }
   }

   public abstract an_3 break_(int var1);

   public void break_(rLx_1 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   @Override
   public <T extends an_3> List<T> break_(Class<? extends T> var1, rfl_3 var2, Predicate<? super T> var3) {
      int var4 = rfU_2.byte_((var2.class_ - 2.0) / 16.0);
      int var5 = rfU_2.throws_((var2.protected_ + 2.0) / 16.0);
      int var6 = rfU_2.byte_((var2.byte_ - 2.0) / 16.0);
      int var7 = rfU_2.throws_((var2.case_ + 2.0) / 16.0);
      ArrayList var8 = Lists.newArrayList();
      roX_2 var9 = this.goto_();

      for (int var10 = var4; var10 < var5; var10++) {
         for (int var11 = var6; var11 < var7; var11++) {
            roJ_2 var12 = var9.protected_(var10, var11);
            if (var12 != null) {
               var12.class_(var1, var2, var8, var3);
            }
         }
      }

      return var8;
   }

   public void break_(rLx_1 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
   }

   public boolean break_(rfH_2 var1, xc_3 var2) {
      return this.class_(var1, var2, 3);
   }

   public void break_(rfH_2 var1, xc_3 var2, xc_3 var3) {
   }

   public void break_(rfH_2 var1, xd_3 var2) {
      this.class_(var1.byte_(), var2, var1);
      this.class_(var1.extends_(), var2, var1);
      this.class_(var1.break_(), var2, var1);
      this.class_(var1.final_(), var2, var1);
      this.class_(var1.private_(), var2, var1);
      this.class_(var1.protected_(), var2, var1);
   }

   public boolean break_(rfH_2 var1, rpr_3 var2) {
      return this.byte_(var1, var2) > 0;
   }

   public roJ_2 throws_(int var1, int var2) {
      return (roJ_2)this.class_(var1, var2, roN_2.volatile_);
   }

   public float throws_(float var1) {
      float var2 = this.protected_(var1);
      return var2 * (float) (Math.PI * 2);
   }

   @Override
   public rRh_1 throws_(rfH_2 var1) {
      long var2 = 0L;
      float var4 = 0.0F;
      if (this.int_(var1)) {
         var4 = this.interface_();
         var2 = this.this_(var1).this_();
      }

      return new rRh_1(this.abstract_(), this.P(), var2, var4);
   }

   public long P() {
      return this.new_.case_();
   }

   public void catch_() {
   }

   public void catch_(float var1) {
      this.final_ = var1;
      this.package_ = var1;
   }

   public boolean G() {
      return false;
   }

   public int goto_(rfH_2 var1) {
      int var2 = 0;

      for (rpr_3 var6 : this_) {
         int var7 = this.byte_(var1.break_(var6), var6);
         if (var7 >= 15) {
            return 15;
         }

         if (var7 > var2) {
            var2 = var7;
         }
      }

      return var2;
   }

   public float case_(float var1) {
      return rfU_2.catch_(var1, this.final_, this.package_) * this.private_(var1);
   }

   public rnW_2 const_() {
      return null;
   }

   public static boolean continue_(rfH_2 var0) {
      return !class_(var0.c_()) && instanceof_(var0);
   }

   public void else_(rfH_2 var1) {
      ryO_2 var2 = this.class_(var1);
      if (var2 != null && this.super_) {
         var2.aa_();
         this.private_.remove(var2);
      } else {
         if (var2 != null) {
            this.private_.remove(var2);
            this.case_.remove(var2);
            this.catch_.remove(var2);
         }

         this.this_(var1).throws_(var1);
      }
   }

   public String for_() {
      return this.goto_().byte_();
   }

   public abstract rWB implements_();

   public void implements_(float var1) {
      this.native_ = var1;
      this.volatile_ = var1;
   }

   @Override
   public boolean import_() {
      return this.continue_;
   }

   @Override
   public roE_2 instanceof_() {
      return this.goto_;
   }

   private static boolean instanceof_(rfH_2 var0) {
      return var0.b_() >= -30000000 && var0.d_() >= -30000000 && var0.b_() < 30000000 && var0.d_() < 30000000;
   }

   public static boolean new_(rfH_2 var0) {
      return !super_(var0) && instanceof_(var0);
   }

   public abstract rns_3 package_();

   public int return_(rfH_2 var1) {
      int var2 = 0;
      var2 = Math.max(var2, this.class_(var1.break_(), rpr_3.DOWN));
      if (var2 >= 15) {
         return var2;
      } else {
         var2 = Math.max(var2, this.class_(var1.final_(), rpr_3.UP));
         if (var2 >= 15) {
            return var2;
         } else {
            var2 = Math.max(var2, this.class_(var1.private_(), rpr_3.NORTH));
            if (var2 >= 15) {
               return var2;
            } else {
               var2 = Math.max(var2, this.class_(var1.protected_(), rpr_3.SOUTH));
               if (var2 >= 15) {
                  return var2;
               } else {
                  var2 = Math.max(var2, this.class_(var1.byte_(), rpr_3.WEST));
                  if (var2 >= 15) {
                     return var2;
                  } else {
                     var2 = Math.max(var2, this.class_(var1.extends_(), rpr_3.EAST));
                     return var2 >= 15 ? var2 : var2;
                  }
               }
            }
         }
      }
   }

   public static boolean super_(rfH_2 var0) {
      return protected_(var0.c_());
   }

   protected void switch_() {
      if (this.new_.private_()) {
         this.volatile_ = 1.0F;
         if (this.new_.catch_()) {
            this.package_ = 1.0F;
         }
      }
   }

   private ryO_2 throw_(rfH_2 var1) {
      for (int var2 = 0; var2 < this.private_.size(); var2++) {
         ryO_2 var3 = this.private_.get(var2);
         if (!var3.long_() && var3.char_().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public boolean try_(rfH_2 var1) {
      rYG var2 = this.implements_(var1);
      return var2.protected_();
   }

   public boolean while_(rfH_2 var1) {
      if (!this.s()) {
         return false;
      } else if (!this.case_(var1)) {
         return false;
      } else if (this.class_(rKv_1.MOTION_BLOCKING, var1).c_() > var1.c_()) {
         return false;
      } else {
         rYG var2 = this.implements_(var1);
         return var2.byte_() == rYJ.RAIN && var2.class_(var1) >= 0.15F;
      }
   }

   @Override
   public rYA static_() {
      return this.while_;
   }

   @Override
   public rrGs_1 public_() {
      return this.new_;
   }

   public boolean public_(rfH_2 var1) {
      if (this.byte_(var1.break_(), rpr_3.DOWN) > 0) {
         return true;
      } else if (this.byte_(var1.final_(), rpr_3.UP) > 0) {
         return true;
      } else if (this.byte_(var1.private_(), rpr_3.NORTH) > 0) {
         return true;
      } else if (this.byte_(var1.protected_(), rpr_3.SOUTH) > 0) {
         return true;
      } else {
         return this.byte_(var1.byte_(), rpr_3.WEST) > 0 ? true : this.byte_(var1.extends_(), rpr_3.EAST) > 0;
      }
   }

   public static boolean protected_(int var0) {
      return var0 < 0 || var0 >= 256;
   }

   public float private_(float var1) {
      return rfU_2.catch_(var1, this.native_, this.volatile_);
   }

   public abstract int final_();

   public void transient_() {
      if (!this.implements_.isEmpty()) {
         this.catch_.removeAll(this.implements_);
         this.case_.removeAll(this.implements_);
         this.implements_.clear();
      }

      this.super_ = true;
      Iterator var1 = this.catch_.iterator();

      while (var1.hasNext()) {
         ryO_2 var2 = (ryO_2)var1.next();
         if (!var2.long_() && var2.interface_()) {
            rfH_2 var3 = var2.char_();
            if (this.goto_().class_(var3) && this.instanceof_().class_(var3)) {
               try {
                  if (var2.void_().class_(this.byte_(var3).break_())) {
                     ((rHf_1)var2).throws_();
                  } else {
                     var2.static_();
                  }
               } catch (Throwable var7) {
                  KY var5 = KY.class_(var7, "Ticking block entity");
                  Ko_1 var6 = var5.class_("Block entity being ticked");
                  var2.class_(var6);
                  throw new KU(var5);
               }
            }
         }

         if (var2.long_()) {
            var1.remove();
            this.case_.remove(var2);
            if (this.int_(var2.char_())) {
               this.this_(var2.char_()).throws_(var2.char_());
            }
         }
      }

      this.super_ = false;
      if (!this.private_.isEmpty()) {
         for (int var8 = 0; var8 < this.private_.size(); var8++) {
            ryO_2 var9 = this.private_.get(var8);
            if (!var9.long_()) {
               if (!this.case_.contains(var9)) {
                  this.class_(var9);
               }

               if (this.int_(var9.char_())) {
                  roJ_2 var4 = this.this_(var9.char_());
                  xc_3 var10 = var4.byte_(var9.char_());
                  var4.class_(var9.char_(), var9);
                  this.class_(var9.char_(), var10, var10, 3);
               }
            }
         }

         this.private_.clear();
      }
   }

   public boolean synchronized_(rfH_2 var1) {
      return super_(var1) ? false : this.goto_().case_(var1.b_() >> 4, var1.d_() >> 4);
   }

   public boolean strictfp_() {
      return !this.default_().final_() && this.return_ < 4;
   }

   public rqM_2<rYB> E() {
      return this.try_;
   }
}
