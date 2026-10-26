/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.MoreExecutors
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.DataResult
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KU;
import celestial.VY;
import celestial.rCZ;
import celestial.rTu_1;
import celestial.rVN;
import celestial.rfU_2;
import celestial.rqD_2;
import celestial.rqK_2;
import celestial.rqO_2;
import celestial.rqU_2;
import celestial.rqY_2;
import celestial.rqa_3;
import celestial.rqe_3;
import celestial.rqi_3;
import celestial.rqo_3;
import celestial.rqu_3;
import celestial.rya_3;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.MoreExecutors;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.Hash;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
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
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
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
    private static final ExecutorService id_protected = rqR_2.id_class("Bootstrap");
    private static final ExecutorService id_throws = rqR_2.id_class("Main");
    private static final ExecutorService id_case = rqR_2.id_package();
    public static LongSupplier id_class = System::nanoTime;
    public static final UUID id_break = new UUID(0L, 0L);
    public static final Logger id_catch = LogManager.getLogger();
    public static Exception id_private;
    private static final ExecutorService id_implements;

    public static long id_byte() {
        return id_class.getAsLong();
    }

    private static BooleanSupplier id_byte(Path path) {
        return new rqU_2(path);
    }

    public static <T extends Throwable> T id_byte(T t) {
        if (rqu_3.id_byte) {
            id_catch.error("Trying to throw a fatal exception, pausing in IDE", t);
            try {
                while (true) {
                    Thread.sleep(1000L);
                    id_catch.error("paused");
                }
            }
            catch (InterruptedException interruptedException) {
                return t;
            }
        }
        return t;
    }

    static {
        id_implements = rqR_2.id_class("Cape");
    }

    private static BooleanSupplier id_class(Path path, Path path2) {
        return new rqo_3(path, path2);
    }

    private static BooleanSupplier id_class(Path path) {
        return new rqK_2(path);
    }

    public static <K, V> Collector<Map.Entry<? extends K, ? extends V>, ?, Map<K, V>> id_class() {
        return Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue);
    }

    private static boolean id_class(BooleanSupplier ... booleanSupplierArray) {
        for (BooleanSupplier booleanSupplier : booleanSupplierArray) {
            if (booleanSupplier.getAsBoolean()) continue;
            id_catch.warn("Failed to execute {}", (Object)booleanSupplier);
            return false;
        }
        return true;
    }

    private static boolean id_class(int n, String string, BooleanSupplier ... booleanSupplierArray) {
        for (int i = 0; i < n; ++i) {
            if (rqR_2.id_class(booleanSupplierArray)) {
                return true;
            }
            id_catch.error("Failed to {}, retrying {}/{}", (Object)string, (Object)i, (Object)n);
        }
        id_catch.error("Failed to {}, aborting, progress might be lost", (Object)string);
        return false;
    }

    public static void id_class(File file, File file2, File file3) {
        rqR_2.id_class(file.toPath(), file2.toPath(), file3.toPath());
    }

    public static String id_class(String string, rqO_2 rqO_22) {
        return rqO_22 == null ? string + ".unregistered_sadface" : string + "." + rqO_22.id_byte() + "." + rqO_22.id_break().replace('/', '.');
    }

    public static <T> Optional<T> id_class(Optional<T> optional, Consumer<T> consumer, Runnable runnable) {
        if (optional.isPresent()) {
            consumer.accept(optional.get());
        } else {
            runnable.run();
        }
        return optional;
    }

    public static void id_class(Exception exception) {
        id_private = exception;
    }

    public static <T extends Comparable<T>> String id_class(rCZ<T> rCZ2, Object object) {
        return rCZ2.id_class((Comparable)object);
    }

    public static <T> T id_class(T[] TArray, Random random) {
        return TArray[random.nextInt(TArray.length)];
    }

    public static int id_class(int[] nArray, Random random) {
        return nArray[random.nextInt(nArray.length)];
    }

    public static void id_class(Path path, Path path2, Path path3) {
        int n = 10;
        if ((!Files.exists(path, new LinkOption[0]) || rqR_2.id_class(10, "create backup " + path3, rqR_2.id_class(path3), rqR_2.id_class(path, path3), rqR_2.id_byte(path3))) && rqR_2.id_class(10, "remove old " + path, rqR_2.id_class(path), rqR_2.id_break(path)) && !rqR_2.id_class(10, "replace " + path + " with " + path2, rqR_2.id_class(path2, path), rqR_2.id_byte(path))) {
            rqR_2.id_class(10, "restore " + path + " from " + path3, rqR_2.id_class(path3, path), rqR_2.id_byte(path));
        }
    }

    public static int id_class(String string, int n, int n2) {
        int n3 = string.length();
        if (n2 >= 0) {
            for (int i = 0; n < n3 && i < n2; ++i) {
                if (!Character.isHighSurrogate(string.charAt(n++)) || n >= n3 || !Character.isLowSurrogate(string.charAt(n))) continue;
                ++n;
            }
        } else {
            for (int i = n2; n > 0 && i < 0; ++i) {
                if (!Character.isLowSurrogate(string.charAt(--n)) || n <= 0 || !Character.isHighSurrogate(string.charAt(n - 1))) continue;
                --n;
            }
        }
        return n;
    }

    public static Consumer<String> id_class(String string, Consumer<String> consumer) {
        return string2 -> consumer.accept(string + string2);
    }

    public static DataResult<int[]> id_class(IntStream intStream, int n) {
        int[] nArray = intStream.limit(n + 1).toArray();
        if (nArray.length != n) {
            String string = "Input is not a list of " + n + " ints";
            return nArray.length >= n ? DataResult.error((String)string, (Object)Arrays.copyOf(nArray, n)) : DataResult.error((String)string);
        }
        return DataResult.success((Object)nArray);
    }

    public static String id_class(String string, VY vY) {
        return string.toLowerCase(Locale.ROOT).chars().mapToObj(n -> vY.test((char)n) ? Character.toString((char)n) : "_").collect(Collectors.joining());
    }

    private static void id_class(ExecutorService executorService) {
        boolean bl;
        executorService.shutdown();
        try {
            bl = executorService.awaitTermination(3L, TimeUnit.SECONDS);
        }
        catch (InterruptedException interruptedException) {
            bl = false;
        }
        if (!bl) {
            executorService.shutdownNow();
        }
    }

    public static <T> T id_class(Supplier<T> supplier) {
        return supplier.get();
    }

    public static <T> T id_class(Iterable<T> iterable, T t) {
        Iterator<T> iterator = iterable.iterator();
        T t2 = iterator.next();
        if (t != null) {
            T t3 = t2;
            while (t3 != t) {
                if (!iterator.hasNext()) continue;
                t3 = iterator.next();
            }
            if (iterator.hasNext()) {
                return iterator.next();
            }
        }
        return t2;
    }

    public static <T> T id_class(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> CompletableFuture<T> id_class(Throwable throwable) {
        CompletableFuture completableFuture = new CompletableFuture();
        completableFuture.completeExceptionally(throwable);
        return completableFuture;
    }

    public static Type<?> id_class(DSL.TypeReference typeReference, String string) {
        return !rqu_3.id_break ? null : rqR_2.id_break(typeReference, string);
    }

    private static void id_class(Thread thread, Throwable throwable) {
        rqR_2.id_byte(throwable);
        if (throwable instanceof CompletionException) {
            throwable = throwable.getCause();
        }
        if (throwable instanceof KU) {
            rVN.id_class(((KU)throwable).id_class().id_protected());
            System.exit(-1);
        }
        id_catch.error(String.format("Caught exception in thread %s", thread), throwable);
    }

    public static <T> Stream<T> id_class(Optional<? extends T> optional) {
        return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
    }

    public static Runnable id_class(Runnable runnable, Supplier<String> supplier) {
        return runnable;
    }

    private static ExecutorService id_class(String string) {
        int n = rfU_2.id_class(Runtime.getRuntime().availableProcessors() - 1, 1, 7);
        Object object = n <= 0 ? MoreExecutors.newDirectExecutorService() : new ForkJoinPool(n, forkJoinPool -> {
            rqY_2 rqY_22 = new rqY_2(forkJoinPool);
            rqY_22.setName("Worker-" + string + "-" + id_byte.getAndIncrement());
            return rqY_22;
        }, rqR_2::id_class, true);
        return object;
    }

    public static <T> T id_class(T t, Consumer<T> consumer) {
        consumer.accept(t);
        return t;
    }

    public static long id_break() {
        return rqR_2.id_byte() / 1000000L;
    }

    public static void id_break(Throwable throwable) {
        throw throwable instanceof RuntimeException ? (RuntimeException)throwable : new RuntimeException(throwable);
    }

    public static void id_break(Path path, Path path2, Path path3) throws IOException {
        Path path4 = path.relativize(path3);
        Path path5 = path2.resolve(path4);
        Files.copy(path3, path5, new CopyOption[0]);
    }

    public static <V> CompletableFuture<List<V>> id_break(List<? extends CompletableFuture<? extends V>> list) {
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)list.size());
        CompletableFuture[] completableFutureArray = new CompletableFuture[list.size()];
        CompletableFuture completableFuture = new CompletableFuture();
        list.forEach(completableFuture2 -> {
            int n = arrayList.size();
            arrayList.add(null);
            completableFutureArray[n] = completableFuture2.whenComplete((object, throwable) -> {
                if (throwable != null) {
                    completableFuture.completeExceptionally((Throwable)throwable);
                } else {
                    arrayList.set(n, object);
                }
            });
        });
        return CompletableFuture.allOf(completableFutureArray).applyToEither((CompletionStage)completableFuture, void_ -> arrayList);
    }

    public static <T> T id_break(Iterable<T> iterable, T t) {
        Iterator<T> iterator = iterable.iterator();
        T t2 = null;
        while (iterator.hasNext()) {
            T t3 = iterator.next();
            if (t3 == t) {
                if (t2 != null) break;
                t2 = (T)(iterator.hasNext() ? Iterators.getLast(iterator) : t);
                break;
            }
            t2 = t3;
        }
        return t2;
    }

    private static BooleanSupplier id_break(Path path) {
        return new rqD_2(path);
    }

    private static Type<?> id_break(DSL.TypeReference typeReference, String string) {
        Type type;
        block2: {
            type = null;
            try {
                type = rTu_1.id_class().getSchema(DataFixUtils.makeKey((int)rqu_3.id_class().getWorldVersion())).getChoiceType(typeReference, string);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                id_catch.debug("No data fixer registered for {}", (Object)string);
                if (!rqu_3.id_byte) break block2;
                throw illegalArgumentException;
            }
        }
        return type;
    }

    public static Executor id_throws() {
        return id_protected;
    }

    public static Stream<String> id_finally() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        return runtimeMXBean.getInputArguments().stream().filter(string -> string.startsWith("-X"));
    }

    public static Executor id_catch() {
        return id_case;
    }

    public static <K> Hash.Strategy<K> id_extends() {
        return rqa_3.INSTANCE;
    }

    public static Executor id_case() {
        return id_throws;
    }

    public static rqi_3 id_implements() {
        String string = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if (string.contains("win")) {
            return rqi_3.WINDOWS;
        }
        if (string.contains("mac")) {
            return rqi_3.OSX;
        }
        if (string.contains("solaris")) {
            return rqi_3.SOLARIS;
        }
        if (string.contains("sunos")) {
            return rqi_3.SOLARIS;
        }
        if (string.contains("linux")) {
            return rqi_3.LINUX;
        }
        return string.contains("unix") ? rqi_3.LINUX : rqi_3.UNKNOWN;
    }

    private static ExecutorService id_package() {
        return Executors.newCachedThreadPool(runnable -> {
            Thread thread = new Thread(runnable);
            thread.setName("IO-Worker-" + id_byte.getAndIncrement());
            thread.setUncaughtExceptionHandler(rqR_2::id_class);
            return thread;
        });
    }

    public static String id_protected(Throwable throwable) {
        if (throwable.getCause() != null) {
            return rqR_2.id_protected(throwable.getCause());
        }
        return throwable.getMessage() != null ? throwable.getMessage() : throwable.toString();
    }

    public static long id_protected() {
        return Instant.now().toEpochMilli();
    }

    public static void id_private() {
        rqR_2.id_class(id_throws);
        rqR_2.id_class(id_case);
        rqR_2.id_class(id_implements);
    }

    public static void id_final() {
        rqe_3 rqe_32 = new rqe_3("Timer hack thread");
        rqe_32.setDaemon(true);
        rqe_32.setUncaughtExceptionHandler(new rya_3(id_catch));
        rqe_32.start();
    }

    public static ExecutorService id_volatile() {
        return id_implements;
    }

    public static Exception id_native() {
        return id_private;
    }
}

