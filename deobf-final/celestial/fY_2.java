package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fY_2 implements AutoCloseable, fW_2, rAc_1 {
   private static final Logger break_ = LogManager.getLogger();
   public static final rqO_2 class_ = new rqO_2("");
   private final Map<rqO_2, ff_3> byte_ = Maps.newHashMap();
   private final Set<fW_2> protected_ = Sets.newHashSet();
   private final Map<String, Integer> throws_ = Maps.newHashMap();
   private final rAL case_;
   private ff_3 catch_;
   private rqO_2 private_;

   private ff_3 byte_(rqO_2 var1, ff_3 var2) {
      try {
         var2.a_(this.case_);
         return var2;
      } catch (IOException var6) {
         if (var1 != class_) {
            break_.warn("Failed to load texture: {}", var1, var6);
         }

         return fQ_2.byte_();
      } catch (Throwable var7) {
         KY var4 = KY.class_(var7, "Registering texture");
         Ko_1 var5 = var4.class_("Resource location being registered");
         var5.class_("Resource location", var1);
         var5.class_("Texture object class", () -> var2.getClass().getName());
         throw new KU(var4);
      }
   }

   public ff_3 byte_() {
      return this.catch_;
   }

   public void byte_(rqO_2 var1) {
      ff_3 var2 = this.break_(var1);
      if (var2 != null) {
         this.byte_.remove(var1);
         fo_3.class_(var2.new_());
      }
   }

   public fY_2(rAL var1) {
      this.case_ = var1;
   }

   @Override
   public CompletableFuture<Void> class_(rAu_1 var1, rAL var2, Executor var3, Executor var4) {
      rrbb_3.byte_("*** Reloading textures ***");
      rrbb_3.case_("Resource packs: " + rrbb_3.k());
      Iterator var5 = this.byte_.keySet().iterator();

      while (var5.hasNext()) {
         rqO_2 var6 = (rqO_2)var5.next();
         String var7 = var6.break_();
         if (var7.startsWith("optifine/") || rrbY_2.break_(var6)) {
            ff_3 var8 = this.byte_.get(var6);
            if (var8 instanceof ff_3) {
               var8.continue_();
            }

            var5.remove();
         }
      }

      rrbY_2.implements_();
      return CompletableFuture.allOf(vB_2.class_(this, var3), this.class_(LZ.finally_, var3)).thenCompose(var1::class_).thenAcceptAsync(var3x -> {
         fQ_2.byte_();
         HashSet var4x = new HashSet<>(this.byte_.entrySet());
         Iterator var5x = var4x.iterator();

         while (var5x.hasNext()) {
            Entry var6x = (Entry)var5x.next();
            rqO_2 var7x = (rqO_2)var6x.getKey();
            ff_3 var8x = (ff_3)var6x.getValue();
            if (var8x == fQ_2.byte_() && !var7x.equals(fQ_2.class_())) {
               var5x.remove();
            } else {
               var8x.class_(this, var2, var7x, var4);
            }
         }
      }, var0 -> RenderSystem.recordRenderCall(var0::run));
   }

   public void class_(rqO_2 var1, ff_3 var2) {
      var2 = this.byte_(var1, var2);
      ff_3 var3 = this.byte_.put(var1, var2);
      if (var3 != var2) {
         if (var3 != null && var3 != fQ_2.byte_()) {
            this.protected_.remove(var3);
            this.break_(var1, var3);
         }

         if (var2 instanceof fW_2) {
            this.protected_.add((fW_2)var2);
         }
      }
   }

   public void class_(rqO_2 var1) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.protected_(var1));
      } else {
         this.protected_(var1);
      }
   }

   private static void class_(Runnable var0) {
      QY.instanceof_().execute(() -> RenderSystem.recordRenderCall(var0::run));
   }

   public rqO_2 class_(String var1, fk_3 var2) {
      Integer var3 = this.throws_.get(var1);
      if (var3 == null) {
         var3 = 1;
      } else {
         var3 = var3 + 1;
      }

      this.throws_.put(var1, var3);
      rqO_2 var4 = new rqO_2(String.format("dynamic/%s_%d", var1, var3));
      this.class_(var4, var2);
      return var4;
   }

   public CompletableFuture<Void> class_(rqO_2 var1, Executor var2) {
      if (!this.byte_.containsKey(var1)) {
         fl_3 var3 = new fl_3(this.case_, var1, var2);
         this.byte_.put(var1, var3);
         return var3.class_().thenRunAsync(() -> this.class_(var1, (ff_3)var3), fY_2::class_);
      } else {
         return CompletableFuture.completedFuture((Void)null);
      }
   }

   @Override
   public void close() {
      this.byte_.forEach(this::break_);
      this.byte_.clear();
      this.protected_.clear();
      this.throws_.clear();
   }

   private void break_(rqO_2 var1, ff_3 var2) {
      if (var2 != fQ_2.byte_()) {
         try {
            var2.close();
         } catch (Exception var4) {
            break_.warn("Failed to close texture {}", var1, var4);
         }
      }

      var2.continue_();
   }

   public ff_3 break_(rqO_2 var1) {
      return this.byte_.get(var1);
   }

   @Override
   public void break_() {
      for (fW_2 var2 : this.protected_) {
         var2.break_();
      }
   }

   private void protected_(rqO_2 var1) {
      if (rrbb_3.rl()) {
         var1 = rrbl_3.class_(var1);
      }

      Object var2 = this.byte_.get(var1);
      if (var2 == null) {
         var2 = new fH_2(var1);
         this.class_(var1, (ff_3)var2);
      }

      if (rrbb_3.rs()) {
         rrdA.break_((ff_3)var2);
      } else {
         ((ff_3)var2).super_();
      }

      this.catch_ = (ff_3)var2;
      this.private_ = var1;
   }
}
