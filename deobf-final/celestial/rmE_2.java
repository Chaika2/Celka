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
   private static final Logger byte_ = LogManager.getLogger();
   private static final Map<Class<? extends an_3>, Integer> protected_ = Maps.newHashMap();
   private final an_3 throws_;
   private final Map<Integer, rmG_2<?>> case_ = Maps.newHashMap();
   private final ReadWriteLock catch_ = new ReentrantReadWriteLock();
   private boolean private_ = true;
   private boolean implements_;
   public rYG class_;
   public rfH_2 break_;

   private <T> void byte_(rut_3<T> var1, T var2) {
      rmG_2 var3 = new rmG_2<>(var1, var2);
      this.catch_.writeLock().lock();
      this.case_.put(var1.class_(), var3);
      this.private_ = false;
      this.catch_.writeLock().unlock();
   }

   public List<rmG_2<?>> byte_() {
      ArrayList var1 = null;
      this.catch_.readLock().lock();

      for (rmG_2 var3 : this.case_.values()) {
         if (var1 == null) {
            var1 = Lists.newArrayList();
         }

         var1.add(var3.protected_());
      }

      this.catch_.readLock().unlock();
      return var1;
   }

   public rmE_2(an_3 var1) {
      this.class_ = rrWr_1.class_;
      this.break_ = rfH_2.protected_;
      this.throws_ = var1;
   }

   public <T> void class_(rut_3<T> var1, T var2) {
      int var3 = var1.class_();
      if (var3 > 254) {
         throw new IllegalArgumentException("Data value id is too big with " + var3 + "! (Max is 254)");
      } else if (this.case_.containsKey(var3)) {
         throw new IllegalArgumentException("Duplicate id value for " + var3 + "!");
      } else if (ruw_3.break_(var1.break_()) < 0) {
         throw new IllegalArgumentException("Unregistered serializer " + var1.break_() + " for " + var3 + "!");
      } else {
         this.byte_(var1, var2);
      }
   }

   public static <T> rut_3<T> class_(Class<? extends an_3> var0, rmb_3<T> var1) {
      if (byte_.isDebugEnabled()) {
         try {
            Class var2 = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
            if (!var2.equals(var0)) {
               byte_.debug("defineId called for: {} from {}", var0, var2, new RuntimeException());
            }
         } catch (ClassNotFoundException var5) {
         }
      }

      int var6;
      if (protected_.containsKey(var0)) {
         var6 = protected_.get(var0) + 1;
      } else {
         int var3 = 0;
         Class var4 = var0;

         while (var4 != an_3.class) {
            var4 = var4.getSuperclass();
            if (protected_.containsKey(var4)) {
               var3 = protected_.get(var4) + 1;
               break;
            }
         }

         var6 = var3;
      }

      if (var6 > 254) {
         throw new IllegalArgumentException("Data value id is too big with " + var6 + "! (Max is 254)");
      } else {
         protected_.put(var0, var6);
         return var1.class_(var6);
      }
   }

   private <T> void class_(rmG_2<T> var1, rmG_2<?> var2) {
      if (!Objects.equals(var2.class_.break_(), var1.class_.break_())) {
         throw new IllegalStateException(
            String.format(
               "Invalid entity data item type for field %d on entity %s: old=%s(%s), new=%s(%s)",
               var1.class_.class_(),
               this.throws_,
               var1.break_,
               var1.break_.getClass(),
               var2.break_,
               var2.break_.getClass()
            )
         );
      } else {
         var1.class_(var2.break_());
      }
   }

   public static List<rmG_2<?>> class_(ruu_3 var0) throws IOException {
      ArrayList var1 = null;

      short var2;
      while ((var2 = var0.readUnsignedByte()) != 255) {
         if (var1 == null) {
            var1 = Lists.newArrayList();
         }

         int var3 = var0.case_();
         rmb_3 var4 = ruw_3.class_(var3);
         if (var4 == null) {
            throw new DecoderException("Unknown serializer type " + var3);
         }

         var1.add(class_(var0, var2, var4));
      }

      return var1;
   }

   private static <T> rmG_2<T> class_(ruu_3 var0, int var1, rmb_3<T> var2) {
      return new rmG_2<>(var2.class_(var1), (T)var2.break_(var0));
   }

   public void class_(List<rmG_2<?>> var1) {
      this.catch_.writeLock().lock();

      for (rmG_2 var3 : var1) {
         rmG_2 var4 = this.case_.get(var3.class_().class_());
         if (var4 != null) {
            this.class_(var4, var3);
            this.throws_.class_(var3.class_());
         }
      }

      this.catch_.writeLock().unlock();
      this.implements_ = true;
   }

   public <T> T class_(rut_3<T> var1) {
      return this.<T>break_(var1).break_();
   }

   private static <T> void class_(ruu_3 var0, rmG_2<T> var1) throws IOException {
      rut_3 var2 = var1.class_();
      int var3 = ruw_3.break_(var2.break_());
      if (var3 < 0) {
         throw new EncoderException("Unknown serializer type " + var2.break_());
      } else {
         var0.writeByte(var2.class_());
         var0.protected_(var3);
         var2.break_().class_(var0, var1.break_());
      }
   }

   public boolean class_() {
      return this.implements_;
   }

   public static void class_(List<rmG_2<?>> var0, ruu_3 var1) throws IOException {
      if (var0 != null) {
         int var2 = 0;

         for (int var3 = var0.size(); var2 < var3; var2++) {
            class_(var1, (rmG_2)var0.get(var2));
         }
      }

      var1.writeByte(255);
   }

   public List<rmG_2<?>> break_() {
      ArrayList var1 = null;
      if (this.implements_) {
         this.catch_.readLock().lock();

         for (rmG_2 var3 : this.case_.values()) {
            if (var3.byte_()) {
               var3.class_(false);
               if (var1 == null) {
                  var1 = Lists.newArrayList();
               }

               var1.add(var3.protected_());
            }
         }

         this.catch_.readLock().unlock();
      }

      this.implements_ = false;
      return var1;
   }

   public <T> void break_(rut_3<T> var1, T var2) {
      rmG_2 var3 = this.break_(var1);
      if (ObjectUtils.notEqual(var2, var3.break_())) {
         var3.class_(var2);
         this.throws_.class_(var1);
         var3.class_(true);
         this.implements_ = true;
      }
   }

   private <T> rmG_2<T> break_(rut_3<T> var1) {
      this.catch_.readLock().lock();

      rmG_2 var2;
      try {
         var2 = this.case_.get(var1.class_());
      } catch (Throwable var9) {
         KY var4 = KY.class_(var9, "Getting synched entity data");
         Ko_1 var5 = var4.class_("Synched entity data");
         var5.class_("Data ID", var1);
         throw new KU(var4);
      } finally {
         this.catch_.readLock().unlock();
      }

      return var2;
   }

   public void throws_() {
      this.implements_ = false;
      this.catch_.readLock().lock();

      for (rmG_2 var2 : this.case_.values()) {
         var2.class_(false);
      }

      this.catch_.readLock().unlock();
   }

   public boolean protected_() {
      return this.private_;
   }
}
