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
   private static final Logger class_ = LogManager.getLogger();
   private long break_;
   private long byte_;
   private static final Na_1 protected_ = new NU();
   private Na_1 throws_ = protected_;
   private Na_1 case_ = protected_;
   private final NZ catch_ = new NZ();

   public NZ byte_() {
      return this.catch_;
   }

   public void class_() {
      this.break_ = case_();
      ALCCapabilities var1 = ALC.createCapabilities(this.break_);
      if (Nr_1.class_(this.break_, "Get capabilities")) {
         throw new IllegalStateException("Failed to get OpenAL capabilities");
      } else if (!var1.OpenALC11) {
         throw new IllegalStateException("OpenAL 1.1 not supported");
      } else {
         this.byte_ = ALC10.alcCreateContext(this.break_, (IntBuffer)null);
         ALC10.alcMakeContextCurrent(this.byte_);
         int var2 = this.throws_();
         int var3 = rfU_2.class_((int)rfU_2.byte_((float)var2), 2, 8);
         int var4 = rfU_2.class_(var2 - var3, 8, 255);
         this.throws_ = new Ne_1(var4);
         this.case_ = new Ne_1(var3);
         ALCapabilities var5 = org.lwjgl.openal.AL.createCapabilities(var1);
         Nr_1.class_("Initialization");
         if (!var5.AL_EXT_source_distance_model) {
            throw new IllegalStateException("AL_EXT_source_distance_model is not supported");
         } else {
            AL10.alEnable(512);
            if (!var5.AL_EXT_LINEAR_DISTANCE) {
               throw new IllegalStateException("AL_EXT_LINEAR_DISTANCE is not supported");
            } else {
               Nr_1.class_("Enable per-source distance models");
               class_.info("OpenAL initialized.");
            }
         }
      }
   }

   public NK class_(Ni_1 var1) {
      return (var1 == Ni_1.STREAMING ? this.case_ : this.throws_).class_();
   }

   public void class_(NK var1) {
      if (!this.throws_.class_(var1) && !this.case_.class_(var1)) {
         throw new IllegalStateException("Tried to release unknown channel");
      }
   }

   public void break_() {
      this.throws_.break_();
      this.case_.break_();
      ALC10.alcDestroyContext(this.byte_);
      if (this.break_ != 0L) {
         ALC10.alcCloseDevice(this.break_);
      }
   }

   private int throws_() {
      MemoryStack var2 = MemoryStack.stackPush();

      byte var12;
      label68: {
         label69: {
            int var1;
            try {
               int var3 = ALC10.alcGetInteger(this.break_, 4098);
               if (Nr_1.class_(this.break_, "Get attributes size")) {
                  throw new IllegalStateException("Failed to get OpenAL attributes");
               }

               IntBuffer var4 = var2.mallocInt(var3);
               ALC10.alcGetIntegerv(this.break_, 4099, var4);
               if (Nr_1.class_(this.break_, "Get attributes")) {
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

   private static long case_() {
      for (int var0 = 0; var0 < 3; var0++) {
         long var1 = ALC10.alcOpenDevice((ByteBuffer)null);
         if (var1 != 0L && !Nr_1.class_(var1, "Open device")) {
            return var1;
         }
      }

      throw new IllegalStateException("Failed to open OpenAL device");
   }

   public String protected_() {
      return String.format("Sounds: %d/%d + %d/%d", this.throws_.protected_(), this.throws_.byte_(), this.case_.protected_(), this.case_.byte_());
   }
}
