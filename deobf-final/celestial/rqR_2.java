package celestial;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.MoreExecutors;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.Hash.Strategy;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rqR_2 {
   private static final AtomicInteger byte_ = new AtomicInteger(1);
   private static final ExecutorService protected_ = class_("Bootstrap");
   private static final ExecutorService throws_ = class_("Main");
   private static final ExecutorService case_ = package_();
   public static LongSupplier class_ = System::nanoTime;
   public static final UUID break_ = new UUID(0L, 0L);
   static final Logger catch_ = LogManager.getLogger();
   static Exception private_;
   private static final ExecutorService implements_ = class_("Cape");

   public static long byte_() {
      return class_.getAsLong();
   }

   private static BooleanSupplier byte_(Path var0) {
      return new rqU_2(var0);
   }

   public static <T extends Throwable> T byte_(T var0) {
      if (rqu_3.byte_) {
         catch_.error("Trying to throw a fatal exception, pausing in IDE", var0);

         while (true) {
            try {
               Thread.sleep(1000L);
               catch_.error("paused");
            } catch (InterruptedException var2) {
               return (T)var0;
            }
         }
      } else {
         return (T)var0;
      }
   }

   private static BooleanSupplier class_(Path var0, Path var1) {
      return new rqo_3(var0, var1);
   }

   private static BooleanSupplier class_(Path var0) {
      return new rqK_2(var0);
   }

   public static <K, V> Collector<Entry<? extends K, ? extends V>, ?, Map<K, V>> class_() {
      return Collectors.toMap(Entry::getKey, Entry::getValue);
   }

   private static boolean class_(BooleanSupplier... var0) {
      for (BooleanSupplier var4 : var0) {
         if (!var4.getAsBoolean()) {
            catch_.warn("Failed to execute {}", var4);
            return false;
         }
      }

      return true;
   }

   private static boolean class_(int var0, String var1, BooleanSupplier... var2) {
      for (int var3 = 0; var3 < var0; var3++) {
         if (class_(var2)) {
            return true;
         }

         catch_.error("Failed to {}, retrying {}/{}", var1, var3, var0);
      }

      catch_.error("Failed to {}, aborting, progress might be lost", var1);
      return false;
   }

   public static void class_(File var0, File var1, File var2) {
      class_(var0.toPath(), var1.toPath(), var2.toPath());
   }

   public static String class_(String var0, rqO_2 var1) {
      return var1 == null ? var0 + ".unregistered_sadface" : var0 + "." + var1.byte_() + "." + var1.break_().replace('/', '.');
   }

   public static <T> Optional<T> class_(Optional<T> var0, Consumer<T> var1, Runnable var2) {
      if (var0.isPresent()) {
         var1.accept(var0.get());
      } else {
         var2.run();
      }

      return var0;
   }

   public static void class_(Exception var0) {
      private_ = var0;
   }

   public static <T extends Comparable<T>> String class_(rCZ<T> var0, Object var1) {
      return var0.class_((T)var1);
   }

   public static <T> T class_(T[] var0, Random var1) {
      return (T)var0[var1.nextInt(var0.length)];
   }

   public static int class_(int[] var0, Random var1) {
      return var0[var1.nextInt(var0.length)];
   }

   public static void class_(Path var0, Path var1, Path var2) {
      byte var3 = 10;
      if ((!Files.exists(var0) || class_(10, "create backup " + var2, class_(var2), class_(var0, var2), byte_(var2)))
         && class_(10, "remove old " + var0, class_(var0), break_(var0))
         && !class_(10, "replace " + var0 + " with " + var1, class_(var1, var0), byte_(var0))) {
         class_(10, "restore " + var0 + " from " + var2, class_(var2, var0), byte_(var0));
      }
   }

   public static int class_(String var0, int var1, int var2) {
      int var3 = var0.length();
      if (var2 >= 0) {
         for (int var4 = 0; var1 < var3 && var4 < var2; var4++) {
            if (Character.isHighSurrogate(var0.charAt(var1++)) && var1 < var3 && Character.isLowSurrogate(var0.charAt(var1))) {
               var1++;
            }
         }
      } else {
         for (int var5 = var2; var1 > 0 && var5 < 0; var5++) {
            var1--;
            if (Character.isLowSurrogate(var0.charAt(var1)) && var1 > 0 && Character.isHighSurrogate(var0.charAt(var1 - 1))) {
               var1--;
            }
         }
      }

      return var1;
   }

   public static Consumer<String> class_(String var0, Consumer<String> var1) {
      return var2 -> var1.accept(var0 + var2);
   }

   public static DataResult<int[]> class_(IntStream var0, int var1) {
      int[] var2 = var0.limit((long)(var1 + 1)).toArray();
      if (var2.length != var1) {
         String var3 = "Input is not a list of " + var1 + " ints";
         return var2.length >= var1 ? DataResult.error(var3, Arrays.copyOf(var2, var1)) : DataResult.error(var3);
      } else {
         return DataResult.success(var2);
      }
   }

   public static String class_(String var0, VY var1) {
      return var0.toLowerCase(Locale.ROOT)
         .chars()
         .mapToObj(var1x -> var1.test((char)var1x) ? Character.toString((char)var1x) : "_")
         .collect(Collectors.joining());
   }

   private static void class_(ExecutorService var0) {
      var0.shutdown();

      boolean var1;
      try {
         var1 = var0.awaitTermination(3L, TimeUnit.SECONDS);
      } catch (InterruptedException var3) {
         var1 = false;
      }

      if (!var1) {
         var0.shutdownNow();
      }
   }

   public static <T> T class_(Supplier<T> var0) {
      return (T)var0.get();
   }

   public static <T> T class_(Iterable<T> var0, T var1) {
      Iterator var2 = var0.iterator();
      Object var3 = var2.next();
      if (var1 != null) {
         Object var4 = var3;

         while (var4 != var1) {
            if (var2.hasNext()) {
               var4 = var2.next();
            }
         }

         if (var2.hasNext()) {
            return (T)var2.next();
         }
      }

      return (T)var3;
   }

   public static <T> T class_(List<T> var0) {
      return (T)var0.get(var0.size() - 1);
   }

   public static <T> CompletableFuture<T> class_(Throwable var0) {
      CompletableFuture var1 = new CompletableFuture();
      var1.completeExceptionally(var0);
      return var1;
   }

   public static Type<?> class_(TypeReference var0, String var1) {
      return !rqu_3.break_ ? null : break_(var0, var1);
   }

   private static void class_(Thread var0, Throwable var1) {
      byte_(var1);
      if (var1 instanceof CompletionException) {
         var1 = var1.getCause();
      }

      if (var1 instanceof KU) {
         rVN.class_(((KU)var1).class_().protected_());
         System.exit(-1);
      }

      catch_.error(String.format("Caught exception in thread %s", var0), var1);
   }

   public static <T> Stream<T> class_(Optional<? extends T> var0) {
      return var0.isPresent() ? Stream.of((T)var0.get()) : Stream.empty();
   }

   public static Runnable class_(Runnable var0, Supplier<String> var1) {
      return var0;
   }

   private static ExecutorService class_(String var0) {
      int var1 = rfU_2.class_(Runtime.getRuntime().availableProcessors() - 1, 1, 7);
      Object var2;
      if (var1 <= 0) {
         var2 = MoreExecutors.newDirectExecutorService();
      } else {
         var2 = new ForkJoinPool(var1, var1x -> {
            rqY_2 var2x = new rqY_2(var1x);
            var2x.setName("Worker-" + var0 + "-" + byte_.getAndIncrement());
            return var2x;
         }, rqR_2::class_, true);
      }

      return (ExecutorService)var2;
   }

   public static <T> T class_(T var0, Consumer<T> var1) {
      var1.accept(var0);
      return (T)var0;
   }

   public static long break_() {
      return byte_() / 1000000L;
   }

   public static void break_(Throwable var0) {
      throw var0 instanceof RuntimeException ? (RuntimeException)var0 : new RuntimeException(var0);
   }

   public static void break_(Path var0, Path var1, Path var2) throws IOException {
      Path var3 = var0.relativize(var2);
      Path var4 = var1.resolve(var3);
      Files.copy(var2, var4);
   }

   public static <V> CompletableFuture<List<V>> break_(List<? extends CompletableFuture<? extends V>> var0) {
      ArrayList var1 = Lists.newArrayListWithCapacity(var0.size());
      CompletableFuture[] var2 = new CompletableFuture[var0.size()];
      CompletableFuture var3 = new CompletableFuture();
      var0.forEach(var3x -> {
         int var4 = var1.size();
         var1.add(null);
         var2[var4] = var3x.whenComplete((var3xx, var4x) -> {
            if (var4x != null) {
               var3.completeExceptionally(var4x);
            } else {
               var1.set(var4, var3xx);
            }
         });
      });
      return CompletableFuture.allOf(var2).applyToEither(var3, var1x -> var1);
   }

   public static <T> T break_(Iterable<T> var0, T var1) {
      Iterator var2 = var0.iterator();
      Object var3 = null;

      while (var2.hasNext()) {
         Object var4 = var2.next();
         if (var4 == var1) {
            if (var3 == null) {
               var3 = var2.hasNext() ? Iterators.getLast(var2) : var1;
            }
            break;
         }

         var3 = var4;
      }

      return (T)var3;
   }

   private static BooleanSupplier break_(Path var0) {
      return new rqD_2(var0);
   }

   private static Type<?> break_(TypeReference var0, String var1) {
      Type var2 = null;

      try {
         var2 = rTu_1.class_().getSchema(DataFixUtils.makeKey(rqu_3.class_().getWorldVersion())).getChoiceType(var0, var1);
      } catch (IllegalArgumentException var4) {
         catch_.debug("No data fixer registered for {}", var1);
         if (rqu_3.byte_) {
            throw var4;
         }
      }

      return var2;
   }

   public static Executor throws_() {
      return protected_;
   }

   public static Stream<String> finally_() {
      RuntimeMXBean var0 = ManagementFactory.getRuntimeMXBean();
      return var0.getInputArguments().stream().filter(var0x -> var0x.startsWith("-X"));
   }

   public static Executor catch_() {
      return case_;
   }

   public static <K> Strategy<K> extends_() {
      return rqa_3.INSTANCE;
   }

   public static Executor case_() {
      return throws_;
   }

   public static rqi_3 implements_() {
      String var0 = System.getProperty("os.name").toLowerCase(Locale.ROOT);
      if (var0.contains("win")) {
         return rqi_3.WINDOWS;
      } else if (var0.contains("mac")) {
         return rqi_3.OSX;
      } else if (var0.contains("solaris")) {
         return rqi_3.SOLARIS;
      } else if (var0.contains("sunos")) {
         return rqi_3.SOLARIS;
      } else if (var0.contains("linux")) {
         return rqi_3.LINUX;
      } else {
         return var0.contains("unix") ? rqi_3.LINUX : rqi_3.UNKNOWN;
      }
   }

   private static ExecutorService package_() {
      return Executors.newCachedThreadPool(var0 -> {
         Thread var1 = new Thread(var0);
         var1.setName("IO-Worker-" + byte_.getAndIncrement());
         var1.setUncaughtExceptionHandler(rqR_2::class_);
         return var1;
      });
   }

   public static String protected_(Throwable var0) {
      if (var0.getCause() != null) {
         return protected_(var0.getCause());
      } else {
         return var0.getMessage() != null ? var0.getMessage() : var0.toString();
      }
   }

   public static long protected_() {
      return Instant.now().toEpochMilli();
   }

   public static void private_() {
      class_(throws_);
      class_(case_);
      class_(implements_);
   }

   public static void final_() {
      rqe_3 var0 = new rqe_3("Timer hack thread");
      var0.setDaemon(true);
      var0.setUncaughtExceptionHandler(new rya_3(catch_));
      var0.start();
   }

   public static ExecutorService volatile_() {
      return implements_;
   }

   public static Exception native_() {
      return private_;
   }
}
