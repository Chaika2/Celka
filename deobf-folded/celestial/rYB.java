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
   protected static final Logger id_class = LogManager.getLogger();
   public static final Codec<rqM_2<rYB>> id_break = rqO_2.id_class.xmap(rqM_2.id_break(rVL.id_static), rqM_2::id_class);
   public static final rqM_2<rYB> id_byte = rqM_2.id_class(rVL.id_static, new rqO_2("overworld"));
   public static final rqM_2<rYB> id_protected = rqM_2.id_class(rVL.id_static, new rqO_2("the_nether"));
   public static final rqM_2<rYB> id_throws = rqM_2.id_class(rVL.id_static, new rqO_2("the_end"));
   private static final rpr_3[] id_this = rpr_3.values();
   public final List<ryO_2> id_case = Lists.newArrayList();
   public final List<ryO_2> id_catch = Lists.newArrayList();
   protected final List<ryO_2> id_private = Lists.newArrayList();
   protected final List<ryO_2> id_implements = Lists.newArrayList();
   private final Thread id_else;
   private final boolean id_synchronized;
   private int id_return;
   protected int id_finally = new Random().nextInt();
   protected final int id_extends = 1013904223;
   protected float id_native;
   protected float id_volatile;
   protected float id_final;
   protected float id_package;
   public final Random id_int = new Random();
   private final rRJ id_public;
   protected final rrGS id_new;
   public final boolean id_continue;
   protected boolean id_super;
   private final roE_2 id_goto;
   private final rYA id_while;
   private final rqM_2<rYB> id_try;

   public boolean id_boolean() {
      return !this.id_default().id_final() && !this.id_strictfp();
   }

   public void id_byte(int var1) {
   }

   public void id_byte(rfH_2 var1, xd_3 var2) {
      for (rpr_3 var4 : rpb_3.HORIZONTAL) {
         rfH_2 var5 = var1.id_break(var4);
         if (this.id_int(var5)) {
            xc_3 var6 = this.id_byte(var5);
            if (var6.id_class(xu_3.sL)) {
               var6.id_class(this, var5, var2, var1, false);
            } else if (var6.id_catch(this, var5)) {
               var5 = var5.id_break(var4);
               var6 = this.id_byte(var5);
               if (var6.id_class(xu_3.sL)) {
                  var6.id_class(this, var5, var2, var1, false);
               }
            }
         }
      }
   }

   @Override
   public xc_3 id_byte(rfH_2 var1) {
      if (id_super(var1)) {
         return xu_3.hG.id_continue();
      } else {
         roJ_2 var2 = this.id_throws(var1.b_() >> 4, var1.d_() >> 4);
         return var2.id_byte(var1);
      }
   }

   @Override
   public rRq_1 id_byte(int var1, int var2) {
      return this.id_class(var1, var2, roN_2.id_volatile, false);
   }

   public int id_byte(rfH_2 var1, rpr_3 var2) {
      xc_3 var3 = this.id_byte(var1);
      int var4 = var3.id_break(this, var1, var2);
      return var3.id_catch(this, var1) ? Math.max(var4, this.id_return(var1)) : var4;
   }

   public abstract rlQ_2 id_int();

   @Override
   public Random id_long() {
      return this.id_int;
   }

   public void id_double() {
      double var1 = 1.0 - (double)(this.id_private(1.0F) * 5.0F) / 16.0;
      double var3 = 1.0 - (double)(this.id_case(1.0F) * 5.0F) / 16.0;
      double var5 = 0.5 + 2.0 * rfU_2.id_class((double)rfU_2.id_break(this.id_protected(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.id_return = (int)((1.0 - var5 * var1 * var3) * 11.0);
   }

   protected rYB(rrGS var1, rqM_2<rYB> var2, rRJ var3, boolean var4, boolean var5, long var6) {
      this.id_new = var1;
      this.id_public = var3;
      this.id_try = var2;
      this.id_continue = var4;
      if (var3.id_case() != 1.0) {
         this.id_goto = new rYS(this, var3);
      } else {
         this.id_goto = new roE_2();
      }

      this.id_else = Thread.currentThread();
      this.id_while = new rYA(this, var6, var3.id_volatile());
      this.id_synchronized = var5;
   }

   public rRu_1 B() {
      return this.id_new.id_finally();
   }

   public boolean S() {
      return this.id_default().id_break() && !this.id_default().id_byte() ? (double)this.id_case(1.0F) > 0.9 : false;
   }

   public roJ_2 id_this(rfH_2 var1) {
      return this.id_throws(var1.b_() >> 4, var1.d_() >> 4);
   }

   public final boolean b() {
      return this.id_synchronized;
   }

   public boolean s() {
      return (double)this.id_private(1.0F) > 0.2;
   }

   public void id_class(rfH_2 var1, ryO_2 var2) {
      if (!id_super(var1) && var2 != null && !var2.id_long()) {
         if (this.id_super) {
            var2.id_break(this, var1);
            Iterator var3 = this.id_private.iterator();

            while (var3.hasNext()) {
               ryO_2 var4 = (ryO_2)var3.next();
               if (var4.id_char().equals(var1)) {
                  var4.aa_();
                  var3.remove();
               }
            }

            this.id_private.add(var2);
         } else {
            this.id_this(var1).id_class(var1, var2);
            this.id_class(var2);
         }
      }
   }

   public abstract void id_class(int var1, rfH_2 var2, int var3);

   @Override
   public ryO_2 id_class(rfH_2 var1) {
      if (id_super(var1)) {
         return null;
      } else if (!this.id_continue && Thread.currentThread() != this.id_else) {
         return null;
      } else {
         ryO_2 var2 = null;
         if (this.id_super) {
            var2 = this.id_throw(var1);
         }

         if (var2 == null) {
            var2 = this.id_this(var1).id_class(var1, rox_3.IMMEDIATE);
         }

         if (var2 == null) {
            var2 = this.id_throw(var1);
         }

         return var2;
      }
   }

   public Ko_1 id_class(KY var1) {
      Ko_1 var2 = var1.id_class("Affected level", 1);
      var2.id_class("All players", () -> this.id_continue().size() + " total; " + this.id_continue());
      var2.id_class("Chunk stats", this.id_goto()::id_byte);
      var2.id_class("Level dimension", () -> this.E().id_class().toString());

      try {
         this.id_new.id_class(var2);
      } catch (Throwable var4) {
         var2.id_class("Level Data Unobtainable", var4);
      }

      return var2;
   }

   public boolean id_class(rfH_2 var1, an_3 var2, rpr_3 var3) {
      if (id_super(var1)) {
         return false;
      } else {
         roC_2 var4 = this.id_class(var1.b_() >> 4, var1.d_() >> 4, roN_2.id_volatile, false);
         return var4 == null ? false : var4.id_byte(var1).id_class(this, var1, var2, var3);
      }
   }

   public void id_class(double var1, double var3, double var5, double var7, double var9, double var11, rcd_3 var13) {
   }

   public rRW id_class(an_3 var1, double var2, double var4, double var6, float var8, rRz_1 var9) {
      return this.id_class(var1, (rye_3)null, (rRQ)null, var2, var4, var6, var8, false, var9);
   }

   public void id_class(Consumer<an_3> var1, an_3 var2) {
      try {
         var1.accept(var2);
      } catch (Throwable var6) {
         KY var4 = KY.id_class(var6, "Ticking entity");
         Ko_1 var5 = var4.id_class("Entity being ticked");
         var2.id_class(var5);
         throw new KU(var4);
      }
   }

   public rRW id_class(an_3 var1, double var2, double var4, double var6, float var8, boolean var9, rRz_1 var10) {
      return this.id_class(var1, (rye_3)null, (rRQ)null, var2, var4, var6, var8, var9, var10);
   }

   public rRW id_class(an_3 var1, rye_3 var2, rRQ var3, double var4, double var6, double var8, float var10, boolean var11, rRz_1 var12) {
      rRW var13 = new rRW(this, var1, var2, var3, var4, var6, var8, var10, var11, var12);
      var13.id_class();
      var13.id_class(true);
      return var13;
   }

   public void id_class(Collection<ryO_2> var1) {
      if (this.id_super) {
         this.id_private.addAll(var1);
      } else {
         for (ryO_2 var3 : var1) {
            this.id_class(var3);
         }
      }
   }

   public List<an_3> id_class(an_3 var1, rfl_3 var2, Predicate<? super an_3> var3, Function<an_3, rjU_2> var4) {
      ArrayList var5 = Lists.newArrayList();
      int var6 = rfU_2.id_byte((var2.id_class - 2.0) / 16.0);
      int var7 = rfU_2.id_byte((var2.id_protected + 2.0) / 16.0);
      int var8 = rfU_2.id_byte((var2.id_byte - 2.0) / 16.0);
      int var9 = rfU_2.id_byte((var2.id_case + 2.0) / 16.0);
      roX_2 var10 = this.id_goto();

      for (int var11 = var6; var11 <= var7; var11++) {
         for (int var12 = var8; var12 <= var9; var12++) {
            roJ_2 var13 = var10.id_class(var11, var12, false);
            if (var13 != null) {
               var13.id_class(var1, var2, var5, var3, var4);
            }
         }
      }

      return var5;
   }

   public <T extends an_3> List<T> id_class(aI_2<T> var1, rfl_3 var2, Predicate<? super T> var3) {
      int var4 = rfU_2.id_byte((var2.id_class - 2.0) / 16.0);
      int var5 = rfU_2.id_throws((var2.id_protected + 2.0) / 16.0);
      int var6 = rfU_2.id_byte((var2.id_byte - 2.0) / 16.0);
      int var7 = rfU_2.id_throws((var2.id_case + 2.0) / 16.0);
      ArrayList var8 = Lists.newArrayList();

      for (int var9 = var4; var9 < var5; var9++) {
         for (int var10 = var6; var10 < var7; var10++) {
            roJ_2 var11 = this.id_goto().id_class(var9, var10, false);
            if (var11 != null) {
               var11.id_class(var1, var2, var8, var3);
            }
         }
      }

      return var8;
   }

   @Override
   public <T extends an_3> List<T> id_class(Class<? extends T> var1, rfl_3 var2, Predicate<? super T> var3) {
      int var4 = rfU_2.id_byte((var2.id_class - 2.0) / 16.0);
      int var5 = rfU_2.id_throws((var2.id_protected + 2.0) / 16.0);
      int var6 = rfU_2.id_byte((var2.id_byte - 2.0) / 16.0);
      int var7 = rfU_2.id_throws((var2.id_case + 2.0) / 16.0);
      ArrayList var8 = Lists.newArrayList();
      roX_2 var9 = this.id_goto();

      for (int var10 = var4; var10 < var5; var10++) {
         for (int var11 = var6; var11 < var7; var11++) {
            roJ_2 var12 = var9.id_class(var10, var11, false);
            if (var12 != null) {
               var12.id_class(var1, var2, var8, var3);
            }
         }
      }

      return var8;
   }

   public void id_class(rfH_2 var1, xd_3 var2, int var3, int var4) {
      this.id_byte(var1).id_class(this, var1, var3, var4);
   }

   public void id_class(an_3 var1, byte var2) {
   }

   public boolean id_class(rhd_3 var1, rfH_2 var2) {
      return true;
   }

   public boolean id_class(rfH_2 var1, an_3 var2) {
      return this.id_class(var1, var2, rpr_3.UP);
   }

   private static boolean id_class(int var0) {
      return var0 < -20000000 || var0 >= 20000000;
   }

   public void id_class(boolean var1, boolean var2) {
      this.id_goto().id_class(var1, var2);
   }

   public abstract void id_class(rrGb_1 var1);

   public abstract rrGb_1 id_class(String var1);

   @Override
   public int id_class(rKv_1 var1, int var2, int var3) {
      int var4;
      if (var2 >= -30000000 && var3 >= -30000000 && var2 < 30000000 && var3 < 30000000) {
         if (this.id_break(var2 >> 4, var3 >> 4)) {
            var4 = this.id_throws(var2 >> 4, var3 >> 4).id_class(var1, var2 & 15, var3 & 15) + 1;
         } else {
            var4 = 0;
         }
      } else {
         var4 = this.id_short() + 1;
      }

      return var4;
   }

   public void id_class(rfH_2 var1, xd_3 var2, rfH_2 var3) {
      if (!this.id_continue) {
         xc_3 var4 = this.id_byte(var1);

         try {
            var4.id_class(this, var1, var2, var3, false);
         } catch (Throwable var8) {
            KY var6 = KY.id_class(var8, "Exception while updating neighbours");
            Ko_1 var7 = var6.id_class("Block being updated");
            var7.id_class("Source block type", () -> {
               try {
                  return String.format("ID #%s (%s // %s)", rVL.id_strictfp.id_break(var2), var2.id_volatile(), var2.getClass().getCanonicalName());
               } catch (Throwable var2x) {
                  return "ID #" + rVL.id_strictfp.id_break(var2);
               }
            });
            Ko_1.id_class(var7, var1, var4);
            throw new KU(var6);
         }
      }
   }

   public void id_class(rfH_2 var1, xd_3 var2, rpr_3 var3) {
      if (var3 != rpr_3.WEST) {
         this.id_class(var1.id_byte(), var2, var1);
      }

      if (var3 != rpr_3.EAST) {
         this.id_class(var1.id_extends(), var2, var1);
      }

      if (var3 != rpr_3.DOWN) {
         this.id_class(var1.id_break(), var2, var1);
      }

      if (var3 != rpr_3.UP) {
         this.id_class(var1.id_final(), var2, var1);
      }

      if (var3 != rpr_3.NORTH) {
         this.id_class(var1.id_private(), var2, var1);
      }

      if (var3 != rpr_3.SOUTH) {
         this.id_class(var1.id_protected(), var2, var1);
      }
   }

   public void id_class(rfH_2 var1, xc_3 var2, xc_3 var3) {
   }

   @Override
   public rrse_3 id_class() {
      return this.id_goto().id_class();
   }

   @Override
   public roC_2 id_class(int var1, int var2, roN_2 var3, boolean var4) {
      roC_2 var5 = this.id_goto().id_break(var1, var2, var3, var4);
      if (var5 == null && var4) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return var5;
      }
   }

   public rfH_2 id_class(int var1, int var2, int var3, int var4) {
      this.id_finally = this.id_finally * 3 + 1013904223;
      int var5 = this.id_finally >> 2;
      return new rfH_2(var1 + (var5 & 15), var2 + (var5 >> 16 & var4), var3 + (var5 >> 8 & 15));
   }

   @Override
   public boolean id_class(rfH_2 var1, xc_3 var2, int var3) {
      return this.id_class(var1, var2, var3, 512);
   }

   @Override
   public boolean id_class(rfH_2 var1, xc_3 var2, int var3, int var4) {
      if (id_super(var1)) {
         return false;
      } else if (!this.id_continue && this.b()) {
         return false;
      } else {
         roJ_2 var5 = this.id_this(var1);
         xd_3 var6 = var2.id_break();
         xc_3 var7 = var5.id_class(var1, var2, (var3 & 64) != 0);
         if (var7 == null) {
            return false;
         } else {
            xc_3 var8 = this.id_byte(var1);
            if ((var3 & 128) == 0
               && var8 != var7
               && (
                  var8.id_break((rRq_1)this, var1) != var7.id_break((rRq_1)this, var1)
                     || var8.id_case() != var7.id_case()
                     || var8.id_throws()
                     || var7.id_throws()
               )) {
               this.id_goto().id_class().id_class(var1);
            }

            if (var8 == var2) {
               if (var7 != var8) {
                  this.id_class(var1, var7, var8);
               }

               if ((var3 & 2) != 0
                  && (!this.id_continue || (var3 & 4) == 0)
                  && (this.id_continue || var5.id_instanceof() != null && var5.id_instanceof().id_class(rrEJ.TICKING))) {
                  this.id_class(var1, var7, var2, var3);
               }

               if ((var3 & 1) != 0) {
                  this.id_class(var1, var7.id_break());
                  if (!this.id_continue && var2.id_finally()) {
                     this.id_byte(var1, var6);
                  }
               }

               if ((var3 & 16) == 0 && var4 > 0) {
                  int var9 = var3 & -34;
                  var7.id_break(this, var1, var9, var4 - 1);
                  var2.id_class((rRg_1)this, var1, var9, var4 - 1);
                  var2.id_break(this, var1, var9, var4 - 1);
               }

               this.id_break(var1, var7, var8);
            }

            return true;
         }
      }
   }

   @Override
   public boolean id_class(rfH_2 var1, boolean var2) {
      rXE var3 = this.id_break(var1);
      return this.id_class(var1, var3.id_catch(), 3 | (var2 ? 64 : 0));
   }

   @Override
   public boolean id_class(rfH_2 var1, boolean var2, an_3 var3, int var4) {
      xc_3 var5 = this.id_byte(var1);
      if (var5.id_catch()) {
         return false;
      } else {
         rXE var6 = this.id_break(var1);
         if (!(var5.id_break() instanceof Jj_1)) {
            this.id_byte(2001, var1, xd_3.id_finally(var5));
         }

         if (var2) {
            ryO_2 var7 = var5.id_break().id_protected() ? this.id_class(var1) : null;
            xd_3.id_class(var5, this, var1, var7, var3, rdn_3.id_break);
         }

         return this.id_class(var1, var6.id_catch(), 3, var4);
      }
   }

   public abstract void id_class(rfH_2 var1, xc_3 var2, xc_3 var3, int var4);

   public abstract void id_class(rhd_3 var1, an_3 var2, rqA_2 var3, rqL_2 var4, float var5, float var6);

   public void id_class(double var1, double var3, double var5, rqA_2 var7, rqL_2 var8, float var9, float var10, boolean var11) {
   }

   @Override
   public void id_class(rLx_1 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   @Override
   public boolean id_class(rfH_2 var1, Predicate<xc_3> var2) {
      return var2.test(this.id_byte(var1));
   }

   public void id_class(ruS_2<?> var1) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public void id_class(rhd_3 var1, rfH_2 var2, rqA_2 var3, rqL_2 var4, float var5, float var6) {
      this.id_class(var1, (double)var2.b_() + 0.5, (double)var2.c_() + 0.5, (double)var2.d_() + 0.5, var3, var4, var5, var6);
   }

   public boolean id_class(ryO_2 var1) {
      if (this.id_super) {
         id_class.error("Adding block entity while ticking: {} @ {}", new Supplier[]{() -> rVL.r.id_break(var1.id_void()), var1::id_char});
      }

      boolean var2 = this.id_case.add(var1);
      if (var2 && var1 instanceof rHf_1) {
         this.id_catch.add(var1);
      }

      if (this.id_continue) {
         rfH_2 var3 = var1.id_char();
         xc_3 var4 = this.id_byte(var3);
         this.id_class(var3, var4, var4, 2);
      }

      return var2;
   }

   public abstract void id_class(rhd_3 var1, double var2, double var4, double var6, rqA_2 var8, rqL_2 var9, float var10, float var11);

   public void id_class(rLx_1 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
   }

   @Override
   public rRJ id_default() {
      return this.id_public;
   }

   @Override
   public int id_short() {
      return 63;
   }

   @Override
   public void close() throws IOException {
      this.id_goto().close();
   }

   @Override
   public int id_void() {
      return this.id_return;
   }

   public long r() {
      return this.id_new.id_throws();
   }

   public void id_break(int var1, rfH_2 var2, int var3) {
   }

   @Override
   public List<an_3> id_break(an_3 var1, rfl_3 var2, Predicate<? super an_3> var3) {
      return this.id_class(var1, var2, var3, null);
   }

   public void id_break(rfH_2 var1, ryO_2 var2) {
      if (this.id_int(var1)) {
         this.id_this(var1).id_case();
      }
   }

   @Override
   public rXE id_break(rfH_2 var1) {
      if (id_super(var1)) {
         return rXG.id_class.id_private();
      } else {
         roJ_2 var2 = this.id_this(var1);
         return var2.id_break(var1);
      }
   }

   public abstract an_3 id_break(int var1);

   public void id_break(rLx_1 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   @Override
   public <T extends an_3> List<T> id_break(Class<? extends T> var1, rfl_3 var2, Predicate<? super T> var3) {
      int var4 = rfU_2.id_byte((var2.id_class - 2.0) / 16.0);
      int var5 = rfU_2.id_throws((var2.id_protected + 2.0) / 16.0);
      int var6 = rfU_2.id_byte((var2.id_byte - 2.0) / 16.0);
      int var7 = rfU_2.id_throws((var2.id_case + 2.0) / 16.0);
      ArrayList var8 = Lists.newArrayList();
      roX_2 var9 = this.id_goto();

      for (int var10 = var4; var10 < var5; var10++) {
         for (int var11 = var6; var11 < var7; var11++) {
            roJ_2 var12 = var9.id_protected(var10, var11);
            if (var12 != null) {
               var12.id_class(var1, var2, var8, var3);
            }
         }
      }

      return var8;
   }

   public void id_break(rLx_1 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
   }

   public boolean id_break(rfH_2 var1, xc_3 var2) {
      return this.id_class(var1, var2, 3);
   }

   public void id_break(rfH_2 var1, xc_3 var2, xc_3 var3) {
   }

   public void id_break(rfH_2 var1, xd_3 var2) {
      this.id_class(var1.id_byte(), var2, var1);
      this.id_class(var1.id_extends(), var2, var1);
      this.id_class(var1.id_break(), var2, var1);
      this.id_class(var1.id_final(), var2, var1);
      this.id_class(var1.id_private(), var2, var1);
      this.id_class(var1.id_protected(), var2, var1);
   }

   public boolean id_break(rfH_2 var1, rpr_3 var2) {
      return this.id_byte(var1, var2) > 0;
   }

   public roJ_2 id_throws(int var1, int var2) {
      return (roJ_2)this.id_class(var1, var2, roN_2.id_volatile);
   }

   public float id_throws(float var1) {
      float var2 = this.id_protected(var1);
      return var2 * (float) (Math.PI * 2);
   }

   @Override
   public rRh_1 id_throws(rfH_2 var1) {
      long var2 = 0L;
      float var4 = 0.0F;
      if (this.id_int(var1)) {
         var4 = this.id_interface();
         var2 = this.id_this(var1).id_this();
      }

      return new rRh_1(this.id_abstract(), this.P(), var2, var4);
   }

   public long P() {
      return this.id_new.id_case();
   }

   public void id_catch() {
   }

   public void id_catch(float var1) {
      this.id_final = var1;
      this.id_package = var1;
   }

   public boolean G() {
      return false;
   }

   public int id_goto(rfH_2 var1) {
      int var2 = 0;

      for (rpr_3 var6 : id_this) {
         int var7 = this.id_byte(var1.id_break(var6), var6);
         if (var7 >= 15) {
            return 15;
         }

         if (var7 > var2) {
            var2 = var7;
         }
      }

      return var2;
   }

   public float id_case(float var1) {
      return rfU_2.id_catch(var1, this.id_final, this.id_package) * this.id_private(var1);
   }

   public rnW_2 id_const() {
      return null;
   }

   public static boolean id_continue(rfH_2 var0) {
      return !id_class(var0.c_()) && id_instanceof(var0);
   }

   public void id_else(rfH_2 var1) {
      ryO_2 var2 = this.id_class(var1);
      if (var2 != null && this.id_super) {
         var2.aa_();
         this.id_private.remove(var2);
      } else {
         if (var2 != null) {
            this.id_private.remove(var2);
            this.id_case.remove(var2);
            this.id_catch.remove(var2);
         }

         this.id_this(var1).id_throws(var1);
      }
   }

   public String id_for() {
      return this.id_goto().id_byte();
   }

   public abstract rWB id_implements();

   public void id_implements(float var1) {
      this.id_native = var1;
      this.id_volatile = var1;
   }

   @Override
   public boolean id_import() {
      return this.id_continue;
   }

   @Override
   public roE_2 id_instanceof() {
      return this.id_goto;
   }

   private static boolean id_instanceof(rfH_2 var0) {
      return var0.b_() >= -30000000 && var0.d_() >= -30000000 && var0.b_() < 30000000 && var0.d_() < 30000000;
   }

   public static boolean id_new(rfH_2 var0) {
      return !id_super(var0) && id_instanceof(var0);
   }

   public abstract rns_3 id_package();

   public int id_return(rfH_2 var1) {
      int var2 = 0;
      var2 = Math.max(var2, this.id_class(var1.id_break(), rpr_3.DOWN));
      if (var2 >= 15) {
         return var2;
      } else {
         var2 = Math.max(var2, this.id_class(var1.id_final(), rpr_3.UP));
         if (var2 >= 15) {
            return var2;
         } else {
            var2 = Math.max(var2, this.id_class(var1.id_private(), rpr_3.NORTH));
            if (var2 >= 15) {
               return var2;
            } else {
               var2 = Math.max(var2, this.id_class(var1.id_protected(), rpr_3.SOUTH));
               if (var2 >= 15) {
                  return var2;
               } else {
                  var2 = Math.max(var2, this.id_class(var1.id_byte(), rpr_3.WEST));
                  if (var2 >= 15) {
                     return var2;
                  } else {
                     var2 = Math.max(var2, this.id_class(var1.id_extends(), rpr_3.EAST));
                     return var2 >= 15 ? var2 : var2;
                  }
               }
            }
         }
      }
   }

   public static boolean id_super(rfH_2 var0) {
      return id_protected(var0.c_());
   }

   protected void id_switch() {
      if (this.id_new.id_private()) {
         this.id_volatile = 1.0F;
         if (this.id_new.id_catch()) {
            this.id_package = 1.0F;
         }
      }
   }

   private ryO_2 id_throw(rfH_2 var1) {
      for (int var2 = 0; var2 < this.id_private.size(); var2++) {
         ryO_2 var3 = this.id_private.get(var2);
         if (!var3.id_long() && var3.id_char().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public boolean id_try(rfH_2 var1) {
      rYG var2 = this.id_implements(var1);
      return var2.id_protected();
   }

   public boolean id_while(rfH_2 var1) {
      if (!this.s()) {
         return false;
      } else if (!this.id_case(var1)) {
         return false;
      } else if (this.id_class(rKv_1.MOTION_BLOCKING, var1).c_() > var1.c_()) {
         return false;
      } else {
         rYG var2 = this.id_implements(var1);
         return var2.id_byte() == rYJ.RAIN && var2.id_class(var1) >= 0.15F;
      }
   }

   @Override
   public rYA id_static() {
      return this.id_while;
   }

   @Override
   public rrGs_1 id_public() {
      return this.id_new;
   }

   public boolean id_public(rfH_2 var1) {
      if (this.id_byte(var1.id_break(), rpr_3.DOWN) > 0) {
         return true;
      } else if (this.id_byte(var1.id_final(), rpr_3.UP) > 0) {
         return true;
      } else if (this.id_byte(var1.id_private(), rpr_3.NORTH) > 0) {
         return true;
      } else if (this.id_byte(var1.id_protected(), rpr_3.SOUTH) > 0) {
         return true;
      } else {
         return this.id_byte(var1.id_byte(), rpr_3.WEST) > 0 ? true : this.id_byte(var1.id_extends(), rpr_3.EAST) > 0;
      }
   }

   public static boolean id_protected(int var0) {
      return var0 < 0 || var0 >= 256;
   }

   public float id_private(float var1) {
      return rfU_2.id_catch(var1, this.id_native, this.id_volatile);
   }

   public abstract int id_final();

   public void id_transient() {
      if (!this.id_implements.isEmpty()) {
         this.id_catch.removeAll(this.id_implements);
         this.id_case.removeAll(this.id_implements);
         this.id_implements.clear();
      }

      this.id_super = true;
      Iterator var1 = this.id_catch.iterator();

      while (var1.hasNext()) {
         ryO_2 var2 = (ryO_2)var1.next();
         if (!var2.id_long() && var2.id_interface()) {
            rfH_2 var3 = var2.id_char();
            if (this.id_goto().id_class(var3) && this.id_instanceof().id_class(var3)) {
               try {
                  if (var2.id_void().id_class(this.id_byte(var3).id_break())) {
                     ((rHf_1)var2).id_throws();
                  } else {
                     var2.id_static();
                  }
               } catch (Throwable var7) {
                  KY var5 = KY.id_class(var7, "Ticking block entity");
                  Ko_1 var6 = var5.id_class("Block entity being ticked");
                  var2.id_class(var6);
                  throw new KU(var5);
               }
            }
         }

         if (var2.id_long()) {
            var1.remove();
            this.id_case.remove(var2);
            if (this.id_int(var2.id_char())) {
               this.id_this(var2.id_char()).id_throws(var2.id_char());
            }
         }
      }

      this.id_super = false;
      if (!this.id_private.isEmpty()) {
         for (int var8 = 0; var8 < this.id_private.size(); var8++) {
            ryO_2 var9 = this.id_private.get(var8);
            if (!var9.id_long()) {
               if (!this.id_case.contains(var9)) {
                  this.id_class(var9);
               }

               if (this.id_int(var9.id_char())) {
                  roJ_2 var4 = this.id_this(var9.id_char());
                  xc_3 var10 = var4.id_byte(var9.id_char());
                  var4.id_class(var9.id_char(), var9);
                  this.id_class(var9.id_char(), var10, var10, 3);
               }
            }
         }

         this.id_private.clear();
      }
   }

   public boolean id_synchronized(rfH_2 var1) {
      return id_super(var1) ? false : this.id_goto().id_case(var1.b_() >> 4, var1.d_() >> 4);
   }

   public boolean id_strictfp() {
      return !this.id_default().id_final() && this.id_return < 4;
   }

   public rqM_2<rYB> E() {
      return this.id_try;
   }
}
