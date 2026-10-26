package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.Proxy.Type;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fd_3 extends fH_2 {
   private static final Logger id_finally = LogManager.getLogger();
   private final File id_extends;
   private final String id_native;
   private final boolean id_volatile;
   private final Runnable id_final;
   private CompletableFuture<?> id_package;
   private boolean id_int;
   public Boolean id_class = null;
   public boolean id_break = false;
   private boolean id_new = false;

   private void id_byte(fN_2 var1) {
      fo_3.id_class(this.id_new(), var1.id_class(), var1.id_break());
      var1.id_class(0, 0, 0, true);
      this.id_class = var1 != null;
   }

   public fd_3(File var1, String var2, rqO_2 var3, boolean var4, Runnable var5) {
      super(var3);
      this.id_extends = var1;
      this.id_native = var2;
      this.id_volatile = var4;
      this.id_final = var5;
   }

   private void id_class(fN_2 var1) {
      this.id_break(var1);
   }

   public Runnable id_class() {
      return this.id_final;
   }

   private fN_2 id_class(InputStream var1) {
      fN_2 var2 = null;

      try {
         var2 = fN_2.id_class(var1);
         if (this.id_volatile) {
            var2 = id_protected(var2);
         }
      } catch (IOException var4) {
         id_finally.warn("Error while loading the skin texture", var4);
      }

      return var2;
   }

   private static void id_class(fN_2 var0, int var1, int var2, int var3, int var4) {
      for (int var5 = var1; var5 < var3; var5++) {
         for (int var6 = var2; var6 < var4; var6++) {
            int var7 = var0.id_class(var5, var6);
            if ((var7 >> 24 & 0xFF) < 128) {
               return;
            }
         }
      }

      for (int var8 = var1; var8 < var3; var8++) {
         for (int var9 = var2; var9 < var4; var9++) {
            var0.id_class(var8, var9, var0.id_class(var8, var9) & 16777215);
         }
      }
   }

   private void id_break(fN_2 var1) {
      if (this.id_final != null) {
         this.id_final.run();
      }

      QY.id_instanceof().execute(() -> {
         this.id_int = true;
         if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> this.id_byte(var1));
         } else {
            this.id_byte(var1);
         }
      });
   }

   private static void id_break(fN_2 var0, int var1, int var2, int var3, int var4) {
      for (int var5 = var1; var5 < var3; var5++) {
         for (int var6 = var2; var6 < var4; var6++) {
            var0.id_class(var5, var6, var0.id_class(var5, var6) | 0xFF000000);
         }
      }
   }

   private void id_throws() {
      try {
         rrJF var1 = rrJN.id_class(this.id_native, QY.id_instanceof().W());
         rrJL var2 = rrJN.id_class(var1);
         if (var2.id_class() / 100 == 2) {
            byte[] var3 = var2.id_protected();
            ByteArrayInputStream var4 = new ByteArrayInputStream(var3);
            fN_2 var5;
            if (this.id_extends != null) {
               FileUtils.copyInputStreamToFile(var4, this.id_extends);
               var5 = fN_2.id_class(new FileInputStream(this.id_extends));
            } else {
               var5 = fN_2.id_class(var4);
            }

            this.id_class(var5);
            this.id_new = true;
            return;
         }
      } catch (Exception var9) {
         id_finally.error("Couldn't download http texture: " + var9.getClass().getName() + ": " + var9.getMessage());
         return;
      } finally {
         this.id_case();
      }
   }

   private Executor id_catch() {
      return (Executor)(this.id_native.startsWith("http://s.optifine.net") ? rqR_2.id_volatile() : rqR_2.id_case());
   }

   private void id_case() {
   }

   private static fN_2 id_protected(fN_2 var0) {
      boolean var1 = var0.id_break() == 32;
      if (var1) {
         fN_2 var2 = new fN_2(64, 64, true);
         var2.id_class(var0);
         var0.close();
         var0 = var2;
         var2.id_class(0, 32, 64, 32, 0);
         var2.id_class(4, 16, 16, 32, 4, 4, true, false);
         var2.id_class(8, 16, 16, 32, 4, 4, true, false);
         var2.id_class(0, 20, 24, 32, 4, 12, true, false);
         var2.id_class(4, 20, 16, 32, 4, 12, true, false);
         var2.id_class(8, 20, 8, 32, 4, 12, true, false);
         var2.id_class(12, 20, 16, 32, 4, 12, true, false);
         var2.id_class(44, 16, -8, 32, 4, 4, true, false);
         var2.id_class(48, 16, -8, 32, 4, 4, true, false);
         var2.id_class(40, 20, 0, 32, 4, 12, true, false);
         var2.id_class(44, 20, -8, 32, 4, 12, true, false);
         var2.id_class(48, 20, -16, 32, 4, 12, true, false);
         var2.id_class(52, 20, -8, 32, 4, 12, true, false);
      }

      id_break(var0, 0, 0, 32, 16);
      if (var1) {
         id_class(var0, 32, 0, 64, 32);
      }

      id_break(var0, 0, 16, 64, 32);
      id_break(var0, 16, 48, 48, 64);
      return var0;
   }

   private boolean id_protected() {
      if (!this.id_break) {
         return false;
      } else {
         Proxy var1 = QY.id_instanceof().W();
         return var1.type() != Type.DIRECT && var1.type() != Type.SOCKS ? false : this.id_native.startsWith("http://");
      }
   }

   @Override
   public void a_(rAL var1) throws IOException {
      QY.id_instanceof().execute(() -> {
         if (!this.id_int) {
            try {
               super.a_(var1);
            } catch (IOException var3x) {
               id_finally.warn("Failed to load texture: {}", this.id_byte, var3x);
            }

            this.id_int = true;
         }
      });
      if (this.id_package == null) {
         fN_2 var2;
         if (this.id_extends != null && this.id_extends.isFile()) {
            id_finally.debug("Loading http texture from local cache ({})", this.id_extends);
            FileInputStream var3 = new FileInputStream(this.id_extends);
            var2 = this.id_class(var3);
         } else {
            var2 = null;
         }

         if (var2 != null) {
            this.id_class(var2);
            this.id_case();
         } else {
            this.id_package = CompletableFuture.runAsync(() -> {
               HttpURLConnection var1x = null;
               id_finally.debug("Downloading http texture from {} to {}", this.id_native, this.id_extends);
               if (this.id_protected()) {
                  this.id_throws();
               } else {
                  try {
                     var1x = (HttpURLConnection)new URL(this.id_native).openConnection(QY.id_instanceof().W());
                     var1x.setDoInput(true);
                     var1x.setDoOutput(false);
                     var1x.connect();
                     if (var1x.getResponseCode() / 100 == 2) {
                        Object var2x;
                        if (this.id_extends != null) {
                           FileUtils.copyInputStreamToFile(var1x.getInputStream(), this.id_extends);
                           var2x = new FileInputStream(this.id_extends);
                        } else {
                           var2x = var1x.getInputStream();
                        }

                        QY.id_instanceof().execute(() -> {
                           fN_2 var2xx = this.id_class(var2x);
                           if (var2xx != null) {
                              this.id_class(var2xx);
                              this.id_case();
                           }
                        });
                        this.id_new = true;
                        return;
                     }

                     if (var1x.getErrorStream() != null) {
                        rrbb_3.id_byte(var1x.getErrorStream());
                     }

                     return;
                  } catch (Exception var6) {
                     id_finally.error("Couldn't download http texture", var6);
                  } finally {
                     if (var1x != null) {
                        var1x.disconnect();
                     }

                     this.id_case();
                  }
               }
            }, this.id_catch());
         }
      }
   }
}
