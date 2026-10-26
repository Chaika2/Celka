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
   private static final Logger finally_ = LogManager.getLogger();
   private final File extends_;
   private final String native_;
   private final boolean volatile_;
   private final Runnable final_;
   private CompletableFuture<?> package_;
   private boolean int_;
   public Boolean class_ = null;
   public boolean break_ = false;
   private boolean new_ = false;

   private void byte_(fN_2 var1) {
      fo_3.class_(this.new_(), var1.class_(), var1.break_());
      var1.class_(0, 0, 0, true);
      this.class_ = var1 != null;
   }

   public fd_3(File var1, String var2, rqO_2 var3, boolean var4, Runnable var5) {
      super(var3);
      this.extends_ = var1;
      this.native_ = var2;
      this.volatile_ = var4;
      this.final_ = var5;
   }

   private void class_(fN_2 var1) {
      this.break_(var1);
   }

   public Runnable class_() {
      return this.final_;
   }

   private fN_2 class_(InputStream var1) {
      fN_2 var2 = null;

      try {
         var2 = fN_2.class_(var1);
         if (this.volatile_) {
            var2 = protected_(var2);
         }
      } catch (IOException var4) {
         finally_.warn("Error while loading the skin texture", var4);
      }

      return var2;
   }

   private static void class_(fN_2 var0, int var1, int var2, int var3, int var4) {
      for (int var5 = var1; var5 < var3; var5++) {
         for (int var6 = var2; var6 < var4; var6++) {
            int var7 = var0.class_(var5, var6);
            if ((var7 >> 24 & 0xFF) < 128) {
               return;
            }
         }
      }

      for (int var8 = var1; var8 < var3; var8++) {
         for (int var9 = var2; var9 < var4; var9++) {
            var0.class_(var8, var9, var0.class_(var8, var9) & 16777215);
         }
      }
   }

   private void break_(fN_2 var1) {
      if (this.final_ != null) {
         this.final_.run();
      }

      QY.instanceof_().execute(() -> {
         this.int_ = true;
         if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> this.byte_(var1));
         } else {
            this.byte_(var1);
         }
      });
   }

   private static void break_(fN_2 var0, int var1, int var2, int var3, int var4) {
      for (int var5 = var1; var5 < var3; var5++) {
         for (int var6 = var2; var6 < var4; var6++) {
            var0.class_(var5, var6, var0.class_(var5, var6) | 0xFF000000);
         }
      }
   }

   private void throws_() {
      try {
         rrJF var1 = rrJN.class_(this.native_, QY.instanceof_().W());
         rrJL var2 = rrJN.class_(var1);
         if (var2.class_() / 100 == 2) {
            byte[] var3 = var2.protected_();
            ByteArrayInputStream var4 = new ByteArrayInputStream(var3);
            fN_2 var5;
            if (this.extends_ != null) {
               FileUtils.copyInputStreamToFile(var4, this.extends_);
               var5 = fN_2.class_(new FileInputStream(this.extends_));
            } else {
               var5 = fN_2.class_(var4);
            }

            this.class_(var5);
            this.new_ = true;
            return;
         }
      } catch (Exception var9) {
         finally_.error("Couldn't download http texture: " + var9.getClass().getName() + ": " + var9.getMessage());
         return;
      } finally {
         this.case_();
      }
   }

   private Executor catch_() {
      return (Executor)(this.native_.startsWith("http://s.optifine.net") ? rqR_2.volatile_() : rqR_2.case_());
   }

   private void case_() {
   }

   private static fN_2 protected_(fN_2 var0) {
      boolean var1 = var0.break_() == 32;
      if (var1) {
         fN_2 var2 = new fN_2(64, 64, true);
         var2.class_(var0);
         var0.close();
         var0 = var2;
         var2.class_(0, 32, 64, 32, 0);
         var2.class_(4, 16, 16, 32, 4, 4, true, false);
         var2.class_(8, 16, 16, 32, 4, 4, true, false);
         var2.class_(0, 20, 24, 32, 4, 12, true, false);
         var2.class_(4, 20, 16, 32, 4, 12, true, false);
         var2.class_(8, 20, 8, 32, 4, 12, true, false);
         var2.class_(12, 20, 16, 32, 4, 12, true, false);
         var2.class_(44, 16, -8, 32, 4, 4, true, false);
         var2.class_(48, 16, -8, 32, 4, 4, true, false);
         var2.class_(40, 20, 0, 32, 4, 12, true, false);
         var2.class_(44, 20, -8, 32, 4, 12, true, false);
         var2.class_(48, 20, -16, 32, 4, 12, true, false);
         var2.class_(52, 20, -8, 32, 4, 12, true, false);
      }

      break_(var0, 0, 0, 32, 16);
      if (var1) {
         class_(var0, 32, 0, 64, 32);
      }

      break_(var0, 0, 16, 64, 32);
      break_(var0, 16, 48, 48, 64);
      return var0;
   }

   private boolean protected_() {
      if (!this.break_) {
         return false;
      } else {
         Proxy var1 = QY.instanceof_().W();
         return var1.type() != Type.DIRECT && var1.type() != Type.SOCKS ? false : this.native_.startsWith("http://");
      }
   }

   @Override
   public void a_(rAL var1) throws IOException {
      QY.instanceof_().execute(() -> {
         if (!this.int_) {
            try {
               super.a_(var1);
            } catch (IOException var3x) {
               finally_.warn("Failed to load texture: {}", this.byte_, var3x);
            }

            this.int_ = true;
         }
      });
      if (this.package_ == null) {
         fN_2 var2;
         if (this.extends_ != null && this.extends_.isFile()) {
            finally_.debug("Loading http texture from local cache ({})", this.extends_);
            FileInputStream var3 = new FileInputStream(this.extends_);
            var2 = this.class_(var3);
         } else {
            var2 = null;
         }

         if (var2 != null) {
            this.class_(var2);
            this.case_();
         } else {
            this.package_ = CompletableFuture.runAsync(() -> {
               HttpURLConnection var1x = null;
               finally_.debug("Downloading http texture from {} to {}", this.native_, this.extends_);
               if (this.protected_()) {
                  this.throws_();
               } else {
                  try {
                     var1x = (HttpURLConnection)new URL(this.native_).openConnection(QY.instanceof_().W());
                     var1x.setDoInput(true);
                     var1x.setDoOutput(false);
                     var1x.connect();
                     if (var1x.getResponseCode() / 100 == 2) {
                        Object var2x;
                        if (this.extends_ != null) {
                           FileUtils.copyInputStreamToFile(var1x.getInputStream(), this.extends_);
                           var2x = new FileInputStream(this.extends_);
                        } else {
                           var2x = var1x.getInputStream();
                        }

                        QY.instanceof_().execute(() -> {
                           fN_2 var2xx = this.class_(var2x);
                           if (var2xx != null) {
                              this.class_(var2xx);
                              this.case_();
                           }
                        });
                        this.new_ = true;
                        return;
                     }

                     if (var1x.getErrorStream() != null) {
                        rrbb_3.byte_(var1x.getErrorStream());
                     }

                     return;
                  } catch (Exception var6) {
                     finally_.error("Couldn't download http texture", var6);
                  } finally {
                     if (var1x != null) {
                        var1x.disconnect();
                     }

                     this.case_();
                  }
               }
            }, this.catch_());
         }
      }
   }
}
