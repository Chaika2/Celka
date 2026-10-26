package celestial;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

public class OC implements OA {
   private final Map<Object, List<Oy_1>> id_class = new ConcurrentHashMap<>();
   private final Map<Class<?>, List<Oy_1>> id_break = new ConcurrentHashMap<>();
   private final Map<Class<?>, List<Oy_1>> id_byte = new ConcurrentHashMap<>();
   private final List<Ol_1> id_protected = new ArrayList<>();

   @Override
   public void id_byte(Object var1) {
      this.id_break(this.id_class(var1.getClass(), var1), false);
   }

   @Override
   public void id_byte(Class<?> var1) {
      this.id_break(this.id_class(var1, null), true);
   }

   private void id_class(Oy_1 var1, boolean var2) {
      if (var2) {
         if (var1.id_protected()) {
            this.id_class(this.id_byte.computeIfAbsent(var1.id_class(), var0 -> new CopyOnWriteArrayList<>()), var1);
         }
      } else {
         this.id_class(this.id_byte.computeIfAbsent(var1.id_class(), var0 -> new CopyOnWriteArrayList<>()), var1);
      }
   }

   private void id_class(List<Oy_1> var1, Oy_1 var2) {
      int var3 = 0;

      while (var3 < var1.size() && var2.id_byte() <= ((Oy_1)var1.get(var3)).id_byte()) {
         var3++;
      }

      var1.add(var3, var2);
   }

   @Override
   public boolean id_class(Class<?> var1) {
      List var2 = this.id_byte.get(var1);
      return var2 != null && !var2.isEmpty();
   }

   @Override
   public void id_class(String var1, Oq_1 var2) {
      synchronized (this.id_protected) {
         this.id_protected.add(new Ol_1(var1, var2));
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

   private List<Oy_1> id_class(Class<?> var1, Object var2) {
      Function var3 = var3x -> {
         CopyOnWriteArrayList var4 = new CopyOnWriteArrayList();
         this.id_class(var4, var1, var2);
         return var4;
      };
      if (var2 == null) {
         return this.id_break.computeIfAbsent(var1, var3);
      } else {
         for (Object var5 : this.id_class.keySet()) {
            if (var5 == var2) {
               return this.id_class.get(var2);
            }
         }

         List var6 = (List)var3.apply(var2);
         this.id_class.put(var2, var6);
         return var6;
      }
   }

   @Override
   public <T> T id_class(T var1) {
      List var2 = this.id_byte.get(var1.getClass());
      if (var2 != null) {
         for (Oy_1 var4 : var2) {
            var4.id_class(var1);
         }
      }

      return (T)var1;
   }

   @Override
   public <T extends Om_1> T id_class(T var1) {
      List var2 = this.id_byte.get(var1.getClass());
      if (var2 != null) {
         var1.id_class(false);

         for (Oy_1 var4 : var2) {
            var4.id_class(var1);
            if (var1.id_byte()) {
               break;
            }
         }
      }

      return (T)var1;
   }

   private void id_class(List<Oy_1> var1, boolean var2) {
      for (Oy_1 var4 : var1) {
         this.id_class(var4, var2);
      }
   }

   @Override
   public void id_class(Oy_1 var1) {
      this.id_class(var1, false);
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

   private void id_break(Oy_1 var1, boolean var2) {
      List var3 = this.id_byte.get(var1.id_class());
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
   public void id_break(Object var1) {
      this.id_class(this.id_class(var1.getClass(), var1), false);
   }

   @Override
   public void id_break(Class<?> var1) {
      this.id_class(this.id_class(var1, null), true);
   }

   @Override
   public void id_break(Oy_1 var1) {
      this.id_break(var1, false);
   }

   private void id_break(List<Oy_1> var1, boolean var2) {
      for (Oy_1 var4 : var1) {
         this.id_break(var4, var2);
      }
   }

   private Oq_1 id_protected(Class<?> var1) {
      synchronized (this.id_protected) {
         for (Ol_1 var4 : this.id_protected) {
            if (var1.getName().startsWith(var4.id_class)) {
               return var4.id_break;
            }
         }
      }

      throw new On_1(var1);
   }
}
