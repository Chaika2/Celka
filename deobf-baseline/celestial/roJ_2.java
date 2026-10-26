package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class roJ_2 implements roC_2 {
   private static final Logger id_break = LogManager.getLogger();
   public static final roQ_2 id_class = null;
   private final roQ_2[] id_byte = new roQ_2[16];
   private rYZ id_protected;
   private final Map<rfH_2, rcd_3> id_throws = Maps.newHashMap();
   private boolean id_case;
   private final rYB id_catch;
   private final Map<rKv_1, rKZ> id_private = Maps.newEnumMap(rKv_1.class);
   private final rVh_1 id_implements;
   private final Map<rfH_2, ryO_2> id_finally = Maps.newHashMap();
   private final ryI_2<an_3>[] id_extends;
   private final Map<rrrZ<?>, rrrH<?>> id_native = Maps.newHashMap();
   private final Map<rrrZ<?>, LongSet> id_volatile = Maps.newHashMap();
   private final ShortList[] id_final = new ShortList[16];
   private rRV<xd_3> id_package;
   private rRV<rXs_1> id_int;
   private boolean id_new;
   private long id_continue;
   private volatile boolean id_super;
   private long id_this;
   private Supplier<rrEJ> id_else;
   private Consumer<roJ_2> id_synchronized;
   private final rfj_3 id_return;
   private volatile boolean id_public;

   @Override
   public xc_3 id_byte(rfH_2 var1) {
      int var2 = var1.b_();
      int var3 = var1.c_();
      int var4 = var1.d_();
      if (this.id_catch.b()) {
         xc_3 var9 = null;
         if (var3 == 60) {
            var9 = xu_3.Ec.id_continue();
         }

         if (var3 == 70) {
            var9 = rKk_1.id_break(var2, var4);
         }

         return var9 == null ? xu_3.id_class.id_continue() : var9;
      } else {
         try {
            if (var3 >= 0 && var3 >> 4 < this.id_byte.length) {
               roQ_2 var5 = this.id_byte[var3 >> 4];
               if (!roQ_2.id_class(var5)) {
                  return var5.id_class(var2 & 15, var3 & 15, var4 & 15);
               }
            }

            return xu_3.id_class.id_continue();
         } catch (Throwable var8) {
            KY var6 = KY.id_class(var8, "Getting block state");
            Ko_1 var7 = var6.id_class("Block being got");
            var7.id_class("Location", () -> Ko_1.id_class(var2, var3, var4));
            throw new KU(var6);
         }
      }
   }

   public void id_byte(boolean var1) {
      this.id_new = var1;
   }

   @Override
   public roQ_2[] id_byte() {
      return this.id_byte;
   }

   @Override
   public rRV<xd_3> id_int() {
      return this.id_package;
   }

   public roJ_2(rYB var1, rfj_3 var2, rYZ var3, rVh_1 var4, rRV<xd_3> var5, rRV<rXs_1> var6, long var7, roQ_2[] var9, Consumer<roJ_2> var10) {
      this.id_extends = new ryI_2[16];
      this.id_catch = var1;
      this.id_return = var2;
      this.id_implements = var4;

      for (rKv_1 var14 : rKv_1.values()) {
         if (roN_2.id_volatile.id_private().contains(var14)) {
            this.id_private.put(var14, new rKZ(this, var14));
         }
      }

      for (int var15 = 0; var15 < this.id_extends.length; var15++) {
         this.id_extends[var15] = new ryI_2<>(an_3.class);
      }

      this.id_protected = var3;
      this.id_package = var5;
      this.id_int = var6;
      this.id_this = var7;
      this.id_synchronized = var10;
      if (var9 != null) {
         if (this.id_byte.length == var9.length) {
            System.arraycopy(var9, 0, this.id_byte, 0, this.id_byte.length);
         } else {
            id_break.warn("Could not set level chunk sections, array length is {} instead of {}", var9.length, this.id_byte.length);
         }
      }
   }

   public roJ_2(rYB var1, rok_3 var2) {
      this(
         var1,
         var2.id_private(),
         var2.id_implements(),
         var2.id_synchronized(),
         var2.id_finally(),
         var2.id_extends(),
         var2.id_this(),
         var2.id_byte(),
         (Consumer<roJ_2>)null
      );

      for (rcd_3 var4 : var2.id_case()) {
         aI_2.id_class(var4, var1, var1x -> {
            this.id_class(var1x);
            return var1x;
         });
      }

      for (ryO_2 var8 : var2.id_throws().values()) {
         this.id_class(var8);
      }

      this.id_throws.putAll(var2.id_volatile());

      for (int var6 = 0; var6 < var2.id_return().length; var6++) {
         this.id_final[var6] = var2.id_return()[var6];
      }

      this.id_break(var2.id_super());
      this.id_class(var2.id_class());

      for (Entry var9 : var2.id_native()) {
         if (roN_2.id_volatile.id_private().contains(var9.getKey())) {
            this.id_class((rKv_1)var9.getKey()).id_class(((rKZ)var9.getValue()).id_class());
         }
      }

      this.id_protected(var2.id_throw());
      this.id_super = true;
   }

   public roJ_2(rYB var1, rfj_3 var2, rYZ var3) {
      this(var1, var2, var3, rVh_1.id_class, rRd_1.id_class(), rRd_1.id_class(), 0L, (roQ_2[])null, (Consumer<roJ_2>)null);
   }

   @Override
   public long id_this() {
      return this.id_this;
   }

   public rXE id_class(int var1, int var2, int var3) {
      try {
         if (var2 >= 0 && var2 >> 4 < this.id_byte.length) {
            roQ_2 var4 = this.id_byte[var2 >> 4];
            if (!roQ_2.id_class(var4)) {
               return var4.id_break(var1 & 15, var2 & 15, var3 & 15);
            }
         }

         return rXG.id_class.id_private();
      } catch (Throwable var7) {
         KY var5 = KY.id_class(var7, "Getting fluid state");
         Ko_1 var6 = var5.id_class("Block being got");
         var6.id_class("Location", () -> Ko_1.id_class(var1, var2, var3));
         throw new KU(var5);
      }
   }

   @Override
   public void id_class(long var1) {
      this.id_continue = var1;
   }

   @Override
   public rrrH<?> id_class(rrrZ<?> var1) {
      return this.id_native.get(var1);
   }

   @Override
   public void id_class(rrrZ<?> var1, rrrH<?> var2) {
      this.id_native.put(var1, var2);
   }

   public <T extends an_3> void id_class(Class<? extends T> var1, rfl_3 var2, List<T> var3, Predicate<? super T> var4) {
      int var5 = rfU_2.id_byte((var2.id_break - 2.0) / 16.0);
      int var6 = rfU_2.id_byte((var2.id_throws + 2.0) / 16.0);
      var5 = rfU_2.id_class(var5, 0, this.id_extends.length - 1);
      var6 = rfU_2.id_class(var6, 0, this.id_extends.length - 1);

      for (int var7 = var5; var7 <= var6; var7++) {
         for (an_3 var9 : this.id_extends[var7].id_class(var1)) {
            if (var9.rN().id_byte(var2) && (var4 == null || var4.test(var9))) {
               var3.add(var9);
            }
         }
      }
   }

   public void id_class(rYZ var1, ruu_3 var2, rcd_3 var3, int var4) {
      boolean var5 = var1 != null;
      Predicate var6 = var5 ? var0 -> true : var1x -> (var4 & 1 << (var1x.c_() >> 4)) != 0;
      Sets.newHashSet(this.id_finally.keySet()).stream().filter(var6).forEach(this.id_catch::id_else);

      for (int var7 = 0; var7 < this.id_byte.length; var7++) {
         roQ_2 var8 = this.id_byte[var7];
         if ((var4 & 1 << var7) == 0) {
            if (var5 && var8 != id_class) {
               this.id_byte[var7] = id_class;
            }
         } else {
            if (var8 == id_class) {
               var8 = new roQ_2(var7 << 4);
               this.id_byte[var7] = var8;
            }

            var8.id_class(var2);
         }
      }

      if (var1 != null) {
         this.id_protected = var1;
      }

      for (rKv_1 var10 : rKv_1.values()) {
         String var11 = var10.id_break();
         if (var3.id_byte(var11, 12)) {
            this.id_class(var10, var3.id_package(var11));
         }
      }

      for (ryO_2 var15 : this.id_finally.values()) {
         var15.id_float();
      }
   }

   public void id_class(boolean var1) {
      this.id_case = var1;
   }

   @Override
   public xc_3 id_class(rfH_2 var1, xc_3 var2, boolean var3) {
      int var4 = var1.b_() & 15;
      int var5 = var1.c_();
      int var6 = var1.d_() & 15;
      roQ_2 var7 = this.id_byte[var5 >> 4];
      if (var7 == id_class) {
         if (var2.id_catch()) {
            return null;
         }

         var7 = new roQ_2(var5 >> 4 << 4);
         this.id_byte[var5 >> 4] = var7;
      }

      boolean var8 = var7.id_byte();
      xc_3 var9 = var7.id_class(var4, var5 & 15, var6, var2);
      if (var9 == var2) {
         return null;
      } else {
         xd_3 var10 = var2.id_break();
         xd_3 var11 = var9.id_break();
         this.id_private.get(rKv_1.MOTION_BLOCKING).id_class(var4, var5, var6, var2);
         this.id_private.get(rKv_1.MOTION_BLOCKING_NO_LEAVES).id_class(var4, var5, var6, var2);
         this.id_private.get(rKv_1.OCEAN_FLOOR).id_class(var4, var5, var6, var2);
         this.id_private.get(rKv_1.WORLD_SURFACE).id_class(var4, var5, var6, var2);
         boolean var12 = var7.id_byte();
         if (var8 != var12) {
            this.id_catch.id_goto().id_class().id_class(var1, var12);
         }

         if (!this.id_catch.id_continue) {
            var9.id_break(this.id_catch, var1, var2, var3);
         } else if (var11 != var10 && var11 instanceof kx_3) {
            this.id_catch.id_else(var1);
         }

         if (!var7.id_class(var4, var5 & 15, var6).id_class(var10)) {
            return null;
         } else {
            if (var11 instanceof kx_3) {
               ryO_2 var13 = this.id_class(var1, rox_3.CHECK);
               if (var13 != null) {
                  var13.id_float();
               }
            }

            if (!this.id_catch.id_continue) {
               var2.id_class(this.id_catch, var1, var9, var3);
            }

            if (var10 instanceof kx_3) {
               ryO_2 var14 = this.id_class(var1, rox_3.CHECK);
               if (var14 == null) {
                  var14 = ((kx_3)var10).id_class(this.id_catch);
                  this.id_catch.id_class(var1, var14);
               } else {
                  var14.id_float();
               }
            }

            this.id_super = true;
            return var9;
         }
      }
   }

   public void id_class(rrEm_1 var1) {
      if (this.id_package == rRd_1.id_class()) {
         this.id_package = new rRe_1<>(rVL.id_strictfp::id_break, var1.id_synchronized().id_class(this.id_return, true, false), var1.r());
         this.id_break(true);
      }

      if (this.id_int == rRd_1.id_class()) {
         this.id_int = new rRe_1<>(rVL.id_default::id_break, var1.id_return().id_class(this.id_return, true, false), var1.r());
         this.id_break(true);
      }
   }

   public void id_class(Supplier<rrEJ> var1) {
      this.id_else = var1;
   }

   @Override
   public rKZ id_class(rKv_1 var1) {
      return this.id_private.computeIfAbsent(var1, var1x -> new rKZ(this, var1x));
   }

   @Override
   public void id_class(rrrZ<?> var1, long var2) {
      this.id_volatile.computeIfAbsent(var1, var0 -> new LongOpenHashSet()).add(var2);
   }

   @Override
   public Map<rrrZ<?>, LongSet> id_class() {
      return this.id_volatile;
   }

   @Override
   public void id_class(Map<rrrZ<?>, LongSet> var1) {
      this.id_volatile.clear();
      this.id_volatile.putAll(var1);
   }

   private ryO_2 id_class(rfH_2 var1, rcd_3 var2) {
      xc_3 var3 = this.id_byte(var1);
      ryO_2 var4;
      if ("DUMMY".equals(var2.id_native("id"))) {
         xd_3 var5 = var3.id_break();
         if (var5 instanceof kx_3) {
            var4 = ((kx_3)var5).id_class(this.id_catch);
         } else {
            var4 = null;
            id_break.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", var1, var3);
         }
      } else {
         var4 = ryO_2.id_break(var3, var2);
      }

      if (var4 != null) {
         var4.id_break(this.id_catch, var1);
         this.id_class(var4);
      } else {
         id_break.warn("Tried to load a block entity for block {} but failed at location {}", var3, var1);
      }

      return var4;
   }

   @Override
   public ryO_2 id_class(rfH_2 var1) {
      return this.id_class(var1, rox_3.CHECK);
   }

   public ryO_2 id_class(rfH_2 var1, rox_3 var2) {
      ryO_2 var3 = this.id_finally.get(var1);
      if (var3 == null) {
         rcd_3 var4 = this.id_throws.remove(var1);
         if (var4 != null) {
            ryO_2 var5 = this.id_class(var1, var4);
            if (var5 != null) {
               return var5;
            }
         }
      }

      if (var3 == null) {
         if (var2 == rox_3.IMMEDIATE) {
            var3 = this.id_implements(var1);
            this.id_catch.id_class(var1, var3);
         }
      } else if (var3.id_long()) {
         this.id_finally.remove(var1);
         return null;
      }

      return var3;
   }

   public void id_class(ryO_2 var1) {
      this.id_class(var1.id_char(), var1);
      if (this.id_case || this.id_catch.id_import()) {
         this.id_catch.id_class(var1.id_char(), var1);
      }
   }

   @Override
   public void id_class(rfH_2 var1, ryO_2 var2) {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnb_3.id_class(var2)).id_byte()) {
         if (this.id_byte(var1).id_break() instanceof kx_3) {
            var2.id_break(this.id_catch, var1);
            var2.id_int();
            ryO_2 var3 = this.id_finally.put(var1.id_int(), var2);
            if (var3 != null && var3 != var2) {
               var3.aa_();
            }
         }
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      this.id_throws.put(new rfH_2(var1.id_private("x"), var1.id_private("y"), var1.id_private("z")), var1);
   }

   @Override
   public void id_class(an_3 var1) {
      this.id_new = true;
      int var2 = rfU_2.id_byte(var1.rx() / 16.0);
      int var3 = rfU_2.id_byte(var1.BO() / 16.0);
      if (var2 != this.id_return.id_break || var3 != this.id_return.id_byte) {
         id_break.warn("Wrong location! ({}, {}) should be ({}, {}), {}", var2, var3, this.id_return.id_break, this.id_return.id_byte, var1);
         Boolean var9 = true;
         var1.id_throws[27] = var9;
      }

      int var4 = rfU_2.id_byte(var1.re() / 16.0);
      if (var4 < 0) {
         var4 = 0;
      }

      if (var4 >= this.id_extends.length) {
         var4 = this.id_extends.length - 1;
      }

      Boolean var10 = true;
      var1.id_throws[50] = var10;
      Integer var11 = this.id_return.id_break;
      var1.id_throws[51] = var11;
      Integer var12 = var4;
      var1.id_throws[52] = var12;
      Integer var13 = this.id_return.id_byte;
      var1.id_throws[53] = var13;
      this.id_extends[var4].add(var1);
   }

   @Override
   public void id_class(rKv_1 var1, long[] var2) {
      this.id_private.get(var1).id_class(var2);
   }

   public void id_class(an_3 var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 >= this.id_extends.length) {
         var2 = this.id_extends.length - 1;
      }

      this.id_extends[var2].remove(var1);
   }

   @Override
   public int id_class(rKv_1 var1, int var2, int var3) {
      return this.id_private.get(var1).id_class(var2 & 15, var3 & 15) - 1;
   }

   public void id_class(an_3 var1, rfl_3 var2, List<an_3> var3, Predicate<? super an_3> var4, Function<an_3, rjU_2> var5) {
      int var6 = rfU_2.id_byte((var2.id_break - 2.0) / 16.0);
      int var7 = rfU_2.id_byte((var2.id_throws + 2.0) / 16.0);
      var6 = rfU_2.id_class(var6, 0, this.id_extends.length - 1);
      var7 = rfU_2.id_class(var7, 0, this.id_extends.length - 1);

      for (int var8 = var6; var8 <= var7; var8++) {
         ryI_2 var9 = this.id_extends[var8];
         List var10 = var9.id_class();
         int var11 = var10.size();

         for (int var12 = 0; var12 < var11; var12++) {
            an_3 var13 = (an_3)var10.get(var12);
            rfl_3 var14 = var13.rN();
            if (var5 != null) {
               rjU_2 var15 = (rjU_2)var5.apply(var13);
               if (var15 != null) {
                  var14 = var14.id_private(var15.id_break, var15.id_byte, var15.id_protected);
               }
            }

            if (var14.id_byte(var2) && var13 != var1) {
               if (var4 == null || var4.test(var13)) {
                  var3.add(var13);
               }

               if (var13 instanceof rSu_1) {
                  for (rSm_1 var18 : ((rSu_1)var13).id_implements()) {
                     if (var18 != var1 && var18.rN().id_byte(var2) && (var4 == null || var4.test(var18))) {
                        var3.add(var18);
                     }
                  }
               }
            }
         }
      }
   }

   public <T extends an_3> void id_class(aI_2<?> var1, rfl_3 var2, List<? super T> var3, Predicate<? super T> var4) {
      int var5 = rfU_2.id_byte((var2.id_break - 2.0) / 16.0);
      int var6 = rfU_2.id_byte((var2.id_throws + 2.0) / 16.0);
      var5 = rfU_2.id_class(var5, 0, this.id_extends.length - 1);
      var6 = rfU_2.id_class(var6, 0, this.id_extends.length - 1);

      for (int var7 = var5; var7 <= var6; var7++) {
         for (an_3 var9 : this.id_extends[var7].id_class(an_3.class)) {
            if ((var1 == null || var9.BC() == var1) && var9.rN().id_byte(var2) && var4.test(var9)) {
               var3.add(var9);
            }
         }
      }
   }

   @Override
   public void id_break(Map<rrrZ<?>, rrrH<?>> var1) {
      this.id_native.clear();
      this.id_native.putAll(var1);
   }

   @Override
   public LongSet id_break(rrrZ<?> var1) {
      return this.id_volatile.computeIfAbsent(var1, var0 -> new LongOpenHashSet());
   }

   @Override
   public Set<rfH_2> id_break() {
      HashSet var1 = Sets.newHashSet(this.id_throws.keySet());
      var1.addAll(this.id_finally.keySet());
      return var1;
   }

   @Override
   public void id_break(long var1) {
      this.id_this = var1;
   }

   @Override
   public rXE id_break(rfH_2 var1) {
      return this.id_class(var1.b_(), var1.c_(), var1.d_());
   }

   public void id_break(an_3 var1) {
      this.id_class(var1, (Integer)var1.id_throws[52]);
   }

   @Override
   public void id_break(boolean var1) {
      this.id_super = var1;
   }

   public void id_throws() {
      if (this.id_synchronized != null) {
         this.id_synchronized.accept(this);
         this.id_synchronized = null;
      }
   }

   @Override
   public void id_throws(rfH_2 var1) {
      if (this.id_case || this.id_catch.id_import()) {
         ryO_2 var2 = this.id_finally.remove(var1);
         if (var2 != null) {
            var2.aa_();
         }
      }
   }

   public boolean id_finally() {
      return this.id_case;
   }

   public boolean id_catch() {
      return false;
   }

   public rYB id_extends() {
      return this.id_catch;
   }

   @Override
   public roN_2 id_goto() {
      return roN_2.id_volatile;
   }

   @Override
   public rcd_3 id_case(rfH_2 var1) {
      return this.id_throws.get(var1);
   }

   public void id_case() {
      this.id_super = true;
   }

   @Override
   public boolean id_continue() {
      return this.id_super || this.id_new && this.id_catch.r() != this.id_continue;
   }

   public void id_else() {
      rfj_3 var1 = this.id_private();

      for (int var2 = 0; var2 < this.id_final.length; var2++) {
         if (this.id_final[var2] != null) {
            ShortListIterator var3 = this.id_final[var2].iterator();

            while (var3.hasNext()) {
               Short var4 = (Short)var3.next();
               rfH_2 var5 = rok_3.id_class(var4, var2, var1);
               xc_3 var6 = this.id_byte(var5);
               xc_3 var7 = xd_3.id_break(var6, this.id_catch, var5);
               this.id_catch.id_class(var5, var7, 20);
            }

            this.id_final[var2].clear();
         }
      }

      this.id_public();

      for (rfH_2 var9 : Sets.newHashSet(this.id_throws.keySet())) {
         this.id_class(var9);
      }

      this.id_throws.clear();
      this.id_implements.id_class(this);
   }

   @Override
   public rYZ id_implements() {
      return this.id_protected;
   }

   private ryO_2 id_implements(rfH_2 var1) {
      xc_3 var2 = this.id_byte(var1);
      xd_3 var3 = var2.id_break();
      return !var3.id_protected() ? null : ((kx_3)var3).id_class(this.id_catch);
   }

   public rrEJ id_instanceof() {
      return this.id_else == null ? rrEJ.BORDER : this.id_else.get();
   }

   @Override
   public rRV<rXs_1> id_new() {
      return this.id_int;
   }

   @Override
   public Stream<rfH_2> id_package() {
      return StreamSupport.stream(
            rfH_2.id_break(this.id_return.id_break(), 0, this.id_return.id_byte(), this.id_return.id_protected(), 255, this.id_return.id_throws())
               .spliterator(),
            false
         )
         .filter(var1 -> this.id_byte(var1).id_case() != 0);
   }

   @Override
   public ShortList[] id_return() {
      return this.id_final;
   }

   @Override
   public Map<rrrZ<?>, rrrH<?>> id_super() {
      return this.id_native;
   }

   @Override
   public boolean id_throw() {
      return this.id_public;
   }

   public void id_public() {
      if (this.id_package instanceof roW_2) {
         ((roW_2)this.id_package).id_class(this.id_catch.id_finally(), var1 -> this.id_byte(var1).id_break());
         this.id_package = rRd_1.id_class();
      } else if (this.id_package instanceof rRe_1) {
         ((rRe_1)this.id_package).id_class(this.id_catch.id_finally());
         this.id_package = rRd_1.id_class();
      }

      if (this.id_int instanceof roW_2) {
         ((roW_2)this.id_int).id_class(this.id_catch.id_extends(), var1 -> this.id_break(var1).id_class());
         this.id_int = rRd_1.id_class();
      } else if (this.id_int instanceof rRe_1) {
         ((rRe_1)this.id_int).id_class(this.id_catch.id_extends());
         this.id_int = rRd_1.id_class();
      }
   }

   @Override
   public rcd_3 id_protected(rfH_2 var1) {
      ryO_2 var2 = this.id_class(var1);
      if (var2 != null && !var2.id_long()) {
         rcd_3 var4 = var2.id_class(new rcd_3());
         var4.id_class("keepPacked", false);
         return var4;
      } else {
         rcd_3 var3 = this.id_throws.get(var1);
         if (var3 != null) {
            var3 = var3.id_catch();
            var3.id_class("keepPacked", true);
         }

         return var3;
      }
   }

   public rrse_3 id_protected() {
      return this.id_catch.id_goto().id_class();
   }

   @Override
   public void id_protected(boolean var1) {
      this.id_public = var1;
      this.id_break(true);
   }

   @Override
   public rfj_3 id_private() {
      return this.id_return;
   }

   public ryI_2<an_3>[] id_final() {
      return this.id_extends;
   }

   public Map<rfH_2, ryO_2> id_volatile() {
      return this.id_finally;
   }

   @Override
   public rVh_1 id_synchronized() {
      return this.id_implements;
   }

   @Override
   public Collection<Entry<rKv_1, rKZ>> id_native() {
      return Collections.unmodifiableSet(this.id_private.entrySet());
   }
}
