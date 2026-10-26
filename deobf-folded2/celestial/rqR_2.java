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
   private static final AtomicInteger id_byte = new AtomicInteger(1);
   private static final ExecutorService id_protected = id_class("Bootstrap");
   private static final ExecutorService id_throws = id_class("Main");
   private static final ExecutorService id_case = id_package();
   public static LongSupplier id_class = System::nanoTime;
   public static final UUID id_break = new UUID(0L, 0L);
   static final Logger id_catch = LogManager.getLogger();
   static Exception id_private;
   private static final ExecutorService id_implements = id_class("Cape");

   public static long id_byte() {
      return id_class.getAsLong();
   }

   private static BooleanSupplier id_byte(Path var0) {
      return new rqU_2(var0);
   }

   public static <T extends Throwable> T id_byte(T var0) {
      if (rqu_3.id_byte) {
         id_catch.error("Trying to throw a fatal exception, pausing in IDE", var0);

         while (true) {
            try {
               Thread.sleep(1000L);
               id_catch.error("paused");
            } catch (InterruptedException var2) {
               return (T)var0;
            }
         }
      } else {
         return (T)var0;
      }
   }

   private static BooleanSupplier id_class(Path var0, Path var1) {
      return new rqo_3(var0, var1);
   }

   private static BooleanSupplier id_class(Path var0) {
      return new rqK_2(var0);
   }

   public static <K, V> Collector<Entry<? extends K, ? extends V>, ?, Map<K, V>> id_class() {
      return Collectors.toMap(Entry::getKey, Entry::getValue);
   }

   private static boolean id_class(BooleanSupplier... var0) {
      for (BooleanSupplier var4 : var0) {
         if (!var4.getAsBoolean()) {
            id_catch.warn("Failed to execute {}", var4);
            return false;
         }
      }

      return true;
   }

   private static boolean id_class(int var0, String var1, BooleanSupplier... var2) {
      for (int var3 = 0; var3 < var0; var3++) {
         if (id_class(var2)) {
            return true;
         }

         id_catch.error("Failed to {}, retrying {}/{}", var1, var3, var0);
      }

      id_catch.error("Failed to {}, aborting, progress might be lost", var1);
      return false;
   }

   public static void id_class(File var0, File var1, File var2) {
      id_class(var0.toPath(), var1.toPath(), var2.toPath());
   }

   public static String id_class(String var0, rqO_2 var1) {
      return var1 == null ? var0 + ".unregistered_sadface" : var0 + "." + var1.id_byte() + "." + var1.id_break().replace('/', '.');
   }

   public static <T> Optional<T> id_class(Optional<T> var0, Consumer<T> var1, Runnable var2) {
      if (var0.isPresent()) {
         var1.accept(var0.get());
      } else {
         var2.run();
      }

      return var0;
   }

   public static void id_class(Exception var0) {
      id_private = var0;
   }

   public static <T extends Comparable<T>> String id_class(rCZ<T> var0, Object var1) {
      return var0.id_class((T)var1);
   }

   public static <T> T id_class(T[] var0, Random var1) {
      return (T)var0[var1.nextInt(var0.length)];
   }

   public static int id_class(int[] var0, Random var1) {
      return var0[var1.nextInt(var0.length)];
   }

   public static void id_class(Path var0, Path var1, Path var2) {
      byte var3 = 10;
      if ((!Files.exists(var0) || id_class(10, "create backup " + var2, id_class(var2), id_class(var0, var2), id_byte(var2)))
         && id_class(10, "remove old " + var0, id_class(var0), id_break(var0))
         && !id_class(10, "replace " + var0 + " with " + var1, id_class(var1, var0), id_byte(var0))) {
         id_class(10, "restore " + var0 + " from " + var2, id_class(var2, var0), id_byte(var0));
      }
   }

   public static int id_class(String var0, int var1, int var2) {
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

   public static Consumer<String> id_class(String var0, Consumer<String> var1) {
      return var2 -> var1.accept(var0 + var2);
   }

   public static DataResult<int[]> id_class(IntStream var0, int var1) {
      int[] var2 = var0.limit((long)(var1 + 1)).toArray();
      if (var2.length != var1) {
         String var3 = "Input is not a list of " + var1 + " ints";
         return var2.length >= var1 ? DataResult.error(var3, Arrays.copyOf(var2, var1)) : DataResult.error(var3);
      } else {
         return DataResult.success(var2);
      }
   }

   public static String id_class(String var0, VY var1) {
      return var0.toLowerCase(Locale.ROOT)
         .chars()
         .mapToObj(var1x -> var1.test((char)var1x) ? Character.toString((char)var1x) : "_")
         .collect(Collectors.joining());
   }

   private static void id_class(ExecutorService var0) {
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

   public static <T> T id_class(Supplier<T> var0) {
      return (T)var0.get();
   }

   public static <T> T id_class(Iterable<T> var0, T var1) {
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

   public static <T> T id_class(List<T> var0) {
      return (T)var0.get(var0.size() - 1);
   }

   public static <T> CompletableFuture<T> id_class(Throwable var0) {
      CompletableFuture var1 = new CompletableFuture();
      var1.completeExceptionally(var0);
      return var1;
   }

   public static Type<?> id_class(TypeReference var0, String var1) {
      return !rqu_3.id_break ? null : id_break(var0, var1);
   }

   private static void id_class(Thread var0, Throwable var1) {
      id_byte(var1);
      if (var1 instanceof CompletionException) {
         var1 = var1.getCause();
      }

      if (var1 instanceof KU) {
         rVN.id_class(((KU)var1).id_class().id_protected());
         System.exit(-1);
      }

      id_catch.error(String.format("Caught exception in thread %s", var0), var1);
   }

   public static <T> Stream<T> id_class(Optional<? extends T> var0) {
      return var0.isPresent() ? Stream.of((T)var0.get()) : Stream.empty();
   }

   public static Runnable id_class(Runnable var0, Supplier<String> var1) {
      return var0;
   }

   private static ExecutorService id_class(String var0) {
      int var1 = rfU_2.id_class(Runtime.getRuntime().availableProcessors() - 1, 1, 7);
      Object var2;
      if (var1 <= 0) {
         var2 = MoreExecutors.newDirectExecutorService();
      } else {
         var2 = new ForkJoinPool(var1, var1x -> {
            rqY_2 var2x = new rqY_2(var1x);
            var2x.setName("Worker-" + var0 + "-" + id_byte.getAndIncrement());
            return var2x;
         }, rqR_2::id_class, true);
      }

      return (ExecutorService)var2;
   }

   public static <T> T id_class(T var0, Consumer<T> var1) {
      var1.accept(var0);
      return (T)var0;
   }

   public static long id_break() {
      return id_byte() / 1000000L;
   }

   public static void id_break(Throwable var0) {
      throw var0 instanceof RuntimeException ? (RuntimeException)var0 : new RuntimeException(var0);
   }

   public static void id_break(Path var0, Path var1, Path var2) throws IOException {
      Path var3 = var0.relativize(var2);
      Path var4 = var1.resolve(var3);
      Files.copy(var2, var4);
   }

   public static <V> CompletableFuture<List<V>> id_break(List<? extends CompletableFuture<? extends V>> var0) {
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

   public static <T> T id_break(Iterable<T> var0, T var1) {
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

   private static BooleanSupplier id_break(Path var0) {
      return new rqD_2(var0);
   }

   private static Type<?> id_break(TypeReference var0, String var1) {
      Type var2 = null;

      try {
         var2 = rTu_1.id_class().getSchema(DataFixUtils.makeKey(rqu_3.id_class().getWorldVersion())).getChoiceType(var0, var1);
      } catch (IllegalArgumentException var4) {
         id_catch.debug("No data fixer registered for {}", var1);
         if (rqu_3.id_byte) {
            throw var4;
         }
      }

      return var2;
   }

   public static Executor id_throws() {
      return id_protected;
   }

   public static Stream<String> id_finally() {
      RuntimeMXBean var0 = ManagementFactory.getRuntimeMXBean();
      return var0.getInputArguments().stream().filter(var0x -> var0x.startsWith("-X"));
   }

   public static Executor id_catch() {
      return id_case;
   }

   public static <K> Strategy<K> id_extends() {
      return rqa_3.INSTANCE;
   }

   public static Executor id_case() {
      return id_throws;
   }

   public static rqi_3 id_implements() {
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

   private static ExecutorService id_package() {
      return Executors.newCachedThreadPool(var0 -> {
         Thread var1 = new Thread(var0);
         var1.setName("IO-Worker-" + id_byte.getAndIncrement());
         var1.setUncaughtExceptionHandler(rqR_2::id_class);
         return var1;
      });
   }

   public static String id_protected(Throwable var0) {
      if (var0.getCause() != null) {
         return id_protected(var0.getCause());
      } else {
         return var0.getMessage() != null ? var0.getMessage() : var0.toString();
      }
   }

   public static long id_protected() {
      return Instant.now().toEpochMilli();
   }

   public static void id_private() {
      id_class(id_throws);
      id_class(id_case);
      id_class(id_implements);
   }

   public static void id_final() {
      rqe_3 var0 = new rqe_3("Timer hack thread");
      var0.setDaemon(true);
      var0.setUncaughtExceptionHandler(new rya_3(id_catch));
      var0.start();
   }

   public static ExecutorService id_volatile() {
      return id_implements;
   }

   public static Exception id_native() {
      return id_private;
   }
}
