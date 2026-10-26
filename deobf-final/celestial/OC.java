package celestial;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

public class OC implements OA {
   private final Map<Object, List<Oy_1>> class_ = new ConcurrentHashMap<>();
   private final Map<Class<?>, List<Oy_1>> break_ = new ConcurrentHashMap<>();
   private final Map<Class<?>, List<Oy_1>> byte_ = new ConcurrentHashMap<>();
   private final List<Ol_1> protected_ = new ArrayList<>();

   @Override
   public void byte_(Object var1) {
      this.break_(this.class_(var1.getClass(), var1), false);
   }

   @Override
   public void byte_(Class<?> var1) {
      this.break_(this.class_(var1, null), true);
   }

   private void class_(Oy_1 var1, boolean var2) {
      if (var2) {
         if (var1.protected_()) {
            this.class_(this.byte_.computeIfAbsent(var1.class_(), var0 -> new CopyOnWriteArrayList<>()), var1);
         }
      } else {
         this.class_(this.byte_.computeIfAbsent(var1.class_(), var0 -> new CopyOnWriteArrayList<>()), var1);
      }
   }

   private void class_(List<Oy_1> var1, Oy_1 var2) {
      int var3 = 0;

      while (var3 < var1.size() && var2.byte_() <= ((Oy_1)var1.get(var3)).byte_()) {
         var3++;
      }

      var1.add(var3, var2);
   }

   @Override
   public boolean class_(Class<?> var1) {
      List var2 = this.byte_.get(var1);
      return var2 != null && !var2.isEmpty();
   }

   @Override
   public void class_(String var1, Oq_1 var2) {
      synchronized (this.protected_) {
         this.protected_.add(new Ol_1(var1, var2));
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

   private List<Oy_1> class_(Class<?> var1, Object var2) {
      Function var3 = var3x -> {
         CopyOnWriteArrayList var4 = new CopyOnWriteArrayList();
         this.class_(var4, var1, var2);
         return var4;
      };
      if (var2 == null) {
         return this.break_.computeIfAbsent(var1, var3);
      } else {
         for (Object var5 : this.class_.keySet()) {
            if (var5 == var2) {
               return this.class_.get(var2);
            }
         }

         List var6 = (List)var3.apply(var2);
         this.class_.put(var2, var6);
         return var6;
      }
   }

   @Override
   public <T> T class_(T var1) {
      List var2 = this.byte_.get(var1.getClass());
      if (var2 != null) {
         for (Oy_1 var4 : var2) {
            var4.class_(var1);
         }
      }

      return (T)var1;
   }

   @Override
   public <T extends Om_1> T class_(T var1) {
      List var2 = this.byte_.get(var1.getClass());
      if (var2 != null) {
         var1.class_(false);

         for (Oy_1 var4 : var2) {
            var4.class_(var1);
            if (var1.byte_()) {
               break;
            }
         }
      }

      return (T)var1;
   }

   private void class_(List<Oy_1> var1, boolean var2) {
      for (Oy_1 var4 : var1) {
         this.class_(var4, var2);
      }
   }

   @Override
   public void class_(Oy_1 var1) {
      this.class_(var1, false);
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

   private void break_(Oy_1 var1, boolean var2) {
      List var3 = this.byte_.get(var1.class_());
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
   public void break_(Object var1) {
      this.class_(this.class_(var1.getClass(), var1), false);
   }

   @Override
   public void break_(Class<?> var1) {
      this.class_(this.class_(var1, null), true);
   }

   @Override
   public void break_(Oy_1 var1) {
      this.break_(var1, false);
   }

   private void break_(List<Oy_1> var1, boolean var2) {
      for (Oy_1 var4 : var1) {
         this.break_(var4, var2);
      }
   }

   private Oq_1 protected_(Class<?> var1) {
      synchronized (this.protected_) {
         for (Ol_1 var4 : this.protected_) {
            if (var1.getName().startsWith(var4.class_)) {
               return var4.break_;
            }
         }
      }

      throw new On_1(var1);
   }
}
