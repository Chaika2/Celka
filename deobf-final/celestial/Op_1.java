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
   private static boolean class_;
   private static Constructor<Lookup> break_;
   private static Method byte_;
   private final Class<?> protected_;
   private final boolean throws_;
   private final int case_;
   private Consumer<Object> catch_;
   private Object private_;

   @Override
   public int byte_() {
      return this.case_;
   }

   public Op_1(Oq_1 var1, Class<?> var2, Object var3, Method var4) {
      this.protected_ = var4.getParameters()[0].getType();
      this.throws_ = Modifier.isStatic(var4.getModifiers());
      this.case_ = var4.getAnnotation(EventTarget.class).class_();

      try {
         String var5 = var4.getName();
         Lookup var6;
         if (class_) {
            boolean var7 = break_.isAccessible();
            break_.setAccessible(true);
            var6 = break_.newInstance(var2);
            break_.setAccessible(var7);
         } else {
            var6 = var1.create(byte_, var2);
         }

         MethodType var12 = MethodType.methodType(void.class, var4.getParameters()[0].getType());
         MethodHandle var8;
         MethodType var9;
         if (this.throws_) {
            var8 = var6.findStatic(var2, var5, var12);
            var9 = MethodType.methodType(Consumer.class);
         } else {
            var8 = var6.findVirtual(var2, var5, var12);
            var9 = MethodType.methodType(Consumer.class, var2);
         }

         MethodHandle var10 = LambdaMetafactory.metafactory(var6, "accept", var9, MethodType.methodType(void.class, Object.class), var8, var12).getTarget();
         if (this.throws_) {
            this.catch_ = (Consumer)var10.invoke();
         } else {
            this.catch_ = (Consumer)var10.invoke((Object)var3);
         }
      } catch (Throwable var11) {
         var11.printStackTrace();
      }
   }

   static {
      try {
         class_ = System.getProperty("java.version").startsWith("1.8");
         if (class_) {
            break_ = Lookup.class.getDeclaredConstructor(Class.class);
         } else {
            byte_ = MethodHandles.class.getDeclaredMethod("privateLookupIn", Class.class, Lookup.class);
         }
      } catch (NoSuchMethodException var1) {
         var1.printStackTrace();
      }
   }

   @Override
   public void class_(Object var1) {
      this.catch_.accept(var1);
   }

   @Override
   public Class<?> class_() {
      return this.protected_;
   }

   @Override
   public void break_(Object var1) {
      this.private_ = var1;
   }

   @Override
   public Object break_() {
      return this.private_;
   }

   @Override
   public boolean protected_() {
      return this.throws_;
   }
}
