package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rmE_2 {
   private static final Logger id_byte = LogManager.getLogger();
   private static final Map<Class<? extends an_3>, Integer> id_protected = Maps.newHashMap();
   private final an_3 id_throws;
   private final Map<Integer, rmG_2<?>> id_case = Maps.newHashMap();
   private final ReadWriteLock id_catch = new ReentrantReadWriteLock();
   private boolean id_private = true;
   private boolean id_implements;
   public rYG id_class;
   public rfH_2 id_break;

   private <T> void id_byte(rut_3<T> var1, T var2) {
      rmG_2 var3 = new rmG_2<>(var1, var2);
      this.id_catch.writeLock().lock();
      this.id_case.put(var1.id_class(), var3);
      this.id_private = false;
      this.id_catch.writeLock().unlock();
   }

   public List<rmG_2<?>> id_byte() {
      ArrayList var1 = null;
      this.id_catch.readLock().lock();

      for (rmG_2 var3 : this.id_case.values()) {
         if (var1 == null) {
            var1 = Lists.newArrayList();
         }

         var1.add(var3.id_protected());
      }

      this.id_catch.readLock().unlock();
      return var1;
   }

   public rmE_2(an_3 var1) {
      this.id_class = rrWr_1.id_class;
      this.id_break = rfH_2.id_protected;
      this.id_throws = var1;
   }

   public <T> void id_class(rut_3<T> var1, T var2) {
      int var3 = var1.id_class();
      if (var3 > 254) {
         throw new IllegalArgumentException("Data value id is too big with " + var3 + "! (Max is 254)");
      } else if (this.id_case.containsKey(var3)) {
         throw new IllegalArgumentException("Duplicate id value for " + var3 + "!");
      } else if (ruw_3.id_break(var1.id_break()) < 0) {
         throw new IllegalArgumentException("Unregistered serializer " + var1.id_break() + " for " + var3 + "!");
      } else {
         this.id_byte(var1, var2);
      }
   }

   public static <T> rut_3<T> id_class(Class<? extends an_3> var0, rmb_3<T> var1) {
      if (id_byte.isDebugEnabled()) {
         try {
            Class var2 = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
            if (!var2.equals(var0)) {
               id_byte.debug("defineId called for: {} from {}", var0, var2, new RuntimeException());
            }
         } catch (ClassNotFoundException var5) {
         }
      }

      int var6;
      if (id_protected.containsKey(var0)) {
         var6 = id_protected.get(var0) + 1;
      } else {
         int var3 = 0;
         Class var4 = var0;

         while (var4 != an_3.class) {
            var4 = var4.getSuperclass();
            if (id_protected.containsKey(var4)) {
               var3 = id_protected.get(var4) + 1;
               break;
            }
         }

         var6 = var3;
      }

      if (var6 > 254) {
         throw new IllegalArgumentException("Data value id is too big with " + var6 + "! (Max is 254)");
      } else {
         id_protected.put(var0, var6);
         return var1.id_class(var6);
      }
   }

   private <T> void id_class(rmG_2<T> var1, rmG_2<?> var2) {
      if (!Objects.equals(var2.id_class.id_break(), var1.id_class.id_break())) {
         throw new IllegalStateException(
            String.format(
               "Invalid entity data item type for field %d on entity %s: old=%s(%s), new=%s(%s)",
               var1.id_class.id_class(),
               this.id_throws,
               var1.id_break,
               var1.id_break.getClass(),
               var2.id_break,
               var2.id_break.getClass()
            )
         );
      } else {
         var1.id_class(var2.id_break());
      }
   }

   public static List<rmG_2<?>> id_class(ruu_3 var0) throws IOException {
      ArrayList var1 = null;

      short var2;
      while ((var2 = var0.readUnsignedByte()) != 255) {
         if (var1 == null) {
            var1 = Lists.newArrayList();
         }

         int var3 = var0.id_case();
         rmb_3 var4 = ruw_3.id_class(var3);
         if (var4 == null) {
            throw new DecoderException("Unknown serializer type " + var3);
         }

         var1.add(id_class(var0, var2, var4));
      }

      return var1;
   }

   private static <T> rmG_2<T> id_class(ruu_3 var0, int var1, rmb_3<T> var2) {
      return new rmG_2<>(var2.id_class(var1), (T)var2.id_break(var0));
   }

   public void id_class(List<rmG_2<?>> var1) {
      this.id_catch.writeLock().lock();

      for (rmG_2 var3 : var1) {
         rmG_2 var4 = this.id_case.get(var3.id_class().id_class());
         if (var4 != null) {
            this.id_class(var4, var3);
            this.id_throws.id_class(var3.id_class());
         }
      }

      this.id_catch.writeLock().unlock();
      this.id_implements = true;
   }

   public <T> T id_class(rut_3<T> var1) {
      return this.<T>id_break(var1).id_break();
   }

   private static <T> void id_class(ruu_3 var0, rmG_2<T> var1) throws IOException {
      rut_3 var2 = var1.id_class();
      int var3 = ruw_3.id_break(var2.id_break());
      if (var3 < 0) {
         throw new EncoderException("Unknown serializer type " + var2.id_break());
      } else {
         var0.writeByte(var2.id_class());
         var0.id_protected(var3);
         var2.id_break().id_class(var0, var1.id_break());
      }
   }

   public boolean id_class() {
      return this.id_implements;
   }

   public static void id_class(List<rmG_2<?>> var0, ruu_3 var1) throws IOException {
      if (var0 != null) {
         int var2 = 0;

         for (int var3 = var0.size(); var2 < var3; var2++) {
            id_class(var1, (rmG_2)var0.get(var2));
         }
      }

      var1.writeByte(255);
   }

   public List<rmG_2<?>> id_break() {
      ArrayList var1 = null;
      if (this.id_implements) {
         this.id_catch.readLock().lock();

         for (rmG_2 var3 : this.id_case.values()) {
            if (var3.id_byte()) {
               var3.id_class(false);
               if (var1 == null) {
                  var1 = Lists.newArrayList();
               }

               var1.add(var3.id_protected());
            }
         }

         this.id_catch.readLock().unlock();
      }

      this.id_implements = false;
      return var1;
   }

   public <T> void id_break(rut_3<T> var1, T var2) {
      rmG_2 var3 = this.id_break(var1);
      if (ObjectUtils.notEqual(var2, var3.id_break())) {
         var3.id_class(var2);
         this.id_throws.id_class(var1);
         var3.id_class(true);
         this.id_implements = true;
      }
   }

   private <T> rmG_2<T> id_break(rut_3<T> var1) {
      this.id_catch.readLock().lock();

      rmG_2 var2;
      try {
         var2 = this.id_case.get(var1.id_class());
      } catch (Throwable var9) {
         KY var4 = KY.id_class(var9, "Getting synched entity data");
         Ko_1 var5 = var4.id_class("Synched entity data");
         var5.id_class("Data ID", var1);
         throw new KU(var4);
      } finally {
         this.id_catch.readLock().unlock();
      }

      return var2;
   }

   public void id_throws() {
      this.id_implements = false;
      this.id_catch.readLock().lock();

      for (rmG_2 var2 : this.id_case.values()) {
         var2.id_class(false);
      }

      this.id_catch.readLock().unlock();
   }

   public boolean id_protected() {
      return this.id_private;
   }
}
