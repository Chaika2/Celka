package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rok_3 implements roC_2 {
   private static final Logger class_ = LogManager.getLogger();
   private final rfj_3 break_;
   private volatile boolean byte_;
   private rYZ protected_;
   private volatile rrse_3 throws_;
   private final Map<rKv_1, rKZ> case_ = Maps.newEnumMap(rKv_1.class);
   private volatile roN_2 catch_ = roN_2.class_;
   private final Map<rfH_2, ryO_2> private_ = Maps.newHashMap();
   private final Map<rfH_2, rcd_3> implements_ = Maps.newHashMap();
   private final roQ_2[] finally_ = new roQ_2[16];
   private final List<rcd_3> extends_ = Lists.newArrayList();
   private final List<rfH_2> native_ = Lists.newArrayList();
   private final ShortList[] volatile_ = new ShortList[16];
   private final Map<rrrZ<?>, rrrH<?>> final_ = Maps.newHashMap();
   private final Map<rrrZ<?>, LongSet> package_ = Maps.newHashMap();
   private final rVh_1 int_;
   private final roW_2<xd_3> new_;
   private final roW_2<rXs_1> continue_;
   private long super_;
   private final Map<rKu_1, BitSet> this_ = new Object2ObjectArrayMap();
   private volatile boolean else_;

   @Override
   public roQ_2[] byte_() {
      return this.finally_;
   }

   @Override
   public xc_3 byte_(rfH_2 var1) {
      int var2 = var1.c_();
      if (rYB.protected_(var2)) {
         return xu_3.hG.continue_();
      } else {
         roQ_2 var3 = this.byte_()[var2 >> 4];
         return roQ_2.class_(var3) ? xu_3.class_.continue_() : var3.class_(var1.b_() & 15, var2 & 15, var1.d_() & 15);
      }
   }

   public rok_3(rfj_3 var1, rVh_1 var2) {
      this(
         var1,
         var2,
         (roQ_2[])null,
         new roW_2<>(var0 -> var0 == null || var0.continue_().catch_(), var1),
         new roW_2<>(var0 -> var0 == null || var0 == rXG.class_, var1)
      );
   }

   public rok_3(rfj_3 var1, rVh_1 var2, roQ_2[] var3, roW_2<xd_3> var4, roW_2<rXs_1> var5) {
      this.break_ = var1;
      this.int_ = var2;
      this.new_ = var4;
      this.continue_ = var5;
      if (var3 != null) {
         if (this.finally_.length == var3.length) {
            System.arraycopy(var3, 0, this.finally_, 0, this.finally_.length);
         } else {
            class_.warn("Could not set level chunk sections, array length is {} instead of {}", var3.length, this.finally_.length);
         }
      }
   }

   @Override
   public long this_() {
      return this.super_;
   }

   @Override
   public void class_(rrrZ<?> var1, rrrH<?> var2) {
      this.final_.put(var1, var2);
      this.byte_ = true;
   }

   public void class_(short var1, int var2) {
      this.implements_(class_(var1, var2, this.break_));
   }

   @Override
   public void class_(rrrZ<?> var1, long var2) {
      this.package_.computeIfAbsent(var1, var0 -> new LongOpenHashSet()).add(var2);
      this.byte_ = true;
   }

   @Override
   public Map<rrrZ<?>, LongSet> class_() {
      return Collections.unmodifiableMap(this.package_);
   }

   @Override
   public void class_(rKv_1 var1, long[] var2) {
      this.class_(var1).class_(var2);
   }

   @Override
   public rKZ class_(rKv_1 var1) {
      return this.case_.computeIfAbsent(var1, var1x -> new rKZ(this, var1x));
   }

   @Override
   public int class_(rKv_1 var1, int var2, int var3) {
      rKZ var4 = this.case_.get(var1);
      if (var4 == null) {
         rKZ.class_(this, EnumSet.of(var1));
         var4 = this.case_.get(var1);
      }

      return var4.class_(var2 & 15, var3 & 15) - 1;
   }

   @Override
   public void class_(long var1) {
   }

   @Override
   public rrrH<?> class_(rrrZ<?> var1) {
      return this.final_.get(var1);
   }

   public void class_(rKu_1 var1, BitSet var2) {
      this.this_.put(var1, var2);
   }

   public void class_(rrse_3 var1) {
      this.throws_ = var1;
   }

   @Override
   public void class_(Map<rrrZ<?>, LongSet> var1) {
      this.package_.clear();
      this.package_.putAll(var1);
      this.byte_ = true;
   }

   public static rfH_2 class_(short var0, int var1, rfj_3 var2) {
      int var3 = (var0 & 15) + (var2.break_ << 4);
      int var4 = (var0 >>> 4 & 15) + (var1 << 4);
      int var5 = (var0 >>> 8 & 15) + (var2.byte_ << 4);
      return new rfH_2(var3, var4, var5);
   }

   @Override
   public void class_(rcd_3 var1) {
      this.implements_.put(new rfH_2(var1.private_("x"), var1.private_("y"), var1.private_("z")), var1);
   }

   public BitSet class_(rKu_1 var1) {
      return this.this_.get(var1);
   }

   public void class_(roN_2 var1) {
      this.catch_ = var1;
      this.break_(true);
   }

   @Override
   public void class_(rfH_2 var1, ryO_2 var2) {
      var2.byte_(var1);
      this.private_.put(var1, var2);
   }

   @Override
   public void class_(an_3 var1) {
      if (!var1.Pm()) {
         rcd_3 var2 = new rcd_3();
         var1.byte_(var2);
         this.break_(var2);
      }
   }

   @Override
   public ryO_2 class_(rfH_2 var1) {
      return this.private_.get(var1);
   }

   public void class_(rYZ var1) {
      this.protected_ = var1;
   }

   @Override
   public xc_3 class_(rfH_2 var1, xc_3 var2, boolean var3) {
      int var4 = var1.b_();
      int var5 = var1.c_();
      int var6 = var1.d_();
      if (var5 >= 0 && var5 < 256) {
         if (this.finally_[var5 >> 4] == roJ_2.class_ && var2.class_(xu_3.class_)) {
            return var2;
         } else {
            if (var2.case_() > 0) {
               this.native_.add(new rfH_2((var4 & 15) + this.private_().break_(), var5, (var6 & 15) + this.private_().byte_()));
            }

            roQ_2 var7 = this.class_(var5 >> 4);
            xc_3 var8 = var7.class_(var4 & 15, var5 & 15, var6 & 15, var2);
            if (this.catch_.break_(roN_2.implements_)
               && var2 != var8
               && (var2.break_(this, var1) != var8.break_(this, var1) || var2.case_() != var8.case_() || var2.throws_() || var8.throws_())) {
               rrse_3 var9 = this.catch_();
               var9.class_(var1);
            }

            EnumSet var14 = this.goto_().private_();
            EnumSet var10 = null;

            for (rKv_1 var12 : var14) {
               rKZ var13 = this.case_.get(var12);
               if (var13 == null) {
                  if (var10 == null) {
                     var10 = EnumSet.noneOf(rKv_1.class);
                  }

                  var10.add(var12);
               }
            }

            if (var10 != null) {
               rKZ.class_(this, var10);
            }

            for (rKv_1 var16 : var14) {
               this.case_.get(var16).class_(var4 & 15, var5, var6 & 15, var2);
            }

            return var8;
         }
      } else {
         return xu_3.hG.continue_();
      }
   }

   public roQ_2 class_(int var1) {
      if (this.finally_[var1] == roJ_2.class_) {
         this.finally_[var1] = new roQ_2(var1 << 4);
      }

      return this.finally_[var1];
   }

   @Override
   public void break_(Map<rrrZ<?>, rrrH<?>> var1) {
      this.final_.clear();
      this.final_.putAll(var1);
      this.byte_ = true;
   }

   public BitSet break_(rKu_1 var1) {
      return this.this_.computeIfAbsent(var1, var0 -> new BitSet(65536));
   }

   @Override
   public void break_(short var1, int var2) {
      roC_2.class_(this.volatile_, var2).add(var1);
   }

   @Override
   public rXE break_(rfH_2 var1) {
      int var2 = var1.c_();
      if (rYB.protected_(var2)) {
         return rXG.class_.private_();
      } else {
         roQ_2 var3 = this.byte_()[var2 >> 4];
         return roQ_2.class_(var3) ? rXG.class_.private_() : var3.break_(var1.b_() & 15, var2 & 15, var1.d_() & 15);
      }
   }

   @Override
   public Set<rfH_2> break_() {
      HashSet var1 = Sets.newHashSet(this.implements_.keySet());
      var1.addAll(this.private_.keySet());
      return var1;
   }

   public void break_(rcd_3 var1) {
      this.extends_.add(var1);
   }

   @Override
   public LongSet break_(rrrZ<?> var1) {
      return this.package_.computeIfAbsent(var1, var0 -> new LongOpenHashSet());
   }

   @Override
   public void break_(long var1) {
      this.super_ = var1;
   }

   @Override
   public void break_(boolean var1) {
      this.byte_ = var1;
   }

   @Override
   public void throws_(rfH_2 var1) {
      this.private_.remove(var1);
      this.implements_.remove(var1);
   }

   public Map<rfH_2, ryO_2> throws_() {
      return this.private_;
   }

   public static short finally_(rfH_2 var0) {
      int var1 = var0.b_();
      int var2 = var0.c_();
      int var3 = var0.d_();
      int var4 = var1 & 15;
      int var5 = var2 & 15;
      int var6 = var3 & 15;
      return (short)(var4 | var5 << 4 | var6 << 8);
   }

   public roW_2<xd_3> finally_() {
      return this.new_;
   }

   public rrse_3 catch_() {
      return this.throws_;
   }

   public roW_2<rXs_1> extends_() {
      return this.continue_;
   }

   @Override
   public void extends_(rfH_2 var1) {
      if (!rYB.super_(var1)) {
         roC_2.class_(this.volatile_, var1.c_() >> 4).add(finally_(var1));
      }
   }

   @Override
   public roN_2 goto_() {
      return this.catch_;
   }

   @Override
   public rcd_3 case_(rfH_2 var1) {
      return this.implements_.get(var1);
   }

   public List<rcd_3> case_() {
      return this.extends_;
   }

   @Override
   public boolean continue_() {
      return this.byte_;
   }

   public void implements_(rfH_2 var1) {
      this.native_.add(var1.int_());
   }

   @Override
   public rYZ implements_() {
      return this.protected_;
   }

   @Override
   public Stream<rfH_2> package_() {
      return this.native_.stream();
   }

   @Override
   public ShortList[] return_() {
      return this.volatile_;
   }

   @Override
   public Map<rrrZ<?>, rrrH<?>> super_() {
      return Collections.unmodifiableMap(this.final_);
   }

   @Override
   public boolean throw_() {
      return this.else_;
   }

   @Override
   public void protected_(boolean var1) {
      this.else_ = var1;
      this.break_(true);
   }

   @Override
   public rcd_3 protected_(rfH_2 var1) {
      ryO_2 var2 = this.class_(var1);
      return var2 != null ? var2.class_(new rcd_3()) : this.implements_.get(var1);
   }

   public ShortList[] protected_() {
      ShortList[] var1 = new ShortList[16];

      for (rfH_2 var3 : this.native_) {
         roC_2.class_(var1, var3.c_() >> 4).add(finally_(var3));
      }

      return var1;
   }

   @Override
   public rfj_3 private_() {
      return this.break_;
   }

   public Map<rfH_2, rcd_3> volatile_() {
      return Collections.unmodifiableMap(this.implements_);
   }

   @Override
   public rVh_1 synchronized_() {
      return this.int_;
   }

   @Override
   public Collection<Entry<rKv_1, rKZ>> native_() {
      return Collections.unmodifiableSet(this.case_.entrySet());
   }
}
