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
   private static final Map<Pair<Class<?>, Class<?>>, Long> id_class = new ConcurrentHashMap<>();
   private final Map<Object, List<Oy_1>> id_break = new ConcurrentHashMap<>();
   private final Map<Class<?>, List<Oy_1>> id_byte = new ConcurrentHashMap<>();
   private final Map<Class<?>, List<Oy_1>> id_protected = new ConcurrentHashMap<>();
   private final List<Ov_1> id_throws = new ArrayList<>();

   @Override
   public void id_byte(Object var1) {
      this.id_break(this.id_class(var1.getClass(), var1), false);
   }

   @Override
   public void id_byte(Class<?> var1) {
      this.id_break(this.id_class(var1, null), true);
   }

   public OZ() {
      ScheduledExecutorService var1 = Executors.newSingleThreadScheduledExecutor();
      var1.scheduleAtFixedRate(this::id_class, 0L, 3L, TimeUnit.SECONDS);
   }

   private List<Oy_1> id_class(Class<?> var1, Object var2) {
      Function var3 = var3x -> {
         CopyOnWriteArrayList var4 = new CopyOnWriteArrayList();
         this.id_class(var4, var1, var2);

         for (Oy_1 var6x : var4) {
            var6x.id_break(var3x);
         }

         return var4;
      };
      if (var2 == null) {
         return this.id_byte.computeIfAbsent(var1, var3);
      } else {
         for (Object var5 : this.id_break.keySet()) {
            if (var5 == var2) {
               return this.id_break.get(var2);
            }
         }

         List var6 = (List)var3.apply(var2);
         this.id_break.put(var2, var6);
         return var6;
      }
   }

   @Override
   public void id_class(String var1, Oq_1 var2) {
      synchronized (this.id_throws) {
         this.id_throws.add(new Ov_1(var1, var2));
      }
   }

   @Override
   public boolean id_class(Class<?> var1) {
      List var2 = this.id_protected.get(var1);
      return var2 != null && !var2.isEmpty();
   }

   @Override
   public <T> T id_class(T var1) {
      List var2 = this.id_protected.get(var1.getClass());
      long var3 = System.currentTimeMillis();
      Oy_1 var5 = null;
      long var6 = 0L;
      if (var2 != null) {
         for (Oy_1 var9 : var2) {
            long var10 = System.currentTimeMillis();
            var9.id_class(var1);
            long var12 = System.currentTimeMillis() - var10;
            if (var12 > var6) {
               var6 = var12;
               var5 = var9;
            }
         }
      }

      long var14 = System.currentTimeMillis() - var3;
      if (var5 != null && var5.id_break() != null) {
         id_class.merge(Pair.of(var1.getClass(), var5.id_break().getClass()), var14, Long::sum);
      }

      return (T)var1;
   }

   private boolean id_class(Method var1) {
      if (!var1.isAnnotationPresent(EventTarget.class)) {
         return false;
      } else if (var1.getReturnType() != void.class) {
         return false;
      } else {
         return var1.getParameterCount() != 1 ? false : !var1.getParameters()[0].getType().isPrimitive();
      }
   }

   private void id_class(List<Oy_1> var1, Class<?> var2, Object var3) {
      for (Method var7 : var2.getDeclaredMethods()) {
         if (this.id_class(var7)) {
            var1.add(new Op_1(this.id_protected(var2), var2, var3, var7));
         }
      }

      if (var2.getSuperclass() != null) {
         this.id_class(var1, var2.getSuperclass(), var3);
      }
   }

   private void id_class(List<Oy_1> var1, boolean var2) {
      for (Oy_1 var4 : var1) {
         this.id_class(var4, var2);
      }
   }

   public void id_class() {
      List var1 = id_class.entrySet().stream().sorted((var0, var1x) -> Long.compare(var1x.getValue(), var0.getValue())).toList();
      System.out.println("Top events by execution time:");

      for (int var2 = 0; var2 < Math.min(15, var1.size()); var2++) {
         Entry var3 = (Entry)var1.get(var2);
         Class var4 = (Class)((Pair)var3.getKey()).getLeft();
         Class var5 = (Class)((Pair)var3.getKey()).getRight();
         Long var6 = (Long)var3.getValue();
         System.out.println(var2 + 1 + ". " + var4.getSimpleName() + ":" + var5.getSimpleName() + ": " + var6 + " ms");
      }

      id_class.clear();
   }

   @Override
   public void id_class(Oy_1 var1) {
      this.id_class(var1, false);
   }

   @Override
   public <T extends Om_1> T id_class(T var1) {
      List var2 = this.id_protected.get(var1.getClass());
      long var3 = System.currentTimeMillis();
      Oy_1 var5 = null;
      long var6 = 0L;
      if (var2 != null) {
         var1.id_class(false);

         try {
            for (Oy_1 var9 : var2) {
               long var10 = System.currentTimeMillis();
               var9.id_class(var1);
               long var12 = System.currentTimeMillis() - var10;
               if (var12 > var6) {
                  var6 = var12;
                  var5 = var9;
               }

               if (var1.id_byte()) {
                  break;
               }
            }
         } catch (Exception var14) {
            var14.printStackTrace();
         }
      }

      long var15 = System.currentTimeMillis() - var3;
      if (var5 != null && var5.id_break() != null) {
         id_class.merge(Pair.of(var1.getClass(), var5.id_break().getClass()), var15, Long::sum);
      }

      return (T)var1;
   }

   private void id_class(List<Oy_1> var1, Oy_1 var2) {
      int var3 = 0;

      while (var3 < var1.size() && var2.id_byte() <= ((Oy_1)var1.get(var3)).id_byte()) {
         var3++;
      }

      var1.add(var3, var2);
   }

   private void id_class(Oy_1 var1, boolean var2) {
      if (var2) {
         if (var1.id_protected()) {
            this.id_class(this.id_protected.computeIfAbsent(var1.id_class(), var0 -> new CopyOnWriteArrayList<>()), var1);
         }
      } else {
         this.id_class(this.id_protected.computeIfAbsent(var1.id_class(), var0 -> new CopyOnWriteArrayList<>()), var1);
      }
   }

   @Override
   public void id_break(Object var1) {
      this.id_class(this.id_class(var1.getClass(), var1), false);
   }

   private void id_break(List<Oy_1> var1, boolean var2) {
      for (Oy_1 var4 : var1) {
         this.id_break(var4, var2);
      }
   }

   private void id_break(Oy_1 var1, boolean var2) {
      List var3 = this.id_protected.get(var1.id_class());
      if (var3 != null) {
         if (var2) {
            if (var1.id_protected()) {
               var3.remove(var1);
            }
         } else {
            var3.remove(var1);
         }
      }
   }

   @Override
   public void id_break(Class<?> var1) {
      this.id_class(this.id_class(var1, null), true);
   }

   @Override
   public void id_break(Oy_1 var1) {
      this.id_break(var1, false);
   }

   private Oq_1 id_protected(Class<?> var1) {
      synchronized (this.id_throws) {
         for (Ov_1 var4 : this.id_throws) {
            if (var1.getName().startsWith(var4.id_class)) {
               return var4.id_break;
            }
         }
      }

      throw new On_1(var1);
   }
}
