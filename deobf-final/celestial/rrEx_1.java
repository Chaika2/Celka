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
   private static final Logger byte_ = LogManager.getLogger();
   public static final int break_ = 33 + roN_2.break_();
   private final Long2ObjectLinkedOpenHashMap<rrEG> protected_ = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<rrEG> throws_ = this.protected_.clone();
   private final Long2ObjectLinkedOpenHashMap<rrEG> case_ = new Long2ObjectLinkedOpenHashMap();
   private final LongSet catch_ = new LongOpenHashSet();
   final rrEm_1 private_;
   private final rrEZ implements_;
   private final rTQ<Runnable> finally_;
   private final rKd_1 extends_;
   private final Supplier<rrEi_1> native_;
   private final rga_3 volatile_;
   final LongSet final_ = new LongOpenHashSet();
   private boolean package_;
   private final roF_2 int_;
   private final rTX<roL_2<Runnable>> new_;
   private final rTX<roL_2<Runnable>> continue_;
   private final roq_3 super_;
   private final rrEz_1 this_;
   private final AtomicInteger else_ = new AtomicInteger();
   private final rrPt_1 synchronized_;
   private final File return_;
   private final roy_3 public_ = new roy_3();
   private final Int2ObjectMap<rrEW> goto_ = new Int2ObjectOpenHashMap();
   private final Long2ByteMap while_ = new Long2ByteOpenHashMap();
   private final Queue<Runnable> try_ = Queues.newConcurrentLinkedQueue();
   int instanceof_;

   protected boolean byte_() {
      if (!this.package_) {
         return false;
      } else {
         this.throws_ = this.protected_.clone();
         this.package_ = false;
         return true;
      }
   }

   protected IntSupplier byte_(long var1) {
      return () -> {
         rrEG var3 = this.break_(var1);
         return var3 == null ? rov_3.class_ - 1 : Math.min(var3.extends_(), rov_3.class_ - 1);
      };
   }

   private rjh_3 byte_(rhN_2 var1) {
      rjh_3 var2 = rjh_3.class_(var1);
      var1.class_(var2);
      var1.class_.class_(new rFA(var2.break_(), var2.protected_()));
      return var2;
   }

   public CompletableFuture<Either<roJ_2, rrEM>> byte_(rfj_3 var1) {
      return this.class_(var1, 2, var0 -> roN_2.volatile_).thenApplyAsync(var0 -> var0.mapLeft(var0x -> (roJ_2)var0x.get(var0x.size() / 2)), this.finally_);
   }

   private CompletableFuture<Either<roC_2, rrEM>> byte_(rrEG var1) {
      CompletableFuture var2 = var1.class_(roN_2.volatile_.throws_());
      return var2.thenApplyAsync(var2x -> {
         roN_2 var3 = rrEG.break_(var1.finally_());
         return !var3.break_(roN_2.volatile_) ? rrEG.class_ : var2x.mapLeft(var2xx -> {
            rfj_3 var3x = var1.implements_();
            roJ_2 var4;
            if (var2xx instanceof roz_3) {
               var4 = ((roz_3)var2xx).final_();
            } else {
               var4 = new roJ_2(this.private_, (rok_3)var2xx);
               var1.class_(new roz_3(var4));
            }

            var4.class_(() -> rrEG.byte_(var1.finally_()));
            var4.throws_();
            if (this.catch_.add(var3x.class_())) {
               var4.class_(true);
               this.private_.class_(var4.volatile_().values());
               ArrayList var5 = null;
               ryI_2[] var6 = var4.final_();
               int var7 = var6.length;

               for (int var8 = 0; var8 < var7; var8++) {
                  for (an_3 var10 : var6[var8]) {
                     if (!(var10 instanceof rhd_3) && !this.private_.private_(var10)) {
                        if (var5 == null) {
                           var5 = Lists.newArrayList(new an_3[]{var10});
                        } else {
                           var5.add(var10);
                        }
                     }
                  }
               }

               if (var5 != null) {
                  var5.forEach(var4::break_);
               }
            }

            return var4;
         });
      }, var2x -> this.continue_.class_(roF_2.class_(var2x, var1.implements_().class_(), var1::finally_)));
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
      super(new File(var2.class_(var1.E()), "region"), var3, var12);
      this.synchronized_ = var4;
      this.return_ = var2.class_(var1.E());
      this.private_ = var1;
      this.extends_ = var8;
      this.finally_ = var6;
      rTh_1 var13 = rTh_1.class_(var5, "worldgen");
      rTX var14 = rTX.class_("main", var6::private_);
      this.super_ = var9;
      rTh_1 var15 = rTh_1.class_(var5, "light");
      this.int_ = new roF_2(ImmutableList.of(var13, var14, var15), var5, Integer.MAX_VALUE);
      this.new_ = this.int_.class_(var13, false);
      this.continue_ = this.int_.class_(var14, false);
      this.implements_ = new rrEZ(var7, this, this.private_.default_().break_(), var15, this.int_.class_(var15, false));
      this.this_ = new rrEz_1(this, var5, var6);
      this.native_ = var10;
      this.volatile_ = new rga_3(new File(this.return_, "poi"), var3, var12);
      this.class_(var11);
   }

   private void class_(rhN_2 var1, ruS_2<?>[] var2, roJ_2 var3) {
      if (var2[0] == null) {
         var2[0] = new rZD(var3, 65535);
         var2[1] = new rFC(var3.private_(), this.implements_, true);
      }

      var1.class_(var3.private_(), var2[0], var2[1]);
      ruP_2.class_(this.private_, var3.private_());
      ArrayList var4 = Lists.newArrayList();
      ArrayList var5 = Lists.newArrayList();
      ObjectIterator var6 = this.goto_.values().iterator();

      while (var6.hasNext()) {
         rrEW var7 = (rrEW)var6.next();
         an_3 var8 = var7.byte_;
         if (var8 != var1 && (Integer)var8.throws_[51] == var3.private_().break_ && (Integer)var8.throws_[53] == var3.private_().byte_) {
            var7.break_(var1);
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
            var1.class_.class_(new rvA_2(var11, ((is_3)var11).N()));
         }
      }

      if (!var5.isEmpty()) {
         for (an_3 var12 : var5) {
            var1.class_.class_(new rFb_1(var12));
         }
      }
   }

   protected rrEG class_(long var1) {
      return (rrEG)this.protected_.get(var1);
   }

   protected void class_(an_3 var1, ruS_2<?> var2) {
      rrEW var3 = (rrEW)this.goto_.get(var1.V());
      if (var3 != null) {
         var3.class_(var2);
      }
   }

   protected void class_(an_3 var1) {
      boolean var2 = var1 instanceof rSm_1;
      if (rrxr_3.BA.byte_()) {
         var2 = rrxr_3.BA.class_(var1);
      }

      if (!var2) {
         aI_2 var3 = var1.BC();
         int var4 = var3.final_() * 16;
         int var5 = var3.package_();
         if (this.goto_.containsKey(var1.V())) {
            throw (IllegalStateException)rqR_2.byte_(new IllegalStateException("Entity is already tracked!"));
         }

         rrEW var6 = new rrEW(this, var1, var4, var5, var3.int_());
         this.goto_.put(var1.V(), var6);
         var6.class_(this.private_.continue_());
         if (var1 instanceof rhN_2 var7) {
            this.class_(var7, true);
            ObjectIterator var8 = this.goto_.values().iterator();

            while (var8.hasNext()) {
               rrEW var9 = (rrEW)var8.next();
               if (var9.byte_ != var7) {
                  var9.break_(var7);
               }
            }
         }
      }
   }

   @Override
   public Stream<rhN_2> class_(rfj_3 var1, boolean var2) {
      return this.public_.class_(var1.class_()).filter(var3 -> {
         int var4 = class_(var1, var3, true);
         return var4 > this.instanceof_ ? false : !var2 || var4 == this.instanceof_;
      });
   }

   public void class_(rhN_2 var1) {
      ObjectIterator var2 = this.goto_.values().iterator();

      while (var2.hasNext()) {
         rrEW var3 = (rrEW)var2.next();
         if (var3.byte_ == var1) {
            var3.class_(this.private_.continue_());
         } else {
            var3.break_(var1);
         }
      }

      int var24 = rfU_2.byte_(var1.rx()) >> 4;
      int var25 = rfU_2.byte_(var1.BO()) >> 4;
      rjh_3 var4 = var1.M();
      rjh_3 var5 = rjh_3.class_(var1);
      long var6 = var4.new_().class_();
      long var8 = var5.new_().class_();
      boolean var10 = this.public_.protected_(var1);
      boolean var11 = this.break_(var1);
      boolean var12 = var4.continue_() != var5.continue_();
      if (var12 || var10 != var11) {
         this.byte_(var1);
         if (!var10) {
            this.this_.break_(var4, var1);
         }

         if (!var11) {
            this.this_.class_(var5, var1);
         }

         if (!var10 && var11) {
            this.public_.class_(var1);
         }

         if (var10 && !var11) {
            this.public_.break_(var1);
         }

         if (var6 != var8) {
            this.public_.class_(var6, var8, var1);
         }
      }

      int var13 = var4.break_();
      int var14 = var4.protected_();
      if (Math.abs(var13 - var24) <= this.instanceof_ * 2 && Math.abs(var14 - var25) <= this.instanceof_ * 2) {
         int var27 = Math.min(var24, var13) - this.instanceof_;
         int var29 = Math.min(var25, var14) - this.instanceof_;
         int var31 = Math.max(var24, var13) + this.instanceof_;
         int var33 = Math.max(var25, var14) + this.instanceof_;

         for (int var35 = var27; var35 <= var31; var35++) {
            for (int var20 = var29; var20 <= var33; var20++) {
               rfj_3 var21 = new rfj_3(var35, var20);
               boolean var22 = class_(var21, var13, var14) <= this.instanceof_;
               boolean var23 = class_(var21, var24, var25) <= this.instanceof_;
               this.class_(var1, var21, new ruS_2[2], var22, var23);
            }
         }
      } else {
         for (int var15 = var13 - this.instanceof_; var15 <= var13 + this.instanceof_; var15++) {
            for (int var16 = var14 - this.instanceof_; var16 <= var14 + this.instanceof_; var16++) {
               rfj_3 var17 = new rfj_3(var15, var16);
               boolean var18 = true;
               boolean var19 = false;
               this.class_(var1, var17, new ruS_2[2], true, false);
            }
         }

         for (int var26 = var24 - this.instanceof_; var26 <= var24 + this.instanceof_; var26++) {
            for (int var28 = var25 - this.instanceof_; var28 <= var25 + this.instanceof_; var28++) {
               rfj_3 var30 = new rfj_3(var26, var28);
               boolean var32 = false;
               boolean var34 = true;
               this.class_(var1, var30, new ruS_2[2], false, true);
            }
         }
      }
   }

   public CompletableFuture<Void> class_(roJ_2 var1) {
      return this.finally_.case_(() -> var1.class_(this.private_));
   }

   private static int class_(rfj_3 var0, int var1, int var2) {
      int var3 = var0.break_ - var1;
      int var4 = var0.byte_ - var2;
      return Math.max(Math.abs(var3), Math.abs(var4));
   }

   private static double class_(rfj_3 var0, an_3 var1) {
      double var2 = (double)(var0.break_ * 16 + 8);
      double var4 = (double)(var0.byte_ * 16 + 8);
      double var6 = var2 - var1.rx();
      double var8 = var4 - var1.BO();
      return var6 * var6 + var8 * var8;
   }

   static int class_(rfj_3 var0, rhN_2 var1, boolean var2) {
      int var3;
      int var4;
      if (var2) {
         rjh_3 var5 = var1.M();
         var3 = var5.break_();
         var4 = var5.protected_();
      } else {
         var3 = rfU_2.byte_(var1.rx() / 16.0);
         var4 = rfU_2.byte_(var1.BO() / 16.0);
      }

      return class_(var0, var3, var4);
   }

   private byte class_(rfj_3 var1, roZ_2 var2) {
      return this.while_.put(var1.class_(), (byte)(var2 == roZ_2.PROTOCHUNK ? -1 : 1));
   }

   public CompletableFuture<Either<roJ_2, rrEM>> class_(rrEG var1) {
      rfj_3 var2 = var1.implements_();
      CompletableFuture var3 = this.class_(var2, 1, var0 -> roN_2.volatile_);
      CompletableFuture var4 = var3.thenApplyAsync(var0 -> var0.flatMap(var0x -> {
            roJ_2 var1x = (roJ_2)var0x.get(var0x.size() / 2);
            var1x.else_();
            return Either.left(var1x);
         }), var2x -> this.continue_.class_(roF_2.class_(var1, var2x)));
      var4.thenAcceptAsync(var2x -> var2x.mapLeft(var2xx -> {
            this.else_.getAndIncrement();
            ruS_2[] var3x = new ruS_2[2];
            this.class_(var2, false).forEach(var3xx -> this.class_(var3xx, var3x, var2xx));
            return Either.left(var2xx);
         }), var2x -> this.continue_.class_(roF_2.class_(var1, var2x)));
      return var4;
   }

   void class_(Writer var1) throws IOException {
      ryT_2 var2 = ryT_2.class_()
         .class_("x")
         .class_("z")
         .class_("level")
         .class_("in_memory")
         .class_("status")
         .class_("full_status")
         .class_("accessible_ready")
         .class_("ticking_ready")
         .class_("entity_ticking_ready")
         .class_("ticket")
         .class_("spawning")
         .class_("entity_count")
         .class_("block_entity_count")
         .class_(var1);
      ObjectBidirectionalIterator var3 = this.throws_.long2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         rfj_3 var5 = new rfj_3(var4.getLongKey());
         rrEG var6 = (rrEG)var4.getValue();
         Optional var7 = Optional.ofNullable(var6.case_());
         Optional var8 = var7.flatMap(var0 -> var0 instanceof roJ_2 ? Optional.of((roC_2)var0) : Optional.empty());
         var2.class_(
            var5.break_,
            var5.byte_,
            var6.finally_(),
            var7.isPresent(),
            var7.map(roC_2::goto_).orElse(null),
            var8.map(roJ_2::instanceof_).orElse(null),
            class_(var6.byte_()),
            class_(var6.class_()),
            class_(var6.break_()),
            this.this_.byte_(var4.getLongKey()),
            !this.throws_(var5),
            var8.<Integer>map(var0 -> Stream.of(var0.final_()).mapToInt(ryI_2::size).sum()).orElse(0),
            var8.<Integer>map(var0 -> var0.volatile_().size()).orElse(0)
         );
      }
   }

   private static String class_(CompletableFuture<Either<roJ_2, rrEM>> var0) {
      try {
         Either var1 = (Either)var0.getNow(null);
         return var1 != null ? (String)var1.map(var0x -> "done", var0x -> "unloaded") : "not completed";
      } catch (CompletionException var2) {
         return "failed " + var2.getCause().getMessage();
      } catch (CancellationException var3) {
         return "cancelled";
      }
   }

   public CompletableFuture<Either<roC_2, rrEM>> class_(rrEG var1, roN_2 var2) {
      rfj_3 var3 = var1.implements_();
      if (var2 == roN_2.class_) {
         return this.case_(var3);
      } else {
         CompletableFuture var4 = var1.class_(var2.throws_(), this);
         return var4.thenComposeAsync(var4x -> {
            Optional var5 = var4x.left();
            if (!var5.isPresent()) {
               return CompletableFuture.completedFuture((Either<roC_2, rrEM>)var4x);
            } else {
               if (var2 == roN_2.finally_) {
                  this.this_.class_(rrEl_1.throws_, var3, 33 + roN_2.class_(roN_2.implements_), var3);
               }

               roC_2 var6 = (roC_2)var5.get();
               if (var6.goto_().break_(var2)) {
                  CompletableFuture var7;
                  if (var2 == roN_2.finally_) {
                     var7 = this.break_(var1, var2);
                  } else {
                     var7 = var2.class_(this.private_, this.synchronized_, this.implements_, var2xx -> this.byte_(var1), var6);
                  }

                  this.super_.class_(var3, var2);
                  return var7;
               } else {
                  return this.break_(var1, var2);
               }
            }
         }, this.finally_);
      }
   }

   protected void class_(rhN_2 var1, rfj_3 var2, ruS_2<?>[] var3, boolean var4, boolean var5) {
      if ((rYB)var1.throws_[7] == this.private_) {
         if (rrxr_3.j.byte_()) {
            rrxr_3.j.class_(var4, var5, var1, var2, this.private_);
         }

         if (var5 && !var4) {
            rrEG var6 = this.break_(var2.class_());
            if (var6 != null) {
               roJ_2 var7 = var6.protected_();
               if (var7 != null) {
                  this.class_(var1, var3, var7);
               }

               ruP_2.class_(this.private_, var2);
            }
         }

         if (!var5 && var4) {
            var1.class_(var2);
         }
      }
   }

   rrEG class_(long var1, int var3, rrEG var4, int var5) {
      if (var5 > break_ && var3 > break_) {
         return var4;
      } else {
         if (var4 != null) {
            var4.class_(var3);
         }

         if (var4 != null) {
            if (var3 > break_) {
               this.final_.add(var1);
            } else {
               this.final_.remove(var1);
            }
         }

         if (var3 <= break_ && var4 == null) {
            var4 = (rrEG)this.case_.remove(var1);
            if (var4 != null) {
               var4.class_(var3);
            } else {
               var4 = new rrEG(new rfj_3(var1), var3, this.implements_, this.int_, this);
            }

            this.protected_.put(var1, var4);
            this.package_ = true;
         }

         return var4;
      }
   }

   private roN_2 class_(roN_2 var1, int var2) {
      roN_2 var3;
      if (var2 == 0) {
         var3 = var1.throws_();
      } else {
         var3 = roN_2.class_(roN_2.class_(var1) + var2);
      }

      return var3;
   }

   protected void class_(int var1) {
      int var2 = rfU_2.class_(var1 + 1, 3, 64);
      if (var2 != this.instanceof_) {
         int var3 = this.instanceof_;
         this.instanceof_ = var2;
         this.this_.class_(this.instanceof_);
         ObjectIterator var4 = this.protected_.values().iterator();

         while (var4.hasNext()) {
            rrEG var5 = (rrEG)var4.next();
            rfj_3 var6 = var5.implements_();
            ruS_2[] var7 = new ruS_2[2];
            this.class_(var6, false).forEach(var4x -> {
               int var5x = class_(var6, var4x, true);
               boolean var6x = var5x <= var3;
               boolean var7x = var5x <= this.instanceof_;
               this.class_(var4x, var6, var7, var6x, var7x);
            });
         }
      }
   }

   private boolean class_(roC_2 var1) {
      this.volatile_.class_(var1.private_());
      if (!var1.continue_()) {
         return false;
      } else {
         var1.class_(this.private_.r());
         var1.break_(false);
         rfj_3 var2 = var1.private_();

         try {
            roN_2 var3 = var1.goto_();
            if (var3.catch_() != roZ_2.LEVELCHUNK) {
               if (this.private_(var2)) {
                  return false;
               }

               if (var3 == roN_2.class_ && var1.super_().values().stream().noneMatch(rrrH::throws_)) {
                  return false;
               }
            }

            rcd_3 var4 = roR_2.class_(this.private_, var1);
            this.class_(var2, var4);
            this.class_(var2, var3.catch_());
            return true;
         } catch (Exception var5) {
            byte_.error("Failed to save chunk {},{}", var2.break_, var2.byte_, var5);
            return false;
         }
      }
   }

   private CompletableFuture<Either<List<roC_2>, rrEM>> class_(rfj_3 var1, int var2, IntFunction<roN_2> var3) {
      ArrayList var4 = Lists.newArrayList();
      int var5 = var1.break_;
      int var6 = var1.byte_;

      for (int var7 = -var2; var7 <= var2; var7++) {
         for (int var8 = -var2; var8 <= var2; var8++) {
            int var9 = Math.max(Math.abs(var8), Math.abs(var7));
            rfj_3 var10 = new rfj_3(var5 + var8, var6 + var7);
            long var11 = var10.class_();
            rrEG var13 = this.class_(var11);
            if (var13 == null) {
               return CompletableFuture.completedFuture(Either.right(new rrEd_1(this, var10)));
            }

            roN_2 var14 = (roN_2)var3.apply(var9);
            CompletableFuture var15 = var13.class_(var14, this);
            var4.add(var15);
         }
      }

      CompletableFuture var16 = rqR_2.break_(var4);
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

   protected void class_(boolean var1) {
      if (var1) {
         List var2 = this.throws_.values().stream().filter(rrEG::native_).peek(rrEG::volatile_).collect(Collectors.toList());
         MutableBoolean var3 = new MutableBoolean();

         do {
            var3.setFalse();
            var2.stream().map(var1x -> {
               CompletableFuture var2x;
               do {
                  var2x = var1x.catch_();
                  this.finally_.byte_(var2x::isDone);
               } while (var2x != var1x.catch_());

               return (roC_2)var2x.join();
            }).filter(var0 -> var0 instanceof roz_3 || var0 instanceof roJ_2).filter(this::class_).forEach(var1x -> var3.setTrue());
         } while (var3.isTrue());

         this.break_((BooleanSupplier)(() -> true));
         this.class_();
         byte_.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", this.return_.getName());
      } else {
         this.throws_.values().stream().filter(rrEG::native_).forEach(var1x -> {
            roC_2 var2x = var1x.catch_().getNow(null);
            if (var2x instanceof roz_3 || var2x instanceof roJ_2) {
               this.class_(var2x);
               var1x.volatile_();
            }
         });
      }
   }

   void class_(rhN_2 var1, boolean var2) {
      boolean var3 = this.break_(var1);
      boolean var4 = this.public_.byte_(var1);
      int var5 = rfU_2.byte_(var1.rx()) >> 4;
      int var6 = rfU_2.byte_(var1.BO()) >> 4;
      if (var2) {
         this.public_.class_(rfj_3.class_(var5, var6), var1, var3);
         this.byte_(var1);
         if (!var3) {
            this.this_.class_(rjh_3.class_(var1), var1);
         }
      } else {
         rjh_3 var7 = var1.M();
         this.public_.class_(var7.new_().class_(), var1);
         if (!var4) {
            this.this_.break_(var7, var1);
         }
      }

      for (int var10 = var5 - this.instanceof_; var10 <= var5 + this.instanceof_; var10++) {
         for (int var8 = var6 - this.instanceof_; var8 <= var6 + this.instanceof_; var8++) {
            rfj_3 var9 = new rfj_3(var10, var8);
            this.class_(var1, var9, new ruS_2[2], !var2, var2);
         }
      }
   }

   protected void class_(BooleanSupplier var1) {
      this.volatile_.class_(var1);
      if (!this.private_.G()) {
         this.break_(var1);
      }
   }

   private void class_(long var1, rrEG var3) {
      CompletableFuture var4 = var3.catch_();
      var4.thenAcceptAsync(var5 -> {
         CompletableFuture var6 = var3.catch_();
         if (var6 != var4) {
            this.class_(var1, var3);
         } else if (this.case_.remove(var1, var3) && var5 != null) {
            if (var5 instanceof roJ_2) {
               ((roJ_2)var5).class_(false);
            }

            this.class_(var5);
            if (this.catch_.remove(var1) && var5 instanceof roJ_2 var7) {
               this.private_.class_(var7);
            }

            this.implements_.class_(var5.private_());
            this.implements_.break_();
            this.super_.class_(var5.private_(), null);
         }
      }, this.try_::add).whenComplete((var1x, var2) -> {
         if (var2 != null) {
            byte_.error("Failed to save chunk " + var3.implements_(), var2);
         }
      });
   }

   @Override
   public void close() throws IOException {
      try {
         this.int_.close();
         this.volatile_.close();
      } finally {
         super.close();
      }
   }

   protected rrEZ break_() {
      return this.implements_;
   }

   public CompletableFuture<Either<roJ_2, rrEM>> break_(rrEG var1) {
      return var1.class_(roN_2.volatile_, this).thenApplyAsync(var0 -> var0.mapLeft(var0x -> {
            roJ_2 var1x = (roJ_2)var0x;
            var1x.public_();
            return var1x;
         }), var2 -> this.continue_.class_(roF_2.class_(var1, var2)));
   }

   private void break_(BooleanSupplier var1) {
      LongIterator var2 = this.final_.iterator();

      for (int var3 = 0; var2.hasNext() && (var1.getAsBoolean() || var3 < 200 || this.final_.size() > 2000); var2.remove()) {
         long var4 = var2.nextLong();
         rrEG var6 = (rrEG)this.protected_.remove(var4);
         if (var6 != null) {
            this.case_.put(var4, var6);
            this.package_ = true;
            var3++;
            this.class_(var4, var6);
         }
      }

      Runnable var7;
      while ((var1.getAsBoolean() || this.try_.size() > 2000) && (var7 = this.try_.poll()) != null) {
         var7.run();
      }
   }

   protected rrEG break_(long var1) {
      return (rrEG)this.throws_.get(var1);
   }

   private CompletableFuture<Either<roC_2, rrEM>> break_(rrEG var1, roN_2 var2) {
      rfj_3 var3 = var1.implements_();
      CompletableFuture var4 = this.class_(var3, var2.case_(), var2x -> this.class_(var2, var2x));
      return var4.thenComposeAsync(var4x -> (CompletionStage<Either<roC_2, rrEM>>)var4x.map(var4xx -> {
            try {
               CompletableFuture var5 = var2.class_(this.private_, this.extends_, this.synchronized_, this.implements_, var2xxx -> this.byte_(var1), var4xx);
               this.super_.class_(var3, var2);
               return var5;
            } catch (Exception var8) {
               KY var6 = KY.class_(var8, "Exception generating new chunk");
               Ko_1 var7 = var6.class_("Chunk to be generated");
               var7.class_("Location", String.format("%d,%d", var3.break_, var3.byte_));
               var7.class_("Position hash", rfj_3.class_(var3.break_, var3.byte_));
               var7.class_("Generator", this.extends_);
               throw new KU(var6);
            }
         }, var2xx -> {
            this.protected_(var3);
            return CompletableFuture.completedFuture(Either.right(var2xx));
         }), var2x -> this.new_.class_(roF_2.class_(var1, var2x)));
   }

   protected void break_(an_3 var1) {
      if (var1 instanceof rhN_2 var2) {
         this.class_(var2, false);
         ObjectIterator var3 = this.goto_.values().iterator();

         while (var3.hasNext()) {
            rrEW var4 = (rrEW)var3.next();
            var4.class_(var2);
         }
      }

      rrEW var5 = (rrEW)this.goto_.remove(var1.V());
      if (var5 != null) {
         var5.class_();
      }
   }

   protected void break_(an_3 var1, ruS_2<?> var2) {
      rrEW var3 = (rrEW)this.goto_.get(var1.V());
      if (var3 != null) {
         var3.break_(var2);
      }
   }

   public String break_(rfj_3 var1) {
      rrEG var2 = this.break_(var1.class_());
      if (var2 == null) {
         return "null";
      } else {
         String var3 = var2.finally_() + "\n";
         roN_2 var4 = var2.throws_();
         roC_2 var5 = var2.case_();
         if (var4 != null) {
            var3 = var3 + "St: §" + var4.byte_() + var4 + "§r\n";
         }

         if (var5 != null) {
            var3 = var3 + "Ch: §" + var5.goto_().byte_() + var5.goto_() + "§r\n";
         }

         rrEJ var6 = var2.private_();
         var3 = var3 + "§" + var6.ordinal() + var6;
         return var3 + "§r";
      }
   }

   private boolean break_(rhN_2 var1) {
      return var1.native_() && !this.private_.B().break_(rRu_1.int_);
   }

   public int throws_() {
      return this.throws_.size();
   }

   boolean throws_(rfj_3 var1) {
      long var2 = var1.class_();
      return !this.this_.protected_(var2) || this.public_.class_(var2).noneMatch(var1x -> !var1x.native_() && class_(var1, (an_3)var1x) < 16384.0);
   }

   private void catch_(rfj_3 var1) {
      this.while_.put(var1.class_(), (byte)-1);
   }

   protected Iterable<rrEG> catch_() {
      return Iterables.unmodifiableIterable(this.throws_.values());
   }

   private CompletableFuture<Either<roC_2, rrEM>> case_(rfj_3 var1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            rcd_3 var2 = this.implements_(var1);
            if (var2 != null) {
               boolean var7 = var2.byte_("Level", 10) && var2.int_("Level").byte_("Status", 8);
               if (var7) {
                  rok_3 var4 = roR_2.class_(this.private_, this.synchronized_, this.volatile_, var1, var2);
                  var4.class_(this.private_.r());
                  this.class_(var1, var4.goto_().catch_());
                  return Either.left(var4);
               }

               byte_.error("Chunk file at {} is missing level data, skipping", var1);
            }
         } catch (KU var5) {
            Throwable var3 = var5.getCause();
            if (!(var3 instanceof IOException)) {
               this.catch_(var1);
               throw var5;
            }

            byte_.error("Couldn't load chunk {}", var1, var3);
         } catch (Exception var6) {
            byte_.error("Couldn't load chunk {}", var1, var6);
         }

         this.catch_(var1);
         return Either.left(new rok_3(var1, rVh_1.class_));
      }, this.finally_);
   }

   protected rrEz_1 case_() {
      return this.this_;
   }

   private rcd_3 implements_(rfj_3 var1) throws IOException {
      rcd_3 var2 = this.class_(var1);
      return var2 == null ? null : this.class_(this.private_.E(), this.native_, var2);
   }

   protected rga_3 implements_() {
      return this.volatile_;
   }

   protected void protected_(rfj_3 var1) {
      this.finally_
         .private_(
            rqR_2.class_(() -> this.this_.break_(rrEl_1.throws_, var1, 33 + roN_2.class_(roN_2.implements_), var1), () -> "release light ticket " + var1)
         );
   }

   public int protected_() {
      return this.else_.get();
   }

   private boolean private_(rfj_3 var1) {
      byte var2 = this.while_.get(var1.class_());
      if (var2 != 0) {
         return var2 == 1;
      } else {
         rcd_3 var3;
         try {
            var3 = this.implements_(var1);
            if (var3 == null) {
               this.catch_(var1);
               return false;
            }
         } catch (Exception var5) {
            byte_.error("Failed to read chunk {}", var1, var5);
            this.catch_(var1);
            return false;
         }

         roZ_2 var4 = roR_2.class_(var3);
         return this.class_(var1, var4) == 1;
      }
   }

   protected void private_() {
      ArrayList var1 = Lists.newArrayList();
      List var2 = this.private_.continue_();
      ObjectIterator var3 = this.goto_.values().iterator();

      while (var3.hasNext()) {
         rrEW var4 = (rrEW)var3.next();
         rjh_3 var5 = var4.throws_;
         rjh_3 var6 = rjh_3.class_(var4.byte_);
         if (!Objects.equals(var5, var6)) {
            var4.class_(var2);
            an_3 var7 = var4.byte_;
            if (var7 instanceof rhN_2) {
               var1.add((rhN_2)var7);
            }

            var4.throws_ = var6;
         }

         var4.break_.class_();
      }

      if (!var1.isEmpty()) {
         var3 = this.goto_.values().iterator();

         while (var3.hasNext()) {
            rrEW var9 = (rrEW)var3.next();
            var9.class_(var1);
         }
      }
   }
}
