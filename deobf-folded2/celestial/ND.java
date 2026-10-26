package celestial;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.ALCapabilities;
import org.lwjgl.system.MemoryStack;

public class ND {
   private static final Logger id_class = LogManager.getLogger();
   private long id_break;
   private long id_byte;
   private static final Na_1 id_protected = new NU();
   private Na_1 id_throws = id_protected;
   private Na_1 id_case = id_protected;
   private final NZ id_catch = new NZ();

   public NZ id_byte() {
      return this.id_catch;
   }

   public void id_class() {
      this.id_break = id_case();
      ALCCapabilities var1 = ALC.createCapabilities(this.id_break);
      if (Nr_1.id_class(this.id_break, "Get capabilities")) {
         throw new IllegalStateException("Failed to get OpenAL capabilities");
      } else if (!var1.OpenALC11) {
         throw new IllegalStateException("OpenAL 1.1 not supported");
      } else {
         this.id_byte = ALC10.alcCreateContext(this.id_break, (IntBuffer)null);
         ALC10.alcMakeContextCurrent(this.id_byte);
         int var2 = this.id_throws();
         int var3 = rfU_2.id_class((int)rfU_2.id_byte((float)var2), 2, 8);
         int var4 = rfU_2.id_class(var2 - var3, 8, 255);
         this.id_throws = new Ne_1(var4);
         this.id_case = new Ne_1(var3);
         ALCapabilities var5 = org.lwjgl.openal.AL.createCapabilities(var1);
         Nr_1.id_class("Initialization");
         if (!var5.AL_EXT_source_distance_model) {
            throw new IllegalStateException("AL_EXT_source_distance_model is not supported");
         } else {
            AL10.alEnable(512);
            if (!var5.AL_EXT_LINEAR_DISTANCE) {
               throw new IllegalStateException("AL_EXT_LINEAR_DISTANCE is not supported");
            } else {
               Nr_1.id_class("Enable per-source distance models");
               id_class.info("OpenAL initialized.");
            }
         }
      }
   }

   public NK id_class(Ni_1 var1) {
      return (var1 == Ni_1.STREAMING ? this.id_case : this.id_throws).id_class();
   }

   public void id_class(NK var1) {
      if (!this.id_throws.id_class(var1) && !this.id_case.id_class(var1)) {
         throw new IllegalStateException("Tried to release unknown channel");
      }
   }

   public void id_break() {
      this.id_throws.id_break();
      this.id_case.id_break();
      ALC10.alcDestroyContext(this.id_byte);
      if (this.id_break != 0L) {
         ALC10.alcCloseDevice(this.id_break);
      }
   }

   private int id_throws() {
      MemoryStack var2 = MemoryStack.stackPush();

      byte var12;
      label68: {
         label69: {
            int var1;
            try {
               int var3 = ALC10.alcGetInteger(this.id_break, 4098);
               if (Nr_1.id_class(this.id_break, "Get attributes size")) {
                  throw new IllegalStateException("Failed to get OpenAL attributes");
               }

               IntBuffer var4 = var2.mallocInt(var3);
               ALC10.alcGetIntegerv(this.id_break, 4099, var4);
               if (Nr_1.id_class(this.id_break, "Get attributes")) {
                  throw new IllegalStateException("Failed to get OpenAL attributes");
               }

               int var5 = 0;

               int var6;
               int var7;
               do {
                  if (var5 >= var3) {
                     var12 = 30;
                     break label68;
                  }

                  var6 = var4.get(var5++);
                  if (var6 == 0) {
                     var12 = 30;
                     break label69;
                  }

                  var7 = var4.get(var5++);
               } while (var6 != 4112);

               var1 = var7;
            } catch (Throwable var10) {
               if (var2 != null) {
                  try {
                     var2.close();
                  } catch (Throwable var9) {
                     var10.addSuppressed(var9);
                  }
               }

               throw var10;
            }

            if (var2 != null) {
               var2.close();
            }

            return var1;
         }

         if (var2 != null) {
            var2.close();
         }

         return var12;
      }

      if (var2 != null) {
         var2.close();
      }

      return var12;
   }

   private static long id_case() {
      for (int var0 = 0; var0 < 3; var0++) {
         long var1 = ALC10.alcOpenDevice((ByteBuffer)null);
         if (var1 != 0L && !Nr_1.id_class(var1, "Open device")) {
            return var1;
         }
      }

      throw new IllegalStateException("Failed to open OpenAL device");
   }

   public String id_protected() {
      return String.format(
         "Sounds: %d/%d + %d/%d", this.id_throws.id_protected(), this.id_throws.id_byte(), this.id_case.id_protected(), this.id_case.id_byte()
      );
   }
}
