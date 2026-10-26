package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrEx_1 extends roj_3 implements rrEX {
   private static final Logger id_byte = LogManager.getLogger();
   public static final int id_break = 33 + roN_2.id_break();
   private final Long2ObjectLinkedOpenHashMap<rrEG> id_protected = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<rrEG> id_throws = this.id_protected.clone();
   private final Long2ObjectLinkedOpenHashMap<rrEG> id_case = new Long2ObjectLinkedOpenHashMap();
   private final LongSet id_catch = new LongOpenHashSet();
   final rrEm_1 id_private;
   private final rrEZ id_implements;
   private final rTQ<Runnable> id_finally;
   private final rKd_1 id_extends;
   private final Supplier<rrEi_1> id_native;
   private final rga_3 id_volatile;
   final LongSet id_final = new LongOpenHashSet();
   private boolean id_package;
   private final roF_2 id_int;
   private final rTX<roL_2<Runnable>> id_new;
   private final rTX<roL_2<Runnable>> id_continue;
   private final roq_3 id_super;
   private final rrEz_1 id_this;
   private final AtomicInteger id_else = new AtomicInteger();
   private final rrPt_1 id_synchronized;
   private final File id_return;
   private final roy_3 id_public = new roy_3();
   private final Int2ObjectMap<rrEW> id_goto = new Int2ObjectOpenHashMap();
   private final Long2ByteMap id_while = new Long2ByteOpenHashMap();
   private final Queue<Runnable> id_try = Queues.newConcurrentLinkedQueue();
   int id_instanceof;

   protected boolean id_byte() {
      if (!this.id_package) {
         return false;
      } else {
         this.id_throws = this.id_protected.clone();
         this.id_package = false;
         return true;
      }
   }

   protected IntSupplier id_byte(long var1) {
      return () -> {
         rrEG var3 = this.id_break(var1);
         return var3 == null ? rov_3.id_class - 1 : Math.min(var3.id_extends(), rov_3.id_class - 1);
      };
   }

   private rjh_3 id_byte(rhN_2 var1) {
      rjh_3 var2 = rjh_3.id_class(var1);
      var1.id_class(var2);
      var1.id_class.id_class(new rFA(var2.id_break(), var2.id_protected()));
      return var2;
   }

   public CompletableFuture<Either<roJ_2, rrEM>> id_byte(rfj_3 var1) {
      return this.id_class(var1, 2, var0 -> roN_2.id_volatile)
         .thenApplyAsync(var0 -> var0.mapLeft(var0x -> (roJ_2)var0x.get(var0x.size() / 2)), this.id_finally);
   }

   private CompletableFuture<Either<roC_2, rrEM>> id_byte(rrEG var1) {
      CompletableFuture var2 = var1.id_class(roN_2.id_volatile.id_throws());
      return var2.thenApplyAsync(var2x -> {
         roN_2 var3 = rrEG.id_break(var1.id_finally());
         return !var3.id_break(roN_2.id_volatile) ? rrEG.id_class : var2x.mapLeft(var2xx -> {
            rfj_3 var3x = var1.id_implements();
            roJ_2 var4;
            if (var2xx instanceof roz_3) {
               var4 = ((roz_3)var2xx).id_final();
            } else {
               var4 = new roJ_2(this.id_private, (rok_3)var2xx);
               var1.id_class(new roz_3(var4));
            }

            var4.id_class(() -> rrEG.id_byte(var1.id_finally()));
            var4.id_throws();
            if (this.id_catch.add(var3x.id_class())) {
               var4.id_class(true);
               this.id_private.id_class(var4.id_volatile().values());
               ArrayList var5 = null;
               ryI_2[] var6 = var4.id_final();
               int var7 = var6.length;

               for (int var8 = 0; var8 < var7; var8++) {
                  for (an_3 var10 : var6[var8]) {
                     if (!(var10 instanceof rhd_3) && !this.id_private.id_private(var10)) {
                        if (var5 == null) {
                           var5 = Lists.newArrayList(new an_3[]{var10});
                        } else {
                           var5.add(var10);
                        }
                     }
                  }
               }

               if (var5 != null) {
                  var5.forEach(var4::id_break);
               }
            }

            return var4;
         });
      }, var2x -> this.id_continue.id_class(roF_2.id_class(var2x, var1.id_implements().id_class(), var1::id_finally)));
   }

   public rrEx_1(
      rrEm_1 var1,
      rrGk_1 var2,
      DataFixer var3,
      rrPt_1 var4,
      Executor var5,
      rTQ<Runnable> var6,
      rol_3 var7,
      rKd_1 var8,
      roq_3 var9,
      Supplier<rrEi_1> var10,
      int var11,
      boolean var12
   ) {
      super(new File(var2.id_class(var1.E()), "region"), var3, var12);
      this.id_synchronized = var4;
      this.id_return = var2.id_class(var1.E());
      this.id_private = var1;
      this.id_extends = var8;
      this.id_finally = var6;
      rTh_1 var13 = rTh_1.id_class(var5, "worldgen");
      rTX var14 = rTX.id_class("main", var6::id_private);
      this.id_super = var9;
      rTh_1 var15 = rTh_1.id_class(var5, "light");
      this.id_int = new roF_2(ImmutableList.of(var13, var14, var15), var5, Integer.MAX_VALUE);
      this.id_new = this.id_int.id_class(var13, false);
      this.id_continue = this.id_int.id_class(var14, false);
      this.id_implements = new rrEZ(var7, this, this.id_private.id_default().id_break(), var15, this.id_int.id_class(var15, false));
      this.id_this = new rrEz_1(this, var5, var6);
      this.id_native = var10;
      this.id_volatile = new rga_3(new File(this.id_return, "poi"), var3, var12);
      this.id_class(var11);
   }

   private void id_class(rhN_2 var1, ruS_2<?>[] var2, roJ_2 var3) {
      if (var2[0] == null) {
         var2[0] = new rZD(var3, 65535);
         var2[1] = new rFC(var3.id_private(), this.id_implements, true);
      }

      var1.id_class(var3.id_private(), var2[0], var2[1]);
      ruP_2.id_class(this.id_private, var3.id_private());
      ArrayList var4 = Lists.newArrayList();
      ArrayList var5 = Lists.newArrayList();
      ObjectIterator var6 = this.id_goto.values().iterator();

      while (var6.hasNext()) {
         rrEW var7 = (rrEW)var6.next();
         an_3 var8 = var7.id_byte;
         if (var8 != var1 && (Integer)var8.id_throws[51] == var3.id_private().id_break && (Integer)var8.id_throws[53] == var3.id_private().id_byte) {
            var7.id_break(var1);
            if (var8 instanceof is_3 && ((is_3)var8).N() != null) {
               var4.add(var8);
            }

            if (!var8.Bh().isEmpty()) {
               var5.add(var8);
            }
         }
      }

      if (!var4.isEmpty()) {
         for (an_3 var11 : var4) {
            var1.id_class.id_class(new rvA_2(var11, ((is_3)var11).N()));
         }
      }

      if (!var5.isEmpty()) {
         for (an_3 var12 : var5) {
            var1.id_class.id_class(new rFb_1(var12));
         }
      }
   }

   protected rrEG id_class(long var1) {
      return (rrEG)this.id_protected.get(var1);
   }

   protected void id_class(an_3 var1, ruS_2<?> var2) {
      rrEW var3 = (rrEW)this.id_goto.get(var1.V());
      if (var3 != null) {
         var3.id_class(var2);
      }
   }

   protected void id_class(an_3 var1) {
      boolean var2 = var1 instanceof rSm_1;
      if (rrxr_3.BA.id_byte()) {
         var2 = rrxr_3.BA.id_class(var1);
      }

      if (!var2) {
         aI_2 var3 = var1.BC();
         int var4 = var3.id_final() * 16;
         int var5 = var3.id_package();
         if (this.id_goto.containsKey(var1.V())) {
            throw (IllegalStateException)rqR_2.id_byte(new IllegalStateException("Entity is already tracked!"));
         }

         rrEW var6 = new rrEW(this, var1, var4, var5, var3.id_int());
         this.id_goto.put(var1.V(), var6);
         var6.id_class(this.id_private.id_continue());
         if (var1 instanceof rhN_2 var7) {
            this.id_class(var7, true);
            ObjectIterator var8 = this.id_goto.values().iterator();

            while (var8.hasNext()) {
               rrEW var9 = (rrEW)var8.next();
               if (var9.id_byte != var7) {
                  var9.id_break(var7);
               }
            }
         }
      }
   }

   @Override
   public Stream<rhN_2> id_class(rfj_3 var1, boolean var2) {
      return this.id_public.id_class(var1.id_class()).filter(var3 -> {
         int var4 = id_class(var1, var3, true);
         return var4 > this.id_instanceof ? false : !var2 || var4 == this.id_instanceof;
      });
   }

   public void id_class(rhN_2 var1) {
      ObjectIterator var2 = this.id_goto.values().iterator();

      while (var2.hasNext()) {
         rrEW var3 = (rrEW)var2.next();
         if (var3.id_byte == var1) {
            var3.id_class(this.id_private.id_continue());
         } else {
            var3.id_break(var1);
         }
      }

      int var24 = rfU_2.id_byte(var1.rx()) >> 4;
      int var25 = rfU_2.id_byte(var1.BO()) >> 4;
      rjh_3 var4 = var1.M();
      rjh_3 var5 = rjh_3.id_class(var1);
      long var6 = var4.id_new().id_class();
      long var8 = var5.id_new().id_class();
      boolean var10 = this.id_public.id_protected(var1);
      boolean var11 = this.id_break(var1);
      boolean var12 = var4.id_continue() != var5.id_continue();
      if (var12 || var10 != var11) {
         this.id_byte(var1);
         if (!var10) {
            this.id_this.id_break(var4, var1);
         }

         if (!var11) {
            this.id_this.id_class(var5, var1);
         }

         if (!var10 && var11) {
            this.id_public.id_class(var1);
         }

         if (var10 && !var11) {
            this.id_public.id_break(var1);
         }

         if (var6 != var8) {
            this.id_public.id_class(var6, var8, var1);
         }
      }

      int var13 = var4.id_break();
      int var14 = var4.id_protected();
      if (Math.abs(var13 - var24) <= this.id_instanceof * 2 && Math.abs(var14 - var25) <= this.id_instanceof * 2) {
         int var27 = Math.min(var24, var13) - this.id_instanceof;
         int var29 = Math.min(var25, var14) - this.id_instanceof;
         int var31 = Math.max(var24, var13) + this.id_instanceof;
         int var33 = Math.max(var25, var14) + this.id_instanceof;

         for (int var35 = var27; var35 <= var31; var35++) {
            for (int var20 = var29; var20 <= var33; var20++) {
               rfj_3 var21 = new rfj_3(var35, var20);
               boolean var22 = id_class(var21, var13, var14) <= this.id_instanceof;
               boolean var23 = id_class(var21, var24, var25) <= this.id_instanceof;
               this.id_class(var1, var21, new ruS_2[2], var22, var23);
            }
         }
      } else {
         for (int var15 = var13 - this.id_instanceof; var15 <= var13 + this.id_instanceof; var15++) {
            for (int var16 = var14 - this.id_instanceof; var16 <= var14 + this.id_instanceof; var16++) {
               rfj_3 var17 = new rfj_3(var15, var16);
               boolean var18 = true;
               boolean var19 = false;
               this.id_class(var1, var17, new ruS_2[2], true, false);
            }
         }

         for (int var26 = var24 - this.id_instanceof; var26 <= var24 + this.id_instanceof; var26++) {
            for (int var28 = var25 - this.id_instanceof; var28 <= var25 + this.id_instanceof; var28++) {
               rfj_3 var30 = new rfj_3(var26, var28);
               boolean var32 = false;
               boolean var34 = true;
               this.id_class(var1, var30, new ruS_2[2], false, true);
            }
         }
      }
   }

   public CompletableFuture<Void> id_class(roJ_2 var1) {
      return this.id_finally.id_case(() -> var1.id_class(this.id_private));
   }

   private static int id_class(rfj_3 var0, int var1, int var2) {
      int var3 = var0.id_break - var1;
      int var4 = var0.id_byte - var2;
      return Math.max(Math.abs(var3), Math.abs(var4));
   }

   private static double id_class(rfj_3 var0, an_3 var1) {
      double var2 = (double)(var0.id_break * 16 + 8);
      double var4 = (double)(var0.id_byte * 16 + 8);
      double var6 = var2 - var1.rx();
      double var8 = var4 - var1.BO();
      return var6 * var6 + var8 * var8;
   }

   static int id_class(rfj_3 var0, rhN_2 var1, boolean var2) {
      int var3;
      int var4;
      if (var2) {
         rjh_3 var5 = var1.M();
         var3 = var5.id_break();
         var4 = var5.id_protected();
      } else {
         var3 = rfU_2.id_byte(var1.rx() / 16.0);
         var4 = rfU_2.id_byte(var1.BO() / 16.0);
      }

      return id_class(var0, var3, var4);
   }

   private byte id_class(rfj_3 var1, roZ_2 var2) {
      return this.id_while.put(var1.id_class(), (byte)(var2 == roZ_2.PROTOCHUNK ? -1 : 1));
   }

   public CompletableFuture<Either<roJ_2, rrEM>> id_class(rrEG var1) {
      rfj_3 var2 = var1.id_implements();
      CompletableFuture var3 = this.id_class(var2, 1, var0 -> roN_2.id_volatile);
      CompletableFuture var4 = var3.thenApplyAsync(var0 -> var0.flatMap(var0x -> {
            roJ_2 var1x = (roJ_2)var0x.get(var0x.size() / 2);
            var1x.id_else();
            return Either.left(var1x);
         }), var2x -> this.id_continue.id_class(roF_2.id_class(var1, var2x)));
      var4.thenAcceptAsync(var2x -> var2x.mapLeft(var2xx -> {
            this.id_else.getAndIncrement();
            ruS_2[] var3x = new ruS_2[2];
            this.id_class(var2, false).forEach(var3xx -> this.id_class(var3xx, var3x, var2xx));
            return Either.left(var2xx);
         }), var2x -> this.id_continue.id_class(roF_2.id_class(var1, var2x)));
      return var4;
   }

   void id_class(Writer var1) throws IOException {
      ryT_2 var2 = ryT_2.id_class()
         .id_class("x")
         .id_class("z")
         .id_class("level")
         .id_class("in_memory")
         .id_class("status")
         .id_class("full_status")
         .id_class("accessible_ready")
         .id_class("ticking_ready")
         .id_class("entity_ticking_ready")
         .id_class("ticket")
         .id_class("spawning")
         .id_class("entity_count")
         .id_class("block_entity_count")
         .id_class(var1);
      ObjectBidirectionalIterator var3 = this.id_throws.long2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         rfj_3 var5 = new rfj_3(var4.getLongKey());
         rrEG var6 = (rrEG)var4.getValue();
         Optional var7 = Optional.ofNullable(var6.id_case());
         Optional var8 = var7.flatMap(var0 -> var0 instanceof roJ_2 ? Optional.of((roC_2)var0) : Optional.empty());
         var2.id_class(
            var5.id_break,
            var5.id_byte,
            var6.id_finally(),
            var7.isPresent(),
            var7.map(roC_2::id_goto).orElse(null),
            var8.map(roJ_2::id_instanceof).orElse(null),
            id_class(var6.id_byte()),
            id_class(var6.id_class()),
            id_class(var6.id_break()),
            this.id_this.id_byte(var4.getLongKey()),
            !this.id_throws(var5),
            var8.<Integer>map(var0 -> Stream.of(var0.id_final()).mapToInt(ryI_2::size).sum()).orElse(0),
            var8.<Integer>map(var0 -> var0.id_volatile().size()).orElse(0)
         );
      }
   }

   private static String id_class(CompletableFuture<Either<roJ_2, rrEM>> var0) {
      try {
         Either var1 = (Either)var0.getNow(null);
         return var1 != null ? (String)var1.map(var0x -> "done", var0x -> "unloaded") : "not completed";
      } catch (CompletionException var2) {
         return "failed " + var2.getCause().getMessage();
      } catch (CancellationException var3) {
         return "cancelled";
      }
   }

   public CompletableFuture<Either<roC_2, rrEM>> id_class(rrEG var1, roN_2 var2) {
      rfj_3 var3 = var1.id_implements();
      if (var2 == roN_2.id_class) {
         return this.id_case(var3);
      } else {
         CompletableFuture var4 = var1.id_class(var2.id_throws(), this);
         return var4.thenComposeAsync(var4x -> {
            Optional var5 = var4x.left();
            if (!var5.isPresent()) {
               return CompletableFuture.completedFuture((Either<roC_2, rrEM>)var4x);
            } else {
               if (var2 == roN_2.id_finally) {
                  this.id_this.id_class(rrEl_1.id_throws, var3, 33 + roN_2.id_class(roN_2.id_implements), var3);
               }

               roC_2 var6 = (roC_2)var5.get();
               if (var6.id_goto().id_break(var2)) {
                  CompletableFuture var7;
                  if (var2 == roN_2.id_finally) {
                     var7 = this.id_break(var1, var2);
                  } else {
                     var7 = var2.id_class(this.id_private, this.id_synchronized, this.id_implements, var2xx -> this.id_byte(var1), var6);
                  }

                  this.id_super.id_class(var3, var2);
                  return var7;
               } else {
                  return this.id_break(var1, var2);
               }
            }
         }, this.id_finally);
      }
   }

   protected void id_class(rhN_2 var1, rfj_3 var2, ruS_2<?>[] var3, boolean var4, boolean var5) {
      if ((rYB)var1.id_throws[7] == this.id_private) {
         if (rrxr_3.j.id_byte()) {
            rrxr_3.j.id_class(var4, var5, var1, var2, this.id_private);
         }

         if (var5 && !var4) {
            rrEG var6 = this.id_break(var2.id_class());
            if (var6 != null) {
               roJ_2 var7 = var6.id_protected();
               if (var7 != null) {
                  this.id_class(var1, var3, var7);
               }

               ruP_2.id_class(this.id_private, var2);
            }
         }

         if (!var5 && var4) {
            var1.id_class(var2);
         }
      }
   }

   rrEG id_class(long var1, int var3, rrEG var4, int var5) {
      if (var5 > id_break && var3 > id_break) {
         return var4;
      } else {
         if (var4 != null) {
            var4.id_class(var3);
         }

         if (var4 != null) {
            if (var3 > id_break) {
               this.id_final.add(var1);
            } else {
               this.id_final.remove(var1);
            }
         }

         if (var3 <= id_break && var4 == null) {
            var4 = (rrEG)this.id_case.remove(var1);
            if (var4 != null) {
               var4.id_class(var3);
            } else {
               var4 = new rrEG(new rfj_3(var1), var3, this.id_implements, this.id_int, this);
            }

            this.id_protected.put(var1, var4);
            this.id_package = true;
         }

         return var4;
      }
   }

   private roN_2 id_class(roN_2 var1, int var2) {
      roN_2 var3;
      if (var2 == 0) {
         var3 = var1.id_throws();
      } else {
         var3 = roN_2.id_class(roN_2.id_class(var1) + var2);
      }

      return var3;
   }

   protected void id_class(int var1) {
      int var2 = rfU_2.id_class(var1 + 1, 3, 64);
      if (var2 != this.id_instanceof) {
         int var3 = this.id_instanceof;
         this.id_instanceof = var2;
         this.id_this.id_class(this.id_instanceof);
         ObjectIterator var4 = this.id_protected.values().iterator();

         while (var4.hasNext()) {
            rrEG var5 = (rrEG)var4.next();
            rfj_3 var6 = var5.id_implements();
            ruS_2[] var7 = new ruS_2[2];
            this.id_class(var6, false).forEach(var4x -> {
               int var5x = id_class(var6, var4x, true);
               boolean var6x = var5x <= var3;
               boolean var7x = var5x <= this.id_instanceof;
               this.id_class(var4x, var6, var7, var6x, var7x);
            });
         }
      }
   }

   private boolean id_class(roC_2 var1) {
      this.id_volatile.id_class(var1.id_private());
      if (!var1.id_continue()) {
         return false;
      } else {
         var1.id_class(this.id_private.r());
         var1.id_break(false);
         rfj_3 var2 = var1.id_private();

         try {
            roN_2 var3 = var1.id_goto();
            if (var3.id_catch() != roZ_2.LEVELCHUNK) {
               if (this.id_private(var2)) {
                  return false;
               }

               if (var3 == roN_2.id_class && var1.id_super().values().stream().noneMatch(rrrH::id_throws)) {
                  return false;
               }
            }

            rcd_3 var4 = roR_2.id_class(this.id_private, var1);
            this.id_class(var2, var4);
            this.id_class(var2, var3.id_catch());
            return true;
         } catch (Exception var5) {
            id_byte.error("Failed to save chunk {},{}", var2.id_break, var2.id_byte, var5);
            return false;
         }
      }
   }

   private CompletableFuture<Either<List<roC_2>, rrEM>> id_class(rfj_3 var1, int var2, IntFunction<roN_2> var3) {
      ArrayList var4 = Lists.newArrayList();
      int var5 = var1.id_break;
      int var6 = var1.id_byte;

      for (int var7 = -var2; var7 <= var2; var7++) {
         for (int var8 = -var2; var8 <= var2; var8++) {
            int var9 = Math.max(Math.abs(var8), Math.abs(var7));
            rfj_3 var10 = new rfj_3(var5 + var8, var6 + var7);
            long var11 = var10.id_class();
            rrEG var13 = this.id_class(var11);
            if (var13 == null) {
               return CompletableFuture.completedFuture(Either.right(new rrEd_1(this, var10)));
            }

            roN_2 var14 = (roN_2)var3.apply(var9);
            CompletableFuture var15 = var13.id_class(var14, this);
            var4.add(var15);
         }
      }

      CompletableFuture var16 = rqR_2.id_break(var4);
      return var16.thenApply(var4x -> {
         ArrayList var5x = Lists.newArrayList();
         int var6x = 0;

         for (Either var8x : var4x) {
            Optional var9x = var8x.left();
            if (!var9x.isPresent()) {
               return Either.right(new rrEk_1(this, var5, var6x, var2, var6, var8x));
            }

            var5x.add((roC_2)var9x.get());
            var6x++;
         }

         return Either.left(var5x);
      });
   }

   protected void id_class(boolean var1) {
      if (var1) {
         List var2 = this.id_throws.values().stream().filter(rrEG::id_native).peek(rrEG::id_volatile).collect(Collectors.toList());
         MutableBoolean var3 = new MutableBoolean();

         do {
            var3.setFalse();
            var2.stream().map(var1x -> {
               CompletableFuture var2x;
               do {
                  var2x = var1x.id_catch();
                  this.id_finally.id_byte(var2x::isDone);
               } while (var2x != var1x.id_catch());

               return (roC_2)var2x.join();
            }).filter(var0 -> var0 instanceof roz_3 || var0 instanceof roJ_2).filter(this::id_class).forEach(var1x -> var3.setTrue());
         } while (var3.isTrue());

         this.id_break((BooleanSupplier)(() -> true));
         this.id_class();
         id_byte.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", this.id_return.getName());
      } else {
         this.id_throws.values().stream().filter(rrEG::id_native).forEach(var1x -> {
            roC_2 var2x = var1x.id_catch().getNow(null);
            if (var2x instanceof roz_3 || var2x instanceof roJ_2) {
               this.id_class(var2x);
               var1x.id_volatile();
            }
         });
      }
   }

   void id_class(rhN_2 var1, boolean var2) {
      boolean var3 = this.id_break(var1);
      boolean var4 = this.id_public.id_byte(var1);
      int var5 = rfU_2.id_byte(var1.rx()) >> 4;
      int var6 = rfU_2.id_byte(var1.BO()) >> 4;
      if (var2) {
         this.id_public.id_class(rfj_3.id_class(var5, var6), var1, var3);
         this.id_byte(var1);
         if (!var3) {
            this.id_this.id_class(rjh_3.id_class(var1), var1);
         }
      } else {
         rjh_3 var7 = var1.M();
         this.id_public.id_class(var7.id_new().id_class(), var1);
         if (!var4) {
            this.id_this.id_break(var7, var1);
         }
      }

      for (int var10 = var5 - this.id_instanceof; var10 <= var5 + this.id_instanceof; var10++) {
         for (int var8 = var6 - this.id_instanceof; var8 <= var6 + this.id_instanceof; var8++) {
            rfj_3 var9 = new rfj_3(var10, var8);
            this.id_class(var1, var9, new ruS_2[2], !var2, var2);
         }
      }
   }

   protected void id_class(BooleanSupplier var1) {
      this.id_volatile.id_class(var1);
      if (!this.id_private.G()) {
         this.id_break(var1);
      }
   }

   private void id_class(long var1, rrEG var3) {
      CompletableFuture var4 = var3.id_catch();
      var4.thenAcceptAsync(var5 -> {
         CompletableFuture var6 = var3.id_catch();
         if (var6 != var4) {
            this.id_class(var1, var3);
         } else if (this.id_case.remove(var1, var3) && var5 != null) {
            if (var5 instanceof roJ_2) {
               ((roJ_2)var5).id_class(false);
            }

            this.id_class(var5);
            if (this.id_catch.remove(var1) && var5 instanceof roJ_2 var7) {
               this.id_private.id_class(var7);
            }

            this.id_implements.id_class(var5.id_private());
            this.id_implements.id_break();
            this.id_super.id_class(var5.id_private(), null);
         }
      }, this.id_try::add).whenComplete((var1x, var2) -> {
         if (var2 != null) {
            id_byte.error("Failed to save chunk " + var3.id_implements(), var2);
         }
      });
   }

   @Override
   public void close() throws IOException {
      try {
         this.id_int.close();
         this.id_volatile.close();
      } finally {
         super.close();
      }
   }

   protected rrEZ id_break() {
      return this.id_implements;
   }

   public CompletableFuture<Either<roJ_2, rrEM>> id_break(rrEG var1) {
      return var1.id_class(roN_2.id_volatile, this).thenApplyAsync(var0 -> var0.mapLeft(var0x -> {
            roJ_2 var1x = (roJ_2)var0x;
            var1x.id_public();
            return var1x;
         }), var2 -> this.id_continue.id_class(roF_2.id_class(var1, var2)));
   }

   private void id_break(BooleanSupplier var1) {
      LongIterator var2 = this.id_final.iterator();

      for (int var3 = 0; var2.hasNext() && (var1.getAsBoolean() || var3 < 200 || this.id_final.size() > 2000); var2.remove()) {
         long var4 = var2.nextLong();
         rrEG var6 = (rrEG)this.id_protected.remove(var4);
         if (var6 != null) {
            this.id_case.put(var4, var6);
            this.id_package = true;
            var3++;
            this.id_class(var4, var6);
         }
      }

      Runnable var7;
      while ((var1.getAsBoolean() || this.id_try.size() > 2000) && (var7 = this.id_try.poll()) != null) {
         var7.run();
      }
   }

   protected rrEG id_break(long var1) {
      return (rrEG)this.id_throws.get(var1);
   }

   private CompletableFuture<Either<roC_2, rrEM>> id_break(rrEG var1, roN_2 var2) {
      rfj_3 var3 = var1.id_implements();
      CompletableFuture var4 = this.id_class(var3, var2.id_case(), var2x -> this.id_class(var2, var2x));
      return var4.thenComposeAsync(
         var4x -> (CompletionStage<Either<roC_2, rrEM>>)var4x.map(
               var4xx -> {
                  try {
                     CompletableFuture var5 = var2.id_class(
                        this.id_private, this.id_extends, this.id_synchronized, this.id_implements, var2xxx -> this.id_byte(var1), var4xx
                     );
                     this.id_super.id_class(var3, var2);
                     return var5;
                  } catch (Exception var8) {
                     KY var6 = KY.id_class(var8, "Exception generating new chunk");
                     Ko_1 var7 = var6.id_class("Chunk to be generated");
                     var7.id_class("Location", String.format("%d,%d", var3.id_break, var3.id_byte));
                     var7.id_class("Position hash", rfj_3.id_class(var3.id_break, var3.id_byte));
                     var7.id_class("Generator", this.id_extends);
                     throw new KU(var6);
                  }
               },
               var2xx -> {
                  this.id_protected(var3);
                  return CompletableFuture.completedFuture(Either.right(var2xx));
               }
            ),
         var2x -> this.id_new.id_class(roF_2.id_class(var1, var2x))
      );
   }

   protected void id_break(an_3 var1) {
      if (var1 instanceof rhN_2 var2) {
         this.id_class(var2, false);
         ObjectIterator var3 = this.id_goto.values().iterator();

         while (var3.hasNext()) {
            rrEW var4 = (rrEW)var3.next();
            var4.id_class(var2);
         }
      }

      rrEW var5 = (rrEW)this.id_goto.remove(var1.V());
      if (var5 != null) {
         var5.id_class();
      }
   }

   protected void id_break(an_3 var1, ruS_2<?> var2) {
      rrEW var3 = (rrEW)this.id_goto.get(var1.V());
      if (var3 != null) {
         var3.id_break(var2);
      }
   }

   public String id_break(rfj_3 var1) {
      rrEG var2 = this.id_break(var1.id_class());
      if (var2 == null) {
         return "null";
      } else {
         String var3 = var2.id_finally() + "\n";
         roN_2 var4 = var2.id_throws();
         roC_2 var5 = var2.id_case();
         if (var4 != null) {
            var3 = var3 + "St: §" + var4.id_byte() + var4 + "§r\n";
         }

         if (var5 != null) {
            var3 = var3 + "Ch: §" + var5.id_goto().id_byte() + var5.id_goto() + "§r\n";
         }

         rrEJ var6 = var2.id_private();
         var3 = var3 + "§" + var6.ordinal() + var6;
         return var3 + "§r";
      }
   }

   private boolean id_break(rhN_2 var1) {
      return var1.id_native() && !this.id_private.B().id_break(rRu_1.id_int);
   }

   public int id_throws() {
      return this.id_throws.size();
   }

   boolean id_throws(rfj_3 var1) {
      long var2 = var1.id_class();
      return !this.id_this.id_protected(var2) || this.id_public.id_class(var2).noneMatch(var1x -> !var1x.id_native() && id_class(var1, (an_3)var1x) < 16384.0);
   }

   private void id_catch(rfj_3 var1) {
      this.id_while.put(var1.id_class(), (byte)-1);
   }

   protected Iterable<rrEG> id_catch() {
      return Iterables.unmodifiableIterable(this.id_throws.values());
   }

   private CompletableFuture<Either<roC_2, rrEM>> id_case(rfj_3 var1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            rcd_3 var2 = this.id_implements(var1);
            if (var2 != null) {
               boolean var7 = var2.id_byte("Level", 10) && var2.id_int("Level").id_byte("Status", 8);
               if (var7) {
                  rok_3 var4 = roR_2.id_class(this.id_private, this.id_synchronized, this.id_volatile, var1, var2);
                  var4.id_class(this.id_private.r());
                  this.id_class(var1, var4.id_goto().id_catch());
                  return Either.left(var4);
               }

               id_byte.error("Chunk file at {} is missing level data, skipping", var1);
            }
         } catch (KU var5) {
            Throwable var3 = var5.getCause();
            if (!(var3 instanceof IOException)) {
               this.id_catch(var1);
               throw var5;
            }

            id_byte.error("Couldn't load chunk {}", var1, var3);
         } catch (Exception var6) {
            id_byte.error("Couldn't load chunk {}", var1, var6);
         }

         this.id_catch(var1);
         return Either.left(new rok_3(var1, rVh_1.id_class));
      }, this.id_finally);
   }

   protected rrEz_1 id_case() {
      return this.id_this;
   }

   private rcd_3 id_implements(rfj_3 var1) throws IOException {
      rcd_3 var2 = this.id_class(var1);
      return var2 == null ? null : this.id_class(this.id_private.E(), this.id_native, var2);
   }

   protected rga_3 id_implements() {
      return this.id_volatile;
   }

   protected void id_protected(rfj_3 var1) {
      this.id_finally
         .id_private(
            rqR_2.id_class(
               () -> this.id_this.id_break(rrEl_1.id_throws, var1, 33 + roN_2.id_class(roN_2.id_implements), var1), () -> "release light ticket " + var1
            )
         );
   }

   public int id_protected() {
      return this.id_else.get();
   }

   private boolean id_private(rfj_3 var1) {
      byte var2 = this.id_while.get(var1.id_class());
      if (var2 != 0) {
         return var2 == 1;
      } else {
         rcd_3 var3;
         try {
            var3 = this.id_implements(var1);
            if (var3 == null) {
               this.id_catch(var1);
               return false;
            }
         } catch (Exception var5) {
            id_byte.error("Failed to read chunk {}", var1, var5);
            this.id_catch(var1);
            return false;
         }

         roZ_2 var4 = roR_2.id_class(var3);
         return this.id_class(var1, var4) == 1;
      }
   }

   protected void id_private() {
      ArrayList var1 = Lists.newArrayList();
      List var2 = this.id_private.id_continue();
      ObjectIterator var3 = this.id_goto.values().iterator();

      while (var3.hasNext()) {
         rrEW var4 = (rrEW)var3.next();
         rjh_3 var5 = var4.id_throws;
         rjh_3 var6 = rjh_3.id_class(var4.id_byte);
         if (!Objects.equals(var5, var6)) {
            var4.id_class(var2);
            an_3 var7 = var4.id_byte;
            if (var7 instanceof rhN_2) {
               var1.add((rhN_2)var7);
            }

            var4.id_throws = var6;
         }

         var4.id_break.id_class();
      }

      if (!var1.isEmpty()) {
         var3 = this.id_goto.values().iterator();

         while (var3.hasNext()) {
            rrEW var9 = (rrEW)var3.next();
            var9.id_class(var1);
         }
      }
   }
}
