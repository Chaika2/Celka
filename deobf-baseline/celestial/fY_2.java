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
   private static final Logger id_break = LogManager.getLogger();
   public static final rqO_2 id_class = new rqO_2("");
   private final Map<rqO_2, ff_3> id_byte = Maps.newHashMap();
   private final Set<fW_2> id_protected = Sets.newHashSet();
   private final Map<String, Integer> id_throws = Maps.newHashMap();
   private final rAL id_case;
   private ff_3 id_catch;
   private rqO_2 id_private;

   private ff_3 id_byte(rqO_2 var1, ff_3 var2) {
      try {
         var2.a_(this.id_case);
         return var2;
      } catch (IOException var6) {
         if (var1 != id_class) {
            id_break.warn("Failed to load texture: {}", var1, var6);
         }

         return fQ_2.id_byte();
      } catch (Throwable var7) {
         KY var4 = KY.id_class(var7, "Registering texture");
         Ko_1 var5 = var4.id_class("Resource location being registered");
         var5.id_class("Resource location", var1);
         var5.id_class("Texture object class", () -> var2.getClass().getName());
         throw new KU(var4);
      }
   }

   public ff_3 id_byte() {
      return this.id_catch;
   }

   public void id_byte(rqO_2 var1) {
      ff_3 var2 = this.id_break(var1);
      if (var2 != null) {
         this.id_byte.remove(var1);
         fo_3.id_class(var2.id_new());
      }
   }

   public fY_2(rAL var1) {
      this.id_case = var1;
   }

   @Override
   public CompletableFuture<Void> id_class(rAu_1 var1, rAL var2, Executor var3, Executor var4) {
      rrbb_3.id_byte("*** Reloading textures ***");
      rrbb_3.id_case("Resource packs: " + rrbb_3.k());
      Iterator var5 = this.id_byte.keySet().iterator();

      while (var5.hasNext()) {
         rqO_2 var6 = (rqO_2)var5.next();
         String var7 = var6.id_break();
         if (var7.startsWith("optifine/") || rrbY_2.id_break(var6)) {
            ff_3 var8 = this.id_byte.get(var6);
            if (var8 instanceof ff_3) {
               var8.id_continue();
            }

            var5.remove();
         }
      }

      rrbY_2.id_implements();
      return CompletableFuture.allOf(vB_2.id_class(this, var3), this.id_class(LZ.id_finally, var3)).thenCompose(var1::id_class).thenAcceptAsync(var3x -> {
         fQ_2.id_byte();
         HashSet var4x = new HashSet<>(this.id_byte.entrySet());
         Iterator var5x = var4x.iterator();

         while (var5x.hasNext()) {
            Entry var6x = (Entry)var5x.next();
            rqO_2 var7x = (rqO_2)var6x.getKey();
            ff_3 var8x = (ff_3)var6x.getValue();
            if (var8x == fQ_2.id_byte() && !var7x.equals(fQ_2.id_class())) {
               var5x.remove();
            } else {
               var8x.id_class(this, var2, var7x, var4);
            }
         }
      }, var0 -> RenderSystem.recordRenderCall(var0::run));
   }

   public void id_class(rqO_2 var1, ff_3 var2) {
      var2 = this.id_byte(var1, var2);
      ff_3 var3 = this.id_byte.put(var1, var2);
      if (var3 != var2) {
         if (var3 != null && var3 != fQ_2.id_byte()) {
            this.id_protected.remove(var3);
            this.id_break(var1, var3);
         }

         if (var2 instanceof fW_2) {
            this.id_protected.add((fW_2)var2);
         }
      }
   }

   public void id_class(rqO_2 var1) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.id_protected(var1));
      } else {
         this.id_protected(var1);
      }
   }

   private static void id_class(Runnable var0) {
      QY.id_instanceof().execute(() -> RenderSystem.recordRenderCall(var0::run));
   }

   public rqO_2 id_class(String var1, fk_3 var2) {
      Integer var3 = this.id_throws.get(var1);
      if (var3 == null) {
         var3 = 1;
      } else {
         var3 = var3 + 1;
      }

      this.id_throws.put(var1, var3);
      rqO_2 var4 = new rqO_2(String.format("dynamic/%s_%d", var1, var3));
      this.id_class(var4, var2);
      return var4;
   }

   public CompletableFuture<Void> id_class(rqO_2 var1, Executor var2) {
      if (!this.id_byte.containsKey(var1)) {
         fl_3 var3 = new fl_3(this.id_case, var1, var2);
         this.id_byte.put(var1, var3);
         return var3.id_class().thenRunAsync(() -> this.id_class(var1, (ff_3)var3), fY_2::id_class);
      } else {
         return CompletableFuture.completedFuture((Void)null);
      }
   }

   @Override
   public void close() {
      this.id_byte.forEach(this::id_break);
      this.id_byte.clear();
      this.id_protected.clear();
      this.id_throws.clear();
   }

   private void id_break(rqO_2 var1, ff_3 var2) {
      if (var2 != fQ_2.id_byte()) {
         try {
            var2.close();
         } catch (Exception var4) {
            id_break.warn("Failed to close texture {}", var1, var4);
         }
      }

      var2.id_continue();
   }

   public ff_3 id_break(rqO_2 var1) {
      return this.id_byte.get(var1);
   }

   @Override
   public void id_break() {
      for (fW_2 var2 : this.id_protected) {
         var2.id_break();
      }
   }

   private void id_protected(rqO_2 var1) {
      if (rrbb_3.rl()) {
         var1 = rrbl_3.id_class(var1);
      }

      Object var2 = this.id_byte.get(var1);
      if (var2 == null) {
         var2 = new fH_2(var1);
         this.id_class(var1, (ff_3)var2);
      }

      if (rrbb_3.rs()) {
         rrdA.id_break((ff_3)var2);
      } else {
         ((ff_3)var2).id_super();
      }

      this.id_catch = (ff_3)var2;
      this.id_private = var1;
   }
}
