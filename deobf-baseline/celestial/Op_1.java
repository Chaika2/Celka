package celestial;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;

public class Op_1 implements Oy_1 {
   private static boolean id_class;
   private static Constructor<Lookup> id_break;
   private static Method id_byte;
   private final Class<?> id_protected;
   private final boolean id_throws;
   private final int id_case;
   private Consumer<Object> id_catch;
   private Object id_private;

   @Override
   public int id_byte() {
      return this.id_case;
   }

   public Op_1(Oq_1 var1, Class<?> var2, Object var3, Method var4) {
      this.id_protected = var4.getParameters()[0].getType();
      this.id_throws = Modifier.isStatic(var4.getModifiers());
      this.id_case = var4.getAnnotation(EventTarget.class).id_class();

      try {
         String var5 = var4.getName();
         Lookup var6;
         if (id_class) {
            boolean var7 = id_break.isAccessible();
            id_break.setAccessible(true);
            var6 = id_break.newInstance(var2);
            id_break.setAccessible(var7);
         } else {
            var6 = var1.create(id_byte, var2);
         }

         MethodType var12 = MethodType.methodType(void.class, var4.getParameters()[0].getType());
         MethodHandle var8;
         MethodType var9;
         if (this.id_throws) {
            var8 = var6.findStatic(var2, var5, var12);
            var9 = MethodType.methodType(Consumer.class);
         } else {
            var8 = var6.findVirtual(var2, var5, var12);
            var9 = MethodType.methodType(Consumer.class, var2);
         }

         MethodHandle var10 = LambdaMetafactory.metafactory(var6, "accept", var9, MethodType.methodType(void.class, Object.class), var8, var12).getTarget();
         if (this.id_throws) {
            this.id_catch = (Consumer)var10.invoke();
         } else {
            this.id_catch = (Consumer)var10.invoke((Object)var3);
         }
      } catch (Throwable var11) {
         var11.printStackTrace();
      }
   }

   static {
      try {
         id_class = System.getProperty("java.version").startsWith("1.8");
         if (id_class) {
            id_break = Lookup.class.getDeclaredConstructor(Class.class);
         } else {
            id_byte = MethodHandles.class.getDeclaredMethod("privateLookupIn", Class.class, Lookup.class);
         }
      } catch (NoSuchMethodException var1) {
         var1.printStackTrace();
      }
   }

   @Override
   public void id_class(Object var1) {
      this.id_catch.accept(var1);
   }

   @Override
   public Class<?> id_class() {
      return this.id_protected;
   }

   @Override
   public void id_break(Object var1) {
      this.id_private = var1;
   }

   @Override
   public Object id_break() {
      return this.id_private;
   }

   @Override
   public boolean id_protected() {
      return this.id_throws;
   }
}
