package celestial;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.sound.sampled.AudioFormat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.openal.AL10;

public class NK {
   private static final Logger class_ = LogManager.getLogger();
   private final int break_;
   private final AtomicBoolean byte_ = new AtomicBoolean(true);
   private int protected_ = 16384;
   private Nz_1 throws_;

   public void byte_(float var1) {
      AL10.alSourcei(this.break_, 53248, 53251);
      AL10.alSourcef(this.break_, 4131, var1);
      AL10.alSourcef(this.break_, 4129, 1.0F);
      AL10.alSourcef(this.break_, 4128, 0.0F);
   }

   public void byte_() {
      AL10.alSourcePlay(this.break_);
   }

   private NK(int var1) {
      this.break_ = var1;
   }

   public void class_(NP var1) {
      var1.class_().ifPresent(var1x -> AL10.alSourcei(this.break_, 4105, var1x));
   }

   static NK class_() {
      int[] var0 = new int[1];
      AL10.alGenSources(var0);
      return Nr_1.class_("Allocate new source") ? null : new NK(var0[0]);
   }

   public void class_(boolean var1) {
      AL10.alSourcei(this.break_, 4103, var1 ? 1 : 0);
   }

   public void class_(Nz_1 var1) {
      this.throws_ = var1;
      AudioFormat var2 = var1.class_();
      this.protected_ = class_(var2, 1);
      this.class_(4);
   }

   private static int class_(AudioFormat var0, int var1) {
      return (int)((float)(var1 * var0.getSampleSizeInBits()) / 8.0F * (float)var0.getChannels() * var0.getSampleRate());
   }

   private void class_(int var1) {
      if (this.throws_ != null) {
         try {
            for (int var2 = 0; var2 < var1; var2++) {
               ByteBuffer var3 = this.throws_.class_(this.protected_);
               if (var3 != null) {
                  new NP(var3, this.throws_.class_()).byte_().ifPresent(var1x -> AL10.alSourceQueueBuffers(this.break_, new int[]{var1x}));
               }
            }
         } catch (IOException var4) {
            class_.error("Failed to read from audio stream", var4);
         }
      }
   }

   public void class_(float var1) {
      AL10.alSourcef(this.break_, 4099, var1);
   }

   public void class_(rjU_2 var1) {
      AL10.alSourcefv(this.break_, 4100, new float[]{(float)var1.break_, (float)var1.byte_, (float)var1.protected_});
   }

   public void break_(float var1) {
      AL10.alSourcef(this.break_, 4106, var1);
   }

   public void break_() {
      if (this.byte_.compareAndSet(true, false)) {
         AL10.alSourceStop(this.break_);
         Nr_1.class_("Stop");
         if (this.throws_ != null) {
            try {
               this.throws_.close();
            } catch (IOException var2) {
               class_.error("Failed to close audio stream", var2);
            }

            this.extends_();
            this.throws_ = null;
         }

         AL10.alDeleteSources(new int[]{this.break_});
         Nr_1.class_("Cleanup");
      }
   }

   public void break_(boolean var1) {
      AL10.alSourcei(this.break_, 514, var1 ? 1 : 0);
   }

   public void throws_() {
      if (this.finally_() == 4115) {
         AL10.alSourcePlay(this.break_);
      }
   }

   private int finally_() {
      return !this.byte_.get() ? 4116 : AL10.alGetSourcei(this.break_, 4112);
   }

   public boolean catch_() {
      return this.finally_() == 4116;
   }

   private int extends_() {
      int var1 = AL10.alGetSourcei(this.break_, 4118);
      if (var1 > 0) {
         int[] var2 = new int[var1];
         AL10.alSourceUnqueueBuffers(this.break_, var2);
         Nr_1.class_("Unqueue buffers");
         AL10.alDeleteBuffers(var2);
         Nr_1.class_("Remove processed buffers");
      }

      return var1;
   }

   public void case_() {
      if (this.byte_.get()) {
         AL10.alSourceStop(this.break_);
         Nr_1.class_("Stop");
      }
   }

   public void implements_() {
      if (this.throws_ != null) {
         int var1 = this.extends_();
         this.class_(var1);
      }
   }

   public void protected_() {
      if (this.finally_() == 4114) {
         AL10.alSourcePause(this.break_);
      }
   }

   public void private_() {
      AL10.alSourcei(this.break_, 53248, 0);
   }
}
