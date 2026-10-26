package celestial;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.apache.commons.lang3.tuple.Pair;

public class OZ implements OA {
   private static final Map<Pair<Class<?>, Class<?>>, Long> class_ = new ConcurrentHashMap<>();
   private final Map<Object, List<Oy_1>> break_ = new ConcurrentHashMap<>();
   private final Map<Class<?>, List<Oy_1>> byte_ = new ConcurrentHashMap<>();
   private final Map<Class<?>, List<Oy_1>> protected_ = new ConcurrentHashMap<>();
   private final List<Ov_1> throws_ = new ArrayList<>();

   @Override
   public void byte_(Object var1) {
      this.break_(this.class_(var1.getClass(), var1), false);
   }

   @Override
   public void byte_(Class<?> var1) {
      this.break_(this.class_(var1, null), true);
   }

   public OZ() {
      ScheduledExecutorService var1 = Executors.newSingleThreadScheduledExecutor();
      var1.scheduleAtFixedRate(this::class_, 0L, 3L, TimeUnit.SECONDS);
   }

   private List<Oy_1> class_(Class<?> var1, Object var2) {
      Function var3 = var3x -> {
         CopyOnWriteArrayList var4 = new CopyOnWriteArrayList();
         this.class_(var4, var1, var2);

         for (Oy_1 var6x : var4) {
            var6x.break_(var3x);
         }

         return var4;
      };
      if (var2 == null) {
         return this.byte_.computeIfAbsent(var1, var3);
      } else {
         for (Object var5 : this.break_.keySet()) {
            if (var5 == var2) {
               return this.break_.get(var2);
            }
         }

         List var6 = (List)var3.apply(var2);
         this.break_.put(var2, var6);
         return var6;
      }
   }

   @Override
   public void class_(String var1, Oq_1 var2) {
      synchronized (this.throws_) {
         this.throws_.add(new Ov_1(var1, var2));
      }
   }

   @Override
   public boolean class_(Class<?> var1) {
      List var2 = this.protected_.get(var1);
      return var2 != null && !var2.isEmpty();
   }

   @Override
   public <T> T class_(T var1) {
      List var2 = this.protected_.get(var1.getClass());
      long var3 = System.currentTimeMillis();
      Oy_1 var5 = null;
      long var6 = 0L;
      if (var2 != null) {
         for (Oy_1 var9 : var2) {
            long var10 = System.currentTimeMillis();
            var9.class_(var1);
            long var12 = System.currentTimeMillis() - var10;
            if (var12 > var6) {
               var6 = var12;
               var5 = var9;
            }
         }
      }

      long var14 = System.currentTimeMillis() - var3;
      if (var5 != null && var5.break_() != null) {
         class_.merge(Pair.of(var1.getClass(), var5.break_().getClass()), var14, Long::sum);
      }

      return (T)var1;
   }

   private boolean class_(Method var1) {
      if (!var1.isAnnotationPresent(EventTarget.class)) {
         return false;
      } else if (var1.getReturnType() != void.class) {
         return false;
      } else {
         return var1.getParameterCount() != 1 ? false : !var1.getParameters()[0].getType().isPrimitive();
      }
   }

   private void class_(List<Oy_1> var1, Class<?> var2, Object var3) {
      for (Method var7 : var2.getDeclaredMethods()) {
         if (this.class_(var7)) {
            var1.add(new Op_1(this.protected_(var2), var2, var3, var7));
         }
      }

      if (var2.getSuperclass() != null) {
         this.class_(var1, var2.getSuperclass(), var3);
      }
   }

   private void class_(List<Oy_1> var1, boolean var2) {
      for (Oy_1 var4 : var1) {
         this.class_(var4, var2);
      }
   }

   public void class_() {
      List var1 = class_.entrySet().stream().sorted((var0, var1x) -> Long.compare(var1x.getValue(), var0.getValue())).toList();
      System.out.println("Top events by execution time:");

      for (int var2 = 0; var2 < Math.min(15, var1.size()); var2++) {
         Entry var3 = (Entry)var1.get(var2);
         Class var4 = (Class)((Pair)var3.getKey()).getLeft();
         Class var5 = (Class)((Pair)var3.getKey()).getRight();
         Long var6 = (Long)var3.getValue();
         System.out.println(var2 + 1 + ". " + var4.getSimpleName() + ":" + var5.getSimpleName() + ": " + var6 + " ms");
      }

      class_.clear();
   }

   @Override
   public void class_(Oy_1 var1) {
      this.class_(var1, false);
   }

   @Override
   public <T extends Om_1> T class_(T var1) {
      List var2 = this.protected_.get(var1.getClass());
      long var3 = System.currentTimeMillis();
      Oy_1 var5 = null;
      long var6 = 0L;
      if (var2 != null) {
         var1.class_(false);

         try {
            for (Oy_1 var9 : var2) {
               long var10 = System.currentTimeMillis();
               var9.class_(var1);
               long var12 = System.currentTimeMillis() - var10;
               if (var12 > var6) {
                  var6 = var12;
                  var5 = var9;
               }

               if (var1.byte_()) {
                  break;
               }
            }
         } catch (Exception var14) {
            var14.printStackTrace();
         }
      }

      long var15 = System.currentTimeMillis() - var3;
      if (var5 != null && var5.break_() != null) {
         class_.merge(Pair.of(var1.getClass(), var5.break_().getClass()), var15, Long::sum);
      }

      return (T)var1;
   }

   private void class_(List<Oy_1> var1, Oy_1 var2) {
      int var3 = 0;

      while (var3 < var1.size() && var2.byte_() <= ((Oy_1)var1.get(var3)).byte_()) {
         var3++;
      }

      var1.add(var3, var2);
   }

   private void class_(Oy_1 var1, boolean var2) {
      if (var2) {
         if (var1.protected_()) {
            this.class_(this.protected_.computeIfAbsent(var1.class_(), var0 -> new CopyOnWriteArrayList<>()), var1);
         }
      } else {
         this.class_(this.protected_.computeIfAbsent(var1.class_(), var0 -> new CopyOnWriteArrayList<>()), var1);
      }
   }

   @Override
   public void break_(Object var1) {
      this.class_(this.class_(var1.getClass(), var1), false);
   }

   private void break_(List<Oy_1> var1, boolean var2) {
      for (Oy_1 var4 : var1) {
         this.break_(var4, var2);
      }
   }

   private void break_(Oy_1 var1, boolean var2) {
      List var3 = this.protected_.get(var1.class_());
      if (var3 != null) {
         if (var2) {
            if (var1.protected_()) {
               var3.remove(var1);
            }
         } else {
            var3.remove(var1);
         }
      }
   }

   @Override
   public void break_(Class<?> var1) {
      this.class_(this.class_(var1, null), true);
   }

   @Override
   public void break_(Oy_1 var1) {
      this.break_(var1, false);
   }

   private Oq_1 protected_(Class<?> var1) {
      synchronized (this.throws_) {
         for (Ov_1 var4 : this.throws_) {
            if (var1.getName().startsWith(var4.class_)) {
               return var4.break_;
            }
         }
      }

      throw new On_1(var1);
   }
}
