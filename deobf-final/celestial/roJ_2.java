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
   private static final Logger break_ = LogManager.getLogger();
   public static final roQ_2 class_ = null;
   private final roQ_2[] byte_ = new roQ_2[16];
   private rYZ protected_;
   private final Map<rfH_2, rcd_3> throws_ = Maps.newHashMap();
   private boolean case_;
   private final rYB catch_;
   private final Map<rKv_1, rKZ> private_ = Maps.newEnumMap(rKv_1.class);
   private final rVh_1 implements_;
   private final Map<rfH_2, ryO_2> finally_ = Maps.newHashMap();
   private final ryI_2<an_3>[] extends_;
   private final Map<rrrZ<?>, rrrH<?>> native_ = Maps.newHashMap();
   private final Map<rrrZ<?>, LongSet> volatile_ = Maps.newHashMap();
   private final ShortList[] final_ = new ShortList[16];
   private rRV<xd_3> package_;
   private rRV<rXs_1> int_;
   private boolean new_;
   private long continue_;
   private volatile boolean super_;
   private long this_;
   private Supplier<rrEJ> else_;
   private Consumer<roJ_2> synchronized_;
   private final rfj_3 return_;
   private volatile boolean public_;

   @Override
   public xc_3 byte_(rfH_2 var1) {
      int var2 = var1.b_();
      int var3 = var1.c_();
      int var4 = var1.d_();
      if (this.catch_.b()) {
         xc_3 var9 = null;
         if (var3 == 60) {
            var9 = xu_3.Ec.continue_();
         }

         if (var3 == 70) {
            var9 = rKk_1.break_(var2, var4);
         }

         return var9 == null ? xu_3.class_.continue_() : var9;
      } else {
         try {
            if (var3 >= 0 && var3 >> 4 < this.byte_.length) {
               roQ_2 var5 = this.byte_[var3 >> 4];
               if (!roQ_2.class_(var5)) {
                  return var5.class_(var2 & 15, var3 & 15, var4 & 15);
               }
            }

            return xu_3.class_.continue_();
         } catch (Throwable var8) {
            KY var6 = KY.class_(var8, "Getting block state");
            Ko_1 var7 = var6.class_("Block being got");
            var7.class_("Location", () -> Ko_1.class_(var2, var3, var4));
            throw new KU(var6);
         }
      }
   }

   public void byte_(boolean var1) {
      this.new_ = var1;
   }

   @Override
   public roQ_2[] byte_() {
      return this.byte_;
   }

   @Override
   public rRV<xd_3> int_() {
      return this.package_;
   }

   public roJ_2(rYB var1, rfj_3 var2, rYZ var3, rVh_1 var4, rRV<xd_3> var5, rRV<rXs_1> var6, long var7, roQ_2[] var9, Consumer<roJ_2> var10) {
      this.extends_ = new ryI_2[16];
      this.catch_ = var1;
      this.return_ = var2;
      this.implements_ = var4;

      for (rKv_1 var14 : rKv_1.values()) {
         if (roN_2.volatile_.private_().contains(var14)) {
            this.private_.put(var14, new rKZ(this, var14));
         }
      }

      for (int var15 = 0; var15 < this.extends_.length; var15++) {
         this.extends_[var15] = new ryI_2<>(an_3.class);
      }

      this.protected_ = var3;
      this.package_ = var5;
      this.int_ = var6;
      this.this_ = var7;
      this.synchronized_ = var10;
      if (var9 != null) {
         if (this.byte_.length == var9.length) {
            System.arraycopy(var9, 0, this.byte_, 0, this.byte_.length);
         } else {
            break_.warn("Could not set level chunk sections, array length is {} instead of {}", var9.length, this.byte_.length);
         }
      }
   }

   public roJ_2(rYB var1, rok_3 var2) {
      this(var1, var2.private_(), var2.implements_(), var2.synchronized_(), var2.finally_(), var2.extends_(), var2.this_(), var2.byte_(), (Consumer<roJ_2>)null);

      for (rcd_3 var4 : var2.case_()) {
         aI_2.class_(var4, var1, var1x -> {
            this.class_(var1x);
            return var1x;
         });
      }

      for (ryO_2 var8 : var2.throws_().values()) {
         this.class_(var8);
      }

      this.throws_.putAll(var2.volatile_());

      for (int var6 = 0; var6 < var2.return_().length; var6++) {
         this.final_[var6] = var2.return_()[var6];
      }

      this.break_(var2.super_());
      this.class_(var2.class_());

      for (Entry var9 : var2.native_()) {
         if (roN_2.volatile_.private_().contains(var9.getKey())) {
            this.class_((rKv_1)var9.getKey()).class_(((rKZ)var9.getValue()).class_());
         }
      }

      this.protected_(var2.throw_());
      this.super_ = true;
   }

   public roJ_2(rYB var1, rfj_3 var2, rYZ var3) {
      this(var1, var2, var3, rVh_1.class_, rRd_1.class_(), rRd_1.class_(), 0L, (roQ_2[])null, (Consumer<roJ_2>)null);
   }

   @Override
   public long this_() {
      return this.this_;
   }

   public rXE class_(int var1, int var2, int var3) {
      try {
         if (var2 >= 0 && var2 >> 4 < this.byte_.length) {
            roQ_2 var4 = this.byte_[var2 >> 4];
            if (!roQ_2.class_(var4)) {
               return var4.break_(var1 & 15, var2 & 15, var3 & 15);
            }
         }

         return rXG.class_.private_();
      } catch (Throwable var7) {
         KY var5 = KY.class_(var7, "Getting fluid state");
         Ko_1 var6 = var5.class_("Block being got");
         var6.class_("Location", () -> Ko_1.class_(var1, var2, var3));
         throw new KU(var5);
      }
   }

   @Override
   public void class_(long var1) {
      this.continue_ = var1;
   }

   @Override
   public rrrH<?> class_(rrrZ<?> var1) {
      return this.native_.get(var1);
   }

   @Override
   public void class_(rrrZ<?> var1, rrrH<?> var2) {
      this.native_.put(var1, var2);
   }

   public <T extends an_3> void class_(Class<? extends T> var1, rfl_3 var2, List<T> var3, Predicate<? super T> var4) {
      int var5 = rfU_2.byte_((var2.break_ - 2.0) / 16.0);
      int var6 = rfU_2.byte_((var2.throws_ + 2.0) / 16.0);
      var5 = rfU_2.class_(var5, 0, this.extends_.length - 1);
      var6 = rfU_2.class_(var6, 0, this.extends_.length - 1);

      for (int var7 = var5; var7 <= var6; var7++) {
         for (an_3 var9 : this.extends_[var7].class_(var1)) {
            if (var9.rN().byte_(var2) && (var4 == null || var4.test(var9))) {
               var3.add(var9);
            }
         }
      }
   }

   public void class_(rYZ var1, ruu_3 var2, rcd_3 var3, int var4) {
      boolean var5 = var1 != null;
      Predicate var6 = var5 ? var0 -> true : var1x -> (var4 & 1 << (var1x.c_() >> 4)) != 0;
      Sets.newHashSet(this.finally_.keySet()).stream().filter(var6).forEach(this.catch_::else_);

      for (int var7 = 0; var7 < this.byte_.length; var7++) {
         roQ_2 var8 = this.byte_[var7];
         if ((var4 & 1 << var7) == 0) {
            if (var5 && var8 != class_) {
               this.byte_[var7] = class_;
            }
         } else {
            if (var8 == class_) {
               var8 = new roQ_2(var7 << 4);
               this.byte_[var7] = var8;
            }

            var8.class_(var2);
         }
      }

      if (var1 != null) {
         this.protected_ = var1;
      }

      for (rKv_1 var10 : rKv_1.values()) {
         String var11 = var10.break_();
         if (var3.byte_(var11, 12)) {
            this.class_(var10, var3.package_(var11));
         }
      }

      for (ryO_2 var15 : this.finally_.values()) {
         var15.float_();
      }
   }

   public void class_(boolean var1) {
      this.case_ = var1;
   }

   @Override
   public xc_3 class_(rfH_2 var1, xc_3 var2, boolean var3) {
      int var4 = var1.b_() & 15;
      int var5 = var1.c_();
      int var6 = var1.d_() & 15;
      roQ_2 var7 = this.byte_[var5 >> 4];
      if (var7 == class_) {
         if (var2.catch_()) {
            return null;
         }

         var7 = new roQ_2(var5 >> 4 << 4);
         this.byte_[var5 >> 4] = var7;
      }

      boolean var8 = var7.byte_();
      xc_3 var9 = var7.class_(var4, var5 & 15, var6, var2);
      if (var9 == var2) {
         return null;
      } else {
         xd_3 var10 = var2.break_();
         xd_3 var11 = var9.break_();
         this.private_.get(rKv_1.MOTION_BLOCKING).class_(var4, var5, var6, var2);
         this.private_.get(rKv_1.MOTION_BLOCKING_NO_LEAVES).class_(var4, var5, var6, var2);
         this.private_.get(rKv_1.OCEAN_FLOOR).class_(var4, var5, var6, var2);
         this.private_.get(rKv_1.WORLD_SURFACE).class_(var4, var5, var6, var2);
         boolean var12 = var7.byte_();
         if (var8 != var12) {
            this.catch_.goto_().class_().class_(var1, var12);
         }

         if (!this.catch_.continue_) {
            var9.break_(this.catch_, var1, var2, var3);
         } else if (var11 != var10 && var11 instanceof kx_3) {
            this.catch_.else_(var1);
         }

         if (!var7.class_(var4, var5 & 15, var6).class_(var10)) {
            return null;
         } else {
            if (var11 instanceof kx_3) {
               ryO_2 var13 = this.class_(var1, rox_3.CHECK);
               if (var13 != null) {
                  var13.float_();
               }
            }

            if (!this.catch_.continue_) {
               var2.class_(this.catch_, var1, var9, var3);
            }

            if (var10 instanceof kx_3) {
               ryO_2 var14 = this.class_(var1, rox_3.CHECK);
               if (var14 == null) {
                  var14 = ((kx_3)var10).class_(this.catch_);
                  this.catch_.class_(var1, var14);
               } else {
                  var14.float_();
               }
            }

            this.super_ = true;
            return var9;
         }
      }
   }

   public void class_(rrEm_1 var1) {
      if (this.package_ == rRd_1.class_()) {
         this.package_ = new rRe_1<>(rVL.strictfp_::break_, var1.synchronized_().class_(this.return_, true, false), var1.r());
         this.break_(true);
      }

      if (this.int_ == rRd_1.class_()) {
         this.int_ = new rRe_1<>(rVL.default_::break_, var1.return_().class_(this.return_, true, false), var1.r());
         this.break_(true);
      }
   }

   public void class_(Supplier<rrEJ> var1) {
      this.else_ = var1;
   }

   @Override
   public rKZ class_(rKv_1 var1) {
      return this.private_.computeIfAbsent(var1, var1x -> new rKZ(this, var1x));
   }

   @Override
   public void class_(rrrZ<?> var1, long var2) {
      this.volatile_.computeIfAbsent(var1, var0 -> new LongOpenHashSet()).add(var2);
   }

   @Override
   public Map<rrrZ<?>, LongSet> class_() {
      return this.volatile_;
   }

   @Override
   public void class_(Map<rrrZ<?>, LongSet> var1) {
      this.volatile_.clear();
      this.volatile_.putAll(var1);
   }

   private ryO_2 class_(rfH_2 var1, rcd_3 var2) {
      xc_3 var3 = this.byte_(var1);
      ryO_2 var4;
      if ("DUMMY".equals(var2.native_("id"))) {
         xd_3 var5 = var3.break_();
         if (var5 instanceof kx_3) {
            var4 = ((kx_3)var5).class_(this.catch_);
         } else {
            var4 = null;
            break_.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", var1, var3);
         }
      } else {
         var4 = ryO_2.break_(var3, var2);
      }

      if (var4 != null) {
         var4.break_(this.catch_, var1);
         this.class_(var4);
      } else {
         break_.warn("Tried to load a block entity for block {} but failed at location {}", var3, var1);
      }

      return var4;
   }

   @Override
   public ryO_2 class_(rfH_2 var1) {
      return this.class_(var1, rox_3.CHECK);
   }

   public ryO_2 class_(rfH_2 var1, rox_3 var2) {
      ryO_2 var3 = this.finally_.get(var1);
      if (var3 == null) {
         rcd_3 var4 = this.throws_.remove(var1);
         if (var4 != null) {
            ryO_2 var5 = this.class_(var1, var4);
            if (var5 != null) {
               return var5;
            }
         }
      }

      if (var3 == null) {
         if (var2 == rox_3.IMMEDIATE) {
            var3 = this.implements_(var1);
            this.catch_.class_(var1, var3);
         }
      } else if (var3.long_()) {
         this.finally_.remove(var1);
         return null;
      }

      return var3;
   }

   public void class_(ryO_2 var1) {
      this.class_(var1.char_(), var1);
      if (this.case_ || this.catch_.import_()) {
         this.catch_.class_(var1.char_(), var1);
      }
   }

   @Override
   public void class_(rfH_2 var1, ryO_2 var2) {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrnb_3.class_(var2)).byte_()) {
         if (this.byte_(var1).break_() instanceof kx_3) {
            var2.break_(this.catch_, var1);
            var2.int_();
            ryO_2 var3 = this.finally_.put(var1.int_(), var2);
            if (var3 != null && var3 != var2) {
               var3.aa_();
            }
         }
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      this.throws_.put(new rfH_2(var1.private_("x"), var1.private_("y"), var1.private_("z")), var1);
   }

   @Override
   public void class_(an_3 var1) {
      this.new_ = true;
      int var2 = rfU_2.byte_(var1.rx() / 16.0);
      int var3 = rfU_2.byte_(var1.BO() / 16.0);
      if (var2 != this.return_.break_ || var3 != this.return_.byte_) {
         break_.warn("Wrong location! ({}, {}) should be ({}, {}), {}", var2, var3, this.return_.break_, this.return_.byte_, var1);
         Boolean var9 = true;
         var1.throws_[27] = var9;
      }

      int var4 = rfU_2.byte_(var1.re() / 16.0);
      if (var4 < 0) {
         var4 = 0;
      }

      if (var4 >= this.extends_.length) {
         var4 = this.extends_.length - 1;
      }

      Boolean var10 = true;
      var1.throws_[50] = var10;
      Integer var11 = this.return_.break_;
      var1.throws_[51] = var11;
      Integer var12 = var4;
      var1.throws_[52] = var12;
      Integer var13 = this.return_.byte_;
      var1.throws_[53] = var13;
      this.extends_[var4].add(var1);
   }

   @Override
   public void class_(rKv_1 var1, long[] var2) {
      this.private_.get(var1).class_(var2);
   }

   public void class_(an_3 var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 >= this.extends_.length) {
         var2 = this.extends_.length - 1;
      }

      this.extends_[var2].remove(var1);
   }

   @Override
   public int class_(rKv_1 var1, int var2, int var3) {
      return this.private_.get(var1).class_(var2 & 15, var3 & 15) - 1;
   }

   public void class_(an_3 var1, rfl_3 var2, List<an_3> var3, Predicate<? super an_3> var4, Function<an_3, rjU_2> var5) {
      int var6 = rfU_2.byte_((var2.break_ - 2.0) / 16.0);
      int var7 = rfU_2.byte_((var2.throws_ + 2.0) / 16.0);
      var6 = rfU_2.class_(var6, 0, this.extends_.length - 1);
      var7 = rfU_2.class_(var7, 0, this.extends_.length - 1);

      for (int var8 = var6; var8 <= var7; var8++) {
         ryI_2 var9 = this.extends_[var8];
         List var10 = var9.class_();
         int var11 = var10.size();

         for (int var12 = 0; var12 < var11; var12++) {
            an_3 var13 = (an_3)var10.get(var12);
            rfl_3 var14 = var13.rN();
            if (var5 != null) {
               rjU_2 var15 = (rjU_2)var5.apply(var13);
               if (var15 != null) {
                  var14 = var14.private_(var15.break_, var15.byte_, var15.protected_);
               }
            }

            if (var14.byte_(var2) && var13 != var1) {
               if (var4 == null || var4.test(var13)) {
                  var3.add(var13);
               }

               if (var13 instanceof rSu_1) {
                  for (rSm_1 var18 : ((rSu_1)var13).implements_()) {
                     if (var18 != var1 && var18.rN().byte_(var2) && (var4 == null || var4.test(var18))) {
                        var3.add(var18);
                     }
                  }
               }
            }
         }
      }
   }

   public <T extends an_3> void class_(aI_2<?> var1, rfl_3 var2, List<? super T> var3, Predicate<? super T> var4) {
      int var5 = rfU_2.byte_((var2.break_ - 2.0) / 16.0);
      int var6 = rfU_2.byte_((var2.throws_ + 2.0) / 16.0);
      var5 = rfU_2.class_(var5, 0, this.extends_.length - 1);
      var6 = rfU_2.class_(var6, 0, this.extends_.length - 1);

      for (int var7 = var5; var7 <= var6; var7++) {
         for (an_3 var9 : this.extends_[var7].class_(an_3.class)) {
            if ((var1 == null || var9.BC() == var1) && var9.rN().byte_(var2) && var4.test(var9)) {
               var3.add(var9);
            }
         }
      }
   }

   @Override
   public void break_(Map<rrrZ<?>, rrrH<?>> var1) {
      this.native_.clear();
      this.native_.putAll(var1);
   }

   @Override
   public LongSet break_(rrrZ<?> var1) {
      return this.volatile_.computeIfAbsent(var1, var0 -> new LongOpenHashSet());
   }

   @Override
   public Set<rfH_2> break_() {
      HashSet var1 = Sets.newHashSet(this.throws_.keySet());
      var1.addAll(this.finally_.keySet());
      return var1;
   }

   @Override
   public void break_(long var1) {
      this.this_ = var1;
   }

   @Override
   public rXE break_(rfH_2 var1) {
      return this.class_(var1.b_(), var1.c_(), var1.d_());
   }

   public void break_(an_3 var1) {
      this.class_(var1, (Integer)var1.throws_[52]);
   }

   @Override
   public void break_(boolean var1) {
      this.super_ = var1;
   }

   public void throws_() {
      if (this.synchronized_ != null) {
         this.synchronized_.accept(this);
         this.synchronized_ = null;
      }
   }

   @Override
   public void throws_(rfH_2 var1) {
      if (this.case_ || this.catch_.import_()) {
         ryO_2 var2 = this.finally_.remove(var1);
         if (var2 != null) {
            var2.aa_();
         }
      }
   }

   public boolean finally_() {
      return this.case_;
   }

   public boolean catch_() {
      return false;
   }

   public rYB extends_() {
      return this.catch_;
   }

   @Override
   public roN_2 goto_() {
      return roN_2.volatile_;
   }

   @Override
   public rcd_3 case_(rfH_2 var1) {
      return this.throws_.get(var1);
   }

   public void case_() {
      this.super_ = true;
   }

   @Override
   public boolean continue_() {
      return this.super_ || this.new_ && this.catch_.r() != this.continue_;
   }

   public void else_() {
      rfj_3 var1 = this.private_();

      for (int var2 = 0; var2 < this.final_.length; var2++) {
         if (this.final_[var2] != null) {
            ShortListIterator var3 = this.final_[var2].iterator();

            while (var3.hasNext()) {
               Short var4 = (Short)var3.next();
               rfH_2 var5 = rok_3.class_(var4, var2, var1);
               xc_3 var6 = this.byte_(var5);
               xc_3 var7 = xd_3.break_(var6, this.catch_, var5);
               this.catch_.class_(var5, var7, 20);
            }

            this.final_[var2].clear();
         }
      }

      this.public_();

      for (rfH_2 var9 : Sets.newHashSet(this.throws_.keySet())) {
         this.class_(var9);
      }

      this.throws_.clear();
      this.implements_.class_(this);
   }

   @Override
   public rYZ implements_() {
      return this.protected_;
   }

   private ryO_2 implements_(rfH_2 var1) {
      xc_3 var2 = this.byte_(var1);
      xd_3 var3 = var2.break_();
      return !var3.protected_() ? null : ((kx_3)var3).class_(this.catch_);
   }

   public rrEJ instanceof_() {
      return this.else_ == null ? rrEJ.BORDER : this.else_.get();
   }

   @Override
   public rRV<rXs_1> new_() {
      return this.int_;
   }

   @Override
   public Stream<rfH_2> package_() {
      return StreamSupport.stream(
            rfH_2.break_(this.return_.break_(), 0, this.return_.byte_(), this.return_.protected_(), 255, this.return_.throws_()).spliterator(), false
         )
         .filter(var1 -> this.byte_(var1).case_() != 0);
   }

   @Override
   public ShortList[] return_() {
      return this.final_;
   }

   @Override
   public Map<rrrZ<?>, rrrH<?>> super_() {
      return this.native_;
   }

   @Override
   public boolean throw_() {
      return this.public_;
   }

   public void public_() {
      if (this.package_ instanceof roW_2) {
         ((roW_2)this.package_).class_(this.catch_.finally_(), var1 -> this.byte_(var1).break_());
         this.package_ = rRd_1.class_();
      } else if (this.package_ instanceof rRe_1) {
         ((rRe_1)this.package_).class_(this.catch_.finally_());
         this.package_ = rRd_1.class_();
      }

      if (this.int_ instanceof roW_2) {
         ((roW_2)this.int_).class_(this.catch_.extends_(), var1 -> this.break_(var1).class_());
         this.int_ = rRd_1.class_();
      } else if (this.int_ instanceof rRe_1) {
         ((rRe_1)this.int_).class_(this.catch_.extends_());
         this.int_ = rRd_1.class_();
      }
   }

   @Override
   public rcd_3 protected_(rfH_2 var1) {
      ryO_2 var2 = this.class_(var1);
      if (var2 != null && !var2.long_()) {
         rcd_3 var4 = var2.class_(new rcd_3());
         var4.class_("keepPacked", false);
         return var4;
      } else {
         rcd_3 var3 = this.throws_.get(var1);
         if (var3 != null) {
            var3 = var3.catch_();
            var3.class_("keepPacked", true);
         }

         return var3;
      }
   }

   public rrse_3 protected_() {
      return this.catch_.goto_().class_();
   }

   @Override
   public void protected_(boolean var1) {
      this.public_ = var1;
      this.break_(true);
   }

   @Override
   public rfj_3 private_() {
      return this.return_;
   }

   public ryI_2<an_3>[] final_() {
      return this.extends_;
   }

   public Map<rfH_2, ryO_2> volatile_() {
      return this.finally_;
   }

   @Override
   public rVh_1 synchronized_() {
      return this.implements_;
   }

   @Override
   public Collection<Entry<rKv_1, rKZ>> native_() {
      return Collections.unmodifiableSet(this.private_.entrySet());
   }
}
