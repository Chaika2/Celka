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
   private static final Logger id_class = LogManager.getLogger();
   private final rfj_3 id_break;
   private volatile boolean id_byte;
   private rYZ id_protected;
   private volatile rrse_3 id_throws;
   private final Map<rKv_1, rKZ> id_case = Maps.newEnumMap(rKv_1.class);
   private volatile roN_2 id_catch = roN_2.id_class;
   private final Map<rfH_2, ryO_2> id_private = Maps.newHashMap();
   private final Map<rfH_2, rcd_3> id_implements = Maps.newHashMap();
   private final roQ_2[] id_finally = new roQ_2[16];
   private final List<rcd_3> id_extends = Lists.newArrayList();
   private final List<rfH_2> id_native = Lists.newArrayList();
   private final ShortList[] id_volatile = new ShortList[16];
   private final Map<rrrZ<?>, rrrH<?>> id_final = Maps.newHashMap();
   private final Map<rrrZ<?>, LongSet> id_package = Maps.newHashMap();
   private final rVh_1 id_int;
   private final roW_2<xd_3> id_new;
   private final roW_2<rXs_1> id_continue;
   private long id_super;
   private final Map<rKu_1, BitSet> id_this = new Object2ObjectArrayMap();
   private volatile boolean id_else;

   @Override
   public roQ_2[] id_byte() {
      return this.id_finally;
   }

   @Override
   public xc_3 id_byte(rfH_2 var1) {
      int var2 = var1.c_();
      if (rYB.id_protected(var2)) {
         return xu_3.hG.id_continue();
      } else {
         roQ_2 var3 = this.id_byte()[var2 >> 4];
         return roQ_2.id_class(var3) ? xu_3.id_class.id_continue() : var3.id_class(var1.b_() & 15, var2 & 15, var1.d_() & 15);
      }
   }

   public rok_3(rfj_3 var1, rVh_1 var2) {
      this(
         var1,
         var2,
         (roQ_2[])null,
         new roW_2<>(var0 -> var0 == null || var0.id_continue().id_catch(), var1),
         new roW_2<>(var0 -> var0 == null || var0 == rXG.id_class, var1)
      );
   }

   public rok_3(rfj_3 var1, rVh_1 var2, roQ_2[] var3, roW_2<xd_3> var4, roW_2<rXs_1> var5) {
      this.id_break = var1;
      this.id_int = var2;
      this.id_new = var4;
      this.id_continue = var5;
      if (var3 != null) {
         if (this.id_finally.length == var3.length) {
            System.arraycopy(var3, 0, this.id_finally, 0, this.id_finally.length);
         } else {
            id_class.warn("Could not set level chunk sections, array length is {} instead of {}", var3.length, this.id_finally.length);
         }
      }
   }

   @Override
   public long id_this() {
      return this.id_super;
   }

   @Override
   public void id_class(rrrZ<?> var1, rrrH<?> var2) {
      this.id_final.put(var1, var2);
      this.id_byte = true;
   }

   public void id_class(short var1, int var2) {
      this.id_implements(id_class(var1, var2, this.id_break));
   }

   @Override
   public void id_class(rrrZ<?> var1, long var2) {
      this.id_package.computeIfAbsent(var1, var0 -> new LongOpenHashSet()).add(var2);
      this.id_byte = true;
   }

   @Override
   public Map<rrrZ<?>, LongSet> id_class() {
      return Collections.unmodifiableMap(this.id_package);
   }

   @Override
   public void id_class(rKv_1 var1, long[] var2) {
      this.id_class(var1).id_class(var2);
   }

   @Override
   public rKZ id_class(rKv_1 var1) {
      return this.id_case.computeIfAbsent(var1, var1x -> new rKZ(this, var1x));
   }

   @Override
   public int id_class(rKv_1 var1, int var2, int var3) {
      rKZ var4 = this.id_case.get(var1);
      if (var4 == null) {
         rKZ.id_class(this, EnumSet.of(var1));
         var4 = this.id_case.get(var1);
      }

      return var4.id_class(var2 & 15, var3 & 15) - 1;
   }

   @Override
   public void id_class(long var1) {
   }

   @Override
   public rrrH<?> id_class(rrrZ<?> var1) {
      return this.id_final.get(var1);
   }

   public void id_class(rKu_1 var1, BitSet var2) {
      this.id_this.put(var1, var2);
   }

   public void id_class(rrse_3 var1) {
      this.id_throws = var1;
   }

   @Override
   public void id_class(Map<rrrZ<?>, LongSet> var1) {
      this.id_package.clear();
      this.id_package.putAll(var1);
      this.id_byte = true;
   }

   public static rfH_2 id_class(short var0, int var1, rfj_3 var2) {
      int var3 = (var0 & 15) + (var2.id_break << 4);
      int var4 = (var0 >>> 4 & 15) + (var1 << 4);
      int var5 = (var0 >>> 8 & 15) + (var2.id_byte << 4);
      return new rfH_2(var3, var4, var5);
   }

   @Override
   public void id_class(rcd_3 var1) {
      this.id_implements.put(new rfH_2(var1.id_private("x"), var1.id_private("y"), var1.id_private("z")), var1);
   }

   public BitSet id_class(rKu_1 var1) {
      return this.id_this.get(var1);
   }

   public void id_class(roN_2 var1) {
      this.id_catch = var1;
      this.id_break(true);
   }

   @Override
   public void id_class(rfH_2 var1, ryO_2 var2) {
      var2.id_byte(var1);
      this.id_private.put(var1, var2);
   }

   @Override
   public void id_class(an_3 var1) {
      if (!var1.Pm()) {
         rcd_3 var2 = new rcd_3();
         var1.id_byte(var2);
         this.id_break(var2);
      }
   }

   @Override
   public ryO_2 id_class(rfH_2 var1) {
      return this.id_private.get(var1);
   }

   public void id_class(rYZ var1) {
      this.id_protected = var1;
   }

   @Override
   public xc_3 id_class(rfH_2 var1, xc_3 var2, boolean var3) {
      int var4 = var1.b_();
      int var5 = var1.c_();
      int var6 = var1.d_();
      if (var5 >= 0 && var5 < 256) {
         if (this.id_finally[var5 >> 4] == roJ_2.id_class && var2.id_class(xu_3.id_class)) {
            return var2;
         } else {
            if (var2.id_case() > 0) {
               this.id_native.add(new rfH_2((var4 & 15) + this.id_private().id_break(), var5, (var6 & 15) + this.id_private().id_byte()));
            }

            roQ_2 var7 = this.id_class(var5 >> 4);
            xc_3 var8 = var7.id_class(var4 & 15, var5 & 15, var6 & 15, var2);
            if (this.id_catch.id_break(roN_2.id_implements)
               && var2 != var8
               && (var2.id_break(this, var1) != var8.id_break(this, var1) || var2.id_case() != var8.id_case() || var2.id_throws() || var8.id_throws())) {
               rrse_3 var9 = this.id_catch();
               var9.id_class(var1);
            }

            EnumSet var14 = this.id_goto().id_private();
            EnumSet var10 = null;

            for (rKv_1 var12 : var14) {
               rKZ var13 = this.id_case.get(var12);
               if (var13 == null) {
                  if (var10 == null) {
                     var10 = EnumSet.noneOf(rKv_1.class);
                  }

                  var10.add(var12);
               }
            }

            if (var10 != null) {
               rKZ.id_class(this, var10);
            }

            for (rKv_1 var16 : var14) {
               this.id_case.get(var16).id_class(var4 & 15, var5, var6 & 15, var2);
            }

            return var8;
         }
      } else {
         return xu_3.hG.id_continue();
      }
   }

   public roQ_2 id_class(int var1) {
      if (this.id_finally[var1] == roJ_2.id_class) {
         this.id_finally[var1] = new roQ_2(var1 << 4);
      }

      return this.id_finally[var1];
   }

   @Override
   public void id_break(Map<rrrZ<?>, rrrH<?>> var1) {
      this.id_final.clear();
      this.id_final.putAll(var1);
      this.id_byte = true;
   }

   public BitSet id_break(rKu_1 var1) {
      return this.id_this.computeIfAbsent(var1, var0 -> new BitSet(65536));
   }

   @Override
   public void id_break(short var1, int var2) {
      roC_2.id_class(this.id_volatile, var2).add(var1);
   }

   @Override
   public rXE id_break(rfH_2 var1) {
      int var2 = var1.c_();
      if (rYB.id_protected(var2)) {
         return rXG.id_class.id_private();
      } else {
         roQ_2 var3 = this.id_byte()[var2 >> 4];
         return roQ_2.id_class(var3) ? rXG.id_class.id_private() : var3.id_break(var1.b_() & 15, var2 & 15, var1.d_() & 15);
      }
   }

   @Override
   public Set<rfH_2> id_break() {
      HashSet var1 = Sets.newHashSet(this.id_implements.keySet());
      var1.addAll(this.id_private.keySet());
      return var1;
   }

   public void id_break(rcd_3 var1) {
      this.id_extends.add(var1);
   }

   @Override
   public LongSet id_break(rrrZ<?> var1) {
      return this.id_package.computeIfAbsent(var1, var0 -> new LongOpenHashSet());
   }

   @Override
   public void id_break(long var1) {
      this.id_super = var1;
   }

   @Override
   public void id_break(boolean var1) {
      this.id_byte = var1;
   }

   @Override
   public void id_throws(rfH_2 var1) {
      this.id_private.remove(var1);
      this.id_implements.remove(var1);
   }

   public Map<rfH_2, ryO_2> id_throws() {
      return this.id_private;
   }

   public static short id_finally(rfH_2 var0) {
      int var1 = var0.b_();
      int var2 = var0.c_();
      int var3 = var0.d_();
      int var4 = var1 & 15;
      int var5 = var2 & 15;
      int var6 = var3 & 15;
      return (short)(var4 | var5 << 4 | var6 << 8);
   }

   public roW_2<xd_3> id_finally() {
      return this.id_new;
   }

   public rrse_3 id_catch() {
      return this.id_throws;
   }

   public roW_2<rXs_1> id_extends() {
      return this.id_continue;
   }

   @Override
   public void id_extends(rfH_2 var1) {
      if (!rYB.id_super(var1)) {
         roC_2.id_class(this.id_volatile, var1.c_() >> 4).add(id_finally(var1));
      }
   }

   @Override
   public roN_2 id_goto() {
      return this.id_catch;
   }

   @Override
   public rcd_3 id_case(rfH_2 var1) {
      return this.id_implements.get(var1);
   }

   public List<rcd_3> id_case() {
      return this.id_extends;
   }

   @Override
   public boolean id_continue() {
      return this.id_byte;
   }

   public void id_implements(rfH_2 var1) {
      this.id_native.add(var1.id_int());
   }

   @Override
   public rYZ id_implements() {
      return this.id_protected;
   }

   @Override
   public Stream<rfH_2> id_package() {
      return this.id_native.stream();
   }

   @Override
   public ShortList[] id_return() {
      return this.id_volatile;
   }

   @Override
   public Map<rrrZ<?>, rrrH<?>> id_super() {
      return Collections.unmodifiableMap(this.id_final);
   }

   @Override
   public boolean id_throw() {
      return this.id_else;
   }

   @Override
   public void id_protected(boolean var1) {
      this.id_else = var1;
      this.id_break(true);
   }

   @Override
   public rcd_3 id_protected(rfH_2 var1) {
      ryO_2 var2 = this.id_class(var1);
      return var2 != null ? var2.id_class(new rcd_3()) : this.id_implements.get(var1);
   }

   public ShortList[] id_protected() {
      ShortList[] var1 = new ShortList[16];

      for (rfH_2 var3 : this.id_native) {
         roC_2.id_class(var1, var3.c_() >> 4).add(id_finally(var3));
      }

      return var1;
   }

   @Override
   public rfj_3 id_private() {
      return this.id_break;
   }

   public Map<rfH_2, rcd_3> id_volatile() {
      return Collections.unmodifiableMap(this.id_implements);
   }

   @Override
   public rVh_1 id_synchronized() {
      return this.id_int;
   }

   @Override
   public Collection<Entry<rKv_1, rKZ>> id_native() {
      return Collections.unmodifiableSet(this.id_case.entrySet());
   }
}
