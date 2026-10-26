package celestial;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.sound.sampled.AudioFormat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.openal.AL10;

public class NK {
   private static final Logger id_class = LogManager.getLogger();
   private final int id_break;
   private final AtomicBoolean id_byte = new AtomicBoolean(true);
   private int id_protected = 16384;
   private Nz_1 id_throws;

   public void id_byte(float var1) {
      AL10.alSourcei(this.id_break, 53248, 53251);
      AL10.alSourcef(this.id_break, 4131, var1);
      AL10.alSourcef(this.id_break, 4129, 1.0F);
      AL10.alSourcef(this.id_break, 4128, 0.0F);
   }

   public void id_byte() {
      AL10.alSourcePlay(this.id_break);
   }

   private NK(int var1) {
      this.id_break = var1;
   }

   public void id_class(NP var1) {
      var1.id_class().ifPresent(var1x -> AL10.alSourcei(this.id_break, 4105, var1x));
   }

   static NK id_class() {
      int[] var0 = new int[1];
      AL10.alGenSources(var0);
      return Nr_1.id_class("Allocate new source") ? null : new NK(var0[0]);
   }

   public void id_class(boolean var1) {
      AL10.alSourcei(this.id_break, 4103, var1 ? 1 : 0);
   }

   public void id_class(Nz_1 var1) {
      this.id_throws = var1;
      AudioFormat var2 = var1.id_class();
      this.id_protected = id_class(var2, 1);
      this.id_class(4);
   }

   private static int id_class(AudioFormat var0, int var1) {
      return (int)((float)(var1 * var0.getSampleSizeInBits()) / 8.0F * (float)var0.getChannels() * var0.getSampleRate());
   }

   private void id_class(int var1) {
      if (this.id_throws != null) {
         try {
            for (int var2 = 0; var2 < var1; var2++) {
               ByteBuffer var3 = this.id_throws.id_class(this.id_protected);
               if (var3 != null) {
                  new NP(var3, this.id_throws.id_class()).id_byte().ifPresent(var1x -> AL10.alSourceQueueBuffers(this.id_break, new int[]{var1x}));
               }
            }
         } catch (IOException var4) {
            id_class.error("Failed to read from audio stream", var4);
         }
      }
   }

   public void id_class(float var1) {
      AL10.alSourcef(this.id_break, 4099, var1);
   }

   public void id_class(rjU_2 var1) {
      AL10.alSourcefv(this.id_break, 4100, new float[]{(float)var1.id_break, (float)var1.id_byte, (float)var1.id_protected});
   }

   public void id_break(float var1) {
      AL10.alSourcef(this.id_break, 4106, var1);
   }

   public void id_break() {
      if (this.id_byte.compareAndSet(true, false)) {
         AL10.alSourceStop(this.id_break);
         Nr_1.id_class("Stop");
         if (this.id_throws != null) {
            try {
               this.id_throws.close();
            } catch (IOException var2) {
               id_class.error("Failed to close audio stream", var2);
            }

            this.id_extends();
            this.id_throws = null;
         }

         AL10.alDeleteSources(new int[]{this.id_break});
         Nr_1.id_class("Cleanup");
      }
   }

   public void id_break(boolean var1) {
      AL10.alSourcei(this.id_break, 514, var1 ? 1 : 0);
   }

   public void id_throws() {
      if (this.id_finally() == 4115) {
         AL10.alSourcePlay(this.id_break);
      }
   }

   private int id_finally() {
      return !this.id_byte.get() ? 4116 : AL10.alGetSourcei(this.id_break, 4112);
   }

   public boolean id_catch() {
      return this.id_finally() == 4116;
   }

   private int id_extends() {
      int var1 = AL10.alGetSourcei(this.id_break, 4118);
      if (var1 > 0) {
         int[] var2 = new int[var1];
         AL10.alSourceUnqueueBuffers(this.id_break, var2);
         Nr_1.id_class("Unqueue buffers");
         AL10.alDeleteBuffers(var2);
         Nr_1.id_class("Remove processed buffers");
      }

      return var1;
   }

   public void id_case() {
      if (this.id_byte.get()) {
         AL10.alSourceStop(this.id_break);
         Nr_1.id_class("Stop");
      }
   }

   public void id_implements() {
      if (this.id_throws != null) {
         int var1 = this.id_extends();
         this.id_class(var1);
      }
   }

   public void id_protected() {
      if (this.id_finally() == 4114) {
         AL10.alSourcePause(this.id_break);
      }
   }

   public void id_private() {
      AL10.alSourcei(this.id_break, 53248, 0);
   }
}
